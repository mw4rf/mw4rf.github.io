---
layout: post
status: publish
published: true
title: Comment exporter un programme avec JBuilder ?
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 59
wordpress_url: http://blog.gfblog.com/index.php/2001/07/03/comment-exporter-un-programme-avec-jbuilder/
date: '2001-07-03 10:41:51 +0200'
date_gmt: '2001-07-03 08:41:51 +0200'
categories:
- Java
tags:
- programmation
- Web
- Java
---
<p>Ce chapitre de la FAQ a pour but de montrer comment exporter, sous la forme d'une archive JAR, un programme Java (application, applet, servlet, web app, bean, etc...). Nous utiliserons ici la situation la plus simple: une application (avec m&eacute;thode main()) export&eacute;e dans une archive JAR auto-ex&eacute;cutable. Nous d&eacute;taillerons les &eacute;tapes de la cr&eacute;ation d'une telle archive.</p>
<p>NOTE 1: Pour des raisons de temps notamment (JBuilder 5 n'est pas encore sortie en France   &agrave; l'heure de la r&eacute;daction de cet article), la version de JBuilder utilis&eacute;e sera la version US.</p>
<p>NOTE 2: cette page contient de nombreuses images, le temps de chargement peut &ecirc;tre assez long...</p>
<p>1) Lancer l'outil, ou wizard, d'exportation: Menu WIZARDS -&gt; ARCHIVE BUILDER</p>
<p><img alt="JarExport" src="./ressources/java/old/faq/jbuilder_jar/jar1.jpg" /></p>
<p>2) Premi&egrave;re &eacute;tape de l'exportation: le choix d'un format.</p>
<p><img alt="JarExport" src="./ressources/java/old/faq/jbuilder_jar/jar2.jpg" /></p>
<p>Nous choisissons ici le format &quot;Application&quot;. On peut cependant prendre &quot;Basic&quot; (comme &quot;Application&quot; mais non auto-ex&eacute;cutable), Applet pour exporter des applets, Web Start pour exporter des Web App, etc... Une description de chaque option est faite dans la case de la fen&ecirc;tre &quot;Description&quot;.</p>
<p>3) R&eacute;solution des d&eacute;pendances (1)</p>
<p>Un programme Java a la plupart du temps des d&eacute;pendances, c'est &agrave; dire des classes ou des packages absolument n&eacute;cessaires pour s'ex&eacute;cuter. Par exemple, un programme utilisant une interface graphique Swing devra absolument int&eacute;grer les classes du package Swing n&eacute;cessaires. Pas besoin de sp&eacute;cifier ici les classes du package Swing ou de tout autre package &quot;classique&quot; fourni avec le JDK. Par contre, si vous utilisez des biblioth&egrave;ques non fournies par d&eacute;faut (par exemple le VerticalFlowLayout de Borland). C'est &eacute;galement ici que l'on ajoutera &agrave; l'archive tous les fichiers non-java n&eacute;cessaires.</p>
<p>4) R&eacute;solution des d&eacute;pendances (2) </p>
<p><img alt="JarExport" src="./ressources/java/old/faq/jbuilder_jar/jar3.jpg" /></p>
<p>Vous ne ferez rien ici si aucun package autre que les packages par d&eacute;faut de Sun n'est n&eacute;cessaire &agrave; votre programme. Sinon vous devrez d&eacute;cider du niveau d'inclusion. Je conseille d'inclure toutes les classes et toutes les ressources, on perd un peu en taille du fichier, mais on est s&ucirc;r que tout fonctionnera !</p>
<p>5) Cr&eacute;er un fichier MANIFEST</p>
<p>Cette &eacute;tape n'est pas n&eacute;cessaire dans tous les cas, par exemple si vous avez choisi &quot;Basic&quot; &agrave; l'&eacute;cran (1), le fichier manifest ne sera par d&eacute;faut pas cr&eacute;&eacute;. Par contre pour &quot;Application&quot; il est n&eacute;cessaire: le fichier Manifest indique, entre autres, &agrave; l'interpr&eacute;teur Java quelle classe contient la m&eacute;thode main(), condition n&eacute;cessaire &agrave; l'auto-ex&eacute;cution de l'archive.</p>
<p><img alt="JarExport" src="./ressources/java/old/faq/jbuilder_jar/jar4.jpg" /></p>
<p>Vous pouvez choisir d'inclure un Manifest que vous avez cr&eacute;&eacute; vous m&ecirc;me, amis pourquoi se compliquer la vie quand JBuilder le g&eacute;n&egrave;re tout seul comme un grand ?!</p>
<p>6) Sp&eacute;cifier la classe main()</p>
<p><img alt="JarExport" src="./ressources/java/old/faq/jbuilder_jar/jar5.jpg" /></p>
<p>Un package, une archive, peuvent contenir plusieurs classes impl&eacute;mentant une m&eacute;thode main(). On d&eacute;finit ici laquelle des ces m&eacute;thodes main() devra &ecirc;tre signal&eacute;e au Manifest. On laissera coch&eacute;e la case &quot;Use the main class specified in the default runtime&quot; par d&eacute;faut. Lors de la premi&egrave;re ex&eacute;cution d'un programme (&agrave; moins que l'ossature de ce programme n'ait &eacute;t&eacute; cr&eacute;&eacute;e par JBuilder lui-m&ecirc;me), JBuilder vous demande quelle est la classe principale du programme, et c'est cette classe, contenant la m&eacute;thode main() dans le cas d'une application, qui sera utilis&eacute;e pour lancer le programme sous JBuilder (en runtime normal ou en debug), et qui sera ici consid&eacute;r&eacute;e comme la classe principale du programme &agrave; signaler comme telle au Manifest.</p>
<p>7) Observer</p>
<p><img alt="JarExport" src="./ressources/java/old/faq/jbuilder_jar/jar6.jpg" /></p>
<p>On voit une nouvelle ic&ocirc;ne dans l'inspecteur d'objets. Notre archive s'appelle &quot;Application&quot;, mais ne contient pas encore de fichier Jar. Pour cr&eacute;er r&eacute;ellement le fichier Jar nous devons &quot;reconstruire&quot; le programme.</p>
<p>8) Reconstruire</p>
<p><img alt="JarExport" src="./ressources/java/old/faq/jbuilder_jar/jar7.jpg" /></p>
<p>Pour &quot;reconstruire&quot; on peut soir faire un clic-droit sur l'ic&ocirc;ne &quot;Application&quot; et choisir &quot;Reconstruire&quot; (ou &quot;Rebuild&quot; en version US) afin de cr&eacute;er le fichier JAR. On peut aussi utiliser le bouton de la barre d'ic&ocirc;nes.</p>
<p>Ceci est tr&egrave;s pratique: &agrave; chaque compilation, JBuilder recr&eacute;e automatiquement le fichier JAR. Un exemple de compilation ci-dessous o&ugrave; l'on voit que JBuilder est en train de cr&eacute;er l'archive. (j'ai d&ucirc; m'y reprendre &agrave; plusieurs fois pour faire la capture d'&eacute;cran tellement que la cr&eacute;ation de cette archive, pour notre petit programme exemple, est rapide !)</p>
<p><img alt="JarExport" src="./ressources/java/old/faq/jbuilder_jar/jar9.jpg" /></p>
<p>Tutoriel distribu&eacute; pour le FAQ Java de Java-France www.java-france.com / www.jgflsoft.com<br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG <br />
  &Eacute;crit &agrave; Montpellier le 3 juillet 2001</p>
