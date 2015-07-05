---
layout: "post"
published: true
title: "Des images automatiquement redimensionnées avec Bootstrap"
author: GF
date: "2015-07-04 22:52"
place: Montpellier
thumbnail: /public/posts/2015-07-04-bootstrap-responsive-images/rainbow.jpg
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
permalink:  /2015/07/04/bootstrap-responsive-images/
grid-width: 2
---

Une image vaut mille mots… mais encore faut-il la voir correctement ! Il est souvent difficile de faire parfaitement cadrer une image dans un conteneur HTML, pour l’afficher sur un site Web. Depuis quelques années, les tailles d’écran varient énormément, du minuscule iPhone 4 à l’écran panoramique 30 pouces. Twitter Boostrap offer une manière élégante de redimensionner une image en l’adaptant _automatiquement_ au conteneur dans lequel elle se trouve.

La documentation est accessible ici : [http://getbootstrap.com/components/#responsive-embed](Twitter Boostrap : responsive embed).

C’est cette méthode qui est utilisée dans la nouvelle page d’accueil de ce site. Mais avec une subtilité : un seul fichier doit être utilisé pour afficher l'image dans différentes tailles, sur la page d'accueil que la « boîte » qui la contient occupe une ou plusieurs colonnes, ou dans le corps des articles.

L'image est donc référencée dans le _frontmatter_ de charque article, de cette manière :

    thumbnail: /public/posts/2015-07-04-bootstrap-responsive-images/rainbow.jpg

Dans le code source de la page d'accueil, l'on trouve les instructions pour afficher l'image :

{% highlight html %}
{% raw %}
{% if post.thumbnail %}
    <img class="img-responsive" src="{{ post.thumbnail }}" />
{% endif %}
{% endraw %}
{% endhighlight %}

La classe _img-responsive_ appartient à Bootstrap, c'est elle qui fait le boulot. Quant à l'image, elle peut être définie au moment de l'écrite de l'article, sans toucher au code source : elle trouvera automatiquement la bonne place.

À titre d'exemple, l'image utilisée dans cet article apparaît ci-dessous à la taille de la page (elle ne déborde pas). Il suffit de cliquer dessus pour l'afficher en pleine résolution.

<a href="/public/posts/2015-07-04-bootstrap-responsive-images/rainbow.jpg"><img src="/public/posts/2015-07-04-bootstrap-responsive-images/rainbow.jpg"></a>