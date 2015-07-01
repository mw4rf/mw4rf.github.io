---
layout: post
status: publish
published: true
title: 'Ubuntu Software Center : tester avant d''installer'
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "Une fonction peu connue de la logithèque Ubuntu (Software Center) permet
  de tester des logiciels avant de les installer. La fonction est désactivée par défaut,
  mais son activation est simple et rapide. Elle ne fonctionne pas avec tous les logiciels
  --loin de là--, et ne donne pas toujours de bons résultats... mais elle peut tout
  de même se révéler utile et surtout, elle est une exclusivité du monde Linux, car
  ni OSX ni Windows ne permettent de tester des logiciels avant de les installer.\r\n\r\n"
wordpress_id: 854
wordpress_url: http://www.valhalla.fr/?p=854
date: '2012-06-11 18:43:15 +0200'
date_gmt: '2012-06-11 16:43:15 +0200'
categories:
- Linux
tags:
- software
- Linux
- Logiciels
- Système
- ubuntu
- astuce
permalink:  /2012/06/11/ubuntu-software-center-tester-avant-dinstaller/
---
<p>Une fonction peu connue de la logithèque Ubuntu (Software Center) permet de tester des logiciels avant de les installer. La fonction est désactivée par défaut, mais son activation est simple et rapide. Elle ne fonctionne pas avec tous les logiciels --loin de là--, et ne donne pas toujours de bons résultats... mais elle peut tout de même se révéler utile et surtout, elle est une exclusivité du monde Linux, car ni OSX ni Windows ne permettent de tester des logiciels avant de les installer.</p>
<p><a id="more"></a><a id="more-854"></a></p>
<p>Le principe est simple: plutôt que d'installer une multitude de logiciels sur votre ordinateur au prix d'une détérioration des performances et de la stabilité du système d'exploitation, le logiciel <em>qtnx</em> vous permet d'ouvrir une session à distance sur un serveur afin de tester un logiciel. S'il vous convient, vous pourrez l'installer en local, sur votre ordinateur ; dans le cas contraire, votre système ne sera pas modifié.</p>
<p>Pour tester des logiciels avant de les installer, il faut (et il suffit) installer le paquet <strong>qtnx</strong>. Voici la commande à taper dans une fenêtre de terminal:</p>
<blockquote>
<pre><code>sudo apt-get install qtnx </code></pre>
</blockquote>
<p>C'est tout !</p>
<p>Après avoir installé qtnx, un nouveau bouton apparaîtra sous l'image de certains logiciels, dans la logithèque Ubuntu (v. en bas à droite de l'image) :</p>
<p><a href="/public/posts/2012-06-11-ubuntu-software-center/1.png"><img class="aligncenter size-medium wp-image-855" title="qtnx: un nouveau bouton dans la logithèque" src="/public/posts/2012-06-11-ubuntu-software-center/1-300x174.png" alt="" width="300" height="174" /></a></p>
<p>Le bouton se transforme alors en barre de progression, indiquant que la logithèque est en train de se connecter à un serveur distant sur lequel le logiciel est ou sera installé :</p>
<p><a href="/public/posts/2012-06-11-ubuntu-software-center/2.png"><img class="aligncenter size-medium wp-image-856" title="qtnx: progression de la connexion" src="/public/posts/2012-06-11-ubuntu-software-center/2-300x174.png" alt="" width="300" height="174" /></a></p>
<p>Une nouvelle icône apparaît dans le dock Unity :</p>
<p><a href="/public/posts/2012-06-11-ubuntu-software-center/3.png"><img class="aligncenter size-full wp-image-857" title="qtnx: icône dans le dock Unity" src="/public/posts/2012-06-11-ubuntu-software-center/3.png" alt="" width="89" height="227" /></a></p>
<p>Une fenêtre s'ouvre, avec un bureau distant. Un message d'avertissement s'affiche : n'utilisez pas cette session à distance pour des activités illicites, elle est réservée aux tests de logiciels ! Il suffit de valider ce message en cliquant sur OK.</p>
<p><a href="/public/posts/2012-06-11-ubuntu-software-center/4.png"><img class="aligncenter size-medium wp-image-858" title="qtnx: disclaimer" src="/public/posts/2012-06-11-ubuntu-software-center/4-300x175.png" alt="" width="300" height="175" /></a></p>
<p>Si le logiciel n'est pas installé sur le poste distant, il le sera automatiquement :</p>
<p><a href="/public/posts/2012-06-11-ubuntu-software-center/5.png"><img class="aligncenter size-medium wp-image-859" title="qtnx: installation" src="/public/posts/2012-06-11-ubuntu-software-center/5-300x175.png" alt="" width="300" height="175" /></a>Et puis, il se lancera :</p>
<p><a href="/public/posts/2012-06-11-ubuntu-software-center/6.png"><img class="aligncenter size-medium wp-image-860" title="qtnx: test du logiciel" src="/public/posts/2012-06-11-ubuntu-software-center/6-300x175.png" alt="" width="300" height="175" /></a></p>
<p>Testez-le et, quand vous aurez fini, fermez tout simplement la fenêtre. Il se peut que qtnx plante (v. image ci-dessous), mais peu importe : il a rempli son rôle, vous avez pu tester le logiciel à distance sans rien modifier à votre système local.</p>
<p><a href="/public/posts/2012-06-11-ubuntu-software-center/7.png"><img class="aligncenter size-medium wp-image-861" title="qtnx: bug" src="/public/posts/2012-06-11-ubuntu-software-center/7-300x79.png" alt="" width="300" height="79" /></a></p>
<p>Voici quelques ressources sur <em>qtnx</em>:</p>
<ul>
<li><a title="Ubuntu Software Center Lets You Test-Drive Applications Without Installing Them [Ubuntu 11.04]" href="http://www.webupd8.org/2011/03/ubuntu-software-center-lets-you-test.html">Ubuntu Software Center Lets You Test-Drive Applications Without Installing Them</a><a href="http://www.webupd8.org/2011/03/ubuntu-software-center-lets-you-test.html"> -- WebUP8 (Blog Ubuntu)</a></li>
<li><a href="http://en.wikipedia.org/wiki/NX_technology">NX Technology (Wikipedia)</a></li>
</ul>
