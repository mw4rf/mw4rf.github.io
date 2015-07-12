---
layout: post
status: publish
published: true
title: Installer et configurer un environnement d'exécution de servlets/JSP sous Windows
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 73
wordpress_url: http://blog.gfblog.com/index.php/2001/04/22/installer-et-configurer-un-environnement-dexecution-de-servletsjsp-sous-windows/
date: '2001-04-22 12:42:51 +0200'
date_gmt: '2001-04-22 10:42:51 +0200'
categories:
- Java
tags:
- programmation
- serveur
- windows
- java
permalink:  /2001/04/22/installer-et-configurer-un-environnement-dexecution-de-servletsjsp-sous-windows/
---
<p>Ce chapitre de la FAQ Java explique, pas &agrave; pas, comment installer et configurer un environnement de d&eacute;veloppement et d'ex&eacute;cution de servlets et de pages JSP sur une machine tournant sous Windows 95/98/Me (NT/2000 ?).<br />
Nous utiliserons le JSWDK de Sun (Java Servlets Web Development Kit). Vous pouvez aussi installer le serveur de Netscape ou Jakarta (pour Apache), mais nous nous centrerons ici sur l'inpl&eacute;mentation officielle de Sun.</p>
<p>1) Vous devez poss&eacute;der un JDK install&eacute; et configur&eacute; sur votre machine. </p>
<p>2) Vous devez t&eacute;l&eacute;charger &agrave; partir du site de Sun le JSWDK en cliquant ici. Le fichier &agrave; t&eacute;l&eacute;charger est au format ZIP. C'est une archive et vous avez besoin d'un programme externe pour la d&eacute;compresser, le shareware WinZip convient parfaitement.</p>
<p><img align="right" alt="JWSDK" src="./ressources/java/old/faq/install_jwsdk/install_jwsdk1.jpg" /></p>
<p>3) D&eacute;compressez l'archive ZIP &agrave; la racine de votre disque dur en cochant la case &quot;Use folders name&quot; comme dans l'illustration ci-dessous:</p>
<p>4) Lancez &quot;startserver.bat&quot; &agrave; partir de la ligne de commande. Il s'agit du fichier de commandes qui lancera le serveur sur votre machine, il se trouve &agrave; la racine du r&eacute;pertoire d'installation du JSWDK. Voici ce qui devrait vous &ecirc;tre retourn&eacute;:</p>
<p>5) Vous pouvez maintenant utiliser le serveur et le tester dans un navigateur:<br />
  - ouvrez un navigateur web<br />
  - tapez dans la zone d'url: <strong>http://localhost:8080/</strong> ou <strong>http://127.0.0.1:8080/</strong><br />
  - une page d'accueil doit appara&icirc;tre. Si c'est le cas, tout fonctionne bien, votre environnement de servlets est bien install&eacute; !</p>
<p><img align="right" alt="JWSDK" src="./ressources/java/old/faq/install_jwsdk/install_jwsdk2.jpg" /></p>
<p>6) Nous allons maintenant le configurer ! Pour cela, ouvrez dans un &eacute;diteur de texte brut (pas de Microsoft Word ou autre chose du genre, utilisez NotePad !) le fichier &quot;webserver.xml&quot; situ&eacute; &agrave; la racine du r&eacute;pertoire d'installation.<br />
  Vous n'avez normalement &agrave; changer les valeurs propos&eacute;es qu'en cas de probl&egrave;me, ou si vous d&eacute;sirez param&eacute;trer manuellement votre serveur. A titre indicatif, les valeurs par d&eacute;faut sont les suivantes:</p>
<p>Port Number	<strong>8080</strong><br />
  Bound IP Address	<strong>all</strong> (tous)<br />
  Admin Port	<strong>N'importe quel port entre 2048 et 8192</strong><br />
  Document Base	<strong>Une page html</strong><br />
  Work directory for Temporary Files	work <strong>par d&eacute;faut</strong><br />
  Session inactive max. interval	<strong>30 minutes</strong></p>
<p>  Tutoriel distribu&eacute; pour le FAQ Java de Java-France www.java-france.com / www.jgflsoft.com<br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG. <br />
  Ecrit &agrave; Montpellier le 22 avril 2001</p>
