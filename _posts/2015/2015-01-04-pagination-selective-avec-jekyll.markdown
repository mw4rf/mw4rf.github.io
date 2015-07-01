---
layout: post
published: true
title: Pagination sélective avec Jekyll
author: GF
excerpt: "Plus de place ! La ligne est pleine. Elle déborde sur la suivante. Les petits numéros alignés, sur lesquels l'on clique pour passer d'une page à l'autre, ne tiennent plus à l'écran. Le blog a vieilli, le temps s'est écoulé, les articles se sont accumulés. Ils remplissent des pages et des pages ; il n'est plus possible de toutes les afficher d'un coup. Comment faire ? La pagination sélective est la solution : afficher quelques pages seulement avant la pages actuelle, et quelques pages seulement après elle."
date: '2015-01-04 13:58:07'
categories:
- Informatique
tags:
- Jekyll
- programmation
- Web
permalink:  /2015/01/04/pagination-selective-avec-jekyll/
---

Plus de place ! La ligne est pleine. Elle déborde sur la suivante. Les petits numéros alignés, sur lesquels l'on clique pour passer d'une page à l'autre, ne tiennent plus à l'écran. Le blog a vieilli, le temps s'est écoulé, les articles se sont accumulés. Ils remplissent des pages et des pages ; il n'est plus possible de toutes les afficher d'un coup. Comment faire ? La pagination sélective est la solution : afficher quelques pages seulement avant la pages actuelle, et quelques pages seulement après elle.

Voici une illustration du phénomène, une image vaut mille mots :

![Illustration](/public/posts/2015-01-04-pagination-selective-avec-jekyll/paginations.png "Illustration")

La page actuelle est la quinzième. Sur la **première ligne**, l'on voit que tous les numéros de page sont affichés : il y a 28 pages en tout. Bien sûr, c'est pratique : puisque tous les numéros sont affichés, l'on peut sauter d'une page à l'autre en un clic, mêmes si les deux pages sont très éloignées l'une de l'autre. En revanche, l'on ne peut plus afficher le décompte des pages en gros, car il serait scindé en plusieurs lignes. La solution à ce problème se trouve à la **seconde ligne** qui n'affiche que _trois pages avant_ la page actuelle et _trois pages après_ elle.

Comment implémenter un tel compteur avec [Jekyll](http://jekyllrb.com/) ? Voici le code source :

{% highlight html linenos %}
{% raw %}

    <div class="text-center">
      <ul class="pagination pagination-lg">
        {% if paginator.previous_page %}
          {% if paginator.previous_page == 1 %}
            <li><a href="/">&laquo;</a></li>
          {% else %}
            <li><a href="{{ paginator.previous_page_path }}">&laquo;</a></li>
          {% endif %}
        {% else %}
          <li class="disabled"><a href="#">&laquo;</a></li>
        {% endif %}

        {% capture start %}{{ paginator.page | minus:3 }}{% endcapture %}
        {% capture end %}{{ paginator.page | plus:3 }}{% endcapture %}
        
        {% for count in (start..end) %}
          {% if count > 0 and count <= paginator.total_pages %}
            {% if count == paginator.page %}
                <li class="active"><a href="#">{{count}}</a></li>
            {% else %}
              {% if count == 1 %}
                <li><a href="/">1</a></li>
              {% else %}
                <li>
                    <a href="{{ site.paginate_path | replace: ':num', count }}">
                        {{count}}
                    </a>
                </li>
              {% endif %}
            {% endif %}
          {% endif %}
        {% endfor %}

        {% if paginator.next_page %}
          <li><a href="{{ paginator.next_page_path }}">&raquo;</a></li>
        {% else %}
          <li class="disabled"><a href="#">&raquo;</a></li>
        {% endif %}
      </ul>
    </div>
    
{% endraw %}
{% endhighlight %}

Explications.

- **Lignes 1-2** : Les numéros sont affichés à l'aide de styles Twitter Bootstrap. L'on utilise donc un ``div`` centré horizontalement et une liste désordonnée ``ul``.
- **Lignes 3-11** : Premier cas à envisager : existe-t-il une _page précédente_ ? Si l'on se trouve actuellement sur la première page, il n'y a rien avant elle. Par conséquent, le bouton **&laquo;** doit être désactivé, puisque l'on ne peut pas aller _en arrière_. À l'inverse, lorsque l'on n'est pas sur la première page, l'on peut revenir en arrière, si bien que le bouton doit être activé.
- **Lignes 4-5** : Il y a une bizarrerie dans la mécanique de pagination de Jekyll : toutes les pages sont identifiées d'une certaine manière (par exemple, _page15_, _page15_, _page16_), sauf la première qui correspond à la page d'accueil du blog. Par conséquent, il faut lui réserver un traitement spécial.
- **Lignes 13-14** : C'est l'essentiel de la logique du système de pagination sélective. L'on définit ici les pages à afficher, c'est-à-dire en l'occurrence les _trois pages avant la page actuelle et les trois pages après elle_. L'on calcule donc le numéro de la première page (page actuelle - 3) et le numéro de la dernière page (page actuelle + 3). L'utilisation du _tag Liquid_ ``capture`` ne semble pas être très naturelle ; il aurait en effet été plus élégant d'écrire directement la boucle (à la ligne 16) de cette manière : ``for i in ((paginator.page - 3)..(paginator.page + 3))`` ; mais pour une raison qui m'est inconnue, ce code ne fonctionne pas avec ma version de Jekyll et de Liquid. La définition de variables avec ``define start = paginator.page - 3`` ne fonctionne pas non plus. Le code présenté est inélégant mais fonctionnel.
- **Ligne 16** : L'intervalle des pages à afficher étant défini, il reste à le parcourir grâce à une boucle.
- **Ligne 17** : Puisque l'intervalle est délimité par la page actuelle moins 3 d'un côté et la page actuelle plus 3 de l'autre, il y a un risque de sortir des bornes. Si la page actuelle est la première, par exemple, ``1 - 3 = -2`` ; or, la page -2 n'existe pas ! Il faut donc vérifier que le résultat du calcul _(page actuelle - 3)_ soit toujours supérieur à 0, de telle manière que la première page soit toujours la page n°1. Il en va de même dans l'autre sens : la borne supérieure est la dernière page.
- **Lignes 18-19** : Lorsque la boucle arrive à la page actuelle, elle l'identifie d'une certaine manière afin de la distinguer des autres pages.
- **Lignes 21-22** : La première page reçoit un traitement particulier (v. Lignes 4-5).
- **Lignes 24-28** : Ces lignes affichent les pages qui ne sont pas la page actuelle, en leur associant les liens idoines.
- **Lignes 34-38** : v. Lignes 3-11, même chose pour la dernière page et le bouton **&raquo;**.
