---
layout: post
status: publish
published: true
title: Qu'est-ce-que la technologie Jini ?
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 75
wordpress_url: http://blog.gfblog.com/index.php/2001/08/28/quest-ce-que-la-technologie-jini/
date: '2001-08-28 12:52:50 +0200'
date_gmt: '2001-08-28 10:52:50 +0200'
categories:
- Java
tags:
- programmation
- serveur
- java
permalink:  /2001/08/28/quest-ce-que-la-technologie-jini/
---

<p>Traduction (adaptation, simplification) d'un article de <a href="http://www.sun.com">Sun</a>.</p>
<h1>Historique</h1>
<p>Comment sommes-nous arriv&eacute;s &agrave; un stade o&ugrave; l'orientation &quot;online&quot; des services et du mat&eacute;riel informatique est la pr&eacute;occupation majeure des fabriquants ?</p>
<p>L'explication la plus &eacute;vidente est notre meilleure connaissance de domaines scientifiques tels que la chimie ou l'&eacute;lectronique appliqu&eacute;s &agrave; la micro-informatique. De nos jours, un ordinateur personnel peut &ecirc;tre fabriqu&eacute; &agrave; partir d'un minimum de mat&eacute;riel et les serveurs d'entreprise ne sont plus ces gros amas de t&ocirc;les et de c&acirc;bles occupant des pi&egrave;ces enti&egrave;res.</p>
<p>Dans les ann&eacute;es 60, seules les grosses entreprises pouvaient se payer le luxe d'un ordinateur (d'un de ces amas de t&ocirc;les et de c&acirc;bles).</p>
<p>Puis vient la miniaturisation et la cr&eacute;ation de terminaux: des &eacute;crans et des claviers, sans grosse unit&eacute; centrale, reli&eacute;s en r&eacute;seau &agrave; un serveur. Cela r&eacute;solvait pas mal de probl&egrave;mes de place, et annoncait le d&eacute;but de la vague &quot;online&quot;.</p>
<p>Les &quot;stations de travail&quot;, ordinateurs du format de ceux d'aujourd'hui, firent leur apparition un peu plus tard. Ils offraient une puissance suffisante pour les travaux scientifiques tels que le dessin technique, le d&eacute;veloppement d'application scientifiques...</p>
<p>L'ordinateur personnel (PC) &eacute;tait &eacute;galement assez petit pour tenir sous une table et assez puissant pour offrir des fonctionnalit&eacute;s telles qu'une interface graphique &agrave; ses utilisateurs.</p>
<p>De nos jours la miniaturisation en est &agrave; un tel point que les voitures ont en moyenne une cinquantaine de microprocesseurs, et que l'on peut en trouver plus d'une centaine dans une maison.</p>
<p>Mais la cr&eacute;ation de ces ordinateurs toujours plus petits et moins cher a eu une retomb&eacute;e impr&eacute;vue: la disparition d'une forme de vie en communaut&eacute;. En effet, les ordinateurs &eacute;tant plus disponibles, il n'&eacute;tait plus n&eacute;cessaire des les partager entre plusieurs personnes, tout le monde pouvait avoir son ordinateur personnel, au travail comme &agrave; la maison.<br />
  Et l'internet domestique pallie &agrave; cet effet: les stations de travail et les ordinateurs pesonnels ne sont vraiment utiles d&eacute;s lors qu'ils sont connect&eacute;s entre eux afin de pouvoir communiquer.</p>
<p>Plus loin dans cette voie, les ordinateurs peuvent maintenant &eacute;changer des objets (comprenez: des classes Java) et supporter des langages orient&eacute;s objet et communication. Pout la plupart des gens un ordinateur sert avant tout &agrave; chercher des informations sur internet, communiquer par e-mail, etc...</p>
<h1>Comment fonctionne Jini ?</h1>
<p>La technologie Jini est une architecture pour la construction de syst&egrave;mes &agrave; partir d'objets (de classes...) et de r&eacute;seaux. La technologie Jini permet aux programmes d'utiliser des services dans un r&eacute;seau sans savoir quoi que ce soit du protocole de connexion de ce r&eacute;seau. Une impl&eacute;mentation d'un syst&egrave;me pourrait &ecirc;tre bas&eacute;e sur les RMI, une autre sur XML et encore une autre sur CORBA. Le client Jini interroge les services qui lui r&eacute;pondent comment ils s'utilisent ! Un service est d&eacute;fini par une API, d&eacute;clar&eacute;e comme une interface de programmation Java.</p>
<p>Quand un service est &quot;branch&eacute;&quot; &agrave; un r&eacute;seau ou mat&eacute;riel bas&eacute; sur l'architecture Jini, il s'identifie en publiant un objet Java qui impl&eacute;mente l'API du service concern&eacute;. <br />
  Le client trouve des services en cherchant un objet supportant l'API Jini. Une fois connect&eacute; au service, il t&eacute;l&eacute;charge un code qui lui indique comment communiquer avec ce service. Les programmeurs qui auront impl&eacute;ment&eacute; le service auront choisi comment transformer une requ&ecirc;te de l'API en bits de mani&egrave;re &agrave; utiliser un protocole comme UPnP, RMI, Corba ou un protocole priv&eacute;.</p>
<h1>Cr&eacute;er une communaut&eacute; autour de la technologie Jini</h1>
<p>Quand internet fur cr&eacute;&eacute;, les deux pr&eacute;occupations majeures &eacute;taient de d&eacute;finir et de perfectionner les protocoles de communication et les infrastructures du r&eacute;seau, et de cr&eacute;er des services et des applications utilisant ce r&eacute;seau. L'infrastructure d'internet inclu les protocoles TCP/IP, HTTP, SMTP, FTP (etc...), et leurs impl&eacute;mentations. Avec ces protocoles furent cr&eacute;&eacute;e des logiciels comme les navigateurs, les clients e-mail ou les clients FTP, et m&ecirc;me le Web lui m&ecirc;me. Ce n'est pas une seule entreprise aui r&eacute;ussit &agrave; cr&eacute;er Internet, mais de nombreuses entreprises ayant adopt&eacute; les m&ecirc;mes protocoles, ayant des standars. C'est pourquoi pour que Jini r&eacute;ussisse, un grand nombre de personnes doit l'utiliser. Plus il sera utilis&eacute; plus facilement il devientra une technologie de r&eacute;f&eacute;rence.</p>
<p>La Sun Community Source License (SCSL) a &eacute;t&eacute; cr&eacute;e pour mettre en place une communaut&eacute; autour de Jini. La SCSL donne libre acc&egrave;s au code source de la technologie Jini et de ses d&eacute;v&eacute;s, libres de droits en utilisation et modification.</p>
<h1>Liens</h1>
<p>Pour s'enregistrer http://www.sun.com/jini/licensing/<br />
  Des infos sur la communaut&eacute;: http://www.sun.com/jini/community/</p>
<p>Traduit par Narcanes (narcanes@online.fr) <br />
&agrave; partir d'un article de <a href="http://www.sun.com">Sun</a>,<br />
  pour l'association Java-France / Jgflsoft<br />
  www.java-france.com / www.jgflsoft.com<br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG. <br />
Montpellier, 28 ao&ucirc;t 2001.</p>
