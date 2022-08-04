---
layout: post
status: publish
published: true
title: 'Fichiers EMF : galère sur Mac'

  
  



excerpt: "On m'a récemment transmis des fichiers portant l'extension EMF, générés
  sous Windows par un logiciel de généalogie. Généalogie impliquait que ces fichiers
  devaient être vus par différents membres de ma famille, sous Mac et PC, qui ne savaient
  pas comment les ouvrir. C'est pour cela que j'ai dû rechercher une solution. Elle
  n'est pas simple : elle fait intervenir plusieurs logiciels et de nombreuses manipulations.
  Voici donc le récit de l'aventure (car c'en est une), pour qui devrait également
  ouvrir de tels fichiers.\r\n\r\n"
wordpress_id: 135
date: '2007-12-31 11:18:40 +0100'
date_gmt: '2007-12-31 10:18:40 +0100'
categories:
- Informatique
tags:
- apple
- Graphisme
permalink:  /2007/12/31/fichiers-emf-galere-sur-mac/
---
<p>On m'a récemment transmis des fichiers portant l'extension EMF, générés sous Windows par un logiciel de généalogie. Généalogie impliquait que ces fichiers devaient être vus par différents membres de ma famille, sous Mac et PC, qui ne savaient pas comment les ouvrir. C'est pour cela que j'ai dû rechercher une solution. Elle n'est pas simple : elle fait intervenir plusieurs logiciels et de nombreuses manipulations. Voici donc le récit de l'aventure (car c'en est une), pour qui devrait également ouvrir de tels fichiers.</p>
<p><a id="more"></a><a id="more-135"></a></p>
<p>J'ai d'abord dû ouvrir les fichiers (1), puis les convertir dans un format lisible par tous (2) et, finalement, les imprimer (3).</p>
<h2>Ouvrir les fichiers</h2>
<p>Première chose à faire lorsqu'on est confronté à des fichiers inconnus : rechercher l'application qui les a générés. On en saura souvent un peu plus sur leur nature (surtout lorsque ce sont des fichiers binaires : images bitmap, images vecteurs, vidéo, texte, etc.). Le site <a href="http://filext.com/">FilExt</a> permet de dresser la liste des applications qui utilisent telle ou telle extension.</p>
<p>En l'occurrence, les <a href="http://filext.com/file-extension/EMF">fichiers EMF</a> sont des fichiers de type <i>Extended (Enhanced) Windows Metafile Format</i>. Autant dire qu'ils seront difficilement lisible sur Mac, vu les maigres efforts faits par Microsoft en matière d'interopérabilité ! Impression confirmée par la liste des logiciels capables de les ouvrir : ACDSee, MS Picture It, PaintShopPro, etc. Que des logiciels Windows ! Mais des logiciels Windows de <i>traitement d'images</i>. Voilà l'indication recherchée : ces fichiers contiennent des images.</p>
<p>Dès lors qu'on a déterminé la nature des fichiers (des images), on peut essayer de les ouvrir avec différents logiciels Mac prévus pour travailler avec des images. Premier essai raté avec Apple Aperçu (<i>Preview</i>) : il ne sait pas les lire. Qu'à cela ne tienne, on peut essayer avec le couteau suisse de l'image sur Mac, <a href="http://www.lemkesoft.com/">GraphicConverter</a>. De cette tentative non plus il ne ressort pas grand chose :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/2150942609/" title="Fichiers EMF : galère sur Mac 1 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2222/2150942609_1419f90282_o.jpg" width="456" height="521" alt="Fichiers EMF : galère sur Mac 1" align="center" /></a></p>
<p>Il va falloir sortir l'artillerie lourde : Adobe. Photoshop ne reconnaît pas ces fichiers. Mais Illustrator, lui, permet miraculeusement de les ouvrir.</p>
<p><a href="http://www.flickr.com/photos/valhallafr/2150942549/" title="Fichiers EMF : galère sur Mac 2 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2378/2150942549_e59c4ed149_o.jpg" width="429" height="427" alt="Fichiers EMF : galère sur Mac 2"  align="center" /></a></p>
<p>De manière assez étrange, OpenOffice peut également lire ces fichiers. J'ai cependant continué avec Illustrator, car OpenOffice ne permet pas de les exporter correctement.</p>
<h2>Convertir les fichiers</h2>
<p>Pour convertir les fichiers et les rendre lisible sur une majorité d'ordinateurs, il faut partir du logiciel qui permet de les ouvrir. En l'occurrence, Illustrator. Ce logiciel permet d'exporter dans divers formats : PNG, JPG, BMP, TGA, TIFF, etc. </p>
<p>Tant qu'à faire, autant utiliser un format populaire. On peut donc essayer PNG, JPG et BMP. On exclut <i>a priori</i> le format BMP, trop vieux, de trop mauvaise qualité. Restent PNG et JPG. Généralement, le format PNG donne de meilleurs résultats : il est moins destructeur et l'image finale aura une meilleure résolution.</p>
<p>Manque de chance : certains fichiers EMF sont tellement énormes (plus de 70 Mo en poids, plus de 90 pages en taille : 520 cm x 100 cm) que Illustrator ne peut les convertir en PNG ou JPG. </p>
<p><a href="http://www.flickr.com/photos/valhallafr/2151732458/" title="Fichiers EMF : galère sur Mac 3 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2110/2151732458_0b0e89581a_o.jpg" width="554" height="234" alt="Fichiers EMF : galère sur Mac 3" align="center"  /></a></p>
<p>Qu'à cela ne tienne, il reste un espoir : passer par Photoshop, logiciel spécialisé dans le traitement d'images. L'échange des fichiers entre Illustrator et Photoshop est une chose assez complexe. On peut toujours essayer d'enregistrer les fichiers au format natif Illustrator pour les ouvrir ensuite dans Photoshop, mais cela ne donnera pas forcément un bon résultat. On peut également exporter les fichiers depuis Illustrator dans le format Photoshop, mais l'opération est très longue. Je n'ai pas eu la patience d'atteindre la fin de l'exportation du premier fichier, j'ai arrêté l'opération au bout de 5 minutes...</p>
<p>Alors, que faire ? Essayer d'exporter les fichiers dans un format "neutre" que Photoshop pourra lire. Mon choix s'est porté sur le format EPS (PostScript). Ce fut une bonne idée. Les fichiers ainsi générés peuvent être ouverts directement dans Photoshop (au prix d'une courte conversion) et dans Apple Aperçu (au prix d'une longue conversion en PDF). En effet, les fichiers EPS ne sont pas des images, ce sont des instructions à destination de l'imprimante : celle-ci saura les interpréter pour imprimer le fichier exactement comme il doit l'être. Ce format professionnel est utilisé par les imprimeurs. </p>
<p><a href="http://www.flickr.com/photos/valhallafr/2151732386/" title="Fichiers EMF : galère sur Mac 4 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2298/2151732386_9dc2cc2edc_o.jpg" width="581" height="166" alt="Fichiers EMF : galère sur Mac 4"  align="center" /></a></p>
<p>Une fois les fichiers ouverts dans Photoshop, il reste à les exporter en JPG ou en PNG. Et c'est plus facile à dire qu'à faire. Pour y arriver, il faudra paramétrer avec soin les options d'exportation et réaliser de nombreux essais. Résolution trop haute et le fichier sera trop lourd (plusieurs centaines de Mo) ; résolution trop basse et les textes des arbres généalogiques seront flous, illisibles.</p>
<p><a href="http://www.flickr.com/photos/valhallafr/2150928237/" title="Fichiers EMF : galère sur Mac 5 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2157/2150928237_bff4bc6d85_m.jpg" width="121" height="240" alt="Fichiers EMF : galère sur Mac 5"  align="center" /></a></p>
<h2>Imprimer les fichiers</h2>
<p>Certaines images ne représentent que des branches de l'arbre généalogiques : elles tiennent sur une page ou deux. Pas de problème pour celles-là. Mais comment faire pour celles qui, représentant le tronc de l'arbre, se répartissent sur plusieurs dizaines de pages ?</p>
<p>Il doit certainement exister plusieurs façons de faire, mais j'en ai trouvé une particulièrement élégante avec Illustrator et je m'y suis tenu. La première étape consiste à placer tout le contenu imprimable dans la zone de travail du fichier Illustrator. Pour ce faire, on procède par à-coups en modifiant la taille du document (<i>File</i> > <i>Document Setup</i>) jusqu'à ce que l'image entière tienne à l'intérieur. </p>
<p><a href="http://www.flickr.com/photos/valhallafr/2150928125/" title="Fichiers EMF : galère sur Mac 6 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2096/2150928125_7cc19ab7d2_o.png" width="556" height="172" alt="Fichiers EMF : galère sur Mac 6"  align="center" /></a></p>
<p>Il s'agit ensuite d'imprimer le fichier (<i>File</i> > <i>Print</i>) et, dans la fenêtre présentant les options d'impression, de choisir de répartir l'image sur plusieurs pages. Attention cependant aux marges qu'il faudra éliminer, faute de quoi chaque découpe de l'image sera rognée.</p>
<p><a href="http://www.flickr.com/photos/valhallafr/2150942343/" title="Fichiers EMF : galère sur Mac 7 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2391/2150942343_a5aea2feb9.jpg" width="500" height="437" alt="Fichiers EMF : galère sur Mac 7" align="center" /></a></p>
