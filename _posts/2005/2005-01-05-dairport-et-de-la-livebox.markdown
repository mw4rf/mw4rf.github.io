---
layout: post
status: publish
published: true
title: D'Airport et de la LiveBox

  
  



wordpress_id: 19
wordpress_url: http://localhost/~guillaume/gfblog/wordpress/?p=19
date: '2005-01-05 22:35:59 +0100'
date_gmt: '2005-01-05 20:35:59 +0100'
categories:
- Internet
tags:
- hardware
- serveur
- apple
permalink:  /2005/01/05/dairport-et-de-la-livebox/
---
<p>De nos jours, il n'est plus envisageable d'utiliser une connexion internet bas d&eacute;bit (<a href="{% post_url /2005/2005-01-02-internet-de-lavenir-du-bas-debit %}">cliquez ici si vous n'&ecirc;tes pas d'accord</a>). Il vous faut l'ADSL. Si comme 2,5 millions de personne (au jour o&ugrave; j'&eacute;cris ces lignes) vous avez opt&eacute; pour Wanadoo, vous re&ccedil;evrez une Livebox. Cette boibo&icirc;te est assez pratique, simple &agrave; configurer (tant qu'on ne cherche pas &agrave; rentrer dans les param&eacute;trages avanc&eacute;s...), et assez jolie. D'un autre c&ocirc;t&eacute;, si vous lisez cet article c'est que vous avez un Mac avec une carte Airport, ou un PC ou un Mac avec un r&eacute;seau sans fil Airport, airport extreme ou airport express. Cet article traite des int&eacute;ractions entre la LB et la borne airport.</p>
<p>Note:  je vais &eacute;crire &quot;LB&quot; au lieu de &quot;Wanadoo Inventel Livebox&trade;&quot; ou &quot;Wanadoo Sagem Livebox&trade;&quot;; et &quot;airport&quot; au lieu de &quot;Apple borne Airport&trade;&quot;. De plus, les captures d'&eacute;cran de l'interface d'administration de la LB correspondent &agrave; la LB Sagem. Pour la LB Inventel, c'est le m&ecirc;me principe (donc tout ce que je dis ici s'applique &eacute;galement &agrave; cette LB), mais <em>on ne clique pas exactement au m&ecirc;me endroit pour faire la m&ecirc;me chose</em>. </p>
<h3 align="center">Sommaire</h3>
<p align="center"><a href="#1A">Avantages de la Livebox</a><br />
          <a href="#1B">Avantages de la borne Airport</a><br />
          <a href="#1C">Le probl&egrave;me qui se pose </a></p>
<p align="center"><a href="#2A">Installer la borne Airport</a><br />
          <a href="#2B">Configurer la connexion sur PC</a><br />
          <a href="#2C">Configurer la connexion sur Mac (OS X)</a></p>
<p align="center"><a href="#3A">Mettre en place le <em>port forwarding</em></a><em><br />
</em><a href="#3B">Partager le r&eacute;seau entre la Livebox et la borne Airport</a></p>
<p align="center">&nbsp;</p>
<h3 align="justify"><a name="1A" id="1A"></a>Avantages de la Livebox</h3>
<p align="justify">- Modem ADSL<br />
        - Routeur<br />
        - WiFi<br />
        - Wanadoo Phone et ADSL TV<br />
        - On vous la change si elle casse ;-)</p>
<h3 align="justify">
<a name="1B" id="1B"></a>Avantages de la borne Airport</h3>
<p align="justify">Pour la borne airport extreme, il s'agit simplement d'un routeur cable/wifi, et pour airport express:<br />
        - Connecter votre ordinateur &agrave; votre chaine Hifi sans fil<br />
- Connecter votre ordinateur &agrave; votre imprimante sans fil </p>
<h3 align="justify"><a name="1C" id="1C"></a>Le probl&egrave;me qui se pose</h3>
<p align="justify">La LB et la borne airport sont des dispositifs de diffusion Wifi. Ainsi, la LB vous envoie internet par wifi, si je puis m'exprimer ainsi, et la borne airport re&ccedil;oit votre musique et vos fichier &agrave; imprimer par wifi.</p>
<p align="justify">Vous avez ainsi deux r&eacute;seaux wifi diff&eacute;rents: le r&eacute;seau LB et le r&eacute;seau airport. Chez moi le premier s'appelle &quot;GF Wanadoo Paris&quot; et le second &quot;GF Apple Paris&quot;. Le probl&egrave;me est que je ne peux pas &ecirc;tre connect&eacute; aux deux &agrave; la fois (il est impossible d'&ecirc;tre connect&eacute; &agrave; 2 r&eacute;seaux Wifi &agrave; la fois avec le m&ecirc;me ordinateur), je dois donc choisir de naviguer sur internet ou d'&eacute;couter de la musique. Or quand je lance un long t&eacute;l&eacute;chargement de plusieurs heures, je ne peux pas me d&eacute;connecter d'internet, et pendant ce temps je ne peux pas &eacute;couter de la musique, c'est frustrant!</p>
<p align="justify">Une solution existe cependant. Vous la trouverez sur les forums: il s'agit de relier la borne Airport &agrave; la LB, et de configurer tout &ccedil;a comme un r&eacute;seau local. Seulement, chez moi les enceintes sont &agrave; l'autre bout du salon par rapport &agrave; la prise t&eacute;l&eacute;phonique (sur laquelle est branch&eacute;e la LB). Donc, &agrave; moins de supporter un cable ethernet au milieu du salon, je devais trouver une autre solution.</p>
<p align="justify">Cet article explique point par point comment mettre en oeuvre ma solution.</p>
<p align="justify">Ressource: <a href="http://livebox.forumactif.com/" target="_blank">Forum Wanadoo Livebox</a> (Inventel et Sagem).   </p>
<h3 align="justify"><a name="2A" id="2A"></a>Installer la borne Airport</h3>
<p align="justify">Pour ce qui est des branchements, je vous laisse vous d&eacute;brouiller avec la documentation fournie avec la LB et la borne airport. Si vous n'y arrivez pas, ce n'est m&ecirc;me pas la peine de lire la suite, vous ne comprendrez rien ;-)</p>
<p align="justify">Je vais traiter dans ce paragraphe du probl&egrave;me de l'<em>association</em>. Wanadoo emploie ce terme d'association pour d&eacute;signer l'autorisation accord&eacute;e &agrave; un p&eacute;riph&eacute;rique Wifi de se connecter au r&eacute;seau, en utilisant son adresse MAC pour l'identifier.</p>
<p align="justify">Le Wifi (qui s'appelle Airport chez Apple, inventeur de la technologie) est un protocole de transmission de donn&eacute;es par ondes hertziennes. Autrement dit, c'est comme votre radio sur laquelle vous re&ccedil;evez des &eacute;missions de radio. La borne airport et la LB sont des &eacute;metteurs, et votre ordinateur le recepteur (bien que dans ce cas, il puisse envoy&eacute; des donn&eacute;es &agrave; l'emetteur, mais ce n'est pas lui qui <em>cr&eacute;e</em> la diffusion ex nihilo). Vous avez donc des ondes chez vous. Ces ondes traversent les murs, et votre voisin peut tr&egrave;s bien se connecter &agrave; votre LB pour surfer tranquilement sur internet sans ne rien payer. Bien entendu, cela n'est pas acceptable: deux moyens de protection de la connexion ont donc &eacute;t&eacute; mis en place, je vais les d&eacute;signer (assez improprement, mais passons) par protection logicielle et protection mat&eacute;rielle.</p>
<p align="justify">La protection logicielle est un mot de passe que chaque personne se connectant au r&eacute;seau doit fournir. Ce mot de passe peut &ecirc;tre trait&eacute; de diff&eacute;rentes mani&egrave;res, et parmi les plus utilis&eacute;es le WEP et le WPA. Par d&eacute;faut les LB Sagem sont en WEP et les LB Inventel en WPA. Le WEP peut alt&eacute;rer la transmission des donn&eacute;es et &ecirc;tre facilement cass&eacute; (l'algoritme de cryptage j'entend); alors que le WPA n'alt&egrave;re en rien la transmission et ne peut pas &ecirc;tre cass&eacute; &agrave; l'heure actuelle (sauf si vous arrivez &agrave; louer les supercalculateurs de la NASA pendant deux ou trois ans ;-) Je vous conseille donc de changer pour le WPA si vous poss&eacute;dez une LB Sagem. </p>
<p align="justify">La protection mat&eacute;rielle est l'association de la LB &agrave; certains ordinateurs. Votre ordinateur dispose en fait d'un p&eacute;riph&eacute;rique unique de r&eacute;ception Wifi (que ce soit une carte airport, une carte PCMCIA, une clef USB, etc) qui a un nom propre. Votre voisi qui a achet&eacute; le m&ecirc;me mod&egrave;le que vous, 5 minutes apr&egrave;s vous &agrave; la m&ecirc;me FNAC, aura un p&eacute;riph&eacute;rique avec un autre nom. Ce nom est appel&eacute; &quot;adresse MAC&quot; (absolument rien &agrave; voir avec le Macintosh). Quand vous essayez de vous connecter &agrave; votre LB avec votre ordinateur la LB demande &quot;quelle est ton adresse MAC?&quot;, l'ordinateur la lui communique, elle v&eacute;rifie si cette adresse est autoris&eacute;e, et si c'est le cas l'acc&egrave;s est autoris&eacute;, sinon l'acc&egrave;s est refus&eacute;.</p>
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
<tr>
<td width="79%">
<div align="justify">La LB fait donc une liste des p&eacute;riph&eacute;riques Wifi que <em>vous</em> choisissez d'autoriser. Cette liste est visible dans l'interface d'administration de la LB (j'explique plus bas comment y acc&eacute;der) dans <span class="Code">R&eacute;seau sans fil</span> - <span class="Code">Editer la liste des filtres MAC</span> (voir capture d'&eacute;cran ci-contre, cliquer pour agrandir).</div>
</td>
<td width="20%">
<div align="center"><a href="/public/posts/2005-01-05-airport-livebox/images/image_11.png"><img alt="image" src="/public/posts/2005-01-05-airport-livebox/thumbnails/image_11.png" width="55" height="52" border="0" /></a></div>
</td>
</tr>
</table>
<p align="justify">L'avantage de ce proc&eacute;d&eacute; est que personne ne peut ajouter un &eacute;l&eacute;ment &agrave; la liste des p&eacute;riph&eacute;riques autoris&eacute;s sans entrer physiquement chez vous et appuyer sur un bouton de la Livebox. Ne me dites pas &quot;oui, mais il y a un bouton Ajouter dans la capture d'&eacute;cran&quot;... car pour acc&eacute;der &agrave; l'interface d'administration, il faut &ecirc;tre connect&eacute; au r&eacute;seau, et on ne peut pas se connecter au r&eacute;seau si l'adresse MAC n'est pas autoris&eacute;e, la boucle est boucl&eacute;e.</p>
<p align="justify">Pour ajouter une ordinateur dans la liste des ordinateurs autoris&eacute;s &agrave; se connecter &agrave; votre r&eacute;seau, il faut proc&eacute;der ainsi:<br />
        - Appuyer sur le bouton &quot;association&quot; de la LB. (on dit &quot;la mettre en mode association&quot;)<br />
        - Se connecter au r&eacute;seau avec l'ordinateur que l'on veut autoriser.<br />
Cette proc&eacute;dure est &agrave; r&eacute;aliser une fois (et seulement une fois) pour chaque nouvel ordinateur &agrave; ajouter (y compris le premier). </p>
<p align="justify">Le bouton de la LB n'est pas au m&ecirc;me endroit sur la Sagem et sur l'Inventel, je vous renvoie aux illustrations disponibles sur le site de wanadoo qui sont tr&egrave;s claires:</p>
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
<tr>
<td>
<div align="center"><img alt="image" src="/public/posts/2005-01-05-airport-livebox/images/serv_059_11.gif" width="217" height="116" /></div>
</td>
<td>
<div align="center"><img alt="image" src="/public/posts/2005-01-05-airport-livebox/images/serv_059_12.gif" width="207" height="118" /></div>
</td>
</tr>
</table>
<p align="justify">&nbsp;</p>
<h3 align="justify">
<a name="2B" id="2B"></a>Configurer la connexion sur PC</h3>
<p align="justify">Pour les PC sous Windows, aucun probl&egrave;me. Je vous laisse faire tranquilement en suivant le mode d'emploi fourni avec la LB ou la borne Airport. Ca se r&eacute;sume &agrave; &ccedil;a: mettez le CD-Rom dans le lecteur, cliquez sur 'Suivant' jusqu'&agrave; ce que &ccedil;a soit termin&eacute;. </p>
<h3 align="justify">
<a name="2C" id="2C"></a>Configurer la connexion sur Mac (OS X)</h3>
<p align="justify">Pour les Mac, je vais parler de la configuration de la LB. Pour ce qui est de la borne airport, vous n'avez m&ecirc;me pas besoin de mettre le CD, si votre ordinateur est &agrave; jour normalement la connexion est disponible imm&eacute;diatement apr&egrave;s le branchement de la borne sur secteur.</p>
<p align="justify">Pour la LB, le CD fourni n'est pas compatible Mac. Il faudra donc vous d&eacute;brouiller tout seul (heureusement, c'est simple comme bonjour... merci Apple).</p>
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
<tr>
<td>
<div align="justify">1/ Lancez le programme <span class="Code">Connexion &agrave; Internet</span> se trouvant dans le r&eacute;pertoire <span class="Code">Applications</span>. Cochez la case <span class="Code">Afficher l'etat AirPort dans la barre des menus</span>. </div>
</td>
<td width="20%">
<div align="center"><a href="/public/posts/2005-01-05-airport-livebox/images/image_3.png"><img alt="image" src="/public/posts/2005-01-05-airport-livebox/thumbnails/image_3.png" width="64" height="40" border="0" /></a></div>
</td>
<td></td>
</tr>
</table>
<p></p>
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
<tr>
<td>
<div align="justify">2/ Dans la barre des menus, cliquez sur le symbole Airport, et choisissez la connexion Wanadoo. (Elle ne s'appellera pas pareil que chez moi, mais il y aura &quot;Wanadoo&quot; dans le nom) </div>
</td>
<td width="20%">
<div align="center"><a href="/public/posts/2005-01-05-airport-livebox/images/image_1.png"><img alt="image" src="/public/posts/2005-01-05-airport-livebox/thumbnails/image_1.png" width="61" height="52" border="0" /></a></div>
</td>
</tr>
</table>
<p></p>
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
<tr>
<td>
<div align="justify">3/ Votre Mac va tenter de se connecter, et va se heurter &agrave; la premi&egrave;re protection: le mot de passe. Choisissez le mode de protection correspondant &agrave; votre LB (WEP 128 pour Sagem et WPA Personnel pour Inventel), et tapez votre mot de passe (disponible au dos de la boite du CD-Rom fourni avec la LB, ou sur une &eacute;tiquette sous la LB elle m&ecirc;me: &quot;Clef WEP&quot; ou &quot;Clef WPA&quot;). <br />
            NE CLIQUEZ PAS ENCORE SUR OK.
          </div>
</td>
<td width="20%">
<div align="center"><a href="/public/posts/2005-01-05-airport-livebox/images/image_2.png"><img alt="image" src="/public/posts/2005-01-05-airport-livebox/thumbnails/image_2.png" width="64" height="32" border="0" /></a></div>
</td>
</tr>
</table>
<p>4/ Allez appuyer sur le bouton d'association de votre LB, puis cliquez ensuite sur OK pour valider votre mot de passe. Accessoirement, enregistrez le dans votre Trousseau (il est long et p&eacute;nible &agrave; taper...). </p>
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
<tr>
<td>
<div align="justify">5/ Lancez votre navigateur, et entrez dans le logiciel de configuration de la LB: pour cela rendez vous &agrave; l'adresse <span class="Code">http://192.168.1.1</span> puis entrez <span class="Code">admin</span> et <span class="Code">admin</span> comme login et mot de passe quand cela vous est demand&eacute;. <br />
            Vous acc&eacute;derez &agrave; la page d'accueil du logiciel de configuration, et vous devrez entrer votre identifiant et votre mot de passe de connexion (fournis par Wanadoo). </div>
</td>
<td width="20%">
<div align="center"><a href="/public/posts/2005-01-05-airport-livebox/images/image_4.png"><img alt="image" src="/public/posts/2005-01-05-airport-livebox/thumbnails/image_4.png" width="55" height="52" border="0" /></a></div>
</td>
</tr>
</table>
<p></p>
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
<tr>
<td>
<div align="justify">6/ FACULTATIF: vous pouvez vous rendre &agrave; la page <span class="Code">R&eacute;seau sans fil</span> du logiciel d'administration pour modifier le nom de la connexion, le mot de passe WEP, etc. </div>
</td>
<td width="20%">
<div align="center"><a href="/public/posts/2005-01-05-airport-livebox/images/image_5.png"><img alt="image" src="/public/posts/2005-01-05-airport-livebox/thumbnails/image_5.png" width="55" height="52" border="0" /></a></div>
</td>
</tr>
</table>
<p></p>
<h3 align="justify"><a name="3A" id="3A"></a>Mettre en place le <em>port forwarding</em></h3>
<p align="justify">Je n'ai pas l'intention de vous faire un cours sur la mani&egrave;re dont fonctionnent les routeurs, mais je dois quand m&ecirc;me parler du <em>port forwarding</em>, car je suppose que si vous avez achet&eacute; l'ADSL c'est pour utiliser des clients P2P, des jeux en r&eacute;seau, etc; et cela est impossible avec la Livebox (utilis&eacute;e en Wifi) sans rediriger des ports (<em>port forwarding</em> signifiant <em>redirection de ports</em>).</p>
<p align="justify">Pour expliquer le port forwarding, il faut comprendre comment fonctionne votre connexion internet <em>physiquement</em>. Les serveurs de votre fournisseur d'acc&egrave;s (DSLAM) fournissent une connexion internet par le biais de votre prise t&eacute;l&eacute;phonique. A la prise t&eacute;l&eacute;phonique, vous branchez ce qu'on appelle un &quot;routeur&quot; qui va se charger de &quot;router&quot; ou rediriger l'information re&ccedil;ue vers l'ordinateur qui l'a demand&eacute;e. Et oui, si vous avez plusieurs ordinateurs en m&ecirc;me temps sur internet, comment savoir qui a demand&eacute; quelle information ? Le routeur se charge de tout &ccedil;a, comme les feux tricolores r&egrave;glent la circulation dans un carrefour. Tout ceci est plus facilement compr&eacute;hensible gr&acirc;ce au sch&eacute;ma ci-dessous.</p>
<p align="center"><img alt="image" src="/public/posts/2005-01-05-airport-livebox/images/routeur.png" width="523" height="769" /> </p>
<p align="justify">Comment le routeur d&eacute;termine &agrave; quel ordinateur envoyer l'information ? C'est simple, il attribue &agrave; chaque ordinateur une adresse, appel&eacute;e adresse IP. Par exemple, le premier ordinateur aura l'adresse 192.168.1.1, le second 192.168.1.2, etc.</p>
<p align="justify">La Livebox est un routeur: elle redirige l'information aux ordinateurs branch&eacute;s &agrave; elle (liaison filiaire), et &agrave; ceux connect&eacute;s &agrave; son r&eacute;seau Wifi (sans fil).</p>
<p align="justify">L'allocation des IP aux ordinateurs du r&eacute;seau peut se faire de deux mani&egrave;res:<br />
        - Dans un r&eacute;seau statique chaque ordinateur s'attribue unilat&eacute;ralement une adresse (attention aux param&eacute;trages... il faut bien choisir les adresses, car vous devez les entrer manuellement dans la configuration de la connexion, que ce soit sous Windows, sous Linux ou sous OS X). L'avantage est que l'adresse d'un ordinateur pr&eacute;cis ne change jamais; l'inconv&eacute;nient est que c'est compliqu&eacute; &agrave; mettre en place, et tr&egrave;s rigide lors de l'ajout d'un nouvel ordinateur au r&eacute;seau. <br />
- Dans un r&eacute;seau dynamique, le routeur fait office de &quot;serveur DHCP&quot;, c'est-&agrave;-dire qu'il attribue une adresse libre &agrave; chaque nouvel ordinateur qui se connecte, au moment o&ugrave; il se connecte (cette adresse est attribu&eacute;e pour un certain temps, en g&eacute;n&eacute;ral quelques jours, on appelle donc cette attribution un &quot;bail DHCP&quot;). La LB est un serveur DHCP, et elle fonctionne <em>par d&eacute;faut</em> en tant que serveur DHCP. L'avantage est la souplesse (vous n'avez rien &agrave; faire, le routeur se charge de tout), l'inconv&eacute;nient est qu'un ordinateur d&eacute;termin&eacute; n'aura pas forc&eacute;ment la m&ecirc;me adresse IP &agrave; chaque fois qu'il se connecte. </p>
<p align="justify">La solution pour partager sa connexion entre une LB et une borne airport par liaison filiaire oblige &agrave; d&eacute;sactiver la fonction serveur DHCP de la LB, et &agrave; tout configurer manuellement (techniquement, car le serveur DHCP attribue automatiquement l'adresse 255.255.255.0 comme masque sous r&eacute;seau au lieu de 255.255.0.0 comme exig&eacute; par la LB). Le port forwarding fonctionne mieux quand les adresses sont attribu&eacute;es de mani&egrave;re fixe (donc sans DHCP), il est cependant possible de rediriger des ports tout en utilisant le serveur DHCP, c'est juste plus contraignant.</p>
<p align="justify">Sur le sch&eacute;ma ci-dessus, il est clair que c'est le routeur qui est branch&eacute; &agrave; la prise t&eacute;l&eacute;phonique. Pour ne pas compliquer les choses, j'ai suppos&eacute; que le routeur fait &eacute;galement office de <em>modem adsl</em> (c'est le cas de la Livebox, mais pas de la borne Airport). Ainsi, la LB se connecte &agrave; internet, Wanadoo lui donne une adresse IP, et elle donne une adresse IP totalement diff&eacute;rente aux ordinateurs connect&eacute;s &agrave; elle. C'est compr&eacute;hensible: dans la rue A, il y a le num&eacute;ro 1, le num&eacute;ro 2, etc. Dans la rue B, il y a le num&eacute;ro 1, le num&eacute;ro 2, etc. Ici, dans le r&eacute;seau A, il y a l'adresse 1, l'adresse 2, etc; et dans le r&eacute;seau B, l'adresse 1, l'adresse 2, etc. Internet est un r&eacute;seau, et vos ordinateurs et votre routeur en forment un autre. Les num&eacute;ros peuvent &ecirc;tre les m&ecirc;mes, mais le nom de la rue change. Mieux encore, le routeur est le ma&icirc;tre de deux (ou plus!) r&eacute;seaux diff&eacute;rents: celui des ordinateurs branch&eacute;s &agrave; lui par un fil, et celui des ordinateurs connect&eacute;s &agrave; lui par Wifi. On a donc ici 3 r&eacute;seaux diff&eacute;rents (vert, rose et bleu sur le sch&eacute;ma).</p>
<p align="justify">Tout cela, le routeur le g&egrave;re tr&egrave;s bien. Il sait qu'il doit envoyer l'information &agrave; l'ordinateur qui l'a demand&eacute;e. Mais si l'information n'a &eacute;t&eacute; demand&eacute;e par aucun ordinateur, mais qu'elle doit quand m&ecirc;me arriver &agrave; l'un d'entre eux, comment faire ? Le routeur ne peut pas r&eacute;soudre ce probl&egrave;me tout seul. C'est &agrave; ce moment qu'intervient le <em>port forwarding</em>. Le port forwarding consiste &agrave; indiquer au routeur &agrave; quel ordinateur il doit envoyer une information transitant par un certain port. Un port est une &quot;ouverture&quot;, d'un point de vue mat&eacute;riel le port USB (par exemple) est le trou dans la coque de votre ordinateur dans lequel vous pouvez placer une prise USB; et d'un point de vue logiciel les ordinateurs ont plusieurs milliers de ports g&eacute;r&eacute;s par le syst&egrave;me d'exploitation. Par exemple, les informations de cette page Web transitent par le port 80, les informations d'un serveur FTP par le port 21 par d&eacute;faut, celles d'un client P2P comme eMule par le port 4662 par d&eacute;faut, etc.<br />
NB: j'esp&egrave;re que vous comprenez cette explication, car ce n'est plus de la sch&eacute;matisation, l&agrave; c'est carr&eacute;ment de la vulgarisation: c'est en r&eacute;alit&eacute; beaucoup plus compliqu&eacute; que &ccedil;a. NB 2: Pour preuve que c'est de la vulgarisation: m&ecirc;me si vous avez un seul ordinateur, vous devez quand m&ecirc;me recourir au port forwarding. </p>
<p align="justify">Vous devez donc d&eacute;terminer vers quel ordinateur rediriger l'information transitant par un certain port. Exemple: vous voulez t&eacute;l&eacute;charger en toute ill&eacute;galit&eacute; (niark!) des MP3 gr&acirc;ce au client P2P eMule sur votre 2&egrave;me ordinateur. Cet ordinateur s'est vu attribuer l'adresse 192.168.0.2 par le routeur. eMule utilise le port 4662. Vous devez param&eacute;trer votre routeur en lui disant &quot;d&egrave;s qu'une information arrive &agrave; toi par le port 4662, redirige l&agrave; vers l'ordinateur 192.168.0.2&quot;.</p>
<p align="justify">Vous comprenez maintenant pourquoi l'utilisation des baux DHCP (qui sont d'ailleurs assez moches ;-) est assez incompatible avec le port forwarding. Aujourd'hui je dis au routeur de rediriger les informations transitant par le port 4662 &agrave; l'ordinateur ayant pour adresse 192.168.0.2, et demain quand l'adresse de cet ordinateur aura chang&eacute;, je devrai tout param&eacute;trer &agrave; nouveau. Il existe une solution simple &agrave; ce probl&egrave;me, mais malheureusement la LB ne la supporte pas encore (il s'agit, dans la configuration du filtrage des adresses MAC, de sp&eacute;cifier qu'&agrave; telle adresse MAC on attribue telle IP). Vous devrez donc modifier le port forwarding &agrave; chaque fois que votre adresse changera, ou alors configurer votre r&eacute;seau en IP fixes. Rassurez vous: une fois qu'on sait comment faire, le changement de la configuration prend 10 secondes montre en main.</p>
<p align="justify">Voil&agrave; comment faire.</p>
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
<tr>
<td>
<div align="justify">Rendez vous dans le logiciel d'administration de la LB (voir plus haut pour la proc&eacute;dure), et cliquez sur <span class="Code">Serveurs LAN</span> dans le menu. Une nouvelle page s'ouvre (voir capture d'&eacute;cran ci-contre, cliquer pour agrandir). Cliquez sur le bouton <span class="Code">Ajouter</span>, et ajoutez remplissez les champs avec les valeurs souhait&eacute;es. Validez et sauvegardez (LB Sagem). </div>
</td>
<td width="20%">
<div align="center"><a href="/public/posts/2005-01-05-airport-livebox/images/image_6.png"><img alt="image" src="/public/posts/2005-01-05-airport-livebox/thumbnails/image_6.png" width="55" height="52" border="0" /></a></div>
</td>
</tr>
</table>
<p><span class="Code">Nom</span>: le nom du service, j'ai pris l'exemple d'eMule, alors j'ai mis eMule. <br />
        <span class="Code">Activ&eacute;</span>: Oui <br />
        <span class="Code">Protocole</span>: TCP ou UDP. Dans la majorit&eacute; des cas TCP, parfois UDP, parfois les deux. Cela sera indiqu&eacute; dans la documentation du logiciel pour lequel vous voulez rediriger les ports, et si &ccedil;a ne l'est pas, &ccedil;a veut dire TCP. <br />
        <span class="Code">Du port ... au port</span>: Les ports &agrave; rediriger. Ils seront &eacute;galement indiqu&eacute;s dans la documentation. Si un seul port est &agrave; rediriger, entrez ce port dans les deux champs (comme sur la capture d'&eacute;cran pour eMule). <br />
        <span class="Code">Adresse IP locale</span>: l'adresse de l'ordinateur vers lequel vous voulez rediriger le traffic (l'adresse de l'ordinateur depuis lequel vous param&eacute;trez le port forwarding s'inscrit normalement automatiquement dans le champ, sinon reportez vous &agrave; la section infos du logiciel d'administration de la LB pour connaitre votre adresse). <br />
<span class="Code">Interface</span>: dans le cas d'un connexion Wifi, ppp0. </p>
<h3 align="justify"><em><br />
</em><a name="3B" id="3B"></a>Partager le r&eacute;seau entre la Livebox et la borne Airport</h3>
<p align="justify">L'utilitaire d'administration de la borne airport (que ce soit sous Windows ou sous OS X) permet de la configurer de mani&egrave;re &agrave; ce qu'elle se confonde avec le r&eacute;seau wifi de la LB. Ainsi, il vous suffira de vous connecter &agrave; la LB pour naviguer sur internet tout en &eacute;coutant de la musique avec AirTunes.</p>
<p align="justify">Voici la proc&eacute;dure pas &agrave; pas:</p>
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
<tr>
<td>
<div align="justify">1/ Rendez vous dans<span class="Code"> Applications/Utilitaires/Utilitaire Admin Airport</span>; ou sous Windows dans le menu d&eacute;marrer l'utilitaire d'administration Airport. Connectez vous ensuite par Wifi &agrave; votre borne Airport.</div>
</td>
<td width="20%">
<div align="center"><a href="/public/posts/2005-01-05-airport-livebox/images/image_7.png"><img alt="image" src="/public/posts/2005-01-05-airport-livebox/thumbnails/image_7.png" width="64" height="41" border="0" /></a></div>
</td>
</tr>
</table>
<p></p>
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
<tr>
<td>
<div align="justify">2/ Lancez cet utilitaire, la fen&ecirc;tre captur&eacute;e ci-contre appara&icirc;t. S&eacute;lectionnez la borne &agrave; param&eacute;trer et cliquez sur Configurer. </div>
</td>
<td width="20%">
<div align="center"><a href="/public/posts/2005-01-05-airport-livebox/images/image_8.png"><img alt="image" src="/public/posts/2005-01-05-airport-livebox/thumbnails/image_8.png" width="64" height="38" border="0" /></a></div>
</td>
</tr>
</table>
<p></p>
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
<tr>
<td>
<div align="justify">3/ Dans le premier volet de la fenetre de configuration de la borde airport,  s&eacute;lectionnez &quot;<span class="Code">Mode sans-fil: se joindre &agrave; un r&eacute;seau sans fil existant (client sans fil)</span>&quot; dans la rubrique &quot;<span class="Code">R&eacute;seau Airport</span>&quot;. Puis s&eacute;lectionnez le r&eacute;seau LB dans &quot;<span class="Code">R&eacute;seau sans fil</span>&quot; de la meme rubrique. Enfin, en cliquant sur &quot;<span class="Code">Options de s&eacute;curit&eacute;</span>&quot; entrez votre clef WEP ou WPA. </div>
</td>
<td width="20%">
<div align="center"><a href="/public/posts/2005-01-05-airport-livebox/images/image_9.png"><img alt="image" src="/public/posts/2005-01-05-airport-livebox/thumbnails/image_9.png" width="57" height="52" border="0" /></a></div>
</td>
</tr>
</table>
<p></p>
<table width="100%"  border="0" cellspacing="0" cellpadding="0">
<tr>
<td>
<div align="justify">4/ V&eacute;rifiez sous l'onglet Internet qu'il y a bien une adresse du client et une adresse du serveur dans la rubrique DHCP. Si vous avez construit un r&eacute;seau &agrave; IP fixes, entrez les donn&eacute;es voulues dans les champs. </div>
</td>
<td width="20%">
<div align="center"><a href="/public/posts/2005-01-05-airport-livebox/images/image_10.png"><img alt="image" src="/public/posts/2005-01-05-airport-livebox/thumbnails/image_10.png" width="57" height="52" border="0" /></a></div>
</td>
</tr>
</table>
<p>C'est tout !</p>
<p>Pour finir, voici &agrave; titre indicatif le sch&eacute;ma de la configuration de mon r&eacute;seau: </p>
<p align="center">
<img alt="image" src="/public/posts/2005-01-05-airport-livebox/images/wifi.png" width="523" height="769" />        </p>
<p>
&agrave; Paris le 05/01/2005</p>
