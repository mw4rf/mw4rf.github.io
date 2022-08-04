---
layout: post
status: publish
published: true
title: Localiser la musique achetée sur l'iTunes Store

  
  



excerpt: "<a href=\"http://www.flickr.com/photos/valhallafr/905373894/\" title=\"Partage
  de photos\"><img src=\"http://farm2.static.flickr.com/1437/905373894_9addbcc661_o.jpg\"
  width=\"102\" height=\"129\" alt=\"Fichier AAC MP4 iTunes DRM\" align=\"left\" style=\"margin-right:15px;\"
  /></a>\r\n<p>iTunes a l'avantage de «maintenir organisé le dossier» qui contient
  la bibliothèque musicale. Le logiciel copie également dans ce dossier tout nouveau
  morceau ajouté à la bibliothèque (option à choisir dans les préférences, onglet
  «Avancé» > «Général»). Il peut alors être difficile de savoir quels sont les morceaux
  achetés sur l’iTunes Store munis --ou, plutôt, <i>grevés</i>-- de DRM parmi plusieurs
  milliers de morceaux, dont la plupart seront des MP3 (issus de l’importation de
  CD ou du téléchargement) sans DRM. Je vous propose ici plusieurs méthodes pour retrouver
  ces morceaux, et les fichiers associés dans le Finder.</p>\r\n"
wordpress_id: 122
wordpress_/index.php/2007/07/26/localiser-la-musique-achetee-sur-litunes-stores/
date: '2007-07-26 14:06:44 +0200'
date_gmt: '2007-07-26 13:06:44 +0200'
categories:
- Informatique
tags:
- Mac
- software
- Windows
permalink:  /2007/07/26/localiser-la-musique-achetee-sur-litunes-store/
---
<p><a href="http://www.flickr.com/photos/valhallafr/905373894/" title="Partage de photos"><img src="http://farm2.static.flickr.com/1437/905373894_9addbcc661_o.jpg" width="102" height="129" alt="Fichier AAC MP4 iTunes DRM" align="left" style="margin-right:15px;" /></a></p>
<p>iTunes a l'avantage de «maintenir organisé le dossier» qui contient la bibliothèque musicale. Le logiciel copie également dans ce dossier tout nouveau morceau ajouté à la bibliothèque (option à choisir dans les préférences, onglet «Avancé» > «Général»). Il peut alors être difficile de savoir quels sont les morceaux achetés sur l’iTunes Store munis --ou, plutôt, <i>grevés</i>-- de DRM parmi plusieurs milliers de morceaux, dont la plupart seront des MP3 (issus de l’importation de CD ou du téléchargement) sans DRM. Je vous propose ici plusieurs méthodes pour retrouver ces morceaux, et les fichiers associés dans le Finder.</p>
<p><a id="more"></a><a id="more-122"></a></p>
<p></p>
<p><u>La première méthode</u> consiste à se placer dans la liste de lecture «<b>Achats</b>» dans iTunes. Elle se trouve parmi les autres listes de lecture, dans la partie gauche de la fenêtre, dans la section «Store» en dessous de «iTunes Store». Tous les morceaux achetés avec iTunes sont placés dans cette liste de lecture. Ils y seront toujours, à moins de les avoir manuellement enlevés. Cette méthode fonctionne à la fois avec iTunes Mac et iTunes Windows. Pour afficher dans le Finder le fichier correspondant à un morceau, il suffit de faire un clic-droit sur le morceau désiré et de choisir «Afficher dans le Finder» dans le menu déroulant.</p>
<p></p>
<p><u>La seconde méthode</u>, qui ne fonctionne que sous Mac OS X, consiste à créer un dossier intelligent avec Spotlight. On peut pour cela te baser sur 2 critères : 1) soit l'extension du fichier spécifique des fichiers achetés sur l’iTunes Store --il s’agit de l’extension<b> </b><b>.m4p</b>-- ; 2) soit le codec utilisé, également propre aux morceaux de l’iTunes Store : codec AAC avec DRM «Fairplay» --le codec est identifié sous le nom <b>AAC (protected)</b> --. On peut aussi cumuler les deux critères, comme dans l’exemple qui suit.</p></p>
<p>Voici la marche à suivre:</p>
<p>-- Cliquer sur le bureau et choisir <i>Fichier > Nouveau dossier intelligent</i>.</p>
<p>-- Par défaut, deux critères sont présents: <i>Type</i> et <i>Ouverture</i>. Il faut les modifier. Pour cela, on commence par cliquer sur «<i>Type</i>» et on choisit «<b>Autres...</b>» dans le menu déroulant. Une petite fenêtre s'ouvre, dans laquelle on choisira le critère «<b>Codecs</b>». On recommence ensuite l'opération avec le critère «<i>Ouverture</i>» que l'on change pour le critère «<b>Extension du nom</b>».</p>
<p>-- On définit ensuite les paramètres de recherche. Pour le critère «Codecs», il faut entrer en paramètre <u><b>AAC (protected)</b></u>. Pour le critère «Extension du nom», il faut entrer <u><b>m4p</b></u>.</p>
<p></p>
<p>Voici une capture d'écran:</p>
<p><a href="http://www.flickr.com/photos/valhallafr/903109478/" title="Partage de photos"><img src="http://farm2.static.flickr.com/1343/903109478_adce61adef.jpg" width="500" height="180" alt="DRM Spotlight" /></a></p>
<p></p>
<p><u>La troisième méthode</u>, qui est aussi exclusive de Mac OS X, consiste à utiliser le Terminal. Voici un exemple pour trouver tous les fichiers EMI (iTunes Plus) de la bibliothèque iTunes (<span class="s2"><a href="http://www.macosxhints.com/article.php?story=20070404130313429">source</a></span>).</p>
<p></p>
<p>- Ouvrir le <b>Terminal</b> (... taper «Terminal» dans Spotlight ou double-cliquer sur l’icône «Terminal» dans /Applications/Utilitaires).</p>
<p>- Copier les commandes ci-dessous et les coller dans la fenêtre de terminal. Appuyer ensuite sur la touche Entrée (si nécessaire).</p>
<p></p>
<p class="Code"><b>mdfind -onlyin ~/Music/iTunes/iTunes Music "kMDItemCopyright == '*Emi*' kMDItemCodecs == '*protected*' " &gt; ~/Desktop/musiqueEMI.txt</b></p>
<p></p>
<p>-- Ouvrir le fichier <b>musiqueEMI.txt</b> situé sur le bureau pour avoir la liste des fichiers EMI de la bibliothèque iTunes.</p>
