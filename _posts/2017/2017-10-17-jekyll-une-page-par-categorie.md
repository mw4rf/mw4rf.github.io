---
layout: post
published: true
title: "Jekyll: créer une page par catégorie et un menu des catégories"
author: GF
excerpt: "Le générateur de sites statiques Jekyll collecte les catégories associées aux articles publiés, mais il ne permet pas de les afficher de manière simple. Ce qui suit a pour le but d'expliquer l'implémentation mise en œuvre sur Valhalla.fr"
date: '2017-10-17 17:03:20'
categories:
- Informatique
- Valhalla
tags:
- Jekyll
- programmation
- Web
- plaintext
permalink:  /2017/10/16/jekyll-une-page-par-categorie/
---

# Problématique

Selon la documentation officielle, Jekyll 3 [gère les collections](https://jekyllrb.com/docs/collections/). Il s'agit d'organiser du contenu à la manière d'un tableau : colonnes / lignes.

L'une de ces collections, activée par défaut, est celle des catégories. Les catégories permettent de définir la taxonomie hiérarchique habituelle des sites, là où les _tags_ définissent une taxonomie transversale. Ainsi, par exemple, le _frontmatter_ de cet article contient la section suivante :

    categories:
    - Informatique
    - Valhalla

Cela place cet article dans les deux catégories mentionnées. Il devient ainsi possible de dresser un tableau avec les catégories associées aux différents articles.

|           | Catégorie A | Catégorie B | Catégorie C | Catégorie D |
|-----------|-------------|-------------|-------------|-------------|
| Article 1 | X           |             | X           |             |
| Article 2 |             | X           |             | X           |
| Article 3 | X           | X           | X           |             |

Cette classification traditionnelle est pratique et il est bienvenu que Jekyll la gère. De nombreux tutoriels en ligne décrivent comment créer une page avec la liste de toutes les catégories et, sous le nom d'une catégorie donnée, tous les articles qui lui appartiennent. Cela donne quelque chose de ce genre:

```liquid
{% raw %}
{% for category in site.categories %}
    <h2>{{ category[0] }}</h2>
    <ul>
        {% for post in category[1] %}
        <li>{{post.title}}</li>
        {% endfor %}
    </ul>
{% endfor %}
{% endraw %}
```

Rappelons, pour mémoire, que `collection[0]` contient le nom de la collection et `collection[1]` son contenu (ici, une liste de _posts_).

Tout cela est très simple. En revanche rien n'est dit dans la documentation sur la manière de créer _une page par catégorie_, au lieu d'une page regroupant _toutes les catégories_. Les choses se compliquent.

# Une page par catégorie

On verra successivement comment activer la création des pages de catégorie par Jekyll, créer un _template_ pour afficher ces pages, choisir quelles catégories doivent être traitées.

## Activer la création des pages

La première étape pour créer _une page par catégorie_ est d'éditer le fichier de configuration `_config.yml` à la racine de son dossier Jekyll. Il convient de lui ajouter les instructions suivantes:

```yaml
# Liste des catégories
collections:
  category:
    output: true # générer la page HTML
    permalink: /:collection/:name/index.html
    # exemple -> /category/informatique/index.html

defaults:
  - scope:
      path: ""
      type: category
    values:
      layout: "category"
      # layout utilisé -> _layouts/category.html
```

## Créer un template pour afficher les pages de catégorie

Les instructions ci-avant, placées dans le fichier de configuration, commandent à Jekyll de générer une page par catégorie, en utilisant le _template_ `_layouts/category.html`. C'est donc ce fichier qu'il convient à présent de créer, avec un contenu semblable à celui-ci -- à adapter à vos besoins, bien entendu:

```liquid
{% raw %}
<h1>{{ page.title }}</h1>
<h2>{{ page.description }}</h2>

<ul>
    {% for post in site.categories[page.category] %}
    <li>{{ post.title }}</li>
    {% endfor %}
</ul>
{% endraw %}
```

L'instruction intéressante ici est `for post in site.categories[page.category]`. C'est une boucle _for_ qui parcourt la liste des _posts_ trouvés dans la catégorie _(site.categories[])_ identifiée par l'index _page.category_. Ce fichier étant un _template_ destiné à recevoir le contenu d'autres fichiers, il suffira de définir, dans ces autres fichiers, la variable _page.categorie_ à la valeur de la catégorie dont on entend afficher le contenu.

Il faut donc désormais créer manuellement une page pour chaque catégorie que l'on veut afficher. Outre la variable _page.categorie_, qui indique la nom de la catégorie qui correspond à cette page, deux variables faciliteront l'affichage : _page.title_ et _page.description_.

## Créer un fichier par catégorie que l'on veut afficher

Chaque catégorie que l'on veut afficher est décrite dans un fichier ; tous ces fichiers sont à placer dans le dossier `_category`, à la racine du site.

Ainsi, par exemple, l'on pourra créer le fichier `_category/valhalla.md`, pour la catégorie _Valhalla_:

```yaml
---
title: Catégorie Valhalla
category: Valhalla
description: "À propos de ce site."
---
```

La procédure manuelle est un peu fastidieuse, mais elle présente plusieurs avantages:

- elle est compatible avec [GitHub Pages](https://pages.github.com/) ;
- elle permet de choisir les catégories que l'on veut afficher et d'exclure les autres.

En outre, la liste des catégories n'étant pas destinée à changer souvent, contrairement à la liste des _tags_, il devrait être rarement nécessaire de créer un nouveau fichier de catégorie. _Valhalla.fr_, par exemple, n'a pas changé ses catégories depuis plusieurs années.

À ce stade, le code est complet. Le site peut être compilé et les catégories seront visibles à l'adresse définie dans le fichier de configuration. Dans notre exemple, la page que nous venons de créer est affichée à l'adresse `/category/valhalla/index.html`.

# Un menu des catégories

Quel intérêt de créer une page par catégorie, si ce n'est de permettre aux visiteurs de choisir la catégorie qu'ils souhaitent consulter ? Pour ce faire, l'on peut songer à créer un menu présentant la liste des catégories.

La création d'un tel menu est relativement simple si l'on souhaite afficher _toutes_ les catégories. En revanche, les choses se compliquent si l'on désire cacher l'un ou l'autre des catégories. Dans cette hypothèse, la page de catégorie a été omise pour une catégorie donnée. Dans ce cas, Jekyll génèrera un lien vers une page inexistante, ce qui ne manquera pas de confondre les visiteurs qui le suivraient.

## Version simple: toutes les catégories

S'il existe un fichier de catégorie par catégorie, autrement dit si aucune catégorie n'est exclue de l'affichage, le code souce du menu est simple. Il pourrait être rédigé ainsi:

```liquid
{% raw %}
<ul>
    {% for category in site.categories %}
    <li>
        <a href="/category/{{ category[0] | slugify }}">
            {{ category[0] }}
        </a>
    </li>
    {% endfor %}
</ul>
{% endraw %}
```

## Version complexe: exclusion de certaines catégories

Pour les raisons expliquées ci-dessus, la version simple du menu des catégories affiche un lien pour _chaque_ catégorie, sans vérifier si la page de cette catégorie existe. Si tel n'est pas le cas, l'erreur 404 est inévitable.

Pour contourner ce problème, l'on peut définir manuellement le contenu du menu. C'est malheureusement une étape manuelle de plus, mais elle a un avantage : elle permet de gérer les catégories comportant plusieurs mots ou des caractères étranges.

La procédure débute par la création d'un fichier `_data/categories.yml` avec le contenu suivant:

```yaml
- name: Valhalla
  file: valhalla

- name: Ma superbe Catégorie avec un nom trèèèèès long
  file: ma-super-categorie
```

Les deux paramètres de chaque catégorie correspondent aux deux paramètres des liens HTML : le nom et l'adresse. En l'occurrence, l'adresse s'appelle _file_ puisqu'il s'agit du nom du fichier de catégorie que l'on veut afficher. Chaque catégorie mentionnée ici doit en effet avoir un fichier de catégorie associé. Il s'agit dans notre exemple, respectivement de:

- `_category/valhalla.md`
- `_category/ma-super-categorie.md`

Toute catégorie existant sur le site qui n'est pas mentionnée dans ce fichier sera omise lors de la création du menu. Celui-ci peut désormais être écrit avec un code semblable à celui-ci:

```liquid
{% raw %}
<ul>
    {% for category in site.data.categories %}
    <li>
        <a href="/category/{{ category.file | slugify }}">
            {{ category.name }}
        </a>
    </li>
    {% endfor %}
</ul>
{% endraw %}
```

Cette méthode est celle actuellement en œuvre sur Valhalla.fr ; elle fonctionne parfaitement avec GitHub Pages, sans plugin externe et sans trop ralentir la compilation du site.




