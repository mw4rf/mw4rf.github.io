---
layout: post
status: publish
published: true
title: Mises à jour et déboires de WordPress
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "Il y a quelques jours, 3 précisément, j'ai mis à jour l'installation de
  WordPress, le logiciel qui sert ce support à ce site. Je suis passé de la version
  1.0 à la version 1.1.1. Et voilà qu'aujourd'hui je lis sur le site officiel qu'il
  est urgent de passer en version 1.1.2. Il semblerait qu'il y ait eu un léger souci
  de nature hackesque...\r\n\r\n"
wordpress_id: 113
wordpress_url: http://www.valhalla.fr/index.php/2007/03/05/mises-a-jour-et-deboires-de-wordpress/
date: '2007-03-05 00:15:56 +0100'
date_gmt: '2007-03-04 22:15:56 +0100'
categories:
- Valhalla
tags:
- sécurité
- Web
- serveur
---
<p>Il y a quelques jours, 3 précisément, j'ai mis à jour l'installation de WordPress, le logiciel qui sert ce support à ce site. Je suis passé de la version 1.0 à la version 1.1.1. Et voilà qu'aujourd'hui je lis sur le site officiel qu'il est urgent de passer en version 1.1.2. Il semblerait qu'il y ait eu un léger souci de nature hackesque...</p>
<p><a id="more"></a><a id="more-113"></a></p>
<p>Les serveurs du site officiel de WordPress ont en effet été "hackés", ce qui signifie, peu ou prou, piratés. Le petit malin a réussi a modifier le code source de WordPress dans les archives ZIP et tar.gz que tous les utilisateurs de WP téléchargent pour effectuer la mise à jour. Il a introduit dans WP une énorme faille de sécurité qui permet d'exécuter du code PHP à distance.</p>
<p>Le problème est que cette faille ayant été introduite dans le code source de WordPress, elle apparaîtra sur tous les sites qui ont été mis à jour en version 1.1.1 ces trois derniers jours. Cela représente sûrement plusieurs milliers de blogs. Or, il est absolument certain que tout le monde ne sera pas rapidement au courant du problème. C'est par pur hasard que j'ai moi même appris la nouvelle, en me rendant dans l'espace administration de WP ce soir. Les gens qui utilisent des logiciels tels qu'<a href="http://ecto.kung-foo.tv/">ecto</a> pour rédiger leurs billets n'auront pas vu la note dans l'espace administration de WP. Il n'auront pas fait la mise à jour vers la version 1.1.2, saine. Leur blog sera exposé à une exploitation malveillante de la faille de sécurité.</p>
<p>C'est assurément un coup dur pour WordPress, le logiciel de blog le plus utilisé dans le monde. Ils disent qu'ils feront tout leur possible pour que cela ne se reproduise pas. Mais le mal est potentiellement déjà fait. Ce hack peut faire un terrible flop si peu de mises à jour on été faites pendant ces trois jours, ou si beaucoup de blogs sont mis à jour vers la version 1.1.2 rapidement. Ou encore, si personne n'exploite finalement la faille. Dans le cas contraire, de nombreux utilisateurs risquent de passer de WP vers un autre logiciel de blog. Il y en a tant maintenant, le français <a href="http://www.dotclear.net/">Dotclear</a> étant le premier d'entre eux.</p>
<p>Bref, à part ça, l'interface du site Valhalla a totalement changé. Je suis revenu au bleu sur fond blanc, très sobre. J'adore ce nouveau thème graphique. Ma période gothique "orange sur fond noir" semble terminée. C'est peut être dû à l'arrivée des beaux jours ?</p>
<p><strong>Edit</strong><br />
Quel choc ! Ce billet que je viens de publier il y a 2 minute, à 23h17, est horodaté à 0h17 ! Non... ce n'est pas dû au hack, c'est juste un problème de réglage dans le panneau de configuration. Heure d'hiver, heure d'été... Mais tout de même, ça fait bizarre de se dire que l'on est en train de lire un texte publié qui ne sera en fait publié que dans une heure ! Ca donne l'impression de voir le futur... il est tard, je divague.</p>
