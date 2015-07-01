---
layout: post
status: publish
published: true
title: L'accélération de la souris dans Mac OS X
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "Un très bon <a href=\"http://db.tidbits.com/article/8893\">article</a> sur
  TidBits évoque le problème de l'accélération de la souris -ou plutôt du curseur
  de la souris tel qu'il est affiché à l'écran- dans Mac OS X. Tout utilisateur d'un
  ordinateur, quel que soit le système d'exploitation, a déjà remarqué que lorsqu'il
  déplace la souris très vite, le curseur se déplace très vite à l'écran et qu'à l'inverse,
  lorsqu'il déplace la souris lentement, le curseur se déplace lentement. Il s'agit
  de l'accélération, qui est calculée mathématiquement selon une courbe. Selon l'auteur,
  la courbe employée par Mac OS X serait inappropriée.\r\n\r\n"
wordpress_id: 114
wordpress_url: http://www.valhalla.fr/index.php/2007/03/05/lacceleration-de-la-souris-dans-mac-os-x/
date: '2007-03-05 10:47:05 +0100'
date_gmt: '2007-03-05 09:47:05 +0100'
categories:
- Mac
tags:
- Mac
- hardware
- software
permalink:  /2007/03/05/lacceleration-de-la-souris-dans-mac-os-x/
---
<p>Un très bon <a href="http://db.tidbits.com/article/8893">article</a> sur TidBits évoque le problème de l'accélération de la souris -ou plutôt du curseur de la souris tel qu'il est affiché à l'écran- dans Mac OS X. Tout utilisateur d'un ordinateur, quel que soit le système d'exploitation, a déjà remarqué que lorsqu'il déplace la souris très vite, le curseur se déplace très vite à l'écran et qu'à l'inverse, lorsqu'il déplace la souris lentement, le curseur se déplace lentement. Il s'agit de l'accélération, qui est calculée mathématiquement selon une courbe. Selon l'auteur, la courbe employée par Mac OS X serait inappropriée.</p>
<p><a id="more"></a><a id="more-114"></a></p>
<p>Il est évident que lorsqu'un déplace la souris de 1 cm, le curseur doit être déplacé de plus d'un centimètre. Pour preuve: votre tapis de souris est plus petit que votre écran, et vous n'utilisez jamais la totalité de sa surface. Pourtant, vous pouvez balader le curseur d'un coin à l'autre de l'écran. Si le rapport était de 1 pour 1, il faudrait un tapis de souris aussi grand que l'écran et il faudrait gesticuler de manière très inconfortable pour déplacer le curseur d'un coin à l'autre de l'écran.</p>
<p>Il existe donc un mécanisme d'accélération: si la souris se déplace d'1 centimètre, le curseur se déplacera, par exemple, de 5 cm sur l'écran. Ce système est très pratique pour déplacer le curseur sur de longues distances par exemple de la barre de menus d'un logiciel, en haut de l'écran, jusqu'au menu Démarrer de Windows ou au Dock de Mac OS X, en bas de l'écran. Mais pour de petites distances, il est clairement inadapté.</p>
<p>Il existe de nombreux éléments "cliquables" très petits: les boutons de fermeture d'une fenêtre, le menu pomme sous Mac, la barre de signets d'un navigateur web, ... l'espace entre deux lettres d'un mot dans un traitement de texte ! Si le ratio était maintenu, il faudrait déplacer la souris de quelques millimètres seulement, ce qui est impossible pour la quasi-totalité des utilisateurs. Le déplacement du curseur avec l'accélération "pour longues distances" est beaucoup trop rapide pour être également précis. Le ratio doit donc changer selon que l'on veut parcourir une longue distance ou, au contraire, cibler un élément très précis à l'écran.</p>
<p>Le changement de ratio s'opère en fonction de la vitesse de déplacement de la souris: si elle se déplace vite, le système d'exploitation en déduit que l'utilisateur veut parcourir une grande distance et utilise un grand ratio ; à l'inverse, si la souris se déplace lentement, le système en déduit que l'utilisateur veut cibler un élément précis et réduit de manière drastique le ratio. Cela s'appelle l'accélération. L'accélération est calculée à partir d'une courbe.</p>
<p>La courbe d'accélération représente la progression de l'accélération du curseur de la souris. Plus la souris se déplace vite, plus le ratio doit augmenter rapidement. Au contraire, plus elle se déplace lentement, plus le ratio doit diminuer rapidement. Il ne s'agit en aucun cas de la vitesse de déplacement du curseur qui, elle, reste fixe.</p>
<p>Selon l'article précité, le problème de Mac OS X est que la courbe d'accélération est inadaptée. Elle ressemblerait plus à une ligne brisée qu'à une courbe. Sa forme ne serait pas bonne. Les conséquences seraient terribles pour certains utilisateurs: de l'impossibilité de sélectionner un élément précis à l'écran, jusqu'à produire des lésions sur le poignet et le bras dont les muscles sont beaucoup sollicités pour compenser l'accélération défectueuse.</p>
<p>Il est alors proposé d'utiliser des logiciels tiers qui modifient cette courbe, certainement en la rapprochant de la courbe utilisée par Microsoft dans Windows. Parmi ces logiciels, on peut citer:<br />
- <a href="http://plentycom.jp/en/steermouse/">SteerMouse</a>: payant, conçu pour la MightyMouse mais pouvant gérer d'autres souris.<br />
- <a href="http://www.usboverdrive.com/USBOverdrive/News.html">USB Overdrive</a>: payant, pouvant gérer d'autres périphériques que les souris.<br />
- <a href="http://www.knockknock.org.uk/mac/">MouseFix</a>: gratuit, difficile à installer.<br />
- <a href="http://www.ragingmenace.com/software/sidetrack/index.html">SiteTrack</a>: pour les trackpads uniquement.</p>
<p>Pour ma part, j'utilise une souris Razer Diamondback. J'ai installé les <a href="http://www.razersupport.com/index.php?_m=downloads&_a=viewdownload&downloaditemid=56&nav=0">drivers</a> pour Mac et je n'en suis pas du tout satisfait. Je n'avais pas de problème avec l'accélération de Mac OS X, mais maintenant j'en ai ! L'accélération est peut être meilleure, dans l'absolu, mais elle rompt avec mes habitudes, et c'est de là que vient la gêne.</p>
<p>En conclusion: si vous travaillez uniquement sur Mac et que la maniement de la souris ne vous pose pas de problème particulier, ne touchez à rien. En revanche, si vous êtes habitué à l'accélération Windows ou si l'accélération Mac vous gêne, vous pouvez essayer de la modifier.</p>
