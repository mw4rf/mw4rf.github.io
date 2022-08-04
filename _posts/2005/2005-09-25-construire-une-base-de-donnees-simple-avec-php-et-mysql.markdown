---
layout: post
status: publish
published: true
title: Construire une base de données simple avec PHP et MySQL

  
  



wordpress_id: 51
wordpress_url: http://blog.gfblog.com/index.php/2005/09/25/construire-une-base-de-donnees-simple-avec-php-et-mysql/
date: '2005-09-25 17:14:08 +0200'
date_gmt: '2005-09-25 15:14:08 +0200'
categories:
- Internet
tags:
- internet
- programmation
- web
- serveur
- bases de données
permalink:  /2005/09/25/construire-une-base-de-donnees-simple-avec-php-et-mysql/
---

Cet article constitue un tutoriel simple et rapide montrant comment construire une base de données en utilisant les technologies PHP et MySQL. Cette base de données sera accessible depuis internet à l'aide d'un navigateur.

Nous allons aborder les points suivants:

- Qu'allons-nous faire ?
- Comment le faire ?
- Etape 1: Créer la base de données.
- Etape 2: Ajouter une entrée dans la base de données.
- Etape 3: Afficher les entrées de la base de données.
- Etape 4: Rechercher des entrées dans la base de données.
- Etape 5: Modifier et supprimer une entrée dans la base de données.
- Bonus: Sécuriser l'accès à la base de données.

## Qu'allons-nous faire ?

Nous allons créer une base de données, et un logiciel permettant d'exploiter cette base de données. Une base de données stocke des informations remplissant certains critères. Elle permet de trier les informations qu'elle contient selon ces critères. Imaginez-vous un tableau Excel: des colonnes et des lignes. Une base de données fonctionne exactement sur le même principe.

En effet, si nous voulons stocker les informations "nom", "prénom" et "âge" pour différentes personnes, il nous faudra créer 3 colonnes, une pour chaque information; et X lignes, une par personne.

Cette illustration représente la structure de la base de données que nous allons créer:<br />

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


Vous l'aurez compris, le nombre de colonnes est fixe, tandis que le nombre de lignes est indéterminée: un nouvel enregistrement dans la base de données représente une ligne supplémentaire.

Pour comprendre les mécanismes de fonctionnement des bases de données, vous pouvez vous exercer à créer des feuilles de calcul sous Excel (ou un autre tableur) et à manipuler les données qu'elles contiennent. Excel se comporte en effet comme une base de données en stockant et manipulant les informations à la manière d'une base de données.

Dans le tableau ci-dessus, j'ai omis une colonne. Il s'agit de la colonne "identifiant" (nous l'appellerons _id_). A chaque ligne de cette colonne id est attribué un chiffre ou un nombre. Le premier enregistrement de la base de données aura ainsi l'identifiant 1, le second aura l'identifiant 2, et ainsi de suite. L'id permet par la suite de manipuler les lignes très facilement.

Une dernière précision importante: chaque colonne n'accepte qu'un type précis de données. Dans notre cas, la colonne id ne devra stocker que des nombres entiers, les colonnes nom et prénom des chaînes de texte (que nous appellerons dorénavant "string"), et la colonne âge un nombre entier (que nous appellerons "int" de l'anglais "integer"). Il est absolument nécessaire de bien déterminer dès le début de la conception d'une base de données le type de données stockées dans chaque colonne. En effet, si l'on veut trier les enregistrements suivant le critère "âge", et qu'un enregistrement contient, pour cette colonne, un string au lieu d'un entier, le tri ne pourra pas avoir lieu correctement. "Dupont" est-il inférieur ou supérieur à 52 ? Impossible à dire, on ne peut comparer que des données du même type.

## Comment le faire ?

Il existe de nombreuses manières de construire une base de données. En effet, chaque base de données repose sur un "serveur", et il existe une multitude de serveurs différents. Parmi les plus célèbres: Oracle, Sybase, Access, FileMaker, PostgreSQL et MySQL. Les deux premiers sont des serveurs professionnels qui coûtent plusieurs centaines de milliers d'euro et qui sont destinés à stocker des millions d'enregistrements. Access et FileMaker sont des serveurs propriétaires qui ne fonctionnent que par le biais d'un logiciel que vous devez installer sur votre système. Enfin, les deux derniers sont gratuits et permettent une consultation par internet grâce à l'intégration du langage de requêtes (SQL, le langage permettant de donner ses instructions au serveur) à la technologie web PHP.


Nous allons donc voir dans un premier temps comment fonctionnent les échanges entre serveur et client, pour voir ensuite ce que sont MySQL, SQL et PHP et, enfin, comprendre comment tous ces éléments s'imbriquent les uns dans les autres.

### Internet: dialogue entre un client et un serveur

Vous tapez une adresse dans la barre d'adresse de votre navigateur, et vous appuyez sur "Entrée". La page se charge à l'écran. Cela paraît simple, mais il s'agit en réalité du résultat d'un dialogue entre client (votre navigateur) et serveur (l'ordinateur qui contient l'information que vous demandez).


Lorsque vous appuyez sur "Entrée", votre navigateur contacte le serveur qui gère l'adresse que vous avez tapée. Le serveur vous envoie l'information demandée, et le navigateur l'affiche. Imaginez un fichier Word: vous double-cliquez dessus, il s'ouvre dans Word, et vous pouvez ainsi le lire. Dans notre cas, le client dit au serveur _je veux voir tel document_, ce qui correspond au double-clic. Le serveur envoie alors ce document au navigateur qui l'interprète et l'affiche à l'écran. Il l'interprète car, au même titre que votre fichier Word, c'est un fichier qui est envoyé du serveur au navigateur. Ce fichier est écrit dans un langage de programmation spécial que reconnaît le navigateur. Ce langage est le HTML.


Le navigateur reçoit par exemple l'information suivante: `<i>Bonjour</i>`. Il sait que tout texte compris entre la balise `<i>` et la balise `</i>` devra être affiché en italique. Il affichera donc: _Bonjour !_.


Il est particulièrement important pour la suite de comprendre ce mécanisme: le serveur émet un document rempli de texte (le code source définissant la mise en page et la présentation, et le contenu lui même), il ne traite pas ce texte. C'est le navigateur qui traite ce texte, et l'interprète pour afficher le résultat attendu.

### MySQL, SQL, PHP ?

Le principe du PHP, un autre langage de programmation, est tout à fait différent. En effet, dans ce cas c'est le serveur qui exécute le code source et qui renvoit le résultat au navigateur. Le serveur ne se contente pas d'envoyer les données, il les analyse et leur applique un traitement avant de les envoyer. On dit que le PHP "s'éxécute côté serveur" alors que le HTML est traité côté client.


Vous remarquerez que je n'emploie pas le verbe "s'exécuter" pour parler du HTML. Il s'agit là d'une autre différence -majeure- entre le HTML et le PHP: le HTML n'est pas exécutable, il est purement statique. En d'autres termes, alors que le HTML se borne à décrire une situation de faits (tel mot est en italique, telle phrase est en gras, telle image doit être affichée, etc.), le PHP peut avoir des comportements qui produisent des effets sous certaines conditions. Par exemple: _si le **nom** est **Dupont**, alors il devra être affiché en **rouge**_.


Le PHP est le langage que nous allons utiliser pour le traitement du contenu de la base de données.


MySQL est le nom du serveur de base de données. C'est un logiciel installé sur le serveur qui interprête et exécute les requêtes qui lui sont soumises grâce au langage SQL. Par exemple, le code suivant permet de retenir, dans la base de données appelée "mabase", tous les prénoms des personnes qui ont plus de 40 ans, en rejetant les prénoms des personnes qui ne remplissent pas ce critère: `SELECT prenoms FROM mabase WHERE age > 40`.

### Conjonction de ces éléments

Si vous avez compris les explications ci-dessus, vous devriez comprendre les deux phrases suivantes: « _Le contenu et la structure de la base de données seront stockés sur le serveur MySQL auquel accèderont des fonction PHP utilisant le langage SQL. La formation des requêtes SQL se fera grâce à des opérations logiques réalisées en PHP, et l'affichage des résultats de ces requêtes se fera grâce à un code HTML généré par d'autres fonctions PHP._ »

## Etape 1: Créer la base de données

### Connexion au serveur de base de données

Je suppose que votre base de données existe déjà, mais ne contient aucune donnée. Lorsque vous activez MySQL chez un hébergeur Web, une base de données associée à votre compte est automatiquement créée. Cependant, elle ne contient aucune "table". Une "table" est le conteneur d'un ensemble de colonnes et lignes. Nous allons nous connecter à la base de données, et créer la table utile à cet exercice.


Créez donc un fichier appelé `connexion.php`:

{% highlight php linenos %}
<?php
$host = "localhost"; /* L'adresse du serveur */
$login = ""; /* Votre nom d'utilisateur */
$password = ""; /* Votre mot de passe */
$base = ""; /* Le nom de la base */

function connexion()
{
    global $host, $login, $password, $base;
    $db = mysql_connect($host, $login, $password);
    mysql_select_db($base,$db);
}
?>
{% endhighlight %}


La ligne 1 contient le _tag_ (ou _balise_ en français) qui permet de déterminer le type de script utilisé: il s'agit de PHP. La ligne 13 informe le serveur que le script est terminé.

Les lignes 2 à 5 définissent des variables. Par exemple, votre _login_ ou nom d'utilisateur est _pierre-martin-123_. Vous assignez cette valeur à la variable `$login` pour qu'à chaque fois que vous fassiez référence à `$login` le serveur comprenne _pierre-martin-123_. De même pour les autres valeurs.

La ligne 7 marque la création d'une fonction. Une fonction regroupe une série d'instructions qui seront exécutées dès que cette dernière est appélée par son nom. Ainsi, au lieu d'écrire les lignes 9, 10 et 11, vous écrirez dorénavant `connexion();`. Les lignes 8 et 12 présentent des accolades qui délimitent la portée de la fonction: elle englobe toutes les lignes entre ces accolades.

### Création de la table

Créez ensuite un autre fichier appelé `installation.php`:

{% highlight php linenos %}
<?php
include("connexion.php");
 
connexion();
 
$sql= "CREATE TABLE IF NOT EXISTS `mabase` (";
$sql .= "`id` int(11) NOT NULL auto_increment,";
$sql .= "`nom` text NOT NULL,";
$sql .= "`prenom` text NOT NULL,";
$sql .= "`age` int NOT NULL,";
$sql .= "PRIMARY KEY  (`id`),";
$sql .= "UNIQUE KEY `id_2` (`id`),";
$sql .= "KEY `id` (`id`)";
$sql .= ") ENGINE=MyISAM;";
 
mysql_query($sql) or die(mysql_error());
?>
{% endhighlight %}


A la ligne 2, par l'instruction `include("connexion.php");`, nous incluons le contenu de ce fichier dans le fichier courant. Nous pourrons ainsi accéder à son contenu, notamment en appelant la fonction `connexion()` à la ligne 4.

Les lignes 6 à 14 contiennent les instructions de formation de la requête SQL. La requête est découpée et insérée dans la variable `$sql`. Notez que le symbole exmployé est `.=` qui signifie _ajoutez ce qui suit à la fin de la variable, après ce qu'elle contient déjà_.

A la ligne 6, nous créons la table, si elle n'existe pas déjà, et nous lui donnons le nom _mabase_. A la ligne 7, nous insérons dans la table la colonne _id_ de type int (entier), qui ne peut pas être une valeur nulle et qui s'incrémente automatiquement à chaque nouvel ajout dans la base de données. Cet élément, _id_, sera la clé ou le numéro de série qui identifie et individualise chaque enregistrement (lignes 11 à 13). A la ligne 8 nous insérons la colonne _nom_ de type _text_ et qui ne peut être nulle. La ligne 14 détermine le moteur de la base de données (MyISAM), thème qui dépasse l'objet de cet article.

La ligne 16 soumet la requête formée à la base de données, et affiche une éventuelle erreur à l'écran.

## Etape 2: Ajouter une entrée dans la base de données

### Utilisation des variables et formation de la requête SQL

Quand on ajoute une entrée dans la base de données, une nouvelle ligne est créée. A chaque colonne de cette nouvelle ligne est assignée une valeur.

Nous allons donc utiliser une requête SQL pour attribuer une valeur à chaque colonne de la nouvelle ligne: `INSERT INTO mabase(id,nom,prenom,age) VALUES('','Martin','Pierre','42')`. En français, cela donnerait: _Insérez dans la table appelée "mabase", respectivement pour les colonnes "id", "nom", "prénom" et "age", les valeurs "(vide)", "Martin", "Pierre" et "42"_.

Nous avons vu que le langage PHP utilisait des variables. On peut donc remplacer les valeurs que l'on veut insérer par la nom des variables qui les contiennent.

Dans un premier temps, on assigne les valeurs aux variables:

{% highlight php linenos %}
$nom = 'Martin';
$prenom = 'Pierre';
$age = '42'
{% endhighlight %}

On pourra ainsi, dans un second temps, insérer ces variables au lieu des valeurs associées dans la requête SQL: `INSERT INTO mabase(id,nom,prenom,age) VALUES('','$nom','$prenom','$age')`.

### Création du formulaire

Vous savez maintenant former la requête SQL d'ajout d'un enregisterment dans la base de données en utilisant des variables. Il nous faut à présent créer un formulaire pour récupérer les données à ajouter.

Un formulaire est un ensemble d'objets que manipule l'utilisateur -le visiteur de la page-. Il y a ainsi des champs de texte, des cases à cocher, des menus déroulants, des boutons, etc. Notre formulaire sera simple: 3 champs et 1 bouton.

Voici le code du formulaire:

{% highlight html linenos %}
{% raw %}
<form name="formulaire" method="post" action="ajouter.php">
<table width="200" border="1">
    <tr>
        <td>Nom:</td>
        <td><input name="nom" type="text" id="nom" /></td>
    </tr>
    <tr>
        <td>Prénom:</td>
        <td><input name="prenom" type="text" id="prenom" /></td>
    </tr>
    <tr>
        <td>Age:</td>
        <td><input name="age" type="text" id="age" size="3" maxlength="3" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <div align="center">
            <input type="submit" name="Submit" value="Envoyer" />
            </div>
        </td>
    </tr>
</table>
</form>
{% endraw %}
{% endhighlight %}


Et voilà le résultat:

<form name="formulaire" method="post" action="ajouter.php">
<table width="200" border="1">
    <tr>
        <td>Nom:</td>
        <td><input name="nom" type="text" id="nom" /></td>
    </tr>
    <tr>
        <td>Prénom:</td>
        <td><input name="prenom" type="text" id="prenom" /></td>
    </tr>
    <tr>
        <td>Age:</td>
        <td><input name="age" type="text" id="age" size="3" maxlength="3" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <div align="center">
            <input type="submit" name="Submit" value="Envoyer" disabled="disabled" />
            </div>
        </td>
    </tr>
</table>
</form>

Ce code mérite quelques explications. A la ligne 1 on crée le formulaire, et on lui donne un nom (ici: _formulaire_). Puis, on indique la méthode de transmission des données. Il en existe deux: **POST** et **GET**. Pour les formulaires, on utilise en règle générale POST. Ces deux méthodes sortent de l'objet de cet article. Enfin, on indique vers quel fichier le contenu du formulaire sera envoyé: _ajouter.php_.

La balise `<table>` sert à créer un tableau. Ici, il a les attributs suivants: largeur de 200 pixels, épaisseur de la bordure de 1 pixel.
    
Les balises `<tr>` et `<td>` servent, respectivement, à créer une ligne et une colonne.

Les champs de texte sont créés grâce à la balise `<input>`. Ainsi, à la ligne 5 on crée un objet de type input, qui est un champ de texte (_type="text"_), et dont le nom et l'identifiant sont _nom_. A la ligne 13, il s'agit du champ pour la valeur âge: la taille maximale du texte entré sera de 3 caractères, la taille du champ sera de 3 caractères.

Pour finir, à la ligne 17, on crée un bouton qui servira à valider le formulaire, et à envoyer les valeurs des champs vers le fichier spécifié à la ligne 1 et avec la méthode spécifiée à cette même ligne.

### Récupération des valeurs du formulaire

Nous avons créé le formulaire qui permet à l'utilisateur de saisir ses données, nous allons maintenant créer la page _ajouter.php_ qui nous permettra d'ajouter les données soumises dans la base de données.

Créez donc le fichier `ajouter.php` et ajoutez le code qui suit, de manière à se connecter à la base de données:

{% highlight php linenos %}
<?php
include("connexion.php");
connexion();
{% endhighlight %}


Une fois connecté à la base de données, il nous faut récupérer les valeurs du formulaire. On utilise pour cela un tableau ou matrice qui peut contenir plusieurs valeurs différentes. Il s'agit du tableau `$_POST`. Dans notre formulaire, nous avons donné ces noms aux champs: nom, prenom, age. Pour récupérer les valeurs saisiez dans ces champs, il suffira d'écrire, respectivement: `$_POST['nom']`, `$_POST['prenom']` et `$_POST['age']`.

Ce système nous permet de former la requête SQL très simplement: `INSERT INTO mabase(id,nom,prenom,age) VALUES('','".$_POST['nom']."','".$_POST['prenom']."','".$_POST['age']."')`.


Ce qui donne, au final le code suivant (à la suite du début du fichier décrit plus haut):

{% highlight php linenos %}
$sql = "INSERT INTO mabase(id,nom,prenom,age) ";
$sql .= "VALUES('','".$_POST['nom']."','".$_POST['prenom']."','".$_POST['age']."')";
    
mysql_query($sql) or die(mysql_error());
?>
{% endhighlight %}

### Contrôle des valeurs saisies

Le code présente ci-avant est parfaitement fonctionnel. Il présente cependant un gros défaut: les valeurs saisies par l'utilisateur ne sont pas contrôlées. Ainsi, un utilisateur pourrait omettre de donner son nom, ce qui aurait pour conséquence l'insertion d'un valeur vide dans la base de données.

Un programmeur PHP doit toujours se poser la question suivante: _comment se comportera mon code s'il est appelé anormalement ou en dehors de son contexte ?_. Dans notre cas, si on tape l'adresse du fichier _ajouter.php_ dans un navigateur, si on appelle le fichier sans passer par le formulaire, on aura droit à un beau bug, et pour cause puisque le tableau $_POST n'existe que lorsqu'il y a un formulaire utilisant la méthode POST en amont !

Il nous faut donc contrôler deux choses: que POST existe bien, et que tous les champs ont été renseignés. Ces deux choses se réalisent en une seule opération, à l'aide d'une expression conditionnelle.

Les expressions conditionnelles permettent de déterminer quel comportement aura le programme, en fonction d'éléments et de conditions déterminés. La logique est la suivante: _si A alors B sinon C_.

En PHP, cela donne:

{% highlight php %}
if ($POST['nom'] != '' AND $POST['prenom'] != '' AND $POST['age'] != '')
{ // c'est bon, on peut copier/coller ici le code vu ci-dessus
}
else
{
echo 'Erreur ! Vous devez remplir tous les champs !';
}
{% endhighlight %}


_if_ signifie _si_, _else_ signifie _sinon_.


La syntaxe est la suivante : _if(la condition à remplir) { le code à exécuter si la condition est remplie } else { le code à exécuter si la condition n'est pas remplie }_.

Dans notre cas la condition est simple. On prend le contenu de notre tableau et on vérifie qu'aucune des entrées n'est vide. Par exemple, pour le nom: d'un côté on a `$POST['nom']` qui représente ce que l'utilisateur a saisi, d'un autre côté `''` qui représente un contenu inexistant (une chaîne de texte vide), et enfin, au milieu `!=` qui est un opérateur de comparaison signifiant _différent de_. On répète cela pour les champs prénom et âge, en mettant l'opérateur booléen `AND` qui signifie _et_.

La condition peut ainsi se lire: _SI la valeur du champ NOM du formulaire N'EST PAS une CHAÎNE VIDE, ET SI la valeur du champ PRENOM du formulaire N'EST PAS une CHAÎNE VIDE, ET SI la valeur du champ AGE du formulaire N'EST PAS une CHAÎNE VIDE; alors exécuter le code qui suit..._

L'instruction `echo` permet d'afficher quelque chose à l'écran. Dans notre cas, un message d'erreur indiquant que tous les champs n'ont pas été renseignés.

Le code final du fichier `ajouter.php` est le suivant:

{% highlight php linenos %}
<?php
include("connexion.php");
 
if ($POST['nom'] != '' AND $POST['prenom'] != '' AND $POST['age'] != '')
{
    connexion();
    $sql = "INSERT INTO mabase(id,nom,prenom,age) ";
    $sql .= "VALUES('','$_POST['nom']','$_POST['prenom']','$_POST['age']')";
    mysql_query($sql) or die(mysql_error());
}
else
{
    echo 'Erreur ! Vous devez remplir tous les champs !';
}
?>
{% endhighlight %}

## Etape 3: Afficher les entrées de la base de données

### Principe: afficher des données tabulaires

Les données tabulaires s'affichent sous forme de tableaux à plusieurs dimensions, exactement comme elles sont stockées sur le serveur de base de données. Il est dont logique de les afficher dans des tableaux HTML.

Comme exposé plus haut, les tableaux HTML se construisent à l'intérieur de la balise `<table>`, les balises `<tr>` délimitant les lignes et les balises `<td>` les colonnes.

Voici un exemple:

{% highlight html %}
{% raw %}
<table>
  <tr>
    <td>Colonne 1 / Ligne 1</td>
    <td>Colonne 2 / Ligne 1</td>
  </tr>
  <tr>
    <td>Colonne 1 / Ligne 2</td>
    <td>Colonne 2 / Ligne 2</td>
  </tr>
  <tr>
    <td>Colonne 1 / Ligne 3</td>
    <td>Colonne 2 / Ligne 3</td>
  </tr>
</table>
{% endraw %}
{% endhighlight %}


Ce qui donne:

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


### Mise en pratique: affichage en liste

Nous allons créer un fichier `liste.php` destiné à afficher la liste de tous les enregistrements de la base de données. Le début ne change pas:

{% highlight php %}
<?php
include("connexion.php");
connexion();
{% endhighlight %}

Il nous faut ensuite écrire la requête SQL. Dans ce cas, elle est simple et elle dit _Afficher TOUS les enregistrements de la table "mabase"_: `SELECT * FROM mabase`.

{% highlight php %}
$sql = 'SELECT * FROM mabase';
{% endhighlight %}

Nous envoyons ensuite la requête au serveur, le résultat de cette requête étant stocké dans la variable `$req`.

{% highlight php %}
$req = mysql_query($sql) or die(mysql_error());
{% endhighlight %}

La variable `$req` stocke plusieurs éléments. Nous allons les extraire et les afficher un par un. Cela est possible grâce à l'instruction `while()` qui permet d'exécuter un certain code tant qu'une condition n'est pas remplie. Dans notre cas, la logique est la suivante: _Etant donné qu'une ligne du tableau HTML représente un enregistrement de la base de donnée, créez une ligne et remplissez chacune de ses colonnes tant qu'il reste des enregistrements dans la base de données._

Les boucles _while_ sont très intéressantes: il n'est pas nécessaire de savoir combien d'enregistrements il y a dans la base de données, puisque le même code sera exécuté _tant qu'il en reste_.

Voici donc le code:

{% highlight php %}
echo '<table>';
while($data = mysql_fetch_assoc($req))
{
   echo '<tr>';
   echo '<td>$data["id"]</td>';
   echo '<td>$data["nom"]</td>';
   echo '<td>$data["prenom"]</td>';
   echo '<td>$data["age"]</td>';
   echo '</tr>';
}
echo '</table>';
{% endhighlight %}

Rappelez-vous, la commande `echo` permet d'afficher un élément à l'écran. Nous affichons ici des balises HTML et du contenu.

### Affichage en liste: Tri par colonnes

Nous venons d'afficher les données de la base en liste, sous la forme d'un tableau: une colonne par propriété, une ligne par enregistrement. L'intérêt d'un tel affichage -données tabulaires- est de pouvoir effectuer des tris rapidement. Par exemple, classer les enregistrements en ordre croissant ou décroissant, par nom, prénom ou âge.

Pour effectuer un tel tri, il faudra passer une requête SQL de plus. Celle-ci est très simple: `SELECT * FROM mabase ORDER BY xxx yyy` où _xxx_ représente le champ à prendre en considération, et _yyy_ la méthode de tri. Par exemple, nous avons un champ _id_ qui associe à chaque enregistrement de la base de données un numéro. Le premier enregistrement est "1", le second est "2", etc. Par défaut, lorsqu'on passe la requête pour afficher les données tabulaires, MySQL renvoie d'abord le premier enregistrement, puis le second, et ainsi de suite jusqu'au dernier. Le tableau se présentera donc de la façon suivante: le premier enregistrement --le plus vieux-- en haut, le dernier --le plus récent-- en bas. On appelle cela ordre _ascendant_ ou croissant. Mais on peut vouloir l'inverse (et c'est fréquent dans ce cas): le dernier enregistrement, le plus récent, en haut, et le premier, le plus vieux, en bas. Dans ce cas, il faut trier les données par ordre _descendant_ ou décroissant. L'instruction SQL sera: `SELECT * FROM mabase ORDER BY id DESC`. On écrit `DESC` pour ordre décroissant, et `ASC` pour ordre croissant.

Ne vous y trompez pas, ceci n'a rien à voir avec la commande SQL `WHERE`. Nous avons vu au début de cet article que la requête `SELECT prenoms FROM mabase WHERE age > 40` affichait le prénom des gens qui ont plus de 40 ans. Cela implique que ceux qui ont moins de 40 ans seront ignorés. Si vous avez deux enregistrements dans votre base de données, l'un correspondant à une personne de 50 ans, et l'autre à une personne de 30 ans, alors seul le premier enregistrement sera affiché. Le second ne sera pas affiché, il sera ignoré. A l'inverse, la commande `ORDER BY` prend en compte tous les enregistrements: il ne s'agit pas de _rechercher_ les enregistrements remplissant certains critères, en excluant ceux qui ne remplissent pas ces critères, mais de _trier_ tous les enregistrements selon certains critères. Mais il est bin entendu possible de trier, avec `ÒRDER BY` les résultats d'une requête formulée avec `WHERE`, qui ne renvoie qu'une partie des enregistrements de la base de données.

Vous pouvez intégrer tout cela à votre programme de manière très simple. Tout en haut de la page sur laquelle est affiché votre tableau -vos données tabulaires-, créez deux liens:

{% highlight html %}
{% raw %}
<a href="liste.php?orderby=asc">Trier par ordre croissant</a>
<a href="liste.php?orderby=desc">Trier par ordre décroissant</a>
{% endraw %}
{% endhighlight %}

Ensuite, dans votre fichier `liste.php`, adaptez votre vode. La requête SQL sera formée de manière différente, selon que l'utilisateur a cliqué sur le lien "Trier par ordre croissant" ou sur le lien "Trier par ordre décroissant".

{% highlight php %}
// si on veut un ordre croissant
if($_GET["orderby"] == "asc")
{
    $sql = "SELECT * FROM mabase ORDER BY id ASC";
}
// si on veut un ordre décroissant
elseif($_GET["orderby"] == "desc") 
{
    $sql = "SELECT * FROM mabase ORDER BY id DESC";
}
// si rien n'a été précisé
else 
{
    $sql = "SELECT * FROM mabase";
}
{% endhighlight %}


Le principe est le même pour les autres champs. Si par exemple vous voulez trier les personnes par âge croissant, les plus jeunes en haut et les plus vieux en bas, il vous suffira de passer la requête suivante: `SELECT * FROM mabase ORDER BY age ASC`.

### Astuce: affichage par fiche

Nous venons d'afficher _tous_ les enregistrements de la base de données. Peut-être que pour chaque enregistrement vous avez une trentaine de colonnes, et que ce n'est pas pratique pour vous de tout afficher en bloc. Dans ce cas là notre champ `id` va servir !


La solution est d'afficher la liste complète (comme dans l'exemple ci-dessus), en omettant par exemple les colonnes prenom et age. A la place, un lien de ce type: `echo '<td><a href="fiche.php?q='.$data["id"].'>Voir la fiche</a></td>';`.

Ce code produira un lien renvoyant vers la page `fiche.php?q=XX`, XX étant le contenu de la colonne id pour celle ligne.

On récupère ensuite, dans le fichier `fiche.php`, la valeur de XX grâce à la variable `$_GET['q']`. Nous avons utilisé la méthode POST pour le formulaire, et nous utilisons maintenant la méthode GET ! La valeur de XX ainsi récupérée, il ne nous reste plus qu'à former la requête SQL: `$sql = "SELECT * FROM mabase WHERE id='".$_GET["q"]."'";`.

Au final, cela donne:

{% highlight php %}
$id = $_GET['id'];
$sql = "SELECT * FROM mabase WHERE id='$id'";
$req = mysql_query($sql) or die(mysql_error());
$data = mysql_fetch_assoc($req);
 
echo ' Id: '.$data['id'];
echo ' Nom: '.$data['nom'];
echo ' Prénom: '.$data['prenom'];
echo ' Âge: '.$data['age'];
{% endhighlight %}

Je vous laisse écrire le reste du code, notamment la méthode de connexion à la base de donné qui ne change pas ; et la méthode de vérification de l'existence et de la non-nullité de la variable `$_GET`, puisque la procédure avec _if...else_ est la même pour la variable `$_GET` et pour la variable `$_POST`. Une astuce en passant : pour sécuriser l'acquisition des données, il est conseillé de contrôler le _type__ de ces données. Ici, `id` est censé être un nombre entier, c'est-à-dire de type _numérique_. On peut donc encadrer le code dans un bloc `if(is_numeric($_GET['id']))`.

## Etape 4: Recherche dans la base de données

Pour rechercher dans la base de données, il faut utiliser un peu toutes les notions que nous venons de voir. Comme il est inutile que je me répète, je ne fournirai pas de code complet.

La première étape est de créer un formulaire. La seconde étape est de créer un fichier PHP qui récupère les données de ce formulaire. La troisième étape est la formation de la requête SQL à partir des données récupérées.

La requête de recherche se construit exactement comme expliqué dans l'exemple ci-dessus. En effet, nous avons recherché tous les enregistrements dont l'id est XX. L'id étant une valeur unique, il n'y a forcément qu'un seul résultat !

La recherche exacte se construit ainsi: `SELECT * FROM mabase WHERE nom_colonne = Y`. Le caractère `*` implique que l'on veut toutes les colonnes dans les résultats. Si l'on ne veut que certaines colonnes, il suffira d'écrire leurs noms séparés de virgules. _Y_ correspond à ce que l'on veut rechercher.

La recherche approximative se construit de cette manière: `SELECT * FROM mabase WHERE nom_colonne LIKE '%S'`. On recherche ainsi toutes les entrées qui finissent par S. Le symbole `%` est un marqueur générique. Par exemple, si j'écris `Constit%`, me seront renvoyés aussi bien Constitution que Constitutionnel ou Constitutionnellement.

La quatrième étape est l'affichage des résultats. Vous pouvez reprendre le code d'affichage en liste et remplacer la requête SQL de ce code par la nouvelle requête SQL de recherche que vous venez de générer.

## Etape 5: Modifier et supprimer une entrée de la base de données

Encore une fois, les mécanismes sont les mêmes. Il vous faut récupérer l'id de l'enregistrement à modifier ou supprimer comme expliqué ci-avant, et construire la requête SQL correspondante.

Pour mettre à jour, le mot clé SQL est _UPDATE_: `UPDATE mabase SET nom='$nom', prenom='$prenom, date='$date' WHERE id='$id'`.

Pour supprimer une entrée, le mot clé SQL est _DELETE_: `DELETE FROM mabase WHERE id='$id'`.

## Bonus: Sécuriser l'accès à la base de données

Il existe de nombreuses méthodes pour sécuriser l'accès aux données, et notamment: les htaccess, le cryptage et les sessions PHP. Je vais développer ici les sessions PHP. Le principe est le suivant: l'administrateur de la base de données définit qui peut y accéder en définissant des couples login / mot de passe; et toute personne désirant utiliser la base de données devra saisir un des couples définis par l'administrateur.

Les sessions PHP sont très pratiques. Elles reposent sur un principe simple: le tableau $SESSION[] est créé et stocké sur le serveur. Il peut contenir n'importe quel type de données. De plus, il est _statique_. Cela signifie qu'il est accessible dans n'importe laquelle de vos pages (classes) PHP sans avoir à être redéclaré. Il n'est pas non plus réinitialisé d'une page à une autre. Pour le réinitialiser, deux méthodes: soit en écrivant `$SESSION[] = array();`, soit simplement en quittant votre navigateur !

Pour commencer, on crée les couples. Le premier login est _Martin_, et il est associé au mot de passe _abc_. De même pour les autres couples.

{% highlight php %}
$admin_array = array('Martin' => 'abc', 'Dupont' => 'def', 'Robert' => 'ghi');
{% endhighlight %}

On ouvre ensuite la session en écrivant `session_start();` au début de nos fichiers PHP.

On crée un formulaire, avec un champ de texte pour le login, un champ de texte pour le mot de passe, et un bouton pour envoyer les résultats avec la méthode POST. Puis, on récupère les valeurs soumises par le biais du formulaire dans une fonction qui les analyse et les compare aux valeurs de `$admin_array`. Cette fonction pourrait être construite ainsi:

{% highlight php %}
foreach($admin_array as $logg => $passwd)
{
    if($_POST['login'] == $logg AND $_POST['password'] == $passwd) {
        $_SESSION['identifie'] = 1;
        return;
    }
}
{% endhighlight %}

Il nous faut maintenant créer une autre fonction qui vérifie si l'utilisateur est enregistré, c'est-à-dire si `$_SESSION['identifie']` est égal à 1. Si c'est le cas, la fonction renverra la valeur "true", et elle renverra "false" dans tous les autres cas. A chaque fois que vous voudrez savoir si l'utilisateur est identifié, vous pourrez appeler la fonction suivante et vérifier la valeur qu'elle retourne.

{% highlight php %}
function checkauth()
{ 
    if($_SESSION['identifie'] == 1) return true;
    else return false;
}
{% endhighlight %}


Dernière étape: on utilise la fonction checkauth() avant d'afficher un quelconque contenu, et avant d'exécuter une quelconque opération. Pour cela, on englobe les codes vus dans cet article dans une instruction if...else. Si la fonction renvoie "true", on peut afficher les données, sinon non. A noter que `if(checkauth())` est équivalent à `if(checkauth() == true)`.

{% highlight php %}
if(checkauth())
{
 // n'importe quelle opération sur la base de donnée
}
else
{
 // le code qui correspond au formulaire d'identification
}
{% endhighlight %}

A Ledenon, le 25/09/2005<br />
Mis à jour à Montpellier le 21/12/2005<br />
Mis à jour à Paris le 11/04/2009<br />
Mis à jour à Montpellier le 28/07/2015
