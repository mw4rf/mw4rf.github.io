---
layout: post
status: publish
published: true
title: Dates, formulaires et MySQL
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "Le Web devient de plus en plus \"interactif\". Les utilisateurs sont de
  plus en plus souvent sollicités par des sites qui récupèrent les informations personnelles
  qu'ils veulent bien communiquer. Ces sites sont construits autour de deux axes:
  récupérer et traiter les données, stocker les données. Pour ce qui est de récupérer
  et traiter les données, le plus facile et le plus rapide à mettre en oeuvre reste
  la solution JavaScript et PHP. Pour le stockage des données, dans la plupart des
  cas c'est le moteur de base de données MySQL qui s'impose. Dans la plupart des cas,
  certaines données sont des dates: une date d'anniversaire fournie par l'utilisateur,
  une date d'inscription enregistrée au moment de la première connexion de l'utilisateur,
  etc. Or, MySQL utilise un format de dates qui déroute totalement les utilisateurs.
  Comment, dès lors, présenter aux utilisateurs un format auquel ils sont habitués
  et à MySQL le format exigé pour l'enregistrement des données dans une colonne de
  type DATE ?\r\n"
wordpress_id: 119
wordpress_url: http://www.valhalla.fr/index.php/2007/04/11/dates-formulaires-et-mysql/
date: '2007-04-11 18:48:45 +0200'
date_gmt: '2007-04-11 16:48:45 +0200'
categories:
- Web
- Featured
tags:
- Internet
- programmation
- Web
---
<p>Le Web devient de plus en plus "interactif". Les utilisateurs sont de plus en plus souvent sollicités par des sites qui récupèrent les informations personnelles qu'ils veulent bien communiquer. Ces sites sont construits autour de deux axes: récupérer et traiter les données, stocker les données. Pour ce qui est de récupérer et traiter les données, le plus facile et le plus rapide à mettre en oeuvre reste la solution JavaScript et PHP. Pour le stockage des données, dans la plupart des cas c'est le moteur de base de données MySQL qui s'impose. Dans la plupart des cas, certaines données sont des dates: une date d'anniversaire fournie par l'utilisateur, une date d'inscription enregistrée au moment de la première connexion de l'utilisateur, etc. Or, MySQL utilise un format de dates qui déroute totalement les utilisateurs. Comment, dès lors, présenter aux utilisateurs un format auquel ils sont habitués et à MySQL le format exigé pour l'enregistrement des données dans une colonne de type DATE ?<br />
<a id="more"></a><a id="more-119"></a></p>
<h2>1. Technologies et méthode employées</h2>
<p>Dans notre exemple, les données sont collectées depuis un formulaire HTML par un script PHP (par l'intermédiaire de la variable globale $_POST). Ces données sont au préalable vérifiées grâce à un script JavaScript. Une fois vérifiées et collectées, elle doivent être enregistrées dans la base de données MySQL, grâce à un script PHP. Finalement, les données collectées doivent pouvoir être extraites de la base de données MySQL pour être affichées à l'écran par un script PHP.</p>
<p>Plus précisément, nous allons récupérer une date au format MM/JJ/AAAA, contrôler que ce format est respecté, la transformer au format AAAA-MM-JJ, et l'insérer dans la base de données. Ensuite, nous récupérerons la date au format AAAA-MM-JJ pour la reconvertir dans un format plus lisible par l'utilisateur et l'afficher à l'écran.</p>
<h2>2. Contrôle du format de la date avec JavaScript.</h2>
<p>Il existe deux méthodes pour contrôler les données. La "bonne vieille" méthode et la méthode élégante utilisant les expressions régulières (Regex). Nous allons détailler la "bonne vieille" méthode et faire une allusion rapide aux expressions régulières, qui seront développées par la suite lors de leur utilisation dans le script PHP.</p>
<p><strong>a. Avec la "bonne vieille" méthode</strong></p>
<p>La première chose à faire est de définir, dans le code HTML, le nom ou l'identifiant du champ qui contiendra la date. Ici, il s'agit d'un champ de type <em>input</em> qui porte le nom de <em>date</em>.</p>
<p><span class="Code">&lt;input name="date" type="text"&gt;</span></p>
<p>La deuxième chose à faire est invoquer le script JavaScript de contrôle dans le formulaire, pour que les données soient contrôlées quand l'utilisateur clique sur le bouton de soumission. Dans notre exemple, le nom du formulaire est <em>soumettre</em> et il utilise la méthode <em>post</em>. Les données sont transmises au code PHP en invoquant le fichier <em>script.php</em>. Enfin, avant soumission des données, la méthode JavaScript <em>completude()</em> est appelée, avec pour argument le formulaire lui-même.</p>
<p><span class="Code">&lt;form name="soumettre" method="post" action="script.php" onSubmit="return completude(this);"&gt;</span></p>
<p>Il faut ensuite définir la fonction <em>completude()</em> dans le code JavaScript. Dans un premier temps, on crée la fonction et on récupère le contenu du champ <em>date</em> créé ci-avant.</p>
<div class="Code">
<strong>function completude(objet)<br />
{</strong></p>
<p>/* Ceci est le message qui sera affiché avec alert() si les données fournies ne conviennent pas. Pour l'instant, il est vide ca tout va bien */<br />
<strong>var msg = "";</strong></p>
<p>/* On récupère le contenu du champ date */<br />
<strong>var daten = objet.date.value;</strong>
</div>
<p>Une fois cela fait, il faut vérifier que l'information entrée dans le champ est bien une date, et que celle-ci est correctement formatée. Il faut pour cela procéder en 3 temps:<br />
- vérifier qu'il y a bien deux délimiteurs slash (/) (la date s'écrit au format JJ/MM/AAAA)<br />
- vérifier que le jour et le mois sont exprimés sur 2 chiffres et l'année sur 4 chiffres<br />
- vérifier que le jour est compris entre 01 et 31, le mois entre 01 et 12, et l'année, par exemple, supérieure à 1900.</p>
<p><em>Première étape.</em><br />
On brise la chaîne qui contient la date en plusieurs morceaux. Ces morceaux sont déterminés par le délimiteur spécifié, le slash dans notre exemple (/). Ce programme va parcourir la chaîne jusqu'à trouver le délimiteur, toutes les données avant le délimiteur formeront le premier membre (le jour). Puis, il va continuer à parcourir la chaîne juqu'à trouver un second délimiteur pour former le second membre (le mois). Finalement, ce qui restera sera le troisième membre (l'année).</p>
<div class="Code">
/* On brise la chaîne... */<br />
<strong>var temp = new Array();<br />
temp = daten.split('/');</strong></p>
<p>/*<br />
Le jour est désormais contenu dans la variable   temp[0].<br />
Le mois est désormais contenu dans la variable  temp[1].<br />
L'année est désormais contenue dans la variable temp[2].<br />
*/
</p></div>
<p>Si <em>temp[2]</em> est nul c'est qu'il n'y a pas d'année. Si <em>temp[1]</em> est nul, c'est qu'il n'y a pas de mois. Si <em>temp[0]</em> est nul c'est qu'il n'y a pas de jour. Dans tous les cas, la date n'est pas valable. Il faut donc qu'aucun des membres de <em>temp</em> ne soit nul.</p>
<div class="Code">
/* Si le séparateur de date n'est pas "/": afficher un message d'erreur */<br />
<strong>if(temp[0] == null || temp[1] == null || temp[2] == null)<br />
msg += "Veuillez formater la date au format indiqué: \n\nJJ/MM/AAAA \n\n JJ représente le jour sur 2 chiffres \n MM représente le mois sur 2 chiffres \n AAAA représente l'année sur 4 chiffres ";</strong></p>
<p>// Sinon, la date a le bon séparateur ("/")<br />
else<br />
{<br />
/* Pour améliorer la lisibilité du programme, on stocke le jour dans "j", le mois dans "m" et l'année dans "a". */<br />
<strong>j = temp[0];<br />
m = temp[1];<br />
a = temp[2];</strong>
</div>
<p><em>Deuxième étape</em><br />
Le test passé avec succès, on peut continuer. On va maintenant contrôler que chaque membre a le bon nombre de chiffres. Le jour et le mois sont exprimés sur 2 chiffres, l'année sur 4 chiffres.</p>
<div class="Code">
/* Contrôler que le jour, le mois et l'année sont bien à 2 et 4 chiffres. */<br />
<strong>if(j.length < 2)<br />
msg += "Format de date incorrect. \nVeuillez entrer le jour sur 2 chiffres.";<br />
if(m.length < 2)<br />
msg += "Format de date incorrect. \nVeuillez entrer le mois sur 2 chiffres.";<br />
if(a.length < 4)<br />
msg += "Format de date incorrect. \nVeuillez entrer l'année sur 4 chiffres.";</strong><br />
</strong></div>
<p><em>Troisième étape</em><br />
Il ne reste plus qu'à contrôler que le jour est bien compris entre 01 et 31, le mois entre 01 et 12 et l'année, dans notre exemple, postérieure à 1900.</p>
<div class="Code">
/* Contrôler que le jour est entre 01 et 31, le mois entre 01 et 12, l'année >1900 */<br />
<strong>if(!(j >= 01 && j < = 31))<br />
msg += "Format de date incorrect. \nLe jour doit être compris entre 01 et 31.";<br />
if(!(m >= 01 && m < = 12))<br />
msg += "Format de date incorrect. \nLe mois doit être compris entre 01 et 12.";<br />
if(!(a >= 1900 && a < = 2100))<br />
msg += "Format de date incorrect. \nL'année doit être comprise entre 1900 et 2100.";</strong><br />
</strong></div>
<p><em>Finition</em><br />
Comme on l'a dit plus haut, cette fonction est appelée lors de la soumission du formulaire. En réalité, elle est appelée juste avant que le formulaire soit soumis, et elle a une influence sur le processus. Si elle retourne TRUE, le formulaire sera soumis. Si elle retourne FALSE, le formulaire ne sera pas soumis. Il faut donc maintenant définir si elle doit retourner TRUE ou FALSE. </p>
<p>Au début de la fonction, nous avons créé la variable vide <em>msg</em>. Si elle est restée vide, c'est qu'il n'y a pas de message d'erreur et tout va bien: on renvoie TRUE. Si elle n'est plus vide c'est qu'elle contient un message d'erreur: il faudra renvoyer FALSE et afficher ce message.</p>
<div class="Code">
/* Envoyer le formulaire... */<br />
<strong>if (msg == "") return(true);</strong></p>
<p>/* Ne pas l'envoyer... et afficher le message d'erreur */<br />
<strong>else<br />
{<br />
alert(msg);<br />
return(false);<br />
}</strong>
</div>
<p><strong>b. Avec les expressions régulières</strong></p>
<p>Tout ceci peut également être fait beaucoup plus rapidement, en utilisant les expressions régulières.</p>
<div class="Code">
<strong>var daten = objet.date.value;<br />
var pattern="XXX"; /* v. plus bas, dans le code PHP, pour les expressions régulières */<br />
var bool;<br />
bool = pattern.test(daten);	</p>
<p>if(!bool)<br />
msg += "Format de date incorrect....";</strong>
</div>
<h2>3. Formater la date pour MySQL</h2>
<p><strong>a. Récupérer les données</strong></p>
<p>Avant de formater la date, il faut la récupérer. Pour cela, on utilisera la variable $_POST. Pour plus d'informations à ce sujet, v. <a href="http://www.valhalla.fr/index.php/2005/09/25/construire-une-base-de-donnees-simple-avec-php-et-mysql/">Construire une base de données simple avec PHP et MySQL</a>. Une fois la date récupérer, on la passe à la méthode <em>formater()</em>, détaillée plus bas.</p>
<p><span class="Code"><br />
<strong>$date = $_POST["date"];<br />
formater($date,true);</strong><br />
</span></p>
<p><strong>b. La fonction <em>formater()</em>: principe</strong></p>
<p>La fonction formater() a pour but de transformer la date du format JJ/MM/AAAA, lisible par l'utilisateur, vers le format AAAA-MM-JJ, exploitable par MySQL. Elle admet deux arguments. Le premier argument est la date à formater (une chaîne de caractères). Le second argument est une variable booléene, qui prend les valeurs TRUE ou FALSE. Cela nous permettra plus tard d'opérer la conversion dans le sens inverse (AAAA-MM-JJ vers JJ/MM/AAAA): selon que la valeur est TRUE ou FALSE, la conversion s'effectue dans un sens ou dans l'autre.</p>
<p><strong>b. La fonction <em>formater()</em>: implémentation</strong></p>
<p>Voici notre fonction:</p>
<div class="Code">
function formater($date,$vers_mysql)<br />
{</p>
<p>// JJ/MM/AAAA => AAAA-MM-JJ<br />
<strong>if($vers_mysql)<br />
{<br />
$pattern     = "`([0-9]{2})/([0-9]{2})/([0-9]{4})`";<br />
$replacement = "$3-$2-$1";<br />
}</strong></p>
<p>// AAAA-MM-JJ => JJ/MM/AAAA<br />
<strong>else<br />
{<br />
$pattern     = "`([0-9]{4})-([0-9]{2})-([0-9]{2})`";<br />
$replacement = "$3/$2/$1";<br />
}</strong></p>
<p><strong>return preg_replace($pattern, $replacement, $date);<br />
}</strong>
</div>
<p>Il convient d'expliquer cette fonction. Trois choses sont remarquables: la fonction <em>preg_replace()</em>, la variable <em>$pattern</em> et la variable <em>$replacement</em>.</p>
<p>La fonction <em>preg_replace()</em> telle qu'utilisée ici analyse <em>$date</em> au regard de <em>$pattern</em>, qui décrit la structure de la date, puis construit et renvoie une nouvelle chaîne, avec les éléments de <em>$date</em>, formatée selon les spécifications de <em>$replacement</em>.</p>
<p>La variable <em>$pattern</em> est une expression régulière qui se décompose ainsi: un bloc A, un slash, un bloc B, un slash, un bloc C: A/B/C. Le bloc A est le suivant: <em>([0-9]{2})</em>. Cela signifie <em>deux chiffres compris entre 0 et 9</em>. Le bloc B est identique au bloc A. Le bloc C est légèrement différent, puisqu'il correspond à l'année: <em>([0-9]{4})</em> signifie <em>quatre chiffres compris entre 0 et 9</em>.</p>
<p>Autrement dit, le programme comprend l'expression <em>([0-9]{2})/([0-9]{2})/([0-9]{4})</em> comme un être humain comprendrait la phrase suivante: <em>un élément de 2 chiffres entre 0 et 9, une barre oblique, un élément de 2 chiffres entre 0 et 9, une barre oblique, un élément de 4 chiffres entre 0 et 9</em>.</p>
<p>On l'aura compris, [0-9] signifie <em>entre 0 et 9</em> et {2} signifie <em>deux chiffres</em>. Les parenthèses servent à délimiter les blocs (A, B et C dont on parlait plus haut). Notre but final est de changer l'ordre de ces blocs: de A/B/C vers C-B-A.</p>
<p>La variable <em>$replacement</em> définit le nouveau placement des blocs: <em>$3-$2-$1</em>. La parenté de cette expression réelle avec l'exemple théorique C-B-A est évident. Cette expression demande au programme de placer le troisième bloc, puis un tiret, puis le deuxième bloc, puis un tiret, et enfin le premier bloc.</p>
<p>Voilà comment passer de JJ/MM/AAAA vers AAAA-MM-JJ. Pour effectuer l'opération inverse, le raisonnement est le même, mais les expressions régulières changent un peu (v. le code ci-dessus).</p>
<h2>4. Insérer la date dans la base de données MySQL et l'en extraire</h2>
<p>Pour insérer la date dans MySQL, il suffira d'une instruction SQL basique: INSERT INTO... Pour plus de précisions, v. <a href="http://www.valhalla.fr/index.php/2005/09/25/construire-une-base-de-donnees-simple-avec-php-et-mysql/">Construire une base de données simple avec PHP et MySQL</a>.</p>
<p>Pour extraire la date et l'afficher à l'écran, il suffira de réutiliser la fonction <em>formater()</em>, en réglant cette fois la variable booléenne sur FALSE.</p>
<p><span class="Code"><br />
<strong><br />
while($data = mysql_fetch_assoc($sql))<br />
$date = formater($data["date"],false);<br />
...<br />
echo "La date est: $date";</strong><br />
</span></p>
<p><strong>Pour aller plus loin</strong></p>
<p>Nous avons utilisé ici le format européen de dates: JJ/MM/AAAA. Mais aux Etats-Unis, c'est le format américain qui est utilisé: MM/JJ/AAAA. Une solution bien pratique serait de détecter la langue du visiteur pour écrire la date dans le format auquel il est habitué.</p>
<p>Pour déterminer la langue du visiteur, on peut dans la majorité des cas se fier à la langue de son navigateur. Cette dernière s'obtient grâce à une variable globale PHP: <span class="Code">$_SERVER["HTTP_ACCEPT_LANGUAGE"]</span>. Cette variable contiendra en principe un tableau indiquant quelles langues sont gérées par le navigateur. La première, exprimée en 2 lettres, est la langue principale. Il s'agit de "fr" pour le français, de "es" pour l'espagnol et de "en" pour l'anglais.</p>
<div class="Code">
/* $langue est "fr" pour le français, "en" pour l'anglais */<br />
<strong>$langue = substr($_SERVER["HTTP_ACCEPT_LANGUAGE"], 0, 2);</strong>
</div>
<p>On peut ensuite rajouter un argument pour la langue à notre fonction <strong>formater()</strong>:</p>
<div class="Code">
function formater($date,$vers_mysql,$langue)<br />
{<br />
if($langue == "en")<br />
{<br />
if($vers_mysql)<br />
// regex 1 - format américain<br />
else<br />
//regex 2 - format américain<br />
{<br />
else<br />
{<br />
if($vers_mysql)<br />
// regex 1 - format européen<br />
else<br />
//regex 2 - format européen<br />
}<br />
}
</div>
