---
layout: post
status: publish
published: true
title: Construire une base de données simple avec PHP et MySQL
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 51
wordpress_url: http://blog.gfblog.com/index.php/2005/09/25/construire-une-base-de-donnees-simple-avec-php-et-mysql/
date: '2005-09-25 17:14:08 +0200'
date_gmt: '2005-09-25 15:14:08 +0200'
categories:
- Internet
- Web
- Featured
tags:
- Internet
- programmation
- Web
- serveur
- bases de données
permalink:  /2005/09/25/construire-une-base-de-donnees-simple-avec-php-et-mysql/
---
<p>
	Cet article constitue un tutoriel simple et rapide montrant comment construire une base de données en utilisant les technologies PHP et MySQL. Cette base de données sera accessible depuis internet à l'aide d'un navigateur.
	</p>
<p>
	Nous allons aborder les points suivants:</p>
<ul>
<li />Qu'allons-nous faire ?
<li />Comment le faire ?
<li />Etape 1: Créer la base de données.
<li />Etape 2: Ajouter une entrée dans la base de données.
<li />Etape 3: Afficher les entrées de la base de données.
<li />Etape 4: Rechercher des entrées dans la base de données.
<li />Etape 5: Modifier et supprimer une entrée dans la base de données.
<li />Bonus: Sécuriser l'accès à la base de données.
		</ul></p>
<h1>Qu'allons-nous faire ?</h1>
<p>
	Nous allons créer une base de données, et un logiciel permettant d'exploiter cette base de données. Une base de données stocke des informations remplissant certains critères. Elle permet de trier les informations qu'elle contient selon ces critères. Imaginez-vous un tableau Excel: des colonnes et des lignes. Une base de données fonctionne exactement sur le même principe.
	</p>
<p>
	En effet, si nous voulons stocker les informations "nom", "prénom" et "âge" pour différentes personnes, il nous faudra créer 3 colonnes, une pour chaque information; et X lignes, une par personne.
	</p>
<p>
	Cette illustration représente la structure de la base de données que nous allons créer:<br />
	</p>
<table>
<tr>
<td></td>
<td>Colonne 1</td>
<td>Colonne 2</td>
<td>Colonne 3</td>
</tr>
<tr>
<td></td>
<td>Nom</td>
<td>Prénom</td>
<td>Âge</td>
</tr>
<tr>
<td>Ligne 1</td>
<td><i>Martin</i></td>
<td><i>Pierre</i></td>
<td><i>42</i></td>
</tr>
<tr>
<td>Ligne 2</td>
<td><i>Dupont</i></td>
<td><i>Pierre</i></td>
<td><i>38</i></td>
</tr>
<tr>
<td>Lignes n</td>
<td>...</td>
<td>...</td>
<td>...</td>
</tr>
</table>
<p>
	Vous l'aurez compris, le nombre de colonnes est fixe, tandis que le nombre de lignes est indéterminée: un nouvel enregistrement dans la base de données représente une ligne supplémentaire.
	</p>
<p>
	Pour comprendre les mécanismes de fonctionnement des bases de données, vous pouvez vous exercer à créer des feuilles de calcul sous Excel (ou un autre tableur) et à manipuler les données qu'elles contiennent. Excel se comporte en effet comme une base de données en stockant et manipulant les informations à la manière d'une base de données.
	</p>
<p>
	Dans le tableau ci-dessus, j'ai omis une colonne. Il s'agit de la colonne "identifiant" (nous l'appellerons "id"). A chaque ligne de cette colonne id est attribué un chiffre ou un nombre. Le premier enregistrement de la base de données aura ainsi l'identifiant 1, le second aura l'identifiant 2, et ainsi de suite. L'id permet par la suite de manipuler les lignes très facilement.
	</p>
<p>
	Une dernière précision importante: chaque colonne n'accepte qu'un type précis de données. Dans notre cas, la colonne id ne devra stocker que des nombres entiers, les colonnes nom et prénom des chaînes de texte (que nous appellerons dorénavant "string"), et la colonne âge un nombre entier (que nous appellerons "int" de l'anglais "integer"). Il est absolument nécessaire de bien déterminer dès le début de la conception d'une base de données le type de données stockées dans chaque colonne. En effet, si l'on veut trier les enregistrements suivant le critère "âge", et qu'un enregistrement contient, pour cette colonne, un string au lieu d'un entier, le tri ne pourra pas avoir lieu correctement. "Dupont" est-il inférieur ou supérieur à 52 ? Impossible à dire, on ne peut comparer que des données du même type.
	</p>
<h1>Comment le faire ?</h1>
<p>
	Il existe de nombreuses manières de construire une base de données. En effet, chaque base de données repose sur un "serveur", et il existe une multitude de serveurs différents. Parmi les plus célèbres: Oracle, Sybase, Access, FileMaker, PostgreSQL et MySQL. Les deux premiers sont des serveurs professionnels qui coûtent plusieurs centaines de milliers d'euro et qui sont destinés à stocker des millions d'enregistrements. Access et FileMaker sont des serveurs propriétaires qui ne fonctionnent que par le biais d'un logiciel que vous devez installer sur votre système. Enfin, les deux derniers sont gratuits et permettent une consultation par internet grâce à l'intégration du langage de requêtes (SQL, le langage permettant de donner ses instructions au serveur) à la technologie web PHP.
	</p>
<p>
	Nous allons donc voir dans un premier temps comment fonctionnent les échanges entre serveur et client, pour voir ensuite ce que sont MySQL, SQL et PHP et, enfin, comprendre comment tous ces éléments s'imbriquent les uns dans les autres.
	</p>
<h2>Internet: dialogue entre un client et un serveur</h2>
<p>
	Vous tapez une adresse dans la barre d'adresse de votre navigateur, et vous appuyez sur "Entrée". La page se charge à l'écran. Cela paraît simple, mais il s'agit en réalité du résultat d'un dialogue entre client (votre navigateur) et serveur (l'ordinateur qui contient l'information que vous demandez).
	</p>
<p>
	Lorsque vous appuyez sur "Entrée", votre navigateur contacte le serveur qui gère l'adresse que vous avez tapée. Le serveur vous envoie l'information demandée, et le navigateur l'affiche. Imaginez un fichier Word: vous double-cliquez dessus, il s'ouvre dans Word, et vous pouvez ainsi le lire. Dans notre cas, le client dit au serveur <em>je veux voir tel document</em>, ce qui correspond au double-clic. Le serveur envoie alors ce document au navigateur qui l'interprète et l'affiche à l'écran. Il l'interprète car, au même titre que votre fichier Word, c'est un fichier qui est envoyé du serveur au navigateur. Ce fichier est écrit dans un langage de programmation spécial que reconnaît le navigateur. Ce langage est le HTML.
	</p>
<p>
	Le navigateur reçoit par exemple l'information suivante: <span class="Code">&lt;i&gt;Bonjour&lt;/i&gt;</span>. Il sait que tout texte compris entre la balise &lt;i&gt; et la balise &lt;/i&gt; devra être affiché en italique. Il affichera donc: <i>Bonjour !</i>.
	</p>
<p>
	Il est particulièrement important pour la suite de comprendre ce mécanisme: le serveur émet un document rempli de texte (le code source définissant la mise en page et la présentation, et le contenu lui même), il ne traite pas ce texte. C'est le navigateur qui traite ce texte, et l'interprète pour afficher le résultat attendu.
	</p>
<h2>MySQL, SQL, PHP ?</h2>
<p>
	Le principe du PHP, un autre langage de programmation, est tout à fait différent. En effet, dans ce cas c'est le serveur qui exécute le code source et qui renvoit le résultat au navigateur. Le serveur ne se contente pas d'envoyer les données, il les analyse et leur applique un traitement avant de les envoyer. On dit que le PHP "s'éxécute côté serveur" alors que le HTML est traité côté client.
	</p>
<p>
	Vous remarquerez que je n'emploie pas le verbe "s'exécuter" pour parler du HTML. Il s'agit là d'une autre différence -majeure- entre le HTML et le PHP: le HTML n'est pas exécutable, il est purement statique. En d'autres termes, alors que le HTML se borne à décrire une situation de faits (tel mot est en italique, telle phrase est en gras, telle image doit être affichée, etc.), le PHP peut avoir des comportements qui produisent des effets sous certaines conditions. Par exemple: <em>si le <strong>nom</strong> est <strong>Dupont</strong>, alors il devra être affiché en <strong>rouge</strong></em>.
	</p>
<p>
	Le PHP est le langage que nous allons utiliser pour le traitement du contenu de la base de données.
	</p>
<p>
	MySQL est le nom du serveur de base de données. C'est un logiciel installé sur le serveur qui interprête et exécute les requêtes qui lui sont soumises grâce au langage SQL. Par exemple, le code suivant permet de retenir, dans la base de données appelée "mabase", tous les prénoms des personnes qui ont plus de 40 ans, en rejetant les prénoms des personnes qui ne remplissent pas ce critère: <span class=Code>SELECT prenoms FROM mabase WHERE age > 40</span>.
	</p>
<h2>Conjonction de ces éléments</h2>
<p>
	Si vous avez compris les explications ci-dessus, vous devriez comprendre les deux phrases suivantes: "<em>Le contenu et la structure de la base de données seront stockés sur le serveur MySQL auquel accèderont des fonction PHP utilisant le langage SQL. La formation des requêtes SQL se fera grâce à des opérations logiques réalisées en PHP, et l'affichage des résultats de ces requêtes se fera grâce à un code HTML généré par d'autres fonctions PHP.</em>"
	</p>
<h1>Etape 1: Créer la base de données</h1>
<h2>Connexion au serveur de base de données</h2>
<p>
	Je suppose que votre base de données existe déjà, mais ne contient aucune donnée. Lorsque vous activez MySQL chez un hébergeur Web, une base de données associée à votre compte est automatiquement créée. Cependant, elle ne contient aucune "table". Une "table" est le conteneur d'un ensemble de colonnes et lignes. Nous allons nous connecter à la base de données, et créer la table utile à cet exercice.
	</p>
<p>
	Créez donc un fichier appelé <span class="Code">connexion.php</span>:
	</p>
<p><span class="Code"></p>
<ol class="Code">
<li />&lt;?php
<li />$host = &quot;localhost&quot;; /* L&#x27;adresse du serveur */
<li />$login = &quot;&quot;; /* Votre nom d&#x27;utilisateur */
<li />$password = &quot;&quot;; /* Votre mot de passe */
<li />$base = &quot;&quot;; /* Le nom de la base */
<li />&nbsp;
<li />function connexion()
<li />{
<li />global $host, $login, $password, $base;
<li />$db = mysql_connect($host, $login, $password);
<li />mysql_select_db($base,$db);
<li />}
<li />?&gt;
	</ol>
<p>	</span>
	</p>
<p>
	La ligne 1 contient le "tag" ou "balise" en français qui permet de déterminer le type de script utilisé: il s'agit de PHP. La ligne 13 informe le serveur que le script est terminé.
	</p>
<p>
	Les lignes 2 à 5 définissent des variables. Par exemple, votre "login" ou nom d'utilisateur est "pierre_martin_128765b". Vous assignez cette valeur à la variable $login pour qu'à chaque fois que vous fassiez référence à $login le serveur comprenne "pierre_martin_128765b". De même pour les autres valeurs.
	</p>
<p>
	La ligne 7 marque la création d'une fonction. Une fonction regroupe une série d'instructions qui seront exécutées dès que cette dernière est appélée. Ainsi, au lieu d'écrire les lignes 9, 10 et 11, vous écrirez dorénavant <span class="Code">connexion();</span>. Les lignes 8 et 12 présentent des accolades qui délimitent la portée de la fonction: elle englobe toutes les lignes entre ces accolades.
	</p>
<h2>Création de la table</h2>
<p>
	Créez ensuite un autre fichier appelé <span class="Code">installation.php</span>:
	</p>
<p><span class="Code"></p>
<ol class="Code">
<li />&lt;?php
<li />include(&quot;connexion.php&quot;);
<li />&nbsp;
<li />connexion();
<li />&nbsp;
<li />$sql= &quot;CREATE TABLE IF NOT EXISTS `mabase` (&quot;;
<li />$sql .= &quot;`id` int(11) NOT NULL auto_increment,&quot;;
<li />$sql .= &quot;`nom` text NOT NULL,&quot;;
<li />$sql .= &quot;`prenom` text NOT NULL,&quot;;
<li />$sql .= &quot;`age` int NOT NULL,&quot;;
<li />$sql .= &quot;PRIMARY KEY  (`id`),&quot;;
<li />$sql .= &quot;UNIQUE KEY `id_2` (`id`),&quot;;
<li />$sql .= &quot;KEY `id` (`id`)&quot;;
<li />$sql .= &quot;) ENGINE=MyISAM;&quot;;
<li />&nbsp;
<li />mysql_query($sql) or die(mysql_error());
<li />?&gt;
	</ol>
<p>	</span>
	</p>
<p>
	A la ligne 2, par l'instruction <span class="Code">include("connexion.php");</span>, nous incluons le contenu de ce fichier dans le fichier courant. Nous pourrons ainsi accéder à son contenu, notamment en appelant la fonction <span class="Code">connexion()</span> à la ligne 4.
	</p>
<p>
	Les lignes 6 à 14 contiennent les instructions de formation de la requête SQL. La requête est découpée et insérée dans la variable <span class="Code">$sql</span>. Notez que le symbole exmployé est <span class="Code">.=</span> qui signifie <em>ajoutez ce qui suit à la fin de la variable, après ce qu'elle contient déjà</em>.
	</p>
<p>
	A la ligne 6, nous créons la table, si elle n'existe pas déjà, et nous lui donnons le nom "mabase". A la ligne 7, nous insérons dans la table la colonne "id" de type int (entier), qui ne peut pas être une valeur nulle et qui s'incrémente automatiquement à chaque nouvel ajout dans la base de données. Cet élément, id, sera la clé qui identifie chaque enregistrement (lignes 11 à 13). A la ligne 8 nous insérons la colonne "nom" de type "texte" et qui ne peut être nulle. La ligne 14 détermine le type de table, thème qui dépasse l'objet de cet article.
	</p>
<p>
	La ligne 16 soumet la requête formée à la base de données, et affiche une éventuelle erreur à l'écran.
	</p>
<h1>Etape 2: Ajouter une entrée dans la base de données</h1>
<h2>Utilisation des variables et formation de la requête SQL</h2>
<p>
	Quand on ajoute une entrée dans la base de données, une nouvelle ligne est créée. A chaque colonne de cette nouvelle ligne est assignée une valeur.
	</p>
<p>
	Nous allons donc utiliser une requête SQL pour attribuer une valeur à chaque colonne de la nouvelle ligne: <span class="Code">INSERT INTO mabase(id,nom,prenom,age) VALUES('','Martin','Pierre','42')</span>. En français, cela donnerait: <em>Insérez dans la table appelée "mabase", respectivement pour les colonnes "id", "nom", "prénom" et "age", les valeurs "(vide)", "Martin", "Pierre" et "42"</em>.
	</p>
<p>
	Nous avons vu que le langage PHP utilisait des variables. On peut donc remplacer les valeurs que l'on veut insérer par la nom des variables qui les contiennent.
	</p>
<p>
	Dans un premier temps, on assigne les valeurs aux variables:
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />$nom = &#x27;Martin&#x27;;
<li />$prenom = &#x27;Pierre&#x27;;
<li />$age = &#x27;42&#x27;
	</ol>
<p>	</span>
	</p>
<p>
	On pourra ainsi, dans un second temps, insérer ces variables au lieu des valeurs associées dans la requête SQL: <span class="Code">INSERT INTO mabase(id,nom,prenom,age) VALUES('','$nom','$prenom','$age')</span>.
	</p>
<h2>Création du formulaire</h2>
<p>
	Vous savez maintenant former la requête SQL d'ajout d'un enregisterment dans la base de données en utilisant des variables. Il nous faut à présent créer un formulaire pour récupérer les données à ajouter.
	</p>
<p>
	Un formulaire est un ensemble d'objets que manipule l'utilisateur -le visiteur de la page-. Il y a ainsi des champs de texte, des cases à cocher, des menus déroulants, des boutons, etc. Notre formulaire sera simple: 3 champs et 1 bouton.
	</p>
<p>
	Voici le code du formulaire:
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />&lt;form name=&quot;formulaire&quot; method=&quot;post&quot; action=&quot;ajouter.php&quot;&gt;
<li />&lt;table width=&quot;200&quot; border=&quot;1&quot;&gt;
<li />&lt;tr&gt;
<li />&lt;td&gt;Nom:&lt;/td&gt;
<li />&lt;td&gt;&lt;input name=&quot;nom&quot; type=&quot;text&quot; id=&quot;nom&quot;&gt;&lt;/td&gt;
<li />&lt;/tr&gt;
<li />&lt;tr&gt;
<li />&lt;td&gt;Pr&eacute;nom:&lt;/td&gt;
<li />&lt;td&gt;&lt;input name=&quot;prenom&quot; type=&quot;text&quot; id=&quot;prenom&quot;&gt;&lt;/td&gt;
<li />&lt;/tr&gt;
<li />&lt;tr&gt;
<li />&lt;td&gt;Age:&lt;/td&gt;
<li />&lt;td&gt;&lt;input name=&quot;age&quot; type=&quot;text&quot; id=&quot;age&quot; size=&quot;3&quot; maxlength=&quot;3&quot;&gt;&lt;/td&gt;
<li />&lt;/tr&gt;
<li />&lt;tr&gt;
<li />&lt;td colspan=&quot;2&quot;&gt;&lt;div align=&quot;center&quot;&gt;
<li />&lt;input type=&quot;submit&quot; name=&quot;Submit&quot; value=&quot;Envoyer&quot;&gt;
<li />&lt;/div&gt;&lt;/td&gt;
<li />&lt;/tr&gt;
<li />&lt;/table&gt;
<li />&lt;/form&gt;
	</ol>
<p>	</span>
	</p>
<p>
	Et voilà le résultat:
	</p>
<div align="center">
<form name="formulaire" method="post" action="">
<table width="200" border="1">
<tr>
<td>Nom:</td>
<td><input name="nom" type="text" id="nom"/></td>
</tr>
<tr>
<td>Pr&eacute;nom:</td>
<td><input name="prenom" type="text" id="prenom"/></td>
</tr>
<tr>
<td>Age:</td>
<td><input name="age" type="text" id="age" size="3" maxlength="3"/></td>
</tr>
<tr>
<td colspan="2" align="center">
        		<input type="submit" name="Submit" value="Envoyer"/>
			</td>
</tr>
</table></form>
</p></div></p>
<p>
	Ce code mérite quelques explications. A la ligne 1 on crée le formulaire, et on lui donne un nom (ici: "formulaire"). Puis, on indique la méthode de transmission des données. Il en existe deux: POST et GET. Pour les formulaires, on utilise en règle générale POST. Ces deux méthodes sortent de l'objet de cet article. Enfin, on indique vers quel fichier le contenu du formulaire sera envoyé: "ajouter.php".
	</p>
<p>
	La balise &lt;table&gt; sert à créer un tableau. Ici, il a les attributs suivants: largeur de 200 pixels, épaisseur de la bordure de 1 pixel.<br />
	Les balises &lt;tr&gt; et &lt;td&gt; servent, respectivement, à créer une ligne et une colonne.
	</p>
<p>
	Les champs de texte sont créés grâce à la balise &lt;input&gt;. Ainsi, à la ligne 5 on crée un objet de type input, qui est un champ de texte (type="text"), et dont le nom et l'identifiant sont "nom". A la ligne 13, il s'agit du champ pour la valeur âge: la taille maximale du texte entré sera de 3 caractères, la taille du champ sera de 3 caractères.
	</p>
<p>
	Pour finir, à la ligne 17, on crée un bouton qui servira à valider le formulaire, et à envoyer les valeurs des champs vers le fichier spécifié à la ligne 1 et avec la méthode spécifiée à cette même ligne.
	</p>
<h2>Récupération des valeurs du formulaire</h2>
<p>
	Nous avons créé le formulaire qui permet à l'utilisateur de saisir ses données, nous allons maintenant créer la page <em>ajouter.php</em> qui nous permettra d'ajouter les données soumises dans la base de données.
	</p>
<p>
	Créez donc le fichier <span class="Code">ajouter.php</span> et ajoutez le code qui suit, de manière à se connecter à la base de données:
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />&lt;?php
<li />include(&quot;connexion.php&quot;);
<li />&nbsp;
<li />connexion();
	</ol>
<p>	</span>
	</p>
<p>
	Une fois connecté à la base de données, il nous faut récupérer les valeurs du formulaire. On utilise pour cela un tableau ou matrice qui peut contenir plusieurs valeurs différentes. Il s'agit du tableau <span class="Code">$_POST</span>. Dans notre formulaire, nous avons donné ces noms aux champs: nom, prenom, age. Pour récupérer les valeurs saisiez dans ces champs, il suffira d'écrire, respectivement: <span class="Code">$_POST['nom']</span>, <span class="Code">$_POST['prenom']</span> et <span class="Code">$_POST['age']</span>.
	</p>
<p>
	Ce système nous permet de former la requête SQL très simplement: <span class="Code">INSERT INTO mabase(id,nom,prenom,age) VALUES('','".$_POST['nom']."','".$_POST['prenom']."','".$_POST['age']."')</span>.
	</p>
<p>
	Ce qui donne, au final le code suivant (à la suite du début du fichier décrit plus haut):
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li /> $sql = &quot;INSERT INTO mabase(id,nom,prenom,age) &quot;;
<li /> $sql .= &quot;VALUES(&#x27;&#x27;,&#x27;&quot;.$_POST[&#x27;nom&#x27;].&quot;&#x27;,&#x27;&quot;.$_POST[&#x27;prenom&#x27;].&quot;&#x27;,&#x27;&quot;.$_POST[&#x27;age&#x27;].&quot;&#x27;)&quot;;
<li />&nbsp;
<li />mysql_query($sql) or die(mysql_error());
<li />?&gt;
	</ol>
<p>	</span>
	</p>
<h2>Contrôle des valeurs saisies</h2>
<p>
	Le code présente ci-avant est parfaitement fonctionnel. Il présente cependant un gros défaut: les valeurs saisies par l'utilisateur ne sont pas contrôlées. Ainsi, un utilisateur pourrait omettre de donner son nom, ce qui aurait pour conséquence l'insertion d'un valeur vide dans la base de données.
	</p>
<p>
	Un programmeur PHP doit toujours se poser la question suivante: <em>comment se comportera mon code s'il est appelé anormalement ou en dehors de son contexte ?</em>. Dans notre cas, si on tape l'adresse du fichier <em>ajouter.php</em> dans un navigateur, si on appelle le fichier sans passer par le formulaire, on aura droit à un beau bug, et pour cause puisque le tableau $_POST n'existe que lorsqu'il y a un formulaire utilisant la méthode POST en amont !
	</p>
<p>
	Il nous faut donc contrôler deux choses: que POST existe bien, et que tous les champs ont été renseignés. Ces deux choses se réalisent en une seule opération, à l'aide d'une expression conditionnelle.
	</p>
<p>
	Les expressions conditionnelles permettent de déterminer quel comportement aura le programme, en fonction d'éléments et de conditions déterminés. La logique est la suivante: <em>si A alors B sinon C</em>.
	</p>
<p>
	En PHP, cela donne:
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />if ($POST[&#x27;nom&#x27;] != &#x27;&#x27; AND $POST[&#x27;prenom&#x27;] != &#x27;&#x27; AND $POST[&#x27;age&#x27;] != &#x27;&#x27;)
<li />{ // c&#x27;est bon, on peut copier/coller ici le code vu ci-dessus
<li />}
<li />else
<li />{
<li />echo &#x27;Erreur ! Vous devez remplir tous les champs !&#x27;;
<li />}
	</ol>
<p>	</span>
	</p>
<p>
	<em>if</em> signifie <em>si</em>, <em>else</em> signifie <em>sinon</em>.
	</p>
<p>
	La syntaxe est la suivante : <em>if(la condition à remplir) {le code à exécuter si la condition est remplie} else { le code à exécuter si la condition n'est pas remplie }</em>.
	</p>
<p>
	Dans notre cas la condition est simple. On prend le contenu de notre tableau et on vérifie qu'aucune des entrées n'est vide. Par exemple, pour le nom: d'un côté on a <em>$POST['nom']</em> qui représente ce que l'utilisateur a saisi, d'un autre côté <em>''</em> qui représente un contenu inexistant (une chaîne de texte vide), et enfin, au milieu <em>!=</em> qui est un opérateur de comparaison signifiant <em>différent de</em>. On répète cela pour les champs prénom et âge, en mettant l'opérateur booléen <em>AND</em> qui signifie <em>et</em>.
	</p>
<p>
	La condition peut ainsi se lire: <em>SI la valeur du champ NOM du formulaire N'EST PAS une CHAÎNE VIDE, ET SI la valeur du champ PRENOM du formulaire N'EST PAS une CHAÎNE VIDE, ET SI la valeur du champ AGE du formulaire N'EST PAS une CHAÎNE VIDE; alors exécuter le code qui suit...</em>
	</p>
<p>
	L'instruction <span class="Code">echo</span> permet d'afficher quelque chose à l'écran. Dans notre cas, un message d'erreur indiquant que tous les champs n'ont pas été renseignés.
	</p>
<p>
	Le code final du fichier <span class="Code">ajouter.php</span> est le suivant:
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />&lt;?php
<li />include(&quot;connexion.php&quot;);
<li />&nbsp;
<li />if ($POST[&#x27;nom&#x27;] != &#x27;&#x27; AND $POST[&#x27;prenom&#x27;] != &#x27;&#x27; AND $POST[&#x27;age&#x27;] != &#x27;&#x27;)
<li />{
<li />connexion();
<li />&nbsp;
<li /> $sql = &quot;INSERT INTO mabase(id,nom,prenom,age) &quot;;
<li /> $sql .= &quot;VALUES(&#x27;&#x27;,&#x27;$_POST[&#x27;nom&#x27;]&#x27;,&#x27;$_POST[&#x27;prenom&#x27;]&#x27;,&#x27;$_POST[&#x27;age&#x27;]&#x27;)&quot;;
<li />&nbsp;
<li />mysql_query($sql) or die(mysql_error());
<li />}
<li />else
<li />{
<li />echo &#x27;Erreur ! Vous devez remplir tous les champs !&#x27;;
<li />}
<li />?&gt;
	</ol>
<p>	</span>
	</p>
<h1>Etape 3: Afficher les entrées de la base de données</h1>
<h2>Principe: afficher des données tabulaires</h2>
<p>
	Les données tabulaires s'affichent sous forme de tableaux à plusieurs dimensions, exactement comme elles sont stockées sur le serveur de base de données. Il est dont logique de les afficher dans des tableaux HTML.
	</p>
<p>
	Comme exposé plus haut, les tableaux HTML se construisent à l'intérieur de la balise &lt;table&gt;, les balises &lt;tr&gt; délimitant les lignes et les balises &lt;td&gt; les colonnes.
	</p>
<p>
	Voici un exemple:
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />&lt;table&gt;
<li />&nbsp;&nbsp;&lt;tr&gt;
<li />&nbsp;&nbsp;&nbsp;&nbsp;&lt;td&gt;Colonne 1 / Ligne 1&lt;/td&gt;
<li />&nbsp;&nbsp;&nbsp;&nbsp;&lt;td&gt;Colonne 2 / Ligne 1&lt;/td&gt;
<li />&nbsp;&nbsp;&lt;/tr&gt;
<li />&nbsp;&nbsp;&lt;tr&gt;
<li />&nbsp;&nbsp;&nbsp;&nbsp;&lt;td&gt;Colonne 1 / Ligne 2&lt;/td&gt;
<li />&nbsp;&nbsp;&nbsp;&nbsp;&lt;td&gt;Colonne 2 / Ligne 2&lt;/td&gt;
<li />&nbsp;&nbsp;&lt;/tr&gt;
<li />&nbsp;&nbsp;&lt;tr&gt;
<li />&nbsp;&nbsp;&nbsp;&nbsp;&lt;td&gt;Colonne 1 / Ligne 3&lt;/td&gt;
<li />&nbsp;&nbsp;&nbsp;&nbsp;&lt;td&gt;Colonne 2 / Ligne 3&lt;/td&gt;
<li />&nbsp;&nbsp;&lt;/tr&gt;
<li />&lt;/table&gt;
	</ol>
<p>	</span>
	</p>
<p>
	Ce qui donne:
	</p>
<table style="border: 1px #000000 solid;">
<tr>
<td style="border: 1px #000000 solid;">Colonne 1 / Ligne 1</td>
<td style="border: 1px #000000 solid;">Colonne 2 / Ligne 1</td>
</tr>
<tr>
<td style="border: 1px #000000 solid;">Colonne 1 / Ligne 2</td>
<td style="border: 1px #000000 solid;">Colonne 2 / Ligne 2</td>
</tr>
<tr>
<td style="border: 1px #000000 solid;">Colonne 1 / Ligne 3</td>
<td style="border: 1px #000000 solid;">Colonne 2 / Ligne 3</td>
</tr>
</table>
<h2>Mise en pratique: affichage en liste</h2>
<p>
	Nous allons créer un fichier <span class="Code">liste.php</span> destiné à afficher la liste de tous les enregistrements de la base de données. Le début ne change pas:
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />&lt;php?
<li />&nbsp;
<li />include(&quot;connexion.php&quot;);
<li />&nbsp;
<li />connexion();
	</ol>
<p>	</span>
	</p>
<p>
	Il nous faut ensuite écrire la requête SQL. Dans ce cas, elle est simple et elle dit <em>Afficher TOUS les enregistrements de la table "mabase"</em>: <span class="Code">SELECT * FROM mabase</span>.
	</p>
<p>	<span class="Code"></p>
<ol class="Code">
<li />$sql = 'SELECT * FROM mabase';
	</ol>
<p>	</span></p>
<p>
	Nous envoyons ensuite la requête au serveur, le résultat de cette requête étant stocké dans la variable <span class="Code">$req</span>.
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />$req = mysql_query($sql) or die(mysql_error());
	</ol>
<p>	</span>
	</p>
<p>
	La variable <span class="Code">$req</span> stocke plusieurs éléments. Nous allons les extraire et les afficher un par un. Cela est possible grâce à l'instruction <span class="Code">while()</span> qui permet d'exécuter un certain code tant qu'une condition n'est pas remplie. Dans notre cas, la logique est la suivante: <em>Etant donné qu'une ligne du tableau HTML représente un enregistrement de la base de donnée, créez une ligne et remplissez chacune de ses colonnes tant qu'il reste des enregistrements dans la base de données.</em>
	</p>
<p>
	Les boucles while sont très intéressantes: il n'est pas nécessaire de savoir combien d'enregistrements il y a dans la base de données, puisque le même code sera exécuté <em>tant qu'il en reste</em>.
	</p>
<p>
	Voici donc le code:
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />echo &#x27;&lt;table&gt;&#x27;;
<li />while($data = mysql_fetch_assoc($req))
<li />{
<li />&nbsp;&nbsp; echo &#x27;&lt;tr&gt;&#x27;;
<li />&nbsp;&nbsp; echo &#x27;&lt;td&gt;$data["id"]&lt;/td&gt;&#x27;;
<li />&nbsp;&nbsp; echo &#x27;&lt;td&gt;$data["nom"]&lt;/td&gt;&#x27;;
<li />&nbsp;&nbsp; echo &#x27;&lt;td&gt;$data["prenom"]&lt;/td&gt;&#x27;;
<li />&nbsp;&nbsp; echo &#x27;&lt;td&gt;$data["age"]&lt;/td&gt;&#x27;;
<li />&nbsp;&nbsp; echo &#x27;&lt;/tr&gt;&#x27;;
<li />}
<li />echo &#x27;&lt;/table&gt;&#x27;;
	</ol>
<p>	</span>
	</p>
<p>
	Rappelez-vous, la commande <span class="Code">echo</span> permet d'afficher un élément à l'écran. Nous affichons ici des balises HTML et du contenu.
	</p>
<h2>Affichage en liste: Tri par colonnes</h2>
<p>
	Nous venons d'afficher les données de la base en liste, sous la forme d'un tableau: une colonne par propriété, une ligne par enregistrement. L'intérêt d'un tel affichage -données tabulaires- est de pouvoir effectuer des tris rapidement. Par exemple, classer les enregistrements en ordre croissant ou décroissant, par nom, prénom ou âge.
	</p>
<p>
	Pour effectuer un tel tri, il faudra passer une requête SQL de plus. Celle-ci est très simple: <span class="Code">SELECT * FROM mabase ORDER BY xxx yyy</span> où "xxx" représente le champ à prendre en considération, et "yyy" la méthode de tri. Par exemple, nous avons un champ "id" qui associe à chaque enregistrement de la base de données un numéro. Le premier enregistrement est "1", le second est "2", etc. Par défaut, lorsqu'on passe la requête pour afficher les données tabulaires, MySQL renvoie d'abord le premier enregistrement, puis le second, et ainsi de suite jusqu'au dernier. Le tableau se présentera donc de la façon suivante: le premier enregistrement -le plus vieux- en haut, le dernier -le plus récent- en bas. On appelle cela ordre "ascendant" ou croissant. Mais on peut vouloir l'inverse (et c'est fréquent dans ce cas): le dernier enregistrement, le plus récent, en haut, et le premier, le plus vieux, en bas. Dans ce cas, il faut trier les données par ordre "descendant" ou décroissant. L'instruction SQL sera: <span class="Code">SELECT * FROM mabase ORDER BY id DESC</span>. On écrit "DESC" pour ordre décroissant, et "ASC" pour ordre croissant.
	</p>
<p>
	Ne vous y trompez pas, ceci n'a rien à voir avec la commande SQL "WHERE". Nous avons vu au début de cet article que la requête <span class="Code">SELECT prenoms FROM mabase WHERE age > 40</span> affichait le prénom des gens qui ont plus de 40 ans. Cela implique que ceux qui ont moins de 40 ans seront ignorés. Si vous avez deux enregistrements dans votre base de données, l'un correspondant à une personne de 50 ans, et l'autre à une personne de 30 ans, alors seul le premier enregistrement sera affiché. Le second ne sera pas affiché, il sera ignoré. A l'inverse, la commande ORDER BY prend en compte tous les enregistrements: il ne s'agit pas de <em>rechercher</em> les enregistrements remplissant certains critères, en excluant ceux qui ne remplissent pas ces critères, mais de <em>trier</em> tous les enregistrements selon certains critères.
	</p>
<p>
	Vous pouvez intégrer tout cela à votre programme de manière très simple. Tout en haut de la page sur laquelle est affiché votre tableau -vos données tabulaires-, créez deux liens:
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />&lt;a href=&quot;liste.php?orderby=asc&quot;&gt;Trier par ordre croissant&lt;/a&gt;
<li />&lt;a href=&quot;liste.php?orderby=desc&quot;&gt;Trier par ordre décroissant&lt;/a&gt;
	</ol>
<p>	</span>
	</p>
<p>
	Ensuite, dans votre fichier "liste.php", adaptez votre vode. La requête SQL sera formée de manière différente, selon que l'utilisateur a cliqué sur le lien "Trier par ordre croissant" ou sur le lien "Trier par ordre décroissant".
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />if($_GET[&quot;orderby&quot;] == &quot;asc&quot;) // si on veut un ordre croissant
<li />{		$sql = &quot;SELECT * FROM mabase ORDER BY id ASC&quot;;
<li />}
<li />elseif($_GET[&quot;orderby&quot;] == &quot;desc&quot;) // si on veut un ordre décroissant
<li />{		$sql = &quot;SELECT * FROM mabase ORDER BY id DESC&quot;;
<li />}
<li />else // si rien n&#x27;a été précisé
<li />{		$sql = &quot;SELECT * FROM mabase&quot;;
<li />}
	</ol>
<p>	</span>
	</p>
<p>
	Le principe est le même pour les autres champs. Si par exemple vous voulez trier les personnes par âge croissant, les plus jeunes en haut et les plus vieux en bas, il vous suffira de passer la requête suivante: <span class="Code">SELECT * FROM mabase ORDER BY age ASC</span>.
	</p>
<h2>Astuce: affichage par fiche</h2>
<p>
	Nous venons d'afficher <em>tous</em> les enregistrements de la base de données. Peut-être que pour chaque enregistrement vous avez une trentaine de colonnes, et que ce n'est pas pratique pour vous de tout afficher en bloc. Dans ce cas là notre champ "id" va servir !
	</p>
<p>
	La solution est d'afficher la liste complète (comme dans l'exemple ci-dessus), en omettant par exemple les colonnes prenom et age. A la place, un lien de ce type: <span class="Code">echo '&lt;td&gt;&lt;a href="fiche.php?q='.$data["id"].'&gt;Voir la fiche&lt;/a&gt;&lt;/td&gt;';</span>
	</p>
<p>
	Ce code produira un lien renvoyant vers la page <span class="Code">fiche.php?q=XX</span>, XX étant le contenu de la colonne id pour celle ligne.
	</p>
<p>
	On récupère ensuite, dans le fichier <em>fiche.php</em>, la valeur de XX grâce à la variable <span class="Code">$_GET['q']</span>. Nous avons utilisé la méthode POST pour le formulaire, et nous utilisons maintenant la méthode GET ! La valeur de XX ainsi récupérée, il ne nous reste plus qu'à former la requête SQL: <span class="Code">$sql = "SELECT * FROM mabase WHERE id='".$_GET["q"]."'";</span>.
	</p>
<p>
	Au final, cela donne:
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />$id = $_GET[&#x27;id&#x27;];
<li />$sql = &quot;SELECT * FROM mabase WHERE id=&#x27;$id&#x27;&quot;;
<li />$req = mysql_query($sql) or die(mysql_error());
<li />$data = mysql_fetch_assoc($req);
<li />&nbsp;
<li />echo &#x27; Id: &#x27;.$data[&#x27;id&#x27;];
<li />echo &#x27; Nom: &#x27;.$data[&#x27;nom&#x27;];
<li />echo &#x27; Prénom: &#x27;.$data[&#x27;prenom&#x27;];
<li />echo &#x27; Âge: &#x27;.$data[&#x27;age&#x27;];
	</ol>
<p>	</span>
	</p>
<p>
	Je vous laisse écrire le reste du code, notamment la méthode de connexion à la base de donné qui ne change pas ; et la méthode de vérification de l'existence et de la non-nullité de la variable $_GET, puisque la procédure avec <em>if...else</em> est la même pour la variable $_GET et pour la variable $_POST. Une astuce en passant : pour sécuriser l'acquisition des données, il est conseillé de contrôler le <i>type</i> de ces données. Ici, <i>id</i> est censé être un <i>nombre</i>, c'est-à-dire de type <i>numérique</i>. On peut donc encadrer le code dans un bloc <span class="Code">if(is_numeric($_GET['id']))</span>.
	</p>
<h1>Etape 4: Recherche dans la base de données</h1>
<p>
	Pour rechercher dans la base de données, il faut utiliser un peu toutes les notions que nous venons de voir. Comme il est inutile que je me répète, je ne fournirai pas de code complet.
	</p>
<p>
	La première étape est de créer un formulaire. La seconde étape est de créer un fichier PHP qui récupère les données de ce formulaire. La troisième étape est la formation de la requête SQL à partir des données récupérées.
	</p>
<p>
	La requête de recherche se construit exactement comme expliqué dans l'exemple ci-dessus. En effet, nous avons recherché tous les enregistrements dont l'id est XX. L'id étant une valeur unique, il n'y a forcément qu'un seul résultat !
	</p>
<p>
	La recherche exacte se construit ainsi: <span class="Code">SELECT * FROM mabase WHERE nom_colonne = Y</span>. Le caractère <em>*</em> implique que l'on veut toutes les colonnes dans les résultats. Si l'on ne veut que certaines colonnes, il suffira d'écrire leurs noms séparés de virgules. <em>Y</em> correspond à ce que l'on veut rechercher.
	</p>
<p>
	La recherche approximative se construit de cette manière: <span class="Code">SELECT * FROM mabase WHERE nom_colonne LIKE '%S'</span>. On recherche ainsi toutes les entrées qui finissent par S. Le symbole <em>%</em> est un marqueur générique. Par exemple, si j'écris <em>Constit%</em>, me seront renvoyés aussi bien Constitution que Constitutionnel ou Constitutionnellement.
	</p>
<p>
	La quatrième étape est l'affichage des résultats. Vous pouvez reprendre le code d'affichage en liste et remplacer la requête SQL de ce code par la nouvelle requête SQL de recherche que vous venez de générer.
	</p>
<h1>Etape 5: Modifier et supprimer une entrée de la base de données</h1>
<p>
	Encore une fois, les mécanismes sont les mêmes. Il vous faut récupérer l'id de l'enregistrement à modifier ou supprimer comme expliqué ci-avant, et construire la requête SQL correspondante.
	</p>
<p>
	Pour mettre à jour, le mot clé SQL est <em>UPDATE</em>: <span class="Code">UPDATE mabase SET nom='$nom', prenom='$prenom, date='$date' WHERE id='$id'</span>.
	</p>
<p>
	Pour supprimer une entrée, le mot clé SQL est <em>DELETE</em>: <span class="Code">DELETE FROM mabase WHERE id='$id'</span>.
	</p>
<h1>Bonus: Sécuriser l'accès à la base de données</h1>
<p>
	Il existe de nombreuses méthodes pour sécuriser l'accès aux données, et notamment: les htaccess, le cryptage et les sessions PHP. Je vais développer ici les sessions PHP. Le principe est le suivant: l'administrateur de la base de données définit qui peut y accéder en définissant des couples login / mot de passe; et toute personne désirant utiliser la base de données devra saisir un des couples définis par l'administrateur.
	</p>
<p>
	Les sessions PHP sont très pratiques. Elles reposent sur un principe simple: le tableau $SESSION[] est créé et stocké sur le serveur. Il peut contenir n'importe quel type de données. De plus, il est <em>statique</em>. Cela signifie qu'il est accessible dans n'importe laquelle de vos pages (classes) PHP sans avoir à être redéclaré. Il n'est pas non plus réinitialisé d'une page à une autre. Pour le réinitialiser, deux méthodes: soit en écrivant <span class="Code">$SESSION[] = array();</span>, soit simplement en quittant votre navigateur !
	</p>
<p>
	Pour commencer, on crée les couples. Le premier login est <em>Martin</em>, et il est associé au mot de passe <em>abc</em>. De même pour les autres couples.
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />$admin_array = array(&#x27;Martin&#x27; => &#x27;abc&#x27;, &#x27;Dupont&#x27; => &#x27;def&#x27;, &#x27;Robert&#x27; => &#x27;ghi&#x27;);
	</ol>
<p>	</span>
	</p>
<p>
	On ouvre ensuite la session en écrivant <span class="Code">session_start();</span> au début de nos fichiers PHP.
	</p>
<p>
	On crée un formulaire, avec un champ de texte pour le login, un champ de texte pour le mot de passe, et un bouton pour envoyer les résultats avec la méthode POST. Puis, on récupère les valeurs soumises par le biais du formulaire dans une fonction qui les analyse et les compare aux valeurs de <span class="Code">$admin_array</span>. Cette fonction pourrait être construite ainsi:
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />foreach($admin_array as $logg => $passwd)
<li />{	if($_POST[&#x27;login&#x27;] == $logg AND $_POST[&#x27;password&#x27;] == $passwd)
<li />&nbsp;&nbsp;	{	$_SESSION[&#x27;identifie&#x27;] = 1;
<li />&nbsp;&nbsp;&nbsp;&nbsp;		return;
<li />&nbsp;&nbsp;	}
<li />}
	</ol>
<p>	</span>
	</p>
<p>
	Il nous faut maintenant créer une autre fonction qui vérifie si l'utilisateur est enregistré, c'est-à-dire si $_SESSION['identifie'] est égal à 1. Si c'est le cas, la fonction renverra la valeur "true", et elle renverra "false" dans tous les autres cas. A chaque fois que vous voudrez savoir si l'utilisateur est identifié, vous pourrez appeler la fonction suivante et vérifier la valeur qu'elle retourne.
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />function checkauth()
<li />{ if($_SESSION[&#x27;identifie&#x27;] == 1) return true;
<li />&nbsp; else return false;
<li />}
	</ol>
<p>	</span>
	</p>
<p>
	Dernière étape: on utilise la fonction checkauth() avant d'afficher un quelconque contenu, et avant d'exécuter une quelconque opération. Pour cela, on englobe les codes vus dans cet article dans une instruction if...else. Si la fonction renvoie "true", on peut afficher les données, sinon non. A noter que <span class="Code">if(checkauth())</span> est équivalent à <span class="Code">if(checkauth() == true)</span>.
	</p>
<p>
	<span class="Code"></p>
<ol class="Code">
<li />if(checkauth())
<li />{
<li /> // n&#x27;importe quelle opération sur la base de donnée
<li />}
<li />else
<li />{
<li /> // le code qui correspond au formulaire d&#x27;identification
<li />}
	</ol>
<p>	</span>
	</p>
<p>A Ledenon, le 25/09/2005<br />
Mis à jour à Montpellier le 21/12/2005<br />
Mis à jour à Paris le 11/04/2009</p>