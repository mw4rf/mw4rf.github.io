---
layout: post
status: publish
published: true
title: 'Natural Scrolling & Linux '

  
  



excerpt: "Avec OS X \"Lion\", Apple a inversé le sens du défilement avec le Touchpad
  : glisser les doigts vers le bas ne fait plus descendre l’ascenseur sur le côté
  de la fenêtre, et le contenu avec lui, mais \"tire\" la page vers le bas faisant
  ainsi remonter le contenu. Voici comment reproduire ce comportement sous Linux.\r\n\r\n"
wordpress_id: 804
wordpress_/?p=804
date: '2011-07-27 21:02:43 +0200'
date_gmt: '2011-07-27 19:02:43 +0200'
categories:
- Informatique
tags:
- hardware
- Linux
- Apple
- os x
- lion
- configuration
- X Server
permalink:  /2011/07/27/natural-scrolling-linux/
---
<p>Avec OS X "Lion", Apple a inversé le sens du défilement avec le Touchpad : glisser les doigts vers le bas ne fait plus descendre l’ascenseur sur le côté de la fenêtre, et le contenu avec lui, mais "tire" la page vers le bas faisant ainsi remonter le contenu. Voici comment reproduire ce comportement sous Linux.</p>
<p><a id="more"></a><a id="more-804"></a></p>
<p><strong>Prérequis</strong> :
<ul>
<li>Serveur X</li>
<li>Touchpad Synaptics</li>
</ul>
<p><b>Version courte</b></p>
<p>Créez le fichier <code>~/.Xmodmap</code> avec le contenu qui suit et redémarrez X :</p>
<p><code>pointer = 1 2 3 5 4 6 7 8 9 10 11 12</code></p>
<p><b>Version longue</b></p>
<p>1) Ouvrez une fenêtre de <b>Terminal</b><br />
2) Tapez : <code>sudo nano ~/.Xmodmap</code><br />
3) Tapez votre mot de passe, puis Entrée<br />
4) Recopiez cette ligne :<br />
<code>pointer = 1 2 3 5 4 6 7 8 9 10 11 12</code><br />
5) Tapez <b>Ctrl+O</b> puis <b>Ctrl+X</b><br />
6) Fermez votre session et reconnectez-vous.</p>
