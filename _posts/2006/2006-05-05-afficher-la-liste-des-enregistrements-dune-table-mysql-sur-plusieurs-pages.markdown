---
layout: post
status: publish
published: true
title: Afficher la liste des enregistrements d'une table MySQL sur plusieurs pages
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "<p>\r\nIl est courant de présenter les enregistrements d'une base de données
  sous forme de liste. C'est même très simple a réaliser si l'on veut afficher grâce
  au PHP tous les enregistrements d'une table MySQL. Cependant, un problème surgit
  tôt ou tard: il y a trop d'enregistrements dans la table, et ils ne peuvent pas
  tous être affichés sur la même page. La raison est évidente: il n'est pas raisonnable
  de présenter une liste de plusieurs dizaines de pages de long alors que l'utilisateur
  n'a besoin que des premiers enregistrements de la liste. Charge des milliers d'enregistrements
  dans un tableau aux proportions démesurées va à l'encontre de toute optimisation
  du code: la page sera longue à charger, lourde à manipuler, et pourra même aller
  jusqu'à faire planter le navigateur s'il y a plusieurs mégaoctets de données à afficher.\r\n</p>\r\n\r\n<p>\r\nLa
  solution ? Afficher la liste sur plusieurs pages de X enregistrements chacune, avec
  en en-tête de la liste deux petits boutons \"Précédente\" et \"Suivante\" qui permettent
  de passer d'une page à l'autre. Eh bien, c'est plus facile à dire qu'à faire. On
  se heurte en effet très tôt à une difficulté: il faut prévoir les limites de la
  liste et enlever le bouton \"Précédente\" sur la première page et le bouton \"Suivante\"
  sur la dernière, sous peine de générer une erreur lors du passage de la requête
  SQL.\r\n</p>\r\n\r\n"
wordpress_id: 102
wordpress_url: http://www.valhalla-fr.eu/index.php/2006/05/05/afficher-la-liste-des-enregistrements-dune-table-mysql-sur-plusieurs-pages/
date: '2006-05-05 01:28:24 +0200'
date_gmt: '2006-05-04 23:28:24 +0200'
categories:
- Web
tags:
- Internet
- Web
permalink:  /2006/05/05/afficher-la-liste-des-enregistrements-dune-table-mysql-sur-plusieurs-pages/
---
<p>
Il est courant de présenter les enregistrements d'une base de données sous forme de liste. C'est même très simple a réaliser si l'on veut afficher grâce au PHP tous les enregistrements d'une table MySQL. Cependant, un problème surgit tôt ou tard: il y a trop d'enregistrements dans la table, et ils ne peuvent pas tous être affichés sur la même page. La raison est évidente: il n'est pas raisonnable de présenter une liste de plusieurs dizaines de pages de long alors que l'utilisateur n'a besoin que des premiers enregistrements de la liste. Charge des milliers d'enregistrements dans un tableau aux proportions démesurées va à l'encontre de toute optimisation du code: la page sera longue à charger, lourde à manipuler, et pourra même aller jusqu'à faire planter le navigateur s'il y a plusieurs mégaoctets de données à afficher.</p>
<p>
La solution ? Afficher la liste sur plusieurs pages de X enregistrements chacune, avec en en-tête de la liste deux petits boutons "Précédente" et "Suivante" qui permettent de passer d'une page à l'autre. Eh bien, c'est plus facile à dire qu'à faire. On se heurte en effet très tôt à une difficulté: il faut prévoir les limites de la liste et enlever le bouton "Précédente" sur la première page et le bouton "Suivante" sur la dernière, sous peine de générer une erreur lors du passage de la requête SQL.</p>
<p><a id="more"></a><a id="more-102"></a></p>
<p>
Quelques explications sont sans doute les bienvenues. MySQL nous offre un moyen simple pour choisir quels enregistrements afficher: la clause LIMIT. Elle fonctionne ainsi: <span class="Code">LIMIT x, z</span> où <b>x</b> est le point de départ et <b>z</b> la distance à parcourir. Exemple: <span class="Code">SELECT * FROM matable LIMIT 0, 10</span> récupère 10 enregistrements à partir de 0, soit les 10 premiers enregistrements ; <span class="Code">SELECT * FROM matable LIMIT 5, 10</span> récupère 10 enregistrements à partir de 5, soit les enregistrements 6 à 15. J'ai bien écrit 6, et pas 5. Le premier enregistrement est en effet indexée à 0, et les bornes sont incluses dans la sélection. <span class="Code">LIMIT 0, 10</span> renvoie donc l'intervalle [0,9] et <span class="Code">LIMIT 5, 10</span> l'intervalle [6, 15]. On comprend que x, qui correspond à la première borne de l'intervalle, peut également être considéré comme le premier enregistrement de la page suivante.</p>
<p>
Pour connaître le nombre d'enregistrements dans la table, il faudra effectuer une requête préalable. En PHP, il faudra ainsi écrire:<br /> <br />
<span class="Code"></p>
<ul style="list-style:none;">
<li />$sql = "SELECT * FROM matable;";
<li />$req = mysql_query($sql);
<li />$t = mysql_num_rows($req);
</ul>
<p></span>.<br />
La commande <span class="Code">mysql_num_rows</span> permet, comme vous l'aurez compris, de récupérer le nombre (num) de lignes (rows) de la table considérée. Outre les variables x et z déjà définies, nous obtenons <b>t</b> qui correspond au nombre total d'enregistrements, c'est-à-dire à l'index du dernier enregistrement, c'est-à-dire à la borne supérieure de notre intervalle global.</p>
<p>
Avec cela, nous pouvons avancer, mais pas reculer. Plus précisément, nous pouvons calculer l'intervalle des enregistrements correspondant à la page qui suit la page courante, mais pas l'intervalle correspondant à celle qui la précède. Pour afficher la page précédente, il nous faut, comme il a été expliqué ci-dessus, les deux paramètres de la clause LIMIT: le point de départ et la distance à parcourir. La distance à parcourir ne change pas, il s'agit toujours de notre variable <b>z</b>. Le point de départ, nous l'appellerons <b>y</b>.</p>
<p>
Nous voilà donc en présence des variables suivantes:</p>
<ul style="list-style:none;">
<li /><b>x</b>: le premier enregistrement de la page suivante
<li /><b>y</b>: le premier enregistrement de la page précédente
<li /><b>z</b>: le nombre d'enregistrements à afficher
<li /><b>t</b>: le nombre total d'enregistrements
</ul>
<p><img align="center" alt="schéma" src="./images/mysql_limit/limit.png"/></p>
<p>
Commençons à élaborer le code. La première chose à faire est d'afficher la première page: l'intervalle [x=0,z]. La variable <b>x</b> est forcément égale à 0, puisque l'index du premier enregistrement est 0 (<i>offset</i>). L'intervalle, matérialisé par la variable <b>z</b> peut être n'importe quoi (il ne peut pas être négatif, bien entendu, et ne peut pas être supérieur à <b>t</b>). Enfin, <b>y</b> sera initialisé à la même valeur que <b>z</b>, puisque s'il s'agit du premier intervalle, il n'y a par définition aucun intervalle avant lui.<br />
<span class="Code"></p>
<ul style="list-style:none;">
<li />$x = 0;
<li />$z = 10;
<li />$y = $z;
</ul>
<p></span><br />
Il ne nous reste plus qu'à former la requête SQL:<br />
<span class="Code">SELECT * FROM matable LIMIT $x,$z;</span></p>
<p>
Il faut maintenant préparer les boutons "page suivante" et "page précédente". L'idée est la suivante: cliquer sur ces boutons appelle une URL (ou une méthode directement, avec AJAX...) qui contient les valeurs de <b>x</b> et de <b>z</b> respectivement pour la page qui suit et pour celle qui précède la page courante.</p>
<p>
Pour la page précédente d'abord. Il faut calculer la valeur de <b>y</b>, le premier enregistrement de la page précédente. <b>y</b> est égal à <b>x - z</b>: <span class="Code">$y = $x - $z;</span>. Mais un problème se pose: que se passe-t-il si <b>z</b> est supérieur à <b>x</b> ? On sait que <b>y</b> ne peut en aucun cas être un nombre négatif, puisque l'index du premier enregistrement est 0. Si la requête est formée avec un <b>y</b> négatif, une erreur sera générée. Un simple test permet de parer à cette éventualité: <span class="Code">if($y < 0) { $y = 0; }</span>.<br />
</span></p>
<p>
Pour la page suivante, le raisonnement est le même. Le schéma ci-dessus l'illustre parfaitement, le nouveau <b>x</b> est l'ancien plus <b>z</b>: <span class="Code">$x = $x + $z;</span>. Mais à nouveau un problème se pose: si <b>x+z</b> devient supérieur à <b>t</b>. En effet, <b>z</b> est fixé, par exemple à 10. <b>x</b> varie, disons qu'il est pour l'instant à 90. Quant à <b>t</b>, il est égal à 95 puisqu'il y a 95 enregistrements dans la table. Si l'on applique bêtement <b>x+z</b>, on trouvera 90+10=100, ce qui est supérieur à 95. On essaie d'afficher des enregistrements qui n'existent pas ! Il faut donc toujours contrôler que <b>x+z</b> (ou le "nouveau" <b>x</b>) ne dépasse pas <b>t</b>, et si c'est le cas, revenir à sa valeur antérieure (qui était par définition correcte et inférieure à <b>t</b>): <span class="Code">if($x >= $t) { $x = $x - $z; }</span>.</p>
<p>
Dernier problème à surmonter: on veut masquer le bouton "précédent" lorsqu'on se trouve sur la première page, et le bouton "suivant" lorsqu'on se trouve sur la dernière page. Dans le premier cas, il faudra contrôler que <b>x - z</b> est positif: si c'est le cas, c'est que la page courante n'est pas la première. En effet, la première page contient les enregistrements dans l'intervalle [x=0,x+z]. Dans le second cas, il faudra contrôler que <b>x + z</b> est inférieur à <b>t</b>. En effet, la dernière page représente l'intervalle [x,(x+z)< t]. Le code pourrait ressembler à cela:<br />
<span class="Code"></p>
<ul style="list-style:none;">
<li />if($x > $z)
<li />&nbsp;&nbsp; echo 'Page précédente';
<li />if($x < $t)
<li />&nbsp;&nbsp; echo 'Page suivante';
</ul></p>
<p>
Un petit exemple:<br />
<span class="Code"></p>
<ul style="list-style:none;">
<li />//On récupère la dernière valeur de x
<li />$x = $_GET['debut'];
<li />
<li />//On fixe z et on détermine t
<li />&nbsp;&nbsp;$sql = "SELECT * FROM matable;";
<li />&nbsp;&nbsp;$req = mysql_query($sql);
<li />$t = mysql_num_rows($req);
<li />$z = 10;
<li />
<li />//On forme la requête SQL
<li />$sql = "SELECT * FROM matable ORDER BY id DESC LIMIT $x,$z;";
<li />
<li />//On prépare les nouvelles valeurs de x et y
<li />$y = $x - $z;
<li />if($y < 0)
<li />&nbsp;&nbsp;$y = 0;
<li />$x = $x + $z;
<li />
<li />//Doit-on afficher le bouton "précédent" ?
<li />if($x > $z)
<li />&nbsp;&nbsp;echo "&lt;a href="monfichier.php?debut=$y"&gt;Page précédente&lt;/a&gt;";
<li />
<li />//Doit-on afficher le bouton "suivant" ?
<li />if($x < $t)
<li />&nbsp;&nbsp;echo "&lt;a href="monfichier.php?debut=$x"&gt;Page précédente&lt;/a&gt;";
</ul>
<p></span></p>
<p>
Pour finir, quelques petites données supplémentaires:<br />
- Le premier enregistrement de la dernière page: <span class="Code">$l = $t - $z</span><br />
- Le nombre de pages: <span class="Code">ceil($t / $z)</span><br /> (ceil arrondit à l'entier supérieur)<br />
- La page courante est la Nième page, <span class="Code">n = ceil($x / $z)</span><br />
- La première page: <span class="Code">LIMIT 0,$z</span><br />
- La dernière page: <span class="Code">LIMIT $l,$z</span></p>
