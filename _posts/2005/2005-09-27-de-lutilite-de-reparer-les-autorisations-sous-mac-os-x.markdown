---
layout: post
status: publish
published: true
title: De l'utilité de réparer les autorisations sous Mac OS X

  
  



wordpress_id: 33
wordpress_url: http://localhost/~guillaume/gfblog/wordpress/?p=33
date: '2005-09-27 22:46:44 +0200'
date_gmt: '2005-09-27 20:46:44 +0200'
categories:
- Informatique
tags:
- sécurité
- software
- apple
permalink:  /2005/09/27/de-lutilite-de-reparer-les-autorisations-sous-mac-os-x/
---
<p>
Mac OS X est un système très robuste, basé sur un coeur (kernel) dérivé des systèmes BSD: Darwin. C'est même certainement -au sens véritable du terme- le système le plus robuste et le plus sécurisé accessible au grand public. Néanmoins puisqu'il est possible, comme sous tout système d'exploitation qui se respecte, d'installer de nombreuses applications qui modifient plus ou moins la configuration logicielle système, Mac OS X n'est pas totalement à l'abris des dysfonctionnements. Pour corriger ces dysfonctionnements et restaurer l'état du système, il existe de nombreux moyens qui tendent tous plus ou moins à la même chose: revenir à l'état d'avant la modification entraînant le dysfonctionnement. Un de ces moyens s'appelle la <em>réparation des autorisations</em>.</p>
<p>
Dans tous les sites internet d'aide à l'utilisation du Mac, sur tous les forums et dans toute la presse Mac, le premier conseil que l'on donne lorsqu'un comportement anormal du système ou d'une application est détecté est de réparer les autorisations. C'est une aberration. Un mauvais conseil qui s'est bien trop vite répandu, véhiculé par des gens qui ne savent définitivement pas de quoi ils parlent. Dans 99% des cas, réparer les autorisations ne résoudra pas le problème.</p>
<p>
Je vous propose de découvrir dans cet article les raisons pour lesquelles la réparation des autorisations n'est pas un remède miracle. Je vous propose également de comprendre dans quels cas la réparation des autorisations est efficiente, et dans quels cas elle ne l'est pas. Je vais pour cela m'appuyer sur la trame de fond d'un excellent article de blog écrit en mai 2005 par Rosyna de l'équipe Unsanity.</p>
<h3>Le pavé dans la marre</h3>
<p>
Comme l'explique Apple <strong>(*)</strong> dans un <a href="http://docs.info.apple.com/article.html?artnum=25751" target="_blank">article de sa Knowledge Base</a> dédié à l'utilitaire de disque, <u>la réparation des autorisations ne s'applique pas aux logiciels tierce-partie n'ayant pas été installés grâce à l'assistant d'installation Apple</u> (<i>Installer.app</i>). Elle ne s'applique donc pas aux logiciels installés par glisser-déposer (<i>drag&drop</i>) à partir d'une image disque, et aux logiciels installés à partir d'un assistant d'installation non-Apple (par exemple, ceux d'Allume et de MindVision). La réparation des autorisations ne fonctionne donc que pour les logiciels installés grâce au logiciel d'installation Apple, dès lors que leur éditeur a prévu la création d'un reçu d'installation (<i>Receipt</i>) contenant les informations correctes relatives aux autorisations des fichiers copiés sur le disque lors de l'installation -- ce qui n'est pas forcément le cas. De la même manière, <u>la réparation automatique des autorisations n'a pas d'effet sur les fichiers personnels que l'utilisateur a créé ou importé sur son Mac</u>.</p>
<blockquote><p>
<strong>(*)</strong> Mise à jour : la page de la Knowledge Base Apple a été modifiée depuis la rédaction originale de cet article et explique désormais --à l'heure de Snow Leopard-- la situation de manière très claire : <i>« Utilitaire de disque vérifie-t-il les autorisations de tous les fichiers ? Non. Les fichiers qui ne sont pas installés par un paquet d’installation Apple ne sont pas répertoriés dans un reçu. Ils ne sont donc pas vérifiés »</i>. Cela est en parfait accord avec ce qui est expliqué ici.
</p></blockquote>
<p>
La réparation des autorisations ne règlera pas votre problème dans la majorité des cas. Elle n'empêchera pas non plus des problèmes de survenir dans le futur. Elle ne sert à rien en tant qu'opération planifiée de maintenance. Vous pouvez quand même écouter les conseils prodigués sur les forums par des gens qui s'y connaissent plus ou moins, mais qui n'ont rien compris aux autorisations, et les réparer: cela ne nuira pas à votre système, et pour cause puisque cela ne produira sans doute aucun effet.</p>
<p>
Je ne peux pas résister à l'envie de vous traduire une discussion entre Homer et Lisa Simpson dans le célère dessin animé du même nom, que Rosyna retranscrit dans son article:</p>
<ul style="list-style-type: none;">
<li /> <strong>Homer:</strong> Pas un seul ours en vue. La patrouille anti-ours doit vraiment bien fonctionner !
<li /> <strong>Lisa:</strong> C'est un bon raisonnement, papa.
<li /> <strong>Homer:</strong> Merci, ma chérie.
<li /> <strong>Lisa:</strong> En suivant le même raisonnement, je pourrais dire que cette pierre tient les tigres à l'écart.
<li /> <strong>Homer:</strong> Ah ! Et comment ça marche ?
<li /> <strong>Lisa:</strong> Ca ne marche pas.
<li /> <strong>Homer:</strong> Hu-hu...
<li /> <strong>Lisa:</strong> Ce n'est qu'une bête pierre.
<li /> <strong>Homer:</strong> Hu-hu...
<li /> <strong>Lisa:</strong> Mais il n'y a aucun tigre à l'horizon, n'est-ce pas ?
<li /> <em>[Homer y réfléchit et sort quelques billets de sa poche]</em>
<li /> <strong>Homer:</strong> Lisa, je veux acheter ta pierre.
<li /> <em>[Lisa commence par refuser, puis accepte l'échange]</em>
</ul>
<h3>Ce que la réparation des autorisations fait et ne fait pas</h3>
<p>
La réparation des autorisations parcourt tous les paquetages (<em>packages</em>) dans le répertoire <em>/Library/Receipts/</em>. Un <em>reçu</em> de package est créé seulement quand un logiciel est installé avec l'assistant d'installation d'Apple (<em>Installer.app</em>). Cet assistant crée d'abord un package temporaire avec tous les fichiers du package d'origine. Lors de l'installation, un package contenant la liste de tous les fichiers installés à partir du package d'origine est créé. Les packages du répertoire /Library/Receipts/ ne contiennent donc que des références vers les fichiers, ils ne contiennent pas directement les fichiers.</p>
<p>
Il est possible d'afficher le contenu du package depuis le Terminal en utilisant la commande <a href="http://developer.apple.com/documentation/Darwin/Reference/ManPages/man8/lsbom.8.html" taget="_blank">lsbom</a> de cette manière: <span class="Code">lsbom /Library/Receipts/MacOSX10.4.pkg/Contents/Archive.bom</span>.</p>
<p>
Ainsi, l'utilitaire de disque parcourt le répertoire /Library/Receipts/ du <a href="http://docs.info.apple.com/article.html?artnum=25751" target="_blank">volume cible</a>. Cela implique que, pour que les autorisations soient réparées, le volume cible <u>doit</u> avoir un répertoire /Library/Receipts/. Les conséquences sont multiples. La première et la plus évidente est qu'<u>il ne peut y avoir de réparation des autorisations sur un volume sur lequel Mac OS X n'est pas installé</u>. Adieu donc les disque durs annexes (aussi bien internes qu'externes) qui ne servent pas au boot du système. La deuxième implication est beaucoup plus vicieuse. En effet, Installer.app ne permet pas dans la majorité des cas de choisir le répertoire de destination de l'installation. On peut donc en conclure que, sauf si vous avez utilisé un des Installer.app qui permettent de choisir le répertoire de destination (ce qui n'est généralement pas le cas des Installer.app distribués par Apple), la réparation des autorisations n'aura strictement aucun effet sur les fichiers de votre répertoire utilisateur home. La troisième conséquence est qu'aucun des fichiers générés lors de l'utilisation de Mac OS X (les fichiers temporaires, cache, de swap, etc.) n'est modifié. Cette règle peut ainsi être généralisée: <u><em>aucun fichier non créé par Installer.app ne sera modifié par la réparation des autorisations</em></u>.</p>
<h3>Un peu d'Histoire</h3>
<p>
Apple a introduit le <a href="http://docs.info.apple.com/article.html?artnum=106900" target="_blank">Repair Privileges Utility</a> pour le système 10.1.5. Et la raison était simple: à cette époque les Mac pouvaient encore booter sur OS 9. Or, OS 9 n'a cure des permissions (ce n'est pas un Unix). Un utilisateur pouvait donc corrompre un installation de OS X depuis OS 9, en manipulant des fichiers système, ou pire encore en utilisant un utilitaire tierce-partie comme Norton. De nos jours, le seul système présent sur la machine est OS X. Il n'y a plus de OS 9, ni même de Classic. Le problème ne se pose donc plus.</p>
<p>
Une autre des raisons qui motivèrent Apple pour inclure la réparation des autorisations dans l'Utilitaire de Disque est la présence sur notre plateforme d'assistants d'installation tierce-partie comme ceux d'<a href="http://www.allume.com/mac/" target="_blank">Allume</a> ou de <a href="http://www.mindvision.com/" target="_blank">MindVision</a>. Ces deux programmes ont longtemps été relativement dangereux pour un système sous OS X. Ils sont à l'heure actuelle très stables, et ne m'ont personnellement jamais causé de problème d'autorisations (et à Rosyna non plus d'ailleurs).</p>
<p>
La troisième raison est la faiblesse des utilisateurs eux-mêmes. Il est courant dans la communauté Mac de dire que le seul virus identifié sous OS X se situe entre la chaise et le clavier... Il est vrai que l'utilisateur peut manipuler des fichiers système et altérer leurs autorisations. Dans ce cas, la réparation est utile.</p>
<h3>Dans un cas, la réparation est nécessaire</h3>
<p>
Les autorisations ne changement pas toutes seules. Pour qu'elles changent, <u>il faut que</u> <em>quelque chose</em> les change. Pour cette raison, réparer les autorisations de temps en temps, en guise d'opération de maintenance, est <u>totalement inutile</u>.</p>
<p>
Il y a cependant un cas dans lequel la réparation des autorisations est absolument nécessaire -et résoud les problèmes. Quand vous sauvegardez votre système vers un disque externe via <a href="http://developer.apple.com/documentation/Darwin/Reference/ManPages/man1/ditto.1.html" target="_blank">ditto</a> ou <a href="http://www.bombich.com/software/ccc.html" target="_blank">Carbon Copy Cloner</a>, en ignorant les autorisations du volume source. En réparant les autorisations dans cette situation, on permet au disque de redevenir bootable, mais on ne touche toujours pas aux fichiers indépendants du systèmes ou appartenant à l'utilisateur, ce qui peut laisser ouverts d'énormes trous de sécurité.</p>
<h3>C'est trop bête...</h3>
<p>
Il n'est pas rare de voir sur les forums des gens conseiller à d'autres de réparer les autorisations avant et après une mise à jour du système par l'utilitaire de mise à jour du menu Pomme. C'est complètement stupide. L'utilitaire de mise à jour s'exécute comme <em>root</em> et n'a que faire des autorisations. L'utilisateur <em>root</em> est <u>dieu</u> sur les systèmes Unix: il peut tout faire, il n'est soumis à aucune contrainte. Bonnes autorisations, mauvaises autorisations, pas d'autorisations: c'est pour lui du pareil au même. La réparation des autorisations ne modifie en rien les chances de réussir l'installation. Pour cette raison, il est inutile de réparer les autorisations avant l'installation d'une mise à jour. Et c'est également inutile après la mise à jour: puisque les fichiers viennent d'être mis à jour, ils ont forcément les bonnes autorisations !</p>
<p>
On peut également lire que réparer les autorisations sur un volume externe peut être utile, lorsque les autorisations des fichiers de ce volume sont corrompues. C'est une pure aberration car, comme expliqué ci-avant, la réparation des autorisations n'est effective que sur les volumes sur lesquels Mac OS X est installé. Pas de répertoire /Library/Receipts/, pas de réparation des autorisations. Point.</p>
<table border="0" align="center">
<tr>
<td>D'ailleurs, l'utilitaire de disque de Mac OS X l'explique très bien...</td>
</tr>
<tr>
<td><img alt="Utilitaire de disque" src="/public/posts/2005-09-27-autorisations/utildisque.png" /></td>
</tr>
</table>
<p>
Certains disent encore que la réparation des autorisations a résolu un problème avec un logiciel tierce-partie. C'est en fait peu probable. Les gros logiciels comme ceux de Microsoft, Adobe ou Macromedia n'utilisent pas Installer.app. Il est donc théoriquement impossible que la réparation des autorisations puisse résoudre un problème ne touchant qu'un seul de ces logiciels. Il est en revanche beaucoup plus probable qu'une série d'autorisations corrompues sur le système engendre des comportements étranges pour plusieurs de ces logiciels. Par exemple, si les permissions de /Library/ sont fixées à 000, tout explose...</p>
<h3>Comment résoudre les problèmes ?</h3>
<p>
Si une application crash (elle "plante"), et laisse un rapport de bug (bug report) à envoyer à Apple, vous pourrez voir les détails du rapport. Dans ce cas, faites un copier/coller du rapport dans TextEdit et lisez calmement. Vous verrez peut-être quelque chose qui vous met la puce à l'oreille. C'est ainsi que j'ai par exemple découvert que la dernière version d'<a href="http://www.unsanity.com/haxies/ape" target="_new">Application Enhancer</a> faisait planter Dreamweaver 2004. Solution express: mettre DW dans la Master Exclude List d'APE, et le problème est résolu.</p>
<p>
Vous pouvez également consulter les logs système, notamment en lisant ce que dit la Console (Applications/Utilitaires/Console). Si vous avez un problème, la Console vous en indiquera la source. A vous de trouver ensuite la solution.</p>
<p>
Si le problème vient d'un logiciel, effacez ses préférences et redémarrez-le. Réinstaller un logiciel ne sert la plupart du temps à rien car seul l'exécutable (le package) sera remplacé, et pas les préférences. Or, l'exécutable n'est, dans la majorité des cas, pas modifiable (le problème ne peut donc pas venir de lui), contrairement aux préférences (appelées "prefs") qui se corrompent facilement. Les préférences sont situées dans le répertoire <i>~/Library/Preferences/</i><i> (ou </i><i>~/Bibliothèque/Préférences/</i>), ou dans un autre emplacement, mais ont l'extension .plist. Vous pouvez faire une recherche avec Spotlight : "<i>nom-du-logiciel .plist</i>".</p>
<p>
Vous pouvez aussi supprimer les fichiers annexes créés par le logiciel. Ils sont peut être à l'origine de la corruption de ce logiciel (c'est même fréquent). Ces fichiers sont situés à l'emplacement suivant: <i>~/Library/Application Support/[Nom du logiciel]</i> (ou <i>~/Bibliothèque/...</i>).</p>
<p>
Si le problème se pose pour un logiciel qui admet des <i>plug-ins</i> ou des <i>add-ons</i>, pensez à désactiver ces <i>plug-ins</i> ou <i>add-ons</i>. Pour les logiciels Apple, ils se situent dans le répertoire <i>~/Library/[Nom du logiciel]</i><i> (ou </i><i>~/Bibliothèque/...</i>). Par exemple, pour Apple Mail, c'est <i>~/Library/Mail/Bundles</i><i>. Le logiciel peut aussi permettre de désactiver ces extensions : c'est le cas de Firefox. Vous pourrez alors identifier la source du problème sans tout désinstaller.<br />
</i></p>
<p>
Si vous avez installé un nouveau périphérique, désactivez le et désinstallez ses <i>drivers</i> (ou <i>pilotes</i>) avant de vérifier si le problème persiste. Les périphériques USB notamment sont connus pour générer des Kernel Panic sous Mac OS X (c'était particulièrement vrai dans les premières versions d'OS X, c'est un peu moins vrai maintenant, mais sait-on jamais...).</p>
<p>
Enfin, n'oubliez jamais qu'il y a un choix à faire:</p>
<ul style="list-style-type: none;">
<li />Installer des jeux, utilitaires, sharewares et freewares, dernières versions ou versions plus anciennes, les désinstaller, les manipuler, modifier les programmes existants, trifouiller les préférences... et ne pas avoir peur de formater et opérer une <em>clean install</em> quand les choses vont trop mal.
<li />Installer une bonne fois pour toutes ce dont on a besoin, et ne plus rien toucher. C'est ainsi que vous pourrez utiliser votre Mac pendant 10 ans sans jamais formater.
</ul></p>
<p><i><br />
à Montpellier le 27/09/2005<br />
mis à jour à Montpellier le 29/07/2007<br />
mis à jour à Montpellier le 23/03/2010 (concernant l'article de la KB Apple et Installer.app : aucune modification de fond)<br />
</i></p>
