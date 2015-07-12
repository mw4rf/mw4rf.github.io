---
layout: post
status: publish
published: true
title: Installer un environnement de développement PHP/MySQL sous Linux Ubuntu
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "Cet article explique en images comment installer et configurer un environnement
  de développement Web sous Linux Ubuntu : le serveur web Apache 2, avec un moteur
  PHP, et le serveur de base de données MySQL accompagné de quelques outils graphiques
  d'administration. \r\n\r\n"
wordpress_id: 281
wordpress_url: http://www.valhalla.fr/?p=281
date: '2009-09-10 16:54:47 +0200'
date_gmt: '2009-09-10 14:54:47 +0200'
categories:
- Informatique
- Internet
tags:
- Internet
- Informatique
- sécurité
- programmation
- Linux
- Web
- serveur
- bases de données
permalink:  /2009/09/10/installer-un-environnement-de-developpement-phpmysql-sous-linux-ubuntu/
---
<p>Cet article explique en images comment installer et configurer un environnement de développement Web sous Linux Ubuntu : le serveur web Apache 2, avec un moteur PHP, et le serveur de base de données MySQL accompagné de quelques outils graphiques d'administration. </p>
<p><a id="more"></a><a id="more-281"></a></p>
<p>Le tutoriel est agrémenté de nombreuses images qui, souvent, se suffisent à elles-mêmes pour expliquer l'étape qu'elles représentent. C'est notamment le cas des images représentant une fenêtre de terminal : tapez la commande telle qu'elle apparaît sur l'image, et validez avec la touche entrée. Afin de faciliter la lecture des captures d'écran les plus complexes, un cadre bleu entoure la zone qui doit retenir votre attention.</p>
<p>La première chose à faire est de récupérer et d'installer les paquets des serveurs. Nous allons installer Apache2, Php5 et MySQL5. </p>
<p><i>NB: si vous n'avez pas accès à l'interface graphique, que vous passiez par une connexion SSH ou que vous n'ayez tout simplement pas installé de serveur graphique -Ubuntu Server-, installez LAMP avec l'instruction suivante : <u>sudo tasksel install lamp-server</u></i></p>
<p>Pour ce faire, lancez le <b>Gestionnaire de paquets Synaptic</b> (menu Système &#x2192; Administration) puis choisissez <b>Sélectionner des paquets par tâche...</b> dans le menu <b>Édition</b>. Vous verrez alors la fenêtre suivante :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906068499/" title="screenshot_001 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3169/3906068499_3961b67d2d_o.png" width="488" height="427" alt="screenshot_001" /></a></p>
<p>Sélectionnez <b>LAMP Server</b>, comme indiqué sur l'image. Validez ensuite votre choix. Il vous sera demandé d'installer d'autres paquets, dont dépendent les paquets LAMP :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906068681/" title="screenshot_002 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2585/3906068681_1523b530fd_o.png" width="482" height="377" alt="screenshot_002" /></a></p>
<p>Cliquez sur <b>Ajouter à la sélection</b>, puis appliquez les changements en cliquant sur <b>Appliquer</b> :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906068895/" title="screenshot_003 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3008/3906068895_ddb787b25e_o.png" width="459" height="259" alt="screenshot_003" /></a></p>
<p>Un fenêtre vous demandera de confirmer l'installation des paquets, et vous confirmerez :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906848814/" title="screenshot_004 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3484/3906848814_a609ec0954.jpg" width="500" height="306" alt="screenshot_004" /></a></p>
<p>Les paquets seront ensuite téléchargés (nécessite une connexion Internet) :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906069627/" title="screenshot_005 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2579/3906069627_ce480193d2_o.png" width="378" height="204" alt="screenshot_005" /></a></p>
<p>Avant que les paquets soient installés, il est possible que le script d'installation vous demande de saisir un mot de passe MySQL, puis de le confirmer. Si tel est le cas, entrez un mot de passe (dont vous vous souviendrez...) et confirmez :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906849778/" title="screenshot_006 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2613/3906849778_202ce0b3a5.jpg" width="500" height="355" alt="screenshot_006" /></a></p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906070599/" title="screenshot_007 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2634/3906070599_28c1285575.jpg" width="500" height="355" alt="screenshot_007" /></a></p>
<p>Les paquets s'installent ensuite sans que vous ayez à intervenir :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906850140/" title="screenshot_008 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2457/3906850140_72707a6823.jpg" width="500" height="243" alt="screenshot_008" /></a></p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906070963/" title="screenshot_009 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3441/3906070963_0e825b07a6.jpg" width="500" height="206" alt="screenshot_009" /></a></p>
<p>Lorsque l'installation est terminée, fermez le gestionnaire de paquets Synaptic et lancez votre navigateur (dans ce tutoriel, j'utilise Opera, mais Firefox, Chrome, Konqueror ou n'importe quel autre navigateur feront aussi bien l'affaire). Dans la barre d'adresse, entrez <b><a href="http://localhost/">http://localhost/</a></b> ou cliquez sur ce lien.</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906850472/" title="screenshot_010 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2452/3906850472_7c01a46049_o.png" width="456" height="255" alt="screenshot_010" /></a></p>
<p>Si vous voyez le message <b>It Works!</b> c'est que le serveur Apache fonctionne. La première étape est terminée. Il reste maintenant à rajouter à Apache la gestion des scripts PHP. Pour ce faire, commencez par ouvrir une fenêtre de terminal et entrez la commande <b>gksu gedit /var/www/index.php</b> :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906850580/" title="screenshot_014 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3529/3906850580_fbecab7e54_o.png" width="399" height="148" alt="screenshot_014" /></a></p>
<p>Quelques remarques :<br />
1) A partir de maintenant, pour ce tutoriel, lorsque vous verrez une image représentant une fenêtre de terminal, comme ci-dessus, lisez la commande et utilisez-la. Les commandes ne seront plus écrites dans le corps du texte du tutoriel.<br />
2) J'utilise Gnome et, par conséquent, le logiciel gedit et la commande gksu pour passer en root. Si vous utilisez KDE, remplacez <b>gksu gedit</b> par <b>kdesu kate</b> (ceci est également valable pour la suite).<br />
3) Les commandes passées en root (avec <b>gksu</b> ou <b>sudo</b>) nécessiteront parfois que vous entriez le mot de passe administrateur. Avec Ubuntu, il s'agit du mot de passe de votre compte utilisateur (celui que vous entrez pour accéder à votre bureau). Rien n'apparaît à l'écran lorsque vous tapez votre mot de passe : c'est normal, il s'agit d'une mesure de sécurité. Entrez simplement le mot de passe lorsqu'il est demandé, puis validez avec la touche Entrée.</p>
<p>La commande précédente a eu pour effet d'ouvrir une fenêtre de l'éditeur gedit et de créer le fichier index.php dans le répertoire /var/www. Recopiez le code <b>&lt;?php phpinfo(); ?&gt;</b> dans la zone d'édition, comme ceci :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906071557/" title="screenshot_015 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3494/3906071557_8b82d37b4e_o.png" width="434" height="255" alt="screenshot_015" /></a></p>
<p>Enregistrez les changements et fermez la fenêtre de gedit. Il faut maintenant éditer le fichier de configuration d'Apache, pour lui indiquer de prendre en compte les fichier PHP comme des scripts à exécuter. Tapez la commande suivante :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906851034/" title="screenshot_011 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2610/3906851034_645b16dc63_o.png" width="473" height="166" alt="screenshot_011" /></a></p>
<p>Rendez-vous à la fin du fichier, et ajoutez les deux lignes indiquées :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906852522/" title="screenshot_012 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3021/3906852522_ed305d25a4.jpg" width="500" height="404" alt="screenshot_012" /></a></p>
<p>Fermez gedit et relancez Apache à l'aide de la commande <b>sudo /etc/init.d/apache2 restart</b> : </p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906072053/" title="screenshot_013 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2483/3906072053_95ee6c91b3.jpg" width="500" height="493" alt="screenshot_013" /></a></p>
<p>Apache se relance avec un message d'erreur ("Could not reliably...") qui n'a pas d'incidence sur son fonctionnement. Apache nous dit seulement qu'aucun nom de domaine n'est associé à l'adresse locale 127.0.0.1 : nous réglerons cela plus tard.</p>
<p>Pour vérifier si cela fonctionne, chargez l'adresse <a href="http://localhost/index.php">http://localhost/index.php</a> dans votre navigateur ou cliquez sur ce lien.</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906071821/" title="screenshot_016 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3120/3906071821_61c6ff64a8.jpg" width="500" height="269" alt="screenshot_016" /></a></p>
<p>Vous pouvez constater, en haut de la page, que peu d'extensions sont chargées. Nous allons donc en installer quelques unes parmi les plus utiles. Entrez la commande indiquée dans l'image suivante, puis confirmez (en appuyant sur Entrée) lorsque cela vous est demandé :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906072187/" title="screenshot_017 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2460/3906072187_ded80f800b_o.png" width="511" height="504" alt="screenshot_017" /></a></p>
<p>Le message complet qui est affiché est le suivant :<br />
<code></p>
<p>guillaume@netbook:~$ sudo apt-get install php-pear php5-cli php5-gd php5-sqlite php5-xsl php5-mcrypt php5-curl php5-imap<br />
Lecture des listes de paquets... Fait<br />
Construction de l'arbre des dépendances<br />
Lecture des informations d'état... Fait<br />
Les paquets suivants ont été installés automatiquement et ne sont plus nécessaires :<br />
  linux-headers-2.6.28-11 linux-headers-2.6.28-11-generic<br />
Veuillez utiliser « apt-get autoremove » pour les supprimer.<br />
Les paquets supplémentaires suivants seront installés :<br />
  libc-client2007b libcurl3 libgd2-xpm libmcrypt4 libt1-5 mlock<br />
Paquets suggérés :<br />
  uw-mailutils libgd-tools libmcrypt-dev mcrypt php5-dev php4-dev<br />
Les paquets suivants seront ENLEVÉS :<br />
  libgd2-noxpm<br />
Les NOUVEAUX paquets suivants seront installés :<br />
  libc-client2007b libcurl3 libgd2-xpm libmcrypt4 libt1-5 mlock<br />
  php-pear php5-cli php5-curl php5-gd php5-imap php5-mcrypt<br />
  php5-sqlite php5-xsl<br />
0 mis à jour, 14 nouvellement installés, 1 à enlever et 0 non mis à jour.<br />
Il est nécessaire de prendre 4420ko dans les archives.<br />
Après cette opération, 11,4Mo d'espace disque supplémentaires seront utilisés.<br />
Souhaitez-vous continuer [O/n] ? o<br />
Réception de : 1 http://fr.archive.ubuntu.com jaunty/universe mlock 8:2007b~dfsg-1.1 [31,4kB]<br />
Réception de : 2 http://fr.archive.ubuntu.com jaunty/universe libc-client2007b 8:2007b~dfsg-1.1 [747kB]<br />
Réception de : 3 http://fr.archive.ubuntu.com jaunty-updates/main libcurl3 7.18.2-8ubuntu4.1 [220kB]<br />
Réception de : 4 http://fr.archive.ubuntu.com jaunty/main libgd2-xpm 2.0.36~rc1~dfsg-3ubuntu1 [211kB]<br />
Réception de : 5 http://fr.archive.ubuntu.com jaunty/universe libmcrypt4 2.5.7-5ubuntu1 [81,2kB]<br />
Réception de : 6 http://fr.archive.ubuntu.com jaunty/main libt1-5 5.1.2-3 [154kB]<br />
Réception de : 7 http://fr.archive.ubuntu.com jaunty-updates/main php5-cli 5.2.6.dfsg.1-3ubuntu4.2 [2488kB]<br />
Réception de : 8 http://fr.archive.ubuntu.com jaunty-updates/main php-pear 5.2.6.dfsg.1-3ubuntu4.2 [330kB]<br />
Réception de : 9 http://fr.archive.ubuntu.com jaunty-updates/main php5-curl 5.2.6.dfsg.1-3ubuntu4.2 [23,9kB]<br />
Réception de : 10 http://fr.archive.ubuntu.com jaunty-updates/main php5-gd 5.2.6.dfsg.1-3ubuntu4.2 [32,5kB]<br />
Réception de : 11 http://fr.archive.ubuntu.com jaunty/universe php5-imap 5.2.6-0ubuntu5 [38,3kB]<br />
Réception de : 12 http://fr.archive.ubuntu.com jaunty/universe php5-mcrypt 5.2.6-0ubuntu2 [15,3kB]<br />
Réception de : 13 http://fr.archive.ubuntu.com jaunty-updates/main php5-sqlite 5.2.6.dfsg.1-3ubuntu4.2 [34,8kB]<br />
Réception de : 14 http://fr.archive.ubuntu.com jaunty-updates/main php5-xsl 5.2.6.dfsg.1-3ubuntu4.2 [12,8kB]<br />
4420ko réceptionnés en 4s (973ko/s)<br />
dpkg : libgd2-noxpm : problème de dépendance, mais suppression comme demandé :<br />
 libgraphviz4 dépend de libgd2-noxpm (>= 2.0.36~rc1~dfsg) | libgd2-xpm (>= 2.0.36~rc1~dfsg) ; cependant :<br />
  Le paquet libgd2-noxpm doit être supprimé.<br />
  Le paquet libgd2-xpm n'est pas installé.<br />
(Lecture de la base de données... 135076 fichiers et répertoires déjà installés.)<br />
Suppression de libgd2-noxpm ...<br />
Traitement des actions différées (« triggers ») pour « libc6 »...<br />
ldconfig deferred processing now taking place<br />
Sélection du paquet mlock précédemment désélectionné.<br />
(Lecture de la base de données... 135067 fichiers et répertoires déjà installés.)<br />
Dépaquetage de mlock (à partir de .../mlock_8%3a2007b~dfsg-1.1_i386.deb) ...<br />
Sélection du paquet libc-client2007b précédemment désélectionné.<br />
Dépaquetage de libc-client2007b (à partir de .../libc-client2007b_8%3a2007b~dfsg-1.1_i386.deb) ...<br />
Sélection du paquet libcurl3 précédemment désélectionné.<br />
Dépaquetage de libcurl3 (à partir de .../libcurl3_7.18.2-8ubuntu4.1_i386.deb) ...<br />
Sélection du paquet libgd2-xpm précédemment désélectionné.<br />
Dépaquetage de libgd2-xpm (à partir de .../libgd2-xpm_2.0.36~rc1~dfsg-3ubuntu1_i386.deb) ...<br />
Sélection du paquet libmcrypt4 précédemment désélectionné.<br />
Dépaquetage de libmcrypt4 (à partir de .../libmcrypt4_2.5.7-5ubuntu1_i386.deb) ...<br />
Sélection du paquet libt1-5 précédemment désélectionné.<br />
Dépaquetage de libt1-5 (à partir de .../libt1-5_5.1.2-3_i386.deb) ...<br />
Sélection du paquet php5-cli précédemment désélectionné.<br />
Dépaquetage de php5-cli (à partir de .../php5-cli_5.2.6.dfsg.1-3ubuntu4.2_i386.deb) ...<br />
Sélection du paquet php-pear précédemment désélectionné.<br />
Dépaquetage de php-pear (à partir de .../php-pear_5.2.6.dfsg.1-3ubuntu4.2_all.deb) ...<br />
Sélection du paquet php5-curl précédemment désélectionné.<br />
Dépaquetage de php5-curl (à partir de .../php5-curl_5.2.6.dfsg.1-3ubuntu4.2_i386.deb) ...<br />
Sélection du paquet php5-gd précédemment désélectionné.<br />
Dépaquetage de php5-gd (à partir de .../php5-gd_5.2.6.dfsg.1-3ubuntu4.2_i386.deb) ...<br />
Sélection du paquet php5-imap précédemment désélectionné.<br />
Dépaquetage de php5-imap (à partir de .../php5-imap_5.2.6-0ubuntu5_i386.deb) ...<br />
Sélection du paquet php5-mcrypt précédemment désélectionné.<br />
Dépaquetage de php5-mcrypt (à partir de .../php5-mcrypt_5.2.6-0ubuntu2_i386.deb) ...<br />
Sélection du paquet php5-sqlite précédemment désélectionné.<br />
Dépaquetage de php5-sqlite (à partir de .../php5-sqlite_5.2.6.dfsg.1-3ubuntu4.2_i386.deb) ...<br />
Sélection du paquet php5-xsl précédemment désélectionné.<br />
Dépaquetage de php5-xsl (à partir de .../php5-xsl_5.2.6.dfsg.1-3ubuntu4.2_i386.deb) ...<br />
Traitement des actions différées (« triggers ») pour « man-db »...<br />
Paramétrage de mlock (8:2007b~dfsg-1.1) ...<br />
Paramétrage de libc-client2007b (8:2007b~dfsg-1.1) ...</p>
<p>Paramétrage de libcurl3 (7.18.2-8ubuntu4.1) ...</p>
<p>Paramétrage de libgd2-xpm (2.0.36~rc1~dfsg-3ubuntu1) ...</p>
<p>Paramétrage de libmcrypt4 (2.5.7-5ubuntu1) ...</p>
<p>Paramétrage de libt1-5 (5.1.2-3) ...</p>
<p>Paramétrage de php5-cli (5.2.6.dfsg.1-3ubuntu4.2) ...</p>
<p>Creating config file /etc/php5/cli/php.ini with new version</p>
<p>Paramétrage de php-pear (5.2.6.dfsg.1-3ubuntu4.2) ...<br />
Paramétrage de php5-curl (5.2.6.dfsg.1-3ubuntu4.2) ...</p>
<p>Paramétrage de php5-gd (5.2.6.dfsg.1-3ubuntu4.2) ...</p>
<p>Paramétrage de php5-imap (5.2.6-0ubuntu5) ...<br />
Paramétrage de php5-mcrypt (5.2.6-0ubuntu2) ...<br />
Paramétrage de php5-sqlite (5.2.6.dfsg.1-3ubuntu4.2) ...</p>
<p>Paramétrage de php5-xsl (5.2.6.dfsg.1-3ubuntu4.2) ...</p>
<p>Traitement des actions différées (« triggers ») pour « libc6 »...<br />
ldconfig deferred processing now taking place<br />
guillaume@netbook:~$<br />
</code></p>
<p>Rechargez ensuite la configuration du serveur (ou relancez le avec <b>apache2 restart</b>) :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906851632/" title="screenshot_018 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3286/3906851632_309d9c76b1_o.png" width="506" height="173" alt="screenshot_018" /></a></p>
<p>Rachraîchissez la page dans votre navigateur pour voir la liste des extensions installées :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906072945/" title="screenshot_019 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2538/3906072945_9fe2ce01ef.jpg" width="500" height="228" alt="screenshot_019" /></a></p>
<p>Réglons maintenant le problème de l'adresse 127.0.0.1 qui n'est associée à aucun domaine. Éditez à nouveau le fichier apache2.conf (avec la commande : <b>gksu gedit /etc/apache2/apache2.conf</b>) et rajoutez la ligne suivante en fin de fichier :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906074017/" title="screenshot_020 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2541/3906074017_42c5d5228e.jpg" width="500" height="404" alt="screenshot_020" /></a></p>
<p>Relancez ensuite Apache, et constatez que le message d'erreur a disparu :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906073873/" title="screenshot_021 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2569/3906073873_573cbab69d_o.png" width="500" height="168" alt="screenshot_021" /></a></p>
<p>Apache et PHP fonctionnent. Passons à MySQL. La première chose à faire est de sécuriser le serveur. Pour cela, un script est fourni. Tapez dans le terminal la commande suivante et suivez les instructions : <b>sudo mysql_secure_installation</b>.</p>
<p>Il vous faudra le plus souvent répondre par <b>Y et Entrée</b> pour oui ou par <b>N et Entrée</b> pour non. Il vous sera demandé :</p>
<p>1) De définir un mot de passe administrateur si cela n'a pas été fait (v. ci-dessus, lors de l'installation des paquets). Si vous avez déjà défini un mot de passe, tapez N, sinon tapez Y, Entrée, entrez votre mot de passe, puis tapez encore une fois Entrée ;<br />
2) D'empêcher les connexions anonymes (tapez <b>Y</b>) ;<br />
3) D'empêcher les connexions distantes (taper <b>Y</b> est conseillée pour un environnement de développement ; pour la production, tapez <b>N</b> si vous voulez autoriser les accès distants à l'aide d'utilitaires tels que Navicat, SequelPro, etc.) ;<br />
4) Supprimer la table <i>test</i> si elle existe (tapez <b>Y</b>) ;<br />
5) Recharger la configuration immédiatement (tapez <b>Y</b>).</p>
<p>Voici le détail :</p>
<p><code><br />
guillaume@netbook:~$ sudo mysql_secure_installation</p>
<p>NOTE: RUNNING ALL PARTS OF THIS SCRIPT IS RECOMMENDED FOR ALL MySQL<br />
      SERVERS IN PRODUCTION USE!  PLEASE READ EACH STEP CAREFULLY!</p>
<p>In order to log into MySQL to secure it, we'll need the current<br />
password for the root user.  If you've just installed MySQL, and<br />
you haven't set the root password yet, the password will be blank,<br />
so you should just press enter here.</p>
<p>Enter current password for root (enter for none):<br />
ERROR 1045 (28000): Access denied for user 'root'@'localhost' (using password: NO)<br />
Enter current password for root (enter for none):<br />
OK, successfully used password, moving on...</p>
<p>Setting the root password ensures that nobody can log into the MySQL<br />
root user without the proper authorisation.</p>
<p>You already have a root password set, so you can safely answer 'n'.</p>
<p>Change the root password? [Y/n] n<br />
 ... skipping.</p>
<p>By default, a MySQL installation has an anonymous user, allowing anyone<br />
to log into MySQL without having to have a user account created for<br />
them.  This is intended only for testing, and to make the installation<br />
go a bit smoother.  You should remove them before moving into a<br />
production environment.</p>
<p>Remove anonymous users? [Y/n] y<br />
 ... Success!</p>
<p>Normally, root should only be allowed to connect from 'localhost'.  This<br />
ensures that someone cannot guess at the root password from the network.</p>
<p>Disallow root login remotely? [Y/n] y<br />
 ... Success!</p>
<p>By default, MySQL comes with a database named 'test' that anyone can<br />
access.  This is also intended only for testing, and should be removed<br />
before moving into a production environment.</p>
<p>Remove test database and access to it? [Y/n] y<br />
 - Dropping test database...<br />
ERROR 1008 (HY000) at line 1: Can't drop database 'test'; database doesn't exist<br />
 ... Failed!  Not critical, keep moving...<br />
 - Removing privileges on test database...<br />
 ... Success!</p>
<p>Reloading the privilege tables will ensure that all changes made so far<br />
will take effect immediately.</p>
<p>Reload privilege tables now? [Y/n] y<br />
 ... Success!</p>
<p>Cleaning up...</p>
<p>All done!  If you've completed all of the above steps, your MySQL<br />
installation should now be secure.</p>
<p>Thanks for using MySQL!<br />
</code></p>
<p>Cela étant fait, nous allons maintenant déplacer les fichiers qui composent les bases de données vers un emplacement plus sûr que l'emplacement par défaut. En principe, Ubuntu monte le répertoire racine / et ses enfants sur une partition et le répertoire /home sur une autre partition. Si vous devez réinstaller le système, le répertoire racine sera effacé et vos bases de données disparaîtront. En les déplaçant vers le répertoire /home, on évite qu'elles soient effacées lors de la réinstallation du système.</p>
<p>Commencez par taper la commande suivante :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906853470/" title="screenshot_022 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2574/3906853470_3cd7d46d15_o.png" width="484" height="123" alt="screenshot_022" /></a></p>
<p>Un fichier <b>datadir.cnf</b> est créé dans le dossier conf.d. Vous pouvez choisir un autre nom pour ce fichier, mais il doit impérativement porter l'extension .cnf.</p>
<p>Remplissez le fichier comme ceci :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906074301/" title="screenshot_023 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3116/3906074301_d0de7184e6.jpg" width="500" height="404" alt="screenshot_023" /></a></p>
<p>Fermez la fenêtre, et créez le dossier destiné à contenir les fichier des bases de données :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906074423/" title="screenshot_024 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3088/3906074423_da43f6d45d_o.png" width="486" height="132" alt="screenshot_024" /></a></p>
<p>Arrêtez le serveur MySQL :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906074607/" title="screenshot_025 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3473/3906074607_6ede693280_o.png" width="498" height="136" alt="screenshot_025" /></a></p>
<p>Copiez le contenu de l'ancien dossier de stockage des fichiers des bases de données dans le nouveau dossier :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906074721/" title="screenshot_026 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2617/3906074721_58211e4e5c_o.png" width="475" height="119" alt="screenshot_026" /></a></p>
<p>Supprimez (éventuellement) les fichiers parasites (première commande) et attribuez (obligatoirement) le dossier à l'utilisateur MySQL (seconde commande) :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906854280/" title="screenshot_027 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3591/3906854280_001017570a_o.png" width="485" height="140" alt="screenshot_027" /></a></p>
<p>A partir de la version 9 d'Ubuntu, il est nécessaire d'indiquer à apparmor que le dossier de stockage de MySQL a changé (si vous n'êtes pas sûr de votre version d'Ubuntu, essayez de relancer le serveur MySQL -- v. plus bas pour la commande -- : en cas d'échec, suivez ces étapes) :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906854412/" title="screenshot_028 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2629/3906854412_431ef04f8e_o.png" width="483" height="109" alt="screenshot_028" /></a></p>
<p>Trouvez les deux lignes suivantes :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906075297/" title="screenshot_029 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2612/3906075297_5f61f9af44.jpg" width="500" height="404" alt="screenshot_029" /></a></p>
<p>Et remplacez-les par ces lignes-là :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906075613/" title="screenshot_030 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2674/3906075613_546c9db2c2.jpg" width="500" height="404" alt="screenshot_030" /></a></p>
<p>Rechargez ensuite apparmor avec la commande <b>sudo /etc/init.d/apparmor restart</b>, puis lancez MySQL avec la commande <b>sudo /etc/init.d/mysql start</b> : </p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906075885/" title="screenshot_031 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2427/3906075885_8fc4e9c358_o.png" width="503" height="225" alt="screenshot_031" /></a></p>
<p>Si le serveur se lance correctement, c'est qu'en principe tout fonctionne. Quelques tests permettront de vous en convaincre. Ouvrez une session MySQL à l'aide de la commande <b>mysql -u root -p</b> et entrez le mot de passe administrateur (celui que vous avez défini plus tôt, soit lors de l'installation des paquets, soit lors de l'exécution du script de sécurisation).</p>
<p>Exécutez ensuite quelques requêtes. Par exemple, <b>SHOW DATABASES;</b> pour voir les bases installées. Créez une nouvelle base, si vous voulez : <b>CREATE DATABASE ca_marche;</b>.</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906855430/" title="screenshot_032 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3430/3906855430_a26f82bc10_o.png" width="511" height="504" alt="screenshot_032" /></a></p>
<p>Parfait, MySQL fonctionne ! Si vous n'êtes pas un adepte de la ligne de commande, vous pouvez installer MySQLAdministrator et MySQLQueryBrowser qui sont fournis par MySQL :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906855746/" title="screenshot_033 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3479/3906855746_35d6f41d81_o.png" width="511" height="504" alt="screenshot_033" /></a></p>
<p>Des raccourcis vers ces logiciels se placeront automatiquement dans le menu <b>Applications &#x2192; Programmation</b> d'Ubuntu.</p>
<p>MySQLAdministrator permet de paramétrer et d'administrer un serveur MySQL :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906076535/" title="screenshot_034 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3529/3906076535_85e2412c91_o.png" width="420" height="368" alt="screenshot_034" /></a></p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906076749/" title="screenshot_035 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3256/3906076749_cff24c96cf.jpg" width="500" height="315" alt="screenshot_035" /></a></p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906076865/" title="screenshot_036 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3480/3906076865_38409d86aa.jpg" width="500" height="349" alt="screenshot_036" /></a></p>
<p>MySQLQueryBrowser permet de manipuler les bases et les tables, et d'effectuer des requêtes. On le lance depuis le menu Applications d'Ubuntu, ou depuis la ligne de commandes :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906856788/" title="screenshot_037 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3516/3906856788_974d4b872f_o.png" width="490" height="130" alt="screenshot_037" /></a></p>
<p>On se connecte ensuite au serveur :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906078269/" title="screenshot_038 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3535/3906078269_4ee73efa1e_o.png" width="420" height="395" alt="screenshot_038" /></a></p>
<p>Et on constate que la base créée un peu plus tôt s'affiche dans le navigateur :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906857724/" title="screenshot_039 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2483/3906857724_b19b35f7ef.jpg" width="500" height="343" alt="screenshot_039" /></a></p>
<p>En faisant un clic-droit sur le nom de la base, on peut y ajouter de nouvelles tables. Ici, je crée une table <b>ok_cool</b> avec une colonne id/int/auto_increment/primary_key et une colonne blabla/text :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906857988/" title="screenshot_040 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2566/3906857988_664502a2e6.jpg" width="500" height="352" alt="screenshot_040" /></a></p>
<p>On peut également changer le moteur de MyISAM vers InnoDB, ou vice-versa, très simplement :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906858152/" title="screenshot_041 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3509/3906858152_457ed8eb37.jpg" width="500" height="352" alt="screenshot_041" /></a></p>
<p>Finalement, on valide les changements pour que le logiciel forme la requête et l'exécute :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906858252/" title="screenshot_042 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2577/3906858252_ed70e4a850_o.png" width="476" height="327" alt="screenshot_042" /></a></p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906079153/" title="screenshot_043 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3228/3906079153_f074cb7bff_o.png" width="177" height="157" alt="screenshot_043" /></a></p>
<p>Une fois la table créée, on peut y ajouter des enregistrements :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906079369/" title="screenshot_044 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3477/3906079369_99fef796e5.jpg" width="500" height="343" alt="screenshot_044" /></a></p>
<p>... et les afficher :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906858790/" title="screenshot_045 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2609/3906858790_8de47b2a78.jpg" width="500" height="333" alt="screenshot_045" /></a></p>
<p>Si MySQLQueryBrowser n'est pas assez complet pour vous, sachez qu'il existe une version <i>lite</i> gratuite de Navicat pour Linux. Vous pouvez la télécharger à l'adresse suivante : <a href="http://www.navicat.com/en/products/navicat_mysql/mysql_detail_linux.html">http://www.navicat.com/en/products/navicat_mysql/mysql_detail_linux.html</a>. Elle fonctionne avec une version embarquée de Wine.</p>
<p>Nous avons maintenant Apache, PHP et MySQL qui fonctionnent. L'installation est terminée. Restent cependant encore quelques petites opérations de configuration à effectuer. Nous allons d'abord sécuriser l'accès au répertoire racine Apache, puis déplacer les fichiers des sites vers le répertoire utilisateur. </p>
<p>Ouvrez le fichier de configuration des répertoires d'Apache :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906079711/" title="screenshot_046 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2541/3906079711_9604a2579c_o.png" width="491" height="146" alt="screenshot_046" /></a></p>
<p>Trouvez les lignes suivantes : </p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906080523/" title="screenshot_047 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2421/3906080523_d6ce5689e0.jpg" width="500" height="404" alt="screenshot_047" /></a></p>
<p>Et remplacez-les par celles-ci :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906859930/" title="screenshot_048 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2579/3906859930_ed3271dcec.jpg" width="500" height="404" alt="screenshot_048" /></a></p>
<p>Ces nouvelles lignes refusent l'accès au répertoire racine du serveur (/var/www/) depuis l'extérieur de votre réseau local (donc depuis Internet).</p>
<p>Nous allons installer nos fichier à un autre endroit : dans le dossier <b>/home/votre_nom/www</b>.</p>
<p>On commence par créer le dossier :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906860182/" title="screenshot_049 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2625/3906860182_6501441027_o.png" width="482" height="112" alt="screenshot_049" /></a></p>
<p>On va installer un wiki, pour l'exemple. Créons donc le dossier <b>wiki</b> :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906860418/" title="screenshot_052 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3462/3906860418_ae36254a9f_o.png" width="468" height="104" alt="screenshot_052" /></a></p>
<p>Créons un fichier <b>index.php</b> dans ce dossier wiki :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906081535/" title="screenshot_053 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3428/3906081535_548883093f_o.png" width="478" height="114" alt="screenshot_053" /></a></p>
<p>Et écrivons un petit script tout simple :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906081765/" title="screenshot_054 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2513/3906081765_ccfc9ee527.jpg" width="500" height="404" alt="screenshot_054" /></a></p>
<p>Il fait maintenant éditer le fichier de configuration d'Apache (rien de nouveau...) :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906081039/" title="screenshot_050 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2565/3906081039_439d004c48_o.png" width="505" height="148" alt="screenshot_050" /></a></p>
<p>On rajoute les lignes suivantes :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906861246/" title="screenshot_051 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2637/3906861246_2ab69fa78d.jpg" width="500" height="404" alt="screenshot_051" /></a></p>
<p>Elles indiquent au serveur que l'alias <b>wiki</b> désigne le dossier <b>/home/votre_nom/www/wiki</b>. Ainsi, lorsque l'utilisateur entrera l'adresse http://localhost/wiki, les fichier affichés seront ceux qui se situent dans le dossier /home/votre_nom_www/wiki.</p>
<p>Apache ne pourra pas forcément lire les fichiers de ce dossier, car ces fichiers vous appartiennent et que vous n'êtes pas Apache (Sioux, peut-être ?). Les deux commandes suivantes permettent, respectivement, d'attribuer le contenu du dossier www à Apache, et d'autoriser les lectures et écritures sur les fichiers qui le composent :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906082603/" title="screenshot_056 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3485/3906082603_fbeaba5d12_o.png" width="487" height="140" alt="screenshot_056" /></a></p>
<p>Il ne reste plus qu'à recharger la configuration d'Apache :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906861622/" title="screenshot_055 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3433/3906861622_835581f1f7_o.png" width="490" height="124" alt="screenshot_055" /></a></p>
<p>Et on peut voir si cela fonctionne :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/3906861780/" title="screenshot_057 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2429/3906861780_831d558625_o.png" width="442" height="227" alt="screenshot_057" /></a></p>
<p>Il existe d'autres manières de déplacer les fichiers de vos sites. Vous en trouverez le détail à ces deux adresses :<br />
<a href="http://doc.ubuntu-fr.org/lamp">http://doc.ubuntu-fr.org/lamp</a><br />
<a href="http://doc.ubuntu-fr.org/tutoriel/lamp_repertoires_de_travail">http://doc.ubuntu-fr.org/tutoriel/lamp_repertoires_de_travail</a></p>
<p>J'ai choisi cette méthode car elle me semble être la plus résistante aux changements : les liens symboliques et les volumes montés changent plus facilement que le contenu d'un fichier de configuration. Pour sauvegarder la structure de votre site, il vous suffit de sauvegarder le fichier /etc/apache2/sites-available/default. Vous pouvez aussi le recopier sur un autre ordinateur, afin de recréer le même serveur (ne pas oublier de lancez chown et chmod dans ce cas !). En outre, les Alias Apache peuvent être paramétrés plus finement que les alias ou les volumes montés : par exemple, en interdisant les connexions venant d'une certaine plage IP.</p>
<p>Voilà, c'est terminé ! J'espère que ce tutoriel vous aura été utile !</p>
