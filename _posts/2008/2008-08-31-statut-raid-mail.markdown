---
layout: post
status: publish
published: true
title: Statut d'un RAID logiciel par e-mail
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "La meilleure solution pour assurer la sécurité de ses données numériques
  reste à ce jour l'utilisation de plusieurs disques en RAID 1 \"miroir\". Lorsque
  deux disques durs sont montés en RAID 1, chaque fichier copié sur un disque l'est
  aussi automatiquement sur l'autre. La copie est transparente pour l'utilisateur,
  qui ne voit qu'un seul volume logiciel de la taille d'un seul disque. Si l'un des
  deux disques devient inutilisable, les données peuvent toujours être récupérées
  depuis le second disque. Un tel montage est efficace contre les pannes matérielles
  qui affectent habituellement les disques durs. Mais encore faut-il vérifier régulièrement
  l'état du Raid. En effet, si un disque tombe en panne, l'autre disque prendra immédiatement
  le relai sans que l'utilisateur s'en aperçoive. Celui-ci pourra encore croire en
  l'intégrité du Raid, alors qu'un seul disque reste fonctionnel. Il est donc nécessaire
  d'obtenir des informations sur l'état du Raid, par exemple par e-mail. \r\n\r\n"
wordpress_id: 140
wordpress_url: http://www.valhalla.fr/?p=140
date: '2008-08-31 09:33:11 +0200'
date_gmt: '2008-08-31 08:33:11 +0200'
categories:
- Informatique
tags:
- apple
- Informatique
- sécurité
- hardware
- software
permalink:  /2008/08/31/statut-raid-mail/
---
<p>La meilleure solution pour assurer la sécurité de ses données numériques reste à ce jour l'utilisation de plusieurs disques en RAID 1 "miroir". Lorsque deux disques durs sont montés en RAID 1, chaque fichier copié sur un disque l'est aussi automatiquement sur l'autre. La copie est transparente pour l'utilisateur, qui ne voit qu'un seul volume logiciel de la taille d'un seul disque. Si l'un des deux disques devient inutilisable, les données peuvent toujours être récupérées depuis le second disque. Un tel montage est efficace contre les pannes matérielles qui affectent habituellement les disques durs. Mais encore faut-il vérifier régulièrement l'état du Raid. En effet, si un disque tombe en panne, l'autre disque prendra immédiatement le relai sans que l'utilisateur s'en aperçoive. Celui-ci pourra encore croire en l'intégrité du Raid, alors qu'un seul disque reste fonctionnel. Il est donc nécessaire d'obtenir des informations sur l'état du Raid, par exemple par e-mail. </p>
<p><a id="more"></a><a id="more-140"></a></p>
<p>La première chose à faire est de créer un RAID logiciel. Il faut bien entendu deux disques durs de taille identique (internes ou externes ; mieux vaut internes).</p>
<p>L'utilitaire de disques de Mac OS X, se trouvant dans <i>Applications/Utilitaires/</i> permet de créer des Raid 1 logiciels. Une fois les deux disques reconnus par l'utilitaire de disque, il suffit de créer un <u>Ensemble RAID en miroir</u>. Attention, les disques seront alors formatés...</p>
<p><a href="http://www.flickr.com/photos/valhallafr/2812713505/" title="Raid1 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3287/2812713505_07ae545e56.jpg" width="500" height="412" alt="Raid1" /></a></p>
<p>Une fois le raid monté, il est bien sûr possible de revenir dans l'utilitaire de disques pour en vérifier l'intégrité. Mais il est aussi facile d'oublier de le faire...</p>
<p>Nous utiliserons donc une commande du terminal, qui informe sur l'état du raid, et nous enverrons le résultat de cette commande par e-mail grâce à un script automator lancé de manière récurrente par iCal.</p>
<p>La commande de terminal en question est <b>diskutil checkraid</b>.</p>
<p><a href="http://www.flickr.com/photos/valhallafr/2812713503/" title="raid2 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3064/2812713503_ee3dbb048a_o.jpg" width="585" height="297" alt="raid2" /></a></p>
<p>La seule chose vraiment importance dans tout ce texte, c'est la colonne "Status" qui, pour les deux disques, indique "Online". Voilà ce qu'il faut vérifier périodiquement : que tous les disques sont "online", c'est-à-dire en bon état de marche.</p>
<p>L'idée est donc ici d'obtenir le résultat de la dommande diskutil checkraid pour l'insérer dans un e-mail qui sera envoyé de manière récurrente.</p>
<p>Le script que j'utilise fonctionne ainsi :</p>
<ol>
<li /><u>Créer un fichier texte</u> à un endroit précis du disque (p. ex. ~/Documents/). Cocher la case <i>Remplacer les fichiers présents</i> pour éviter que le script échoue si le fichier existe déjà à cet emplacement. Donner au fichier un nom évocateur, p. ex. CHECKRAID.txt
<li /><u>Exécuter un script Shell</u> : diskutil checkraid
<li />(Optionnel) <u>Afficher les résultats</u> : cette action ne sert qu'à voir, dans Automator, ce que renvoie le script Shell précédent. Elle peut être supprimée sans incidence sur la suite.
<li /><u>Définir le contenu du document TextEdit</u> : le message renvoyé par le script Shell sera inséré dans le fichier texte créé à la première étape. Option : <i>Remplacement</i> pour être sûr que, s'il y a déjà du texte dans le fichier, celui-ci soit effacé et remplacé par le résultat du script Shell (en principe, si la case Remplacer... est cochée à l'étape 1, ceci est superflu).
<li /><u>Nouveau message mail</u>, en indiquant bien entendu le destinataire (votre e-mail), le compte de l'expéditeur (il faut avoir paramétré Apple Mail auparavant) et l'objet. On peut insérer des variables dans l'objet, par exemple la date et l'heure d'exécution de notre script. Le contenu du fichier texte sera inséré dans le corps de l'e-mail.
<li /><u>Envoyer les messages de la boîte d'envoi</u> pour que l'e-mail soit envoyé immédiatement.
<li />(Optionnel) <u>Obtenir les éléments du Finder indiqués</u>, choisir le fichier créé à l'étape 1, puis <u>Placer des éléments du Finder dans la corbeille</u> pour faire le ménage après l'exécution du script.
</ol>
<p>Voici le résultat dans Automator :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/2812702007/" title="Image 5 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3037/2812702007_95286ce199_o.png" width="712" height="621" alt="Image 5" /></a><br />
<a href="http://www.flickr.com/photos/valhallafr/2812768863/" title="raid6 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3198/2812768863_3ff4b8b5e6_o.jpg" width="707" height="652" alt="raid6" /></a></p>
<p>Reste ensuite à enregistrer notre script. Dans Automator, on ira dans le menu Fichier > Enregistrer sous. On fera cela deux fois, en choisissant dans le menu déroulant <i>Processus</i> et <i>Application</i>. Cela donnera deux fichiers :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/2812702015/" title="Image 4 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3146/2812702015_00a5eb5d1b_o.png" width="277" height="86" alt="Image 4" /></a></p>
<p>Le premier est l'application, que nous utiliserons par la suite. Le second est le fichier que l'on ouvre dans Automator pour modifier le script.</p>
<p>Reste à lancer <b>iCal</b> et à créer un nouvel événement récurrent :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/2812713495/" title="raid3 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3087/2812713495_dc473cca7d_o.jpg" width="297" height="410" alt="raid3" /></a></p>
<p>On choisira l'action <i>Ouvrir le fichier</i> et on sélectionnera le fichier d'application créé à l'étape précédente. On définira ensuite la périodicité de cet événement.</p>
<p>NB : le lancement de l'application par iCal étant la manifestation d'une alarme, programmée X minutes avant le début de l'événement, il faudra faire débuter l'événement à H+X minutes pour que l'e-mail soit envoyé à l'heure H voulue. Sur l'image précédente, événement à 12h15, rappel 15 minutes avant le début, e-mail envoyé à 12h00.</p>
<p>C'est tout !</p>
<p>Vous pouvez télécharger le script pour Automator (Leopard) et le modifier à votre guise : <a href='/public/posts/2008-08-31-checkraid/checkraid.zip'>CheckRaid</a></p>
