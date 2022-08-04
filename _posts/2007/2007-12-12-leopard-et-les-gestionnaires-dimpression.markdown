---
layout: post
status: publish
published: true
title: Leopard et les gestionnaires d'impression

  
  



excerpt: "Leopard, la dernière version de Mac OS X, n'aime pas les imprimantes trop
  anciennes. Il ne les \"détecte\" pas ; celles-ci refusent d'imprimer. J'ai rencontré
  ce problème avec une Epson Stylus Photo 750 datant de la fin des années 90, qui
  fonctionnait parfaitement sous Tiger. Voici donc le récit du problème et l'exposé
  de la solution.\r\n\r\n"
wordpress_id: 134
date: '2007-12-12 12:23:13 +0100'
date_gmt: '2007-12-12 11:23:13 +0100'
categories:
- Informatique
tags:
- apple
- Informatique
- hardware
- software
permalink:  /2007/12/12/leopard-et-les-gestionnaires-dimpression/
---
<p>Leopard, la dernière version de Mac OS X, n'aime pas les imprimantes trop anciennes. Il ne les "détecte" pas ; celles-ci refusent d'imprimer. J'ai rencontré ce problème avec une Epson Stylus Photo 750 datant de la fin des années 90, qui fonctionnait parfaitement sous Tiger. Voici donc le récit du problème et l'exposé de la solution.</p>
<p><a id="more"></a><a id="more-134"></a></p>
<h2>Le problème</h2>
<p>L'imprimante est trop vieille. Il n'y a pas de <i>driver</i> (pilote) pour Leopard. Epson, sur son site internet, présente <a href="http://esupport.epson-europe.com/ViewArticle.aspx?lng=fr-FR&kbid=318461&">une liste des imprimantes</a> qui ont besoin d'un driver spécifique pour fonctionner avec Leopard. En principe, si l'imprimante ne figure pas dans cette liste, elle est censée fonctionner avec les drivers fournis avec le système.</p>
<p>Mais voilà : aucun driver pour on imprimante n'était fourni avec Leopard. Apple m'invitait cordialement à utiliser le logiciel de mises à jour de Mac OS X pour rechercher de nouveaux drivers (mais j'ai besoin d'une imprimante fonctionnelle dans les 10 minutes, pas dans 6 mois !).</p>
<p><i>Impossible de trouver de gestionnaire adapté à votre imprimante. Utilisez « Mise à jour de logiciels » pour tenter d’en trouver un et de le télécharger.</i></p>
<h2>Les mauvaises solutions</h2>
<p>Premier réflexe : on va essayer de faire fonctionner l'imprimante avec un driver générique fourni avec Leopard. Par exemple, les drivers "Epson Stylus Color" ou "Epson Stylus Photo". </p>
<p>Cette solution n'a pas fonctionné dans mon cas. Les drivers pour Stylus Color impriment des pages blanches (sic) : c'est-à-dire que l'imprimante se comporte comme si elle imprimait du texte, mais aucun encre ne sort des buses ; la page ressort blanche. Les drivers pour Stylus Photo sont encore pires : les tâches restent à l'état "Arrêtées", l'imprimante ne fait rien (même pas un petit bruit d'initialisation...).</p>
<p>Après une recherche sur Google, j'ai eu comme la vague impression (assez habituelle d'ailleurs) que 1) plus personne n'utilise cette imprimante, trop vieille, ou que ceux qui l'utilisent encore ne sont pas passés à Leopard ; et 2) les seuls qui ont déjà rencontré ce problème préfèrent récriminer Epson plutôt que de rechercher une solution... D'ailleurs, soit dit en passant, ce n'est pas la faute d'Epson, c'est indéniablement celle d'Apple qui n'est pas capable d'assurer la compatibilité des drivers entre Tiger et Leopard. Qu'une imprimante toute neuve ne fonctionne pas sur un système ancien, cela peut facilement se comprendre, mais qu'une imprimante ancienne, qui fonctionnait jusqu'alors très bien, ne soit plus gérée par un système récent, cela dépasse l'entendement !</p>
<p>Bref, les forums préconisent d'installer les drivers Tiger sous Leopard. Cela fonctionne dans certains cas, paraît-il. Selon un utilisateur qui a essayé cette solution, cela ne fonctionne pas pour l'Epson Stylus Photo 750. Je n'ai pas essayé. Ce n'est pas que je fais confiance à cet utilisateur anonyme, c'est plutôt que je ne vois pas d'un très bon oeil de tels bidouillages. Libre à vous d'essayer si la solution exposée ci-dessous ne fonctionne pas dans votre cas.</p>
<h2>La bonne solution</h2>
<p>J'ai subitement eu une idée, que j'ai voulu creuser. Elle est issue de deux constatations :<br />
- Mac OS X est un Unix, comme Linux... or cette imprimante fonctionne sous Linux : il doit donc exister quelque par un driver libre pour Linux, qui doit aussi fonctionner sur Mac ! D'ailleurs, Mac OS X utilise le gestionnaire d'impression CUPS (Common Unix Printing System), comme vous pourrez le constater <a href="http://127.0.0.1:631/">en cliquant ici</a>.<br />
- J'ai le souvenir d'avoir utilisé, sur Mac (il me semble que c'était avec Panther) et pour cette imprimante, un driver appelé "<em>GIMP-print-quelque chose</em>". Connaissant le logiciel <a href="http://www.gimp.org/">The GIMP</a>, élaboré pour Linux et fonctionnant sur Mac par X11, j'ai pensé que cela pouvait avoir une relation. Je ne connais vraiment rien à ce domaine, mais il s'est avéré que j'avais raison.</p>
<p>J'ai donc recherché "<em>epson linux drivers</em>" sur Google et j'ai trouvé le site Linuxprinting.org qui contient une page dédiée à mon imprimante, l'<a href="http://www.linuxprinting.org/show_printer.cgi?recnum=Epson-Stylus_Photo_750">Epson Stylus Photo 750</a> (et à la vôtre aussi, sûrement). Le driver recommandé s'appelle "<em>gutenprint</em>". Qu'à cela ne tienne, on suit le lien ou l'on tape ce mot-clé dans un moteur de recherche.</p>
<p>On tombe alors sur le génial projet <strong>Gutenprint</strong> (anciennement appelé <strong>GIMP-Print</strong>...) qui a pour but de rassembler dans un même paquetage des drivers libres de plus de 800 modèles d'imprimantes. Les projets Linux n'étant pas souvent à la pointe de la technologie, mais ayant toujours une rétrocompatibilité avec les périphériques anciens bien meilleure que celle de Windows ou de Mac OS X, un driver pour mon imprimante était fourni dans ce paquetage (v. la <a href="http://gutenprint.sourceforge.net/p_Supported_Printers.php3">liste des imprimantes</a> gérées).</p>
<p>En plus, <a href="http://gimp-print.sourceforge.net/MacOSX.php3">Gutenprint existe pour Mac OS X</a>. Un simple fichier DMG à télécharger, qui se monte sur le bureau et présente un assistant d'installation à lancer. En somme, Gutenprint est distribué comme tout bon logiciel Mac OS X. Très simple à installer, sans configuration nécessaire.</p>
<p>La seule configuration s'opère au moment d'ajouter l'imprimante : il faudra choisir le driver Gutenprint (v. la capture d'écran ci-dessous).</p>
<p><center><a href="http://www.flickr.com/photos/valhallafr/2105566204/" title="Gutenprint sous Mac OS X de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2222/2105566204_0ff9d34235_o.png" width="666" height="525" alt="Gutenprint sous Mac OS X" /></a></center></p>
<p>Et voilà, mon imprimante imprime à nouveau !</p>
