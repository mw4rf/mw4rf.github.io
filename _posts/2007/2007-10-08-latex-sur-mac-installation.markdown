---
layout: post
status: publish
published: true
title: 'LaTeX sur Mac : Installation'

  
  



excerpt: "LaTeX (prononcé \"leïtek\") est un puissant outil de formatage de texte et de mise en page. Il permet une configuration sans limite, contrairement aux différents traitements de texte présents sur le marché. Il n'utilise aucun format de fichier propriétaire : un document LaTeX est un fichier de texte brut contenant des \"instruction\", à la manière du code source d'un logiciel, qui seront interprétées par le moteur LaTeX pour générer un fichier prêt à être imprimé (PostScript, PDF, etc.). Cependant, l'immense potentiel de Latex ne va pas sans un inconvénient de taille : la complexité du système. Ce premier article a pour but de détailler la procédure d'installation d'un enviromment de travail LaTeX sur un système Mac OS X."
wordpress_id: 127
date: '2007-10-08 22:40:18 +0200'
date_gmt: '2007-10-08 21:40:18 +0200'
categories:
- Informatique
tags:
- Mac
- LaTeX
- software
- plaintext
permalink:  /2007/10/08/latex-sur-mac-installation/
---
<p>LaTeX (prononcé "leïtek") est un puissant outil de formatage de texte et de mise en page. Il permet une configuration sans limite, contrairement aux différents traitements de texte présents sur le marché. Il n'utilise aucun format de fichier propriétaire : un document LaTeX est un fichier de texte brut contenant des "instruction", à la manière du code source d'un logiciel, qui seront interprétées par le moteur LaTeX pour générer un fichier prêt à être imprimé (PostScript, PDF, etc.). Cependant, l'immense potentiel de Latex ne va pas sans un inconvénient de taille : la complexité du système. Ce premier article a pour but de détailler la procédure d'installation d'un enviromment de travail LaTeX sur un système Mac OS X.</p>
<p><a id="more"></a><a id="more-127"></a></p>
<p>Sommaire<br />
<a href="#1">1. Installation du moteur</a><br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#1A">1.1 Première méthode (simple & récente)</a><br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#1B">1.2 Seconde méthode (avancée & ancienne)</a><br />
<a href="#2">2. Installation d'un logiciel d'édition des fichiers LaTeX</a></p>
<p><a name="1"></a></p>
<h2>Étape #1 : Installation du moteur</h2>
<p>LaTeX repose sur un système d'interprétation et de compilation de code source. La première chose à faire est d'installer ce système.<br />
Il y a plusieurs manières d'installer LaTeX (malheureusement... car cela complique les choses). Si vous voulez une installation simple et rapide, suivez la première méthode. Si vous voulez une installation plus flexible, ou si vous avec un système ancien (OS 10.3 --), utilisez la seconde méthode.</p>
<p><a name="1A"></a></p>
<h3>Première méthode</h3>
<p>La première méthode d'installation est très simple. Elle est très "mac-friendly", c'est-à-dire qu'elle utilise la procédure standard d'installation des logiciels sous Mac OS X.</p>
<p>Rendez-vous sur <a href="http://tug.org/mactex/">la page de téléchargement du TeX Users Group (TUG)</a>, téléchargez et installez la dernière version de Tex (plus de 700 Mo). C'est tout !</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1517641217/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2260/1517641217_e83bf6c2c9.jpg" width="500" height="355" alt="Installer Latex sur Mac 15" align="center" /></a></p>
<p><a href="http://www.flickr.com/photos/valhallafr/1517640703/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2176/1517640703_1344d0bf13.jpg" width="500" height="355" alt="Installer Latex sur Mac 14" align="center" /></a></p>
<p><b><u>ou</u></b> (mais pas <i>et</i> : cela ferait double-emploi !)</p>
<p>2) Téléchargez une distribution de La/TeX personnalisée  à partir de <a href="http://www.tug.org/mactex/morepackages.html">la page des téléchargements additionnels du TeX Users Group (TUG)</a>:<br />
- MacTeX-Additions : contient tous les paquets additionnels nécessaires, mais pas le moteur Tex (si vous souhaitez l'installer depuis la distribution de Gerben Wierda, comme décrit dans la seconde méthode ci-dessous)<br />
- BasicTeX : tous les paquets nécessaires pour installer LaTex, sans les paquets additionnels. Vous pouvez utiliser ceci si vous ne souhaitez pas vous encombrer de plusieurs moteurs Tex ou de paquets que vous n'utiliserez jamais.</p>
<p>Quelle que soit la distribution que vous choisissez, un dossier <b>Tex</b> sera créé dans le dossier <b>Applications</b> de votre système. Ce dossier contient des logiciels très utiles comme BibTex (pour gérer les bibliographies) et TeXShop (<a href="#2">voir plus bas</a>).</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1517640385/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2025/1517640385_1d26565416_o.png" width="453" height="181" alt="Installer Latex sur Mac 13" align="center" /></a></p>
<p>Si vous installez plusieurs moteurs TeX, vous pourrez choisir le moteur à utiliser par le biais des préférences système (menu pomme). Ici, j'ai installé la distribution 2007 indiquée ci-dessus, ainsi que <i>gwTex</i> (<a href="#1B">seconde méthode, v. ci-dessous</a>).</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1518516604/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2153/1518516604_1e2d657c65.jpg" width="500" height="230" alt="Installer Latex sur Mac 16" align="center" /></a></p>
<p><a name="1B"></a></p>
<h3>Seconde méthode</h3>
<p>L'installation de la distribution TeX de Gerben Wierda sur Mac OS X ne pose pas de difficulté majeure, même si elle peut paraître assez longue et complexe au premier regard.</p>
<p>Pour installer LaTex, il faut d'abord se procurer un logiciel Mac appelé <i>i-Installer</i> :<br />
- [<a href="http://www.rna.nl/ii.html">Page d'accueil i-Installer</a>]<br />
- [<a href="ftp://ftp.tug.org/mirror/ftp.nluug.nl/pub/comp/macosx/volumes/ii2/II2.dmg">Téléchargement direct</a>]</p>
<p>Pour installer i-Installer, une fois le fichier téléchargé depuis les liens indiqués ci-dessus, il suffira de double-cliquer sur l'icône du fichier PKG et de suivre les instructions à l'écran (basiquement, cliquer sur "Suivant" plusieurs fois) : </p>
<p><a href="http://www.flickr.com/photos/valhallafr/1517831542/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2029/1517831542_ad3935e2c9_o.png" width="102" height="81" alt="Installer LaTex sur Mac 10" align="center" /></a></p>
<p>Une fois installé, i-Installer se trouve dans <b>Applications/Utilitaires</b>. </p>
<p><a href="http://www.flickr.com/photos/valhallafr/1517003405/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2273/1517003405_abc37248e2_o.png" width="102" height="81" alt="Installer Latex sur Mac 11" align="center" /></a></p>
<p>Lors du lancement du logiciel i-Installer, un message d'avertissement risque d'apparaître. Ce message a pour but de vous informer que ce logiciel n'est plus "supporté". C'est-à-dire que son auteur ne répond plus aux questions à propos de ce logiciel. Il continue néanmoins d'être mis à jour. Il est parfaitement fonctionnel, vous pouvez donc ignorer ce message.</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1517727276/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2133/1517727276_7535926b08_o.png" width="420" height="296" alt="Installer Latex sur Mac 1" align="center" /></a></p>
<p>Une fois le logiciel lancé, il faudra aller dans le menu <b>i-Package</b> puis <b>Known i-Package Directories</b> :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1517727118/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2414/1517727118_1e1ef6fd53_o.png" width="286" height="371" alt="Installer Latex sur Mac 2" align="center" /></a></p>
<p>Cela aura pour effet d'ouvrir une fenêtre qui permet, dans sa partie <i>gauche</i> de choisir un serveur et, dans sa partie <i>droite</i> de choisir les paquets (groupes de fichiers) à installer parmi ceux présents sur le serveur sélectionné. Le choix du serveur importe peu, à partir du moment où vous trouvez les paquets indiqués ci-dessous.</p>
<p>Le premier paquet à installer est le moteur LaTex. Il s'appelle <b>gwTex based on Tex Live</b> dans les dernières versions. Il est possible que vous le trouviez sous un nom différent : par exemple, <b>Tex</b> ou <b>LaTex</b>.</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1517726894/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2077/1517726894_a0cf68e9a9.jpg" width="500" height="400" alt="Installer Latex sur Mac 3" align="center" /></a></p>
<p>Une fois le paquet sélectionné, cliquez sur le bouton <b>Open i-Package</b>. Cela aura pour effet de faire apparaître une nouvelle fenêtre (v. ci-dessous). Dans cette fenêtre, cliquez sur le bouton <b>Install & Configure</b>. Vous devrez peut-être entrer votre mot de passe administrateur Mac OS X.</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1517726502/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2302/1517726502_d11b03bdb5.jpg" width="500" height="480" alt="Installer Latex sur Mac 4" align="center" /></a></p>
<p>Un message d'alerte apparaîtra à l'écran. i-Installer vous demande quel type d'installation vous souhaitez : une installation standard, complète ou personnalisée. Je vous conseille l'installation complète (<b>full</b>).</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1517726248/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2284/1517726248_bea8dc0dab_o.png" width="424" height="225" alt="Installer Latex sur Mac 5" align="center" /></a></p>
<p>L'installation du moteur LaTex requiert le téléchargement préalable de nombreux fichiers. Cela peut prendre un certain temps, en fonction de la vitesse de votre connexion internet. Avez l'ADSL 8 Mb chez moi, cela a pris un petit quart d'heure. Après le téléchargement, i-Installer installe automatiquement les fichiers téléchargés. Une fois les opérations terminées, le message suivant devrait apparaître :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1516874831/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2061/1516874831_132f4c8800_o.png" width="424" height="125" alt="Installer Latex sur Mac 6" align="center" /></a></p>
<p>Vous devrez ensuite répéter les étapes précédentes pour installer (au moins et en fonction de vos besoins) les paquets suivants :<br />
- <b>Ghostscript</b> (paquet nécessaire)<br />
- <b>CM Super</b> (police Computer Modern, paquet conseillé)<br />
- <b>MusixTex</b> (paquet conseillé)<br />
- <b>ImageMagick</b> (paquet nécessaire) : si le bouton d'installation est grisé ou si des messages d'erreur concernant des "dépendances" (libiconv, sous Mac OS 10.4) surviennent, vous pouvez les ignorer et poursuivre l'installation.<br />
- <b>FreeType 2</b> (paquet conseillé)<br />
- <b>FontUtilities</b> (paquet conseillé)</p>
<p>Notez que vous pouvez aussi installer ces paquets avec la distribution Tex Live (<a href="#1A">première méthode</a>).</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1517725940/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2073/1517725940_6f70d0d369.jpg" width="500" height="480" alt="Installer Latex sur Mac 7" align="center" /></a></p>
<p><a href="http://www.flickr.com/photos/valhallafr/1516874283/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2312/1516874283_e8d272a99e.jpg" width="500" height="480" alt="Installer Latex sur Mac 9" align="center" /></a></p>
<p>Dans la fenêtre d'installation (que vous aurez largement le temps d'observer...), plusieurs éléments sont importants :<br />
1) Le bouton <b>Install & Configure</b> ou <b>Install</b> qui permet de lancer l'installation.<br />
2) Les barres de progression. Celle du haut indique la progression du télchargement, celle du bas la progression de l'installation des fichiers téléchargés.<br />
3) La petite "roue" : tant qu'elle toune, c'est que le téléchargement et l'installation sont en cours !</p>
<p>Si le message suivant apparaît, choisissez <b>Yes</b> (bien que choisir <b>No</b> n'aura pas des conséquences dramatiques...) :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1516874445/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2143/1516874445_6270d7221a_o.png" width="424" height="155" alt="Installer Latex sur Mac 8" align="center" /></a></p>
<p>&nbsp;</p>
<p><a name="2"></a></p>
<h2>Étape #2 : Installation d'un logiciel d'édition des fichiers LaTeX</h2>
<p>Comme il est indiqué dans l'introduction, les fichiers LaTeX sont des fichiers de <i>texte brut</i>. Cela signifie que, contrairement aux logiciels de traitement de texte habituels, vous ne trouverez pas de logiciel pour LaTeX dans lequel il suffit de cliquer sur une icône pour mettre du texte en gras ou en italique. Avec LaTeX, tout se fait <i>à la main</i>. L'avantage majeur est que n'importe quel logiciel d'édition de texte brut convient : TextEdit (fourni avec Mac OS X), par exemple. </p>
<p>Il existe cependant des logiciels plus évolués que TextEdit pour utiliser LaTeX. C'est notamment le cas de :<br />
- <a href ="http://www.uoregon.edu/~koch/texshop/texshop.html">TexShop</a> (gratuit) [<a href="http://www.uoregon.edu/~koch/texshop/texshop.dmg">Téléchargement direct OS 10.4 "Tiger"</a>] [<a href="http://www.uoregon.edu/~koch/texshop/texshop_1.43.dmg">Téléchargement direct OS 10.3 "Panther" et plus anciens</a>]<br />
- <a href ="http://www.macromates.com/">TextMate</a> (payant)<br />
- <a href ="http://itexmac.sourceforge.net/Download.html">iTeXMac</a> (gratuit)</p>
<p>TextMate est un éditeur de texte très puissant (que l'on peut paramétrer dans tous les sens) et qui est plutôt destiné aux programmeurs. C'est un excellent choix pour ceux qui prévoient d'utiliser LaTeX sur le long terme. </p>
<p>Pour la démonstration, j'ai choisi d'utiliser <a href ="http://www.uoregon.edu/~koch/texshop/texshop.html">TexShop</a>, simple d'utilisation et gratuit. Pour l'installer, il suffira de glisser-déposer l'icône du logiciel dans le dossier <b>Applications</b> si vous l'avez téléchargé depuis le site de l'auteur. Il est installé par défaut avec la distribution TUG (voir ci-dessus, #1, première méthode) dans <b>Applications/Tex</b>.</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1517235165/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2293/1517235165_4939cbfa0f_o.png" width="105" height="87" alt="Installer LaTex sur Mac 12" align="center" /></a></p>
<p>Au lancement, le logiciel affiche une page blanche. C'est à vous de la remplir avec le code LaTeX. Pour commencer, voici un exemple. Copiez/coller le texte suivant :</p>
<div class="Code">
\documentclass[11pt,a4paper]{article}<br />
\usepackage[french]{babel}<br />
\usepackage[latin1]{inputenc} </p>
<p>\title{Ceci est un test de \LaTeX !!}<br />
\date{\today}<br />
\author{Moi-même}</p>
<p>\begin{document}<br />
\maketitle</p>
<p>\section{Ceci est ma première section !!}  </p>
<p>\textit{Chapeau de la première section. En italique s'il-vous-plaît !}</p>
<p>\subsection{Première sous-section !}</p>
<p>... Et le corps du texte\footnote{Avec en prime, une note en bas de page.} !</p>
<p>\end{document}
</p></div>
<p>- La première ligne définit le type de document (<i>documentclass</i>) : ici, c'est un <b>article</b> (par opposition à <i>book</i> ou <i>report</i>) destiné à être imprimé sur des pages <b>A4</b> (format européen ; aux Etats-Unis, les pages sont plus étroites et plus longues, c'est le format <i>letter</i>) dans une police de taille <b>11</b>.<br />
- La deuxième ligne indique que l'on écrit en français. Il est <u>très important</u> d'indiquer la langue dans laquelle le texte sera rédigé (ou la langue principale, si plusieurs langues sont utilisées) pour que LaTeX puisse utiliser un dictionnaire de césure qui correspond à cette langue. Indiquer la langue permet également à LaTeX de prendre en compte les <u>accents</u> dans les mots.<br />
- La troisième ligne indique l'encodage du fichier. Ici, nous utilisons l'encodage ISO-8859-1 ou Latin 1. C'est l'<a href="http://www.valhalla.fr/index.php/2005/10/06/un-probleme-dencodage-peut-etre/">encodage</a> par défaut utilisé sous Windows et Linux et sur internet (cette page...) pour les documents en français. Sous Mac, l'encodage par défaut est Mac OS Roman : il faudra modifier cela lors de l'enregistrement du fichier : </p>
<p><a href="http://www.flickr.com/photos/valhallafr/1517750713/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2288/1517750713_008c7b1cc8_o.png" width="593" height="243" alt="Installer Latex sur Mac 17" align="center" /></a></p>
<p>- Les trois lignes suivantes définissent la page de garde du document : le titre, la date du jour (de la compilation) et l'auteur.<br />
- Les deux lignes qui viennent après indiquent au moteur LaTeX que le corps du document commence (begin...) et qu'il faut d'abord construire la première page (maketitle).</p>
<p>- Vient ensuite le corps du texte : une section, une sous-section, une phrase en italiques et une note en bas de page.<br />
- Finalement, le document est fermé par la balise <i>end</i>.</p>
<p>Vous devriez voir ceci dans TexShop :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1518659500/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2076/1518659500_6f44479fdb.jpg" width="348" height="500" alt="Installer Latex sur Mac 18" align="center" /></a></p>
<p>A partir de là, il n'y a plus qu'à cliquer sur le bouton <b>Typeset</b>. Une petite fenêtre s'ouvrira et indiquera l'évolution de la compilation (et les éventuelles erreurs) :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1518659146/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2301/1518659146_58814f79b3.jpg" width="500" height="364" alt="Installer Latex sur Mac 19" align="center" /></a></p>
<p>Vous devriez maintenant avoir 4 fichiers : </p>
<p><a href="http://www.flickr.com/photos/valhallafr/1518658510/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2145/1518658510_45da01ef9d_o.png" width="307" height="194" alt="Installer Latex sur Mac 21" align="center" /></a></p>
<p>- Le fichier <b>.tex</b> contient le code source (ce que vous venez de taper) : c'est ce qu'il faut garder, archiver, sauvegarder...<br />
- Le fichier <b>.log</b> contient le journal de compilation : vous pouvez le supprimer.<br />
- Le fichier <b>.aux</b> contient également des données relatives à la compilation : vous pouvez le supprimer.<br />
- Le fichier <b>.pdf</b> est le réultat final de la compilation : un beau fichier PDF que vous pouvez ouvrir dans <i>Aperçu</i> ou <a href="http://www.adobe.com/fr/products/acrobat/readstep2.html">Adobe Acrobat</a>.</p>
<p>Bravo, vous venez de créer votre premier fichier LaTeX !</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1517806001/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2052/1517806001_7220e4b97f.jpg" width="442" height="500" alt="Installer Latex sur Mac 20" align="center" /></a></p>
