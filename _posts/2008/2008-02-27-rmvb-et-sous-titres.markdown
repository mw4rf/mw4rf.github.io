---
layout: post
status: publish
published: true
title: RMVB et sous-titres
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "On trouve tous les formats de vidéo sur Internet, certains sont très répandus,
  d'autres moins. Le plus répandu est certainement le format AVI, utilisant un codec
  DivX ou Xvid. A l'autre extrémité, le format RMVB (RealPlayer Media Files) est très
  peu souvent utilisé. Et pour cause... c'est un format dont la compatibilité laisse
  à désirer et qui souffre de terribles lacunes. Ainsi, il ne gère pas les sous-titres
  et seul le lecteur Real Media le reconnaît. En possession d'un fichier RMVB accompagné
  de sous-titres, j'ai recherché comment jouer la vidéo avec ces sous-titres. Voici
  le récit de l'aventure.\r\n\r\n"
wordpress_id: 137
wordpress_url: http://www.valhalla.fr/index.php/2008/02/27/rmvb-et-sous-titres/
date: '2008-02-27 19:52:21 +0100'
date_gmt: '2008-02-27 18:52:21 +0100'
categories:
- Actu & Humeur
- Informatique
tags:
- apple
- loisirs
permalink:  /2008/02/27/rmvb-et-sous-titres/
---
<p>On trouve tous les formats de vidéo sur Internet, certains sont très répandus, d'autres moins. Le plus répandu est certainement le format AVI, utilisant un codec DivX ou Xvid. A l'autre extrémité, le format RMVB (RealPlayer Media Files) est très peu souvent utilisé. Et pour cause... c'est un format dont la compatibilité laisse à désirer et qui souffre de terribles lacunes. Ainsi, il ne gère pas les sous-titres et seul le lecteur Real Media le reconnaît. En possession d'un fichier RMVB accompagné de sous-titres, j'ai recherché comment jouer la vidéo avec ces sous-titres. Voici le récit de l'aventure.</p>
<p><a id="more"></a><a id="more-137"></a></p>
<p>Il faut le dire dès à présent : ce format RMV est vraiment pitoyable. Une vidéo qui n'est même pas protégée par un DRM est très difficilement lisible avec d'autres logiciels que le lecteur Real. Les gens qui créent des fichiers RMVB devraient sérieusement envisager d'utiliser un autre format, facilement lisible sur différentes plateformes. Si la vidéo est destinée à être sous-titrée, alors il faut abandonner l'idée d'utiliser le format RMVB. En dehors du format AVI, point de solution satisfaisante.</p>
<p>Il existe pourtant une solution, qui n'a pas été facile à trouver. Elle est assez complexe mais elle permet, <i>in fine</i>, de lire les sous-titres en même temps que la vidéo. Pour parvenir à cela, j'ai essayé plusieurs méthodes.</p>
<h2>Premier essai : Lecture</h2>
<p>La première chose qui vient à l'esprit est d'essayer de lire le fichier avec différents logiciels prévus pour cela. Sur Mac, VLC (http://www.videolan.org) et MPlayer (http://www.mplayerhq.hu/) sont les deux meilleurs lecteurs. Malheureusement, aucun de ces deux logiciels ne permet de lire les fichiers RMVB (en l'occurrence, version 10 du codec). MPlayer permet tout juste de lire els versions 1 à 4 du codec, c'est-à-dire les fichiers RM. Il faudra parfois ruser et installer des bibliothèques externes pour lire ces fichiers. En ce qui concerne VLC, ce dernier n'est même pas capable de lire les vieux fichiers RM.</p>
<p>Les deux logiciels sont donc totalement incapables de lire les fichiers RMVB. Il faut chercher ailleurs. Après une brève investigation, j'ai renoncé à chercher une alternative au lecteur Real.</p>
<h2>Deuxième essai : Documentation</h2>
<p>Soit, partons sur le lecteur Real. Après tout, peut-être permettra-t-il de lire les sous-titres ? Et bien non. Il ne le permet pas. Ce n'est pas faute d'avoir cherché de la documentation sur le Web : il n'y a aucune possibilité en ce qui concerne les fichiers RMVB. La seule possibilité passe par un plug-in pour Windows qui exige des fichiers AVI. C'est bien évident : lorsqu'on a un fichier AVI, on n'essaie pas de le lire avec Real Player... Ce logiciel, en plus d'être horriblement lourd et mal fait, ne permet même pas de lire les fichiers SRT. Quelle honte ! Vraiment, ce format Real et le lecteur associé sont de véritables plaies !</p>
<h2>Troisième essai : Conversion</h2>
<p>Résumons nous : il est impossible de lire un fichier RMVB dans un autre lecteur que le lecteur Real et celui-ci ne gère pas les sous-titres au format SRT. Que faire ? Il reste l'option de convertir le fichier récalcitrant dans un autre format, AVI par exemple, qui pourra être lu par un lecteur décent gérant les sous-titres.</p>
<p>Pour convertir une vidéo sous Mac, il n'y a pas 36 solutions. Ou bien la vidéo est lisible par QuickTime et elle pourra être convertie dans de nombreux formats, ou elle ne l'est pas et il devient nécessaire de recourir à un logiciel tiers. Bien évidemment, les fichiers RMVB ne sont pas lisibles par QuickTime. J'ai donc tenté d'utiliser, sans succès, VisualHub (http://www.techspansion.com/visualhub/) et ffmpegx (http://homepage.mac.com/major4/fr/) qui sont les deux meilleurs logiciels de conversion pour Mac.</p>
<p>Dans les deux cas, la conversion a échoué. Ces logiciels basés sur de puissants outils Unix sont incapables de convertir une vidéo RMVB, codec version 10.</p>
<h2>Quatrième essai : Bidouillage</h2>
<p>Aucune des solutions "propres" n'ayant fonctionné, j'ai dû me replier sur une solution bien moins élégante. La vidéo n'est pas lisible en plein écran et deux logiciels de lecture vidéo doivent être lancés en même temps, ce qui exige un ordinateur relativement puissant. A part cela, j'ai réussi à avoir vidéo et sous-titres.</p>
<p>1) La première étape est la création d'une vidéo qui diffuse en boucle un écran noir. Il y a plusieurs manières de faire cela, mais celle qui passe par QuickTime est certainement la plus facile. </p>
<p>On commence par extraire une image noire sur 1 ou 2 secondes. Si vous avez une vidéo qui présente une telle image noire sur une durée d'au moins 1 seconde, utilisez-la (en général, au début ou à la fin de la vidéo). Sinon, vous pouvez capturer une courte séquence avec SnapzProX et l'enregistrer au format MOV.</p>
<p>Placez le curseurs de la barre de progression de QuickTime au début et à la fin de la séquence noire à extraire. Copiez ensuite cette séquence (Commande+C), créer une nouvelle vidéo QT (Commande+N) et collez la sélection (Commande+V). Collez-la à nouveau plusieurs fois, jusqu'à avoir un total d'une dizaine de secondes de vidéo. Sélectionnez tout (Commande+A), copiez (Commande+C) et collez (Commande+V) plusieurs fois. Répétez plusieurs fois l'opération jusqu'à ce que la vidéo soit assez longue (sa durée doit être au moins égale à celle de la vidéo RMVB).</p>
<p><center><a href="http://www.flickr.com/photos/valhallafr/2296768636/" title="Image 2 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3241/2296768636_6d67806efa_o.png" width="354" height="156" alt="Image 2" /></a></center></p>
<p>2) Une fois la vidéo "noire" créée, exportez la au format AVI. Vous pouvez l'exporter depuis QuickTime (Fichier>Exporter) ou enregistrer un fichier MOV (Fichier>Enregistrer sous...) et le convertir avec VisualHub ou ffmpegx.</p>
<p>3) Donnez le même nom à votre vidéo noire et au fichier SRT contenant les sous-titres, et placez les deux fichiers dans le même répertoire. Par exemple "Video-soustitres.avi" et "Video-soustitres.srt". Ouvrez ensuite le fichier AVI que vous venez de créer dans VLC, Mplayer ou QuickTime (ce dernier, sous réserve d'utiliser Perian - http://perian.org/).</p>
<p>4) Ouvrez votre fichier RMV dans le lecteur Real et arrangez les deux fenêtres de manière à avoir la vidéo RMVB en haut et la vidéo noire avec sous-titres juste en dessous. Ce n'est pas très beau, ce n'est pas très pratique, mais ça fonctionne !</p>
<p><center><a href="http://www.flickr.com/photos/valhallafr/2296763256/" title="Image 1 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3294/2296763256_c0229d8812.jpg" width="500" height="413" alt="Image 1" /></a></center></p>
