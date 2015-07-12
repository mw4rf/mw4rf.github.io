---
layout: post
status: publish
published: true
title: 'Filemaker : Ajouter des tags aux enregistrements'
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "Filemaker est un logiciel puissant, mais ancien et dont l'ergonomie a peu
  évolué. Depuis quelques années, des systèmes de \"tags\" ou mots-clés sont apparus
  dans la plupart des logiciels permettant de gérer des données. Filemaker n'offre
  aucun système de tags pour classer ses enregistrements, mais il permet d'implémenter
  un tel système soi-même. Cet article a pour but de décrire une des nombreuses manière
  de procéder pour y parvenir.\r\n\r\n"
wordpress_id: 626
wordpress_url: http://www.valhalla.fr/?p=626
date: '2010-08-09 16:35:31 +0200'
date_gmt: '2010-08-09 14:35:31 +0200'
categories:
- Informatique
tags:
- programmation
- software
- bases de données
- Filemaker
permalink:  /2010/08/09/filemaker-tag-records/
---
<p>Filemaker est un logiciel puissant, mais ancien et dont l'ergonomie a peu évolué. Depuis quelques années, des systèmes de "tags" ou mots-clés sont apparus dans la plupart des logiciels permettant de gérer des données. Filemaker n'offre aucun système de tags pour classer ses enregistrements, mais il permet d'implémenter un tel système soi-même. Cet article a pour but de décrire une des nombreuses manière de procéder pour y parvenir.</p>

<h2>Logique relationnelle</h2>
<p>Pour les besoins de l'exemple, on prendra une base de données très simple : une table contient des articles, et l'on doit pouvoir ajouter des tags à ces articles. Il faut donc, pour commencer, deux tables : une table pour les articles, et une table pour les tags. </p>
<p>La table "Articles" contient 3 colonnes (ou "rubriques") : une colonne <b>id</b> contenant un numéro de série (clé primaire) auto-incrémenté et non modifiable par l'utilisateur ; une colonne <b>Titre</b> pour stocker le titre de chaque article et une colonne <b>Texte</b> pour en stocker le contenu. La table "Tags" contient 2 colonnes : une colonne <b>id</b>, comme pour la table Articles, et une colonne <b>Tag</b> destinée à contenir le mot-clé.</p>
<p><u>Table <b>Articles</b></u>
<ul>
<li><b>id</b> <i>Type: Nombre | Entrée auto Numéro de série, Entrées automatiques non modifiables</i></li>
<li><b>Titre</b> <i>Type: Texte</i></li>
<li><b>Texte</b> <i>Type: Texte</i></li>
</ul>
<p><u>Table <b>Tags</b></u>
<ul>
<li><b>id</b> <i>Type: Nombre | Entrée auto Numéro de série, Entrées automatiques non modifiables</i></li>
<li><b>Tag</b> <i>Type: Texte</i></li>
</ul>
<p>Chaque article peut être associé à plusieurs mots-clés, car c'est le principe même des tags : ils permettent une classification transversale des enregistrements (par opposition à une classification hiérarchique, verticale, dans laquelle une sous-catégorie ne peut appartenir qu'à une seule super-catégorie). Chaque mot-clé peut être associé à plusieurs articles, qui correspondent à un thématique précise. Par conséquent, la relation entre la table Articles et la table Tags est de type <i>many-to-many</i>. Pour établir ce genre de relations, dans Filemaker qui ne connaît que les relations <i>one-to-many</i>, il faut créer une table supplémentaire, dite <i>"table de jointure"</i> ou <i>join table</i>. Cette table contient 2 colonnes : une colonne <b>article_id</b>, liée à la colonne <i>id</i> de la table Articles, et une colonne <b>tag</b> liée à la colonne <i>Tag</i> de la table Tags.</p>
<p><u>Table <b>join_table</b></u>
<ul>
<li><b>article_id</b> <i>Type: Nombre</i></li>
<li><b>tag</b> <i>Type: Texte</i></li>
</ul>
<p>Une fois les trois tables créées <i>(Articles, Tags, join_table)</i>, il faut établir les liens entre ces tables. <i><b>Attention</b></i> : le lien entre la table <i>Articles</i> et la <i>join_table</i> ne doit <b>pas</b> permettre de créer automatiquement de nouveaux enregistrements. La création de nouveaux enregistrements sera réalisée par des scripts. Si le lien entre les deux tables permet la création automatique de nouveaux enregistrements, deux tags seront créés : le premier automatiquement, il restera vide, et le second par le script.</p>
<ul>
<li><b>Articles::id</b> => <b>join_table::article_id</b></li>
<li><b>join_table::tag</b> => <b>Tags::Tag</b></li>
</ul>
<p><a href="/public/posts/2010-08-09-filemaker/Filemaker-Tags-1.png"><img src="/public/posts/2010-08-09-filemaker/Filemaker-Tags-1.png" alt="" title="Filemaker Tags 1" width="563" height="163" class="size-full wp-image-634" /></a></p>
<h2>Modèles</h2>
<p>Un seul modèle sera modifié : le modèle correspondant à la table <i>Articles</i>, sur lequel on associera les tags à l'article actif. Il est cependant nécessaire de conserver les modèles relatifs aux deux autres tables, avec des champs de texte correspondant à chaque rubrique de ces tables, car ils seront utilisés dans des scripts.</p>
<p>Sur le modèle de la table Article, on veut pouvoir ajouter des tags à l'article actif, d'une certaine manière et sous certaines conditions. </p>
<ol>
<li>Tous les tags doivent être affichés à la suite les uns des autres.</li>
<li>Lorsqu'on a terminé d'écrire un tag, on doit pouvoir en écrire un autre sans utiliser la souris, en appuyant sur la touche Entrée. Cette touche doit donc 1) valider le premier tag, 2) en créer un second.</li>
<li>Il ne doit pas être nécessaire d'écrire les tags en entier : ceux-ci doivent être suggérés par le logiciel lorsqu'on écrit les premières lettres.</li>
<li>On doit pouvoir accéder d'un clic à la liste des articles correspondant à un tag donné.</li>
</ol>
<p>Pour satisfaire ces conditions, le mieux est de créer un <i>portail</i> qui affiche les enregistrements de la table <b>join_table</b> et qui contient un champ correspondant à la rubrique <b>tag</b> de cette table.</p>
<p>On crée ensuite un bouton pour afficher la liste des articles correspondant au tag choisi. Ce bouton doit lancer l'action <i>Activer enregistrements liés</i> dans le modèle <i>Tags</i>.</p>
<p><a href="/public/posts/2010-08-09-filemaker/Filemaker-Tags-2.png"><img src="/public/posts/2010-08-09-filemaker/Filemaker-Tags-2.png" alt="" title="Filemaker Tags 2" width="499" height="298" class="size-full wp-image-637" /></a></p>
<h2>Scripts</h2>
<p>Les scripts permettent de mettre en oeuvre la logique comportementale du logiciel. Ce sont eux qui réalisent les opérations permettant de créer de nouveaux tags automatiquement, et d'associer les tags aux articles.</p>
<p>La logique des scripts est la suivante :</p>
<ol>
<li>Si le tag existe déjà, aucun nouveau tag ne doit être créé, il faut simplement associer le tag existant à l'article actif.</li>
<li>Si le tag n'existe pas, il faut le créer avant de pouvoir l'associer à l'article actif.</li>
<li>Dans les deux cas, il faut associer le tag, créé ou existant, à l'article actif.</li>
<li>Tout cela doit se dérouler sans intervention de l'utilisateur, et sans le déranger.</li>
</ol>
<p>On crée donc 3 scripts.</p>
<p>Le premier script crée un nouvel enregistrement dans la table <b>join_table</b>, qui correspond au tag que l'utilisateur vient d'écrire. Pour chaque tag, il existe un enregistrement dans la table join_table, même si le tag existe déjà dans la table Tags. On n'a donc pas à se préoccuper de savoir si telle ou telle condition est remplie : l'enregistrement est toujours créé. Le script est par conséquent relativement simple :</p>
<p><u><b>Script 1 : Ajouter Tag</b></u></p>
<ul>
<li>Gestion erreurs [ Oui ]</li>
<li>Définir variable [ $articleid; Valeur :Articles::id ]</li>
<li>Activer modèle [ “join_table” (join_table) ]</li>
<li>Nouvel enreg./requête</li>
<li>Définir rubrique [ join_table::article_id; $articleid ]</li>
<li>Activer modèle [ modèle d'origine ]</li>
<li>Rafraîchir fenêtre [ Vider résultats de jointure en mémoire cache ]</li>
<li>Activer rangée externe [ Sélectionner; Dernièr(e) ]
<li>Activer rubrique [ join_table::tag ]</li>
<li>Fin de script [ ]</li>
</ul>
<p>Le deuxième script vérifie dans la table <b>Tags</b> si le tag que l'on vient de créer dans la table <b>join_table</b> existe déjà. Si tel n'est pas le cas, il le crée. Le script récupère l'<i>id</i> du tag créé ou utilisé, dansla table <i>Tags</i>, sans toutefois l'utiliser : on peut imaginer de l'utiliser pour informer l'utilisateur de la création du tag, pour consigner la création du tag dans un log, ... les possibilités sont nombreuses.</p>
<p><u><b>Script 2 : Nouveau Tag</b></u></p>
<ul>
<li>Gestion erreurs [ Oui ]</li>
<li>Définir variable [ $tag; Valeur :join_table::tag ]</li>
<li>Activer modèle [ “Tags” (Tags) ]</li>
<li>Mode Recherche [ ]</li>
<li>Définir rubrique [ Tags::Tag ]</li>
<li>Exécuter la requête [ Requêtes de recherche définies : Rechercher des enregistrements; Critères : Tags::Tag: “$tag” ] [ Rétablir ]</li>
<li>Si [ Obtenir ( NombreEnregTrouvés ) > 0 ]</li>
<ul>
<li>Définir variable [ $tagid; Valeur :Tags::id ]</li>
</ul>
<li>Sinon</li>
<ul>
<li>Nouvel enreg./requête</li>
<li>Insérer résultat du calcul [ Tags::Tag; $tag ] [ Sélectionner ]</li>
<li>Valider enreg./requêtes [ Sans fenêtre ]</li>
<li>Définir variable [ $tagid; Valeur :Tags::id ]</li>
</ul>
<li>Fin de si</li>
<li>Afficher tous les enreg.</li>
<li>Activer modèle [ modèle d'origine ]</li>
</ul>
<p>Le dernier script a pour but d'intercepter la touche Entrée ou Retour : c'est une touche spéciale, car lorsqu'on appuie dessus, le tag doit être validé et le logiciel doit nous offrir la possibilité d'en écrire un autre. </p>
<p><u><b>Script 3 : touche entrée</b></u></p>
<ul>
<li>Si [ Code ( Obtenir ( FrappeClavierDéclencheur ) ) =13 Or Code ( Obtenir ( FrappeClavierDéclencheur ) ) =10 ]</li>
<ul>
<li>Valider enreg./requêtes [ Sans fenêtre ]</li>
<li>Exécuter script [ “Script 1 : Ajouter Tag” ]</li>
<li>Fin de script [ Résultat : False ]</li>
</ul>
<li>Fin de si</li>
<li>Fin de script [ Résultat : True ]</li>
</ul>
<p>Reste à assigner ces scripts à des déclencheurs, afin qu'ils soient exécutés au bon moment. Le <b>Script n°3 : touche entrée</b> doit être assigné à la rubrique <i>join_table::tag</i> dans le portail du modèle Articles, sur l'évènement <b><i>SurFrappeClavierObjet</i></b>. Le <b>Script n°2 : Nouveau Tag</b> doit être assigné à la même rubrique, sur l'événement <b><i>SurEnregistrementObjet</i></b>.</p>
<p>Il faut ensuite créer un bouton et lui assigner le <b>Script n°1 : Ajouter Tag</b> afin de créer le premier tag d'un article (les tags suivants seront créés par la touche Entrée).</p>
<p>Pour finir, on crée une <i>liste de valeurs</i> contenant les enregistrements de la rubrique <b>Tag</b> de la table <b>Tags</b>, et on l'assigne au champ <b>tag</b> du portail sur le modèle Articles. Ce champ devrait être une liste déroulante avec l'option <i>compléter automatiquement avec la liste des valeurs</i> activée.</p>
<h2>Conclusion</h2>
<p>Cette solution, pour rajouter un système de mots-clés dans les bases de données Filemaker, n'est pas la seule qui existe. </p>
<p>On pourrait imaginer un système différent, et certainement plus cohérent d'un point de vue de logique relationnelle : une table <i>Globals</i> contenant une colonne <i>tag</i> avec stockage global ; un champ de texte représentant le contenu de cette colonne sur le modèle <i>Articles</i> et un script qui rajoute le mot-clé de ce champ de texte dans la <i>join table</i>. On pourrait ainsi laisser Filemaker créer lui-même les nouveaux enregistrements, par le biais du lien entre les tables. La <i>join table</i> pourrait être plus classique, et contenir deux <i>foreign keys</i> : <i>article_id</i> et <i>tag_id</i>, au lieu de la rubrique <i>tag</i> qui contient le texte complet du mot-clé. </p>
<p>On doit également pouvoir imaginer d'autres variantes. Le système présenté ici étant très basique, chaque lecteur pourra concevoir sa propre variante, en modifiant le comportement des scripts, en rajoutant des conditions et des contrôles, etc. La base de données exemple élaborée dans cet article peut être téléchargée en suivant le lien ci-dessous ; elle fournira un premier support à ceux qui voudront aller plus loin en adaptant le système de tags à leurs besoins.</p>
<p><a href="/public/posts/2010-08-09-filemaker/tags_demo.fp7_.zip"><img src="/public/posts/2010-08-09-filemaker/tags_demo_icon.png" alt="" title="tags_demo_icon" width="119" height="88" class="size-full wp-image-642" /></a></p>
