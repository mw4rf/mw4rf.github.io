---
layout: post
status: publish
published: true
title: Un problème d'encodage, peut-être ?
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 40
wordpress_url: http://localhost/~guillaume/gfblog/wordpress/?p=40
date: '2005-10-06 22:51:00 +0200'
date_gmt: '2005-10-06 20:51:00 +0200'
categories:
- Internet
- Mac
- Web
tags:
- Mac
- Internet
- programmation
- Linux
- Web
- Windows
- langue
- bases de données
---
<p>Les phrases et les mots qui apparaissent à l'écran sont composés de caractères. Il existe des caractères "normaux" (a,b,c,d...), des caractères accentués (é,è,à,ñ...), des caractères de ponctuation et des caractères spéciaux (tels que le symbole euro).</p>
<p><img align="right" style="border: 1px dotted #ccc" alt="Image 1" src="http://blog.gfblog.com/images/charset/charset1.png" /></p>
<p>Les ordinateurs (quel que soit le système d'exploitation, windows, mac, linux ou autre) gèrent l'affichage de ces caractères de manière binaire, en associant un code chiffré à chaque caractère (autrement dit, une série de 0 et de 1). La correspondance entre le code chiffré et le caractère tel qu'il apparaît à l'écran se fait par l'intermédiaire d'une table d'encodage, ou charset.</p>
<p>Malheureusement, il existe de multiples charsets. Le charset de base (ANSI) est anglo-saxon, il ne prend pas en compte les caractères accentués, et il est donc à exclure pour le français. Il existe également des charset pour les langues qui n'ont pas un alphabet latin: chinois, japonais, coréen, arabe, hébreux, etc. Et il existe une multitude de charsets, qui ne présentent que de minimes différentes les une entre les autres, pour la gestion des langues européennes.</p>
<p><img align="right" style="border: 1px dotted #ccc" alt="Image 2" src="http://blog.gfblog.com/images/charset/charset2.png" /></p>
<p>
Si un mauvais charset est appliqué à un bloc de texte, la conséquence pour l'affichage à l'écran des caractères non pris en compte sera désastreuse: ils seront remplacés par des espaces vides, d'autres caractères (bien souvent un point d'interrogation), ou des symboles vraiment bizarres venus d'une autre planète (si, si, ça arrive).</p>
<p><img align="right" style="border: 1px dotted #ccc" alt="Image 3" src="http://blog.gfblog.com/images/charset/charset3.png" /></p>
<p>
Il faut donc une correspondance exacte entre:<br />
- le charset avec lequel a été écrit le texte.<br />
- le charset avec lequel est affiché le texte.</p>
<h3>Sur Internet</h3>
<p>
Tous les navigateurs gèrent différents charsets. Cependant, pour les navigateurs en français, le charset par défaut est bien Latin 1. S'il a été modifié pour quelque raison que ce soit, vous devez le rétablir à sa valeur initiale.</p>
<ul>
<li />Pour modifier le charset de Firefox, rendez-vous dans le menu Affichage -> Encodage des caractères. Choisissez Occidental ISO-8859-1.
<li />Pour modifier le charset de InternetExplorer, rendez-vous dans le menu Affichage -> Codage (-> Plus) -> Europe Occidentale (ISO).
<li />Pour les autres navigateurs, la procèdure est semblable, même si le nom des menus peut changer.
</ul></p>
<p>
Attention, sur Mac le charset par défaut n'est pas ISO Latin 1 mais Mac OS Roman. Il s'agit d'un charset basé sur ISO Latin 1 mais comportant des caractères supplémentaires (tels que la pomme Apple). Vérifiez que vous utilisez, pour votre navigateur, le charset générique et non pas le charset natif Mac.</p>
<p>
En règle générale les navigateurs gèrent l'encodage de manière automatique. C'est-à-dire que vous n'avez pas à spécifier manuellement le charset à utiliser, le navigateur sait le détecter. Néanmoins, cette détection échoue parfois, pour une raison ou pour une autre (surtout avec IE ;-)</p>
<p>
Pour savoir quel est le charset utilisé sur une page Web, afficher le code source de cette page (habituellement clic-droit dans la page, et un menu déroulant offrant cette possibilité s'ouvrira) et chercher une ligne du type:<br />
<br /><span class="Code">&lt;meta http-equiv="Content-Type" content="text/html; charset=utf-8"&gt;</span></p>
