---
layout: post
status: publish
published: true
title: D'Airport, de la Livebox et du protocole UPNP/NAT-PMP

  
  



excerpt: "Voici un nouvel article sur la mise en place d'un réseau local avec une
  Livebox et une borne Airport, sujet qui fait décidément couler beaucoup d'encre
  - si je puis dire. Dans mon précédent article sur le sujet, \"<a href=\"http://www.valhalla.fr/index.php/2005/01/05/dairport-et-de-la-livebox/\">D'Airport
  et de la Livebox</a>\" du 5 janvier 2005, j'ai montré comment paramétrer la Livebox
  avec une borne Airport Express destinée à diffuser de la musique par AirTunes. Aujourd'hui,
  la problématique est un peu différente : il s'agit d'ajouter au réseau un nouveau
  service logiciel inconnu de la Livebox. En effet, les nouvelles technologies mises
  en oeuvre par Apple dans ses derniers périphériques (Airport Extreme, Time Capsule,
  etc.) et dans ses nouveaux logiciels (Mac OS 10.5 Leopard, iChat, Back To My Mac,
  etc.) nécessitent l'ouverture et le routage de nombreux ports logiciels, soit manuellement
  soit par le biais du protocole UPNP/NAT-PMP, ce que la Livebox ne permet pas de
  réaliser.\r\n\r\n"
wordpress_id: 138
date: '2008-03-12 16:09:11 +0100'
date_gmt: '2008-03-12 15:09:11 +0100'
categories:
- Informatique
- Internet
tags:
- apple
- Internet
- Informatique
- Web
- serveur
- réseaux
permalink:  /2008/03/12/dairport-de-la-livebox-et-du-protocole-upnpnat-pmp/
---
<p>Voici un nouvel article sur la mise en place d'un réseau local avec une Livebox et une borne Airport, sujet qui fait décidément couler beaucoup d'encre - si je puis dire. Dans mon précédent article sur le sujet, "<a href="http://www.valhalla.fr/index.php/2005/01/05/dairport-et-de-la-livebox/">D'Airport et de la Livebox</a>" du 5 janvier 2005, j'ai montré comment paramétrer la Livebox avec une borne Airport Express destinée à diffuser de la musique par AirTunes. Aujourd'hui, la problématique est un peu différente : il s'agit d'ajouter au réseau un nouveau service logiciel inconnu de la Livebox. En effet, les nouvelles technologies mises en oeuvre par Apple dans ses derniers périphériques (Airport Extreme, Time Capsule, etc.) et dans ses nouveaux logiciels (Mac OS 10.5 Leopard, iChat, Back To My Mac, etc.) nécessitent l'ouverture et le routage de nombreux ports logiciels, soit manuellement soit par le biais du protocole UPNP/NAT-PMP, ce que la Livebox ne permet pas de réaliser.</p>
<p><a id="more"></a><a id="more-138"></a></p>
<h2>Sur les déficiences de la Livebox</h2>
<p>Nous cherchons à utiliser des services qui nécessitent la redirection de nombreux ports, ou de nombreuses plages de ports. Pour garantir l'ouverture et la bonne direction de ces ports, il existe deux solutions : la redirection manuelle et l'utilisation du protocole UPNP/NAT-PMP.</p>
<p>La redirection manuelle présente un inconvénient de principe : si le routeur est configuré pour rediriger tel et tel ports vers une adresse IP locale déterminée, il faut modifier cette adresse chaque fois que l'on souhaite utiliser le service passant par ces ports sur un ordinateur différent. Cela nécessite bien souvent un redémarrage du routeur (c'est le cas pour la Livebox et pour les bornes Airport ; ce n'est pas le cas, par exemple, pour les routeurs Netgear), opération fastidieuse et assez pénible à réaliser plusieurs fois par jour. En d'autres termes, et pour schématiser, on a MacPro à l'adresse 10.0.1.1 et MacBook à l'adresse 10.0.1.2 ; on redirige le port 8000 (par exemple) vers MacPro. Si l'on veut utiliser le logiciel qui nécessite ce port sur MacBook, on devra rediriger le port 8000 vers 10.0.1.2.</p>
<p>Jusqu'à présent, il y avait une solution très simple à ce problème : il suffisait de paramétrer le logiciel concerné différemment sur les deux ordinateurs, de manière à ce qu'il n'utilise pas le même port. Pour reprendre l'exemple précédent, il aurait suffi d'utiliser le port 8000 sur MacPro et le port 8001 sur MacBook. Néanmoins, la solution n'est pas très convaincante dans le cas de la Livebox : celle-ci ne permet en effet que de rediriger simultanément un certain nombre, peu élevé, de ports. Ou, plus exactement, la Livebox ne permet que de définir un petit nombre de règles de redirection NAT. Autrement dit, la liste est vite pleine, et on en revient à la première procédure qui nécessite d'opérer sans cesse des changements manuels dans la configuration du routeur.</p>
<p>Aujourd'hui, certains services nécessitent la redirection de nombreux port qu'il est impossible de modifier. La seule solution est alors d'utiliser la méthode de redirection automatique, à la volée, désignée sous le nom de UPNP (pour <i>Universal Plug aNd Play</i> dans le monde Windows) ou de NAT-PMP (monde Mac). Parmi les services concernés, on trouve notamment <a href="http://docs.info.apple.com/article.html?artnum=306672-fr">Back To My Mac</a> qui précise bien dans la configuration requise : "<i>une borne d’accès AirPort ou un routeur Internet tiers gérant UPnP ou NAT-PMP</i>". C'est aussi le cas de nombreux services de vidéoconférence, comme iChat. Mais voilà : la Livebox ne gère par l'UPNP/NAT-PMP.</p>
<h2>Solution : utilisation d'une borne Airport Extreme</h2>
<p>La solution aux problèmes précédemment décrits passe par l'utilisation d'une borne Airport Extreme qui, elle, gère parfaitement le protocole UPNP/NAT-PMP.</p>
<p>Cependant, ce n'est pas si simple que cela en a l'air. La Livebox est un routeur, tout comme la borne Airport. Or, deux routeurs ne peuvent pas cohabiter à moins de partager le même réseau (comme c'était le cas dans le précédent article "D'Airport et de la Livebox"), ce qui signifie que l'un d'entre eux s'incline devant l'autre.</p>
<p>La solution traditionnelle est de paramétrer l'un des deux routeurs en mode <i>pont</i> (ci-après, "<i>bridge</i>"). Le routeur paramétré en mode bridge ne "route" plus. Il ne fait que transmettre le signal, que l'autre routeur se charge de router. Autrement dit, dans le cas de la Livebox, le passage en mode bridge signifie l'abandon des fonctions de routeur : l'appareil n'est plus qu'un simple modem ADSL. La solution parfaite serait donc de paramétrer la Livebox en mode bridge pour que la borne Airport Extreme puisse faire office de routeur et mettre en oeuvre UPNP/NAT-PMP.</p>
<p><!-- Image Bridge 1 --><br />
<a href="http://www.flickr.com/photos/valhallafr/2328321841/" title="bridge1 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2149/2328321841_0f35d34fa4_o.png" width="553" height="133" alt="bridge1" align="center" /></a></p>
<p>Comme il est assez courant en informatique, aussitôt un problème résolu c'est un nouveau problème qui se présente : la Livebox Sagem ne peut pas passer en mode bridge. Elle est bridée à cet égard aussi. La Livebox Inventel le permet, paraît-il (à vérifier). Or, j'ai une Livebox Sagem (quelle chance !).</p>
<p>Mettre la borne Airport en mode bridge, comme elle le propose automatiquement dans l'assistant de configuration, ne permet pas de résoudre le problème : tant que la Livebox est le routeur du réseau, c'est elle qui assigne les IP locales et filtre les ports, et l'UPNP/NAT-PMP ne peut être activé.</p>
<p><!-- Image Bridge 2 --><br />
<a href="http://www.flickr.com/photos/valhallafr/2328322231/" title="bridge2 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2318/2328322231_3bf6d25bdd_o.png" width="553" height="133" alt="bridge2" align="center" /></a></p>
<p>Il faut donc trouver une troisième solution. Elle est beaucoup plus complexe, tant en théorie que dans sa mise en oeuvre, mais elle fonctionne. Il s'agit de créer deux sous-réseaux : le réseau classique de la Livebox, avec des adresse IP locales sous la forme 192.168.0.X, qui fera office de "leurre", et le véritable réseau sur lequel se trouvent les ordinateurs, géré par la borne Airport avec des adresses IP locales d'une autre forme. Pour la suite de la démonstration, nous utiliserons des adresses de la forme 10.1.0.X, mais la borne Airport permet de choisir d'autres syntaxes.</p>
<p><!-- Image Bridge 3 --><br />
<a href="http://www.flickr.com/photos/valhallafr/2328322351/" title="bridge3 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2083/2328322351_3a651525e9_o.png" width="553" height="133" alt="bridge3" align="center" /></a></p>
<p>Dans ce réseau, la Livebox possède une adresse locale en tant que routeur : 192.168.1.1. Son port rouge est relié à la borne Airport Extreme, à laquelle est assignée l'adresse 192.168.1.2. A son tour, la borne Airport assigne une adresse dans la plage 10.1.0.2-10.1.0.10 (par exemple) à chacun des appareils connectés à elle.</p>
<h2>Mise en oeuvre</h2>
<p>La première chose à faire est de désactiver le serveur DHCP et la diffusion du signal WIFI de la Livebox. Ainsi, la borne Airport sera le seul périphérique connecté à la Livebox, avec toujours la même adresse IP locale. Pour ce faire, il faut se rendre dans l'interface d'administration de la Livebox avec un navigateur (Safari, Firefox, etc.) : <b><a href="http://192.168.1.1">192.168.1.1</a></b>. On se connecte grâce à un nom d'utilisateur et à un mot de passe qui, s'ils n'ont pas été changés, sont <b>admin</b> et <b>admin</b>. Une fois connecté à l'interface d'administration, on choisit la section <b>Paramétrage LAN & DHCP</b>, puis on clique sur le bouton <b>Arrêter</b>. La page se recharge et le bouton <i>Arrêter</i> s'est transformé en bouton <i>Démarrer</i>. On répète ensuite l'opération en cliquant sur le bouton <b>Arrêter</b> de la section <b>Réseau sans fil</b>. Il ne reste plus qu'à sauver les modifications et à redémarrer la Livebox.</p>
<p><center><b><i>Pour toutes les images ci-dessous : cliquez pour agrandir</i></b></center></p>
<p><!-- Image config. LB --><br />
<a href="http://farm4.static.flickr.com/3285/2328332665_3962da90bf_o.png" title="Image 9 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3285/2328332665_7797dd28d6.jpg" width="500" height="133" alt="Image 9" /></a></p>
<p>
<a href="http://farm3.static.flickr.com/2397/2328325035_6feff52730_o.png" title="Image 2 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2397/2328325035_dd6f2f539d_s.jpg" width="75" height="75" alt="Image 2" style="float:left; padding-right:10px;padding-bottom: 1px;" /></a><br />
Il faut ensuite paramétrer la borne Airport. On lance alors l'<b>Utilitaire Airport</b> (dans Applications/Utilitaires) et on sélectionne la borne désirée. On affiche l'<b>onglet Internet</b>, <b>Connexion à Internet</b> des paramétrage avancés et on remplit les champs comme suit :<br />
<b>Configurer IPv4</b> : Manuellement<br />
<b>Adresse IP</b> : 192.168.1.2<br />
<b>Masque sous-réseau</b> : 255.255.0.0<br />
<b>Adresse du routeur</b> : 192.168.1.1<br />
<b>Serveur(s) DNS</b> : 192.168.1.1<br />
<b>Partage de connexion</b> : Partager une adresse IP publique</p>
<p>
<a href="http://farm3.static.flickr.com/2283/2328324383_b2fea5e7af_o.png" title="Image 3 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2283/2328324383_33458b2dd6_s.jpg" width="75" height="75" alt="Image 3" style="float:left; padding-right:10px;padding-bottom: 1px;" /></a><br />
On passe ensuite sur le prochain onglet de la section Internet des paramètres avancés de la borne Airport : <b>DHCP</b>. Il faut ici paramétrer le serveur DHCP de la borne Airport. Il est impératif d'utiliser une plage d'adresses différente de la plage réservée pour le réseau de la Livebox (en l'occurrence, les plages réservées sont 192.168.1.X, on utilisera donc les plages 10.0.1.X proposées par la borne Airport). On peut choisir une plage de 2 à 254 ports. Ici, nous avons choisi de réserver la plage entre 1 et 10 et 100, ce qui laisse de nombreuses adresses libre pour un total de 90 appareils susceptibles de rejoindre le réseau. On remplira les champs de cette manière :<br />
<b>Plage d'adresses DHCP</b> : 10.0.1.x<br />
<b>Première adresse DHCP</b> : 10.0.1.10<br />
<b>Dernière adresse DHCP</b> : 10.0.1.100<br />
<b>Réservations DHCP</b> : On peut laisse cette option vide ou, si nécessaire, spécifier que tel ordinateur devra toujours se voir assigner la même adresse IP locale. Les ordinateurs sont identifiés grâce à leur adresse MAC. On peut trouver cette adresse dans les Préférences système du Mac, section Réseau, cliquer sur le périphérique concerné, puis sur le bouton <i>Avancé</i> et, enfin, dans la page qui s'ouvre, sur l'onglet <i>Ethernet</i><i> pour une connexion Ehternet (par câble) ou </i><i>Airport</i> pour une connexion Wiki. L'adresse MAC sera présentée soit sous le nom <i>ID Ethernet</i> soit sous celui de <i>Identifiant AirPort</i>. Dans la capture d'écran ci-contre, l'adresse 10.0.1.10 est réservée à mon ordinateur fixe, MacPro.</p>
<p>
<a href="http://farm3.static.flickr.com/2245/2328324091_247c461140_o.png" title="Image 4 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2245/2328324091_c680b34d84_s.jpg" width="75" height="75" alt="Image 4" style="float:left; padding-right:10px;padding-bottom: 1px;" /></a><br />
Le protocole UPNP/NAT-PMP <a href="http://docs.info.apple.com/article.html?artnum=306673">s'active très facilement</a>. Il suffit de cocher la case <b>Activer le protocole de mappage des ports NAT</b> dans l'onglet <b>NAT</b> de la section Internet des paramètres avancés de la borne Airport.</p>
<p>&nbsp;</p>
<p>
<a href="http://farm4.static.flickr.com/3224/2329145030_4ee2d95633_o.png" title="Image 5 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3224/2329145030_ff2717ebc7_s.jpg" width="75" height="75" alt="Image 5"  style="float:left; padding-right:10px;padding-bottom: 1px;" /></a><br />
Il est possible de rediriger des ports "manuellement" pour les logiciels qui ne gèrent pas le protocole UPNP/NAT-PMP. Pour ce faire, il suffit de cliquer sur le bouton <b>Configurer les mappages de ports...</b> et de suivre les instructions. Deux fenêtres de configuration se succèdent : la première demande de choisir un service préconfiguré dans la liste ou de rentrer manuellement les ports à rediriger. Dans l'exemple ci-contre, on redirige le port 8030 vers MacPro, c'est-à-dire vers 10.1.0.10. Il faut pour cela entrer la valeur <i>8030</i> dans les champs des Ports UDP et TCP publics et privés, et de rentrer l'adresse précitée dans le champ "Adresse IP privée".</p>
<p>
<a href="http://farm4.static.flickr.com/3209/2329144680_cace75f799_o.png" title="Image 6 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3209/2329144680_5ea3d88197_s.jpg" width="75" height="75" alt="Image 6" style="float:left; padding-right:10px;padding-bottom: 1px;" /></a><br />
Il ne reste plus qu'à définir le nom du service, comme <i>MacPro Azureus</i> dans l'exemple présenté ici. On valide ensuite la configuration et on redémarre la borne Airport. Le port sera désormais redirigé.</p>
<p>&nbsp;</p>
<p>
<a href="http://farm3.static.flickr.com/2059/2328323039_0f14d398cb_o.png" title="Image 1 de GF @ valhalla.fr, sur Flickr"><img src="http://farm3.static.flickr.com/2059/2328323039_6c85f2c599_s.jpg" width="75" height="75" alt="Image 1" style="float:left; padding-right:10px;padding-bottom: 1px;" /></a><br />
La configuration de la borne Aiport est achevée. Il ne reste plus qu'à configurer l'accès Internet des ordinateurs reliés à cette borne. Sous Mac, on se rendra dans la section <b>Réseau</b> des Préférences Système (menu Pomme). Il faudra double-cliquer sur le mode de connexion désiré (Ethernet, Airport, etc.) et paramétrer la connexion soit en DHCP (comme sur la capture d'écran ci-contre), auquel cas le Mac devrait réaliser le configuration tout seul ; soit manuellement en choisissant une adresse IP locale dans la plage allouée par la borne Airport (i.e. 10.0.1.X), en spécifiant l'adresse de la borne Airport (10.0.1.1) dans les champs <i>Routeur</i> et <i>Serveur DNS</i>, et en choisissant le masque sous-réseau 255.255.255.0.</p>
<p>
<a href="http://www.flickr.com/photos/valhallafr/2328322573/" title="Image 8 de GF @ valhalla.fr, sur Flickr"><img src="http://farm4.static.flickr.com/3243/2328322573_9b998b6997.jpg" width="500" height="36" alt="Image 8" align="center" /></a><br />
Pour tester si votre connexion fonctionne et si les ports sont correctement redirigés, vous pouvez utiliser le <i>Test de redirection des ports Valhalla.fr</i> disponible à l'adresse suivante : http://asgard.valhalla.fr/nat.php</p>
