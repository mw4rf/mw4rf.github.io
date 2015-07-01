---
layout: post
status: publish
published: true
title: Optimiser les bureaux virtuels sous Unity (Ubuntu 12.04)
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: 'Après plusieurs années sans évolution majeure, les interfaces de bureau
  ont entamé, depuis 2010, une migration progressive vers de nouveaux paradigmes censés
  être mieux adaptés aux écrans tactiles : iOS et Android, OS X Lion, Windows 8 et,
  bien sûr, Gnome Shell et Unity sous Linux. Il ne s''agit pas ici de revenir sur
  le débat --sa fin-- des "vieilles habitudes" contre les "nouveaux gadgets", mais
  simplement de présenter quelques réglages techniques qui m''ont été utiles afin
  d''optimiser Unity sous Ubuntu 12.04 Precise Pangolin. Ces optimisations rendent
  Unity plus rapide et fluidifient son utilisation, au détriment de la "beauté" de
  l''interface. '
wordpress_id: 876
wordpress_url: http://www.valhalla.fr/?p=876
date: '2012-06-16 22:23:08 +0200'
date_gmt: '2012-06-16 20:23:08 +0200'
categories:
- Linux
tags:
- Linux
- Technique
- Logiciels
- Système
- interface
- gnome
- ubuntu
- configuration
permalink:  /2012/06/16/optimiser-unity-workspaces-precise-pangolin/
---
<p>Après plusieurs années sans évolution majeure, les interfaces de bureau ont entamé, depuis 2010, une migration progressive vers de nouveaux paradigmes censés être mieux adaptés aux écrans tactiles : iOS et Android, OS X Lion, Windows 8 et, bien sûr, Gnome Shell et Unity sous Linux. Il ne s'agit pas ici de revenir sur le débat --sa fin-- des "vieilles habitudes" contre les "nouveaux gadgets", mais simplement de présenter quelques réglages techniques qui m'ont été utiles afin d'optimiser Unity sous Ubuntu 12.04 Precise Pangolin. Ces optimisations rendent Unity plus rapide et fluidifient son utilisation, au détriment de la "beauté" de l'interface. <a id="more"></a><a id="more-876"></a></p>
<h2>Le gestionnaire de configuration CCSM</h2>
<p>Les réglages s'effectuent pour la plupart dans le gestionnaire de configuration Compiz. Celui-ci n'est pas installé par défaut sur Ubuntu. Pour l'installer, il faudra lancer la commande suivante :</p>
<blockquote><p>sudo apt-get install compizconfig-settings-manager</p></blockquote>
<p>Pour le lancer, il suffira ensuite de taper <strong>ccsm</strong> dans le <em>dash</em> Unity : <a href="/public/posts/2012-06-16-pangolin/Menu_046.png"><img class="aligncenter size-full wp-image-873" title="Dash Unity : Ouvrir CCSM" src="/public/posts/2012-06-16-pangolin/Menu_046.png" alt="" width="279" height="239" /></a></p>
<p>Dans CCSM, les réglages qui nous intéressent ici se situent dans la section <strong>Bureau</strong>. Il s'agit de : 1) <strong>Expo</strong> ; 2) <strong>Desktop Wall</strong> ; 3) <strong>Ubuntu Unity Plugin</strong>.</p>
<p><a href="/public/posts/2012-06-16-pangolin/Selection_047.png"><img class="aligncenter size-medium wp-image-874" title="Paramètres CCSM" src="/public/posts/2012-06-16-pangolin/Selection_047-300x94.png" alt="" width="300" height="94" /></a></p>
<h3>Expo</h3>
<p>Le plugin Expo permet d'afficher tous les bureaux virtuels dans une mosaïque, puis de les activer par double-clic. Lorsqu'il est activé, une animation remplace progressivement le bureau actuel par la mosaïque. L'optimisation suggérée ici a pour but de rendre ce remplacement plus rapide, afin de gagner du temps.</p>
<p>Dans l'onglet <em><strong>Behavior</strong></em>, abaisser la valeur de <em><strong>Zoom Time</strong></em> à <strong>0,1000</strong></p>
<p style="text-align: center;"><a href="/public/posts/2012-06-16-pangolin/Gestionnaire-de-Configuration-CompizConfig_049.png"><img class="size-thumbnail wp-image-869 aligncenter" title="CCSM : Exposé" src="/public/posts/2012-06-16-pangolin/Gestionnaire-de-Configuration-CompizConfig_049-150x150.png" alt="" width="150" height="150" /></a></p>
<h3 style="text-align: left;">Desktop Wall</h3>
<p>Le plugin Desktop Wall a deux intérêts ici. D'abord, il affiche une miniature de la mosaïque du plugin Expo, au centre de l'écran, lorsqu'on change de bureau virtuel <em>avec les raccourcis clavier</em>. Cette miniature est totalement inutile, non seulement car l'on sait généralement de quel bureau l'on vient et sur quel bureau l'on va, lorsqu'on change de bureau, mais aussi parce qu'elle est trop petite pour que le contenu des bureaux soit réellement visible (certes, CCSM permettrait d'agrandir les vignettes, mais le bénéfice de ce plugin reste douteux).</p>
<p>Pour désactiver la mosaïque, il suffit de <strong>décocher</strong> la case <em><strong>Show Viewport Switcher Preview</strong></em> de l'onglet <em><strong>Viewport Switch Preview</strong></em>. Attention: il <strong>ne</strong> faut <strong>pas</strong> décocher la case <em>Activer Desktop Wall</em>, car Unity a besoin de ce plugin pour fonctionner.</p>
<p><a href="/public/posts/2012-06-16-pangolin/Gestionnaire-de-Configuration-CompizConfig_050.png"><img class="aligncenter size-thumbnail wp-image-870" title="CCSM : Desktop Wall (disable)" src="/public/posts/2012-06-16-pangolin/Gestionnaire-de-Configuration-CompizConfig_050-150x150.png" alt="" width="150" height="150" /></a></p>
<p>Ensuite, le plugin Desktop Wall contrôle le passage d'un bureau virtuel à l'autre, et l'animation qui le caractérise. Cette animation est <em>trop longue</em>. Elle est certes très jolie, mais à la voir plusieurs dizaines de fois par jour, l'on finit à coup sûr avec un mal de crâne... J'ai donc réduit le temps de l'animation au strict minimum. Le passage d'un bureau virtuel à l'autre est beaucoup plus rapide, et l'ordinateur donne l'impression d'être beaucoup plus réactif.</p>
<p>Pour ce faire, on se rend sur l'onglet <em><strong>Viewport Switching</strong></em><strong></strong> et l'on abaisser la valeur de la propriété <em><strong>Wall Sliding Duration</strong></em>, soit à <strong>0,1000</strong> pour conserver une rapide animation, soit à <strong>0,000</strong> pour supprimer toute animation et changer de bureau dès l'activation des raccourcis clavier.</p>
<p><a href="/public/posts/2012-06-16-pangolin/Gestionnaire-de-Configuration-CompizConfig_051.png"><img class="aligncenter size-thumbnail wp-image-871" title="CCSM : Desktop Wall (boost)" src="/public/posts/2012-06-16-pangolin/Gestionnaire-de-Configuration-CompizConfig_051-150x150.png" alt="" width="150" height="150" /></a></p>
<h3>Unity</h3>
<p>Le plugin Unity permet de régler certaines options relatives à la partie visible d'Unity. Nous ne ferons ici que 2 modifications, les autres pouvant être réalisées avec d'autres outils, tels qu'<a href="http://ubuntu-tweak.com/">Ubuntu Tweak</a>.</p>
<p>La première modification porte sur le Dock --la barre de lanceur d'applications à gauche de l'écran. Il est toujours présent à l'écran, ce qui est le plus souvent inutile : d'une part, vous êtes censé savoir quels logiciels sont actifs sur votre machine, puisque vous êtes en train de les utiliser et, d'autre part, il est beaucoup plus rapide de lancer un nouveau logiciel grâce au clavier qu'avec la souris. On peut donc se satisfaire d'un Dock caché, qui n'apparaît que lorsqu'on envoie le curseur de la souris sur la gauche de l'écran.</p>
<p>Pour effectuer cette modification, on se rend dans l'onglet <em><strong>Behavior</strong></em> et l'on sélectionne <strong><em>Autohide</em></strong><em></em> dans le menu déroulant <em><strong>Hide Launcher</strong></em>.</p>
<p><a href="/public/posts/2012-06-16-pangolin/Gestionnaire-de-Configuration-CompizConfig_052.png"><img class="aligncenter size-thumbnail wp-image-872" title="CCSM : Unity" src="/public/posts/2012-06-16-pangolin/Gestionnaire-de-Configuration-CompizConfig_052-150x150.png" alt="" width="150" height="150" /></a></p>
<p>La deuxième modification se situe au même en droit, juste un peu plus bas : il s'agit de la touche du clavier utilisée pour ouvrir le Dash Unity. Par défaut, il s'agit de la touche SUPER (ou touche <em>Windows</em>). Unity s'accapare cette touche : elle est pour lui, et lui seul. Or, cette touche pourrait servir pour de nombreux raccourcis, si Unity ne s'en réservait pas l'usage. Je l'ai donc remplacée par une combinaison de deux touches : CTRL et SUPER. Pour ce faire, il suffit de cliquer sur sur bouton à droite de <em><strong>Key to show the launcher</strong></em>, de cliquer sur <em>CONTROL</em> et <em>SUPER</em>, puis de valider les changements.</p>
<p>Ce changement fait, le Dash Unity se lancera avec la combinaison de touches CTRL+SUPER, et tous les raccourcis d'Unity, habituellement assignés à SUPER+[touche] seront activable avec CTRL+SUPER+[touche]. C'est un petit désagrément, mais le jeu en vaut la chandelle : la touche SUPER est désormais libérée de l'influence d'Unity, et l'on peut l'utiliser dans d'autres raccourcis.</p>
<h2>Les raccourcis clavier pour changer de bureau virtuel</h2>
<p>Pour gagner du temps, j'ai décidé de changer de bureau virtuel avec les combinaisons SUPER+1/2/3/4 pour les bureaux 1, 2, 3 et 4. Sur les claviers AZERTY, les touches 1, 2, 3 et 4 donnent en réalité les caractères <strong>&amp;</strong>, <strong>é</strong>, <strong>"</strong> et <strong>'</strong>.</p>
<p>Pour assigner ces raccourcis, on lancera les <strong>Préférences système</strong> (de Gnome) <span style="text-align: center;">et l'on se rendra dans la section </span><strong style="text-align: center;">Clavier</strong><span style="text-align: center;"> : </span></p>
<p><img class="size-medium wp-image-875 aligncenter" title="Sélection_053" src="/public/posts/2012-06-16-pangolin/Selection_053-300x104.png" alt="" width="300" height="104" /></p>
<p>L'on se rendra ensuite dans l'onglet <strong>Raccourcis</strong> puis dans la section <strong>Navigation</strong>. On cherchera les raccourcis idoines (v. la capture d'écran ci-dessous) et on les réassignera avec la combinaison de touches désirée.</p>
<p><a href="/public/posts/2012-06-16-pangolin/Clavier_054.png"><img class="aligncenter size-thumbnail wp-image-868" title="Préférences système: configuration des raccourcis clavier" src="/public/posts/2012-06-16-pangolin/Clavier_054-150x150.png" alt="" width="150" height="150" /></a></p>
<p>Il est également possible de définir ses propres raccourcis dans la section <strong>Raccourcis </strong><strong>personnalisés</strong>. Par exemple, SUPER+T pour ouvrir le Terminal gnome, SUPER+B pour ouvrir un navigateur Web, etc.</p>
<p>Pour résumer, l'on a désormais :</p>
<ul>
<li>plus de place à l'écran (le Dock est caché) ;</li>
<li>plus de réactivité dans le passage d'un bureau virtuel à l'autre ;</li>
<li>des raccourcis clavier performants.</li>
</ul>
