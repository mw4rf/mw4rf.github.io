---
layout: post
status: publish
published: true
title: Encore des changements !

  
  



wordpress_id: 37
wordpress_url: http://localhost/~guillaume/gfblog/wordpress/?p=37
date: '2005-10-04 22:49:18 +0200'
date_gmt: '2005-10-04 20:49:18 +0200'
categories:
- Valhalla
tags:
- Valhalla
permalink:  /2005/10/04/encore-des-changements/
---
<p>
Je ne tiens vraiment pas en place ! Au début, j'avais fait un site avec des templates Dreamweaver. Ca a tenu une quinzaine de jours avant que j'installe Dotclear pour blogger. Et puis j'ai laissé tomber Dotclear pour revenir au pur HTML. J'ai ensuite délaissé le site Valhalla parce que l'interface graphique ne me plaisait pas, et que je n'avais pas le temps d'en créer une autre. Cet été, j'ai pris le temps, et j'en ai créé une nouvelle. Dans le même mois -septembre 2005-, j'ai fait une autre version de l'interface Valhalla, totalement différente. La seule chose qui changeait, c'était les CSS. Côté HTML, j'avais retenu la leçon des templates Dreamweaver, et j'étais déterminé à créer un système qui ne m'oblige pas à changer de structure pour changer d'apparence. Et maintenant... le 4 octobre, je change encore !</p>
<p>
Quand j'ai choisi de créer le site en PHP avec des includes XHTML+CSS, c'était pour les raisons suivantes:</p>
<ul>
<li />Les bases de données ne sont pas toujours très stables. Il est facile d'altérer une table et de tout foutre en l'air. A l'inverse, une fichier HTML est du texte brut agrémenté de quelques balises. Ca ne peut pas planter: une fois que le fichier est sur le serveur, il ne peut plus bouger.
<li />Le HTML simple (et j'ai bien veillé à ce que le code des fichiers contenant le texte soit réduit au maximum) ne changera pas de sitôt. Par contre, les bases de données et le moteur PHP sont en constante évolution. Sans parler du logiciel de blog...
<li />Avec un fichier HTML, pas de problème d'encodage. Avec MySQL, c'est une autre histoire !
<li />Je n'avais à l'époque aucune alternative à PHPMyAdmin pour exporter et dumper les tables MySQL. Or, à cause du timeout, il est impossible de faire ou de restaurer des fichiers de sauvegardes de plusieurs MO.
</ul></p>
<p>
Heureusement, j'ai résolu certains de ces problèmes:</p>
<ul>
<li />Je ne réalise plus mes sauvegardes avec PHPMyAdmin. Je peux exporter et dumper des fichiers de plusieurs centaines de MO sans aucun problème (si ce n'est que ça prend la journée...).
<li />Fi des problèmes d'encodage: tout en ISO Latin 1 ! UTF-8, à la poubelle !
</ul></p>
<p>
Quand aux motivations qui m'on poussé à adopter la structure blog (basé sur Dotclear), elles sont les suivantes:</p>
<ul>
<li />Le moteur de recherche interne qui lance une recherche dans la base de données. Il est impossible d'implémenter un tel système de recherche si le contenu est stocké dans des fichiers HTML.
<li />Le tri <em>automatique</em> par mois et années des articles. C'est mieux qu'à la main...
<li />Le classement par catégories. Un double classement est trop lourd à gérer en HTML sans dupliquer les fichiers.
</ul></p>
<p>
J'ai longtemps hésité entre WordPress et Dotcleat. Je préférais WP pour son interface. Mais j'ai finalement choisi Dotclear pour trois raisons:</p>
<ul>
<li />Développé en France et totalement localisé en français, comme la plupart des thèmes.
<li />Encodage ISO Latin 1 là où WP recommande l'UTF-8.
<li />Les thèmes sont plus faciles à transformer de fixed-width à 100% width.
</ul></p>
<p>
<em><br />
<strong>EDIT:</strong> J'ai encore changé... je suis passé à WP pour de bon. J'ai réussi à tout installer en ISO-8859-1, et j'ai trouvé le thème ultime (Aqua-Soft). Le seul souci que j'ai, c'est que je n'ai pas réussi à trouver -pour le moment- deux plugins que j'adorais dans Dotclear: le sommaire (celui de WP est moins bien car il ne classe pas les articles par mois), et le nombre de lectures par billet.<br />
</em></p>
<p>
A propos de la largeur fixe dans les blogs, je ne comprend pas. Les blogs c'est fait pour écrire, non ? Alors pourquoi faire une zone centrale toute petite, puisque c'est la zone destinée à contenir le texte ? Je préfère vraiment avoir une zone très large (dans les 80% de la largeur de l'écran) pour que la lecture soit moins contraignante !</p>
<p>
J'ai donc installé DotCleat. J'ai aussi installé le thème "Chaude Journée" et je l'ai adapté à mes besoins (vous l'aurez compris, en 100% width). Ensuite, j'ai inséré tous les articles dans la base de données, j'ai mis à jour les dates et je les ai classé par catégories.</p>
<p>
I'm ready to blog ! :)</p>
