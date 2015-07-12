---
layout: post
status: publish
published: true
title: Forums et espaces privés
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "Un des problèmes majeurs que rencontrent les webmasters qui ont construit
  leurs sites autour d'un système de forums tel que vBulletin ou Invision Power Board
  est de créer une passerelle entre ces forums et un nouvel espace privé qu'ils comptent
  mettre en place. La problématique est la suivante, elle se résume en trois points:
  1) le site entier est basé sur l'inscription des utilisateurs à un forum, cette
  inscription détermine leurs droits d'accès à certaines informations ; 2) on souhaite
  ajouter au site un logiciel PHP développé de manière indépendante du système de
  forums (c'est-à-dire que ce n'est pas un plugin ou un add-on pour les forums) ;
  3) on veut protéger l'accès aux données de ce logiciel, mais on ne veut pas demander
  aux utilisateurs de créer un nouveau compte, différent de celui qu'ils utilisent
  pour se connecter aux forums. Dans ce cas, comment procéder ?\r\n"
wordpress_id: 111
wordpress_url: http://www.valhalla.fr/index.php/2007/03/02/forums-et-espaces-prives/
date: '2007-03-02 01:04:16 +0100'
date_gmt: '2007-03-01 23:04:16 +0100'
categories:
- Internet
tags:
- Internet
- sécurité
- société
- serveur
permalink:  /2007/03/02/forums-et-espaces-prives/
---
<p>Un des problèmes majeurs que rencontrent les webmasters qui ont construit leurs sites autour d'un système de forums tel que vBulletin ou Invision Power Board est de créer une passerelle entre ces forums et un nouvel espace privé qu'ils comptent mettre en place. La problématique est la suivante, elle se résume en trois points: 1) le site entier est basé sur l'inscription des utilisateurs à un forum, cette inscription détermine leurs droits d'accès à certaines informations ; 2) on souhaite ajouter au site un logiciel PHP développé de manière indépendante du système de forums (c'est-à-dire que ce n'est pas un plugin ou un add-on pour les forums) ; 3) on veut protéger l'accès aux données de ce logiciel, mais on ne veut pas demander aux utilisateurs de créer un nouveau compte, différent de celui qu'ils utilisent pour se connecter aux forums. Dans ce cas, comment procéder ?<br />
<a id="more"></a><a id="more-111"></a></p>
<p>La plupart du temps, on choisira une solution de facilité: soit installer ou développer un add-on ou plugin pour le système de forums, qui utilise le même mode d'identification des utilisateurs que ce forum soit, au contraire, développer un logiciel totalement autonome qui nécessite une seconde procédure d'identification de la part des utilisateurs.</p>
<p>Les deux possibilités ont des inconvénients majeurs. Pour ce qui est de la première, elle présente l'inconvénient d'être très difficilement réalisable et de constituer un casse-tête pour le webmaster à la moindre mise à jour du système de forums. Il faudra en effet très probablement réécrire une bonne partie du code si l'éditeur du forum décide de modifier la procédure d'identification des utilisateurs. Or, ce genre de choses, particulièrement sensibles aux questions de sécurité, font l'objet de modifications fréquentes. Quant à la seconde possibilité, elle présente également une difficulté énorme. Cette fois, le problème ne se pose plus pour le webmaster mais pour les utilisateurs. Ceux-ci devront créer deux comptes, avec <em>login</em> et mot de passe: le premier pour les forums, le second pour le nouveau logiciel. Il y a de quoi alimenter la confusion dans leurs esprits, surtout s'ils ne sont pas familiers de l'informatique et des technologies du web. De plus, deux mots de passe, c'est deux fois plus de risques d'oubli !</p>
<p>Il faut donc trouver une solution intermédiaire: conserver les droits d'accès accordés aux utilisateurs selon leur appartenance à tel ou tel groupe dans les forums, tout en construisant un système suffisament indépendant du logiciel des forums.</p>
<p>La solution que j'ai trouvée est la suivante: utiliser des forums invisibles de redirection pour transmettre un mot de passe au système de protection du nouveau logiciel. On procède en plusieurs étapes.</p>
<p>1) <strong>Créer un forum invisible de redirection</strong>. C'est-à-dire un forum qui présente deux caractéristiques: premièrement, il n'est pas présenté dans la liste des forums ; on ne peut y accéder qu'en connaissant son adresse exacte (URL). Deuxièmement, il ne contient aucun message: quand on appelle son adresse (URL) depuis un navigateur, le logiciel des forums redirige automatiquement le visiteur vers une adresse spécifiée par le webmaster. vBulletin permet cela depuis longtemps.</p>
<p>2) <strong>Assigner des droits à ce forum</strong>. La seconde étape consiste à assigner des droits au forum, c'est-à-dire à définir quels groupes d'utilisateurs auront accès à ce forums et quels groupes n'y auront pas accès. vBulletin et tous les logiciels de forums avancés permettent cela. Si l'utilisateur appartient à un groupe qui bénéficie de l'accès, il sera redirigé vers l'adresse définie par le webmaster, comme expliqué plus haut. S'il ne bénéficie pas de l'accès, une page d'erreur générée par le logiciel du forum s'affichera. S'il n'est pas connecté, une page lui demandera son nom d'utilisateur et son mot de passe pour les forums, et vérifiera ensuite s'il appartient à un groupe qui possède des droits suffisants pour accéder au forum de redirection.</p>
<p>3) <strong>Transmettre un mot de passe par redirection</strong>. Le forum de redirection redirige le visiteur vers une adresse définie par le webmaster. Cette adresse peut très bien comporter des éléments de requête GET. Par exemple: <em>...com/logiciel/index.php?pass=ok</em>.</p>
<p>4) <strong>Récupérer le mot de passe dans le logiciel</strong>. Il suffit ensuite de récupérer la requête GET dans le logiciel en PHP. Pour reprendre l'exemple précédent, il suffira d'écrire quelques lignes, du genre: <span class="Code">if(isset($_GET['pass']) and $_GET['pass'] == 'ok') { // valider l'identification } else { // refuser l'accès }</span>.</p>
<p>5) <strong>Organiser le tout depuis la page d'accueil du logiciel</strong>. A ce stade, on peut insérer un lien vers l'adresse du forum invisible sur la page d'accueil du logiciel. Ainsi, le visiteur qui actionnera ce lien tentera d'accéder au forum de redirection qui contient la clé pour s'identifier au logiciel. S'il fait partie d'un groupe qui possède suffisament de droits, le forum de redirection le renverra directement vers le logiciel qui, en vertu du code décrit ci-dessus, le considèrera comme identifié et connecté. S'il n'est pas connecté aux forums, il devra se connecter avant de pouvoir accéder au logiciel.</p>
<p>Cette méthode répond au problème exposé en introduction. Elle fonctionne parfaitement et a été appliquée avec succès -et de manière totalement transparente pour les utilisateurs- sur une base de données développée en PHP et jointe à un forum vBulletin 3.0.X.</p>
<p>En pratique, il faudra cependant veiller à protéger le mot de passe contenu dans la requête GET. Dans l'exemple ci-dessus, ce mot de passe ("ok") est transmis en clair, ce qui est contre toute notion de sécurité. Mais rien n'empêche, au prix de quelques efforts, de chiffrer ce mot de passe pour sécuriser la procédure: PHP gère très bien et très simplement le MD5 et le SHA1.</p>
