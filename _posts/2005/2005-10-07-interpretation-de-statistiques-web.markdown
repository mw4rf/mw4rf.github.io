---
layout: post
status: publish
published: true
title: Interprétation de statistiques Web
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 45
wordpress_url: http://blog.gfblog.com/index.php/2005/10/07/interpretation-de-statistiques-web/
date: '2005-10-07 19:58:49 +0200'
date_gmt: '2005-10-07 17:58:49 +0200'
categories:
- Internet
tags:
- Internet
- Web
- serveur
- statistiques
permalink:  /2005/10/07/interpretation-de-statistiques-web/
---
<p>
Cet article a pour but d'expliquer dans les grandes lignes ce qu'il faut retenir d'une analyse statistique des visites d'un site web.  Je me suis basé sur le logiciel AwStats pour écrire cet article, mais les principes sont les mêmes pour tous les autres logiciels du même type. Je vais donc procéder en commentant les résultats de chacune des grandes catégories de statistiques, sans rentrer dans les détails ni fournir d'explications techniques trop poussées.</p>
<h2>Résumés et notions de base</h2>
<ul>
<li /><strong>Trafic 'vu'</strong>
<li /><strong>Trafic 'non vu'</strong>
</ul>
<p>
Le traffic 'vu' correspond aux visiteurs normaux, c'est-à-dire les personnes physiques derrière leurs ordinateurs. Le traffic 'non vu' correspond aux "bots" (ou "spiders") des moteurs de recherche. Les moteurs de recherche (<a href="http://www.google.fr/">Google</a>, <a href="http://fr.yahoo.com/">Yahoo</a>, <a href="http://www.msn.fr/">MSN</a>, <a href="http://www.lycos.fr/">Lycos</a>, etc.) utilisent des logiciels intelligent qui parcourent le Web à la recherche de nouvelles pages à indexer. Ces logiciels s'appellent des "bots" (pour "robots"). Ils ne "visitent" pas les sites, ils se contentent de charger les pages présentes et d'analyser leur code source à la recherche de mots-clé caractérisant le site à indexer. Ils génèrent du traffic (en bande passante), mais ce ne sont pas des visiteurs humains.</p>
<ul>
<li /><strong>Visiteurs différents</strong>
<li /><strong>Visites</strong>
<li /><strong>Pages</strong>
<li /><strong>Hits</strong>
<li /><strong>Bande passante</strong>
</ul>
<p>
Un visiteur est identifié par son adresse IP (identifiant attribué à chaque ordinateur présent sur Internet par les fournisseurs d'accès). Chaque nouvelle adresse IP est donc considérée comme un nouveau visiteur par le logiciel de statistiques. L'adresse IP peut être dynamique, semi-dynamique ou statique. Ont une adresse dynamique les utilisateurs de modems: l'adresse IP change à chaque connexion. Ont une adresse semi-dynamique les utilisateurs de l'ADSL: l'adresse IP change à intervalle fixe (chez Wanadoo, toutes les 24 heures) bien qu'il soit possible qu'une même adresse soit réaffectée plusieurs fois de suite au même utilisateur. Ont une adresse fixe certains particuliers ayant l'ADSL (pas en France, mais en Espagne avec Telefonica par exemple), et la plupart des grosses entreprises (avec accès internet dédié), les universités et beaucoup d'autres institutions publiques.</p>
<p>
Les visites sont calculées pour chaque visiteur: combien de fois est-il venu sur le site. Le même principe d'adresse IP que celui expliqué ci-dessus est utilisé. Cependant, si un visiteur quitte le site et revient dessus par la suite, deux visites seront comptabilisées. Le nombre de visites est donc fiable, tandis que le nombre de visites par visiteurs ne l'est pas tellement.</p>
<p>
Le nombre de pages chargées correspond au nombre de fichiers affichés à l'écran. Le nombre de 'hits' correspond au nombre de fois où un client est entré en relation avec le serveur. Par exemple, le téléchargement d'un fichier le compte pas pour une page vue, mais incrémente le nombre de hits.</p>
<p>
La bande passante est le nerf de la guerre sur Internet. Les sites internet sont construits avec des fichiers: du code source, des images, vidéos, musiques, etc. Lorsqu'un utilisateur visionne une page, il demande au serveur de lui envoyer ces fichiers. Chaque octet de ces fichiers est pris en compte dans le calcul du traffic utilisé. Par exemple, si un fichier fait 1 MO et que 1000 visiteurs le chargent, la bande passante utilisée sera de 1*1000 MO = 1 GO. La bande passante étant très chère (beaucoup plus chère que l'espace), il est conseillé d'alléger ses pages de manière à en consommer le moins possible.</p>
<h2>Historique temporel</h2>
<p>Tous les systèmes d'analyse présentent une série d'information:</p>
<ul>
<li /><strong>Historique mensuel</strong>
<li /><strong>Jours du mois</strong>
<li /><strong>Jours de la semaine</strong>
<li /><strong>Heures</strong>
</ul>
<p>
Il s'agit ici de déterminer les valeurs correspondant aux notions expliquées ci-dessus pour</p>
<ul>
<li /><u>Les mois complets</u>. C'est la somme des valeurs de tous les jours du mois. Le total mensuel des visiteurs, visites, pages, hits et de la bande passante. On peut ainsi voir très rapidement l'évolution à long terme de la fréquentation d'un site: a-t-elle progressé ou regressé pendant les 6 derniers mois ?
<li /><u>Chaque jour du mois</u>. Il s'agit du même principe que pour les mois complets, mais en jours et sur le mois courant. Ce mois-ci, quel est le jour qui a vu le plus de traffic sur le site ?
<li /><u>Jour de la semaine</u>. Il s'agit du bilan des 7 jours de la semaine, sur 1 mois. C'est à dire que les statistiques des 4 lundi du mois sont additionnées, pour constituer les valeurs du "lundi". On peut ainsi voir pendant quel jour de la semaine il y a en général le plus de visites.
<li /><u>Heures</u>. Il s'agit du même principe que pour le jour de la semaine, mais reporté aux heures. On peut ainsi voir, sur un mois, quelles ont été les heures les plus creuses (habitellement vers 5H du matin en France), de manière à planifier une maintenance en dérangeant le moins de visiteurs possible.
</ul></p>
<h2>Domaines et hôtes</h2>
<p>
Les domaines présentent en général la procevance physique des visiteurs, c'est-à-dire le pays depuis lequel ils naviguent. L'identification se fait grâce aux informations de nom de domaine, ce qui explique la présence de références comme "Commercial" (.com) ou Network (.net).</p>
<p>
Les hôtes sont les références des porteuses Internet des fournisseurs d'accès. Par exemple, si je vois <span class="Code">amontsouris-152-1-70-175.w83-202.abo.wanadoo.fr</span>, je peux apprendre deux informations très rapidement: le fournisseur d'accès est Wanadoo et le DSLAM (passerelle ADSL) est celle de la région parisienne (montsouris). Il y a donc une majorité de visiteurs parisiens ayant wanadoo.</p>
<p>
Mais ces statistiques ne sont pas totalement exhaustives, ni totalement infaillibles. En effet, certains hôtes sont masqués (ceux derrière un Proxy par exemple). Dans ce cas, un message du type "IP non résolue" apparaîtra.</p>
<h2>Spiders/Robots</h2>
<p>Voir plus haut, concernant le traffic 'non vu' généré par les moteurs de recherche.</p>
<h2>Durée des visites</h2>
<p>Simplement, la durée moyenne d'une visite.</p>
<h2>Types de fichiers</h2>
<p>Il s'agit des fichiers les plus demandés au serveur. Je ne vais pas faire ici un cours de construction de site Web, mais il faut quand même connaître les grands types de fichiers:</p>
<ul>
<li /><strong>HTML</strong> (statique) : ces fichiers sont le coeur du site, ils stockent le contenu et définissent les propriétés du contenant. Ils sont présents à la récine du site et sont envoyés tels quels au client.
<li /><strong>PHP+SQL</strong> (dynamique): les fichiers PHP sont présents sur le serveur, mais contrairement aux fichiers HTML ils ne sont pas envoyés directement au client. Ils sont préalablement exécutés par le serveur, et c'est le résultat de cette exécution qui est envoyé au client. Ce produit n'est pas forcément de la même taille que le fichier source (ce qui est important en terme de bande passante).
<li /><strong>CSS</strong>: fichiers définissant tous les aspects graphiques du site.
<li /><strong>JPEG, PNG, GIF, BMP</strong>, etc: ces sont des images
<li /><strong>SWF</strong>: contenu multimédia <a href="http://www.macromedia.com/fr/">Macromedia Flash</a>.
</ul>
<h2>Pages et URL</h2>
<p>Il s'agit de la liste des pages les plus visitées.</p>
<h2>OS et Navigateurs</h2>
<p>Il s'agit de la liste des systèmes d'exploitation et des navigateurs utilisés par les visiteurs. Les versions sont également indiquées. C'est là qu'on se rend compte qu'il y a encore plein de crétins qui utilisent InternetExploder.</p>
<h2>Referers</h2>
<p> (connexion au site par...)</p>
<p>Ces données indiquent les sources des connexions. C'est-à-dire l'endroit où était le visiteur immédiatement avant d'arriver sur le site faisant l'objet des statistiques. Par exemple, si vous cliquez sur un lien depuis une page de résultats de recherche Google, le site visité enregistrera Google comme référant.</p>
<h2>Mots et phrases clé</h2>
<p>Ce sont les mots et les phrases les plus vues sur le site.</p>
<h2>Divers</h2>
<p>Il s'agit d'une série d'informations concernant les plug-ins aux navigateurs utilisés lors de la visite sur le site. Si vous n'avez pas d'Applet Java sur votre site, vous verrez pas exemple un taux d'utilisation de Java de 0%.</p>
<h2>Statuts HTTP</h2>
<p>Ce sont des codes standardisés renvoyés par le serveur en réponse à une requête non valide du navigateur. Chaque code correspond à un type d'erreur déterminé. Par exemple, l'erreur numéro 404 signifie que le visiteur a tenté d'accéder à un document qui n'existait pas (par exemple en faisant une faute de frappe dans l'adresse). Le code 403 signifie qu'un visiteur non autorisé a tenté sans succès d'accéder à une zone protégée par un mot de passe (.htaccess), et ainsi de suite.</p>
