---
layout: post
status: publish
published: true
title: Construire un réseau Wifi sécurisé
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 52
wordpress_url: http://blog.gfblog.com/?p=52
date: '2005-10-11 19:47:11 +0200'
date_gmt: '2005-10-11 17:47:11 +0200'
categories:
- Internet
- Mac
- Featured
tags:
- Mac
- Internet
- Informatique
- sécurité
- Linux
- serveur
- Windows
- réseaux
---
<p>
Depuis que je suis rentré de vacances, j'ai constaté un changement chez mes voisins: un certain nombre d'entre eux ont installé un réseau Wifi. Pour la plupart, il n'y a aucune sécurité. Si ma connexion tombait en panne, j'aurais le choix parmi une demi-douzaine de réseaux ouverts ! C'est bien d'habiter en appartement... Les gens qui n'y connaissent rien en informatique peuvent acheter une LiveBox, dans ce cas il y aura un système minimal de sécurité préinstallé (WEP). Ou bien ils peuvent suivre les conseils avisés d'un ami informaticien et acheter un routeur d'un fabricant tiers pour mettre en place leur réseau domestique. Dans ce cas, il n'y aura aucune sécurité par défaut, le réseau sera ouvert et représentera un trou de sécurité béant.</p>
<p>
Les gens croient au plug 'n' play, mais cela n'existe pas en matière de réseau. Avoir un réseau ouvert dans un immeuble en plein Paris, c'est s'exposer à des détournements de sa connexion. Si quelqu'un utilise votre ligne, la première conséquence est que votre bande passante sera réduite. S'il se met à télécharger sur les réseaux P2P, non seulement votre vitesse de navigation sera considérablement ralentie (vous aurez plus l'impression d'être connecté en 56K qu'en ADSL), mais vous pourrez avoir de sérieux ennuis selon le contenu téléchargé. Vous êtes responsable des données qui transitent par votre connexion... et allez prouver que ce n'était pas vous qui étiez connecté !</p>
<p>
Il vous faut donc <u>impérativement</u> sécuriser votre réseau Wifi. Ce n'est pas compliqué dans l'absolu, mais c'est totalement inaccessible aux novices. Cet article a pour but d'expliquer un certain nombre de techniques pour renforcer la sécurité de votre réseau. Si vous suivez toutes ces instructions votre réseau sera très bien protégé pour un réseau domestique, la plupart des gens qui ont sécurisé leur réseau n'ayant pas mis en oeuvre le tiers de ces techniques.</p>
<h2>Théorie et définitions</h2>
<p><a name="1"></a></p>
<p>
Je tiens à expliquer dans un premier temps quelles sont les principales techniques à mettre en oeuvre pour sécuriser un réseau Wifi, pour ensuite passer à une démonstration pratique. Les techniques sont exposées de la plus essentielle à la moins importante ; mais gardez quand même à l'esprit que chaque nouvelle technique mise en oeuvre renforce un peu plus la sécurité globale du réseau.</p>
<p>
<a name="1A"></a><br />
<u><strong>Protéger l'accès par un mot de passe et crypter les données en transit</strong></u><br />
La première technique à mettre en oeuvre est l'activation du cryptage automatique des données qui transitent par Wifi. Vous avez pour cela 2 protocoles de cryptage: WEP et WPA. Le WEP est relativement célèbre puisqu'il est actif sur la plupart des "Box" (LiveBox, FreeBox, etc...) vendues. Il est néanmoins totalement obsolète. Il n'arrêtera que quelqu'un qui n'y connait rien ; il ne m'arrête pas (en 10 minutes, c'est expédié). Pour vous en persuader, tapez "<a href="http://www.google.com/search?hl=fr&rls=fr&q=wep+hacking&btnG=Rechercher&lr=">wep hacking</a>" sur Google, et vous trouverez de nombreuses pages vous expliquant comment casser une protection WEP. Il faut donc utiliser le protocole WPA qui est beaucoup plus difficile (mais pas totalement impossible...) à hacker ("hacker" signifie ici "faire tomber les sécurités"). De plus, le WEP nuit à la fiabilité du réseau et à sa portée, alors que ce n'est pas le cas pour le WPA.</p>
<p>
Le cryptage WPA, comme le WEP, fonctionne sur un principe simple: un mot de passe automatiquement utilisé par le routeur pour crypter les données, et le même mot de passe utilisé par l'ordinateur pour les décrypter. Comme tout mot de passe, il ne doit pas pouvoir être trouvé d'après vos données personnelles. Ne mettez pas votre nom ou date de naissance... Le mot de passe doit également être assez long et alphanumérique (des chiffres et des lettres). Par exemple: kjsd8976dhs7ww4hpzx8bqj09dmH6d3b est un excellent mot de passe ;-)</p>
<p>
<a name="1B"></a><br />
<u><strong>Changer le nom du réseau</strong></u><br />
C'est ce qui m'a donné l'idée d'écrire cet article. Je me connecte souvent, en province, à un réseau appelé NETGEAR (nom par défaut donné par les routeurs de cette marque à tout nouveau réseau). Les Mac sous OS X gardent en mémoire les réseaux fréquemment utilisés et s'y connectent automatiquement. Mon réseau à Paris a été indisponible pendant les quelques secondes qu'a nécessité le redémarrage de mon routeur. J'ai eu le malheur d'allumer mon ordinateur pendant ce temps, et il s'est automatiquement connecté à un réseau du voisinage appelé NETGEAR. J'étais donc sur le réseau de mon voisin, sans même m'en être rendu compte.</p>
<p>
D'où l'impératif suivant: changez le nom du réseau ! Le nom de votre chat conviendra parfaitement, si vous ne passez pas votre temps à lui courir après dans le jardin en hurlant son nom... ;)</p>
<p>
<a name="1C"></a><br />
<u><strong>Désactivez la diffusion SSID</strong></u><br />
Les routeurs sont paramétrés par défaut pour diffuser le nom de votre réseau, cela s'appelle la diffusion du SSID. Tout ordinateur Mac ou PC pourra alors sélectionner votre réseau dans la liste des réseaux disponibles et s'y connecter en entrant le mot de passe associé. Désactivez la diffusion du SSID. Le nom du réseau ne sera plus diffusé, et il faudra entrer manuellement son nom pour pouvoir s'y connecter. Pour entrer manuellement le nom, il faut déjà savoir que le réseau existe et, en plus, connaître son nom... c'est bête, mais imparable !</p>
<p>
Il existe des logiciels qui permettent de repérer les réseaux qui ne diffusent pas leur SSID. Masquer son SSID est donc nécessaire, mais non suffisant : cela permet de réduire les risques, mais pas de se protéger contre une attaque ciblée.</p>
<p>
<a name="1D"></a><br />
<u><strong>Filtrez les adresses MAC</strong></u><br />
Chaque appareil doté de capacités Wifi possède une adresse MAC unique et immuable. L'adresse MAC, du type  <em>00:0F:76:EB:83:D9</em>, est l'empreinte digitale de votre matériel. Vous pouvez paramétrer votre routeur pour n'accepter que les connexions venant de certaines adresses MAC, et rejeter toutes les autres. Les LiveBox de Wanadoo sont configurées automatiquement pour mettre en oeuvre le filtrage des adresses MAC: quand vous mettez une LiveBox en mode "association", elle enregistre une nouvelle adresse MAC autorisée.</p>
<p>Le filtrage des adresses MAC constitue une protection supplémentaire nécessaire mais non suffisante. Il est en effet possible de récupérer l'adresse MAC d'un périphérique autorisé par le routeur, puis de se connecter en usurpant cette adresse (en utilisant un logiciel de virtualisation, par exemple).</p>
<p>
<a name="1E"></a><br />
<u><strong>Changer le mot de passe du logiciel d'administration</strong></u><br />
Vous accedez au logiciel d'administration de votre routeur depuis votre navigateur, en entrant un <em>login</em> (nom d'utilisateur) et un <em>password</em> (mot de passe). Par défaut, il s'agit souvent des couples {admin,admin} (pour les LiveBox par exemple) ou {admin,password} (pour les routeurs Netgear par exemple).</p>
<p>
Imaginez la situation suivante: je tombe sur votre réseau Netgear qui s'appelle tout bêtement "NETGEAR" et qui n'a aucune protection. Je me connecte, j'accède à l'interface d'administration avec {admin,password}, je fais mes petites modifications et je change ce couple nom d'utilisateur / mot de passe. Vous perdez le contrôle de votre connexion: je peux désormais l'utiliser, mais pas vous. Changez donc impérativement le nom d'utilisateur et le mot de passe.</p>
<p>
<a name="1F"></a><br />
<u><strong>Réduction de la portée du réseau</strong></u><br />
Certaines bornes Wifi peuvent être paramétrées pour réduire leur champ d'action. C'est la protection la plus drastique, elle est même totale et définitive: s'il n'y a pas de couverture, il est impossible de se connecter au réseau. L'inconvénient est que vous ne pouvez pas savoir exactement quel est le rayon de couverture du réseau.</p>
<p>
<a name="1G"></a><br />
<u><strong>Serveur RADIUS</strong></u><br />
L'installation d'un réseau RADIUS est une technique de protection avancée (notamment utilisée sur le matériel CISCO). Cette technique étant destinée avant tout aux entreprises je n'en parlerai pas plus ici, mais vous savez au moins que ça existe.</p>
<h2>En pratique</h2>
<p><a name="2"></a></p>
<p>
Pour ce cas d'école, je vais reproduire un schéma simple: une LiveBox connectée à la prise téléphonique et faisant office de modem ADSL. Une borde Airport connectée à la LiveBox et qui s'occupe du routage des données. Enfin, une autre borne Airport branchée à la chaîne hifi et à l'imprimante, et communiquant sans fil avec la première borne. Installer un tel réseau prendra approximativement 10 minutes.</p>
<p>
<center><br />
Voici le schéma de ce réseau: <br />
<img alt="Réseau Wifi sécurisé" src="/public/posts/2005-10-11-wifi/wifi_schema.png" /><br />
</center></p>
<p>
La première chose à faire est de désactiver le réseau Wifi sur la LiveBox (car elle fait tout mal... c'est un vrai désastre ce truc). Pour cela, tapez l'adresse <span class="Code">http://192.168.1.1/</span> dans votre navigateur, puis identifiez vous. Vous accèderez à la page d'accueil du logiciel d'administration de la LiveBox. Cliquez sur <em>Réseau sans fil</em> dans le menu principal (1). Cliquez ensuite sur le bouton <em>Désactiver</em> qui se transformera en <em>Activer</em> immédiatement après cela (2). L'état de la diffusion Wifi de la LiveBox devrait maintenant être passé à <em>désactivé</em> (3).</p>
<p>
<center><br />
<img alt="Réseau Wifi sécurisé" src="/public/posts/2005-10-11-wifi/wifi0.png" /><br />
</center></p>
<p>
Branchez la première borne Airport à la LiveBox par Ethernet (cable droit), en utilisant la prise rouge. Installez également la seconde borne Airport, qui ne sera pour l'instant connectée à aucun appareil. Lancez l'<em>Utilitaire Admin Airport</em> situé dans <span class="Code">Application/Utilitaires</span> sur Mac ou dans le menu démarrer de Windows, après installation des drivers fournis sur le CD allant avec la borne Airport. Vous devriez voir les deux bornes dans la liste, avec leurs noms d'origine: <em>Base Station XXXX</em>. Dans l'image ci-dessous, les noms originaux ont été changés.</p>
<p>
<center><br />
<img alt="Réseau Wifi sécurisé" src="/public/posts/2005-10-11-wifi/wifi1.png" /><br />
</center></p>
<table border="0">
<tr>
<td rowspan="3">
Sélectionnez la borne branchée à la Livebox et paramétrez là ainsi:<br />
(voir les images ci-contre, cliquer dessus pour agrandir)</p>
<ul>
<li /><b>Borne d'accès: Nom</b>: ce que vous voulez.
<li /><b>Borne d'accès: Modifier le mot de passe</b>: entrez un mot de passe facile à retenir, ce n'est pas très important.
<li /><b>Réseau: Mode sans fil</b>: <em>Créer un réseau sans fil (routeur domestique)</em>
<li /><b>Réseau: Nom</b>: il s'agit du nom de votre réseau.
<li /><b>Réseau: Modifier sécurité sans fil</b>: réglez ceci sur WPA2, et choisissez un mot de passe très complexe.
<li /><b>Réseau: Réseau fermé</b>: cochez cette case pour ne pas diffuer le SSID.
<li /><b>Réseau: Options sans fil</b>: pour paramétrer le portée de la borne.
</ul>
</td>
<td align="center"><a href="/public/posts/2005-10-11-wifi/wifi2.png"><br />
<img alt="Réseau Wifi sécurisé" src="/public/posts/2005-10-11-wifi/_wifi2.png" /><br />
</a></td>
</tr>
<tr>
<td align="center"><a href="/public/posts/2005-10-11-wifi/wifi3.png"><br />
<img alt="Réseau Wifi sécurisé" src="/public/posts/2005-10-11-wifi/_wifi3.png" /><br />
</a></td>
</tr>
<tr>
<td align="center"><a href="/public/posts/2005-10-11-wifi/wifi4.png"><br />
<img alt="Réseau Wifi sécurisé" src="/public/posts/2005-10-11-wifi/_wifi4.png" /><br />
</a></td>
</tr>
</table>
<p>
Rendez vous ensuite sur l'onglet <em>Accès</em> et entrez les adresses MAC de vos différents ordinateurs comme montré dans l'image ci-dessous.<br />
<br />
<center><br />
<a href="/public/posts/2005-10-11-wifi/wifi5.png"><br />
<img alt="Réseau Wifi sécurisé" src="/public/posts/2005-10-11-wifi/_wifi5.png" /><br />
</a><br />
</center></p>
<p>
Pour finir, rendez vous sur l'onglet <em>WDS</em>, activez la borne en tant que <em>borne principale</em>, permettez l'accès aux clients sans fil et cliquez sur le bouton " + " pour ajouter automatiquement votre seconde borne Airport (dont le nom est donné dans la liste des bornes disponibles, voir ci-dessus). Validez en cliquant sur "Mettre à jour" pour que vos deux bornes Airport se configurent et redémarrent.<br />
<br />
<center><br />
<a href="/public/posts/2005-10-11-wifi/wifi6.png"><br />
<img alt="Réseau Wifi sécurisé" src="/public/posts/2005-10-11-wifi/_wifi6.png" /><br />
</a><br />
</center></p>
<p>
Votre réseau est prêt ! Il ne vous reste plus qu'à vous connecter.</p>
