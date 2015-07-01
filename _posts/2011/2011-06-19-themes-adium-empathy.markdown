---
layout: post
status: publish
published: true
title: Utiliser des thèmes Adium avec Empathy
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "Le logiciel libre de messagerie instatanée <strong>Empathy</strong>, désormais
  installé par défaut avec les principales distributions Linux telles qu'Ubuntu ou
  Fedora, et parfaitement intégré à Gnome-Shell, utilise le même format de thèmes
  graphiques que le logiciel pour Mac Adium. Il est donc très facile d'utiliser des
  thèmes conçus pour Adium avec Empathy, et cet article montre comment faire.\r\n\r\n"
wordpress_id: 729
wordpress_url: http://www.valhalla.fr/?p=729
date: '2011-06-19 17:03:12 +0200'
date_gmt: '2011-06-19 15:03:12 +0200'
categories:
- Mac
- Graphisme
- Web
- Informatique
- Linux
tags:
- Mac
- Linux
- Console
- CSS
- interface
- messagerie
- fedora
- gnome
- mint
- ubuntu
permalink:  /2011/06/19/themes-adium-empathy/
---
<p>Le logiciel libre de messagerie instatanée <strong>Empathy</strong>, désormais installé par défaut avec les principales distributions Linux telles qu'Ubuntu ou Fedora, et parfaitement intégré à Gnome-Shell, utilise le même format de thèmes graphiques que le logiciel pour Mac Adium. Il est donc très facile d'utiliser des thèmes conçus pour Adium avec Empathy, et cet article montre comment faire.</p>
<p><a id="more"></a><a id="more-729"></a></p>
<h2>Trouver des thèmes Adium</h2>
<p>La plupart des thèmes pour Adium sont distribués sur le site <a href="http://www.adiumxtras.com/"><strong>adiumxtras.com</strong></a> ; il suffit donc de s'y rendre et de télécharger les thèmes souhaités de la catégorie <i><b>Message Styles</b></i>.</p>
<p><a href="/public/posts/2011-06-19-empathy/EmpathyScreenshot1.png"><img src="/public/posts/2011-06-19-empathy/EmpathyScreenshot1-300x181.png" alt="Liste des thèmes sur AdiumXtras.com" title="EmpathyScreenshot1" width="300" height="181" class="size-medium wp-image-737" /></a></p>
<h2>Installer un thème</h2>
<p>Empathy cherche les thèmes existants dans un dossier spécifique, qui n'est pas créé lors de l'installation du logiciel. La première fois que l'on ajoute un thème Adium à Empathy, il faudra donc créer ce dossier. Ensuite, il suffira de déplacer les fichiers des thèmes téléchargés dans ce dossier.</p>
<h3>Créer le dossier /usr/share/adium/message-styles/</h3>
<p>Il existe plusieurs façons de créer un dossier, la plus simple étant d'utiliser la commande <b>mkdir</b> en tant que <i>root</i>.</p>
<p>Pour Ubuntu, Debian, Mint et autres :<br />
1) Ouvrez une fenêtre de terminal ;<br />
2) Tapez :<br />
<code>sudo mkdir -p /usr/share/adium/message-styles</code><br />
puis tapez votre mot de passe administrateur.</p>
<p>Pour Fedora, RedHat et autres :<br />
1) Ouvrez une fenêtre de terminal ;<br />
2) Tapez :<br />
<code>su -c "mkdir -p /usr/share/adium/message-styles"</code><br />
puis tapez votre mot de passe administrateur.</p>
<h3>Installer un nouveau thème</h3>
<p>Commencez par télécharger un thème sur le site AdiumXtras.com. Nous avons choisi le très populaire <b>renkoo</b> pour l'exemple. Les thèmes sont livrés sous la forme d'archives ZIP, qu'il faudra décompresser. Pour ce faire, rendez-vous dans le dossier de téléchargement, faites un clic-droit sur le fichier ZIP, et choisissez l'option de décompression dans le menu déroulant qui apparaît. Alternativement, avec le terminal, rendez vous dans le dossier de téléchargement (commande <b>cd</b>), puis utilisez la commande <b>unzip &lt;nom du fichier&gt;</b>.</p>
<p>Une fois le fichier décompressez, vous obtiendrez un répertoire portant un nom un peu spécial : <i><b>renkoo.AdiumMessageStyle</b></i> (<i>renkoo</i> étant le nom du thème, à substituer par le thème que vous avez choisi). Pour installer le thème dans Empathy, il faut déplacer ce dossier tout en le renommant afin de supprimer l'extension <i>AdiumMessageStyle</i>. </p>
<p>Pour Ubuntu, Debian, Mint et autres :<br />
1) Ouvrez une fenêtre de terminal ;<br />
2) Tapez :<br />
<code>sudo mv renkoo.AdiumMessageStyle /usr/share/adium/message-styles/renkoo</code><br />
puis tapez votre mot de passe administrateur.</p>
<p>Pour Fedora, RedHat et autres :<br />
1) Ouvrez une fenêtre de terminal ;<br />
2) Tapez :<br />
<code>su -c "mv renkoo.AdiumMessageStyle /usr/share/adium/message-styles/renkoo"</code><br />
puis tapez votre mot de passe administrateur.</p>
<p>Alternativement, vous pouvez procéder avec l'interface graphique, si vous possédez les droits suffisants pour écrire dans le dossier de destination. </p>
<p><a href="/public/posts/2011-06-19-empathy/EmpathyScreenshot2.png"><img src="/public/posts/2011-06-19-empathy/EmpathyScreenshot2-300x214.png" alt="" title="EmpathyScreenshot2" width="300" height="214" class="aligncenter size-medium wp-image-736" /></a></p>
<p>Il suffit d'ouvrir Empathy, d'aller dans le menu <b>Edit</b> &gt; <b>Preferences</b>, puis dans l'onglet <b>Themes</b> de la fenêtre qui s'ouvre, et de choisir le thème désiré. Au prochain démarrage, Empathy utilisera le thème sélectionné.</p>
<h2>Modifier un thème</h2>
<p>Il est également possible de modifier les thèmes et, ceux-ci étant écrits en CSS, cela est très facile. Le thème livré par défaut avec Ubuntu est parfaitement satisfaisant, mais tel n'est pas le cas, par exemple, avec Fedora. On est alors tenté d'installer des thèmes Adium, mais l'on se heurte rapidement à un problème : la police n'est pas forcément adaptée, elle est éventuellement trop petite. Voici comment, pour l'exemple, agrandir la police des les fenêtres de discussion, en utilisant le thème <i>renkoo</i>.</p>
<p>Il faut d'abord trouver le fichier de configuration du thème. Celui-ci est situé à l'emplacement suivant :<br />
<code>/usr/share/adium/message-styles/renkoo/Contents/Ressources/main.css</code> (remplacez <i>renkoo</i> par le nom du thème que vous souhaitez modifier).</p>
<p><a href="/public/posts/2011-06-19-empathy/EmpathyScreenshot7.png"><img src="/public/posts/2011-06-19-empathy/EmpathyScreenshot7-300x168.png" alt="Le fichier main.css permettant de personnaliser le thème" title="EmpathyScreenshot7" width="300" height="168" class="size-medium wp-image-733" /></a></p>
<p>Pour modifier ce fichier, il suffit de l'ouvrir dans un éditeur de texte tel que <i>gedit</i> (gui) ou <i>nano</i> (console) :</p>
<p>Pour Ubuntu, Debian, Mint et autres :<br />
1) Ouvrez une fenêtre de terminal ;<br />
2) Tapez :<br />
<code>sudo gedit /usr/share/adium/message-styles/renkoo/Contents/Ressources/main.css</code><br />
puis tapez votre mot de passe administrateur.</p>
<p>Pour Fedora, RedHat et autres :<br />
1) Ouvrez une fenêtre de terminal ;<br />
2) Tapez :<br />
<code>su -c "nano /usr/share/adium/message-styles/renkoo/Contents/Ressources/main.css"</code><br />
puis tapez votre mot de passe administrateur.</p>
<p>Une fois le fichier ouvert, l'on peut faire toutes les modifications désirées ; celles-ci prendront effet, après enregistrement du fichier, au prochain démarrage d'Empathy. </p>
<p>Pour modifier la taille de la police, il faut modifier <i>la valeur en pixels</i> (passer de "11px" à "13px", par exemple) de la <i>propriété <b>font-size</b></i> de la classe <b>.message</b> :</p>
<p><a href="/public/posts/2011-06-19-empathy/EmpathyScreenshot4.png"><img src="/public/posts/2011-06-19-empathy/EmpathyScreenshot4-300x245.png" alt="" title="EmpathyScreenshot4" width="300" height="245" class="aligncenter size-medium wp-image-734" /></a></p>
<p>Voici le résultat, avant et après modification :</p>
<p><a href="/public/posts/2011-06-19-empathy/EmpathyScreenshot5.png"><img src="/public/posts/2011-06-19-empathy/EmpathyScreenshot5-300x118.png" alt="Avant modification" title="EmpathyScreenshot5" width="300" height="118" class="size-medium wp-image-732" /></a></p>
<p><a href="/public/posts/2011-06-19-empathy/EmpathyScreenshot6.png"><img src="/public/posts/2011-06-19-empathy/EmpathyScreenshot6-300x150.png" alt="Après modification" title="EmpathyScreenshot6" width="300" height="150" class="size-medium wp-image-731" /></a></p>
<p>Et pour finir, un exemple des commandes utilisées dans le Terminal, sous Fedora 15 :</p>
<p><a href="/public/posts/2011-06-19-empathy/EmpathyScreenshot3.png"><img src="/public/posts/2011-06-19-empathy/EmpathyScreenshot3-300x200.png" alt="" title="EmpathyScreenshot3" width="300" height="200" class="aligncenter size-medium wp-image-735" /></a></p>
