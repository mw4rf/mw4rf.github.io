---
layout: post
status: publish
published: true
title: Lancer Intellij IDEA 13 Mac avec un JDK Oracle
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "<p>IntelliJ IDEA est sans doute, actuellement, le meilleur IDE Java. Or,
  les développeurs Java sérieux ne peuvent se contenter du JRE 1.6 fourni par Apple
  dans Maverick (et la bêta publique de Yosemite, à l'heure où j'écris ces lignes).</p>\r\n<p>Problème
  : IntelliJ réclame la présence du JRE fourni par Apple et refuse de se lancer, même
  si un JDK Oracle, 1.7 ou 1.8 est installé sur la machine.</p>\r\n<p>La solution
  est facile, mais encore faut-il la connaître.</p>\r\n"
wordpress_id: 904
wordpress_url: http://www.valhalla.fr/?p=904
date: '2014-08-01 16:46:07 +0200'
date_gmt: '2014-08-01 12:46:07 +0200'
categories:
- Informatique
- Mac
- Java
tags:
- Java
- programmation
permalink:  /2014/08/01/lancer-intellij-idea-13-mac-avec-un-jdk-oracle/
---
<p>IntelliJ IDEA est sans doute, actuellement, le meilleur IDE Java. Or, les développeurs Java sérieux ne peuvent se contenter du JRE 1.6 fourni par Apple dans Maverick (et la bêta publique de Yosemite, à l'heure où j'écris ces lignes).</p>
<p>Problème : IntelliJ réclame la présence du JRE fourni par Apple et refuse de se lancer, même si un JDK Oracle, 1.7 ou 1.8 est installé sur la machine.</p>
<p>La solution est facile, mais encore faut-il la connaître.</p>
<p><a id="more"></a><a id="more-904"></a></p>
<p>Pour résoudre le problème, il faut effectuer un clic droit sur l'icône d'IntelliJ, qui se trouve dans le dossier Applications, et choisir « Afficher le contenu du paquet » dans le menu déroulant. Une fenêtre du Finder s’ouvre. Il faut ensuite ouvrir le dossier Contents, puis le fichier Info.plist (en double-cliquant dessus, ou dans n’importe quel éditeur de texte brut).</p>
<p>Dans le fichier Info.plist, il faut rechercher :</p>
<p><code>&lt;key&gt;JVMVersion&lt;/key&gt;</code><br /><code>&lt;string&gt;1.6*&lt;/string&gt;</code></p>
<p>et remplacer par</p>
<p><code>&lt;key&gt;JVMVersion&lt;/key&gt;</code><br /><code>&lt;string&gt;1.8*&lt;/string&gt;</code></p>
<p>Et voilà !</p>
