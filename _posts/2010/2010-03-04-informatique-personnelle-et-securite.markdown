---
layout: post
status: publish
published: true
title: Informatique personnelle et sécurité

  
  



excerpt: "La sécurité informatique est une question essentielle, à une époque où tous
  les ordinateurs, ou presque, bénéficient d'un accès permanent à Internet. Or, les
  utilisateurs sont souvent mal informés des dangers qui les menacent et des comportements
  à adopter pour réduire leur exposition à ces dangers. C'est sur cela que jouent
  la plupart des auteurs de logiciels malveillants. Cet article présente les principales
  techniques de protection d'un <i>ordinateur personnel</i>, qui ont pour but d'empêcher
  les intrusions, d'assurer la sécurité du système, de prévenir la diffusion des données
  personnelles de l'utilisateur, etc.\r\n\r\n"
wordpress_id: 350
date: '2010-03-04 16:15:00 +0100'
date_gmt: '2010-03-04 14:15:00 +0100'
categories:
- Informatique
tags:
- apple
- Informatique
- sécurité
- hardware
- software
- Linux
- Web
- Windows
permalink:  /2010/03/04/informatique-personnelle-et-securite/
---
<p>La sécurité informatique est une question essentielle, à une époque où tous les ordinateurs, ou presque, bénéficient d'un accès permanent à Internet. Or, les utilisateurs sont souvent mal informés des dangers qui les menacent et des comportements à adopter pour réduire leur exposition à ces dangers. C'est sur cela que jouent la plupart des auteurs de logiciels malveillants. Cet article présente les principales techniques de protection d'un <i>ordinateur personnel</i>, qui ont pour but d'empêcher les intrusions, d'assurer la sécurité du système, de prévenir la diffusion des données personnelles de l'utilisateur, etc.</p>
<p><a id="more"></a><a id="more-350"></a></p>
<p><b><i>Sommaire</i></b></p>
<ol>
<li /><a href="#1">Quelques rappels juridiques</a>
<li /><a href="#2">Typologie des menaces</a>
<ol>
<li /><a href="#21">Malware</a>
<li /><a href="#22">Spyware</a>
<li /><a href="#23">Trojan</a>
<li /><a href="#24">Keylogger</a>
<li /><a href="#25">Screenlogger</a>
<li /><a href="#26">Rootkit</a>
<li /><a href="#26b">Bootkit</a>
<li /><a href="#27">Backdoor</a>
<li /><a href="#28">Rogue</a>
<li /><a href="#29">Adware</a>
<li /><a href="#210">Virus</a>
<li /><a href="#211">Worm</a>
<li /><a href="#212">Crack</a>
<li /><a href="#213">Cookie</a>
<li /><a href="#214">Script</a>
<li /><a href="#215">Macro</a>
<li /><a href="#216">Plugin</a>
<li /><a href="#217">Phishing</a>
<li /><a href="#218">Spam</a>
	</ol>
<li /><a href="#3">Lutter contre les menaces (conseils basiques)</a>
<ol>
<li /><a href="#31">Prévention des menaces</a>
<ol>
<li /><a href="#311"><i>Si vous ne savez pas, ne cliquez pas</i></a>
<li /><a href="#312"><i>Si vous ne connaissez pas, ne vous y fiez pas</i></a>
<li /><a href="#313"><i>Un antivirus ne remplace pas votre vigilance</i></a>
<li /><a href="#314"><i>Les 10 règles immuables de la sécurité informatique</i></a>
<li /><a href="#315"><i>Je suis mon alter-ego</i></a>
		</ol>
<li /><a href="#32">Neutralisation des menaces</a>
<ol>
<li /><a href="#321">Ne pas connecter un ordinateur directement à Internet</a>
<li /><a href="#322">Utiliser un Firewall</a>
<ol>
<li /><a href="#3221">Paramétrer le Firewall de Windows 7</a>
<li /><a href="#3222">Utiliser un Firewall tiers</a>
<li /><a href="#3223">Utiliser un Firewall sur Mac</a>
<li /><a href="#3224">Le filtrage des connexions sortantes n'est pas toujours suffisant</a>
<li /><a href="#3225">Ressources firewall et réseau</a>
			</ol>
<li /><a href="#323">Mettre à jour régulièrement ses logiciels</a>
<li /><a href="#324">Utiliser les logiciels de sécurité adaptés aux menaces</a>
<li /><a href="#325">Désactiver les scripts, macros et plugins</a>
<ol>
<li /><a href="#3251">Désactiver les macros</a>
<li /><a href="#3252">Désactiver les scripts et plugins dans les pages Web</a>
			</ol>
<li /><a href="#326">Nettoyer les cookies et le cache de navigation</a>
		</ol>
<li /><a href="#33">Suppression des menaces</a>
	</ol>
<li /><a href="#4">Lutte contre les menaces (conseils avancés)</a>
<ol>
<li /><a href="#41">Identifier les services et processus en cours</a>
<li /><a href="#42">Filtrer les IP</a>
<li /><a href="#43">Utiliser un VPN</a>
<ol>
<li /><a href="#431">Structure du réseau Internet</a>
<li /><a href="#432">Principe des proxy VPN</a>
<li /><a href="#433">Quelques aspects juridiques</a>
<li /><a href="#434">Remarques complémentaires</a>
		</ol>
<li /><a href="#44">TOR</a>
<ol>
<li /><a href="#441">Principe</a>
<li /><a href="#442">Mise en oeuvre</a>
<li /><a href="#443">Critique</a>
		</ol>
<li /><a href="#45">SSL/https</a>
<li /><a href="#46">Utiliser un OS fiable</a>
<li /><a href="#47">Placer les fichiers importants sur support amovible</a>
<li /><a href="#48">Opérations critiques : utiliser un OS "Live USB"</a>
<li /><a href="#49">Chiffrer les données sensibles</a>
<ol>
<li /><a href="#491">Inconvénients</a>
<li /><a href="#492">Sécurité</a>
<li /><a href="#493">Mise en oeuvre</a>
<li /><a href="#494">Aspects juridiques</a>
		</ol>
<li /><a href="#410">Utiliser un clavier virtuel</a>
<li /><a href="#411">Vérifier l'état physique du matériel</a>
<li /><a href="#412">Changer ses DNS au niveau du navigateur</a>
<li /><a href="#413">Sandboxing et Virtualisation</a>
	</ol>
<li /><a href="#5">Conclusion</a>
</ol>
<p><a name="1"></a><br />
<h1>Quelques rappels juridiques</h1>
<p>Avant d'aborder les aspects de technique informatique, il est nécessaire de procéder à quelques rappels juridiques.</p>
<p>Je vous parlais en effet, il y a quelques temps, du <a href="{% post_url /2010/2010-02-13-loppsi-2-les-spywares-judiciaires %}">projet de loi LOPPSI et de son article 23</a>, permettant à l'autorité judiciaire de placer des logiciels « mouchards » dans des ordinateurs, à partir du réseau Internet. L'objet de l'article était de montrer que l'efficacité de ce procédé est extrêmement douteuse, puisqu'il existe de nombreux moyens de se protéger contre les logiciels nuisibles. Le présent article va plus loin en montrant comment mettre en oeuvre différentes techniques de protection contre les logiciels espion et les différentes menaces pour la sécurité des ordinateurs personnels.</p>
<p>La première question que peut se poser le lecteur, arrivé à ce stade de sa lecture, est celle de savoir si cet article a pour but d'expliquer comment violer la loi en empêchant la police judiciaire d'utiliser un logiciel espion. La réponse est négative. L'objet de cet article est beaucoup plus large puisqu'il s'agit de présenter certains moyens de se protéger contre <i>tous</i> les logiciels espion, et contre la plupart des menaces courantes de sécurité pour les ordinateurs personnels (à l'exclusion des serveurs). Ces moyens de protection sont techniques et, par conséquent, « neutres » : ils combattent telle ou telle technologie, sans prendre en compte la finalité de son utilisation. Si le dispositif de la loi LOPPSI est neutralisé par les mesures de protection décrites ici, c'est parce qu'il fonctionne comme de nombreux logiciels malicieux que ces mesures ont pour but de combattre.</p>
<p>Il faut ensuite rappeler qu'aucune règle de droit français n'interdit à une personne de sécuriser son ordinateur afin d'empêcher son utilisation frauduleuse. Au contraire, c'est l'utilisation de logiciels espion qui est pénalement incriminée : <i>« Le fait, commis de mauvaise foi, d'ouvrir, de supprimer, de retarder ou de détourner des correspondances arrivées ou non à destination et adressées à des tiers, ou d'en prendre frauduleusement connaissance, est puni d'un an d'emprisonnement et de 45000 euros d'amende. Est puni des mêmes peines le fait, commis de mauvaise foi, d'intercepter, de détourner, d'utiliser ou de divulguer des correspondances émises, transmises ou reçues par la voie des télécommunications ou de procéder à l'installation d'appareils conçus pour réaliser de telles interceptions. »</i>. Le secret des correspondances, violé par les logiciels espions, est d'ailleurs protégé par l'article 8 de la <a href="http://www.echr.coe.int/ECHR/FR/Header/Basic+Texts/The+Convention+and+additional+protocols/The+European+Convention+on+Human+Rights/">Convention européenne de sauvegarde des droits de l'Homme</a> et par l'article 5 de la <a href="http://eur-lex.europa.eu/smartapi/cgi/sga_doc?smartapi!celexapi!prod!CELEXnumdoc&lg=fr&model=guicheti&numdoc=32002L0058">directive 2002/58 « vie privée et communications électroniques »</a>.</p>
<p>Toutes les techniques décrites ici sont donc parfaitement licites, dès lors qu'on les utilise afin de se protéger contre les atteintes à l'intimité de sa vie privée et non dans le but de violer la loi ou de causer préjudice à autrui.</p>
<p><a name="2"></a><br />
<h1>Typologie des menaces</h1>
<p></a></p>
<blockquote><p><i>« Connais ton ennemi et connais-toi toi-même; eussiez-vous cent guerres à soutenir, cent fois vous serez victorieux. Si tu ignores ton ennemi et que tu te connais toi-même, tes chances de perdre et de gagner seront égales. Si tu ignores à la fois ton ennemi et toi-même, tu ne compteras tes combats que par tes défaites. »</i><br />(Sun Tzu, <a href="http://fr.wikipedia.org/wiki/L%27Art_de_la_guerre">L'Art de la guerre</a>, <a href="http://artdelaguerreselonsuntzu.ifrance.com/artdelaguerreselonsuntzu/art03.htm">Chapitre 3</a>)</p></blockquote>
<p>Avant de savoir <i>comment</i> se défendre, il faut savoir <i>contre quoi</i> se défendre. Voici donc une description non exhaustive des principaux types de menaces. </p>
<p>Il est important de noter que <b>ces menaces ne sont pas exclusives les unes des autres</b>. Bien au contraire, dans la plupart des cas, elles oeuvrent de concert pour compromettre la sécurité du système et permettre la réalisation d'agissements frauduleux.</p>
<p><a name="21"></a><br />
<h3>Malware</h3>
<p></a> Le terme <i>malware</i> ne désigne pas un type particulier de logiciel en fonction de la technique employée mais, plus généralement, tous les logiciels « nuisibles » ou « malicieux ».</p>
<p><a name="22"></a><br />
<h3>Spyware</h3>
<p></a> Le terme générique <i>spyware</i> désigne tous les logiciels qui ont pour finalité de recueillir des données sur l'ordinateur d'une personne à son insu, puis de les transmettre par Internet à une tierce personne.</p>
<p><a name="23"></a><br />
<h3>Trojan [horse]</h3>
<p></a> Les <i>chevaux de Troie</i> sont des logiciels qui reprennent certaines caractéristiques du cheval introduit par Ulysses dans la ville de Troie :<br />
- un cheval de Troie est généralement (mais pas toujours) caché dans un autre logiciel que l'utilisateur installera en toute confiance sur son système ;<br />
- un cheval de Troie se cachera dans les fichiers système et évitera de signaler sa présence à l'utilisateur (il sera alors probablement accompagné d'un <i>rootkit</i>) ;<br />
- un cheval de Troie (particulièrement bien conçu) parasitera un exécutable système afin d'être identifié par l'utilisateur et par le système d'exploitation, non en tant que tel, mais comme une composante de ce dernier ;<br />
- un cheval de Troie ouvrira une connexion Internet entre l'ordinateur infecté et un serveur tiers (tout comme les Grecs ouvrirent les portes de Troie, une fois sortis de leur cheval) ;</p>
<p>On distingue deux grandes catégories de chevaux de Troie. Ceux de la première catégorie ont pour but de récupérer des données personnelles (adresses e-mail, mots de passe, numéro de carte bancaire, etc.) et de les transmettre à l'auteur du logiciel. Ceux de la deuxième catégorie ont pour but de transformer l'ordinateur en « zombie » et de le mettre au service de l'auteur du logiciel, afin de mener une attaque de grande ampleur. Dans la plupart des cas, il s'agira d'une attaque de <i>spam</i>, qui consiste à utiliser l'ordinateur comme serveur d'envoi de courrier électronique, ou d'une <a href="http://fr.wikipedia.org/wiki/Attaque_par_d%C3%A9ni_de_service">attaque DDoS</a>, visant à saturer un serveur en l'inondant de requêtes.</p>
<p><a name="24"></a><br />
<h3>Keylogger</h3>
<p></a> Le terme <i>keylogger</i> désigne un logiciel qui « capture » et enregistre (« log » signifie « <a href="http://fr.wikipedia.org/wiki/Historique_%28informatique%29">journaliser</a> ») les touches du clavier (« key ») pressées par l'utilisateur. Un keylogger permet donc de récupérer en clair les mots de passe entrés par l'utilisateur lors de ses visites sur le Web. Peu importe, à cet égard, que la connexion entre l'ordinateur et le serveur du site visité soit sécurisée (v. <i>infra</i>), puisque le keylogger agit sur l'ordinateur de l'internaute, lorsqu'il utilise son clavier. Les chevaux de Troie installent parfois des keyloggers, et ceux-ci sont la plupart du temps accompagnés d'un rootkit.</p>
<p><a name="25"></a><br />
<h3>Screenlogger</h3>
<p></a> Il s'agit d'un logiciel qui capture et enregistre les images affichées à l'écran en agissant, non pas sur le clavier comme un keylogger, mais sur la carte graphique de l'ordinateur.</p>
<p><a name="26"></a><br />
<h3>Rootkit</h3>
<p></a> Le terme « root » (qui signifie « racine ») désigne, en langage informatique, l'administrateur système. L'utilisateur root est unique, sur chaque système, et ignore toutes les restrictions de lecture, d'écriture et d'exécution des fichiers de l'ordinateur. Autrement dit, l'utilisateur root peut tout faire, sans aucune restriction. Un « rootkit » est un logiciel qui a pour but d'activer et d'utiliser les pouvoirs de l'utilisateur root, ou de permettre à un logiciel malveillant ou à une personne d'utiliser localement ou à distance le compte root. Il est fréquent que les rootkits utilisent les pouvoirs de l'utilisateur root afin de se dissimuler dans le système, d'empêcher leur suppression par l'utilisateur, de se lancer au démarrage du système, et se relancer en cas de crash ou d'arrêt manuel, etc. Les rootkits neutralisent en outre la plupart des techniques de protection présentées dans cet article. Par exemple, ils n'apparaîtront pas dans la liste des processus actifs (v. <i>infra</i>) ou il désactiveront le firewall et l'antivirus, empêchant ainsi leur détection. Les rootkits servent généralement de support à un autre type de menace. De tous les logiciels nuisibles présentés ici, ce sont les plus dangereux.</p>
<p><a name="26b"></a><br />
<h3>Bootkit</h3>
<p></a> Le terme <i>bootkit</i> désigne un logiciel malveillant qui agit au niveau du lancement de la machine <i>(boot)</i>. Pour mémoire, un ordinateur se lance selon la séquence suivante : lancement du BIOS (firmware) qui donne les premières instructions au processeur et permet de localiser les volumes de démarrage (e.g. le disque dur sur lequel est installé le système d'exploitation), lecture du MBR <i>(Master Boot Record)</i> qui se charge de lancer le <i>BootLoader</i>, qui lance à son tour et l'<i>OSLoader</i> et le noyau du système d'exploitation.  Les premiers bootkits étaient des virus placés sur une disquette et s'insérant dans le MBR du disque dur lorsque l'ordinateur était démarré à partir de la disquette. Ces virus nécessitant un accès physique à la machine et reposant sur un support tombé en désuétude (les disquettes), ils ont aujourd'hui disparu. Toutefois, de nouvelles menaces se propageant par le réseau sont récemment apparues --<a href="http://www.eeye.com/html/resources/downloads/other/index.html">depuis une <i>proof of concept</i> de 2005</a>--, et se comportent comme les bootkits traditionnels (avec, bien entendu, les différences nécessaires à leur mise en oeuvre à distance). Le bootkit le plus connu est <a href="http://www.clubic.com/actualite-175362-sinowal-ver-worm-morris.html">sinowal</a>. Les bons côtés des bootkits : 1) leur difficulté de mise en oeuvre (ce sont des logiciels particulièrement sophistiqués, que seuls des experts peuvent élaborer) ; 2) ils sont de ce fait très rares ; 3) ils ne sont pas forcément très difficiles à supprimer --démarrer Windows en mode console, puis taper la commande <strong>fixmbr</strong> est parfois suffisant--. Les mauvais côtés des bootkits : puisqu'ils agissent au niveau du boot 1) il est très difficile de s'en protéger ; 2) une fois l'ordinateur infecté, le bootkit est tout puissant.</p>
<p><a name="27"></a><br />
<h3>Backdoor</h3>
<p></a> Littéralement « porte de derrière », une backdoor est une faille de sécurité introduite dans un système afin de permettre l'intrusion ou la prise de contrôle de l'ordinateur à l'insu de l'utilisateur. Il ne s'agit pas d'un type de logiciel, mais de la conséquence de l'exécution de certains logiciels nuisibles, tels que les rootkits.</p>
<p><a name="28"></a><br />
<h3>Rogue</h3>
<p></a> Le mot « rogue » peut être traduit par « malfrat », « voyou » ou « corrompu ». Les logiciels <i>rogue</i> s'entourent d'une apparence de respectabilité afin de masquer leurs véritables desseins. L'exemple le plus courant de <i>rogue</i> est le faux logiciel de sécurité, de nettoyage ou d'optimisation du système. Celui-ci s'installe à l'insu de l'utilisateur lorsqu'il navigue sur un site web conçu pour l'infecter. Le rogue modifie ensuite le centre de sécurité de Windows afin de remplacer l'antivirus installé (qu'il désactivera totalement au prochain démarrage de la machine). Le rogue présente l'interface graphique d'un antivirus -ou d'un anti-malware au sens large, ou d'un utilitaire de nettoyage ou d'optimisation du système, etc.-, mais n'a aucune de ses fonctions de protection : c'est une « coquille vide ». Le rogue vous fera croire que votre ordinateur est infecté, et qu'il peut le nettoyer, afin de vous amener à sortir votre carte bancaire... Bien entendu, votre compte bancaire sera détourné par les auteurs du logiciel rogue, et celui-ci cessera tout simplement d'agir. Désinstaller un rogue sans endommager irrémédiablement le système peut être difficile (s'il a le soutien d'un rootkit), voire impossible. En outre, le rogue désactivant toutes les protections de l'ordinateur, il vous expose à de nombreuses menaces. Mais, paradoxalement, il est facile de ne pas être infecté par un rogue : il suffit, avant d'installer un prétendu logiciel de protection ou d'optimisation du système, d'en vérifier la réputation auprès de la communauté des internautes (concrètement : tapez le nom du logiciel sur Google, et lisez les avis).</p>
<p><a name="29"></a><br />
<h3>Adware</h3>
<p></a> Le préfixe « ad » est la contraction du mot anglais « advertisement » signifiant, ici, « publicité ». Un adware est donc un logiciel introduisant de la publicité sur un ordinateur, sans qu'elle ait été sollicitée ou même acceptée par l'utilisateur.</p>
<p><a name="210"></a><br />
<h3>Virus</h3>
<p></a> Le virus informatique partage plusieurs caractéristiques des virus biologiques :<br />
- il « infecte » des fichiers exécutables, c'est-à-dire qu'il les modifie en se rajoutant à leur contenu ;<br />
- il a pour but premier de se « répliquer », c'est-à-dire d'infecter d'autres fichiers exécutables lorsque le fichier exécutable porteur est exécuté ;<br />
- il est nuisible au système (en général, il détruit les fichiers comme un virus biologique détruit des cellules).</p>
<p>Il existe des <a href="http://www.clubic.com/forum/logiciel-general/assurer-la-protection-de-votre-pc-id142328-page1.html#1530218">sous-catégories de virus</a> qui partagent les caractéristiques précitées tout en se différenciant sur d'autres points.</p>
<p><a name="211"></a><br />
<h3>Worm</h3>
<p></a> Les vers sont des virus évolués dont les deux caractéristiques principales sont les suivantes :<br />
- un ver est autonome : il n'a pas besoin de parasiter un fichier exécutable ;<br />
- un ver a pour but de se propager dans un réseau d'ordinateurs, là où le virus classique se limite à infecter les fichiers sains de l'ordinateur sur lequel il se trouve.</p>
<p><a name="212"></a><br />
<h3>Crack</h3>
<p></a> Un « crack » est un logiciel ayant pour fonction de « casser » les protections d'un autre logiciel. La plupart des cracks visent les logiciels commerciaux, afin de permettre leur utilisation sans acquérir de licence d'utilisation auprès de leur éditeur. Les cracks ne sont, <i>a priori</i>, pas nuisibles au système sur lequel ils sont exécutés. Toutefois, de nombreux cracks véhiculent des logiciels nuisibles comme des chevaux de Troie, des virus ou des vers.</p>
<p><a name="213"></a><br />
<h3>Cookie</h3>
<p></a> Les cookies ne sont pas des logiciels nuisibles. Ce ne sont pas des logiciels et ils ne sont, en principe, pas nuisibles. Ce sont des fichiers de texte brut enregistrés par un navigateur web sur le disque dur de l'ordinateur de l'internaute, afin que certaines informations persistent après que l'internaute ait quitté un site, et soient disponibles lorsqu'il le visite à nouveau. Les cookies fournissent un grand confort à l'utilisateur qui n'aura pas à saisir les mêmes informations (par exemple, son nom d'utilisateur et son mot de passe) à chaque visite d'un site. Cependant, les cookies présentent un danger dès lors qu'ils contiennent des informations personnelles entrées par l'internaute. On appelle « cookies traceurs » (<i>tarcking cookies</i>) les cookies trop indiscrets, qui ont pour but de créer un profil commercial ou comportemental de l'utilisateur.</p>
<p><a name="214"></a><br />
<h3>Script</h3>
<p></a> Les scripts font partie, comme les cookies, des techniques permettant d'augmenter le confort d'utilisation des sites Web. A l'origine, les pages Web écrites dans le langage HTML étaient purement « passives » : elles se contentaient de décrire au navigateur un contenu à afficher. Les scripts permettent de les rendre « actives » en demandant au navigateur de <i>faire</i> telle ou telle chose. En d'autres termes, les pages dépourvues de script ont un « état » alors que les pages pourvues de scripts ont un « comportement ». A l'instar des cookies, certains scripts peuvent être malicieux et engendrer un risque pour la sécurité des données de l'utilisateur ou de son système.</p>
<p><a name="215"></a><br />
<h3>Macro</h3>
<p></a> Les macros sont des scripts insérés, non pas dans une page Web, mais dans un fichier. Les macros sont exécutées par le logiciel qui ouvre le fichier et ne sont pas, <i>a priori</i> nuisibles. La plupart des macros malicieuses se situent dans des fichiers MS Word (.doc) ou Excel (.xls).</p>
<p><a name="216"></a><br />
<h3>Plugin</h3>
<p></a> Les plugins sont des logiciels tiers greffés au navigateur afin de lui permettre d'afficher certains contenus multimédia. Par exemple, le plugin <i>Flash</i> est actuellement nécessaire pour afficher les vidéos sur YouTube. Comme les cookies et les scripts, les plugins sont, en principe, des moyens d'améliorer l'expérience de l'utilisateur sur le web. Ils peuvent également constituer un risque pour la sécurité, lorsqu'un site malicieux parvient à exploiter une faille de sécurité. En outre, ils ralentissent considérablement le navigateur (voire le système) et l'affichage des pages. Ils peuvent également entraîner des « crash » du navigateur. Pour couronner le tout, ils permettent d'afficher de nombreux bandeaux publicitaires sur les pages Web.</p>
<p><a name="217"></a><br />
<h3>Phishing</h3>
<p></a> Le « phishing » (ou « hameçonnage » en français québécois) est une technique qui consiste à amener l'utilisateur sur un site web, tout en lui faisant croire qu'il visite un autre site. Ainsi, l'internaute piégé fournit ses coordonnées bancaires lorsqu'il se trouve sur le site d'une personne mal intentionnée alors qu'il croit se trouver sur le site de sa banque.</p>
<p><a name="218"></a><br />
<h3>Spam</h3>
<p></a> Un « spam » est un courrier électronique non sollicité. La plupart des spams (mais pas tous) sont malveillants : ils participent souvent au phishing, ou à des escroqueries réalisées dans le monde réel. Compte tenu des mesures anti-spam prises ces dernières années par la plupart des fournisseurs de courrier électronique, les personnes à l'origine du spam ont progressivement évolué de l'utilisation d'un serveur dédié vers l'infection des ordinateurs des internautes par des vers ou chevaux de Troie, afin d'envoyer leurs messages depuis ces ordinateurs.</p>
<p>Concernant l'infection par un virus (cheval de troie, ver, etc.) originaire d'un e-mail, voir l'article : <a href="{% post_url /2005/2005-06-03-demystification-peut-on-etre-infecte-par-un-virus-a-cause-dun-e-mail %}">Démystification: peut-on être infecté par un virus à cause d’un e-mail ?</a>.</p>
<p><a name="3"></a><br />
<h1>Lutte contre les menaces (conseils basiques)</h1>
<p></a></p>
<p>La lutte contre les différentes menaces précédemment exposées, qu'elles se présentent individuellement ou simultanément, passe par deux étapes, avant infection, de prévention et de neutralisation et par une troisième étape, en cas d'infection, de suppression.</p>
<p><a name="31"></a><br />
<h2>Prévention des menaces</h2>
<p></a></p>
<p><a name="311"></a><br />
<h3>#1 - « Si vous ne savez pas, ne cliquez pas »</h3>
<p></a></p>
<p>Une blague courante parmi les informaticiens dit que « <i>le seul danger se situe entre la chaise et le clavier</i> ». Bien entendu, ce n'est pas vrai. Pourtant, il est indéniable que la plupart des failles de sécurité sont créées par les utilisateurs eux-mêmes, qui manquent d'information et de vigilance. La mauvaise connaissance de l'informatique et la crédulité des utilisateurs sont très largement exploitées par les personnes à l'origine des menaces précédemment décrites. « <i>Donnez-nous votre adresse e-mail</i> » (... pour que nous puissions vous envoyer des spams), « <i>suivez ce lien vers le site de votre banque</i> » (... qui n'est pas vraiment le site de votre banque, mais qui vous demandera tout de même votre mot de passe), « <i>ouvrez ce fichier qu'un ami vous envoie</i> » (... ou plutôt, que l'ordinateur infecté d'un ami vous envoie, pour infecter votre ordinateur), etc.</p>
<p>La première règle de sécurité est donc la plus importante : en cas de doute, ne cliquez pas, n'acceptez pas, ne validez pas... En cas de doute, quittez la page web, supprimez le fichier, fermez le logiciel, etc.</p>
<p>Sous Windows, par exemple, un logiciel qui tente de modifier les fichiers système génèrera une boîte de dialogue vous demandant si vous voulez autoriser l'exécution de ce logiciel avec les privilèges administrateur (root). Depuis cette fenêtre, vous pouvez connaître l'emplacement exact de l'exécutable, son éditeur et vérifier l'éventuel certificat numérique de cet éditeur. Si les informations indiquées par Windows à propos de ce logiciel vous paraissent suspectes, refusez lui les privilèges administrateur. Il en va de même sous Mac, où une boîte de dialogue vous demandera de taper le mot de passe administrateur afin de permettre l'exécution du logiciel. Sous Linux, vous devrez exécuter le logiciel en tant qu'administrateur (avec la commande <i>sudo</i>), ce qui suppose que vous lui faites confiance.</p>
<p><a name="312"></a><br />
<h3>#2 - « Si vous ne connaissez pas, ne vous y fiez pas »</h3>
<p></a></p>
<p>De la première règle découle une seconde règle, tout aussi importante : en cas de doute, vous devez présumer le pire.</p>
<p>Par exemple, ne téléchargez pas de logiciels « craqués » ou de cracks sur Internet. Toutes les personnes qui diffusent des logiciels contrefaits ne sont pas des idéalistes libertaires luttant contre la société de consommation. Certaines sont très bien intégrées dans cette société de consommation, et ne vous fournissent gratuitement un logiciel payant que parce qu'elles l'ont préalablement infecté avec un logiciel nuisible qui leur transmettra vos informations personnelles. Pour une sécurité optimale, achetez vos logiciels auprès de leur éditeur.</p>
<p>Ne faites pas non plus confiance aux ordinateurs des cyber-cafés : ils sont probablement sur-infectés, et vous n'avez aucun moyen de le savoir. Ne tapez donc jamais des mots de passe importants, et n'achetez rien en ligne, sur l'ordinateur d'un cyber-café (à moins d'utiliser un système <i>live</i> ; v. <i>infra</i>).</p>
<p>Ne restez pas dans l'ignorance. Si vous avez un doute sur un site, un fichier, un logiciel, consacrez un peu de votre temps à rechercher des informations sur le Web. Vous saurez alors généralement si vous pouvez avoir confiance, ou pas, en fonction de ce qu'en disent les internautes.</p>
<p><a name="313"></a><br />
<h3>#3 - « Un antivirus ne remplace pas votre vigilance »</h3>
<p></a></p>
<p>Nombreux sont les utilisateurs qui installent un antivirus et croient pouvoir ainsi ne plus se préoccuper de la sécurité de leur ordinateur. Cassons tout de suite le mythe : aucun antivirus ne protège contre toutes les menaces. Certains ne protègent tout simplement pas contre un certain type de menaces <a href="http://www.journaldunet.com/solutions/securite/actualite/seules-50-des-suites-de-securite-desinstallent-les-rootkit.shtml">(par exemple, les rootkits)</a>. Tous ignorent certaines menaces appartenant à des types de menaces connus (99% de menaces détectées, ce n'est pas 100%...).</p>
<p>Un antivirus peut, sous Windows, vous permettre de ne pas tomber dans la paranoïa et d'avoir l'esprit un peu plus tranquille. Mais il n'exonère pas pour autant de prendre certaines mesures basiques de sécurité.</p>
<p><a name="314"></a><br />
<h3>#3 - Les 10 règles immuables de la sécurité informatique</h3>
<p></a></p>
<p>Microsoft a publié, dans sa base de données technique destinée aux professionnels, <a href="http://technet.microsoft.com/en-us/library/cc722487.aspx">les 10 règles immuables de la sécurité informatique</a>. Il n'est pas question de discuter ici du caractère exhaustif de cette liste ou de la formulation des règles, mais simplement de les exposer. En voici donc une traduction en français :</p>
<blockquote>
<ol>
<li>Si une personne mal intentionnée vous persuade de lancer son logiciel sur votre ordinateur, ce n'est plus votre ordinateur.</li>
<li>Si une personne mal intentionnée est en mesure de modifier le système d'exploitation de votre ordinateur, ce n'est plus votre ordinateur.</li>
<li>Si une personne mal intentionnée possède un accès physique illimité à votre ordinateur, ce n'est plus votre ordinateur.</li>
<li>Si vous permettez à une personne mal intentionnée de mettre en ligne des logiciels sur votre site Web, ce n'est plus votre site web.</li>
<li>Un mot de passe trop simple rend inopérantes toutes les autres mesures de sécurité.</li>
<li>La sécurité d'un opérateur est proportionnelle au degré de confiance que l'on peut placer en son administrateur.</li>
<li>La sécurité des données chiffrées est proportionnelle à la sécurité de la clé de déchiffrement.</li>
<li>Un antivirus qui n'est pas mis à jour ne vaut pas mieux qu'aucun antivirus.</li>
<li>L'anonymat total est illusoire, tant dans la vie réelle que sur le Web.</li>
<li>La technologie n'est pas la panacée.</li>
</ol>
</blockquote>
<p><a name="315"></a><br />
<h3>#4 - Je suis mon alter ego</h3>
<p></a></p>
<p>Un ordinateur peut être utilisé par plusieurs personnes. Partant de ce constat, les systèmes d'exploitation connaissent la notion d'utilisateur (et celle de compte utilisateur). Dans la philosophie Unix, il existe un utilisateur qui possède plus de droits que les autres : c'est l'administrateur (on dit "root", dans la terminologie Unix), par opposition aux autres utilisateurs qui sont de simples usagers. L'administrateur peut "administrer" le système, c'est-à-dire modifier des fichiers appartenant au système, là où les utilisateurs "normaux" ne peuvent qu'utiliser ces fichiers. </p>
<p>Par exemple, pour installer un nouveau logiciel sur la machine, il faut être administrateur. Une fois ce logiciel installé, il appartient à tous les utilisateurs et possède autant de droits que chacun d'eux. Cela est un peu abstrait ; prenons un exemple en comparant deux hypothèses : 1) un navigateur internet est utilisé par l'administrateur du système, il possède autant de droits que cet utilisateur et peut donc modifier les fichiers du système ; 2) un navigateur internet est utilisé par un utilisateur normal et n'a donc pas le droit d'altérer le système. Imaginons ensuite que l'internaute visite un site infecté et que, par l'exploitation d'une faille de sécurité de son navigateur, un logiciel malveillant tente de modifier le système. Dans la première hypothèse (utilisateur administrateur), le système sera modifié et infecté par le logiciel malveillant ; dans la seconde (utilisateur normal), le système ne sera pas modifié parce que l'utilisateur n'en a pas le pouvoir, l'ordinateur restera donc sain.</p>
<p>Cela étant dit, le conseil est le suivant : <i>utiliser un compte "normal" de façon régulière, et le compte administrateur à titre exceptionnel, lorsqu'il est nécessaire pour réaliser une action interdite aux utilisateurs normaux</i>.</p>
<p>L'on ne pense pas forcément à modifier son compte utilisateur, lorsqu'on est la seule personne à utiliser son ordinateur. En outre, Windows est pr-éinstallé sur la plupart des ordinateurs vendus au grand public, et un compte administrateur est créé lors du premier démarrage (idem pour Mac OS X). Il n'est jamais proposé à l'utilisateur de créer un compte "normal" pour une utilisation de tous les jours, et un compte administrateur pour réaliser certaines actions spéciales. C'est un tort. Pourtant, y remédier est très simple et rapide, il suffit de : 1) créer un nouveau compte utilisateur, 2) définir ce compte comme "administrateur", 3) modifier son propre compte en le dégradant d'administrateur à utilisateur normal.</p>
<p>Voici la procédure pour Windows 7 :</p>
<ul>
<li />Ouvrez le menu Démarrer et tapez <i><b>utilisateur</b></i> dans le champ de recherche ;
<li />Dans le résultats, cliquez sur <i><b>Panneau de configuration</b></i> (en haut de la liste) ;
<li />Une fenêtre s'ouvre. Dans cette fenêtre, cliquez sur <i><b>Ajouter ou supprimer des comptes d'utilisateurs</b></i> ;
<li />Cliquez sur <i><b>Créer un nouveau compte</b></i> ;
<li />Choisissez un nom pour ce compte (par exemple, si votre compte actuel est <i>Tartemol</i>, choisissez quelque chose comme <i>Tartemol_administrateur</i>), cochez la case <b><i>Administrateur</i></b> et cliquez sur le bouton <b><i>Créer le compte</i></b> ;
<li />De retour sur la page affichant la liste des comptes, vous constaterez que le nouveau compte a été créé. Cliquez dessus, afin d'ouvrir une nouvelle page offrant d'autres options de configuration.
<li />Cliquez sur <b><i>Créer un mot de passe</i></b>, puis saisissez le mot de passe du compte (ne l'oubliez pas !) et validez ;
<li />Cliquez ensuite sur <b><i>Gérer un autre compte</i></b> pour retourner sur la page affichant la liste des comptes, et cliquez sur votre propre compte (pas celui qui vient d'être créé, l'autre) ;
<li />Cliquez sur <b><i>Modifier le type de compte</i></b>, cochez la case <b><i>Utilisateur standard</i></b>, et validez.
</ul>
<p><a name="32"></a><br />
<h2>Neutralisation des menaces</h2>
<p></a></p>
<p><a name="321"></a><br />
<h3>#1 - Ne pas connecter un ordinateur directement à Internet</h3>
<p></a></p>
<p>Un ordinateur connecté directement au réseau, sans protection et sous Windows, ne restera pas plus de quelques minutes avant d'être infecté par un logiciel malveillant (probablement un ver). De la même manière, le système sera directement exposé sur le réseau et ses failles de sécurité pourront aisément être exploitées par des personnes mal intentionnées.</p>
<p>Il est donc très important d'éviter toute connexion directe au réseau, en passant par un routeur.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/schema1.png" /></p>
<p>Le schéma ci-dessus expose les deux configurations. Dans le premier cas, l'ordinateur est connecté directement au réseau (avec un modem analogique, par exemple). L'adresse IP visible sur Internet est celle de l'ordinateur. Dans le second cas, l'ordinateur est connecté au routeur, qui lui attribue une adresse IP dans le réseau interne. L'adresse IP visible sur Internet est celle du routeur, et non celle de l'ordinateur.</p>
<p>Sans rentrer dans les détails techniques (que vous trouverez notamment dans l'article <a href="{% post_url /2005/2005-01-05-dairport-et-de-la-livebox %}">sur la Livebox et Airport</a>), on pourrait dire que, schématiquement :<br />
- sans routeur, l'ordinateur reçoit toutes les connexions ouvertes par d'autres ordinateurs depuis Internet ;<br />
- avec un routeur, l'ordinateur ne reçoit aucune connexion de l'extérieur et ne peut communiquer avec d'autres ordinateurs que s'il prend l'initiative de les contacter.</p>
<p>Le routeur fait office de « filtre » entre l'ordinateur et le réseau. Il constitue une première barrière de sécurité efficace et indispensable.</p>
<p><a name="322"></a><br />
<h3>#2 - Utiliser un Firewall</h3>
<p></a></p>
<p>La plupart des routeurs font également office de <i>firewall</i> (« pare-feu ») matériel, c'est-à-dire de dispositif de filtrage des connexions entre votre ordinateur et Internet. Ce premier niveau de protection doit être complété par un second niveau logiciel, sur l'ordinateur.</p>
<p>Les firewalls logiciels permettent en effet une protection beaucoup plus fine que les firewalls des « box » Internet des fournisseurs d'accès. Schématiquement, le routeur matériel (du moins, tel que présent dans les « box » des fournisseurs d'accès français) se limite à n'autoriser que les connexions qui suivent une certaine route, sans se préoccuper de leur provenance et de leur destination. Les firewalls logiciels permettent d'interdire des connexions en fonction de leur provenance ou de leur destination, même si elles passent par la bonne route.</p>
<p>Les firewalls logiciels <i>bidirectionnels</i> agissent sur les connexions <i>entrantes</i> (d'Internet vers votre ordinateur) et les connexions <i>sortantes</i> (de votre ordinateur vers Internet). Les deux types de filtrage sont complémentaires :<br />
- un bon filtrage des connexions entrantes réduit les risques d'infection (par des vers, notamment) et l'exploitation des failles de sécurité ;<br />
- un bon filtrage sortant permet, en cas d'infection, d'empêcher les données de l'ordinateur d'être communiquées à des tiers par Internet.</p>
<p>Le firewall intégré à Windows 7 est paramétré par défaut pour filtrer les connexions entrantes : il les refuse toutes, sauf celles qui correspondent à une demande de l'utilisateur. En revanche, il ne filtre aucune connexion sortante : elles sont toutes autorisées. Il est donc nécessaire de modifier ce dernier paramétrage, afin de refuser toutes les connexions sortantes, sauf celles expressément autorisées par l'utilisateur. C'est une condition insuffisante à elle seule, mais absolument nécessaire, à la neutralisation des logiciels espion.</p>
<p><a name="3221"></a><br />
<h4>Paramétrer le Firewall de Windows 7</h4>
<p></a></p>
<p>1) Ouvrez le <b>menu Démarrer</b>, puis le <b>Panneau de configuration</b>. Allez dans <b>Système et sécurité</b>, puis <b>Pare-feu Windows</b> et cliquez, dans le menu à gauche de la fenêtre, sur <b>Paramètres avancés</b>.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/win7firewall0.png" /></p>
<p>2) Cliquez ensuite sur <b>Propriétés du pare-feu Windows</b>, au centre de la fenêtre de configuration.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/win7firewall1.png" /></p>
<p>3) Dans les 3 onglets <i>Profil du domaine</i>, <i>Profil privé</i> et (surtout) <i>Profil public</i>, sélectionnez <b>Bloquer</b> dans le menu déroulant <b>Connexions sortantes</b>. Cliquez également sur le bouton <b>Personnaliser...</b> et vérifiez que toutes les cases sont cochées. Validez les modifications et fermez la fenêtre en cliquant sur <b>OK</b>.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/win7firewall2.png" /></p>
<p>Après ces trois étapes, toutes les connexions sortantes sont bloquées. Cela signifie plus aucun de vos logiciels n'a accès à Internet. Il faut donc ensuite autoriser « manuellement » les connexions sortantes pour certaines logiciels, en lesquels vous avez confiance. Les étapes suivantes sont à répéter pour chaque logiciel que vous voulez autoriser à envoyer des données par Internet. </p>
<p>4) En haut à gauche de la fenêtre du logiciel d'administration du firewall de Windows (si vous n'avez plus cette fenêtre, reportez-vous à l'étape 1. ci-dessus), cliquez sur <b>Règles de trafic sortant</b>, puis, dans la partie droite de la même fenêtre, cliquez sur <b>Nouvelle règle</b>.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/win7firewall3.png" /></p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/win7firewall4.png" /></p>
<p>5) L'assistant de création de règles personnalisées s'affiche à l'écran. La première page de l'assistant vous propose de choisir le type de règle. Vous pouvez en effet créer des règles relatives aux logiciels, aux ports, aux services Windows, ou à plusieurs de ces éléments en même temps. Le plus simple est de créer une règle par logiciel : sélectionnez
<p>Programme</b> et cliquez sur <b>Suivant</b>.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/win7firewall5.png" /></p>
<p>6) Sélectionnez <b>Au programme ayant pour chemin d'accès...</b>, cliquez sur <b>Parcourir...</b> et sélectionnez le fichier exécutable (se terminant par « .exe ») du logiciel que vous voulez autoriser. Vous trouverez vos logiciels dans <i>C:\Program Files\</i> ou <i>C:\Programmes\</i>. En l'occurrence, nous avons choisi de créer la règle pour Internet Explorer. Cliquez sur <b>Suivant</b>.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/win7firewall6.png" /></p>
<p>7) Sélectionnez <b>Autoriser la connexion</b>, puis cliquez sur <b>Suivant</b>.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/win7firewall7.png" /></p>
<p>8) Sélectionnez <b>Domaine</b> et <b>Privé</b>. Ne sélectionnez <b>Public</b> que pour les logiciels vraiment indispensables que vous êtes susceptibles d'utiliser avec une connexion dans un lieu public (par exemple, un navigateur internet ou un logiciel de messagerie). Cliquez sur <b>Suivant</b>.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/win7firewall8.png" /></p>
<p>9) Donnez un nom à la règle. Indiquer le nom du logiciel est une bonne idée. Cliquez ensuite sur <b>Terminer</b>.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/win7firewall9.png" /></p>
<p>Vous pouvez vérifier que la règle a bien été créée dans la liste des règles du trafic sortant. Les règles actives ont une pastille verte à gauche de leur nom, tandis que les règles inactives ont une pastille grise. N'activez une règle que si vous êtes certain d'en avoir besoin.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/win7firewall10.png" /></p>
<p><a name="3222"></a><br />
<h4>Utiliser un firewall tiers</h4>
<p></a></p>
<p>Le firewall intégré à Windows 7 est parfaitement efficace et suffisant pour une utilisation domestique. Il présente également l'avantage d'être gratuit et préinstallé avec le système. La procédure de création de règles personnalisées pour chaque logiciel peut toutefois se révéler rapidement fastidieuse. Vous pouvez donc lui préférer un firewall commercial qui vous permettra de créer des règles plus facilement et plus rapidement.</p>
<p>Les firewalls commerciaux sont nombreux sous Windows. En voici quelques uns :<br />
- <a href="http://www.zonealarm.com/">ZoneAlarm</a><br />
- <a href="http://personalfirewall.comodo.com/">Comodo</a><br />
- <a href="http://www.eset.com/smartsecurity/">ESET SmartSecurity</a><br />
- <a href="http://www.kaspersky.com/fr/">Kaspersky</a><br />
- <a href="http://www.symantec.com/fr/">Norton</a></p>
<p>Quel que soit votre choix, pensez à vérifier que le firewall puisse être paramétré de manière à vous proposer la création d'une règle pour chaque nouvelle connexion (Norton le permet, Kaspersky non). Voici un exemple de la fenêtre qu'ouvre le firewall d'ESET lorsqu'il détecte une nouvelle connexion ne correspondant à aucune règle existante :</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/esetfirewall.png" /></p>
<p><a name="3223"></a><br />
<h4>Utiliser un Firewall sur Mac</h4>
<p></a></p>
<p>Bien qu'il n'existe, à l'heure actuelle, aucune menace <i>sérieuse</i> sur Mac, le filtrage des connexions sortantes n'est pas superflu, ne serait-ce que pour <i>avoir le choix</i> de permettre ou d'interdire à vos logiciels de communiquer avec l'extérieur. </p>
<p>L'excellent <a href="http://www.obdev.at/products/littlesnitch/index.html">Little Snitch</a> vous permet d'intercepter toute connexion sortante et de créer une règle en quelques clics. Little Snitch est un firewall unidirectionnel (il ne filtre que le trafic sortant), mais il est particulièrement bien réalisé. Ainsi, lorsqu'une connexion sortante est détectée, Little Snitch vous permet d'autoriser ou de refuser la connexion :<br />
- pour ce logiciel / vers le serveur contacté / sur le port utilisé / sur le port et vers le serveur<br />
- une fois / juqu'à la fermeture du logiciel / pour toujours.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/littlesnitch.png" /></p>
<p>Mac OS X est par ailleurs livré avec un firewall intégré, qui n'est pas activé par défaut. Pour l'activer, il faut se prendre dans le <i>menu Pomme > Préférences système > section Sécurité > onglet Coupe-feu</i>.</p>
<p><a name="3224"></a><br />
<h4>Le filtrage des connexions sortantes n'est pas toujours suffisant</h4>
<p></a></p>
<p>Le filtrage des connexions sortantes est nécessaire, mais insuffisant. En effet, le filtrage manuel, tel que présenté ici, pose plusieurs problèmes majeurs.</p>
<p>En premier lieu, il ne protège pas contre l'injection d'un code malicieux dans un logiciel fiable. Le scénario est le suivant : vous autoriser un logiciel en lequel vous avez confiance (par exemple, Internet Explorer) ; vous êtes infecté par un malware qui modifie ce logiciel, afin de faire passer par lui ses connexions vers Internet ; votre firewall respecte la règle autorisant les connexions de ce logiciel, sans savoir qu'il a été modifié. Il est donc indispensable, sous Windows, de compléter le filtrage des connexions sortantes par d'autres techniques, notamment un antivirus (au sens large) et un système permettant de détecter les modifications malveillante de vos logiciels.</p>
<p>En deuxième lieu, le paramétrage manuel des connexions sortantes peut vous amener à créer, par inadvertance, une règle permissive qui supplante les autres règles. Considérez par exemple les règles suivants : <i>bloquer toutes les connexions</i> ; <i>autoriser les connexions sur le port 80</i> ; <i>autoriser les connexions du logiciel X</i>. Aucune règle ne concerne spécifiquement le logiciel Y, il tombe donc sous le coup de la première règle, qui bloque toutes les connexions. Cependant, si le logiciel Y tente de communiquer par le port 80, la deuxième règle autorisera cette connexion. Il faut donc prendre garde à créer les règles les plus spécifiques possibles. A cet égard, <i>Little Snitch</i>, sur Mac, est très efficace puisqu'il permet de définir, pour chaque logiciel, le port <u>et</u> le serveur distant.</p>
<p>En troisième lieu, plus les règles sont précises, plus il doit y avoir de règles. La nécessité incessante de créer de nouvelles règles peut rapidement déranger l'utilisateur, qui prendra l'habitude d'accepter la connexion sans lire le message d'alerte. C'est l'effet « yes-whatever-button » constaté par les ingénieurs de Microsoft à propos de Windows Vista : à la <i>nième</i> alerte, l'utilisateur se dira <i>« encore un message, on s'en fiche, je clique sur oui »</i>. Il ne faut jamais relâcher sa vigilance, quitte à perdre quelques secondes. C'est la première leçon en matière de sécurité.</p>
<p><a name="3225"></a><br />
<h4>Ressources firewall et réseau</h4>
<p></a></p>
<p>Divers outils en ligne permettent de tester l'efficacité de votre firewall et la cohérence de votre politique NAT :<br />
- <a href="https://www.grc.com/x/ne.dll?bh0bkyd2">ShieldsUp!</a><br />
- <a href="http://www.hackerwatch.org/probe">McAfee HackerWatch</a><br />
- <a href="http://www.inoculer.com/scannerdeports.php">Inoculer.com</a><br />
- <a href="http://security.symantec.com/sscv6/WelcomePage.asp">Norton Security Scan</a><br />
- <a href="http://www.pcflank.com/test.htm">PCFlank</a><br />
- <a href="http://www.zebulon.fr/outils/scanports/test-securite.php">Zebulon.fr</a> (en français)</p>
<p>Plus de renseignements (techniques) sur les Firewalls :<br />
- <a href="http://tauceti.jonction.free.fr/firew_nm.htm">tauceti.jonction.free.fr</a></p>
<p>Tests et classement des firewall pour Windows :<br />
- <a href="http://www.matousec.com/projects/proactive-security-challenge/results.php">Matousec.com</a></p>
<p>Liste des firewalls et utilitaires de sécurité pour Windows :<br />
- <a href="http://www.spywarewarrior.com/uiuc/main.htm">SpywareWarrior</a></p>
<p><a name="323"></a><br />
<h3>#3 - Mettre régulièrement à jour ses logiciels</h3>
<p></a></p>
<p>La mise à jour régulière des logiciels est impérative afin de garantir la sécurité d'un ordinateur.</p>
<p>Contrairement à ce que l'on pourrait penser, les logiciels ne sont plus, depuis longtemps, de simples mécanismes qui se contentent de faire une seule chose, d'une seule manière. Les logiciels sont de plus en plus complexes : ils permettent de faire de plus en plus de choses, et souvent d'obtenir un résultat de plusieurs manières. L'auteur d'un logiciel peut prévoir les résultats d'une action dans un certain contexte. Mais il ne peut pas envisager toutes les situations dans lesquelles cette action survient, qui sont susceptibles d'en modifier le résultat. Toutes ces situations imprévues constituent potentiellement des « failles de sécurité » ou des « bugs », lorsqu'elles aboutissent à l'altération du bon fonctionnement d'un logiciel. Les mises à jour des logiciels permettent de corriger les bugs et de <a href="http://www.clubic.com/forum/logiciel-general/assurer-la-protection-de-votre-pc-id142328-page1.html#1530230">combler les failles de sécurité</a>.</p>
<p>Il est également important de mettre à jour les définitions des logiciels de protection (antivirus, firewall, filtre IP, anti-spyware, etc.) afin de prendre en compte les nouvelles menaces.</p>
<p>Enfin, la mise à jour des pilotes matériel (« drivers »), sous Windows, peut améliorer la prise en charge de vos périphériques par le système, le rendant ainsi plus stable.</p>
<p>Il faut donc faire régulièrement les mises à jour :<br />
- du système d'exploitation (Panneau de configuration > Windows Update ; Pomme > Mise à jour de logiciels... sous Mac ; ou votre gestionnaire de paquets sous Linux) ;<br />
- de vos logiciels ;<br />
- des signatures de vos logiciels de protection ;<br />
- de vos pilotes, sous Windows.</p>
<p><a name="324"></a><br />
<h3>#4 - Utiliser les logiciels de sécurité adaptés aux menaces</h3>
<p></a></p>
<p><a href="http://home.mcafee.com/AdviceCenter/Default.aspx?id=ad_spyware">Un antivirus ne fait pas tout</a>. Il protège contre les virus et les vers, mais pas forcément contre les autres types de menaces portant sur vos données personnelles et votre vie privée, malgré <a href="http://www.journaldunet.com/solutions/securite/dossier/07/1003-enquete-votre-antivirus/11.shtml">les voeux des utilisateurs</a>. Installez donc, de préférence, un antivirus qui protège, au sens large, contre les logiciels nuisibles. Complétez cette installation par celle de logiciels spécialisés dans la lutte contre un type précis de menaces.</p>
<p>Pour vous protéger <i>spécifiquement</i> contre les logiciels espion et publicitaires, sous Windows 7 :<br />
- <a href="http://www.microsoft.com/windows/products/winfamily/defender/default.mspx">Microsoft Windows Defender</a> (intégré dans l'antivirus Microsoft Security Essentials)<br />
- <a href="http://www.safer-networking.org/fr/index.html">Spybot Search&Destroy</a><br />
- <a href="http://www.malwarebytes.org/">Malwarebytes' Anti-Malware</a><br />
- <a href="http://www.javacoolsoftware.com/spywareblaster.html">SpywareBlaster</a><br />
- <a href="http://www.superantispyware.com/">SUPERAntiSpyware</a><br />
- <a href="http://www.lavasoft.fr/">Ad-Aware</a><br />
- <a href="http://www.glaryutilities.com/">Glary Utilities</a><br />
- etc.</p>
<p>Pour détecter <i>spécifiquement</i> les rootkits :<br />
- <a href="http://www.gmer.net/">GMER</a> (Windows)<br />
- <a href="http://technet.microsoft.com/fr-fr/sysinternals/bb897445.aspx">MS RootkitRevealer</a> (Windows)<br />
- <a href="http://www.trendmicro.com/download/rbuster.asp">RootkitBuster</a> (Windows)<br />
- <a href="http://www.f-secure.com/en_EMEA/products/technologies/blacklight/">F-Secure Blacklight</a> (Windows)<br />
- <a href="http://fr.wikipedia.org/wiki/RkU">Rootkit Unhooker</a> (Windows)<br />
- <a href="http://mail2.ustc.edu.cn/~jfpan/">IceSword</a> (Windows)<br />
- <a href="http://fr.wikipedia.org/wiki/DarkSpy">DarkSpy</a> (Windows)<br />
- <a href="http://www.chkrootkit.org/">chkrootkit</a> (Unix)<br />
- <a href="http://rkhunter.sourceforge.net/">rkhunter</a> (Unix)<br />
- <a href="http://www.antirootkit.com/index.htm">[D'autres utilitaires anti-rootkit]</a></p>
<p>Ces logiciels n'offrent pas de protection en temps réel (du moins, pas tous et pas dans leurs versions gratuites), contrairement aux antivirus commerciaux. Cela n'est pas vraiment nécessaire. Ils permettent en revanche d'analyser l'ordinateur « manuellement », ou suivant une planification. Une analyse par semaine (précédée d'une mise à jour des définitions), est généralement suffisante. Eventuellement, vous pouvez procéder à une analyse après avoir installé de nouveaux logiciels, et avant de les utiliser.</p>
<p>Pour vous protéger en temps réel contre les menaces les plus importantes (virus, vers...) :<br />
- <a href="http://www.microsoft.com/Security_Essentials/">Microsoft Security Essentials</a> (gratuit, léger)<br />
- <a href="http://www.free-av.com/">Avira</a> (gratuit, léger)<br />
- <a href="http://www.eset-nod32.fr/">ESET Nod32</a> (léger et efficace)<br />
- <a href="http://www.kaspersky.com/fr/">Kaspersky</a> (lourd mais très complet)<br />
- <a href="http://www.symantec.com/fr/">Norton</a> (lourd mais très complet)<br />
- <a href="http://www.avgfrance.com/">AVG</a><br />
- <a href="http://www.f-secure.com/fr_FR/">F-Secure</a><br />
- <a href="http://home.mcafee.com/Default.aspx">McAfee</a><br />
- <a href="http://www.bitdefender.fr/">BitDefender</a><br />
- <a href="http://www.gdata.fr/">G-Data</a><br />
- etc.</p>
<p>Pour une comparaison des différents antivirus, v. :<br />
- <a href="http://www.av-comparatives.org/">AV-Comparatives.org</a> (en anglais -- les meilleurs comparatifs)<br />
- <a href="http://infomars.fr/WordPress/peghorse/">PegHorse's Blog</a> (tests en situation réelle, dans des vidéos en français)<br />
- <a href="http://av-test.org/">AV-Test.org</a> (en anglais)<br />
- <a href="http://anti-virus-software-review.toptenreviews.com/">TopTenReviews</a> (en anglais)<br />
- <a href="http://www.cnet.com/topic-reviews/antivirus.html">CNET</a> (en anglais)<br />
- <a href="http://www.firewallguide.com/anti-virus.htm">Firewallguide.com</a><br />
- <a href="http://www.pcworld.fr/article/materiel/logiciels/comparatif-de-8-anti-virus/107551/">PCWorld</a><br />
- <a href="http://www.clubic.com/article-77079-1-guide-comparatif-meilleur-antivirus.html">Clubic</a><br />
- etc.</p>
<p>Vous pouvez également compléter votre logiciels antivirus et vos logiciels anti-spywares avec la consultation régulière de sites spécialisés, proposant des analyses en ligne basées sur des définitions des menaces actualisées en temps réel :<br />
- <a href="http://www.inoculer.com/">Inoculer.com</a> (en français)<br />
- <a href="http://security.symantec.com/sscv6/WelcomePage.asp">Symantec Security Check</a><br />
- <a href="http://home.mcafee.com/Downloads/FreeScan.aspx">McAfee Free Scan</a><br />
- <a href="http://usa.kaspersky.com/downloads/free-virus-scanner.php">Kaspersky Free Virus Scanner</a><br />
- <a href="http://www.pandasecurity.com/activescan/index/">Panda ActiveScan</a> et <a href="http://www.malwareradar.com/">MalwareRadar</a><br />
- <a href="http://www.f-secure.com/en_EMEA/security/security-lab/tools-and-services/online-scanner/">F-Secure Online Scanner</a><br />
- <a href="http://www.bitdefender.com/scanner/online/free.html">BitDefender Online Scanner</a><br />
- <a href="http://onlinescan.avast.com/">Avast OnlineScan</a><br />
- etc.</p>
<p>Enfin, en cas d'infection, il vous faudra probablement utiliser un logiciel spécialisé dans la désinfection (v. <i>infra</i>) :<br />
- <a href="http://www.kaspersky.com/fr/removaltools">Logiciels de désinfection Kaspersky</a><br />
- <a href="http://www.symantec.com/avcenter/tools.list.html">Logiciels de désinfection Norton</a><br />
- <a href="http://www.secuser.com/telechargement/desinfection.htm">Logiciels de désinfection Secuser</a><br />
- <a href="http://vil.nai.com/vil/stinger/">Logiciel générique de désinfection Stinger (McAfee)</a><br />
- <a href="http://www.clubic.com/telecharger-fiche18865-avast-cleaner.html">Logiciel générique de désinfection Avast Cleaner</a></p>
<p>Pour plus d'informations sur l'évolution des menaces en temps réel :<br />
- <a href="http://www.viruslist.com/fr/index.html">Kaspersky Viruslist</a> (en français)</p>
<p>Liste des antivirus/malware et utilitaires de sécurité pour Windows :<br />
- <a href="http://www.spywarewarrior.com/uiuc/main.htm">SpywareWarrior</a></p>
<p><a name="325"></a><br />
<h3>#5 - Désactiver scripts, macros et plugins</h3>
<p></a></p>
<p>Les scripts, macros et plugins sont des moyens parfaitement légitimes de rendre les fichiers ou les pages web « interactifs ». Ils sont indispensables pour réaliser certaines opérations et, plus généralement, très utiles afin d'améliorer l'ergonomie d'une interface. Il existe cependant des scripts, macros et des applications reposant sur certains plugins, qui sont extrêmement malveillants. Par exemple, un virus peut être transmis dans un fichier MS Word, à l'aide d'une macro ; un fichier PDF ou un bandeau Flash, chargés dans un navigateur, peuvent exploiter une faille de sécurité afin de nuire à l'ordinateur, etc.</p>
<p>La meilleure façon de se protéger contre ce type de menaces est de désactiver par défaut l'exécution des scripts, macros et plugins, et d'autoriser, au cas par cas, les scripts, macros et plugins sur les sites web ou dans les fichiers en lesquels on a confiance.</p>
<p><a name="3251"></a><br />
<h4>Désactiver les macros</h4>
<p></a></p>
<p>Les macros sont des programmes exécutables insérés à l'intérieur de certains fichiers, qui le permettent (la plupart des fichiers ne le permettent pas). La plupart des macros malveillantes sont insérées dans des fichiers Microsoft Office, afin de viser une grande audience.</p>
<p>Pour se protéger contre les macros MS Office :<br />
- analyser les fichiers MS Office reçus avant votre antivirus ;<br />
- désactiver par défaut les macros dans MS Office, et ne les autoriser, pour un fichier donné, que si l'on est sûr que ce fichier n'est pas nuisible.</p>
<blockquote><p>
Dans Microsoft Word 2010, allez dans le menu <b>Fichier</b> et cliquez sur <b>Options</b>. Dans le menu à gauche de la fenêtre qui s'ouvre, sélectionnez <b>Centre de gestion de la confidentialité</b> puis, dans la partie droite de la même fenêtre, cliquez sur <b>Paramètres du Centre de gestion de la confidentialité</b>. Une troisième fenêtre s'ouvre. Dans le menu à gauche de cette fenêtre, cliquez sur <b>Paramètres des macros</b> puis, dans la partie droite, sélectionnez <b>Désactiver toutes les macros avec notification</b>.</p>
<p>NB : l'option <b>Désactiver toutes les macros à l'exception des macros signées numériquement</b> n'est <u>pas</u> sûre, dès lors qu'il est possible d'auto-signer une macro avec une fausse signature numérique.
</p></blockquote>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/macros-msword2010.png" /></p>
<p><a name="3252"></a><br />
<h4>Désactiver les scripts et plugins dans les pages Web</h4>
<p></a></p>
<p>En premier lieu, et sans discussion possible, il ne faut plus utiliser Internet Explorer. Le navigateur peut être installé par défaut, rapide, beau, pratique, il n'en demeure pas moins qu'il n'est pas sécurisé. En outre, compte tenu de sa part de marché écrasante, il est le premier navigateur ciblé par les auteurs de logiciels malveillants.</p>
<p>Il est préférable d'installer <a href="http://www.mozilla-europe.org/fr/firefox/">Mozilla Firefox</a> avec les extensions suivantes :<br />
- <a href="https://addons.mozilla.org/fr/firefox/addon/1865">AdBlock Plus</a><br />
- <a href="https://addons.mozilla.org/fr/firefox/addon/722">NoScript</a></p>
<p>La première extension, AdBlock Plus, permet de bloquer les éléments publicitaires contenus dans les pages Web. Sa fonction première n'est pas de renforcer la sécurité du navigateur, mais il y concourt. En effet, de nombreuses menaces passent, sur le Web, par des bandeaux publicitaires. AdBlock Plus bloque par défaut la plupart des publicités. Il insère un bouton dans la barre d'outils de Firefox qui permet à l'utilisateur d'autoriser l'affichage de certains éléments, ou de tous les éléments, d'une page donnée.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/adblock2.png" /></p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/adblock1.png" /></p>
<p>La seconde extension, NoScript, permet de bloquer tous les scripts et plugins des pages Web en permettant, à l'instar d'AdBlock Plus, de les activer au cas par cas, ponctuellement ou pour toujours, pour un site donné. La plupart des sites font aujourd'hui une utilisation intensive des scripts et des plugins. Aussi, de nombreux sites cesseront de fonctionner avec les réglages par défaut de NoScript. Il vous faudra alors les autoriser, ce qui ne prendra pas plus de quelques secondes -- et ce quelques secondes sont un mal devenu absolument nécessaire, compte tenu du nombre de menaces reposant sur les scripts et plugins.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/noscript2.png" /></p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/noscript1.png" /></p>
<p><a name="326"></a><br />
<h3>#6 - Nettoyer les cookies et le cache de navigation</h3>
<p></a></p>
<p>Les cookies ne sont pas des menaces « actives » : ce ne sont pas des programmes exécutables qui nuiront à votre système. En revanche, certains cookies malicieux (appelés des « cookies traceurs » ou « tracking cookies ») ont pour objet de transmettre certaines des informations permettant de « profiler » l'utilisateur.</p>
<p>La plupart des suites de sécurité (v. <i>supra</i>) permettent de détruire les cookies traceurs. Vous pouvez également utiliser des outils gratuits, tels que <a href="http://www.ccleaner.com/">CCleaner</a> (Windows, gratuit) ou <a href="http://www.titanium.free.fr/index.html">Onyx</a> (Mac, gratuit), pour supprimer <i>tous</i> les cookies. </p>
<p>Enfin, la plupart des navigateurs modernes proposent une fonction permettant d'effacer les cookies. Dans Firefox, cette fonction est accessible dans le menu <b>Outils</b>, puis <b>Supprimer l'historique récent...</b>.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/ffhistorique.png" /></p>
<p>Nettoyez aussi l'historique de votre navigateur si vous désirez préserver l'intimité de votre vie privée. Ce conseil est souvent donné, mais jamais expliqué. Il ne s'agit pas de se protéger contre des personnes qui viendraient physiquement fouiner sur l'ordinateur pour voir les pages web visitées, mais contre des sites malveillants qui profilent les internautes à l'aide de leur historique de navigation. Les navigateurs permettent en effet aux sites Web d'accéder à l'historique de navigation, afin de déterminer quels liens ont déjà été suivis (ils seront affichés en violet, par défaut) et quels autres ne l'ont pas été (ils seront affichés en bleu par défaut). Un site malveillant contiendra typiquement plusieurs centaines de liens, affichés en blanc sur fond blanc (par exemple) afin de rester invisibles, et un script permettant de déterminer lesquels ont déjà été visités. Il suffit alors à ce site d'associer les adresses des sites visités avec l'adresse IP (ou le compte utilisateur) de l'internaute, afin de le profiler. Le site <a href="http://www.whattheinternetknowsaboutyou.com/">whattheinternetknowsaboutyou.com</a> met en oeuvre cette technique pour démonstration.</p>
<p><a name="33"></a><br />
<h2>Suppression des menaces</h2>
<p></a></p>
<p>Malgré tous les moyens de protection précédemment exposés, il se peut qu'un logiciel malveillant parvienne à s'installer. Les différentes protection suggérées ici, notamment le filtrage des connexions sortantes (v. <i>supra</i>) et des IP (v. <i>infra</i>), devraient l'empêcher de transmettre vos informations personnelles sur le réseau. Ce n'est cependant pas une raison pour conserver cette menace. Or, la suppression des logiciels malveillants peut se révéler très difficile. Ces logiciels, en plus de se cacher de l'utilisateur, ont pour habitude de prendre des mesures visant à empêcher leur suppression ou à rendre le système inutilisable en cas de suppression. Afin de contourner ces mesures, les éditeurs de logiciels antivirus fournissent de petits programmes visant à supprimer tel ou tel logiciel nuisible. Ces programmes sont parfois difficiles à manier (exécution en mode sans échec, depuis un LiveCD, depuis la ligne de commande, etc.), mais leur utilisation peut être la seule manière de se débarrasser d'un logiciel nuisible particulièrement coriace.</p>
<blockquote><p>
Si votre antivirus ou anti-malware identifie une menace, procédez ainsi :</p>
<p>1) Notez le nom et les références du logiciel nuisible détecté.</p>
<p>2) Recherchez des informations sur le Web à propos de ce logiciel (commencez par taper son nom sur Google et poursuivez en lisant ce qui est dit à son propos sur les forums spécialisés). Cette étape est absolument nécessaire. Ne vous contentez jamais de supprimer un fichier sans vous être renseigné à son propos. En effet, les conséquences peuvent être désastreuses : le logiciel espion n'est pas supprimé ; vous avez <i>supprimé</i> un fichier infecté qui est nécessaire au système d'exploitation, alors qu'il aurait fallu le <i>nettoyer</i> (résultat, votre système est inutilisable), etc.</p>
<p>3) Sauf contre indication résultant de l'étape 2), tentez de supprimer le logiciel nuisible à l'aide du logiciel anti-malware qui l'a identifié ; si cela fonctionne, relancez l'analyse de votre ordinateur pour confirmer la suppression, sinon passez à l'étape suivante ;</p>
<p>4) Recherchez un utilitaire spécialisé dans la suppression de cette menace, réalisé par un éditeur d'anti-virus et <i>lisez attentivement son mode d'emploi</i> ; si cela fonctionne, relancez l'analyse de votre ordinateur pour confirmer la suppression, sinon passez à l'étape suivante ;</p>
<p>5) Suivez les instructions données sur le Web pour supprimer le menace manuellement.</p>
<p>6) Si rien de tout cela n'a fonctionné, sauvegardez vos données, formatez votre disque dur et réinstallez le système.
</p></blockquote>
<p><a name="4"></a><br />
<h1>Lutte contre les menaces (conseils avancés)</h1>
<p></a></p>
<p><a name="41"></a><br />
<h3>1# - Identifier les services et processus en cours</h3>
<p></a></p>
<p>Les logiciels en cours d'exécution sont représentés, dans le gestionnaire de tâches du système d'exploitation, dans leurs processus actifs. Un utilisateur familiarisé par les processus légitimes habituellement actifs sur son système (même s'ils ont des noms « barbares »), saura repérer d'un coup d'oeil tout nouveau processus révélant l'exécution d'un logiciel malveillant.</p>
<p>Sous Windows, faites un clic droit sur la barre de tâches du menu Démarrer et sélectionnez <b>Démarrer le Gestionnaire des tâches</b> dans le menu déroulant. Activez ensuite l'onglet <b>Processus</b> et cliquez sur le bouton <b>Afficher les processus de tous les utilisateurs</b> (afin de voir les logiciels exécutés en tant que <i>root</i> - sur l'utilisateur root, v. <i>supra</i>).</p>
<p>Certains logiciels vont plus loin, en décomposant les processus et en affichant plus de détails ; ils sont réservés à un public averti. On peut citer <a href="http://technet.microsoft.com/en-us/sysinternals/bb896653.aspx">MS Process Explorer</a> et <a href="http://technet.microsoft.com/fr-fr/sysinternals/bb896645.aspx">MS Process Monitor</a> (voir aussi <a href="http://technet.microsoft.com/en-us/sysinternals/bb795533.aspx">les autres outils Microsoft</a>), ou le célèbre <a href="http://www.hijackthis.de/fr">Hijackthis</a>. </p>
<p>On peut également trouver, sur le Web, des informations relatives aux processus :<br />
- <a href="http://callways.com/liste_process-windows.htm">Liste non-exhaustive des processus Windows légitimes</a><br />
- <a href="http://cs76.free.fr/processus-a.php">Liste non-exhaustive des processus malicieux sous Windows</a></p>
<p>Dans la version 2010 de sa suite de sécurité Norton 360, Symantec a implémenté une fonction de validation des processus par la communauté des utilisateurs (<a href="http://en.wikipedia.org/wiki/Norton_Insight">Norton Insight</a>), afin de permettre à ces derniers d'obtenir plus d'informations sur un processus inconnu et d'en vérifier la légitimité.</p>
<p>Sous Mac OS, ouvrez le <b>Moniteur d'activité</b> situé dans <i>/Applications/Utilitaires/</i>.</p>
<p>Plus généralement, avec les systèmes Unix (Mac OS X, Linux, *BSD, etc.), la commande <b><i>sudo crontab -l</i></b> (à taper dans le terminal) permet de révéler l'exécution programmée d'un processus malveillant sous l'autorité du compte root. La réponse <i>no cronjob for root</i> (ou équivalente) indique l'absence de tâche planifiée pour l'utilisateur root. C'est la situation normale sous Mac OS X, où <a href="http://www.macworld.com/article/60823/2007/10/trojanhorse.html">plusieurs chevaux de Troie connus</a> peuvent être repérés par l'ajout d'un cronjob identifié, par la commande précitée par une ligne du type : <i>* * * * * "/Library/Internet Plug-Ins/plugins.settings">/dev/null 2>&1</i>.</p>
<p>Il est important de noter que :<br />
- cette procédure ne révèle que les exécutable en cours d'exécution, elle est donc inefficace contre les menaces non-exécutables (les cookies traceurs, par exemple) ;<br />
- elle ne permet donc pas de révéler les scripts ou les injections s'exécutant à l'intérieur d'un logiciel légitime (seuls les processus du logiciel légitime apparaîtront) ;<br />
- elle ne permet pas de révélée les processus cachés, notamment par un rootkit.</p>
<p><a name="42"></a><br />
<h3>2# - Filtrer les IP</h3>
<p></a></p>
<p>Le filtrage des adresses IP est un moyen de protection très efficace contre les menaces provenant du Web. Ce procédé permet de bloquer <i>le site qui contient la menace</i>. Il intervient donc avant que la menace elle-même doive être analysée par d'autres outils, comme un firewall ou un antivirus. Toutefois, en raison de l'évolution permanente du réseau Internet, le filtrage des IP ne peut pas être exhaustif. En conséquence :<br />
- le filtrage des IP est un des moyens de protection les plus efficaces, lorsque l'IP en cause est effectivement identifiée comme permettant la diffusion d'un logiciel malicieux ;<br />
- le filtrage est totalement inopérant si l'adresse IP n'est pas identifiée (s'il s'agit d'un site <i>miroir</i>, par exemple).</p>
<p>Le filtrage des IP doit être mis en oeuvre en plus des autres moyens de protection, à l'aide d'un logiciel spécialisé. On peut citer <a href="http://www.malwarebytes.org/">Malwarebytes's Anti-Malware</a> (Windows, version payante) ou <a href="http://phoenixlabs.org/pg2/">PeerGuardian</a> (Windows, Mac, Linux, gratuit), notamment.</p>
<p><a name="43"></a><br />
<h3>3# - Utiliser un VPN</h3>
<p></a></p>
<p>L'installation d'une connexion VPN ne fournit pas une protection contre les logiciels malicieux. J'ai toutefois décidé de parler des connexions VPN dans cet article, car elles constituent un moyen de protéger ses données personnelles et sa vie privée en anonymisant sa connexion. « VPN » est l'abréviation de <i>Virtual Private Network</i> ou <i>Réseau privé virtuel</i>. Pour comprendre ce que cela signifie, il faut revenir un instant sur le fonctionnement d'Internet.</p>
<p><a name="431"></a><br />
<h4>Structure du réseau Internet</h4>
<p></a></p>
<p>Internet est le « réseau des réseaux » <i>(inter-networks)</i>, c'est-à-dire un réseau global de réseaux locaux. Un réseau local est un réseau d'ordinateurs situés derrière une même passerelle. Un foyer peut avoir, par exemple, un ordinateur fixe, un ordinateur portable et un iPhone, connectés à une « box » (Livebox, Freebox, etc.). La « box » est la passerelle, qui se voit assigner une adresse IP par le fournisseur d'accès (FAI). A son tour, la passerelle assigne une adresse IP à chaque périphérique connecté à elle. L'ensemble des périphériques constitue le réseau local, connecté par la « box » aux ordinateurs du FAI. On appelle cet ensemble un « noeud ». Le réseau du FAI, composé des réseaux locaux de ses abonnés, intègre un réseau plus vaste, par exemple le réseau français. Ce réseau est lui même intégré dans un réseau plus vaste, par exemple le réseau ouest-européen, et ainsi de suite. Ce que l'on appelle « Internet », c'est le plus haut niveau possible : l'ensemble de tous les réseaux de plus bas niveau.</p>
<p>Lorsqu'un internaute charge une page Web, une connexion est ouverte entre son ordinateur et le serveur qui héberge la page demandée. Une première vague de données est envoyée de l'ordinateur de l'internaute vers le serveur : il s'agit de la requête de données. Le serveur traite la requête et renvoie, dans une deuxième vague, les données requises vers l'ordinateur de l'internaute. Le point important est le chemin suivi par les données : celles-ci « sautent » d'un noeud à un autre, se frayant un passage d'un serveur à l'autre, jusqu'à leur destination. En d'autres termes, les données ne passent pas directement de A à Z, elles passent de A à B, de B à C, ..., de Y à Z. Le schéma ci-dessous l'illustre (voir aussi, <a href="http://upload.wikimedia.org/wikipedia/commons/d/d2/Internet_map_1024.jpg" /></p>
<p>ce schéma</a>, plus réaliste, sur <a href="http://fr.wikipedia.org/wiki/Internet">Wikipédia</a>).</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/internet.png" /></p>
<p><a name="432"></a><br />
<h4>Principe des proxy VPN</h4>
<p></a></p>
<p>Ces quelques rappels techniques étant effectués, voici l'énoncé du problème : les données circulent <i>en clair</i> d'un noeud à l'autre, et chaque noeud est susceptible de les intercepter ou d'enregistrer les méta-données de la connexion (date et heure, émetteur et destinataire, etc.). La création d'un réseau VPN a pour but de résoudre ce problème. Une connexion VPN crée un « tunnel » entre l'ordinateur client et le serveur VPN. Tant qu'elles sont dans le tunnel, les données sont chiffrées et ne peuvent pas être interceptées. Le schéma ci-dessous illustre les deux configurations, avec et sans VPN.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/vpn.png" /></p>
<p>L'établissement d'un tunnel VPN a une autre conséquence, lorsque le serveur VPN est un serveur mandataire (<i>proxy</i>). En effet, le passage par un proxy permet de cacher au serveur sollicité, et à tous les serveurs intermédiaires, l'identité (l'adresse IP) de l'ordinateur qui a émis la requête. Le mandataire se charge de récupérer les données auprès du serveur, puis de les transmettre au client par un tunnel sécurisé. Ainsi, le serveur et chaque noeud intermédiaire n'ont pour seul interlocuteur que le proxy. Ils considéreront que le proxy est le destinataire final des données envoyées et c'est son adresse IP qui apparaîtra dans les journaux (« logs »). C'est aussi son adresse IP qui sera filtrée, le cas échéant.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/proxy-vpn.png" /></p>
<p>Le précédent schéma illustre la double protection du réseau VPN :<br />
- la requête chiffrée est envoyée du client vers le proxy par un tunnel VPN, aucun noeud intermédiaire ne peut l'intercepter ;<br />
- le proxy reformule la requête et l'envoie, en clair, au serveur ;<br />
- le serveur croit que le proxy est le destinataire final des données, il lui renvoie en clair les données correspondant à sa requête ;<br />
- le proxy transmet les données reçues vers le client, en passant à nouveau par le tunnel sécurisé.</p>
<p><a name="433"></a><br />
<h4>Quelques aspects juridiques</h4>
<p></a></p>
<p>L'utilisation d'une connexion VPN et d'un proxy est bien entendu parfaitement licite (en France). Si l'on assimile parfois ces technologies à des moyens illicites, c'est parce qu'elles rendent caduques plusieurs techniques employées par les opérateurs et la justice afin de faire respecter le droit sur Internet.</p>
<p>Comme nous l'avons vu, les connexions proxy/VPN permettent, en premier lieu, de faire croire au serveur que le destinataire final des données est le serveur proxy. Imaginons l'hypothèse suivante : un contenu illicite dans le pays A est diffusé sur Internet depuis un serveur situé dans le pays B. Une décision de justice, rendue dans le pays A, ordonne au propriétaire du serveur dans le pays B de refuser toutes les connexions originaires du pays A. Cette décision reçoit l'exequatur dans le pays B, et le propriétaire du serveur s'y conforme en mettant en place un filtrage des adresses IP. Un internaute du pays A tente de se connecter au serveur du pays B, et se heurte à un refus du serveur. Il se connecte alors à un serveur proxy, situé dans le pays C, et tente de nouveau de se connecter au serveur B. Pour le serveur B, les données sont requises par un ordinateur du pays C, qui en est également le destinataire final. La mesure de filtrage n'est donc pas mise en oeuvre et les données sont transmises. Le filtrage ordonné à l'opérateur du pays B n'ayant pas été ordonné aux opérateurs du pays C, les données sont envoyées du proxy vers le client. La mesure de filtrage a été contournée.</p>
<p>En second lieu, le mécanisme précédemment décrit permet d'anonymiser les connexions. Le serveur, et tous les noeuds entre lui et le proxy, ignorant l'identité (et même l'existence) du client, il ne peuvent qu'enregistrer l'adresse IP du proxy. Si l'on veut « remonter à la source » pour identifier, par exemple, l'internaute ayant mis en ligne un contenu illicite, on aboutira au serveur proxy. Si celui-ci ne garde aucune trace des connexions émises par les clients, il sera impossible de remonter plus loin et d'aboutir au client.</p>
<p><a name="434"></a><br />
<h4>Remarques complémentaires</h4>
<p></a></p>
<p>Il découle des explications précédentes que la sécurisation du serveur proxy fournissant la connexion VPN est une condition <i>sine qua non</i> de la sécurité et de la confidentialité des données transmises.</p>
<p>Un serveur proxy qui n'est pas fiable constitue ainsi un risque de sécurité : il peut enregistrer toutes les connexions qui passent par lui, ainsi que leur contenu. Dans ce contexte, il est plus sûr de ne pas utiliser de proxy VPN plutôt que d'utiliser un proxy VPN fourni par un opérateur à l'intégrité douteuse.</p>
<p>Les opérateurs suivant n'ont, jusque'à présent, donné aucun raison de douter de leur intégrité : <a href="https://www.relakks.com/">Relakks</a> et <a href="https://www.ipredator.se/">IPREDator</a> (Suède), <a href="http://www.purevpn.com/">PureVPN</a> (plusieurs pays).</p>
<p>L'établissement d'une connexion VPN engendre un autre risque pour la sécurité : la connexion étant directe entre le proxy et le client, les firewalls matériels ne peuvent plus accomplir leur entière mission de protection.</p>
<p><a name="44"></a><br />
<h3>4# - TOR</h3>
<p></a></p>
<p>TOR ou « The Onion Router » est un réseau permettant, à l'instar des serveurs VPN, de chiffrer les données transmises sur le réseau, tout en garantissant l'anonymat du client au regard du serveur.</p>
<p><a name="441"></a><br />
<h4>Principe</h4>
<p></a></p>
<p>Contrairement aux réseaux VPN, TOR ne repose pas sur un serveur proxy central. Ce sont en effet toutes les connexions, entre chaque noeud (constituant les différentes couches  de « l'oignon » TOR), qui sont chiffrées. Sur la route (v. les schémas, <i>supra</i>) entre le client et le serveur, chaque noeud TOR connaît <i>uniquement</i> son prédécesseur et son successeur. Ainsi, le premier noeud connaît votre adresse IP, mais le second noeud ne connaît que l'adresse IP du premier noeud, et ainsi de suite. De même, chaque noeud possède une clé privée, pour le chiffrement des données, qui lui est propre.</p>
<p><a name="442"></a><br />
<h4>Mise en oeuvre</h4>
<p></a></p>
<p>La mise en oeuvre de TOR nécessite l'installation locale d'un serveur proxy, tel que <a href="http://www.privoxy.org/">Privoxy</a>, et du logiciel TOR sur l'ordinateur client. L'activation de TOR peut se faire très simplement, en utilisant par exemple l'extension <a href="https://addons.mozilla.org/fr/firefox/addon/2275">TorButton</a> pour Firefox.</p>
<p><a name="443"></a><br />
<h4>Critique</h4>
<p></a></p>
<p>L'utilisation de TOR ne fournit pas une sécurité absolue. On peut en effet imaginer plusieurs scénarios dans lesquels l'anonymat de la connexion ou les données transmises sont compromis.</p>
<p>Le premier scénario est celui d'une attaque globale contre TOR ; l'anonymat du client est alors compromis. En effet, une personne ayant (hypothétiquement) une vision globale du réseau peut suivre les données de la source jusqu'à la destination. Il est également possible d'intercepter les données en cours de transit, en les « entourant » d'autres données : ces autres données formeront une sorte de « moule » qu'il suffira de suivre pour connaître le chemin des données passant par TOR.</p>
<p>Le second scénario est celui d'une attaque du contenu par <a href="https://wiki.torproject.org/noreply/TheOnionRouter/TorFAQ#ExitEavesdroppers">compromission du dernier noeud</a>. En effet, si la requête du client est chiffré pendant qu'elle transite sur le réseau TOR, elle doit être déchiffrée avant d'atteindre le serveur, faute de quoi celui-ci ne pourra pas l'exploiter. C'est le dernier noeud TOR qui la déchiffre, avant de l'envoyer au serveur. Ce noeud a donc une connaissance du message <i>en clair</i> et il suffit d'en prendre le contrôle pour compromettre la sécurité des données. Par conséquent, il ne faut <u>jamais</u> transmettre par TOR des informations confidentielles qui ne sont pas directement chiffrées par le client et déchiffrées par le serveur.</p>
<p><a name="45"></a><br />
<h3>5# - SSL/https</h3>
<p></a></p>
<p>Les connexions SSL sont chiffrées par le client et déchiffrées par le serveur, ou vice-versa. Les données transmises peuvent être interceptées durant leur transfert, mais elles ne seront exploitables qu'après déchiffrement (ce qui est, en pratique, quasiment impossible). Les données sensibles (informations personnelles, mots de passe, numéros de carte de crédit, etc.) doivent toujours être transmises à l'aide d'une connexion SSL.</p>
<p>L'existence d'une connexion SSL peut être vérifiée directement dans le navigateur : l'adresse de le page ne débute pas par « http:// » mais par « http<b>s</b>:// ». La connexion SSL garantit que les données ne seront pas exploitables si elles venaient à être interceptées par un des noeuds du réseau. Les navigateurs modernes possèdent d'autres indicateurs permettant de déterminer l'existence d'une connexion SSL : par exemple, une icône de cadenas dans la barre des tâches ou une référence à l'identité du serveur dans la barre d'URL. </p>
<p>Toutefois, cela n'est pas suffisant pour assurer la sécurité des données. Il faut, en outre, vérifier la validité du <i>certificat numérique</i> qui permet de mettre en oeuvre la connexion SSL, ainsi que l'identité de l'organisme qui l'a émis et la date de son expiration. Un certificat auto-signé n'a ainsi aucune valeur : les données ne seront pas interceptées, certes, mais leur destinataire peut aussi bien être un imposteur.</p>
<p>Avec Firefox, le nom du serveur est affiché à gauche de l'adresse URL du site, sur fond vert. En cliquant sur ce fond vert, on peut ouvrir une fenêtre montrant les détails du certificat numérique, comme l'illustre l'image ci-dessous.</p>
<p style="text-align:center;"><img src="/public/posts/2010-03-04-securite/sslfirefox.png" /></p>
<p><a name="46"></a><br />
<h3>6# - Utiliser un OS fiable</h3>
<p></a></p>
<p>L'utilisation d'un système d'exploitation (OS) fiable comprend à la fois le bon paramétrage du système d'exploitation, et l'utilisation d'un système sécurisé adapté à ses besoins.</p>
<p>Pour un usage domestique (c'est-à-dire, sans logiciel serveur actif), Windows est le pire système d'exploitation à utiliser. Ce n'est pas que Windows est intrinsèquement moins sécurisé que Mac OS X ou Linux, mais c'est qu'il est le premier système ciblé par les auteurs de logiciels malveillants, en raison de son énorme part de marché. Il existe des centaines de milliers de logiciels malveillants visant Windows, alors qu'il n'en existe qu'une (petite) dizaine visant Mac ou Linux. Il est donc préférable d'utiliser Mac ou Linux à la maison.</p>
<p>- Si vous voulez installer des jeux ou des logiciels spécialisés, qui ne sont pas diffusés auprès du public, et qui ne fonctionnent qu'avec Windows, utilisez Windows.<br />
- Dans le cas contraire, préférez Mac OS X (vraiment ! on peut tout faire sur Mac, plus facilement encore que vous Windows, sauf jouer...).<br />
- Si vous ne voulez que des logiciels libres et gratuits (mais moins agréables à utiliser), et que vous ne voulez pas jouer, utilisez Linux.</p>
<p>Il est également possible d'utiliser Mac ou Linux comme système principal, et de <i>virtualiser</i> Windows pour utiliser certains logiciels spécifiques (v. <i>infra</i>). La solution fonctionne très bien pour tous les logiciels qui ne sont pas trop gourmands en ressources. Cela n'exclut, <i>a priori</i>, que les jeux et les très gros logiciels serveur, scientifiques (nécessitant une grande puissance de calcul), ou artistiques (Photoshop sur de grosses images RAW, montage vidéo, etc.).</p>
<p>Pour un usage en tant que serveur, la problématique est différente. Un système Linux n'est pas plus sûr qu'un système Windows, au contraire, mais pour des raisons indépendantes des différents logiciels malicieux qui peuvent l'infecter. L'avantage de Windows et de Mac OS X, dans leurs versions serveur, est d'être fournis avec des outils qui facilitent la sécurisation et l'administration du système. A l'inverse, ce sera à l'administrateur du système de sécuriser son système Linux, ce qui nécessite de très grandes compétences en matières de réseaux, de sécurité informatique, et de systèmes Unix. Bref, c'est l'affaire d'un spécialiste.</p>
<p><a name="47"></a><br />
<h3>7# - Placer les fichiers importants sur support amovible</h3>
<p></a></p>
<p>Pour ne pas perdre ses données, il faut les sauvegarder. Une sauvegarde sur le disque dur de l'ordinateur permet de récupérer les fichiers corrompus (à cause d'un bug dans un logiciel, par exemple) ou effacés par erreur, mais elle ne suffit pas en cas d'infection virale. Il est donc conseillé de réaliser des sauvegardes sur des supports externes à l'ordinateur (gravure sur CD ou DVD, stockage sur un disque dur externe ou une clé USB).</p>
<p>Mais on peut aller plus loin, en stockant directement ses données sur un support externe à l'ordinateur -tout en réalisant des sauvegardes sur un autre support externe- , qui n'est connecté qu'en cas de besoin. Bien entendu, il faudra s'assurer que le système est sain avant toute connexion du support externe.</p>
<p><a name="48"></a><br />
<h3>8# - Opérations critiques: utiliser un OS "Live USB"</h3>
<p></a></p>
<p>Pour les opérations critiques en matière de sécurité, la meilleure façon de s'assurer que son système est sain est d'utiliser un système « live ». Les systèmes « live » sont des systèmes pré-installés sur un support amovible, comme un CD/DVD ou une clé USB. </p>
<p>Ce procédé présente plusieurs avantages :</p>
<p>1) Il permet d'utiliser ponctuellement un système d'exploitation autre que celui installé sur la machine hôte, tout en conservant ce-dernier installé sur le disque dur pour une utilisation quotidienne.</p>
<p>Les ordinateurs des cyber-cafés étant pour la plupart sur-infectés, lancer un système live sain sur un ordinateur de cyber-café permet de travailler en confiance.</p>
<p>2) Il permet d'utiliser un système d'exploitation totalement fonctionnel et doté des logiciels utiles, sans installer quoi que ce soit sur l'ordinateur. Il est ainsi possible de préinstaller sur le système live des logiciels spécialisés, développés pour des besoins spécifiques et que l'on ne trouve pas dans le commerce, afin de les utiliser sans installation sur n'importe quel ordinateur. De la même manière, l'utilisation d'un système live permet de retrouver tous ses logiciels avec leur configuration, sur n'importe quel ordinateur (dans un cyber-café, par exemple).</p>
<p>3) Enfin et surtout, le système live sur une clé USB peut être configuré, au moment de sa création, pour ne stocker aucune donnée créée lors de son utilisation. Sur un CD ou DVD, ce n'est pas une option : aucune donnée ne peut être enregistrée une fois que le support est gravé. En cas de perte ou de vol du support, la sécurité des données n'est donc pas compromise. </p>
<p>Mieux que cela, l'impossibilité d'enregistrer des données neutralise de fait la plupart des logiciels malicieux. Les virus et les vers, qui ont pour but de se répliquer, les keylogger, qui récupèrent des données et les envoient à leur auteur, ou les chevaux de Troie, qui se cachent dans le système avant d'agir, etc., n'ont de sens que s'ils établissent une présence durable dans le système. Ils sont donc <i>a priori</i> conçus pour s'installer sur le disque dur et s'exécuter à chaque démarrage de la machine. S'ils ne peuvent pas s'installer sur le disque dur, comme c'est le cas avec un système live, ils n'ont plus de raison d'être. En somme, seuls les logiciels visant spécifiquement les systèmes live, ou résidant dans la mémoire RAM, constituent encore des dangers.</p>
<p><a name="49"></a><br />
<h3>9# - Chiffrer les données sensibles</h3>
<p></a></p>
<p>Le chiffrement des données permet de les rendre illisibles pour toutes personne qui ignore l'algorithme et ne détient pas la clé de chiffrement. L'avantage que cela procure est évident : si les données venaient à être détournées par un logiciel malicieux, elles seraient inexploitables. C'est pour cette raison que les sites Web qui nécessitent une grande sécurité des échanges (banques, commerce électronique, etc.) utilisent le chiffrement SSL (v. <i>supra</i>).</p>
<p><a name="491"></a><br />
<h4>Inconvénients</h4>
<p></a></p>
<p>Parmi les principaux inconvénients du chiffrement, on peut citer les suivants :<br />
- impossibilité d'accéder aux données en cas de perte de la clé ou de l'algorithme (par exemple, si le logiciel utiliser pour chiffrer les données n'est plus édité et qu'aucun autre logiciel n'utilise le même chiffre...) ;<br />
- ralentissement de l'accès aux données et sollicitation du processeur (au lieu de « lire » ou « d'écrire » simplement le fichier, l'ordinateur doit le chiffrer ou le déchiffrer : c'est une opération supplémentaire, qui prend du temps et utilise des ressources) ;<br />
- altération des données plus facile et perte potentielle de l'ensemble des données en cas d'altération.</p>
<p><a name="492"></a><br />
<h4>Sécurité</h4>
<p></a></p>
<p>Aucun chiffre n'est vraiment « incassable ». Plusieurs angles d'attaque sont possibles. On peut d'abord envisager une attaque dite par la « force brute » (en anglais, <i>brute force</i>), qui consiste à programmer un ordinateur pour tester toute les possibilités de clé jusqu'à obtenir la bonne. La sécurité de la plupart des chiffres modernes repose sur le fait qu'une telle attaque n'est possible qu'avec une puissance de calcul phénoménale (que seuls les États pourraient obtenir). Le code <a href="http://fr.wikipedia.org/wiki/Rivest_Shamir_Adleman">Rivert-Shamir-Adleman</a> (RSA), réputé inviolable, repose par exemple sur le fait que le temps nécessaire pour le « casser » croît exponentiellement avec la longueur de la clé. </p>
<p>Il faut alors envisager une autre manière de procéder, par exemple une méthode heuristique reposant sur l'analyse du contexte, comme le temps nécessaire pour chiffrer un message d'une certaine longueur. Enfin, certaines attaques peuvent exploiter une faille logicielle ou matérielle dans le processus de chiffrement ou de déchiffrement. Par exemple, le RSA a pu être compromis par <a href="http://www.irisa.fr/activites/new/007/branchpredictionattack004">l'exploitation du système d'anticipation</a> des processeurs modernes (qui consiste à exécuter une instruction avant la fin de l'exécution de l'instruction précédente). Une telle faille nécessite cependant un accès au processeur, ce qui suppose un accès physique à la machine ou ... la présence d'un logiciel espion.</p>
<p>Plus fondamentalement, la manière la plus simple et efficace d'accéder à des données chiffrées n'est pas de les décrypter (c'est-à-dire de les déchiffrer sans posséder la clé), mais d'obtenir la clé de chiffrement. Un keylogger présent sur la machine au moment du chiffrement pourra intercepter le mot de passe entré par l'utilisateur, et reconstituer ainsi la clé. Les données chiffrées avant infection resteront sûres, mais ce ne sera pas le cas des données chiffrées ou déchiffrées après infection. Le chiffrement est donc un excellent moyen de protection <i>ex ante</i>, mais il cesse de l'être une fois le système infecté.</p>
<p><a name="493"></a><br />
<h4>Mise en oeuvre</h4>
<p></a></p>
<p>La plupart des systèmes d'exploitation modernes permettent à l'utilisateur de chiffrer automatiquement le contenu du dossier destiné à ses fichiers personnels : <a href="http://fr.wikipedia.org/wiki/BitLocker_Drive_Encryption">BitLocker</a> sous Windows ou <a href="http://fr.wikipedia.org/wiki/FileVault">FileVault</a> sous Mac OS X, sont par exemple intégrés au système. Ces solutions sont faciles à mettre en oeuvre, mais elles chiffrent tous les fichiers sans distinction. On court ainsi le risque de devoir chiffrer d'énormes fichiers multimédia afin de protéger quelques fichiers de texte. L'impact sur les performances de la machine ne justifie pas cela et rend préférable, dans la plupart des situations, l'utilisation d'un logiciel permettant de choisir individuellement les fichiers à chiffrer.</p>
<p><a name="494"></a><br />
<h4>Aspects juridiques</h4>
<p></a></p>
<p>Les chiffres et les logiciels permettant de chiffrer les données ont pendant longtemps été considérés, par le droit français, comme des armes de guerre. Leur utilisation était donc interdite. Ce n'est plus le cas depuis la Loi pour la Confiance dans l'Économie Numérique (LCEN) du 21 juin 2004. Toutefois, certaines restrictions continuent de s'appliquer à <a href="http://www.ssi.gouv.fr/archive/fr/reglementation/regl_crypto.html">l'importation et à l'exportation</a> de moyens de chiffrement.</p>
<p>Il faut également faire attention aux situations internationales (déplacement d'un ordinateur portable ou envoi d'un fichier chiffré par Internet, par exemple), car un moyen de chiffrement autorisé en France peut être interdit à l'étranger.</p>
<p><a name="410"></a><br />
<h3>10# - Utiliser un clavier virtuel</h3>
<p></a></p>
<p>L'utilisation d'un clavier virtuel est un moyen efficace de protection contre les keyloggers. Il s'agit d'écrire un mot de passe en cliquant sur un clavier qui s'affiche à l'écran, plutôt que d'utiliser un clavier physique dont la sécurité est potentiellement compromise.</p>
<p>Certaines suites de sécurité, comme <a href="http://support.kaspersky.com/fr/kav2010/safety?qid=208280448">Kaspersky 2010</a> sont fournies avec un clavier virtuel. On peut également trouver des claviers virtuels sur certains sites sécurisés, par exemple celui de <a href="https://www.labanquepostale.fr/index.html">La Banque Postale</a> (paradoxalement, il faudra autoriser les scripts et les plugins dans son navigateur pour l'activer...). Ce clavier virtuel est particulièrement bien conçu, puisqu'il suffit de survoler les touches avec le curseur de la souris, sans cliquer, ce qui rend inopérants les logiciels espions qui intercepteraient les clics de souris. En outre, les touches changent de place d'une visite à l'autre, ce qui rend inutile l'enregistrement de la position du curseur par un logiciel malveillant.</p>
<p><a name="411"></a><br />
<h3>11# - Vérifier l'état physique du matériel</h3>
<p></a></p>
<p>L'état physique d'un périphérique peut révéler un problème de sécurité. Par exemple, un disque dur qui « gratte » révèle la lecture ou l'écriture de données. Si l'utilisateur n'est pas en train d'utiliser ce disque, et qu'aucun logiciel n'est censé le solliciter (pour une sauvegarde automatique, par exemple), il peut s'agir de l'activité d'un logiciel espion. </p>
<p>De la même manière, il peut être utile de surveiller l'état des diodes présentes sur les différents périphériques. L'information n'est pas forcément pertinente : un rootkit peut, par exemple, activer une webcam tout en neutralisant la diode indiquant l'activité ; mais elle peut tout de même être utile : par exemple, les diodes de la « box » Internet s'affolent, alors qu'aucun chargement n'est censé être en cours.</p>
<p><a name="412"></a><br />
<h3>12# - Changer ses DNS au niveau du navigateur</h3>
<p></a></p>
<p>Les <a href="http://fr.wikipedia.org/wiki/Domain_Name_Server">serveur DNS</a> gèrent le chemin suivi par les données sur le réseau. Une attaque très courante consiste à modifier les serveurs DNS utilisés par une machine, afin de faire croire à l'utilisateur qu'il se rend sur un site tout en l'envoyant sur un autre site. La sécurisation des serveurs DNS utilisés est donc primordiale.</p>
<p>Les serveurs DNS utilisés peuvent être spécifiés à plusieurs niveaux : sur le routeur, sur le système d'exploitation, ou sur le navigateur. De nombreux logiciels malveillants sous Windows modifient la configuration du système afin d'utiliser des serveurs DNS compromis plutôt que ceux indiqués au niveau du routeur par le fournisseur d'accès. </p>
<p>Pour se protéger contre ce genre d'attaque, il faut :<br />
- protéger la configuration des serveurs DNS au niveau du système (la plupart des suites de sécurité pour Windows empêchent la modification des DNS par un logiciel tiers en protégeant <a href="http://fr.wikipedia.org/wiki/Hosts">le fichier <i>hosts</i></a> qui se trouve dans <i>c:\windows\system32\drivers\etc\</i>) ;<br />
- pour les plus paranoïaques : vérifier « manuellement » que le fichier <i>hosts</i> n'a pas été modifié (dans le répertoire <i>c:\windows\system32\drivers\etc\</i> sous Windows, dans le répertoire </i>/etc/</i> sous Mac et Linux) ;<br />
- spécifier les adresses DNS au niveau du navigateur. Cela n'est possible qu'avec certains navigateurs, tels que Firefox (une raison de plus pour ne plus utiliser Internet Explorer).</p>
<p><a name="413"></a><br />
<h3>13# - Sandboxing et Virtualisation</h3>
<p></a></p>
<p>Le « sandboxing » et la « virtualisation » ont pour but d'exécuter un logiciel potentiellement dangereux dans un lieu placé « en quarantaine » et isolé du système. De cette manière, si la menace se concrétise, elle ne pourra pas causer de dommage au système et n'aura d'effet qu'à l'intérieur de la zone en quarantaine. Certaines suites de sécurité moderne, comme <a href="http://support.kaspersky.com/fr/faq/?qid=208280135">Kaspersky 2010</a> permettent le sandboxing ponctuel d'un fichier exécutable.</p>
<p>Dans la terminologie des systèmes Unix (Linux, Mac OS X, BSD, etc.), on parle de « <a href="http://fr.wikipedia.org/wiki/Chroot">chroot</a> ». « Chrooter » un logiciel revient à le faire s'exécuter dans une « prison » virtuelle, de laquelle il ne pourra pas sortir.</p>
<p>Il est également possible de créer un système à l'intérieur du système : Windows XP à l'intérieur de Mac OS X, par exemple. Il s'agit de la « virtualisation », que l'on peut mettre en oeuvre grâce à un logiciel spécifique comme <a href="http://www.virtualbox.org/">VirtualBox</a> (gratuit), <a href="http://www.vmware.com/fr/">VMWare</a> ou <a href="http://www.parallels.com/fr/">Parallels</a>. L'auteur du blog <a href="http://infomars.fr/WordPress/peghorse/">Peghorse</a>, qui teste les antivirus du marché, détruit régulièrement dans ses tests des systèmes Windows virtualisés, sans pour autant compromettre la sécurité de son ordinateur.</p>
<p>L'utilisation d'un système virtualisé est donc un moyen efficace de protection. Deux remarques (importantes) doivent toutefois être faites.</p>
<p>En premier lieu, la sécurité du système virtualisé n'est pas garantie dès lors que celle du système hôte ne l'est pas. Par exemple, rien ne sert de virtualiser Linux dans un Windows infecté par un keylogger : ce que l'on écrira dans Linux passera d'abord par Windows et sera intercepté par le keylogger.</p>
<p>En second lieu, la virtualisation d'un système peut être source d'insécurité, dès lors que la machine virtuelle offre un moyen de communication entre les deux systèmes. Par exemple, Parallels pour Mac intègre le système Windows virtualisé au système Mac hôte, afin de le rendre plus facile et plus agréable à utiliser : les dossiers de l'utilisateurs peuvent se confondre sur les deux systèmes. Il ne s'agit pas d'une copie mais d'une réplique virtuelle : les fichiers sont dans le dossier « Documents » sur Mac, mais ils apparaissent dans Windows comme s'ils étaient dans « Mes Documents ». De cette manière, si un fichier est supprimé par Windows dans « Mes documents », il sera également supprimé dans « Documents » sur le système Mac. Imaginons un cheval de Troie « vilain.exe » ayant pour but de récupérer des données personnelles et de les envoyer à un tiers. Ce logiciel ne fonctionnera pas sur le système hôte, car il est conçu pour Windows, et qu'il n'est donc pas exécutable sur Mac. En revanche, il peut parfaitement fonctionner sur le système Windows virtualisé et, en agissant sur le dossier « Mes documents », agir de fait sur le contenu du dossier « Documents » sur le Mac. Il est par conséquent impératif, pour obtenir un niveau maximal de sécurité, d'isoler complètement la machine virtuelle du système hôte (ce que les logiciels de virtualisation précités permettent de faire).</p>
<p><a name="5"></a><br />
<h1>Conclusion</h1>
<p></a></p>
<p>L'exposé des techniques de sécurisation d'un ordinateur personnel présenté dans cet article n'est ni exhaustif ni imparable. De nouvelles menaces apparaissent tous les jours, si bien qu'il est impossible de garantir la sécurité absolue d'un ordinateur sur le long terme. Toutefois, le dénominateur commun à la plupart de ces menaces réside dans l'exploitation du manque d'information ou de vigilance de l'utilisateur. La meilleure mesure de sécurité reste donc le respect des règles règles fondamentales « si je ne sais pas, je ne clique pas », « si je ne connais pas, je ne fais pas confiance », « rien ne remplace ma vigilance ».</p>
<p>A Paris, le 4 mars 2010 (première publication)<br />
mise à jour le 19 mars 2010 (commande sudo crontab -l)<br />
mise à jour le 29 mars 2010 (bootkits, 10 règles immuables de Microsoft)<br />
mise à jour le 7 juillet 2011 ("je suis mon alter ego")</p>
