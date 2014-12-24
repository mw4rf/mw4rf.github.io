---
layout: post
status: publish
published: true
title: Comment naviguer sur Internet avec un JEditorPane ?
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 70
wordpress_url: http://blog.gfblog.com/index.php/2001/08/31/comment-naviguer-sur-internet-avec-un-jeditorpane/
date: '2001-08-31 12:33:10 +0200'
date_gmt: '2001-08-31 10:33:10 +0200'
categories:
- Java
tags:
- Internet
- programmation
- Java
---
<p>Cet article de la FAQ Java de l'association Java-France a pour but d'expliquer la proc&eacute;dure &agrave; suivre pour afficher des pages HTML, qui r&eacute;pondent aux liens, dans un JEditorPane ou un JTextPane (m&ecirc;me proc&eacute;dure). En effet, ces deux composnats (JTextPane h&eacute;ritant de JEditorPane) impl&eacute;mentent des m&eacute;thodes compliqu&eacute;es (plusieurs milliers de lignes de code) permettant de formater un document au format HTML, et de lancer une connexion pour afficher une nouvelle page si l'on clique sur un lien.</p>
<p>Nous allons donc voir, en 3 points, comment faire pour mettre en place un tel JEditorPane.</p>
<p>1) Le d&eacute;clarer, l'ins&eacute;rer dans l'interface (dans un JScrollPane de pr&eacute;f&eacute;rence), et faire tout ce qu'il faut pour qu'il s'affiche dans ue fen&ecirc;tre quand on lance le programme.</p>
<p>2) L'interdire en &eacute;criture: <span class="Code">editorPane.setEditable(false);</span></p>
<p>3) Cr&eacute;er un gestionnaire d'&eacute;v&egrave;nements &quot;HyperlinkListener&quot;.</p>
<p class="Code">editorPane.addHyperlinkListener(new HyperlinkListener()<br />
  { public void hyperlinkUpdate(HyperlinkEvent event)<br />
  { if (event.geteventType() == HyperlinkEvent.EventType.ACTIVATED)<br />
  { try<br />
  {editorPane.setPage(event.getURL());<br />
  }catch(IOException ioe) {;}<br />
  }<br />
  }<br />
  }<br />
}); </p>
<p>Et voil&agrave; le travail ! </p>
<p>Tutoriel distribu&eacute; pour le FAQ Java de www.jgflsoft.com ou www.java-france.com<br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG. <br />
  Ecrit &agrave; Montpellier le 31 ao&ucirc;t 2001</p>
