---
layout: post
status: publish
published: true
title: 'Humour: l''ordinateur de ma grand-mère'

  
  



wordpress_id: 20
wordpress_url: http://localhost/~guillaume/gfblog/wordpress/?p=20
date: '2005-02-07 22:36:57 +0100'
date_gmt: '2005-02-07 20:36:57 +0100'
categories:
- Actu & humeur
tags:
- informatique
- hardware
- humour
- linux
permalink:  /2005/02/07/humour-lordinateur-de-ma-grand-mere/
---
<p>Je suis tomb&eacute; par hasard sur un blog am&eacute;ricain qui affichait un article absolument hilarant, alors je l'ai traduit en fran&ccedil;ais (faut dire, j'avais vraiment rien d'autre &agrave; foutre ;-) <br />
        Dans cet article, l'auteur explique comment il construit un ordinateur simple et convivial pour sa grand-m&egrave;re de 89 ans qui a besoin d'&eacute;crire des e-mails et qui ne conna&icirc;t rien &agrave; l'informatique. Elle avait besoin de quelque chose de basique pour envoyer un mail par semaine sans se compiquer la vie, sans option invasive, un super plug-and-play, un &quot;deux clicks et &ccedil;a marche&quot;. Elle va &ecirc;tre servie !<br />
L'adresse de l'original est la suivante: <a href="http://www.divisiontwo.com/articles/linuxbeat3.htm" target="_blank">http://www.divisiontwo.com/articles/linuxbeat3.htm<br />
        </a></p>
<p>Voil&agrave; le texte traduit: </p>
<p>J&rsquo;ai depuis peu entrepris de remplacer l&rsquo;ancien Macintosh de ma grand-m&egrave;re avec un ordinateur qu&rsquo;elle pourrait utiliser juste pour se connecter &agrave; Internet et envoyer des e-mails. Ma grand-m&egrave;re a 89 ans, a toujours le sourire, un peu d&rsquo;Alzeimer, et a utilis&eacute; un Mac LC II sous OS 7.5 durant la derni&egrave;re d&eacute;cennie. A ma connaissance, elle ne l&rsquo;a utilis&eacute; que pour &eacute;crire quelques lettres avec ClarisWorks. Elle n&rsquo;a jamais envoy&eacute; d&rsquo;e-mail, envoy&eacute; un message instantan&eacute;, ou surf&eacute; sur Internet de toute sa vie.</p>
<p>
          J&rsquo;avais donc une t&acirc;che assez lourde &agrave; remplir. Je devais construire une machine avec un budget de 700$, ayant tout ce dont ma grand-m&egrave;re a besoin, et plus simple &agrave; utiliser que MacOS 7.5.</p>
<p>
          Pour le hardware, je suis parti sur un dual Athlon XP 1800+ avec un disque dur de 40 GO &agrave; 7200 TPM, 1 GO de RAM, et pour la vid&eacute;o une petite carte graphique dual ATI Radeon 8500 avec 128 MO de m&eacute;moire. Cette configuration devrait &ecirc;tre assez puissante pour tenir un an ou deux. J&rsquo;ai aussi mis un vieux lecteur DVD que je n&rsquo;utilisais plus et un graveur CD-RW que j&rsquo;avais r&eacute;cup&eacute;r&eacute; d&rsquo;un vieil ordinateur au bureau qu&rsquo;ils voulaient jeter. Je lui ai finalement pris des haut-parleurs Boston et un moniteur CRT 21 pouces sur eBay. Tout cela pour un co&ucirc;t total de 698,34$.</p>
<p>
          Quand j&rsquo;ai du choisir un syst&egrave;me d&rsquo;exploitation, j&rsquo;ai eu un probl&egrave;me. D&rsquo;un c&ocirc;t&eacute; j&rsquo;aime beaucoup le distribution Mandrake pour sa simplicit&eacute; et son c&ocirc;t&eacute; multim&eacute;dia. D&rsquo;un autre c&ocirc;t&eacute; j&rsquo;appr&eacute;cie beaucoup la rapidit&eacute; de la distribution Gentoo et sa d&eacute;pendance &agrave; son syst&egrave;me de paquetages. Je pense que la Mandrake 9.2 est la meilleure distribution, la plus compl&egrave;te et la plus stable, mais un n&eacute;ophyte en apprendra plus sur Linux en utilisant la Gentoo. Comme je ne n&rsquo;arrivais pas &agrave; me d&eacute;cider, ne sachant pas laquelle de ces deux distribution elle pr&eacute;f&egrave;rerait, j&rsquo;ai fini par opter pour l&rsquo;installation parall&egrave;le des deux distributions - j&rsquo;avais assez d&rsquo;espace disque pour cela.</p>
<p>
          Deux distributions, cela signifie deux syst&egrave;mes d&rsquo;exploitation, donc la n&eacute;cessit&eacute; d&rsquo;installer un boot loader. Lequel pr&eacute;f&egrave;rera ma grand-m&egrave;re, Lilo ou Grub ? Personnellement, je pense que Lilo est plus abouti, mais Grub est plus facile &agrave; configurer. Comme je n&rsquo;&eacute;tais pas s&ucirc;r du choix final de ma grand-m&egrave;re, j&rsquo;ai choisi d&rsquo;installer les deux boot loaders et de mettre un boot switcher pour qu&rsquo;elle puisse choisir &agrave; chaque d&eacute;marrage.</p>
<p>
          J&rsquo;ai d&rsquo;abord install&eacute; Gentoo. J&rsquo;ai format&eacute; le disque en le s&eacute;parant en 3 partitions: une utilisant ReiserFS, l&rsquo;autre avec le v&eacute;n&eacute;rable format Ext3, et la derni&egrave;re en SGI XFS dans le cas o&ugrave; elle voudrait t&eacute;l&eacute;charger des divx ou des gros warez.</p>
<p>
          Ensuite, j&rsquo;ai du choisir le window manager. Il en existe des dizaines, mais 3 se d&eacute;tachent du lot: KDE, GNOME et XFce. Mais choisir le meilleur des trois est difficile. KDE est configurable &agrave; l&rsquo;infini, est beau et a beaucoup d&rsquo;options. Gnome est plus l&eacute;ger, plus rapide, mais il para&icirc;t aussi plus restrictif. XFce est le plus rapide et l&eacute;ger des trois, mais il n&rsquo;est pas encore aussi mature que Gnome et KDE. Je voulais quand m&ecirc;me l&rsquo;installer, car il &eacute;volue dans la bonne direction.</p>
<p>
          J&rsquo;ai donc install&eacute; les trois window managers, de telle mani&egrave;re que ma grand-m&egrave;re puisse choisir lequel utiliser &agrave; chaque fois qu&rsquo;elle utilisera son ordinateur. Elle peut parfois vouloir travailler rapidement, et parfois s&rsquo;en mettre plein les yeux de belles interfaces graphiques.</p>
<p>
          Pour l&rsquo;e-mail, j&rsquo;ai install&eacute; Evolution et Kmail, parce que Evolution a un tr&egrave;s joli skin (similaire &agrave; Outlook), mais Kmail est plus rapide et mieux int&eacute;gr&eacute; &agrave; l&rsquo;environnement KDE. J&rsquo;ai aussi install&eacute; Mozilla Mail car je suis un grand fan de la suite Mozilla. Pour la messagerie instantan&eacute;e, j&rsquo;ai install&eacute; Gaim et Kopete; et pour la navigation je lui au laiss&eacute; le choix entre Mozilla, Firefox, Konqueror, Nautilus et Galeon.</p>
<p>
          Comme elle aime taper des lettre sur son ordinateur, pour le traitement de texte je lui ai mis OpenOffice, KOffice, AbiWord, Emacs et Vi. Elle aura le choix.</p>
<p>
          J&rsquo;ai install&eacute; Java et Limewire pour qu&rsquo;elle puisse se cr&eacute;er une biblioth&egrave;que MP3. J&rsquo;ai aussi install&eacute; CrossOver pour qu&rsquo;elle puisse utiliser WinMX et Kazaa dans le cas o&ugrave; elle voudrait t&eacute;l&eacute;charger des DivX. J&rsquo;ai &eacute;galement mis X-Chat pour qu&rsquo;elle puisse se connecter &agrave; mes channels IRC de warez favoris. Et en bonus, WineX pour qu&rsquo;elle puisse jouer &agrave; des jeux d&eacute;velopp&eacute;s pour Windows.</p>
<p>
          J&rsquo;ai aussi install&eacute; MS Office &agrave; lancer par le biais de CrossOver. Le fait que ma grand-m&egrave;re utilise des logiciels Microsoft me rend malade, parce que j&rsquo;aime ma grand-m&egrave;re, mais ma m&egrave;re dit qu&rsquo;il faut que le syst&egrave;me soit aussi simple et compatible que possible, et je dois l&rsquo;admettre, la suite de Microsoft est la plus largement utilis&eacute;e sur le march&eacute;. De toute mani&egrave;re, je lui ai laiss&eacute; le choix entre MS Office et cinq autres suites natives Linux, et je pense que c&rsquo;est un bon compromis entre ce dont elle a besoin et mes principes philosophiques. </p>
<p>
          Pour le multim&eacute;dia, elle a tout ce qu&rsquo;il faut. Elle pourra jouer des morceaux OGG et MP3 avec XMMS, Noatun, Mplayer, Kaboodle ou Xine. Ils ont chacun des points forts et des points faibles. Elle peut utiliser les deux volumes de son syst&egrave;me pour ripper, graver et copier des CD avec K3b ou Gnome Toaster. Elle peut aussi regarder des DVD avec Mplayer d&egrave;s lors qu&rsquo;elle n&rsquo;oublie pas d&rsquo;utiliser le flag ++dvd en le compilant. Et pour la retouche d&rsquo;images, quoi de mieux que The Gimp ?</p>
<p>
          Pour qu&rsquo;elle ne s&rsquo;ennuie pas avec l&rsquo;apparence du syst&egrave;me, j&rsquo;ai mis en place des jobs cron qui changent le th&egrave;me du bureau et les widgets chaque jour.</p>
<p>
          Je ne sais pas si elle pr&eacute;voit de mettre en place un r&eacute;seau local, alors j&rsquo;ai install&eacute; les serveurs Samba et DHCP dans le cas o&ugrave; elle voudrait ajouter des ordinateurs en r&eacute;seau ou cr&eacute;er un intranet. Je ne suis pas certain que le Syst&egrave;me 7.5 communique bien par Samba, mais si elle veut mettre le vieux Mac en LAN, elle pourra sans aucun doute trouver une solution en bidouillant un peu le fichier de configuration de Samba smb.conf.</p>
<p>
          Installer la Mandrake avec la Gentoo a &eacute;t&eacute; assez facile. J&rsquo;ai fait &agrave; peu pr&egrave;s la m&ecirc;me chose qu&rsquo;avec la Gentoo, sauf pour les th&egrave;mes de bureau o&ugrave; j&rsquo;ai choisi des choses diff&eacute;rentes pour donner &agrave; chaque configuration son propre look &amp; feel. J&rsquo;ai aussi ajout&eacute; quelques jeux de la distribution Mandrake et install&eacute; Bochs pour qu&rsquo;elle puisse ouvrir des sessions Windows 98 sur un de ses bureaux virtuels.</p>
<p>
          J&rsquo;ai finalement exp&eacute;di&eacute; la machine (que j&rsquo;ai appel&eacute;e &ldquo;La B&ecirc;te&rdquo;) &agrave; ma grand-m&egrave;re via UPS la semaine derni&egrave;re. Je sais qu&rsquo;elle l&rsquo;a re&ccedil;ue, mais je n&rsquo;ai pas encore eu l&rsquo;occasion de lui en parler. Ma m&egrave;re l&rsquo;a appel&eacute;e et m&rsquo;a dit qu&rsquo;elle n&rsquo;avait pas pass&eacute; l&rsquo;&eacute;tape du boot switcher, mais d&egrave;s que j&rsquo;aurai un peu de temps libre je l&rsquo;appellerai pour lui expliquer tout &ccedil;a. Ma m&egrave;re m&rsquo;a aussi dit qu&rsquo;elle s&rsquo;&eacute;tait abonn&eacute;e &agrave; Internet par cable, ce qui est tr&egrave;s pratique puisque je pourrai l&rsquo;inscrire &agrave; des groupes Usenet pour qu&rsquo;elle puisse poser des questions et enoyer des rapports de bugs si elle en trouve.</p>
<p>
          Ce week-end je vais aussi voir si je peux rentrer dans son syst&egrave;me par SSH pour mettre en place quelques scripts de la mort. Cela lui facilitera probablement la vie, et je suis s&ucirc;r qu&rsquo;elle apprendra &agrave; aimer La B&ecirc;te. </p>
<p>
&agrave; Paris le 7/02/05</p>
