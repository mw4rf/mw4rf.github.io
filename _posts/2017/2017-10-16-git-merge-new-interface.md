---
layout: post
published: true
title: "Git merge new-interface"
author: GF
excerpt: "Valhalla.fr fait peau neuve ! La nouvelle interface toute pleine de sobriété est un retour aux sources de ce site né il y a plus de dix ans. Que cette cure de jouvence lui redonne une nouvelle vie !"
date: '2017-10-16 19:49:10'
categories:
- Informatique
- Valhalla
tags:
- Jekyll
- programmation
- Web
- plaintext
permalink:  /2017/10/16/git-merge-new-interface/
---

Quelques lignes seulement...

    git checkout master
    git merge new-interface
    git push


Et _voilà_ !

Mais ces quelques lignes masquent un travail important. Compliquer les choses, en rajoutent de nouveaux éléments petits à petit, n'est pas si difficile ; c'est même probablement l'une des pires habitudes des _geeks_. En revanche, retirer des fonctionnalités existantes et simplifier le contenant pour mettre en valeur le contenu, est moins aisé. Il faut faire des choix.

Un point de rupture semble avoir été atteint, ces dernières années, dans la conception des interfaces informatiques : le minimalisme est en vogue, il faut épurer, aplanir, éclaircir. L'influence d'Apple, en particulier d'iOS, y est certainement pour beaucoup.

Toujours est-il que Valhalla.fr revient à sa première interface, celle de 2005, aux couleurs pastel et à l'interface dépouillée. Cette fois, c'est un peu moins marron et un peu plus gris-bleu. Bien entendu, quelques coquetteries CSS3 se sont glissées ça et là.

Le nouveau site reste construit avec [Jekyll](https://jekyllrb.com) et, pour le moment, hébergé par [GitHub Pages](https://pages.github.com). Le _framework_ CSS a toutefois changé : adieu à [Bootstrap et Masonry](/2015/07/04/valhalla-nouvelle-page-accueil/), bienvenue [Bulma](https://bulma.io). L'ensemble est plus léger et entièrement _responsive_. La configuration à l'aide de [SASS](http://sass-lang.com) est un vrai plaisir. Quant à Jekyll lui-même, je regrette simplement que GitHub ne mette pas à jouer ses _plugins_ par défaut, comme _jekyll-paginator_ qui n'est plus développé.

Il ne me reste plus qu'à écrire !











