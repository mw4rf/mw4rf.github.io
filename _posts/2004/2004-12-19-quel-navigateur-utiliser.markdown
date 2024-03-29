---
layout: post
status: publish
published: true
title: Quel navigateur utiliser ?

  
  



wordpress_id: 12
wordpress_url: http://localhost/~guillaume/gfblog/wordpress/?p=12
date: '2004-12-19 22:30:00 +0100'
date_gmt: '2004-12-19 20:30:00 +0100'
categories:
- Informatique
tags:
- internet
- sécurité
- software
- web
- apple
permalink:  /2004/12/19/quel-navigateur-utiliser/
---
<p>Il existe des dizaines de navigateurs web. La plupart sont gratuits, certains sont payants, la plupart sont en anglais, certains sont en français. La plupart ont les fonctions essentielles, certains ne les ont pas, certains ont des fonctions supplémentaires, d'autres n'en n'ont pas. Certains sont disponibles sur plusieurs plateformes, d'autres non.<br /> Mais il est toujours très difficile de choisir un navigateur, alors je vous propose mon avis sur ce point, ainsi que quelques conseils pour mieux choisir.</p>
<h2>Les fonctions indispensables </h2>
<p>Certaines fonctions sont devenues des conditions <em>sine qua non</em> pour qu'un navigateur soit utilisable sur le web à notre époque. Au début de l'internet grand public, vers le milieu des années 1990, les fonctions basiques de tous les navigateurs étaient les suivantes: affichage en couleurs, affichage des images, gestion des signets ou favoris, historique. Vers la fin des années 90 sont apparues des fonctions supplémentaires comme la possibilité d'ajouter des plug-ins (Flash, Shockwave, Java et compagnie), et une robustesse accrue du moteur de rendu (IE, KHTML, Gecko, etc.) pour afficher les pages plus vite et mieux. En 2004, lors de la rédaction de la version originale de ce document, tout bon navigateur se devait, en plus de tout cela, de bloquer les pop-ups, de posséder un gestionnaire de téléchargements, d'être personnalisable de fond en comble (skins), de remplir automatiquement les formulaires, de retenir les mots de passe, d'avoir une sécurité accrue (Java, ActiveX, JS, Cookies), d'offrir la possibilité de charger les pages dans des onglets, et même selon certains de lire les flux RSS. La situation n'a pas changé en 2007, lors de la 3ème édition de cet article ; la présence de certaines fonctions (par exemple, la gestion de CSS2 et le passage de l'Acid Test) permettent néanmoins de déterminer quels seront les "grands" navigateurs des années à venir. Les tendances dégagées en 2007 se sont largement vérifiées jusqu'en 2010. La 4ème version de cet article, publiée en mars 2010, montre que le marché des navigateurs est dominée par la notion de "performances JavaScript", qui constitue le premier fondement de la plupart des comparatifs (et souvent, à tort). Une nouvelle tendance se dessine, dont Google Chrome est le premier représentant : la simplicité, la sobriété et la rapidité, par opposition à l'accumulation de fonctions.</p>
<h3>Bloquer les <em>pop-ups, les plugins, les scripts, la publicité</em></h3>
<p>Les <em>pop-ups</em> sont des petites fenêtres qui viennent se superposer à la fenêtre principale de votre navigateur et vous proposant de "cliquer ici pour acheter je-ne-sais-quoi". Plus que de la publicité, c'est de la véritable pollution. Il faut les bloquer, les empêcher de s'afficher. Tout bon navigateur doit donc: </p>
<ol>
<li>pouvoir bloquer les popups de manière générale ; </li>
<li>pouvoir afficher ponctuellement un pop-up si on lui demande expressément     ; </li>
<li>avoir une "liste-noire" (construite avec des expressions régulières) pour     bloquer toutes les images qui contiennent dans leur URL certains mots     comme, par exemple, "ad", "advertise", "publicite", etc.</li>
<li>permettre de désactiver l'affichage du contenu Flash (la plupart des     bandeaux de pu sont désormais réalisés en Flash : c'est une des     malheureuses nouveautés de l'année 2007, qui n'a pas été démentie en 2010,     mais qui commence à soulever certains réactions, suite à l'exclusion de     Flash dans l'iPhone et l'iPad d'Apple).</li>
<li>avoir une "liste-blanche" des sites autorisés à afficher des pop-ups. En     effet, si 99% des pop-ups sont de la publicité, certains sont néanmoins     utiles voire nécessaires à la consultation d'un site (par exemple, les     forums basés sur vBulletin ouvrent un pop-up pour l'adjonction d'un fichier     à un message).</li>
</ol>
<p>Il en va de même pour vilains "<em>pop-under</em>". Ceux-là surgissent en dessous de la fenêtre courante, et ne sont pas visibles à première vue. Leur but n'est pas d'être visible. La plupart du temps, ils servent à charger une adresse bénéfique au webmaster du site que vous visitez. Par exemple, certaines sociétés proposent d'insérer de la publicité sur les sites, et payent une somme forfaitaire à chaque clic d'un visiteur sur la publicité. Si le pop-under charge l'URL d'un tel site, c'est comme si le visiteur avait cliqué sur la publicité. Résultat: à chaque fois que quelqu'un visite le site, le webmaster gagne un peu d'argent, sans que le visiteur n'ait à cliquer sur une quelconque bannière. C'est malhonnête et nuisible.</p>
<p>En 2007, les "pop-under" et les "pop-ups" classiques ont presque totalement disparu. En effet, de nombreux navigateurs (dont InternetExplorer) se sont dotés de filtres anti-pop-ups. La plupart de ces filtres fonctionnent en analysant la taille de la fenêtre ouverte: si elle correspond aux tailles référencées comme étant courantes pour les pop-ups, alors il s'agit d'un pop-up. C'est pourquoi les rares pop-ups qui subsistent encore ouvrent des fenêtre complètes, en plein écran. Il est possible de paramétrer la plupart des navigateurs modernes pour que toute demande d'ouverture d'une nouvelle fenêtre débouche en réalité sur l'ouverture d'un nouvel onglet. Mais cela ne règle pas le problème pour autant: rien ne remplace une véritable protection. <s>Un bon exemple de site totalement pourri par les publicités de ce type est <a href="http://www.ratiatum.com/">Ratiatum</a> (qui se permet d'ouvrir des fenêtres entières en pop-under lorsqu'on clique sur un lien)</s>. [Ratiatum a été remplacé par <a href="http://www.numerama.com/index.php">Numerama</a>, qui est désormais relativement "propre".] Firefox avec l'add-on AdBlock permet d'éviter ce genre de désagréments. </p>
<p>Plus vicieux encore : la publicité en <em>surface</em> de la page. Elle a vraiment explosé quand Internet Explorer (avec Windows XP SP 2) s'est doté d'un filtre anti-pop-ups: ce navigateur étant utilisé par plus de 70% des internautes (~90% en 2004 ; ~70% en 2007 ; ~50% en 2010), il fallait bien trouver une alternative ! Vous connaissez les bannières verticales qui se placent souvent sur le côté gauche ou droit d'une page (comme les Google Ads), les bannières horizontales qui se placent en haut ou en bas d'une page, les blocs de publicité qui se placent au milieu de la page. C'est pénible car cela ralentit le chargement de la page, et ce pour deux raisons: 1) ce sont souvent des images, beaucoup plus longues à charger que du texte, 2) ces images sont souvent hébergées sur les serveurs de la régie de pub, beaucoup plus sollicités que le serveur du site que vous visitez, et donc beaucoup plus lents. Mais bref, passons. </p>
<p>La publicité en surface de page est bien pire que cela: il s'agit d'une publicité qui recouvre la page, vous empêchant de voir le contenu. Au bout d'un certain temps, ou après le clic de l'utilisateur sur la publicité, celle ci est effacée et le contenu devient accessible. Ces systèmes sont mis en oeuvre grâce à la technologie DHTML mêlant JavaScript et HTML. A l'heure actuelle, la plupart des naviagteurs sont incapables de les bloquer par eux-mêmes (i.e. sans add-on), car contrairement aux pop-up et pop-under, elles ne sont pas chargées dans des fenêtres externes à la fenêtre principales, et le navigateur ne sait pas distinguer le contenu "propre" du contenu publiciaire. Il faudra donc recourir à des add-on ou plugins (des petits logiciels qui sont des greffons au navigateur) qui permettent de bloquer l'affichage des tout le contenu provenant de certaines adresses (AdBlock, l'add-on pour Firefox, fait un travail formidable !). Par exemple, je paramètre mon add-on pour n'afficher aucune contenu dès lors que son adresse contient le mot "pub" en écrivant la règle "*pub*". Ces règles sont souvent basées sur le puissant système logique d'expressions régulières "<a href="http://www.linux-france.org/prj/jargonf/R/regex.html">Regex</a>". Disons le tout de suite, tous les navigateurs n'ont pas d'add-on disponible pour bloquer le contenu nuisible. Pour Firefox, vous pouvez utiliser <a href="https://addons.mozilla.org/fr/firefox/addon/1865">AdBlock Plus</a> (conseillé), qui filtre les publicités en fonction d'une liste de mots clés régulièrement mise à jour. <a href="https://chrome.google.com/extensions/detail/gighmmpiobklfepjocnamgkkbiglidom?hl=fr">Adblock</a> existe aussi pour Google Chrome, mais il est un peu moins efficace que dans sa versio Firefox. Pour Camino, vous pouvez utiliser <a href="http://www.nadamac.de/camitools/camiblock.html">CamiBlock</a>. Pour Safari, vous pouvez utiliser <a href="http://haoli.dnsalias.com/Saft/">Saft</a> (payant) ou <a href="http://culater.net/software/PithHelmet/PithHelmet.php">PithHelmet</a> (payant), ou ce que vous trouverez sur l'excellent site <a href="http://pimpmysafari.com/">PimpMySafari</a>. A noter que si AdBlock pour Firefox fait un excellent travail, les plug-ins pour Safari sont beaucoup plus agressifs et empêcheront certains sites de fonctionner. C'est notamment le cas du site <a href="http://www.allocine.fr/">AlloCiné</a> qui a la très mauvaise (et intolérable) habitude d'afficher une page publicitaire avant d'afficher la page que l'internaute demande, lorsque celui-ci vient d'un site extérieur et désire consulter la fiche d'un film. Opera ne gère que difficilement les add-ons (il existe toutefois un <a href="http://my.opera.com/Lex1/blog/adblock-for-opera-analogue-of-adblock-plus-element-hiding-helper">équivalent à AdBlock pour Opera</a>), mais il contient par défaut un module de blocage des publicités non configuré (ce qui signifie que vous devrez ajouter manuellement les adresses à bloquer). OmniWeb ne gère pas les add-ons, mais il contient, comme Opera, un module de blocage non configuré. Enfin, pour ceux qui utiliseraient encore Internet Explorer, <a href="http://adblockie.codeplex.com/">AdblockIE</a> reprend les fonction de AdBlock et NoScript pour Firefox.</p>
<p>A partir de ce données, il est possible d'établir un classement des navigateurs populaires en fonction de leur efficacité dans le blocage des pop-ups et, plus généralement, des contenus publicitaires (du plus au moins efficace) :</p>
<ol>
<li><strong>Firefox/Netscape + AdBlock</strong> : la meilleure protection,     qui bloque 99% des pubs sans ne jamais (ou presque) nuire à l'utilisation     du site visité. En plus, AdBlock a la très bonne habitude de compacter     l'espace pris par la pub là où les autres navigateurs affichent un cadre     blanc à la place. Avec Firefox, c'est comme si la pub n'avais jamais existé     !</li>
<li><strong>Google Chrome + AdBlock</strong> : la meilleure protection, quoi     que légèrement inférieure à celle fournir par AdBlock pour Firefox. L'addon     AdBlock pour Chrome devrait cependant évoluer et rattraper rapidement son     "grand frère" développé pour Firefox.</li>
<li><strong>Omniweb</strong> : la force d'Omniweb est double : le système de     protection est intégré dans le logiciel (pas d'add-on supplémentaire     requis) et il est possible d'un seul clic d'afficher le contenu bloqué.     Cependant, il y a un revers à la médaille : d'une part, si la pub     disparaît, un cadre blanc apparaît à la place, indiquant tout de même qu'à     cet endroit se trouvait une bannière de pub ; d'autre part, la liste des     sites bloqués est vide à l'origine, et il faudra la remplir soi-même à la     main.</li>
<li><strong>Opera</strong> : comme pour Omniweb, le blocage est directement     géré par le navigateur. Opera adopte cependant une approche "tout-ou-rien",     qui ne permet pas de sélectionner manuellement, après chargement d'une     page, le contenu à débloquer.</li>
<li><strong>Safari + Saft</strong> : bloquage efficace, parfois un peu trop :     certaines règles (à entrer manuellement dans Saft) peuvent avoir pour effet     de nuire à la navigabilité du site visité.</li>
<li><strong>Camino + CamiBlock</strong> : idem.</li>
<li><strong>IE</strong> : le système est trop basique. Il bloque les pop-ups,     mais n'est pas efficace contre la publicité de surface   (<em>inline</em>).</li>
<li>Les autres</li>
</ol>
<p>Il existe une autre manière de bloquer la publicité de surface : charger une feuille de style (CSS) spéciale. Camino propose une excellente feuille de style, régulièrement mise à jour, qui permet de bloquer la plupart des pub connues. Cette même feuille de style peut être utilisée avec n'importe quel autre navigateur qui le permet (notamment Firefox, Safari, Omniweb), quelle que soit le système d'exploitation utilisé (bref, cela fonctionne aussi sous Windows et Linux). Il existe également des feuilles de style créées spécifiquement pour Opera : par exemple, <a href="http://www.fanboy.co.nz/adblock/opera/">celle de fanboy</a>.</p>
<p>Voici quelques feuilles de style permettant de bloquer les publicités (vous pourrez en trouver de nombreuses autres par une recherche avec Google) :</p>
<table border="1">
<tbody>
<tr>
<td></td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">Firerox         et dérivés (Gecko)       </td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">Safari,         Chrome et dérivés (Webkit)       </td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">Opera</td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">Internet         Explorer et dérivés       </td>
</tr>
<tr>
<td><a href="http://adsweep.org/">AdSweep</a></td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">X</td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">X</td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">X</td>
<td style="text-align:center;margin-left:auto;margin-right:auto;"></td>
</tr>
<tr>
<td><a href="http://userstyles.org/styles/299">Ad Blocking FiltersetP</a></td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">X</td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">X</td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">X</td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">X</td>
</tr>
<tr>
<td><a href="http://www.technobeta.com/download/urlfilter.ini">URLFilter</a></td>
<td style="text-align:center;margin-left:auto;margin-right:auto;"></td>
<td style="text-align:center;margin-left:auto;margin-right:auto;"></td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">X</td>
<td style="text-align:center;margin-left:auto;margin-right:auto;"></td>
</tr>
<tr>
<td><a href="http://pgl.yoyo.org/as/serverlist.php?hostformat=operafilter&amp;showintro=0&amp;mimetype=plaintext">Yoyo</a></td>
<td style="text-align:center;margin-left:auto;margin-right:auto;"></td>
<td style="text-align:center;margin-left:auto;margin-right:auto;"></td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">X</td>
<td style="text-align:center;margin-left:auto;margin-right:auto;"></td>
</tr>
<tr>
<td><a href="http://my.opera.com/Ghostshaw/blog/2007/10/19/partial-rewrite">filterset.g.js</a></td>
<td style="text-align:center;margin-left:auto;margin-right:auto;"></td>
<td style="text-align:center;margin-left:auto;margin-right:auto;"></td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">X</td>
<td style="text-align:center;margin-left:auto;margin-right:auto;"></td>
</tr>
<tr>
<td><a href="http://www.floppymoose.com/">userContent.css</a></td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">X</td>
<td style="text-align:center;margin-left:auto;margin-right:auto;">X</td>
<td style="text-align:center;margin-left:auto;margin-right:auto;"></td>
<td style="text-align:center;margin-left:auto;margin-right:auto;"></td>
</tr>
</tbody>
</table>
<p>Il existe également des fonctions ou des extensions permettant de <strong>bloquer spécifiquement le contenu Flash</strong> : <a href="http://my.opera.com/Lex1/blog/flashblock-for-opera-9">FlashBlock pour Opera</a> (ou directement dans le navigateur) ; <a href="https://addons.mozilla.org/fr/firefox/addon/433">Flashblock</a> et <a href="https://addons.mozilla.org/fr/firefox/addon/722">NoScript</a> (must-have) pour Firefox (voir, à ce propos, l'article "<a href="http://www.valhalla.fr/2010/03/04/informatique-personnelle-et-securite/#3252">Informatique personnelle et sécurité</a>" sur ce site) ; <a href="https://chrome.google.com/extensions/detail/gofhjkjmkpinhpoiabjplobcaignabnl">Flashblock</a> pour Chrome.</p>
<p>Pour résumer, on distinguera 4 types de "blocages" :</p>
<ul>
<li>le blocage des fenêtres (ouverture intempestive d'onglet, de pop-up et de     pop-under)</li>
<li>le blocage des plugins (Flash et Java, principalement)</li>
<li>le blocage des scripts (JavaScript, principalement)</li>
<li>le blocage de la publicité</li>
</ul>
<p>Pour les différents navigateurs considéré ici, il en ressort le tableau suivant :</p>
<table border="1">
<caption></caption>
<col />
<col />
<col />
<col />
<col />
<tbody>
<tr>
<td></td>
<td>Blocage des fenêtres</td>
<td>Blocage des plugins</td>
<td>Blocage des scripts</td>
<td>Blocage de la publicité</td>
</tr>
<tr>
<td>Firefox (et dérivés)</td>
<td>Oui : natif</td>
<td>Oui : natif (*)
<p>Oui : extension</p>
</td>
<td>Oui : natif (*)
<p>Oui : extension</p>
</td>
<td>Oui : extension</td>
</tr>
<tr>
<td>Safari</td>
<td>Oui : natif</td>
<td>Oui : extension</td>
<td></td>
<td>Oui : extension</td>
</tr>
<tr>
<td>Chrome (et dérivés)</td>
<td>Oui : natif</td>
<td>Oui : extension</td>
<td></td>
<td>Oui : extension</td>
</tr>
<tr>
<td>Opera</td>
<td>Oui : natif</td>
<td>Oui : natif (**)
<p>Oui : extension</p>
</td>
<td>Oui : natif (**)
<p>Oui : extension</p>
</td>
<td>Oui : natif (***)
<p>Oui : extension</p>
</td>
</tr>
<tr>
<td>Internet Explorer</td>
<td>Oui : natif</td>
<td></td>
<td>Oui : extension</td>
<td>Oui : extension</td>
</tr>
</tbody>
</table>
<p>(*) blocage natif "tout ou rien" : le réglage est à opérer dans les préférences du navigateur, sans qu'il soit nécessaire d'installer de logiciel tiers, et <em>il agit alors sur toutes les pages chargées</em>, jusqu'à ce qu'il soit désactivé.</p>
<p>(**) blocage natif "page par page" : le réglage est à opérer dans les préférences du navigateur, sans qu'il soit nécessaire d'installer de logiciel tiers, et <em>il peut être activé ou désactivé ponctuellement, pour une page donnée</em>.</p>
<p>(***) blocage natif sélectif : : le réglage est à opérer dans les préférences du navigateur, sans qu'il soit nécessaire d'installer de logiciel tiers, et <em>il peut être activé ou désactivé ponctuellement, pour chaque élément à l'intérieur d'une page</em>.</p>
<p>Les extensions utilisent très majoritairement un blocage sélectif (possibilité de l'activer ou de le désactiver pour certains éléments seulement, à l'intérieur d'une page).</p>
<blockquote><p><strong>Conclusion 2010</strong></p>
<p>On constate, en 2010, que les deux meilleurs navigateurs, concernant le   blocage des éléments susceptibles de perturber la navigation, tels que les   plugins, les scripts et le publicités, sont <strong>1) Firefox ; 2)   Opera</strong>. Firefox est --de loin-- le plus efficace, grâce à ses   extensions AdBlock, FlashBlock et NoScript. Opera est très complet, gère tous   ces systèmes de protection nativement (sans qu'il soit nécessaire d'installer   de logiciel tiers), mais son paramétrage est plus complexe et le blocage est   souvent moins efficace (puisque défini "manuellement"). Il ne fait pas de   doute que <strong>3) Google Chrome</strong> rattrapera rapidement son retard   sur Firefox : les extensions "classiques" existent déjà (AdBlock,   Flashblock), il reste maintenant à les rendre aussi efficaces que leur   homologues pour Firefox.</p>
</blockquote>
<p><em><strong>Remarque complémentaire : les logiciels tiers de blocage à la source</strong></em></p>
<p>Pour aller plus loin dans le blocage, il est possible d'utiliser d'autres logiciels, comme un serveur proxy (e.g. <a href="http://www.privoxy.org/">Privoxy</a>) ou un client de filtrage des IP comme <a href="http://phoenixlabs.org/pg2/">PeerGuardian</a>. Ces logiciels sont totalement indépendants du navigateur (c'est pourquoi nous ne nous étendrons pas sur ce sujet ici), et bloquent le contenu avant qu'il atteigne l'ordinateur. Cela a plusieurs conséquences, notamment : 1) ils fonctionnent indépendamment du navigateur (et de la même manière, quel que soit le navigateur utilisé) ; 2) ils réduisent le poids des pages (et accélèrent donc la navigation avec les connexions à faible débit) ; 3) ils engendrent un filtrage drastique et non sélectif (qui peut empêcher certains sites de fonctionner).</p>
<p><em><strong>Remarque complémentaire : l'effet du blocage sur l'économie des sites visités</strong></em></p>
<p>Un mot doit être dit sur l'effet qu'a le blocage des publicités sur les sites visités. Comme le fait justement remarquer <a href="http://arstechnica.com/business/news/2010/03/why-ad-blocking-is-devastating-to-the-sites-you-love.ars">ArsTechnica</a>, la publicité ne se vend pas sur le Web comme elle se vend sur d'autres médias, comme les journaux papier, la radio ou la télévision. Sur ces médias traditionnels, du "monde réel", la publicité est vendue à un prix calculé en fonction d'une estimation de l'audience. Dans le "monde virtuel", au contraire, la publicité est vendue "à l'unité", selon le nombre d'affichages ou de clics. Ainsi, bloquer la publicité peut nuire à certains sites pour lesquels elle constitue le seul moyen de financement. Il est donc conseillé : 1) de ne bloquer que les publicités les plus intrusives ; 2) de ne pas bloquer les publicités non-intrusives sur les sites que l'on visite régulièrement ; 3) de privilégier, le cas échéant et pour ces sites, un moyen de blocage qui n'empêche pas le téléchargement du contenu publicitaire depuis le serveur, mais qui se contente d'en empêcher l'affichage à l'écran.</p>
<h3>Posséder un gestionnaire de téléchargements</h3>
<p>Vous êtes en train de télécharger une mise à jour du logiciel que vous utilisez pour le travail, car la version que vous possédez actuellement ne permet pas de visualiser ce fichier qu'on vous a envoyé par e-mail et que vous devez modifier pour demain 8H. Il est 23H, le fichier fait 50 MO, vous êtes connecté avec un modem 56K parceque l'adsl à la maison est une fois de plus en rade. Le téléchargement est à 99%. Et là, le drame. La porteuse lâche, vous êtes déconnecté. Vous vous reconnectez pour essayer de récupérer le pauvre petit pourcent restant, mais rien n'y fait, Monsieur Internet Explorer s'obstine à recommencer le téléchargement depuis le début. Pourtant, on vous l'avait dit: il faut installer un gestionnaire de téléchargement comme <a href="http://www.getright.com/">GetRight</a> qui permet de reprendre-le-téléchargement-là-où-il-s'est-arrêté ("resume download").</p>
<p>En 2004, tous les navigateurs dignes de ce nom intègrent en eux un gestionnaire de téléchargement qui, en plus de garder la liste de tous les téléchargements finis/en cours/interrompus, permettent de reprendre un téléchargement là où on l'a laissé.</p>
<p>En 2010, la situation a évolué, et il est de nouveau nécessaire, dans certaines circonstances, de recourir à un logiciel tiers. En effet, les sites de "téléchargement direct", tels que <a href="http://rapidshare.com/">RapidShare</a> ou <a href="http://www.megaupload.com/">Megaupload</a>, se multiplient, et tendent à remplacer les moyens d'échange de fichiers par Peer-to-peer (P2P). Or, contrairement aux P2P traditionnel, qui repose sur des logiciels permettant la reprise des téléchargement interrompus (par exemple, aMule ou, pour le protocole Bittorrent, Azureus, Transmission ou uTorrent), le téléchargement direct passe par le naviagteur web. Dans ce contexte, l'utilisation d'un logiciel "gestionnaire de téléchargements", indépendant du navigateur, présente plusieurs avantages : 1) sauvegarder les téléchargements d'un plantage du navigateur ; 2) soulager le naviagteur, qui n'aura pas à gérer des téléchargements multiples en plus de l'affichage des pages Web ; 3) télécharger simultanément plus de fichiers ; 4) télécharger plus vite (certains logiciels permettent d'accélérer la vitesse de téléchargement d'un fichier en ouvrant plusieurs connexions vers le serveur, là où le navigateur n'en ouvre qu'une).</p>
<p>Voici quelques logiciel de gestion des téléchargements :</p>
<ul>
<li>Pour Windows : <a href="http://www.speedbit.com/">Download Accelerator     Plus</a> (payant) ; <a href=""http://www.internetdownloadmanager.com">Internet Download Manager</a>     (payant) ; <a href="http://getright.com/">GetRight!</a> (payant) ; <a href=""http://www.freedownloadmanager.org/">Free Download Manager</a>     (gratuit) ; <a href="http://www.flashget.com/index_en.htm">FlashGet</a>     (gratuit)</li>
<li>Pour Mac : <a href="http://www.yazsoft.com/">SpeedDownload</a> (payant) ;     <a href="http://www.igetter.net/">iGetter</a> (payant) ; <a href=""http://fr.wikipedia.org/wiki/Wget">wget</a> (gratuit)</li>
<li>Pour Linux : <a href="http://fr.wikipedia.org/wiki/Wget">wget</a> ; <a href=""http://www.kde.org/">Kget</a> (pour KDE) ; <a href=""http://aria2.sourceforge.net/">Aria</a> ; <a href=""http://www.halogenware.com/software/retriever.html">Retreiver     Download Manager</a> ; <a href=""http://qdown.sourceforge.net/">QuickDownloader</a></li>
</ul>
<p>La plupart de ces logiciels s'intègrent aux navigateurs, afin d'intercepter les clics sur des liens qui pointent vers des fichiers téléchargeables. Toutefois, le niveau d'intégration varie d'un logiciel à l'autre, d'un navigateur à l'autre, et d'un système d'exploitation à l'autre. De manière générale, Firefox reste le navigateur qui dialogue le mieux avec ces logiciels d'assistance au téléchargement, notamment grâce à l'extension <a href="http://flashgot.net/features">FlashGot</a>.</p>
<h3>Etre personnalisable</h3>
<p>C'est quand même plus sympa de pouvoir appliquer des "skins" ("peaux": le logiciel change de peau, il fait peau neuve) à son navigateur. On change ainsi la taille et la couleur de l'interface. On peut même changer les boutons: en enlever et en retirer. Bref, on adapte son navigateurs à ses goûts. Ce n'est pas indispensable du tout, mais un vieux navigateur tout moche ne tient pas la route face à la toute dernière version du navigatuer "machinchouette" pour laquelle sont disponibles sur internet en téléchargement gratuit, des milliers skins différentes. Firefox et Opera disposent de nombreux skins. Ceux de Firefox sont beaucoup plus efficaces. Safari ne dispose pas de différents skins, <s>mais il est toujours possible de modifier son interface avec ShapeShifter</s> [ShapeShifter ne fonctionne plus à partir de Leopard]. </p>
<p>Cependant, la personnalisation ne se résume pas aux skins. Il s'agit aussi de pouvoir déplacer les éléments à l'écran: par exemple, mettre la barre de signets en dessous de la barre d'adresse. Firefox le permet très bien, Opera un peu, tandis que IE et Safari restent totalement réfractaires à ce genre de personnalisations.</p>
<p>On peut également aborder dans la notion de "personnalisation" le fait pour un navigateur d'admettre des plug-ins ou des add-ons, à l'instar de ceux cités ci-dessus pour bloquer les publicités dans Firefox et Safari. Dans ce domaine, il y a deux types de navigateurs: ceux qui admettent de tels plug-ins et ceux qui ne les admettent pas. Parmi ceux qui les admettent, Firefox est en tête. Il existe des milliers d'extentions pour Firefox et certains sont très pratiques. Google Chrome est juste derrière : il y a moins d'extensions pour Chrome que pour Firefox, mais le système d'extensions de Chrome est "ouvert" et permet de nombreuses possibilités. Safari et IE admettent également les extensions, mais de manière moins naturelle et plus limitée : leurs systèmes sont beaucoup plus "fermés". Opera admet les extensions, et son système se situe à mi-chemin entre les systèmes fermés de IE et Safari et les systèmes ouverts de Firefox et Chrome. </p>
<p>On distingue généralement 3 niveaux de personnalisation de l'apparence graphique : 1) la modification de la disposition des boutons (de la barre d'outils) ; 2) la modification des couleurs de la fenêtre ; 3) la modification totale de l'interface : couleur, forme, et disposition des éléments. Voici un tableau résumant les capacités de personnalisation des navigateurs, selon ces trois niveaux :</p>
<table border="1" style="width: 100%">
<caption></caption>
<col />
<col />
<col />
<col />
<tbody>
<tr>
<td></td>
<td>Niveau 1 (barre d'outils)</td>
<td>Niveau 2 (couleurs)</td>
<td>Niveau 3 (personnalisation complète)</td>
</tr>
<tr>
<td>Firefox</td>
<td>Oui : natif</td>
<td>
<p>Oui : natif (*)</p>
</td>
<td>Oui : extensions</td>
</tr>
<tr>
<td>Opera</td>
<td>Oui : natif</td>
<td>Oui : thèmes</td>
<td>Oui : natif + extensions</td>
</tr>
<tr>
<td>Internet Explorer</td>
<td>Oui : natif</td>
<td></td>
<td></td>
</tr>
<tr>
<td>Safari</td>
<td>Oui : natif</td>
<td></td>
<td></td>
</tr>
</tr>
<tr>
<td>Google Chrome</td>
<td>Oui : natif</td>
<td>Oui : natif</td>
<td></td>
</tr>
</tbody>
</table>
<p>(*) En natif (intégré au navigateur) depuis la version 3.6 (2010) ; par l'extension "Personal" pour les versions 3.5 et antérieures.</p>
<blockquote><p><strong>Conclusion 2010</strong></p>
<p>Le navigateur le plus "personnalisable" est <strong>Firefox</strong>,   grâce à ses extensions qui permettent de changer le moindre paramètre du   navigateur. <strong>Opera</strong> n'est pas loin derrière, grâce à ses   nombreux "thèmes" graphiques, développés par les utilisateurs, et à ses   fonctions natives de personnalisation qui sont les plus avancées du marché.   Google chrome est encore en deçà, mais il ne cesse de progresser. Quand à   Safari et IE, ils ne sont tout simplement pas "personnalisables", au sens   moderne (21ème siècle...) du terme.</p>
</blockquote>
<h3>Remplir automatiquement les formulaires</h3>
<p>Si je me souviens bien, c'est IE qui a inventé ça ! Oui... IE était, à l'origine, un bon navigateur. IE mémorisait ce que l'utilisateur tapait dans un champ, comme par exemple le champ de recherche de Yahoo. Quand on cliquait 2 fois sur ce champ, un petit menu déroulant s'affichait avec la liste de tous les autres mots entrés dans le champ par le passé. Ce n'était pas une mauvaise idée, la preuve: les navigateurs modernes ont rebondi dessus pour offrir une fonction appelée "<em>auto-completion</em>": ils complètent automatiquement tous les champs d'un formulaire. Bien sûr IE ne faisait pas cela. Donc, la première fois que vous entrez votre nom de famille dans un champ identifié dans le code source de la page par "LASTNAME", le navigateur sauvegarde la valeur que vous avez entrée (ex: "Dupont"). La prochaine fois qu'il rencontrera un champ appelé LASTNAME, il mettra automatiquement Dupont. De même pour votre prénom, adresse avec ville, pays et code postal, votre numéro de téléphone ou votre numéro de carte de crédit ! Et oui, c'est le problème de ce genre de systèmes, si c'est mal implémenté, ça retient tout ! Alors faites bien attention que des informations sensibles ne soient pas sauvegardées (ce qui est possible en paramétrant bien son navigateur, voire en utilisant des utilitaires tiers comme Norton).</p>
<p>Les navigateurs les plus modernes, comme Google Chrome ou Opera, permettent de définir à l'avance les données à remplir, dans les formulaires.</p>
<h3>Retenir les mots de passe</h3>
<p>Le principe est le même que pour le remplissage automatique des formulaires: vous arrivez sur un site, et le navigateur se rappelle de votre nom d'utilisateur et de votre mot de passe pour ce site. La plupart des navigateurs modernes vous demandent votre avis à chaque fois qu'un nouveau mot de passe est saisi et, si vous acceptez, chiffrent et enregistrent le mot de passe. La différence se fait plutôt au moment de renseigner les champs d'identification d'un site pour lequel vous possédez plusieurs identités. Safari et IE gèrent difficilement les identités multiples, tandisque Firefox, Chrome et Opera les prennent en compte sans problème.</p>
<p>A noter la gestion des mots de passe par les logiciels natifs Mac OS X utilisant Cocoa: Safari, Camino, OmniWeb (et Chrome, dans une certaine mesure). Tous les mots de passe sont stockés dans le "Trousseau" du système ("Keychains"). Le trousseau peut être automatiquement sauvegardé sur l'iDisk (espace de stockage WebDAV intégré à Mac OS X). De cette manière, si vous formatez et réinstallez le système, toutes les préférences de ces logiciels (entre autres, les mots de passe utilisés sur les différents sites) seront restaurés. C'est très pratique ! </p>
<p>A noter également qu'il existe des logiciels permettant de retenir tous les mots de passe et de les partager entre les navigateurs. Le meilleur (le premier...) est <a href="http://agilewebsolutions.com/products/1Password">1password</a> pour Mac OS X : il fonctionne avec Safari, Camino, Firefox, Omniweb et d'autres bien d'autres (mais toujours pas Opera --qui possède son propre gestionnaire avancé-- et Chrome, malheureusement). Il existe des équivalents à 1Password pour Windows (<a href="http://www.siber.com/consumer/roboform">Roboform</a> ; Norton360, dans une certaine mesure) et Linux (<a href="http://www.keepassx.org/">KeePassX</a>).</p>
<h3>Avoir une sécurité accrue</h3>
<p>Je ne vais pas m'étendre sur ce point car c'est vraiment très technique. Ce que vous devez savoir c'est que ne sont <em>généralement</em> pas dangereux: Java, Flash, les cookies ; et sont dangereux: les activeX et autres scripts sur le type macro (JS, VBS, etc). Sont également dangereux les fichier qui s'exécutent après téléchargement (sous Windows). </p>
<p>Le raisonnement des personnes mal intentionnées est simple: quel est l'OS le plus utilisé ? Windows. Quel est le navigateur le plus utilisé ? IE. Quel public dois-je viser pour mon nouveau virus ? Les gens utilisant IE sous Windows. Ce n'est pas compliqué à comprendre, et c'est pour cela que 99,9% des virus sont destinés à Windows et IE (et par extension, Outlook). Avez-vous entendu parler des virus ILoveYou, MyDoom, Buster et compagnie ? Les utilisateurs de Mac ou de Linux n'en ont pas entendu parler, eux. Conclusion: vous avez Windows (<em>errare humanum est</em>) et vous ne voulez/pouvez pas changer (<em>perseverare diabolicum!!!</em>), alors sécurisez quand même un minimum votre poste en changeant de navigateur et de client e-mail.</p>
<p>Le navigateur actuellement le plus sûr est Firefox, grâce notamment aux extensions AdBlock, FlashBlock et surtout NoScript. <strong>Pour plus de précisions, consulter l'article "<a href="http://www.valhalla.fr/2010/03/04/informatique-personnelle-et-securite/">Informatique personnelle et sécurité</a>".</strong></p>
<h3>Navigation par onglets</h3>
<p>La navigation par onglets, c'est magnifique! A la base, IE et NS2 <em>(le bon vieux Netscape, vraiment c'était la classe, on en fait plus des comme ça!)</em> chargeaient une page dans une fenêtre, et une autre page dans une autre fenêtre. Problème: vos 8 pages chargées en même temps sont dans 8 fenêtres différentes qui se superposent et vous obligent à tout réduire (le bouton _ et haut à droite de la fenêtre sous Windows) pour les afficher une par une. Avec la navigation par onglets, une seule fenêtre et, entre le contenu de la page et la barre d'outils (avec tous les boutons), des onglets, à la manière d'un classeur. On clique sur un onglet pour faire apparaître la page correspondante. C'est génial, et vite indispensable. C'est vraiment la fonction par excellence que "quand on l'essaie une fois, on ne peut plus s'en passer". </p>
<p><s>Tous les bons navigateurs modernes ont cette fonction, sauf (devinez qui?) IE</s>. <em>Il existe désormais (2007) une nouvelle version d'Internet Explorer, la version 7. Cette nouvelle version utilise les onglets</em>. <em>C'est pas trop tôt !</em></p>
<p>Les onglets c'est bien. Mais c'est un concept un peu vieux pour ne pas être assorti de plein de petites améliorations. Ainsi, les bon navigateurs (Firefox, Safari avec add-on, Omniweb, Opera, Chrome) gardent une trace des onglets ouverts et peuvent les ré-afficher en cas de plantage. Ils peuvent également, pour certains, ré-afficher le dernier onglet fermé (pratique en cas de fermeture accidentelle). Enfin, il doit être possible de déplacer les onglets, ce que permettent Firefox, Omniweb, Safari 3 (pour Leopard) ou Safari 2 (avec Saft, par exemple), Opera et Chrome.</p>
<p>Dans certains navigateurs (OmniWeb, Shiira et Safari avec plug-in, Opera), des <em>vignettes</em> remplacent les onglets. Il s'agit de miniatures des fenêtres ouvertes qui ont l'avantage sur les onglets qu'elles permettent d'afficher un aperçu du contenu des pages chargées. C'est très pratique, mais il vaut mieux avoir un grand écran, au risque que les vignettent prennent trop de place et nuisent à la navigabilité des sites (obligation de faire défiler la page horizontalement). La fonction a été inventée par Omniweb et reprise nativement par Opera, quelques années plus tard.</p>
<p>Google Chrome se distingue, d'un point de vue technique, en créant un processus distinct pour chaque onglet. Grâce à cette technique, le contenu d'une page malicieuse ou défectueuse ne cause pas le "plantage" du navigateur dans son ensemble, mais uniquement de l'onglet qui la contient.</p>
<h3>Lire les flux RSS</h3>
<p>Avec le développement des blogs et autres systèmes de news n'utilisant pas Usenet (news.machin.org) est apparu un nouveau système: le "feed RSS". Cela fonctionne ainsi: vous rapatriez sur votre ordinateur les titres des messages qui se placent dans votre barre de signets, vous cliquez sur un titre pour charger la page et afficher le contenu du message. Un peu comme les e-mails en fait. C'est particulièrement pratique quand on affiche ça sur le bureau (avec un Wigdget Konfabulator ou avec le Dashboard de Tiger sous OSX) pour être tenu au courant en direct des nouveautés et de l'actualité; mais sur un navigateur, à mon avis, ça n'a aucun intérêt puisque de toute manière un navigateur est fait pour naviguer (si, si) et donc aller visiter le site qui fournit les news ! A vous de juger. Tous les navigateurs modernes prennent en charge les flux RSS.</p>
<h3>Protection contre le Phishing </h3>
<p>Le <em>phishing</em> est une technique qui consiste à récupérer des informations personnelles des utilisateurs en leur faisant croire qu'ils se situent sur un site auquel ils peuvent faire confiance, alors que ce n'est pas le cas. </p>
<p>Exemple: vous recevez un e-mail de votre banque qui vous informe d'un problème technique et vous invite à vérifier sur Internet le solde de votre compte, pour voir si vous êtes touché par le problème ou si tout va bien pour vous. L'e-mail vous dit "cliquez ici" et vous le faites, vous cliquez. Vous arrivez ainsi sur un site qui ressemble en tout point à celui de votre banque et vous tapez votre identifiant et votre mot de passe sans aucune crainte. Mais l'e-mail n'avait pas été envoyé par votre banque mais par des pirates, le site n'est pas celui de votre banque mais une immitation réalisée par ces mêmes pirates, et vos informations personnelles sont maintenant connues de ces pirates...</p>
<p>Les navigateurs modernes (Firefox 2+, IE 7, Safari 3+, Chrome) permettent de protéger dans une certaine mesure contre le phishing en analysant l'adresse de la page chargée. Mais cette protection, très utile, ne vous met pourtant pas à l'abri à coup sûr. La seule chose qui vous mettra réellement à l'abri est de taper vous même, dans la fenêtre du navigateur (quel qu'il soit), l'adresse du site que vous désirez consulter. <strong>Ne suivez jamais un lien provenant d'un e-mail, rendez-vous sur le site concerné par vos propres moyens</strong>. </p>
<h2>Historique rapide</h2>
<h3>A new hope</h3>
<p>Au début, ce n'était pas famboyant: des navigateurs en ligne de commande comme <a href="http://en.wikipedia.org/wiki/Lynx_(web_browser)">Lynx</a>. Ils chargaient les pages dans une fenêtre de terminal. Ces navigateurs étaient extrèmement rapides, et pour cause la mise en page et les images étaient totalement absentes. Cela ne servait qu'à visualiser des pages en texte plein... ou pleines de texte ;-). La navigation se faisait au clavier (un modèle d'ergonomie...).</p>
<p>Il y eut ensuite Netscape (NS). Netscape était une société commerciale américaine qui développait un navigateur du même nom et le distribuait gratuitement sur Internet. Ce navigateur était de très loin le meilleur du marché. Netscape fut le grand innovateur de la navigation graphique et des petites fonctions bien utiles comme l'historique et les signets. </p>
<h3>The empire strikes back</h3>
<p>Puis vint Internet Explorer (IE). IE, développé par Microsoft est le navigateur intégré à Windows, encore aujourd'hui. IE reprenait les mêmes fonctions que Netscape en aussi bien (voire en mieux, vu son intégration au système). Par exemple, les "favoris" IE ne sont rien d'autre que les "signets" (bookmarks) de NS. Netscape qui était leader dans son domaine (plus de 80% de part de marché à l'époque) a été détruit en moins de 5 ans par IE (qui du coup est passé à plus de 90% de parts de marché). Le problème d'IE est qu'il n'a pas du tout évolué pendant très longtemps (entre 1998 et 2007). Microsoft a dû faire face à un procès anti-trust à cause d'IE, notamment. En 2010, Microsoft a été forcé par la Commission européenne de présenter une fenêtre ("ballot screen"), au démarrage de Windows, offrant à l'utilisateur de choisir entre plusieurs navigateurs concurrents.</p>
<p>Pendant plus de 5 ans, point de salut, il fallait passer par l'incontournable (redondance!) IE. Les quelques pauvres alternatives se nommaient Netscape (une version minable), Opera (peu efficace), Mozilla (usine à gaz). Rien à faire, il n'y avait qu'IE...</p>
<h3>The return of the Jedi</h3>
<p>Netscape revint enfin, sous une autre forme, sous un autre nom, mais néanmoins reconnaissable dans son esprit.</p>
<p>C'est en réalité un peu plus compliqué... NS fut racheté par AOL, qui fut incapable d'en sortir une version convaincante. Parallèlement, une version OpenSource de Netscape fut créee : Mozilla. Mozilla était développé par la fondation Mozilla, sur le même moteur que Netscape (nommé Gecko), avec les mêmes fonctions, ainsi qu'une interface graphique similaire. Mozilla était une "suite", à l'image de Netscape Communicator : navigateur, client e-mail et usenet, logiciel de création de pages web, etc. Tout cela regroupé dans un seul logiciel, très lourd, peu convivial, et contenant de nombreux bugs. La fondation Mozilla changea alors de voie, en créant un navigateur "standalone", c'est-à-dire ayant une seule fonction : la navigation (pas de client e-mail, pas d'éditeur de pages, etc.) : Firefox.</p>
<p>Firefox, à l'origine Firebird, est le navigateur de la fondation Mozilla, son produit phare. Il était, à l'origine, léger, rapide, intuitif, robuste, plein de bonnes idées... Firefox a créé de nombreuses fonctions qui ont été reprises par la suite par d'autres navigateurs, pour devenir rapidement indispensables.</p>
<h3>The (other) empires strike back, again</h3>
<p>Firefox était, au début des années 2000, le seul véritable concurrent d'Internet Explorer, et il lui était inifiment supérieur à bien des points de vue. Depuis 2009, cependant, une nouvelle tendance se dessine. Firefox n'est plus ce qu'il était : sa force, les extensions qui rajoutent de nombreuses fonctions, sont aussi sa faiblesse : le navigateur est devenu lourd, peu sécurisé, lent (au démarrage comme à la navigation), et mal intégré au système (Firefox fonctionne sur Windows, Mac et Linux, mais il n'est parfaitement intégré à aucun de ces systèmes, contrairement à IE pour Windows ou Safari pour Mac, par exemple).</p>
<p>En d'autres termes, Firefox a remplacé la "suite" Mozilla parce qu'il était plus léger, et il est aujourd'hui en passe d'être devancé par des navigateurs plus légers que lui : Chrome, Safari et Opera.</p>
<p>Safari, en premier lieu, est le navigateur développé par Apple. Il est basé sur un moteur de rendu créé par le monde libre (KHTML) et amélioré par Apple (le moteur est devenu "Webkit"). Safari est léger et rapide, est assez complet pour le commun des mortels. On pourra lui reprocher de rester trop "fermé", en restant réfractaire aux extensions et add-ons, mais c'est aussi un de ses avantages : il ne souffre pas de l'instabilité et des ralentissements engendrés par les extensions de Firefox.</p>
<p>Chrome, ensuite, est un navigateur édité par Google, sur la base d'un projet opensource (Chromium) reprenant le moteur de rendu de Safari, Webkit. C'est un navigateur ultra-minimaliste, qui privilégie la rapidité (de lancement et d'exécution) au détriment des fonctions. Chrome connaît de plus en plus de succès sur Windows, Mac et Linux, et ce succès est dû en grande partie à sa légéreté et à sa vélocité. Chrome accepte les extensions, tout comme Firefox. Il offre donc le meilleur de Firefox (fonctions) et de Safari (légèreté, rapidité, sécurité).</p>
<p>Opera est un navigateur développé par une société norvégienne, basé sur son propre moteur de rendu. Opera dispose de très nombreuses fonctions natives, qui réduisent le besoin de le compléter par des extensions. Malgré cela, Opera a su rester léger et rapide. Devenu gratuit depuis quelques années, après avoir été payant, Opera mérite de figurer dans la liste des meilleurs navigateurs depuis la version 10.50, qui marque une augmentation drastique de ses performances.</p></p>
<h2>Les navigateurs</h2>
<h3>InternetExplorer</h3>
<p><em>Errare humanum est</em>, vous avez pu l'utiliser, <em>perseverare diabolicum</em>, mais seuls les imbéciles continuent de l'utiliser après avoir été informés de ce qu'il est vraiment. IE6 a eu une influence énorme et totalement néfaste sur le Web (non respect des standards). Depuis IE7, Microsoft a décidé d'accélérer le développement de son logiciel (enfin!). Pourtant, le résultat n'est toujours pas convaincant (IE reste beaucoup plus lent et beaucoup moins sécurisé que ses concurrents).</p>
<h5>Les plus</h5>
<p><s>IE est un "passe-partout". En effet, 1) IE ne respecte pas du tout les standards du W3C (les standards du Web: la manière dont devraient être construites les pages), 2) IE est le navigateur le plus utilisé, donc 3) les développeurs Web font des pages pour IE, qui ne respectent pas les standards, et qui s'affichent mal dans les autres navigateurs qui, eux, respectent les standards...</s></p>
<p><em>Ceci était vrai jusqu'en 2006-2008. Désormais, la plupart des sites respectent les standards et s'affichent correctement dans tous les naviagteurs... sauf dans IE6.</em></p>
<p> IE est gratuit et a une bonne intégration à Windows.</p>
<p>Pour être totalement objectif, il faut admettre que IE a d'autres avantages sous Windows: il se charge très rapidement (il est déjà en mémoire : <em>prefetched</em>) contrairement aux autres navigateurs (Firefox...) qui mettent plusieurs dizaines de secondes sur les configurations anciennes ou légères --netbooks-- (IE se lance rapidement, mais cela ne veut pas dire qu'il charge les pages plus rapidement : précisément, Firefox est beaucoup plus rapide que lui). IE supporte touts les plugins comme Flash, Shockwave, QT, WMA, Java, JS, Silverlight, Flex, les <em>x</em>Bar et autres.</p>
<h5>Les moins</h5>
<p>IE est un trou béant de sécurité: avec lui, on récolte tous les virus, trojan, adds, et autres menaces le visant spécifiquement.<br /> <s>IE ne bloque pas les popups (enfin, avant SP2), ne supporte pas la navigation par onglets, ne complète pas les formulaires, n'a pas de gestionnaire de téléchargements, ne peut pas changer de skin...</s></p>
<p><em>Depuis la version 7, IE bloque les pop-ups, supporte la navigation par onglets, complète efficacement les formulaires, possède un gestionnaire de téléchargements intégré (quoi qu'imparfait).<br /> </em></p>
<p>IE ne fonctionne que sous Windows (ce qui, en définitive, est plutôt un avantage...)</p>
<h3>Netscape</h3>
<p>Le vénérable, qui a connu son heure de gloire, qui est mort à petit feu malgré les tentatives d'AOL de lui rendre ses lettres de noblesse (v. historique)</p>
<h3>Mozilla/Seamonkey</h3>
<p><em>La suite Mozilla a été abandonnée en 2005 par la Fondation Mozilla. Depuis l'hiver 2005, une partie des programmeurs de la MoFo ont repris le développement de la suite, sous le nom de <a href="http://www.mozilla.org/projects/seamonkey/">SeaMonkey</a>. Il n'y a pas encore de version stable. Le navigateur de SeaMonkey utilise le moteur de rendu de Firefox, il est donc aussi performant que ce dernier, mais pas plus. Le seul plus qu'il a, par rapport à Firefox, c'est qu'il s'agit d'une suite qui intègre, outre le navigateur, une logiciel d'e-mails, un carnet d'adresses, un lecteur de news, un logiciel de composition WYSIWYG de pages web. Aucun intérêt à mon sens. La raison est la suivante: un gros logiciel qui fait tout ça sera presque toujours moins performant que des logiciels indépendants. Les développeurs doivent partager leur travail entre les différents modules de la suite au lieu de se concentrer sur un en particulier, c'est logique. Pour avoir l'équivalent de la suite, en beaucoup mieux, utilisez les logiciels Mozilla Firefox, <a href="http://www.mozilla-europe.org/fr/products/thunderbird/">Thunderbird</a> (e-mails), et <a href="http://frenchmozilla.sourceforge.net/nvu/">NVU</a> (composition de pages Web). </em></p>
<h3>Firefox</h3>
<p>Le plus complet. Fiable, passe-partout, sécurisé (avec certaines extensions), il est néanmoins devenu un peu "lourd" par rapport à ses concurrents directs, Safari, Opera et Chrome.</p>
<h5>Les plus</h5>
<p>Firefox a toutes les nouvelles fonctions nécessaires à un navigateur moderne. Il est <s>léger</s>, convivial, rapide, puissant, simple et ergonomique, en français, multiplateformes. De plus, une importante communauté développe des skins et plug-ins pour lui et vous aidera sur de très nombreux forums en cas de problème. Ses avantages sont donc: <s>rapidité (le plus rapide de tous)</s>, puissance (des dizaines d'extensions), skin (customisable à fond), souplesse (facilité d'utilisation et extensions), rendu (beaucoups de sites passent sous Firefox et ne passent pas avec les navigateurs basés sur KHTML). </p>
<p>Pour les skins, allez voir <a href="https://addons.mozilla.org/themes/?application=firefox">Mozilla Update</a> (en). Pour les nostalgiques, <a href="https://addons.mozilla.org/themes/moreinfo.php?id=1013&amp;application=firefox">Phoenity Modern</a> est à avoir absolument ! <br /> Pour les extensions, allez voir <a href="http://extensions.geckozone.org/Firefox/">GeckoZone</a> (fr), ou <a href="https://addons.mozilla.org/extensions/?application=firefox">Mozilla Update</a> (en). </p>
<table width="500" border="1" align="center" cellpadding="0" cellspacing="0">
<tbody>
<tr bgcolor="#999999">
<td colspan="2">
<div align="center">         Quelques thèmes et extensions utiles... </div>
</td>
</tr>
<tr bgcolor="#999999">
<td>
<div align="center">         Thèmes</div>
</td>
<td>
<div align="center">         Extensions</div>
</td>
</tr>
<tr>
<td>Noia 2.0 (eXtreme) </td>
<td>AdBlock Plus</td>
</tr>
<tr>
<td>ifox</td>
<td>NoScript</td>
</tr>
<tr>
<td>Chromifox Basic</td>
<td>XMarks</td>
</tr>
<tr>
<td>Chromifox Extreme</td>
<td>Flagfox</td>
</tr>
<tr>
<td>FoxWorld</td>
<td>SpeedDial</td>
</tr>
<tr>
<td>Phoenity (et ses déclinaisons) </td>
<td>StumbleUpon</td>
</tr>
<tr>
<td>Phoenity Modern </td>
<td>Mozilla Weave</td>
</tr>
<tr>
<td>myFirefox</td>
<td>Web Of Thrust</td>
</tr>
<tr>
<td> Silvermel &amp; Charamel</td>
<td>Read It Later</td>
</tr>
<tr>
<td> Stratini ...</td>
<td>Mozilla Prism</td>
</tr>
<tr>
<td> </td>
<td>PDF Download</td>
</tr>
<tr>
<td> </td>
<td>Fission</td>
</tr>
<tr>
<td> </td>
<td>Stop-or-Reload Button </td>
</tr>
<tr>
<td> </td>
<td>Flashgot</td>
</tr>
<tr>
<td> </td>
<td>Jetable.org (1) </td>
</tr>
<tr>
<td> </td>
<td>del.icio.us (2) </td>
</tr>
<tr>
<td> </td>
<td>GreasyMonkey (3) </td>
</tr>
<tr>
<td></td>
<td>LocationBar2</td>
</tr>
<tr>
<td></td>
<td>Download Helper</td>
</tr>
<tr>
<td></td>
<td>Personal Menu</td>
</tr>
<tr>
<td></td>
<td>Twitterbar</td>
</tr>
</tbody>
</table>
<p> (1): S'utilise avec le service www.jetable.org<br /> (2): Permet de gérer les signets del.icio.us<br /> (3): Ne fait rien en soi, il s'agit d'un support pour des scripts (une extension pour gérer des extensions en quelque sorte !)<br />
<h5>Les moins</h5>
<p>Firefox est devenu trop lourd, à cause notamment des extensions et de sa mauvaise intégration au système.</p>
<h5>Les autres de Firefox</h5>
<p>Si vous devez utiliser Firefox, je vous conseille de le télécharger sur <a href="http://www.mozilla-europe.org/fr/products/firefox/">Mozilla Europe</a>. Vous aurez ainsi obligatoirement 1) une version récente, 2) une version stable, 3) une version en français. Autrement dit, vous aurez la dernière version stable traduite en français.</p>
<p>Ailleurs, vous trouverez de nombreuses déclinaisons de Firefox, sous des noms différents. Je vous déconseille de les utiliser, car la plupart d'entre elles ne sont pas faites pour l'utilisation au quotidien. Il s'agit en général de versions de développement. Conséquences de ces versions: cela fonctionne jusqu'au jour où ça plante, et quand ça plante, ça plante pour de bon. Et ça plante souvent. Les extensions et thèmes ne fonctionnent pas tous ou fonctionnent bizarrement; certains sites peuvent être mal affichés.</p>
<p><strong>Firefox: Dernière version stable US</strong>: si l'anglais ne vous fait pas peur, vous pouvez utiliser la dernière version stable US. En général, la traduction en français arrive peu après la version US, mais certains ne voudront pas attendre un mois qu'elle soit faite. Il n'y a aucun risque à utiliser une version stable US, la seule différence est la langue.</p>
<p><strong>Firefox: Alpha, Bêta, RC</strong>: la première version d'un logiciel est la version "alpha". Dans une telle version, toutes les fonctions ne sont pas encore implémentées, et elles le sont au fur et à mesure des versions: alpha 1, alpha 2, etc. La version bêta contient normalement toutes les fonctions destinées à intégrer la version finale, mais avec un certain nombre de bugs. La version "Release Candidate" (RC) ne contient aucun bug connu. Elle fonctionne nomalement: si un bug est trouvé il sera corrigé, sinon, au bout d'un certain temps, le produit est finalisé. Sort alors la version stable, destinés au marché, que l'on appelle sous différents noms: "Gold" (car l'envers des CD qui contenaient de telles versions était doré), "Release", "Stable", etc. Il est conseillé d'utiliser la version stable, mais vous pouvez quand même tester les Release Candidate, en général il n'y a pas de problème. Les versions bêta ne sont pas à utiliser au quotidien, les versions alpha encore moins. </p>
<p><strong>Firefox: Nightly Builds</strong>: les<a href="http://www.mozilla.org/developer/#builds">nightly builds</a> résultent de la compilation, pendant la nuit, du code source sur lequel les développeurs ont travaillé pendant la journée, et quel que soit le stade de développement en cours (alpha, bêta, RC). Attention: si le mec s'est endormi le nez sur son clavier et que le code source est rempli de "zzzzzzzzzzz", c'est ce code qui sera compilé, et la version ne fonctionnera pas (bon, j'exagère, un tel code ne serait pas compilable, et de toute façon de telles choses n'arrivent pas). Retenez quand même que les nightly builds sont des versions en travaux, ce ne sont même pas des versions "alpha" en terme de stabilité. Il ne faut pas les utiliser au quotidien, elles ne servent qu'à être testées, car vous avez une chance sur deux que tout fonctionne à la perfection, et l'autre chance que le logiciel ne se lance même pas.</p>
<p><a href="http://www.flock.com/"><strong>Flock</strong></a> : c'est un dérivé de Firefox. Il utilise le même moteur que ce dernier, il affiche donc les pages Web de la même manière. Mais Flock a des fonctions en plus, notamment dans la manipulation d'images (par exemple avec Flickr) et dans le blogging. Par contre, il ne bénéficie pas de tous les skins et de toutes les extensions de Firefox. Si votre blog est tellement important, pourquoi pas, sinon restez-en à Firefox.</p>
<h3>Opera</h3>
<p>Opera a toutes les fonctions des navigateurs modernes. <s>En plus, il est basé sur l'idée d'un espace de travail: une fenêtre principale avec plein de fenêtres à l'intérieur et des onglets dans ces fenêtres. Plein de volets de personnalisation de partout, plein d'icônes, des menus pleins d'options.</s> <s></s>Depuis la version 10.50, Opera est devenu beaucoup plus sobre.<s></s></p>
<h5>Les plus</h5>
<p>Opera possède de nombreuses fonctions. Pour autant, il reste très léger et rapide. Il est disponible gratuitement en français et sur diverses plateformes.</p>
<h5>Les moins</h5>
<p><s>Il est payant.</s> <em>Opera n'est plus payant, sauf en version mobile (pour téléphones). Vous pouvez donc l'avoir gratuitement sous Windows, Mac, Linux et autres Unices. A noter aussi qu'il n'est plus aussi lent depuis la version 8. Il devient même très rapide depuis la version 10.50 (plus que Firefox ! ... mais moins que Chrome). L'interface admet des skins, mais elle n'est pas totalement personnalisable comme celle de Firefox. </em></p>
<h3>Safari</h3>
<p>Le petit navigateur intégré à OSX et développé par Apple. Il est beau, rapide (devant Firefox, derrière Chrome), il passe presque partout. Il est très simple, parfois trop: par exemple il bloque les pop-ups, mais on ne peut pas mettre de site en liste verte ni autoriser ponctuellement un pop-up, soit on autorise soit on interdit tout en bloc. C'est clair, on ne se complique pas la vie en configurations, mais c'est parfois un peu juste... Le gestion des bookmarks est basés sur celle de NS/Mozilla avec la barre personnelle pour un accès rapide, et les bookmarks s'affichant en plein écran (ce qui est très pratique). De plus, Safari a de petites icônes et elles sont au nombre de 4 par défaut (Précédent, Suivant, Stop/Recharger, Mettre en signets), ce qui est amplement suffisant. Pour finir, Safari intègre comme Firefox un petit champ de recherche à droite du champ d'adresses<s>, mais contrairement à ce dernier, il ne permet pas de choisir à quel moteur de recherche on aura recours: il impose Google</s> <em>(On peut désormais choisir.</em><em>)</em></p>
<h5>Les plus</h5>
<p>Simple, beau, rapide, moderne (toutes les fonctions nécessaires, ou presque). Il est très bien intégré au système. Idée géniale d'Apple: la barre d'adresse contient une barre de progression (bleu ou gris clair par défaut, aqua ou graphite) Tout simplement génial ! ... <em>mais supprimé sous Snow Leopard (Safari 4)</em>.</p>
<h5>Les moins</h5>
<p>Parfois le simple devient simpliste, et des fonctions essentielles ne sont pas présentes (voir ci-dessus au sujet des pop-ups)...<br /> <s>N'est disponible que sur OSX, n'est mis à jour qu'avec les nouvelles versions d'OSX</s>. <em>Safari est désormais disponible pour Mac et Windows (mais pas de version Linux)</em>. </p>
<p><s>MAJ: la simplicité du navigateur, qui débouche sur un terrible manque de fonctions (comme par exemple une barrière anti-pub) est compensée par des add-on ou plugins. Tous les add-on sont disponibles sur l'excellent site <a href="http://www.pimpmysafari.com/">PimpMySafari</a>. Trois remarques cependant: 1) les "bonnes" extensions sont payantes (Saft, SafariStand, PithHelmet), 2) ces extensions doivent être mises à jour à chaque mise à jour de Safari (c'est pénible...), 3) il y a beaucoup moins d'extensions que pour Firefox, et celles-ci sont moins complètes et plus difficiles à installer. En effet, Safari n'intégère pas de gestionnaire de plugins. Les plugins pour Safari sont pour la plupart construits autour du système SIMBL qui est, à mon goût, moins bon que celui des des extensions Firefox (XUL, etc)</s>. <s></s></p>
<h5>Les autres de Safari</h5>
<p>Comme pour Firefox, il y a des dérivés de Safari. Ils reprennent le moteur de rendu de Safari (KHTML/WebKit), et quelques fonctions synchronisées comme la gestion des bookmarks et le trousseau.</p>
<p><a href="http://hmdt-web.net/shiira/en"><strong>Shiira</strong></a>: pas grand chose de plus à l'horizon.</p>
<p><strong><a href="http://www.icab.de/">iCab</a></strong>: navigateur vénérable, il est désormais basé sur Webkit.</p>
<p>Pour les autres, moins connus (et totalement inutiles), reportez vous à <a href="http://darrel.knutson.com/mac/www/browsers.html">cette page</a>. </p>
<h3>Camino</h3>
<p>Camino se situe entre Firefox et Safari. Pour faire simple, <s>le gros avantage de Firefox est son moteur Gecko</s>, <em>(ce n'est plus un avantage maintenant, mais un inconvénient : Webkit a dépassé Gecko)</em> le gros avantage de Safari est son intégration au système (et à .Mac entre autres). Camino est aussi bien intégré au système que Safari, et il utilise le moteur de Firefox. Ce navigateur a -presque- tout pour plaire !</p>
<h5>Les plus</h5>
<p>Le moteur de Firefox, Gecko, et tout le bien qu'on peut en dire. Sa parfaite intégration au système. La vitesse de chargement des pages.</p>
<h5>Les moins </h5>
<p>Les extensions et thèmes de Firefox ne sont pas compatibles avec Camino. Vous trouverez des extensions propres à Camino sur le site <a href="http://www.nadamac.de/index_en.php">nadamac.de</a>. C'est un inconvénient, mais c'est aussi un avantage : Camino est beaucoup moins lourd sur Firefox !</p>
<h3>OmniWeb</h3>
<p>Omniweb est à mi-chemin entre Opera et Firefox/Safari. Il propose de nombreuses fonctions absentes de Safari, tout en restant simple et rapide. Toutefois, il n'est plus activement développé, et la communauté attend une nouvelle version depuis des années.</p>
<h5>Les plus</h5>
<p>Beaucoup de fonctions, rapide, simple sans être simpliste, ergonomique. Excellent produit (vraiment!).<br /> A noter notamment 3 choses dont je ne peux plus me passer: les onglets en gros sur la gauche ou la droite de la fnêtre affichant une prévisualisation de la page en chargement (on peut les classer, les drag&amp;drop d'une fenêtre à l'autre, etc); la possibilité de définir pour chaque site des options particulières concernant les cookies, les popups, l'affichage (taille du texte par exemple), etc; les espaces de travail ou "workspaces": on peut créer des groupes d'onglets et les sauvegarder, de plus, si le logiciel plante, quand il redémarre il se souvient automatiquement des onglets ouverts lors de son plantage. Il y a également d'autres fonctions très utiles et intelligentes: les champs de texte des formulaires peuvent être agrandis (ils s'ouvrent en fait dans une autre fenêtre que l'on peut redimentionner à volonté); OW s'intègre parfaitement à OSX et gère notamment le trousseau d'accès (stockant mots de passe et co); le nombre d'entrées RSS non lues s'affiche sur l'icône du dock; les signets sont sauvegardés automatiquement sur .MAC ou n'importe quel autre serveur WebDAV; etc. </p>
<h5>Les moins</h5>
<p>Peut être un peu plus lent que Safari et Firefox, mais il faut vraiment y faire attention (<em>MAJ</em>: depuis la 5.1, il faut vraiment avoir un chronomètre atomique pour le voir :p). <s>Payant</s> <em>(Omniweb est désormais gratuit)</em>, <s>en anglais</s> <em>(Omniweb est désormais disponible en français)</em>, et pour OSX uniquement. </p>
<h3>Amaya</h3>
<p>Le navigateur développé par le W3C (World Wide Web Consortium: organisme chargé de définir les standards du Web). Ce n'est pas un navigateur à utiliser tous les jours. Il n'a à mon sens qu'une seule utilité: pour les développeurs web qui veulent tester la compatibilité de leurs pages avec les standards du W3C.</p>
<h5>Les plus</h5>
<p>Amaya est 100% compatible avec les standards. Il est gratuit et multiplateformes.</p>
<h5>Les moins</h5>
<p>Il ne fait rien d'autre qu'afficher des pages... comprendre: toutes les autres fonctions décrites ci-dessus sont absentes, il est lent et moche. Il est en anglais. Et puis... puisqu'il respecte scrupuleusement les standarts, et qu'aucune page Web ne les respecte vraiment, il affiche tout n'importe comment ;-)) </p>
<h3>Lynx</h3>
<p>Il faut aimer.</p>
<h5>Les plus</h5>
<p>Rapide.</p>
<h5>Les moins</h5>
<p>Finalement, une tablette de pierre et un burin, ce serait aussi bien...</p>
<h3>Autres</h3>
<p>Il existe 4 grands moteurs de rendu: IE, Gecko (Firefox), KHTML/Webkit (Safari/Chrome) et Presto (Opera). Le moteur de rendu est le coeur du navigateur, c'est le système qui analyse le code source de la page web (en HTML, XML, XHTML, avec ou sans CSS, JavaScript, calques, tableaux, frames, etc...) et l'affiche à l'écran. Programmer un moteur de rendu est extrèmement difficile vu l'évolution et la complexité des standards du web. Aussi, la plupart des "petits" navigateurs reprennent le moteur de rendu d'un "grand".<br /> Les logiciels Microsoft qui affichent du HTML (Frontpage, Outlook, etc) sont construites sur le moteur IE. Netscape, Mozilla, Firefox, Thunderbird et tous les autres dérivés (comme par exemple l'éditeur NVU pour n'en citer qu'un) sont basés sur Gecko. Les autres comme le navigateur intégré à KDE (Linux), Safari (OSX), Chrome, sont basés sur Webkit.</p>
<p>Autrement dit, les "petits" naviagteurs n'apportent souvent rien par rapport aux "grands", hormis des fonctions pour avancées ou "gadget".</p>
<h2>Résumé</h2>
<blockquote><p><strong>Conclusion à la première édition</strong></p>
<p>Le plus connu est IE, qui doit sa célébrité non à sa qualité mais à son intégration forcée à Windows. C'est un vieux navigateur qui n'a pas évolué: il est tout simplement archaïque. Il fait pâle figure en terme de performances comparé aux navigateurs modernes. Plus grave: en l'utilisant vous compromettez la sécurité de votre système. Pour ces trois raisons, si vous êtes sous Windows, je vous conseille de passer à Firefox: gratuit, en français, rapide, fiable et sécurité, facile d'utilisation, c'est un navigateur presque parfait. Si vous êtes sous Linux, Firefox est également la meilleure solution. Si vous êtes sous Mac OSX, vous pouvez utiliser Firefox si vous n'aimez pas Safari. Sinon, ne vous compliquez pas la vie, Safari est parfait. Si, enfin, vous êtes sous Atari ou MO5, téléchargez et installez Lynx, puis allez au Cyber-Café ! :-))</p>
</blockquote>
<blockquote><p><strong>Conclusion à la 4ème édition</strong></p>
<p>Après avoir longtemps été dominé par IE, le marché des navigateurs est devenu bipôlaire avec l'arrivée de Firefox. Aujourd'hui, une nouvelle tendance se dessine : celle des navigateurs légers, simples et ultra-performants, capables d'exécuter du code JavaScript très rapidement, afin de faire fonctionner les "application du web 2.0" aussi bien que des applications natives. Safari et Google Chrome sont de ceux qui privilégient cette approche. Opera revient aussi dans la course, avec une version 10.50 très agréable à utiliser et plus rapide que jamais ! En 2010, il n'y a plus de raison d'utiliser un seul navigateur : que chacun choisisse, au gré de son humeur, entre Firefox, Opera, Safari et Chrome !</p>
</blockquote>
<p>Première édition, à Paris, le 19/12/2004</p>
<p>Première édition corrigée le 1/01/2005</p>
<p>Deuxième édition le 28/12/2005 </p>
<p>Troisième édition les 08/03/2007 et 05/10/2007</p>
<p>Quatrième édition le 17/03/2010</p>
