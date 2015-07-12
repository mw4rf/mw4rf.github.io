---
layout: post
status: publish
published: true
title: 'LaTeX sur Mac : TextMate'
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "LaTeX est un puissant outil de formatage de texte et de mise en page. Il
  permet une configuration sans limite, contrairement aux différents traitements de
  texte présents sur le marché. Il n’utilise aucun format de fichier propriétaire
  : un document LaTeX est un fichier de texte brut contenant des “instruction”, à
  la manière du code source d’un logiciel, qui seront interprétées par le moteur LaTeX
  pour générer un fichier prêt à être imprimé (PostScript, PDF, etc.). Cependant,
  l’immense potentiel de Latex ne va pas sans un inconvénient de taille : la complexité
  du système. Ce deuxième article a pour but de présenter les fonctions spécifiques
  à LaTeX de l'éditeur de texte pour Mac <a href=\"http://www.macromates.com\">TextMate</a>.\r\n\r\n"
wordpress_id: 128
wordpress_url: http://www.valhalla.fr/index.php/2007/10/10/latex-sur-mac-textmate/
date: '2007-10-10 21:37:09 +0200'
date_gmt: '2007-10-10 20:37:09 +0200'
categories:
- Informatique
tags:
- Mac
- LaTeX
- software
permalink:  /2007/10/10/latex-sur-mac-textmate/
---
<p>LaTeX est un puissant outil de formatage de texte et de mise en page. Il permet une configuration sans limite, contrairement aux différents traitements de texte présents sur le marché. Il n’utilise aucun format de fichier propriétaire : un document LaTeX est un fichier de texte brut contenant des “instruction”, à la manière du code source d’un logiciel, qui seront interprétées par le moteur LaTeX pour générer un fichier prêt à être imprimé (PostScript, PDF, etc.). Cependant, l’immense potentiel de Latex ne va pas sans un inconvénient de taille : la complexité du système. Ce deuxième article a pour but de présenter les fonctions spécifiques à LaTeX de l'éditeur de texte pour Mac <a href="http://www.macromates.com">TextMate</a>.</p>
<p><a id="more"></a><a id="more-128"></a></p>
<p>Sommaire<br />
- <a href="#1">#1 : TextMate et LaTeX</a><br />
- <a href="#2">#2 : Coloration syntaxique</a><br />
- <a href="#3">#3 : Compiler un document LaTeX</a><br />
- <a href="#4">#4 : Utiliser les fonctions spécifiques à LaTeX</a><br />
- <a href="#5">#5 : Créer des fonctions spécifiques à LaTeX</a></p>
<p>Dans (<a href="http://www.valhalla.fr/index.php/2007/10/08/latex-sur-mac-installation/#2">le premier article</a> de cette série sur LaTeX, j'ai présenté rapidement le logiciel gratuit <a href="http://www.uoregon.edu/~koch/texshop/texshop.html">TeXShop</a>, conçu spécifiquement pour rédiger du contenu LaTeX. Si TeXShop est une bonne solution pour rédiger des documents LaTeX ponctuellement. Ceux d'entre vous qui prévoient d'utiliser LaTeX de manière intensive se tourneront plutôt vers TextMate, qui offre des fonctions bien plus puissantes. Quelques unes d'entre elles sont ici passées en revue.</p>
<p><a name="1"></a></p>
<h2>#1 : TextMate et LaTeX</h2>
<p>TextMate est un éditeur de texte. Il est destiné à être utilisé par les programmeurs (et, parmi eux, principalement par les programmeurs Web) pour créer du code source. LaTeX reposant sur un système de compilation de code source, TextMate est particulièrement adapté à la rédaction de documents LaTeX.</p>
<p>La fenêtre principale de TextMate se présente ainsi : </p>
<p><a href="http://www.flickr.com/photos/valhallafr/1522260005/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2356/1522260005_4d77731e40.jpg" width="480" height="500" alt="TextMate+LaTex 1" /></a></p>
<p>Plusieurs éléments sont importants dans cette fenêtre :<br />
1) <u>La zone d'édition du texte</u>. C'est à cet endroit que vous rédigerez vos documents LaTeX. La zone d'édition de texte de TextMate est très avancée : elle possède toutes les fonctions dignes d'un bon éditeur de texte, telles que l'indentation automatique, la fermeture automatique des tags, la création de groupes, etc.<br />
2) <u>La goutière de TextMate</u> affiche, entre autres, le numéro de chaque ligne. Ceci est particulièrement utile lorsqu'il s'agit de corriger une erreur de syntaxe dans un fichier LaTeX et que le compilateur indique le numéro de la ligne où l'erreur s'est produite. Une combinaison de touche suffit pour se rendre à la ligne désirée : <b>Commande + L</b>.<br />
3) <u>Le menu de sélection du type de document</u> vous permet de choisir entre différents langages de programmation. LaTeX est ici conçu comme un langage de programmation. Vous pourrez grâce à cette fonction définir des règles de coloration du code source (v. plus bas).<br />
4) <u>Les outils</u> sont des petits scripts très pratiques, qui aident à réaliser des opérations courantes dans de nombreux langages de programmation. LaTeX étant considéré comme un langage de programmation, vous pourrez utiliser ce menu pour vous faciliter la vie ou gagner du temps lors de la rédaction de vos documents.</p>
<p><a name="2"></a></p>
<h2>#2 : Coloration syntaxique</h2>
<p>La coloration syntaxique est une fonction particulièrement utile. Elle permet de distinguer d'un coup d'oeil les mots-clés LaTeX du corps du texte. Pour mettre en place un système de coloration syntaxique, il faut réaliser les opérations suivantes:<br />
- Aller dans le menu <b>TextMate</b> > <b>Preferences</b> > <b>Fonts & Colors</b><br />
- Choisir un thème de couleurs (celui que vous voulez)<br />
- Ajouter des <i>éléments</i></p>
<p><a href="http://www.flickr.com/photos/valhallafr/1523123202/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2014/1523123202_14c1912074.jpg" width="410" height="500" alt="TextMate+LaTex 2" /></a></p>
<p>Pour ajouter un élément, il suffit de cliquer sur le bouton "<b>+</b>" (plus) en bas de la fenêtre des préférences. Cela a pour effet de créer une nouvelle ligne, qu'il reste à remplir. La ligne doit être remplie de cette manière:<br />
- Dans la partie <u>gauche</u>, le nom de l'élément. Par exemple : <i>Latex italique</i>, <i>Latex gras</i> ou <i>Latex note en bas de page</i>.<br />
- Dans la partie <u>droite</u>, la couleur du texte (<b>FG</b>), la couleur du fond (<b>BG</b>) et le style de police : gras, italique ou souligné.<br />
- En dessous des différentes lignes, le <i>Scope selector</i> (sélecteur de portée).</p>
<p>Les <i>scope selectors</i> suivants peuvent vous être utiles :<br />
- <b>comment</b> : les commentaires (<b>%</b>)<br />
- <b>support.function</b> : les fonctions (p. ex. <b>/textit</b> ou <b>\footnote</b>)<br />
- <b>meta.footnote.latex</b> : les notes en bas de page (le contenu de <b>\footnote{}</b>)<br />
- <b>markup.italic.textit.latex</b> : le texte en italique (le contenu de <b>\italic{}</b>)<br />
- <b>markup.bold.textbf.latex</b> : le texte en gras (le contenu de <b>textbf{}</b>)<br />
- <b>meta.function.section.latex</b> : la fonction \section{}<br />
- <b>entity.name.section</b> : les sections (le contenu de <b>\section{}</b>)<br />
- <b>meta.preamble.latex</b> : le préambule du document<br />
- <b>meta.include.latex</b> : les fichiers inclus dans un document parent<br />
- <b>meta.function.environment.math.latex</b> : les fonctions de l'environnement Math<br />
- <b>meta.function.environment.list.latex</b> : Les listes (énumérations)<br />
- <b>meta.function.environment.tabular.latex</b> : Les tableaux<br />
- <b>meta.citation.latex</b> : Les citations<br />
- etc. A vous de construire les autres lignes...</p>
<p>TextMate est très puissant, puisqu'il peut être reconfiguré à souhait, et ce de fond en comble. Vous pouvez changer toutes ces propriétés dans le <i>Bundle Editor</i> (<a href="#5">éditeur de paquets</a>).</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1523122854/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2039/1523122854_7366ab4012_o.png" width="430" height="221" alt="TextMate+LaTex 3" /></a></p>
<p><a name="3"></a></p>
<h2>#3 : Compiler un document LaTeX</h2>
<p>TextMate permet de compiler le code source LaTeX de manière très simple : il suffit de taper <b>Commande + R</b>. Ou de sélectionner l'option <b>Typeset & View</b> dans le menu des fonctions LaTeX (v. plus bas).</p>
<p>Assurez-vous cependant que votre fichier est bien considéré par TextMate comme un fichier LaTeX (v. plus haut) : ce réglage peut être opéré dans le menu de sélection du langage, en bas de la fenêtre de TextMate.</p>
<p>Le résultat apparaît dans une petite fenêtre :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1523799349/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2372/1523799349_4190f18bca.jpg" width="500" height="305" alt="TextMate+LaTex 4" /></a></p>
<p>Si le plug-in <a href="http://www.adobe.com/fr/products/acrobat/readstep2.html">Adobe Acrobat</a> est installé sur votre système et si TeX génère des PDF (configuration par défaut avec la <a href="http://www.valhalla.fr/index.php/2007/10/08/latex-sur-mac-installation/#1A">distribution MacTex</a>), il suffira de cliquer sur <b>Click here to Preview</b> pour avoir un aperçu de votre fichier prêt à imprimer (fichier PDF).</p>
<p>Notez que le plug-in PDF est chargé tant que vous ne redémarrez pas votre système : vous n'aurez donc à cliquer sur <i>Click here to preview</i> qu'une seule fois : toutes les compilations suivantes déboucheront directement sur un aperçu du fichier PDF généré. Vous pouvez redimentionner la fenêtre d'affichage pour avoir une meilleure vue de l'ensemble.</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1524665312/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2207/1524665312_3d0bd75df9.jpg" width="500" height="492" alt="TextMate+LaTex 5" /></a></p>
<p>Il est possible, à ce stade, que les caractères accentués n'apparaissent pas correctement dans le fichier PDF. Si c'est le cas, c'est dû au fait que l'encodage du fichier est, par défaut, UTF-8 alors que vous avez indiqué un autre encodage dans l'en-tête du fichier LaTeX. Pour résoudre le problème, vous pouvez :<br />
- soit changer l'encodage indiqué dans l'en-tête du fichier LaTeX, en remplaçant par exemple <b>\usepackage[<u>latin1</u>]{inputenc}</b> par <b>\usepackage[<u>utf8</u>]{inputenc}</b> ;<br />
- soit changer l'encodage réel du fichier, en utilisant la boîte de dialogue <b>File</b> > <b>Save As...</b> de TextMate et en choisissant le charset qui correspond à celui qui a été déclaré dans le code source LaTeX (ici, ce serait <i>ISO Latin 1</i>).</p>
<p><a name="4"></a></p>
<h2>#4 : Utiliser les fonctions spécifiques à LaTeX</h2>
<p>Le "menu" spécial de TextMate qui regroupe des fonctions utiles pour différents langages de programmation contient de nombreuses fonctions pour LaTeX :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1523799477/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2153/1523799477_c95ba2eed8.jpg" width="441" height="451" alt="TextMate+LaTex 3" /></a></p>
<ol>
<li /><b>Typeset & View</b> : fonction décrite ci-dessus qui permet de compiler le fichier et de l'afficher à l'écran dans un logiciel de visulisation PDF.
<li /><b>Project Management</b> : plusieurs fonctions utiles. Notamment, la magnifique fonction <b>Show Outline</b> qui permet d'afficher une table des matières en fonction de vos chapitres, sections et sous-sections (\chapter, \section, \subsection) et la fonction <b>Open Master File</b> qui permet d'afficher le fichier parent si le fichier courant est y est inclus.
<li /><b>Run Makeindex</b> : permet de lancer le moteur <i>Makeindex</i> qui générera un <u>index</u> de votre document LaTeX. Très utile pour les longues monographies : manuels, traités, mémoires, thèses, etc.
<li /><b>Run Bibtex</b> : permet de lancer le moteur <i>Bibtex</i> qui générera une <u>bibliographie</u> des références utilisées dans votre document LaTeX. Notez que le logiciel gratuit <a href="http://bibdesk.sourceforge.net/">BibDesk</a> est fourni avec la distribution MacTex. Vous pouvez aussi utiliser Bookends ou Endnote pour gérer votre bibliographie avec LaTeX.
<li /><b>Trash aux files</b> : mettre à la corbeille les fichiers auxilliaires générés pendant la compilation et qui ne sont plus nécessaires.
<li /><b>Show PDF in viewer</b> : si <i>pdfsync</i> est installé, cette fonction vous permet de vous déplacer en même temps dans votre document source LaTeX et dans le fichier PDF généré par la compilation.
<li /><b>Format</b> : Cette série de fonctions vous permet de formater du texte très rapidement, à la manière d'un logiciel de traitement de texte, grâce à des raccourcis-clavier. Par exemple, sélectionnez un bloc de texte et tapez <b>Commande + B</b> pour le mettre en gras (TextMate se charge d'encapsuler ce bloc de texte à l'intérieur de l'instruction LaTeX appropriée, en l'occurrence \textbf). Le text peut être formaté de différentes manières : en italiques, en gras, en petites majuscules, en monospaced et souligné.
<li /><b>Insert</b> : Permet d'insérer des éléments prédéfinis. Le système d'insertions de TextMate est très puissant : vous pouvez créer des bouts de code LaTeX que vous utiliserez souvent, et les insérer ensuite en un tournemain. Vous remarquerez que TextMate est livré avec certains bouts de code préféfinis, comme celui qui permet d'insérer une référence bibliographique.
<li /><b>Wrap selection in</b> : permet d'encapsuler le code sélectionné dans un bloc défini, par exemple le bloc \begin...\end.
<li /><b>Environments</b> : permet de charger des environnement avancés spécifiques, comme par exemple celui qui permet de rédiger des équations mathématiques.
<li /><b>Sectionning</b> : permet d'insérer les titres standards de votre document : partie, chapitre, section, paragraphe, etc.
<li /><b>Tables</b> : ces fonctions vous permettent de créer et de manipuler des tableaux.
<li /><b>Lists</b> : ces fonctions vous permettent de créer et de manipuler des listes.
<li /><b>Tidy</b> : permet de "nettoyer" le code source LaTeX, notamment en retirant les espaces superflues. Personnellement, je n'aime pas cette fonction qui se permet de reformater mon code source, mais c'est à chacun de voir...
<li /><b>Add word to index</b> : ajouter un mot dans l'index (v. ci-dessus pour la génération d'index).
<li /><b>Help</b> :  aide en ligne TextMate.
<li /><b>Documentation for package</b> : aide spécifique au paquet sélectionné (fonctions avancées).
<li /><b>Edit configuration file</b> : modifier le fichier de configuration de LaTeX sous TextMate (basiquement : comment se comporte TextMate avec ce langage).
</ol>
<p><a name="5"></a></p>
<h2>#5 : Créer des fonctions spécifiques à LaTeX</h2>
<p>Vous pouvez créer des raccourcis, qui vous serviront à écrire du code LaTeX plus rapidement. Rendez vous pour cela dans le menu <b>Bundles</b> > <b>Bundle Editor</b> > <b>Show Budle Editor</b>.</p>
<p>Nous allons ici créer un raccourci pour créer des notes en bas de page.<br />
- Pour créer une note en bas de page, il faut écrire le code suivant : <b>\footnote{XX}</b> où XX est le contenu de la note.<br />
- Nous allons paramétrer TextMate pour qu'il suffise de taper <b>fn</b> et d'appuyer sur la touche Tabulation pour créer ce code.</p>
<p>Voici la marche à suivre :<br />
- Ouvrez d'abord l'éditeur de paquets (<i>Bundle Editor</i>).<br />
- Placez-vous ensuite dans la section <b>Latex</b> et cliquez sur le bouton <b>+</b>. Choisissez <b>New Snippet</b> dans le menu déroulant.<br />
- Nommez le nouveau <i>snippet</i> <b>Footnote</b> (ou tout autre nom que vous jugerez bon).<br />
- Dans la partie droite de la fenêtre, entrez le code suivant : <span class="Code">\footnote{$0}</span>. L'argument <b>$0</b> indique là où le curseur doit être placé : il doit ici être placé entre les parenthèses, pour pouvoir immédiatement commencer à rédiger le contenu de la note en bas de page.<br />
- Choisissez <b>Tab Trigger</b> dans le menu <i>Activation</i> et entrez <span class="Code">fn</span> dans le champ de texte à droite de ce menu.<br />
- Copiez ceci dans le champ <i>Scope Selector</i> : <span class="Code">text.tex.latex</span>.</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1524870303/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2110/1524870303_12f552afc1.jpg" width="500" height="354" alt="TextMate+LaTex 6" /></a></p>
<p>Il ne vous reste plus qu'à tester. Si vous vous placez dans un document LaTeX et que vous tapez "<b>fn + TAB</b>", vous obtiendrez une note en bas de page !</p>
<p>Vous pouvez aussi créer des <i>templates</i> ou <i>modèles</i>. C'est particulièrement utile si vous envisagez d'écrire de nombreux documents qui avec la même présentation. Pour cela, choisissez <b>New Template</b> dans le <i>Bundle Editor</i> et recopiez simplement le code LaTeX qui sera répété dans tous les documents futurs. Ils vous suffira ensuite d'appeler le modèle créé par le menu <b>File</b> > <b>New From Template</b> > <b>Latex</b>...</p>
