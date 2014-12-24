---
layout: post
status: publish
published: true
title: ".Mac et la synchronisation (première partie)"
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "<img src=\"/images/dotmac/dotmac.png\" alt=\".Mac\" align=\"left\"/>\r\nApple
  semble orienter sa politique à destination du grand public vers les services multimédia
  en ligne. Du moins, c'est ce qui ressort clairement des dernières versions des logiciels
  de la firme à la pomme. Il ne s'agit pas ici, pour une fois, du couple iTMS/iPod.
  Il s'agit de .Mac. Apple propose en effet un espace multifonctions sur Internet,
  appelé \".Mac\" (prononcez \"dot mac\"). Ce bouquet de services permet de faire
  un certain nombre de choses dans divers domaines, que nous détaillerons, avec un
  certain nombre de logiciels, que nous citerons. Cet article, qui a pour but de fournir
  une introduction à .Mac en détaillant ses possibilités, se veut également critique.
  A notre avis, .Mac est un bouquet qui possède un énorme potentiel, mais qui reste
  très largement sous-exploité. L'analyse portera sur les différentes fonctions, montrant
  en quoi elles sont intéressantes, ainsi que les raisons pour lesquelles Apple peut
  et doit les améliorer. On peut à ce titre distinguer les services de synchronisation
  (I), les services de stockage (II), les services en ligne (III) et les services
  intégrés à des logiciels Apple ou tiers distincts du système d'exploitation (IV).\r\n\r\n"
wordpress_id: 90
wordpress_url: http://blog.gfblog.com/index.php/2006/03/27/mac-et-la-synchronisation-premiere-partie/
date: '2006-03-27 18:21:58 +0200'
date_gmt: '2006-03-27 17:21:58 +0200'
categories:
- Internet
- Mac
tags:
- Mac
- Internet
- software
- Web
- serveur
- Apple
---
<p><img src="/images/dotmac/dotmac.png" alt=".Mac" align="left"/><br />
Apple semble orienter sa politique à destination du grand public vers les services multimédia en ligne. Du moins, c'est ce qui ressort clairement des dernières versions des logiciels de la firme à la pomme. Il ne s'agit pas ici, pour une fois, du couple iTMS/iPod. Il s'agit de .Mac. Apple propose en effet un espace multifonctions sur Internet, appelé ".Mac" (prononcez "dot mac"). Ce bouquet de services permet de faire un certain nombre de choses dans divers domaines, que nous détaillerons, avec un certain nombre de logiciels, que nous citerons. Cet article, qui a pour but de fournir une introduction à .Mac en détaillant ses possibilités, se veut également critique. A notre avis, .Mac est un bouquet qui possède un énorme potentiel, mais qui reste très largement sous-exploité. L'analyse portera sur les différentes fonctions, montrant en quoi elles sont intéressantes, ainsi que les raisons pour lesquelles Apple peut et doit les améliorer. On peut à ce titre distinguer les services de synchronisation (I), les services de stockage (II), les services en ligne (III) et les services intégrés à des logiciels Apple ou tiers distincts du système d'exploitation (IV).</p>
<p><a id="more"></a><a id="more-90"></a></p>
<p>Les quatre parties précitées représenteront autant d'articles distincts.</p>
<p>Première partie: .Mac et la synchronisation<br />
<a href="http://www.valhalla.fr/index.php/2006/03/27/mac-et-la-sauvegarde-deuxieme-partie/">Deuxième partie: .Mac et la sauvegarde</a><br />
<a href="http://www.valhalla.fr/index.php/2006/03/28/mac-et-les-services-en-ligne-troisieme-partie/">Troisième partie: .Mac et les services en ligne</a><br />
<a href="http://www.valhalla.fr/index.php/2006/03/29/mac-et-les-logiciels/">Quatrième partie: .Mac et les logiciels</a></p>
<h2>Première partie: Les services de synchronisation.</h2>
<p><strong>Principe</strong>.<br />
Certaines informations stockées sur un ordinateur personnel sont immuables, d'autres sont sujettes à une actualisation perpétuelle. Il s'agit par exemple, pour les premières, de travaux réalisés sur ordinateur, et pour les secondes des signets du navigateur, des paramètres de logiciels, de l'emploi du temps, etc. Les premières sont importantes et la plupart des gens en font des sauvegardes fréquentes et multiples. Les secondes, au contraire, ne sont presque jamais sauvegardées. A cela, deux raisons principales: d'une part parce que les sauvegarder n'est techniquement pas facile, d'autre part parce que, du fait des changements fréquents qui leur sont apportés, les éventuelles sauvegardes ne sont pratiquement jamais à jour.</p>
<p>Apple a donc imaginé un système de synchronisation de ces informations intégré à son système d'exploitation, Mac OS X. Il s'agit d'une innovation importante, puisque Windows et Linux, les deux produits directement en concurrence avec Mac OS X, n'intègrent pas un tel système.</p>
<p>Grâce à la synchronisation .Mac, Apple résout les deux problèmes précités, et apporte l'avantage à l'utilisateur de pouvoir conserver les mêmes informations simultanément sur plusieurs ordinateurs. Ainsi, .Mac reconnaît plusieurs ordinateurs inscrits. Chaque fois qu'une modification est apportée sur de ces ordinateurs, elle est retranscrite sur les serveurs .Mac qui la retranscrivent à leur tour vers les autres postes présents dans la liste de synchronisation. Tous les ordinateurs du groupe possèdent donc systématiquement les mêmes informations.</p>
<p><img src="/images/dotmac/fig1.1.png" alt=".Mac Fig1.1" /></p>
<p>La synchronisation peut se faire par deux moyens: automatiquement ou manuellement. Si l'utilisateur choisir de synchroniser automatiquement, le système d'exploitation s'en chargera à chaque nouvelle modification, de manière totalement transparente. De même, si l'ordinateur n'est pas connecté à internet au moment où les modifications sont faites, le système les enregistrera, et les synchronisera avec le serveur dès que la connexion sera établie. L'utilisateur n'a pas à intervenir dans toutes ces opérations. A vrai dire, il n'intervient qu'au début, lors du paramétrage du système (détaillé ci-après), et pour résoudre d'éventuels conflits de synchronisation. A ce propos, il convient de saluer l'intelligence du système qui prend la peine de prévenir l'utilisateur si plus de 5% des informations sont affectées par la synchronisation (qui sait, peut-être est-ce une erreur de sa part ?).</p>
<p><strong>Activer la synchronisation</strong>.<br />
L'activation de la synchronisation se fait une bonne fois pour toutes. Les <em>Préférences système</em> du <em>menu Pomme</em> contiennent une <em>section ".Mac"</em> qui contient 4 onglets.</p>
<p>Le premier onglet, "Comptes" permet d'inscrire, lors de la première utilisation, le nom d'utilisateur .Mac et le mot de passe associé. Il affiche également le temps d'abonnement restant. Les services .Mac sont en effet payants, et l'abonnement souscrit l'est pour une année. Le dernier onglet, "Options avancées" permet de paramétrer quels ordinateurs devront entrer dans la liste de synchronisation. L'onglet iDisk permet de gérer le volume virtuel iDisk qui fera l'objet de la seconde partie de cet article. Enfin, l'onglet "Synchronisation" permet de définir quelles informations devront être synchronisées.</p>
<p><center><br />
Figure 1.2: Onglet "Synchronisation" de la section ".Mac" des Préférences systèmes.<br />
<img src="/images/dotmac/fig1.2.png" alt=".Mac Fig1.2" /><br />
</center></p>
<p>Analysons le contenu de cet onglet. Tout d'abord, il est proposé d'activer ou de désactiver la synchronisation (si vous n'avez pas encore de compte .Mac par exemple). Si la case "Synchroniser avec .Mac" est cochée, la synchronisation est activée. Il est alors possible de choisir dans le menu déroulant la fréquence des synchronisations: chaque jour, semaine ou mois. L'on peut également choisir de synchroniser manuellement ou automatiquement, comme il a déjà été expliqué. Dans la zone de gauche, il est indiqué la date et l'heure de la dernière synchronisation, ce qui est particulièrement pratique pour vérifier si les informations contenues dans les serveurs .Mac sont à jour.</p>
<p>La zone de choix au centre de la fenêtre représente les divers éléments qui peuvent faire l'objet d'une synchronisation. La règle est simple: case cochée, la synchronisation aura lieu ; case décochée, la synchronisation n'aura pas lieu. On remarquera que sont présents dans cette liste deux sortes d'éléments: ceux présents dès l'installation du système, et ceux résultant de logiciels tiers installés postérieurement. Ainsi les informations synchronisées lorsque sont cochées les cases correspondant à "iCal", "Contacts", "Règles, signatures et BAL intelligentes de Mail", "Signets" et "Trousseaux", sont générés par des logiciels livrés avec le système d'exploitation (respectivement iCal, Carnet d'adresses, Mail, Safari) ou intégrés à lui (le dernier: "Trousseau d'accès" ou "Keychains"). En revanche, "Notes Entourage" correspond à <a href="http://www.microsoft.com/france/mac/">Microsoft</a> Entourage, logiciel livré avec la suite Office, et "Transmit Favorites" aux signets de <a href="http://www.panic.com/transmit/">Transmit</a>, le client FTP de <a href="http://www.panic.com/">Panic</a>.</p>
<p>C'est là qu'intervient la première critique de .Mac. En théorie, tout est parfait. Mais en pratique, la synchronisation des données issues de logiciels tiers n'est pas évidente. Ainsi, les signets Transmit ont tendance à tarder avant de se synchroniser. L'entrée "Transmit Favorites" tarde également à rejoindre la liste, ce qui peut être gênant quant on décide, après un formatage et une "clean install", de rétablir toutes les préférences. Ainsi, pour que cela fonctionne à peu près correctement, il faut avoir lancé Transmit au moins une fois avant d'accéder à la section .Mac des Préférences système. Les premières versions de Tiger souffraient d'un bug inversé pour les logiciels Apple (iCal par exemple): ils apparaissaient dans la liste, mais les données de synchronisation n'étaient pas prises en compte avant le premier lancement du logiciel. Il semble que cela soit maintenant corrigé, mais mieux vaut prendre quelques précautions et y regarder à deux fois après une "clean install".</p>
<p>Pour finir, le bas de la fenêtre vous permet classiquement de lancer manuellement une synchronisation ponctuelle en cliquant sur le bouton "Synchroniser", et d'afficher dans la barre de menus une petite icône qui s'animera si une synchronisation est en cours.</p>
<p>Deux autres critiques peuvent être retenues à l'encontre de la synchronisation, d'un point de vue technique. D'une part, la lenteur des serveurs. D'autre part, les effets de la synchronisation sur la fermeture du système. Ces deux points seront abordés en détails dans la deuxième partie de l'article, consacrée à l'iDisk. En guise d'entrée en matière, vous pouvez déjà voir avec l'image ci-dessous que la synchronisation ne fonctionne pas forcément du premier coup. Après cet échec, la deuxième tentative (lancée automatiquement par le système) a réussi.</p>
<p><center><br />
Figure 1.3: Une erreur lors de la synchronisation.<br />
<img src="/images/dotmac/fig1.3.png" alt=".Mac Fig1.3" /><br />
</center></p>
<p><strong>Beaucoup trop de confusion</strong>.<br />
Comme nous l'avons déjà dit, le système est très bien pensé, mais sa mise en oeuvre en pratique laisse à désirer. </p>
<p>Prenons un cas hypothétique. Dans la figure 1.1 ci-dessus, les modifications sont apportées sur le premier ordinateur puis transmises au serveur qui les transmet à son tour aux autres ordinateurs de la liste de synchronisation. Tout va bien: les informations sur le serveur sont les plus à jour. Mais imaginons que cet ordinateur ne soit pas connecté à internet au moment (T1) où les modifications sont réalisées. Imaginons qu'il ne le soit qu'après que d'autres modifications aient été réalisées (T2) sur les autres ordinateurs de la liste de synchronisation, ces derniers étant connectés à internet. Dans ce cas, le serveur a été mis à jour avec les informations les plus récentes (T2), mais n'a pas encore pu prendre en compte celles apportées par le premier ordinateur (T1). Si le système n'est pas assez fin -et il ne l'est pas toujours-, il considérera que le contenu de l'ordinateur étant plus ancien que celui du serveur, il doit replacer les données de l'ordinateur par celles du serveur. Ainsi, le premier ordinateur perdra la première modification, et ne retiendra que les modifications rapportées postérieurement au serveur par les autres ordinateurs de la liste de synchronisation. </p>
<p><img src="/images/dotmac/fig1.4.png" alt=".Mac Fig1.4" /></p>
<p>Il s'agit là d'un "conflit de synchronisation". Le système gère normalement les conflits de synchronisation en demandant à l'utilisateur quoi faire. Celui-ci peut choisir de supprimer les données anciennes et de les remplacer par les données récentes, ou de fusionner toutes les données. Dans l'exemple ci-dessus, il faudrait fusionner pour que le premier ordinateur conserve les modifications apportées par les autres (T2) et que ceux-ci adoptent les modifications apportées par le premier (T1). Mais ce n'est pas toujours aussi simple, et il peut arriver qu'une synchronisation soit corrompue (et cela arrive beaucoup trop souvent), ce qui a pour effet direct sur le système qu'il ne sait plus de deux modifications laquelle est la plus récente. Il peut aussi arriver (systématiquement avec les premières versions de Tiger, au point de rendre le système inutilisable) que le choix de l'utilisateur ne soit pas pris en compte, et que le système conserve deux versions du même fichier et demande à chaque synchronisation laquelle des deux conserver. Ce problème était fréquent surtout pour la synchronisation de l'iDisk.</p>
<p><strong>Une sécurité bienvenue</strong>.<br />
Comme il a déjà été dit, le système de synchronisation demande que faire si plus de 5% des données doivent être modifiées par la synchronisation à venir. L'utilisateur peut annuler la synchronisation ou poursuivre et effectuer les modifications prévues. C'est bien. Mais ç'aurait été mieux s'il avait été possible de voir exactement sur quoi portent ces 5% de modifications ! De manière générale, il ne serait pas superflu d'ajouter au système une interface graphique permettant de comparer d'un coup d'oeil le contenu du serveur et de l'ordinateur, avant de lancer une synchronisation.</p>
<p><center><strong>A suivre...</strong></center></p>
<p>Première partie: .Mac et la synchronisation<br />
<a href="http://www.valhalla.fr/index.php/2006/03/27/mac-et-la-sauvegarde-deuxieme-partie/">Deuxième partie: .Mac et la sauvegarde</a><br />
<a href="http://www.valhalla.fr/index.php/2006/03/28/mac-et-les-services-en-ligne-troisieme-partie/">Troisième partie: .Mac et les services en ligne</a><br />
<a href="http://www.valhalla.fr/index.php/2006/03/29/mac-et-les-logiciels/">Quatrième partie: .Mac et les logiciels</a></p>
