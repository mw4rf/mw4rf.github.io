---
layout: post
status: publish
published: true
title: Comment ex&eacute;cuter une commande syst&egrave;me depuis un programme Java
  ?
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 64
wordpress_url: http://blog.gfblog.com/index.php/2001/03/17/comment-excuter-une-commande-systme-depuis-un-programme-java/
date: '2001-03-17 12:03:47 +0100'
date_gmt: '2001-03-17 10:03:47 +0100'
categories:
- Java
tags:
- programmation
- Java
permalink:  /2001/03/17/comment-excuter-une-commande-systme-depuis-un-programme-java/
---
<p>Cet article explique comment ex&eacute;cuter une commande syst&egrave;me, c'est-&agrave;-dire comment faire pour que Java transmette au syst&egrave;me d'exploitation une commande destin&eacute;e normalement &agrave; une console (fen&ecirc;tre MS-DOS sous Windows, Terminal sous UNIX, etc...).</p>
<p>Concr&egrave;tement, si vous d&eacute;sirez ex&eacute;cuter dans l'ordre les instructions suivantes en ligne de commande:<br />
  - <span class="Code">cd C:\Program Files\Microsoft Office\Office\</span><br />
  - <span class="Code">Winword.exe</span><br />
  de mani&egrave;re &agrave; se placer dans le r&eacute;pertoire C:\Program Files\Microsoft Office\Office\ et &agrave; lancer Word 2000, le programme Java peut le faire pour vous. (Dans cet exemple, on peut se passer de la commande cd pour lancer Word, mais c'est aussi pour montrer que l'on ne se limite pas au lancement d'un programme, mais que l'on peut aussi ex&eacute;cuter d'autres commandes).</p>
<p>Ce genre de fonctions sous Java permet, entre autres, de lancer des logiciels externes (ici Word) depuis une application Java, ou de remplacer un script Bash.</p>
<p>Voici la proc&eacute;dure:<br />
  (NOTE: si vous connaissez un peu les syst&egrave;mes d'exploitation et la programmation syst&egrave;me, ne vous arr&ecirc;tez pas aux explications minimales -et tr&egrave;s imparfaites- concernant des concepts abstraits comme Runtime ou Processus...)</p>
<p>1 - Cr&eacute;er un objet String qui contient la commande exacte que vous taperiez si vous &eacute;tiez sous la ligne de commande, par exemple:</p>
<p class="Code">// par exemple sous Windows<br />
  String command = &quot;C:\Program Files\Microsoft Office\Office\Winword.exe&quot;;<br />
  // ou sous Linux 2.2.x<br />
String command = &quot;ipchains -P input DENY&quot;;</p>
<p>2 - Cr&eacute;er un objet Runtime et lui assigner le &quot;runtime&quot; (c-&agrave;-d l'environnement d'ex&eacute;cution, le noyau du syst&egrave;me en quelque sorte) courant:</p>
<p class="Code">Runtime runtime = Runtime.getRuntime();</p>
<p>3 - Cr&eacute;er un nouveau processus, celui destin&eacute; &agrave; g&eacute;rer notre commande:</p>
<p class="Code">Process process = null;</p>
<p>4 - Utiliser - assigner au processus - la fonction exec de la classe Runtime avec comme param&egrave;tre notre String , ceci est susceptible de g&eacute;n&eacute;rer des exceptions, nous devons donc les &quot;attraper&quot;:</p>
<p class="Code">try<br />
  {<br />
  process = runtime.exec(command);<br />
} catch(Exception err) {;}</p>
<p>Si tout se passe bien, la commande est ex&eacute;cut&eacute;e, comme si vous l'aviez saisie dans une console.<br />
  NOTE: sous Unix, il faudra lancer le programme en tant que root pour que des commandes qui requi&egrave;rent des privil&egrave;ges &eacute;lev&eacute;s soient ex&eacute;cut&eacute;es.</p>
<p>Tutoriel distribu&eacute; pour le FAQ Java de Java-France www.java-france.com / www.jgflsoft.com<br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG. <br />
  &Eacute;crit &agrave; Montpellier le 17 mars 2001</p>
