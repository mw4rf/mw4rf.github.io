---
layout: post
status: publish
published: true
title: Installer et configurer un environnement de développement PHP/MySQL sur Mac
  OS X
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "<p>\r\nCet article est destiné à tout néophyte qui désire débuter dans la
  programmation Web avec le langage PHP et le serveur de base de données MySQL. Il
  vise à expliquer, pas à pas, la démarche pour installer et configurer \"proprement\"
  tous les outils nécessaires sur un ordinateur sous Mac OS X (Panther / Tiger).\r\n</p>\r\n\r\n"
wordpress_id: 53
wordpress_url: http://blog.gfblog.com/?p=53
date: '2005-10-21 13:25:31 +0200'
date_gmt: '2005-10-21 11:25:31 +0200'
categories:
- Internet
tags:
- Mac
- Internet
- programmation
- Web
- serveur
- Apple
- bases de données
permalink:  /2005/10/21/installer-et-configurer-un-environnement-de-developpement-phpmysql-sur-mac-os-x/
---
<p>
Cet article est destiné à tout néophyte qui désire débuter dans la programmation Web avec le langage PHP et le serveur de base de données MySQL. Il vise à expliquer, pas à pas, la démarche pour installer et configurer "proprement" tous les outils nécessaires sur un ordinateur sous Mac OS X (Panther / Tiger).</p>
<p><a id="more"></a><a id="more-53"></a></p>
<p><strong>### Mise à jour, 16 mars 2010 ###</strong> Il est désormais beaucoup plus facile d'installer un environnement de développement PHP/MySQL sur Mac, grâce au logiciel <a href="http://www.mamp.info/en/index.html">MAMP</a>, qui fonctionne comme une application Mac traditionnelle (à télécharger à l'adresse suivante : <a href="http://www.mamp.info/en/index.html">www.mamp.info</a>). Alternativement, vous pouvez utiliser <a href="http://www.apachefriends.org/fr/xampp-macosx.html">XAMPP</a> qui, sans être aussi aisé d'installation que MAMP, reste plus simple qu'une installation manuelle d'Apache et de MySQL.</p>
<p><strong>### Mise à jour, 17 novembre 2005 ###</strong> Vous pouvez télécharger MySQL 5 depuis <a href="http://www.mysql.com">www.mysql.com</a> et suivre ce tutoriel, il n'y a qu'une seule étape supplémentaire, qui est détaillée à la fin de ce document.</p>
<h1>Qu'allons nous faire ?</h1>
<p>
Nous allons procéder par étapes:</p>
<ul>
<li /><b>Etape #1 - <i>Rassembler les éléments nécessaires</i></b>: Mac OS X est installé par défaut avec Apache et PHP non activés. Par contre, il n'a pas MySQL ni aucun utilitaire pour manipuler les bases de données MySQL de façon conviviale (car il est toujours possible de le faire depuis le terminal). Il nous faudra donc télécharger et installer le serveur MySQL et PHPMyAdmin.<br /></p>
<li /><b>Etape #2 - <i>Activer le serveur Web Apache</i></b>: Mac OS X est fourni avec le serveur Web open-source Apache, certainement le plus utilisé dans le monde, et à mon humble avis le meilleur. Il n'est cependant pas activé par défaut, mais son activation est facile et rapide.<br /></p>
<li /><b>Etape #3 - <i>Activer le support de PHP sous Apache</i></b>: Pour utiliser le PHP, il faut configurer Apache. Par défaut, le serveur Apache installé dans Mac OS X n'est pas configuré pour travailler avec PHP. Il contient néanmoins tous les éléments nécessaire pour le faire, et il nous suffira d'activer le support de PHP.<br /></p>
<li /><b>Etape #4 - <i>Installer et configurer MySQL</i></b>: Après avoir téléchargé MySQL, il restera à l'installer et le configurer. Cette étape, bien que plus compliquée que les précédents, ne présente néanmoins aucune difficulté insurmontable.<br /></p>
<li /><b>Etape #5 - <i>Utiliser son environnement de développement</i></b>: Une fois que tout est installé et paramétré, il reste à savoir <i>comment faire pour commencer à travailler</i>: où placer les fichiers, et d'ailleurs quels fichiers, comment les créer et que mettre dedans.<br /></p>
<li /><b>Bonus - <i>Paramétrer Dreamweaver pour utiliser PHP et MySQL</i></b>: Bien que, à mon sens, le développement sous Dreamweaver ne présente pas de gros avantages par rapport à un développement BBEdit/Navigateur, je pense que bon nombre de personnes seront intéressées de savoir comment le paramétrer pour l'utiliser avec la configuration issue des explications de cet article.
</ul></p>
<p>
Vous pouvez vous reporter à <a href="{% post_url /2005/2005-09-25-construire-une-base-de-donnees-simple-avec-php-et-mysql %}">cet article</a> pour la théorie concernant le fonctionnement général et le rôle d'Apache, PHP et MySQL.</p>
<h1>Etape #1 - Rassembler les éléments nécessaires</h1>
<p>Voilà ce qu'il nous faut:</p>
<ul>
<li />Un serveur HTTP (Apache 1.3.33 conseillé). <i>Fourni avec Mac OS X</i>
<li />PHP (version 4.3.11 minimum). <i>Fourni avec Mac OS X</i>
<li />MySQL (version 4.0.20 minimum). <a href="http://www.mysql.fr/downloads/mysql/">A télécharger ici</a>
<li />PhpMyAdmin (version 2.x.x conseillée). <a href="http://www.phpmyadmin.net/home_page/downloads.php">A télécharger ici</a>
</ul>
<p>NB : les versions fournies par Apple dépendent de votre système. Sous Panther et Tiger, Apple libre Apache 1 avec PHP 4. Sous Leopard et Snow Leopard, Apple livre Apache 2 avec PHP 5. Cela ne change pas fondamentalement ce qui suit. Concernant MySQL, préférez la version 5. Dans tous les cas, préférez la version <em>stable</em> la plus récente.</p>
<p>
Note concernant MySQL:<br />
1) Le lien fourni ci-dessus ne propose que des versions pour Panther (10.3) à l'heure où j'écris ces lignes. Cependant, je suis sous Tiger (10.4), j'utilise une version de MySQL obtenue depuis cette page, et cela fonctionne parfaitement.<br />
2) Si vous décidez d'installer une version de MySQL obtenue à un autre endroit sachez que vous aurez probablement à configurer des options supplémentaires manuellement. Ces opérations de configuration ne seront pas traitées ici.</p>
<h1>Etape #2 - Activer le serveur Web Apache</h1>
<p>
Le serveur Apache est intégré à Mac OS X. Il vous suffit de l'activer. Pour cela, procédez ainsi:</p>
<ul>
<li />Ouvrez les <b>Préférences système</b> dans le <b>menu Pomme</b>.
<li />Cliquez sur l'icône <b>Partage</b>. <i>(Image 1)</i>
<li />Sous l'onglet <b>Services</b>, cochez la case à gauche de <b>Partage Web personnel</b>.  <i>(Image 2)</i>
</ul>
<p><center><br />
<i>Image 1</i><br />
<img alt="Image 1" src="/public/posts/2005-10-21-phpmysql/phpmysql1.png" /><br />
</center></p>
<p><center><br />
<i>Image 2</i><br />
<img alt="Image 2" src="/public/posts/2005-10-21-phpmysql/phpmysql2.png" /><br />
</center></p>
<h1>Etape #3 - Activer le support de PHP sous Apache</h1>
<p>
Pour activer le support de PHP sous Mac OS X, il y a plusieurs méthodes. Je vais ici utiliser la plus simple. Cette méthode consiste à écrire des lignes qui vous paraîtront totalement incompréhensibles, dans le <b>Terminal</b> situé dans <i>Applications/Utilitaires</i>. Malgré tout ce que vous avez pu lire sur le Terminal, je vous assure que ce que vous écrirez ne constitue en rien un danger pour votre ordinateur. Tout se passera bien dès lors que vous écrivez exactement les lignes présentées ci-dessous.</p>
<h2>Procédure pour Leopard et Snow Leopard</h2>
<blockquote>
<p>Ouvrez le <b>Terminal</b> dans le dossiers <i>Applications/Utilitaires</i> de votre ordinateur.</p>
<p>Tapez:<br />
<br />
<span class="Code">cd /etc/apache2/</span></p>
<p>Appuyez sur la touche <b>Entrée</b>, puis tapez:<br />
<br />
<span class="Code">sudo nano httpd.conf</span></p>
<p>Tapez votre mot de passe lorsqu'il vous est demandé. Le fichier httpd.conf sera ouvert dans un éditeur de texte (appelé "nano"), à l'intérieur de la fenêtre du terminal. Déplacez vous dans le fichier avec les touches fléchées (haut, bas, droite, gauche) du clavier. (Alternativement, si vous avez TextMate, remplacez <em>nano</em> par <em>mate</em>).</p>
<p>Recherchez la ligne :<br />
<br />
<span class="Code">#LoadModule php5_module        libexec/apache2/libphp5.so</span></p>
<p>et supprimez le symbole # (dièse) au début de cette ligne :</p>
<p><span class="Code">LoadModule php5_module        libexec/apache2/libphp5.so</span></p>
<p>Enregistrez le fichier en appuyant sur <strong>CTRL + O</strong> puis sur <strong>Entrée</strong>. Quittez nano en appuyant sur <strong>CTRL + X</strong>.</p>
<p>Dans le terminal, tapez :<br />
<br />
<span class="Code">sudo apachectl graceful</span><br />
<br />
puis appuyez sur la touche <b>Entrée</b>, et constatez que le terminal a répondu <i>/usr/sbin/apachectl graceful: httpd gracefully restarted</i>. Si c'est le cas, vous pouvez fermer le Terminal, tout s'est bien passé.</p>
<p>&nbsp;</p>
<p><strong>Si vous avez un message d'erreur dans phpinfo()</strong> (sinon, ignorez ceci) :<br />
<br />
Créez le fichier <em>php.ini</em> en tapant les commandes suivantes :<br />
<span class="Code"><br />
sudo cp /etc/php.ini.default /etc/php.ini<br />
<br />sudo chmod 666 /etc/php.ini<br />
</span></p>
<p>Éditez le fichier <em>php.ini</em> avec nano, TextMate ou un autre éditeur :<br />
<br />
<span class="Code">sudo nano /etc/php.ini<span></p>
<p>Recherchez la ligne :<br />
<br />
<span class="Code">;date.timezone =</span></p>
<p>et modifiez-la en indiquant votre <em>timezone</em> (<a href="http://php.net/manual/en/timezones.php">liste disponible ici</a>) :<br />
<br />
<span class="Code">date.timezone = Europe/Paris</span></p>
<p>Relancez ensuite Apache (<em>sudo apachectl graceful</em>).
</p></blockquote>
<h2>Procédure pour Panther et Tiger</h2>
<blockquote>
<p>
Ce que vous devrez écrire est ici présenté <span class="Code">comme ça</span>. Pour obtenir le caractère <span class="Code">|</span>, tapez: Maj+Alt+L. Le caractère <span class="Code">"</span> (guillemets) s'obtient avec la touche 3 de votre clavier, il ne s'agit <b>pas</b> de deux fois l'apostrophe <span class="Code">'</span> de la touche 4.</p>
<p>Ouvrez le <b>Terminal</b> dans le dossiers <i>Applications/Utilitaires</i> de votre ordinateur.</p>
<p>Tapez:<br />
<br />
<span class="Code">cd /etc/httpd/</span></p>
<p>Appuyez sur la touche <b>Entrée</b>, puis tapez:<br />
<br />
<span class="Code">sudo apxs -e -a -n php4 libexec/httpd/libphp4.so</span><br />
<br />
Appuyez sur la touche <b>Entrée</b>, un message défilera à l'écran. Vous verrez, à la fin du message, "Password:". Entrez votre <b>mot de passe</b> (il ne s'affichera pas à l'écran, même pas sous la forme d'astérisque, mais il sera bien pris en compte), et appuyez de nouveau sur <b>Entrée</b>.<br />
<br />
Le message suivant devrait apparaître:<br />
<i><br />
<indent><br />
[activating module `php4' in /private/etc/httpd/httpd.conf]<br />
cp /private/etc/httpd/httpd.conf /private/etc/httpd/httpd.conf.bak<br />
cp /private/etc/httpd/httpd.conf.new /private/etc/httpd/httpd.conf<br />
rm /private/etc/httpd/httpd.conf.new<br />
</indent><br />
</i><br />
Tapez:<br />
<br />
<span class="Code">echo 'echo "AddType application/x-httpd-php .php" >> /etc/httpd/httpd.conf' | sudo sh -s</span></p>
<p>Appuyez sur la touche <b>Entrée</b>, puis tapez:<br />
<br />
<span class="Code">sudo apachectl graceful</span><br />
<br />
Appuyez sur la touche <b>Entrée</b>, et constatez que le terminal a répondu <i>/usr/sbin/apachectl graceful: httpd gracefully restarted</i>. Si c'est le cas, vous pouvez fermer le Terminal.</p>
</blockquote>
<h1>Etape #4 - Installer et configurer MySQL</h1>
<p>
Vous avez téléchargé MySQL, vous devez maintenant l'installer.</p>
<h2>Procédure pour Leopard et Snow Leopard</h2>
<blockquote><p>
Sous Leopard et Snow Leopard, l'installation de MySQL est très simple. Il suffit, basiquement, de télécharger l'image disque, de la monter, et d'installer MySQL comme n'importe quel autre logiciel (double-cliquer sur l'icône et suivre les instructions à l'écran).</p>
<p>En option, il est possible d'installer un panneau pour les préférences système (qui se trouve dans l'image disque téléchargée : <em>MySQL.prefPane</em>), en double-cliquant sur son icône. Ce panneau permet de démarrer et d'arrêter MySQL depuis les préférences système, sans utiliser le Terminal.</p>
<p>Un autre fichier, également présent dans l'image disque téléchargée (<em>MySQLStartupItem.pkg</em>) permet de paramétrer automatiquement MySQL pour démarrer avec le système (double-cliquer pour installer).</p>
<p>Optionnel : Pour avoir un accès direct à la commande <em>mysql</em> dans le terminal, il faut indiquer au système le chemin (path) de l'exécutable. Pour ce faire, ouvrez le Terminal (dans /Applications/Utilitaires/) et tapez :<br />
<br />
<span class="Code">nano ~/.profile</span></p>
<p>(Alternativement, si vous avez TextMate, remplacez <em>nano</em> par <em>mate</em>) Recopiez la ligne suivante :<br />
<br />
<span class="Code">export PATH="/usr/local/bin:/usr/local/sbin:/usr/local/mysql/bin:$PATH"</span></p>
<p>Enregistrez le fichier en appuyant sur <strong>CTRL + O</strong> puis sur <strong>Entrée</strong>. Quittez nano en appuyant sur <strong>CTRL + X</strong>. Tapez ensuite la commande suivante :<br />
<span class="Code">source ~/.profile</span></p>
<p>&nbsp;</p>
<p><strong>En cas de problème d'accès à MySQL depuis des scripts PHP</strong> (sinon, ignorez ceci)<br />
<br />
Éditez le fichier <i>php.ini</i> (voir plus haut pour la procédure), et assurez-vous de la présence des lignes suivantes (le cas échéant, remplacez les valeurs du fichier par les valeurs données ici) :<br />
<span class="Code"><br />
pdo_mysql.default_socket=/tmp/mysql.sock<br />
<br />mysql.default_socket = /tmp/mysql.sock<br />
<br />mysqli.default_socket = /tmp/mysql.sock<br />
</span>
</p></blockquote>
<h2>Procédure pour Panther et Tiger</h2>
<blockquote>
<p>
Double-cliquez sur le fichier <b>MySQL.pkg</b> dans l'image disque de MySQL (qui, elle, se trouve sur votre bureau). Suivez ensuite les étapes en cliquant sur "Suivant". Si votre mot de passe est demandé, entrez le. S'il vous est demandé de redémarrer l'ordinateur, faites le aussi. Cette installation ne devrait présenter aucun problème: elle est conçue avec l'Installer.app de Apple et fonctionne exactement comme pour tout autre logiciel.</p>
<p>
Une fois l'installation de MySQL terminée, double-cliquez sur le fichier <b>MySQL.prefPane</b> qui se trouve, lui aussi, dans l'image disque téléchargée. Il vous sera demandé si vous voulez installer ce panneau de préférences pour tous les utilisateurs ou seulement pour vous. Je vous conseille de choisir de ne l'installer que pour vous.<br />
<br />
<i>Si double-cliquer sur ce fichier ne produit aucun résultat</i>, copiez le simplement dans /Bibliothèque/PreferencePanes ou /Utilisateurs/notre_nom/Bibliothèque/PreferencePanes.</p>
<p>
Rendez-vous ensuite dans les <b>Préférences système</b> dans le <b>menu Pomme</b>.<br />
Cliquez sur l'icône <b>MySQL</b> <i>(Image 3)</i> pour afficher le panneau de préférences correspondant à MySQL <i>(Image 4)</i>.</p>
<p><center><br />
<i>Image 3</i><br />
<img alt="Image 3" src="/public/posts/2005-10-21-phpmysql/phpmysql3.png" /><br />
</center></p>
<p><center><br />
<i>Image 4</i><br />
<img alt="Image 4" src="/public/posts/2005-10-21-phpmysql/phpmysql4.png" /><br />
</center></p>
<p>
Dans le panneau de préférences de MySQL <i>(Image 4, ci-dessus)</i>,</p>
<ul>
<li />Initialisez le serveur en cliquant sur <b>Initialize</b>. Entre votre mot de passe s'il vous est demandé.
<li />Configurez le serveur pour être lancé avec le système en cochant la case <b>Start MySQL At Boot</b>. Entre votre mot de passe Mac OS X s'il vous est demandé.
<li />Démarrez le serveur en cliquant sur <b>Start</b>. Entre votre mot de passe Mac OS X s'il vous est demandé.
<li />Spécifiez un mot de passe administrateur en cliquant sur <b>Set root password</b>. Pour la suite de cet article, nous supposerons que ce mot de passe est "motdepasse".
</ul>
<p>Note 1: il se peut que vous deviez échanger l'ordre des étapes 2 et 4, si un des boutons est <i>grisé</i>. Cela importe peu.</p>
<p>
Note 2: Lorsque vous cliquez sur <b>Initialize</b>, une fenêtre de terminal devrait s'ouvrir (elle se ferme normalement tout seule, mais dans le cas contraire vous pourrez la fermer dès que vous verrez [Opération terminée]) et afficher les informations suivantes:<br />
<i><br />
<indent><br />
/Library/MySQL/bin/mysql_init.command; exit<br />
Preparing db table<br />
Preparing host table<br />
Preparing user table<br />
Preparing func table<br />
Preparing tables_priv table<br />
Preparing columns_priv table<br />
Installing all prepared tables<br />
051119 20:16:08 Warning: Setting lower_case_table_names=2 because file system for /Library/MySQL/var/ is case insensitive<br />
051119 20:16:08 /Library/MySQL/libexec/mysqld: Shutdown Complete </p>
<p>To start mysqld at boot time you have to copy support-files/mysql.server<br />
to the right place for your system</p>
<p>PLEASE REMEMBER TO SET A PASSWORD FOR THE MySQL root USER !<br />
To do so, start the server, then issue the following commands:<br />
/Library/MySQL/bin/mysqladmin -u root password 'new-password'<br />
/Library/MySQL/bin/mysqladmin -u root -h PBG4.local password 'new-password'<br />
See the manual for more instructions.</p>
<p>You can start the MySQL daemon with:<br />
cd /Library/MySQL ; /Library/MySQL/bin/mysqld_safe &</p>
<p>You can test the MySQL daemon with the benchmarks in the 'sql-bench' directory:<br />
cd sql-bench ; perl run-all-tests</p>
<p>Please report any problems with the /Library/MySQL/bin/mysqlbug script!</p>
<p>The latest information about MySQL is available on the web at<br />
http://www.mysql.com<br />
Support MySQL by buying support/licenses at https://order.mysql.com</p>
<p>Fixing permissions...<br />
logout<br />
[Opération terminée]<br />
</indent><br />
</i></p>
<p>
<b>IMPORTANT</b> - Note 3: vous pouvez redémarrer votre ordinateur après cette installation. Ce n'est pas obligatoire, mais je vous le conseille. En tout état de cause, à la fin du prochain démarrage, Mac OS X vous affichera un message vous indiquant que les autorisations ont été modifiées pour l'élément mysql, et vous demandant si vous faites confiance à cette modification et si vous voulez la garder. Bien entendu, conservez la modification, elle est tout à fait normale. Ce message ne s'affichera plus lors des prochains démarrages.</p>
</blockquote>
<p>
MySQL est installé et lancé. Il vous reste maintenant à le configurer pour une première utilisation. Pour cela, il faut créer une base de données. Pour créer une base de données de manière simple et intuitive, nous allons utiliser le logiciel PHPMyAdmin. Et avant de pouvoir l'utiliser, nous devons l'installer.</p>
<p>
Placez les fichiers contenus dans l'archive de PHPMyAdmin que nous avons téléchargée au début de cet article à l'emplacement suivant:<br />
<br />
<b>Macintosh HD/Utilisateurs/votre_nom/Sites/phpmyadmin</b></p>
<p>
Ouvrez avec un éditeur de texte brut (c'est-à-dire, à éviter Word, OpenOffice ou des logiciels de ce genre) le fichier <b>config.inc.php</b> situé  dans le dossier de PHPMyAdmin:<br />
<br />
<b>Macintosh HD/Utilisateurs/votre_nom/Sites/phpmyadmin/config.inc.php</b></p>
<p>
Vers le début du document, renseignez les informations de configuration comme ceci:<br />
<br />
<span class="Code"><br />
$cfg['Servers'][$i]['host']          = 'localhost';<br />
<br />
$cfg['Servers'][$i]['user']          = 'root';<br />
<br />
$cfg['Servers'][$i]['password']      = 'motdepasse';<br />
</span><br />
<br />
(Remplacez <span class="Code">motdepasse</span> par votre mot de passe MySQL, celui défini au début de cette étape.)</p>
<p>
Ouvrez ensuite votre navigateur internet, et rendez-vous à l'adresse suivante:<br />
<br />
<b>http://localhost/~votre_nom/phpmyadmin/</b><br />
<br />
Le caractère <b>~</b> s'obtient avec la combinaison de touches <b>Alt+n</b>.</p>
<p>
C'est en quelque sorte le premier moment de vérité. Si cela ne fonctionne pas, c'est qu'il y a eu un problème dans l'une des étapes précédentes:</p>
<ul>
<li />Si votre navigateur vous dit que l'hôte est introuvable, Apache n'est pas démarré.
<li />Si au lieu de voir une belle page bien lisible, vous voyez du <i>code source</i>, c'est que PHP n'est pas activé.
<li />Si un message d'erreur vous dit <i>Le serveur ne répond pas</i>, c'est que MySQL est mal installé ou n'est pas démarré.
<li />Sinon, ça fonctionne. <b>Bravo !</b>
</ul></p>
<p>
Sur la page d'accueil de PHPMyAdmin, trouvez le champ de texte vous permettant d'entrer le nom d'une base, et entrez un nom. Cliquez ensuite sur le bouton <b>Créer</b>. <i>(Image 5)</i></p>
<p><center><br />
<i>Image 5</i><br />
<img alt="Image 5" src="http://blog.gfblog.com/images/phpmysql/phpmysql5.png" /><br />
</center></p>
<p>
<b>C'est terminé !</b></p>
<h1>Etape #5 - Utiliser son environnement de développement</h1>
<p>
Vous avez installé et configuré votre environnement de développement PHP/MySQL. Il vous reste maintenant à apprendre à l'utiliser. Bien que cela ne rentre pas directement dans l'objet de cet article, je tiens à vous donner quelques indications sur la manière de procéder.</p>
<p>
<u>Emplacement des fichiers</u><br />
<br />
Les fichiers <i>doivent</i> se situer dans le dossier <b>Macintosh HD/Utilisateurs/votre_nom/Sites/</b> ou dans n'importe lequel de ses sous-dossiers.</p>
<p>
<u>Ecrire du PHP</u><br />
<br />
Pour écrire du PHP, vous devrez utiliser un éditeur de texte brut, comme <a href="http://www.barebones.com/products/bbedit/index.shtml">BBEdit</a> ou <a href="http://www.codingmonkeys.de/subethaedit/">SubEthaEdit</a> (ce dernier est gratuit pour un usage non commercial). Vous devrez enregistrer vos fichiers dans un encodage approprié (je vous conseille très vivement <b>ISO-8859-1</b>. Lisez <a href="http://blog.gfblog.com/index.php/2005/10/06/un-probleme-dencodage-peut-etre/">cet article</a> pour plus de précisions au sujet des encodages.</p>
<p>
<u>Configurer les logiciels PHP fonctionnant avec MySQL</u><br />
<br />
Les logiciels développés en PHP et fonctionnant avec MySQL auront besoin d'un certain nombre d'informations sur contre configuration MySQL. Vous devrez donc les paramétrer dans un fichier habituellement appelé <i>config.inc.php</i>, et indiquer l'adresse du serveur (<i>localhost</i>), le nom d'utilisateur (<i>root</i>), le mot de passe associé à cet utilisateur (<i>votre mot de passe MySQL</i>) et le nom de la base de donnée à utiliser (<i>n'importe quelle base que vous avez créé avec PHPMyAdmin, ici: mabase</i>).</p>
<p>
<u>Apprendre à utiliser une base de données PHP avec MySQL</u><br />
<br />
Vous pouvez déjà commencer par lire <a href="http://blog.gfblog.com/index.php/2005/09/25/construire-une-base-de-donnees-simple-avec-php-et-mysql/"> cet article</a> pour vous faire une idée de ce qu'est une base de données MySQL. Pour débuter avec PHP, je vous conseille le site <a href="http://www.phpdebutant.org/">PHP débutants</a>.</p>
<h1>Bonus - Paramétrer Dreamweaver pour utiliser PHP et MySQL</h1>
<p>
Dans le menu <b>Sites</b>, cliquez sur <b>Nouveau Site</b>. Un assistant se lancera. Il vous suffira de le suivre, étape par étape, en répondant aux questions qu'il vous pose. Ci-dessous, des captures d'écran des étapes importantes dans la configuration de notre environnement PHP/MySQL.</p>
<p><center><br />
<i>Image 6</i><br />
<img alt="Image 6" src="http://blog.gfblog.com/images/phpmysql/dw0.png" /><br />
</center></p>
<p><center><br />
<i>Image 7</i><br />
<img alt="Image 7" src="http://blog.gfblog.com/images/phpmysql/dw1.png" /><br />
</center></p>
<p><center><br />
<i>Image 8</i><br />
<img alt="Image 8" src="http://blog.gfblog.com/images/phpmysql/dw2.png" /><br />
</center></p>
<p>
Une fois le paramatrage terminé dans l'assistant, ouvrez un fichier PHP en mode <b>Création</b> et allez dans le menu <b>Affichage</b> > <b>LiveData</b>, ou appuyez sur Pomme+Maj+R, ou cliquez sur le bouton LiveData entouré de rouge dans l'image ci-dessous:</p>
<p><center><br />
<i>Image 9</i><br />
<img alt="Image 10" src="http://blog.gfblog.com/images/phpmysql/dw3.png" /><br />
</center></p>
<h1>Bonus 2 - Installer MySQL 5</h1>
<p>
Vous pouvez télécharger MySQL 5 depuis <a href="http://www.mysql.com">www.mysql.com</a>. Vous devrez ensuite installer le logiciel comme n'importe quel autre logiciel Mac, en double-cliquant sur le fichier de l'installer dans l'image disque téléchargée, puis en suivant les étapes.</p>
<p>
Pour lancer MySQL, il faudra taper depuis le Terminal:</p>
<ol>
<li /><span class="Code">cd /usr/local/mysql</span>
<li /><span class="Code">sudo echo</span> (et le mot de passe administrateur quand il sera demandé)
<li /><span class="Code">sudo ./bin/mysqld_safe &</span> (et le mot de passe administrateur quand il sera demandé)
</ol></p>
<p>
Vous pouvez éviter de taper ces lignes en installant le panneau de préférences (en double-cliquant sur son icône dans l'image disque téléchargée). Ce panneau de préférences fonctionne comme celui détaillé au début de ce tutoriel.</p>
<p>
Enfin, pour lancer le serveur MySQL avec le système, il suffit d'installer le paquetage mysql-startupitem.pkg.tar.gz fourni avec l'image disque téléchargée.</p>
permalink:  /2005/10/21/installer-et-configurer-un-environnement-de-developpement-phpmysql-sur-mac-os-x/
<p>----------</p>
<p>Après l'installation, il faut impérativement créer les tables d'utilisateurs manuellement, sous peine de se voir répondre par le serveur 'Access denied for user 'root'@'localhost' (using password: NO)'</p>
<p>Pour créer les tables:<br />
- Se placer dans le répertoire d'installation de MySQL (par défaut: /usr/local/mysql)<br />
- Se changer d'utilisateur pour passer en root ("su") ou utiliser éventuellement ("sudo")<br />
- Lancer le script: <span class="Code">./scripts/mysql_install_db</span></p>
<p>Pour changer le mot de passe:<br />
- méthode shell: <span class="Code">mysqladmin -u root password XXX</span><br />
ou<br />
- méthode mysql: <span class="Code">UPDATE mysql.user SET Password = PASSWORD('XXX') WHERE User = 'root';</span></p>
<p>Ensuite, pour se connecter:<br />
<span class="Code">mysql -u root -p</span><br />
<span class="Code">[Mot de passe]</span></p>
<p>
<i>N'hésitez pas à laisser vos commentaires ci-dessous.</i></p>
