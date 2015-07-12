---
layout: post
status: publish
published: true
title: Bannir la fonction alert() en production
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "Bannir la fonction alert() en production. Voilà un titre d'article bien
  singulier ! Les développeurs web comprendront, les autres peut être pas. Il s'agit
  simplement pour moi de vous raconter une mésaventure récente, avec Firefox et un
  add-on défectueux, et de pousser un \"coup de gueule\" contre l'utilisation de la
  fonction alert() dans des programmes distribués à l'attention de l'utilisateur final.\r\n\r\n"
wordpress_id: 295
wordpress_url: http://www.valhalla.fr/?p=295
date: '2010-01-31 23:11:00 +0100'
date_gmt: '2010-01-31 21:11:00 +0100'
categories:
- Internet
- Informatique
tags:
- programmation
- Web
- Actu & Humeur
permalink:  /2010/01/31/bannir-la-fonction-alert-en-production/
---
<p>Bannir la fonction alert() en production. Voilà un titre d'article bien singulier ! Les développeurs web comprendront, les autres peut être pas. Il s'agit simplement pour moi de vous raconter une mésaventure récente, avec Firefox et un add-on défectueux, et de pousser un "coup de gueule" contre l'utilisation de la fonction alert() dans des programmes distribués à l'attention de l'utilisateur final.</p>
<p><a id="more"></a><a id="more-295"></a></p>
<p>La fonction alert() est un fonction JavaScript -que l'on retrouve dans d'autres langages de script- qui indique au navigateur d'afficher une fenêtre "par dessus" la page web. Cette fenêtre -il s'agit en réalité d'une "boîte de dialogue"- contient un message de texte, inscrit par le développeur entre les parenthèses de la fonction, et un bouton "ok". Le navigateur est bloqué tant que l'utilisateur n'a pas cliqué sur le bouton "ok".</p>
<p>Cette fonction est particulièrement utile dans deux cas. En premier lieu, elle permet de s'assurer que l'utilisateur a bien vu le message -faute de savoir s'il l'a bien lu-, puisqu'il doit cliquer sur "ok" pour continuer à utiliser son navigateur. Elle permet donc de signaler les choses vraiment importantes, ou d'arrêter l'utilisateur avant qu'il fasse une "bêtise". En second lieu, elle permet aux développeurs de tester ou de "débogger" leurs applications. Par exemple, si un développeur programme une fonction mathématique complexe, il pourra placer des "alert()" à plusieurs endroits de la fonction afin de vérifier, étape par étape, que les calculs se déroulent comme prévu.</p>
<p>La fonction alert() présente toutefois certains dangers. Voici ce qui m'est arrivé. Suite à l'installation de Firefox 3.6, un add-on certifié pour cette version, mais développé pour la version précédente (3.5) a cessé de fonctionner. Jusque là, rien de vraiment étonnant. Le problème est que le développeur de cet add-on avait placé dans une fonction "alert()" les éventuels messages d'erreur. Or, le but de cet add-on était d'agir sur l'interface graphique de Firefox, en la modifiant. </p>
<p>Le résultat fut catastrophique : à chaque utilisation d'un élément de l'interface de Firefox, l'add-on intervenait, et le message d'erreur alert() était affiché. D'où le cercle vicieux suivant : je clique sur le menu "outils", afin d'accéder à l'option "modules complémentaires" qui permet d'activer et de désactiver les add-ons, afin de désactiver l'add-on défectueux, mais celui-ci intercepte le clic sur le menu et affiche la boîte de dialogue alert() qui empêche le menu de s'afficher ; je clique sur "ok" pour fermer la boîte de dialogue ; je clique à nouveau sur le menu "outils" et la boîte de dialogue apparaît à nouveau... Bref, impossible de désactiver l'add-on en question, impossible d'utiliser Firefox normalement.</p>
<p>A ce niveau de l'article, les lecteurs avertis penseront "quel imbécile, il suffit de démarrer Firefox avec un autre profil, et le problème disparaît" tandis que les lecteurs néophytes penseront "dans une telle situation, mon Firefox inutilisable, j'utiliserais un autre navigateur". Il existe en effet plusieurs moyens "alternatifs" de neutraliser un add-on défectueux lorsque celui-ci empêche le fonctionnement normal de Firefox. Cependant, et c'est en cela que cet article est un "coup de gueule", un add-on ne devrait jamais pouvoir rendre le navigateur inutilisable. La fondation Mozilla devrait revoir en profondeur son moteur d'add-ons, et prévoir des sécurités pour que l'utilisateur "de base" ne soit pas confronté à ce genre de problèmes. Empêcher les add-ons d'utiliser des fonctions qui paralysent Firefox, ou empêcher la fonction alert() de paralyser Firefox, serait un premier pas. De leur côté, les développeurs d'add-ons devraient retirer la fonction alert() du code source avant de distribuer leurs produits.</p>
<p>Si vous êtes confronté au problème d'un add-on défectueux, et que vous ne savez pas duquel il s'agit ou que vous ne pouvez pas le désactiver depuis Firefox, pour une raison ou pour une autre, deux solutions s'offrent à vous : lancer Firefox avec un autre profil utilisateur ou supprimer votre profil utilisateur (une recherche Google vous permettra d'en savoir plus, selon votre plateforme) ou utiliser le "safe mode" de Firefox. C'est cette dernière solution, moins drastique, que j'ai choisie. Il s'agit tout simplement de démarrer Firefox sans aucun add-on ou plugin.</p>
<p>- Sous Mac OS X, ouvrez l'application Terminal (dans /Applications/Utilitaires) et tapez la commande suivante : <em>/Applications/firefox.app/Contents/MacOS/firefox  -safe-mode</em><br />
- Sous Linux, ouvrez une console et tapez la commande suivante : <em>firefox  -safe-mode</em><br />
- Sous Windows, utilisez le lien <em>Firefox (Mode Sans échec)</em> du menu "Démarrer".</p>
<p><a href="http://www.flickr.com/photos/valhallafr/4320226638/" title="fffailsafe de GF @ valhalla.fr, sur Flickr"><img src="http://farm5.static.flickr.com/4019/4320226638_993ff3ec4e_o.png" width="356" height="201" alt="fffailsafe" /></a></p>
<p>Avant de conclure, j'aimerais étendre ma critique de l'utilisation de la fonction alert() aux scripts AJAX, et particulièrement à ceux qui sont exécutés en boucle.</p>
<p>Les technologies du Web 2.0 permettent de rapprocher les applications web des applications natives, en adoptant des comportements auxquels les utilisateurs sont habitués. La technologie la plus souvent utilisée est AJAX, qui permet au navigateur de communiquer avec le serveur de manière asynchrone. Autrement dit, la page se charge en fond de tâche, sans que l'utilisateur s'en rende compte, et les informations sont mises à jour continuellement sans qu'il soit nécessaire de recharger la page manuellement. Cela passe par l'utilisation de scripts JavaScript, dans lesquels des fonctions alert() ont pu se glisser. </p>
<p>Typiquement, le développeur aura laissé une fonction alert() avertissant que la fonction AJAX a échoué, parce que le serveur est injoignable ou qu'il a donné une réponse incomplète à la requête du navigateur. Tout aussi typiquement, le développeur aura mis en place un système de boucle pour que la fonction soit exécutée à nouveau si la première exécution n'a pas réussi. Voilà donc un autre cercle vicieux : les boîte des dialogue alert() s'ouvrent l'une après l'autre, trop rapidement pour que l'on puisse toutes les fermer. Le pauvre utilisateur se retrouve au bout de quelques secondes avec des dizaines de fenêtres alert() qui s'empilent sur son écran, rendent instable son navigateur, et ralentissent son système... Cela ne vous est-il jamais arrivé ?</p>
<p>La solution n'est pas idéale : il faut "forcer" la fermeture du navigateur. Commande+Alt+Esc sous Mac OS X ou le fameux Ctrl+Alt+Suppr sous Windows. La solution est simple, certes, mais encore faut-il la connaître, et je parie que la plupart des internautes l'ignorent. En outre, fermer un logiciel de cette manière signifie, le plus souvent, perdre toutes les données non enregistrées (les onglets ouverts, les messages en cours de rédaction, etc.).</p>
<p>Ma conclusion est donc la suivante : la fonction alert() crée plus de problèmes, pour l'utilisateur final, qu'elle ne génère d'avantages. Elle doit donc être complètement supprimée des scripts de production, et réservée exclusivement aux versions de développement de ces scripts.</p>
