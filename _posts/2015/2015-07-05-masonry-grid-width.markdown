---
layout: "post"
published: true
title: "Jekyll+Masonry : des boîtes de tailles diverses"
author: GF
date: "2015-07-05 15:49"
place: Montpellier
categories:
- Valhalla
- Informatique
tags:
- software
- Web
- programmation
- technique
- Jekyll
comments: true
permalink:  /2015/07/05/masonry-grid-width/
---

La [nouvelle page d'accueil de Valhalla.fr]({% post_url /2015/2015-07-04-valhalla-nouvelle-page-accueil %}) est construite avec des « boîtes » qui s'empilent. La première version mise en ligne imposait à toutes les boîtes d'avoir la même largeur, tandis qu'elle leur permettait d'avoir une hauteur variable. Désormais, les boîtes peuvent s'étendre sur une colonne (par défaut), deux, trois ou quatre colonnes.

Il faut modifier un peu les feuilles de style :

{% highlight css %}
.grid-sizer, 
.grid-item { width: 23%; }
.grid-item.w2 { width: 48%; }
.grid-item.w3 { width: 75%; }
.grid-item.w4 { width: 98%; }
{% endhighlight %}

Un conteneur _div_ vide, avec la classe _.div-sizer_ est placé avant la première boîte.

{% highlight html %}
{% raw %}
  <div class="grid">
      <div class="grid-sizer"></div>
  {% for post in paginator.posts %}
	{% include excerpt.html %}
  {% endfor %}
  </div>
{% endraw %}
{% endhighlight %}

Enfin, l'on recherche la taille désirée dans le _front-matter_ de chaque fichier. La variable est appelée _grid-width_ ; elle prend les valeurs 2, 3 ou 4. Si elle est absente, la boîte aura la taille 1, par défaut. Le code du fichier _excerpt_ est modifié en fonction afin d'appliquer la classe CSS idoine.

{% highlight html %}
{% raw %}
{% assign grid = 'grid-item' %}
{% if post.grid-width == 2 %}
    {% assign grid = 'grid-item w2' %}
{% elsif post.grid-width == 3 %}
    {% assign grid = 'grid-item w3' %}
{% elsif post.grid-width == 4 %}
    {% assign grid = 'grid-item w4' %}
{% endif %}

<div class="{{grid}} thumbnail">
    ...
{% endraw %}
{% endhighlight %}


