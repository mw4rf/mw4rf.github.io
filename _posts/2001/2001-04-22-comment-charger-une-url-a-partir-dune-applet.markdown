---
layout: post
status: publish
published: true
title: Comment charger une URL à partir d'une applet ?
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 72
wordpress_url: http://blog.gfblog.com/index.php/2001/04/22/comment-charger-une-url-a-partir-dune-applet/
date: '2001-04-22 12:41:32 +0200'
date_gmt: '2001-04-22 10:41:32 +0200'
categories:
- Java
tags:
- programmation
- java
permalink:  /2001/04/22/comment-charger-une-url-a-partir-dune-applet/
---
<p>Ce &quot;How To&quot; explique comment charger une URL, autrement dit une page web, &agrave; partir d'une applet Java, ins&eacute;r&eacute;e dans une autre page web. Ceci ne posera aucun probl&egrave;me &agrave; un programmeur exp&eacute;riment&eacute; dans la programmation des applets, mais, &agrave; cause des restrictions de s&eacute;curit&eacute; desdites applets, cela peut en poser &agrave; des programmeurs qui ne seraient pas habitu&eacute;s &agrave; travailler avec Java sur Internet.<br />
  En effet, les applets Java sont con&ccedil;ues pour une s&eacute;crit&eacute; de l'h&ocirc;te optimale, il n'est donc pas possible de r&eacute;aliser certaines op&eacute;rations d'Entr&eacute;e/Sortie comme par exemple lire ou &eacute;crire des fichiers sur l'ordinateur de l'h&ocirc;te, ou sur un autre serveur que celui sur lequel est h&eacute;berg&eacute;e l'applet. C'est sur ce dernier point q'un probl&egrave;me peut se poser: la page web &agrave; charger peut ne pas &ecirc;tre sur le m&ecirc;me serveur que l'applet. Ainsi, si le code est mal &eacute;crit, une exception de s&eacute;curit&eacute; sera g&eacute;n&eacute;r&eacute;e, et la page ne sera pas charg&eacute;e. <br />
Nous allons voir ici comment faire pour &eacute;viter une telle exception. Le code &agrave; &eacute;crire est -tr&egrave;s- simple et court, le voici comment&eacute;:</p>
<p class="Code">/*<br />
  Nous devons en premier lieu savoir dans quel contexte est ex&eacute;cut&eacute;s l'applet, si s'agit, par exemple, de l'appletviewer ou d'un navigateur. S'il s'agit d'un navigateur, tout va bien !<br />
  */<br />
  AppletContext navigateur = getAppletContext();</p>
<p class="Code">/*<br />
  Nous devons ensuite damander &agrave; ce navigateur, qui est maintenant en parlant programmtion, l'objet navigateur de type AppletContext, de charger une page.<br />
  Dans notre exemple l'URL charg&eacute;e est http://www.jgflsoft.com, vous pouvez bien s&ucirc;r l'adapter comme vous le d&eacute;sirez, tant que l'argument pass&eacute; &agrave; la m&eacute;thode showDocument() est de type String.<br />
  */<br />
  navigateur.showDocument(&quot;http://www.java-france.com&quot;);</p>
<p>Et voil&agrave;, le tour et jou&eacute;, la page se chargera, il vous suffit d'int&eacute;grer ces deux commandes dans un gestionnaire d'&eacute;v&egrave;nements ou dans une m&eacute;thode !</p>
<p>Tutoriel distribu&eacute; pour le FAQ Java de Java-France www.java-france.com / www.jgflsoft.com<br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG. <br />
  Ecrit &agrave; Montpellier le 22 avril 2001</p>
