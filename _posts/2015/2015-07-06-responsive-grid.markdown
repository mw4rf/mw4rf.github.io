---
layout: "post"
published: true
title: "Responsive grid: adaptation de la page d'accueil aux smartphones et tablettes"
author: GF
date: "2015-07-06 11:21"
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
permalink:  /2015/07/06/responsive-grid/
thumbnail: /public/posts/2015-07-06-responsive-grid/iphone.png
---

La [nouvelle page d'accueil du site]({% post_url /2015/2015-07-04-valhalla-nouvelle-page-accueil %}) nécessite une adaptation selon la taille de l'écran : quatre colonnes par défaut pour les écrans d'ordinateurs, mais deux seulement sur les tablettes et une sur les téléphones. Sans une telle adaptation, le contenu est illisible sur les petits écrans, le texte sort notamment des « boîtes » et la grille perd sa géométrie habituelle.

Pour adapter la mise en page aux petits écrans, j'ai d'abord défini deux tailles particulières, pour les tablettes et pour les téléphones :

{% highlight css %}
$tablet: 768px;
$phone:  480px;
{% endhighlight %}

Ensuite, deux blocs particuliers permettent de redéfinir les styles CSS pour ces résolutions, et pour elles seulement :

{% highlight css %}
.grid {
    width: 98%;
    margin: 30px auto 0 2%;
}

// Computer screen
$item-width: 23%;
.grid-sizer, 
.grid-item { width: $item-width; }
.grid-item.w2 { width: $item-width * 2 + 2; }
.grid-item.w3 { width: $item-width * 3 + 4; }
.grid-item.w4 { width: $item-width * 4 + 6; }

// Tablet
@media only screen and (max-width : $tablet) {
    $item-width: 48%;
    .grid-sizer, 
    .grid-item { width: $item-width; }
    .grid-item.w2 { width: $item-width * 2 + 2; }
    .grid-item.w3 { width: $item-width; }
    .grid-item.w4 { width: $item-width; }
}

// Phone
@media only screen and (max-width : $phone) {
    $item-width: 98%;
    .grid-sizer, 
    .grid-item { width: $item-width; }
    .grid-item.w2 { width: $item-width; }
    .grid-item.w3 { width: $item-width; }
    .grid-item.w4 { width: $item-width; }
}
{% endhighlight %}

Le résultat est le suivant sur **iPad Mini** :

![iPad Screen](/public/posts/2015-07-06-responsive-grid/ipad.png "Sur iPad Mini")

Et sur **iPhone 6 Plus** :

![iPhone 6 Screen](/public/posts/2015-07-06-responsive-grid/iphone.png "Sur iPhone 6 Plus")