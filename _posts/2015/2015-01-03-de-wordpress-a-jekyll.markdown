---
layout: post
published: true
title: "De WordPress à Jekyll"
author: GF
excerpt: "Pour fêter son 10ème anniversaire, Valhalla.fr fait peau neuve ! Fini WordPress et les pages dynamiques générées par un moteur PHP, bienvenue à Jekyll, générateur de sites statiques. Il fallait bien cela, en 2015 : WordPress, c'est has been ! Et pourtant, les pages statiques sont un retour au Web 1.0 du 20ème siècle..."
date: 2015-01-03 23:18
place: Montpellier
categories:
- Valhalla
tags:
- software
- Web
- programmation
- technique
- Jekyll
- plaintext
comments: true
permalink:  /2015/01/03/de-wordpress-a-jekyll/
---

Pour fêter son 10ème anniversaire, Valhalla.fr fait peau neuve ! Fini WordPress et les pages dynamiques générées par un moteur PHP, bienvenue à Jekyll, générateur de sites statiques. Il fallait bien cela, en 2015 : WordPress, c'est _has been_ ! Et pourtant, les pages statiques sont un retour au Web 1.0 du 20ème siècle...

# Le changement

Blague à part, il faut de bonnes raisons pour abandonner un _framework_ moderne et en revenir à ce qui se faisait il y a vingt ans, les pages statiques. [WordPress](https://wordpress.com/) est très complet, trop complet. À l'origine il était léger et c'est avec un grand plaisir que j'avais abandonné mes _templates_ Dreamweaver pour réaliser un véritable blog, en PHP comme il se doit. Mais les années ont passé et WordPress est devenu une véritable usine à gaz.

## Les raisons de l'abandon de WordPress

D'abord, son occupation en mémoire vive est énorme. Le cœur de WordPress et quelques plugins indispensables (JetPack, SEO, thème graphique, anti-spam...), c'est suffisant pour atteindre les 100 Mo de mémoire. C'est trop pour un hébergeur _mutualisé_ et je n'ai pas l'intention de payer plus cher un hébergement dédié.

Ensuite, WordPress est lent. La lenteur se manifeste tant dans sa gestion, par exemple le chargement des pages de l'interface d'administration, que dans son utilisation par les tiers. En effet, le nombre énorme de lignes de codes à exécuter sur le serveur afin de générer les pages du site ralentit fortement leur affichage. Certes il existe des plugins pour mettre les pages générées en _cache_, mais sur un serveur mutualisé que l'on ne peut configurer à souhait, cela crée plus de problèmes que cela n'en résout. Je ne supporte plus d'attendre 5 secondes pour qu'une page s'affiche. On est en 2015, l'ADSL s'est démocratisé, la fibre optique est de plus en plus présente ; les vitesses de chargement étant ce qu'elles sont, il est devenu inhabituel d'attendre plus d'une seconde pour charger une page.

Enfin, la configuration (_"customisation"_, diraient certains) du site est un enfer. La structure est devenue trop complexe au fil du temps et les plugins --pas forcément bien écrits-- aggrave le problème. 

Adieu WordPress.

Par quoi le remplacer ?

# Premier essai : Middleman

Les générateurs de sites statiques semblaient tout indiqués. Il s'agit de logiciels qui permettent de définir des modèles (_templates_) qui seront utilisés lors d'une phase de compilation pour générer des pages en série. Une fois ces pages générées, il suffit de les envoyer au serveur. Le travail de compilation est effectué une bonne fois pour toutes avant la mise en ligne, si bien que les pages servies sont statiques. Leur chargement est ensuite très rapide.

J'ai testé [Jekyll](http://jekyllrb.com/), dans un premier temps, et finalement opté pour [Middleman](http://middlemanapp.com/)... et changé d'avis !

Middleman est plus difficile à manier que Jekyll mais aussi plus ouvert. La création du site fut plus longue et beaucoup plus laborieuse, mais Middleman ne m'a pas imposé sa logique, contrairement à Jekyll, ce qui m'a donné le sentiment d'avoir une plus grande marge de manœuvre pour faire évoluer le site.

Le problème est qu'après avoir recréé le site avec Middleman et écrit le présent article pour expliquer la nouvelle mécanique, j'ai été confronté à un bug : impossible de publier cet article. _Tout_ le site était compilé, _sauf_ cet article. Aucun message d'erreur. Rien. Impossible de savoir pourquoi. Rien non plus dans la documentation et sur Google. 

J'ai laissé tomber Middleman. Je suis revenu à Jekyll. Certes la structure du site est moins bien ordonnée et le _framework_ est moins souple, mais au moins il fonctionne !

# Mise en œuvre

L'installation de Middleman n'est pas simple. C'est une _gemme_ Ruby ; il faut donc avoir préalablement installé un environnement de développement Ruby. Avec un Mac, cela suppose d'installer les _Command line tools_, [Homebrew](http://brew.sh/), RVM, Ruby... et quelques gemmes telles que _Rake_ et _Bundler_. Je laisse les explications pour un autre article : il est inutile de se lancer dans le développement d'un site statiques avec Middleman si l'on ne sait pas comment installer un environnement de développement Ruby.

Middleman, c'est une gemme. On l'installe donc très simplement avec ``gem install middleman``. On crée ensuite un nouveau projet avec ``middleman init mon-projet``. Rien d'extraordinaire : tout est dit sur la page _[Getting started](http://middlemanapp.com/basics/getting-started/)_ de la documentation.

C'est ensuite que les difficultés commencent...

## Importer les articles existants

Middleman permet de convertir les articles d'un blog WordPress. Chouette ! Il suffit d'exporter le contenu du blog dans un fichier XML, depuis WordPress, de d'utiliser le convertisseur. C'est peut-être censé bien fonctionner mais, dans mon cas, cela a tourné au désastre. Le résultat était inexploitable et j'ai autre chose à faire que de revenir sur chaque article pour réparer les bêtises d'un convertisseur défectueux. Entre autre problèmes, les catégories et les _tags_ n'avaient pas été importés. J'ai donc utilisé la _gemme_ d'importation de Jekyll. Elle a bien fonctionné. Mais Middleman a fait des siennes, refusant de lire les pages importées : selon lui, la date dans le nom du fichier ne correspondait pas à la date indiquée dans l'en-tête (_frontmatter_) des fichiers. Effectivement, cette dernière comprenait, outre l'année, le mois et le jour, l'heure de publication... Idiot ! J'ai dû supprimer l'heure. Heureusement, j'ai pu faire cela d'un coup, pour tous les fichiers, grâce à [BBedit](http://www.barebones.com/products/bbedit/).

## Les premières pages -- la magie

Une fois les vieux articles importés, il faut s'occuper de les afficher. La procédure est plutôt simple et bien pensée.

D'abord, on crée un modèle de page qui sera utilisé pour tous les articles :

    <html>
        <head>
            <!-- Tout ce qui doit aller ici... -->
        </head>
        <body>
            <div class="text-content"><%= yield %></div>
        </body>
    </html>

Voilà. Le contenu de chaque fichier sera placé à l'endroit de l'instruction ``yield``. Le fichier est à enregistrer sous le nom de ``post.erb``, l'extension _erb_ signifiant que le code écrit en Ruby doit être interprété.

Cependant, sur ce site, il n'y a pas que des articles de blog. Il y a aussi des pages ne répondant pas à la logique du blog, _"billet publié à telle date"_. Pour ces pages, l'on adoptera un autre modèle : ``page.erb``. Mais ce modèle doit-il être totalement différent ? Les pages "normales" et les articles de blogs ne partagent-ils pas certaines caractéristiques ? Si, bien sûr ! Par exemple, l'en-tête. Réécrire le code deux fois n'est pas une bonne idée : si je veux le changer dans quelques années, j'aurai probablement oublié qu'il est présent deux fois, sur des modèles différents. Il faut donc un "super"-modèle, contenant le code source commun aux autres modèles. L'on utilisera aussi des _bribes_ de code (_"partials"_), que l'on importera, dans n'importe quel modèle, à l'endroit où on le souhaite.

    <html>
      <%= partial "partials/header" %>
      <body>    
        <%= yield %>
        <%= partial "partials/footer" %>
      </body>  
    </html>
    
Ce fichier s'appelle ``layout.erb``, il est appelé en premier. A l'emplacement de son ``yield``, un modèle est inséré, celui des articles ou celui des pages. Il importe aussi deux bribes de code, placées dans le dossier _partials_ : l'en-tête (_"header"_) et le pied de page (_"footer"_).

## Le menu -- étrangetés

Des articles, des pages... bon, d'accord, mais il faut de l'organisation ! Rien de tel qu'un menu. Mais comment le générer ? Pas "à la main", bien sûr, cela n'aurait pas d'intérêt.

La solution que j'ai retenue provient d'une méthode utilisée avec Jekyll : un fichier YAML décrit le menu, un programme Ruby lit ce fichier et génère le menu. De cette manière, le code ne change pas et il suffit de modifier le fichier YAML pour faire évoluer le menu.

    items:
        - title: "À Propos"
          href: "/about/"

        - title: "Revue"
          href: "/revue/"
  
        - title: "Divers"
          href: ""
          subcategories:
              - subtitle: "Outils"
                subhref: "/outils/"
              - subtitle: "Java"
                subhref: "/java/"
                
L'on enregistre cela dans ``/data/menu.yaml``, en dehors du dossier ``source``. L'on y accède ensuite dans une bride de code ``partials/menu.html.erb``.

    <ul class="nav navbar-nav">
      <% data.menu.items.each do |item| %>
        <% if item.subcategories %>
          <li class="dropdown">
            <a href="<%= item.href %>" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown">
                <%= item.title %> <i class="caret"></i>
            </a>
            <ul class="dropdown-menu">
            <% item.subcategories.each do |subcategory| %>
              <li><a href="<%= subcategory.subhref %>"><%= subcategory.subtitle %></a></li>
            <% end %>
            </ul>
        <% else %>
          <% if current_page.url == item.href %><li class="active"><% else %><li><% end %>
          <a href="<%= item.href %>"><%= item.title %></a>
        <% end %>
        </li>
      <% end %>
    </ul>

## Boostrap -- quelques soucis

Ça marche, mais c'est moche. Non pas que le site actuel soit exceptionnellement beau, mais tout de même, il faut travailler un peu la mise en page.

Pour ce faire, j'ai choisi d'utiliser [Twitter Bootstrap](http://getbootstrap.com/) et [Bootswatch](http://bootswatch.com/).

Utiliser, c'est vite dit. Avant d'utiliser, il faut installer, et c'est là que ça coince :

- La documentation de Middlement est anémique à ce sujet ; pis encore : ce qui est dit est mal expliqué, c'est confus, limite incompréhensible. De son côté, la documentation de Bootstrap ne parle pas de Middleman, ce que l'on peut difficilement reprocher à Twitter. Enfin, il n'y a pas grand chose à trouver sur Google... ;
- Certains squelettes de sites pour Middleman utilisent des _gemmes_ Ruby, certaines faites pour Middleman et d'autre pour Rails. Je ne suis pas partisan de l'inclusion de nombreuses gemmes : c'est le meilleur moyen de perdre le contrôle sur le comportement du programme, car l'on ne sait pas exactement comment ces gemmes interagissent entre-elles, ni quels sont leurs bugs ni, et c'est rédhibitoire pour moi, si elles ont un avenir. J'ai tout de même essayé, sans succès : la gemme de Bootswatch n'est pas à jour, ses dépendances entrent en conflit avec celles de Middleman. _Exeunt_ les gemmes.
- D'autres squelettes utilisent [Bower](http://bower.io/). Même combat que les gemmes, malheureusement, même si les bibliothèques tierces sont importées directement l'éditeur _upstream_ et non par le truchement d'un paquet pas forcément maintenu. Mais surtout, c'est encore une couche de complexité ajoutée au moteur Middleman... si j'ai choisi de passer au tout statique, ce n'est pas pour recréer un assemblage de plugins aussi instable que WordPress !
- Reste l'option d'importer directement depuis le CDN de Bootstrap. Oui, c'est pratique et il n'y a pas plus simple à implémenter... mais si l'on veut travailler sur le site sans connexion internet, ce qui m'arrive parfois, c'est fichu !
- À la main... oui, mais comment ? Middlement utilise [Sprockets](https://github.com/sstephenson/sprockets) pour charger les feuilles de style et les bout de code JavaScript. Mais que c'est mal documenté... quelle horreur !

J'ai finalement réussi, en me débattant avec la documentation, les forums, [StackOverflow](http://stackoverflow.com/) et compagnie, à mettre en place un montage fonctionnel.

D'abord, j'ai téléchargé tous les fichiers de Bootstrap et Bootswatch en SCSS. Je les ai placés dans un dossier ``assets`` à la racine du site (en dehors du dossier _source_).

Ensuite, j'ai dû modifier le fichier de configuration du site, ``config.rb``, afin d'inclure cette ligne : 

    sprockets.append_path File.join root, 'assets'
    
Enfin, j'ai ajouté le "commentaire" d'importation Sprockets dans le fichier source JavaScript chargé dans mon _header_ :

    //= require jquery
    //= require bootstrap-sass/assets/javascripts/bootstrap
    
De même pour les feuilles de style... enfin, pas vraiment puisque les "commentaires" d'importation ne fonctionnent pas (et personne ne semble disposé à expliquer pourquoi). Il faut donc utiliser les instructions classiques d'importation en SCSS :

    @import 'bootswatch/yeti/variables';
    @import 'bootstrap-sass/assets/stylesheets/bootstrap-sprockets'; 
    @import 'bootstrap-sass/assets/stylesheets/bootstrap'; 
    @import 'bootswatch/yeti/bootswatch';
    
Le contenu de tous ces fichiers JavaScript est ajouté au fichier ``all.js`` ; idem pour le contenu des feuilles de style, rajouté au fichier ``all.scss``.

## Les polices -- renoncement

Mais Bootstrap est livré avec une police spéciale, appelée [Glyphicons](http://glyphicons.com/), permettant de dessiner tout plein de petits symboles utiles. Dans la même veine, j'ai voulu utiliser [Font Awesome](http://fortawesome.github.io/Font-Awesome/).

Impossible. Du moins, avec la méthode précédemment décrite. En effet, Sprockets refuse obstinément de recopier les polices dans le dossier ``fonts``, pourtant créé à cet effet et clairement indiqué dans le fichier de configuration du site. J'ai tout essayé, rien n'y fit.

J'ai fini par renoncer. La solution est inélégante mais fonctionnelle : j'ai manuellement copié/collé les fichiers de police dans mon dossier ``source/fonts``. Il faudra que je renouvelle ce copié/collé à chaque mise à jour des bibliothèques... je n'aime pas cela ! <i class="fa fa-frown-o"></i>

Mais au moins, ça marche... <i class="fa fa-thumbs-up"></i>

## Markdown et les couleurs

Un peu d'espoir : Markdown.

D'abord, rappelons que les formats propriétaires, du genre le .DOC de Microsoft, [représentent un grand danger pour l'avenir de l'humanité](/2006/04/13/opendocument-et-linteroperabilite-des-formats/). Si, si...

J'utilise donc [Markdown](http://fr.wikipedia.org/wiki/Markdown) pour les pages et les articles de ce site, comme pour à peu près tout le reste.

Tout l'intérêt du générateur de sites statiques est de pouvoir, une fois la phase de développement terminée, écrire en Markdown de la manière la plus simple qui soit.

J'ai donc installé la _gemme_ ``karmdown`` et configuré la coloration syntaxique pour les blocs de code (d'ailleurs, elle ne fonctionne pas très bien à l'heure où j'écris ces lignes, mais j'y travaillerai plus tard).

## Les catégories -- réflexion

Middleman ignore les catégories. Il n'est tout simplement pas prévu de classer ses articles par catégorie, encore moins de les associer à plusieurs catégories comme le fait WordPress. Autant il est aisé de retrouver le comportement de WordPress avec Jekyll, autant Middleman ne m'a pas facilité la tâche.

Chaque article peut appartenir à plusieurs catégories qui sont définies dans son en-tête YAML, de cette manière :

    categories:
    - Truc
    - Muche
    
La première nécessité est d'extraire les catégories d'un article pour les afficher. Comment faire ? La documentation de Middleman est silencieuse sur ce point, comme sur bien d'autres (ai-je déjà dit qu'elle était calamiteuse ? Oui ? Alors je le répète). Voici tout de même le bout de code que j'utilise :

    <% if article.data.categories %>
      <% article.data.categories.each do |cat| %>
        <div class="label label-default"><%= cat %></div>
      <% end %>
    <% end %>
    
Cela semble très simple ainsi, mais encore faut-il savoir que l'on accède aux catégories dans l'en-tête grâce à ``article.data.categories`` et par un simple ``article.categories`` comme avec Jekyll. Que vient faire ce _data_ au milieu ? Il ne faut pas chercher à savoir...

Ensuite, l'on pense à créer une page avec la liste des catégories et, en dessous du nom de chaque catégorie, la liste des articles associés. C'est à ce stade que ça dérape. La première solution serait de dresser manuellement une liste des catégories dans un fichier YAML, comme pour le menu, et de la parcourir avec une boucle. Ce serait simple, mais il faudrait éditer le fichier YAML chaque fois que l'on ajoute ou retire une catégorie. Je n'ai absolument pas envie de faire cela car, selon moi, les catégories appartiennent au _contenu_ et non au _contenant_ (le code source du site). L'idée derrière le réfaction du site est de _ne pas_ avoir à mettre les mains dans le cambouis pour modifier le _contenu_.

J'ai donc dû créer une fonction, placée dans un fichier ``helpers/categories.rb`` :

    module Categories
      def categories
        sitemap.resources.flat_map { |res| res.data.categories }.uniq
      end
    end

Le code, en soi, est tout simple. Une fois encore, le problème est l'absence totale d'aide en provenance de la documentation de Middleman. J'ai dû trouver le ``sitemap.resources`` dans un message sur un forum...

Cette fonction est ensuite appelée dans la page destinée à présenter la liste des catégories et, sous chacune d'entre-elles, la liste des articles associés :

    <% categories.each do |category| %>
      <h1><%= category %></h1>
      <ul>
        <% blog.articles.select {|a| a.data[:categories].any? { |s| s.casecmp(category) == 0 } rescue false }.each do |article| %>
          <li><%= link_to article.title, article.url %></li>
        <% end %>
      </ul>
    <% end %>


## Deux blogs

Pour avoir plusieurs _blogs_ sur un même site, en revanche, Middleman fait des merveilles. Il suffit de définir les deux blogs avec des caractéristiques différentes dans le fichier de configuration, _et voilà_ !

C'est l'une des raisons pour lesquelles je n'ai pas retenu Jekyll, au final : je voulais des URL différentes pour les articles du blog principal et pour la [revue](/revue/).

## Les outils tiers

Bien que le site soit statiques, l'on ne peut se passer de certains mécanismes auxquels les internautes sont désormais habitués. Il s'agit notamment des commentaires au bas des articles de blog et du moteur de recherche intégré. J'ai donc utilisé certaines technologies tierces :

- Pour les commentaires, [Disqus](https://disqus.com/) fait parfaitement l'affaire : c'est simple à installer et à configurer et ça fonctionne... tout simplement !
- Pour le moteur de recherche, la configuration est beaucoup plus complexe, notamment parce que le code fourni n'est pas compatible avec Bootstrap, mais j'ai tout de même réussi à obtenir un résultat satisfaisant grâce à [Google Custom Search Engine](https://www.google.fr/cse/).
- Enfin, pour les statistiques, j'utilise [Google Analytics](http://www.google.fr/intl/fr/analytics/).

## Publication sur GitHub

Bon. Et comment publier tout ce bazar ? 

J'ai été séduit par l'idée des concepteurs de Jekyll : un dépôt [Git](http://fr.wikipedia.org/wiki/Git) à la base de tout.

C'est simple pour Jekyll car GitHub possède un moteur Jekyll et compile directement les sources afin de publier le site.

Cela ne fonctionne pas avec Middleman. Il faut ruser...

La ruse consiste à créer deux branches dans un dépôt git :

- la première branche, ``source`` contient les sources du site ;
- la seconde branche, ``master`` contient le résultat, c'est-à-dire les pages compilées et prêtes à être publiées.

Un petit script _rake_ permet de mettre à jour la branche des sources, tandis que le plugin [middleman-deploy](https://github.com/karlfreeman/middleman-deploy) les compile et met à jour la branche _master_. La procédure est parfaitement expliquée sur [cette page](http://www.beesbot.com/middleman-github-user-pages/).

# Deuxième essai : Jekyll

Après avoir écrit tout ce qui précède, j'ai tenté de mettre l'article en ligne, en vain. Rien n'y fit. Aucune idée du problème : pas de message d'erreur particulier, rien trouvé sur le Web ; tout simplement, l'article était ignoré lors de la compilation.

J'en ai eu assez de Middleman, il est trop mal documenté. Et puis, le _plain Ruby_ c'est bien, mais il faut tout gérer, notamment les exceptions -- et plus l'on doit écrire de code, plus il peut y en avoir. Middleman affiche généralement un message d'erreur et arrête la compilation ; parfois, le serveur plante et l'on est obligé de _kill_ le processus pour l'arrêter (<kbd>Ctrl+C</kbd> ne fonctionne même pas !).

Jekyll est très bien documenté et le logiciel est assez bien conçu pour gérer lui-même les exceptions. Au pire, le code générant l'erreur n'est pas exécuté, mais cela n'empêche pas la page d'être générée.

Jekyll permet de faire moins de choses mais, au moins, il fonctionne bien. Je n'ai eu aucun problème, jusqu'à présent. Donc, Jekyll, _it's a go !_

Si l'on ne revint pas sur la simplicité et la stabilité de Jekyll, son principal avantage est son intégration à GitHub. Il suffit en effet d'envoyer le dossier source avec un ``git push``, GitHub se charge de la compilation !

Les principaux inconvénients que j'ai pu identifier jusqu'à présent sont les suivants :

- pas de manière simple de créer deux blogs avec des structures différentes pour les articles génériques tels que celui-ci et pour la [revue](/revue/) ;
- le dossier source est un rien désordonné... les sous-dossiers se multiplient et le tout devient vite un peu confus ;
- le langage de de modélisation (_templating_) _Liquid_ est certes sûr (pas d'exécution directe de code Ruby), mais il est aussi beaucoup plus limité que celui de Middleman, reposant sur ERB (ou HAML, Slim, etc.) à l'instar de Rails. Un exemple [ici]({{post_url /2015/2015-01-04-pagination-selective-avec-jekyll}}).

J'espère toutefois venir à bout de ces inconvénients ; à défaut, le développement de Jekyll semble être assez actif.

Allez, assez papoté ! _Let's go online !_ <i class="fa fa-angellist"></i>



