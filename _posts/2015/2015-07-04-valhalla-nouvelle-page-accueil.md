---
layout: "post"
published: true
title: "Nouvelle page d’accueil !"
author: GF
date: "2015-07-04 17:24"
place: Montpellier
thumbnail: /public/posts/2015-07-04-valhalla-nouvelle-page-accueil/new-valhalla.png
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
permalink:  /2015/07/04/valhalla-nouvelle-page-accueil/
grid-width: 2
---

La page d’accueil du site Valhalla.fr fait peau neuve. Finie la présentation en liste verticale des articles, qui prend beaucoup de place et ne permet pas de cerner immédiatement le contenu des articles. La nouvelles présentation place le titre et un court résumé de chaque article dans des cases arrangées horizontalement et verticalement. Elle est plus efficiente, plus moderne et plus jolie !

## Premier essai avec Twitter Bootstrap

L’idée de départ de cette nouvelle présentation m’est venue en apercevant [la classe thumbnail de Twitter Boostrap][1]. Comme l’interface du site est déjà construire avec Bootstrap, ce n’était pas bien difficile d’utiliser une nouvelle classe.

{% highlight html %}
<div class="thumbnail">
    <img src="..." alt="...">
    <div class="caption">
        <h2><a href="...">titre</a></h2>
        résumé
    </div>
</div>
{% endhighlight %}

Cependant, cette approche nécessitait de modifier la _boucle_ d’affichage des articles sur la page principale, afin d’en afficher quatre à la suite, horizontalement, avant de changer de ligne et d’affiche les quatre articles suivants. Il faut réfléchir un peu pour écrire le code source correspondant…

{% highlight html linenos=table %}
{% raw %}
{% for post in paginator.posts %}
{% assign row = forloop.index | modulo: 4 %}
{% if row == 1 %}
    <div class="row">
        {% include excerpt.html %}
{% elsif row == 0 %}
        {% include excerpt.html %}
    </div>
{% else %}
        {% include excerpt.html %}
{% endif %}
{% endfor %}
{% endraw %}
{% endhighlight %}

La ligne 1 lance la boucle des _posts_, de manière très classique. La ligne 2 définit une variable _row_ qui a pour valeur le reste de la division (opérateur modulo) de la position actuelle dans la boucle (forloop.index) par quatre, puisque nous voulons quatre « boîtes » avant de changer de ligne. Cette variable prend quatre valeurs différentes : 0, 1, 2, 3. La valeur 1 correspond à la première boîte de la ligne, d’où l’ouverture du _div_ avec la classe _row_ définie par Bootstrap (lignes 3-5). La valeur 0 correspond à la dernière boîte de la ligne, d’où la fermeture du _div_ (lignes 6-8). Enfin, les valeurs 2 et 3 correspondent aux deux boîtes en milieu de ligne, qui ne nécessitent pas de traitement particulier. Le contenu des boîtes (titre de l’article, résumé, lien vers l’article complet, catégories…) est défini dans le fichier _excerpt.html_.

Cela fonctionne parfaitement, mais c’est moche : chaque ligne a la hauteur de la boîte la plus haute, ce qui crée des espaces blancs dans la page. Selon la documentation de Bootstrap,  _If you're looking for Pinterest-like presentation of thumbnails of varying heights and/or widths, you'll need to use a third-party plugin…_ Le schéma ci-dessous illustre le problème.

![][image-1]

Le résultat que l’on veut obtenir est représenté par le schéma suivant :

![Alignement avec Masonry][image-2]

## Utilisation de Masonry

Le _framework_ [Masonry][2] permet d’obtenir le résultat voulu.

L’installation est très simple, il suffit d’inclure le _framework_ est de l’initialiser, ce qui est ici fait dans un fichier _js.md_ inclus à la fin des pages du site.

{% highlight html %}
<script src="{{ "/assets/masonry.min.js" | prepend: site.baseurl }}" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
	// Initialize Masonry
	$('.grid').masonry({
		itemSelector: '.grid-item',
		columnWidth: '.grid-item',
		gutter: parseInt($('.grid-item').css('marginBottom'))
	});
</script>
{% endhighlight %}

Un _div_ portant la classe _grid_ contient toutes les boîtes, qui sont elles identifiées par la classe _grid-item_.

{% highlight html %}
{% raw %}
<div class="grid">
  {% for post in paginator.posts %}
	{% include excerpt.html %}
  {% endfor %}
  </div>
{% endraw %}
{% endhighlight %}

{% highlight html %}
<div class="grid-item thumbnail">
    <img src="..." alt="...">
    <div class="caption">
        <h2><a href="...">titre</a></h2>
        résumé
    </div>
</div>
{% endhighlight %}

La « gouttière » (_gutter_) correspond à l’espace vide horizontal entre chaque boîte ; sa valeur correspond ici à la marge inférieure des boîtes. Il reste donc à définir les styles CSS pour dessiner les boîtes.

{% highlight css %}
.grid {
	width: 98%;
	margin: 30px auto 0 2%;
}

.grid-item {
	width: 23%;
}
{% endhighlight %}

La largeur (_width_) de chaque boîte permet de déterminer, en prenant en compte l’espace blanc laissé par les bordures du continuer principal _.grid_ et les gouttières, le nombre de boîtes par lignes. Ainsi, 25% de la taille totale du conteneur pour chaque boîte, cela correspond à 4 boîtes par lignes (4x25=100). La valeur est ici abaissée à 23% pour prendre en compte les espaces vides séparant les boîtes.

Et voilà le travail !

![][image-3]

NB: le code source de ce site est disponible à l’adresse suivante : [https://github.com/mw4rf/mw4rf.github.io][3]

[1]:	http://getbootstrap.com/components/#thumbnails
[2]:	http://masonry.desandro.com/
[3]:	https://github.com/mw4rf/mw4rf.github.io

[image-1]:	/public/posts/2015-07-04-valhalla-nouvelle-page-accueil/thumbnails1.png "Alignement avec Bootstrap"
[image-2]:	/public/posts/2015-07-04-valhalla-nouvelle-page-accueil/thumbnails2.png
[image-3]:	/public/posts/2015-07-04-valhalla-nouvelle-page-accueil/new-valhalla.png