---
layout: "post"
published: true
title: "Partitions rebelles (à propos de Bootcamp)"
author: GF
date: "2015-06-30 17:15:50"
categories:
- coup de gueule
- mac
- windows
tags:
- mac
- windows
---

Quand on cherche à faire un peu de [McM][1] dans [GuildWars 2][2] et que l’on se retrouve plongé dans les _[man pages][3]_ de _[diskutil][4]_ et de _[gpt][5]_, c’est qu’il y a comme un souci quelque part…

## Prologue

GW2 ne fonctionne pas très bien sur Mac, c’est un _port_ [Cider][6]. Cela signifie que le programme est compilé pour Windows et que le code est traduit pour Mac, sans les différentes optimisations nécessaires pour qu’ils tourne à peu près correctement. Le taux de [FPS][7] est très bas et les _[memory leaks][8]_ nombreux. Mais cela fonctionne, tant bien que mal et l’on ne va pas (trop) se plaindre.

Le problème est que j’ai installé la première _Developer preview_ d’OS 10.11 _El Capitan_. Or, cette nouvelle version d’OS X contient une mesure de protection du système interdisant à _tous_ les utilisateurs, y compris _[root][9]_, d’accéder à certains fichiers et dossiers. En particulier, l’écriture dans _/usr/bin_ est interdite. 

Après l’installation du noyau de GW2, le _launcher_ télécharge les données du jeu, qui sont compressées au [format TAR][10] afin d’accélérer le téléchargement et de réduire la bande passante nécessaire. Le format TAR est un protocole d’archivage des fichiers, qui permet de les compresser avec plusieurs algorithmes différents. Or, la commande _tar_ présente sur Mac utilise le format _BSD-tar_ (Mac OS X est construit sur le noyau _Darwin_, un Unix BSD) qui [n’est pas compatible][11] avec le format _GNU-tar_ utilisé par GW2… La première chose que le _launcher_ tente de faire est donc d’installer _GNU-tar_ pour décompresser les données téléchargées. Avec Yosemite est les systèmes précédents, aucun problème. Avec El Capitan, en revanche, l’installation est impossible car l’utilisateur _root_ n’a plus accès au dossier de destination, _/usr/bin_. En pratique, cela se traduit par une fenêtre d’élévation des droits demandant d’entrer un mot de passe administrateur qui n’a aucun effet : on aura beau taper le mot de passe, la fenêtre réapparaîtra aussitôt car, derrière le rideau de l’interface graphique, la commande se heurte à un refus du système (_ln: /usr/bin/gnutar: Operation not permitted_).

![][image-1]

Impossible de désactiver la mesure de protection, à cause d’un bug de la première Developer Preview. L’obstacle est donc insurmontable.

Allez, on installe Windows…

## Chapitre 1 : La « magie » Bootcamp

[Bootcamp][12] est un logiciel livré avec Mac OS X qui permet de créer une partition sur le disque dur système afin d’installer Windows en parallèle au système d’Apple. En principe, le processus est automatisé et tout se passe bien. 

Le premier problème rencontré, de manière classique, avec Bootcamp est que cet assistant d’installation idiot exige la présente d’un DVD d’installation de Windows si le Mac possède un lecteur DVD. Heureusement, mon MacBookPro n’en possède pas, parce que Windows est depuis longtemps distribué sous la forme d’une image disque à copier sur clé USB. Autre stupidité : Bootcamp exige la présence simultanée d’une clé USB afin d’y copier les _[drivers][13]_ destinés à aider Windows à prendre en charge les composants du Mac. En somme, les deux ports USB de mon Mac étaient accaparés par deux clés USB, j’ai dû débrancher les autres périphériques… Mais pas de bidouille cette fois, la partition est directement créée sans écueil. 

## Chapitre 2 : Les problèmes

Le Mac redémarre automatiquement sur la clé USB Windows, l’installation se lance. Quelques clics, on entre le numéro de série, et Windows demande sur quelle partition il doit être installé. C’est là que les ennuis commencent.

On sélectionne la partition « BOOTCAMP » et l’on clique sur « Installer ». Message d’erreur : _Le disque sélectionné possède une table de partition MBR. Sur les systèmes EFI, windows peut uniquement être installé sur des disques GPT_.  Ah. D’accord. Quelques recherches Google permettent de trouver un [début de solution][14], totalement inélégante : retourner sur Mac OS X, reformater la partition BOOTCAMP avec l’Utilitaire de disque… Un quart d’heure de perdu.

Le problème persiste. Je retourne donc sur Mac OS X (encore un quart d’heure de perdu, entre les reboots lents depuis un périphérique USB et la clé d’installation de Windows à réécrire chaque fois…). Cette fois, je supprime la partition BOOTCAMP avec l’utilitaire du même nom et crée une partition « manuellement » avec l’Utilitaire de Disque. Nouvel essai. Cette fois, Windows m’informe qu’il ne peut pas être installé parce que la [table de partition est du type _GPT_][15] et non _MBR_ : _Windows ne peut pas être installé sur ce disque. Le disque sélectionné est du style de partition GPT._. Les systèmes Unix modernes utilisent des tables de partition GPT alors que Windows en est resté au vieux Master Boot Record. Bootcamp simule un MBR afin de « tromper » Windows. Mais puisque je n’utilise plus Bootcamp mais une partition créée manuellement, la tromperie ne passe plus…

En redémarrant avec la touche Option (Alt) enfoncée je m’étais rendu compte que ma clé USB offrait deux choix différents de boot : _EFI_ et _Windows_. Si l’option _Windows_ ne fonctionne pas, on pourrait essayer l’option _EFI_… Nouveau reboot. Et nouvel échec ! Cette fois, un message étrange m’informant que Windows ne trouve pas de partition libre. Pourtant elle est devant son nez, sélectionnée dans la liste, toute belle et toute propre… Qu’à cela ne tienne, je supprime cette partition que Windows n’aime pas (il a ses humeurs), ce qui ne laisse avec un espace vide sur le disque. Je demande ensuite à Windows de créer sa propre partition sur cet espace vide, me disant que s’il la crée lui-même, il devrait ensuite en reconnaître l’existence. Le petit coquin s’étape et crée en réalité plusieurs partitions : la partition principale du système, une partition _Recovery_ (pour réinstaller Windows sans support d’installation, en cas de problème) et une partition réservée au système dont j’ignore l’utilité. 

Cela semble marcher, jusqu’à ce que j’appuie sur le bouton « Suivant ». Erreur fatale, l’installation de Windows ne peut se poursuivre. J’ai déjà perdu au moins une heure avec toutes ces idioties. Je décide donc d’arrêter les frais en rétablissant ma partition d’origine entièrement consacrée à Mac OS X. Je reboot donc sur OS X et, à l’aide de l’Utilitaire de Disque, je tente de redimensionner la partition principale pour qu’elle occupe l’ensemble du disque. Et cela échoue avec un message d’erreur pour le moins incompréhensible.

## Chapitre 3 : Table des partitions endommagée

C’est peut-être un bug de la _beta_ d’El Capitan, ou simplement un oubli de la part d’Apple ou une nouvelle preuve du peu d’importance accordée à l’interopérabilité des systèmes, je ne sais pas ; toujours est-il que j’ai fini par trouver la raison du problème : parmi les partitions crées à l’étape précédente par Windows, l’une d’entre-elles (celle qui est réservée au système et dont j’ignore l’usage) est invisible pour l’Utilitaire de Disque d’OS X. S’il ne peut pas changer la taille de la partition principale du Mac (que l’on peut appeler « A ») en la fusionnant avec les autres partitions Windows c’est que cette partition « invisible » est située au milieu et que l’on ne peut fusionner que des partitions adjacentes. Ainsi, A ne peut pas fusionner avec C et D parce que la partition B est au milieu d’elles. 

Au final, j’avais une partition de 300 Go en état de marche, avec OS X installée dessus, et plusieurs partitions totalisant 200 Go totalement perdus. Vu le prix des [SSD][16], je voulais récupérer mes _gigas_ perdus…

La seule façon de supprimer cette partition, qui demeure invisible des utilitaires avec une interface graphique, est de recourir à la ligne de commande, en l’occurrence _gpt_, pour modifier la table de partition… on pénètre dans un domaine très dangereux.

## Chapitre 4 : La ligne de commande

La commande _gpt_ est accessible depuis le terminal du support d’installation de Mac OS X.

Après avoir affiché la liste de partitions, y compris la partition invisible, [j’ai supprimé toutes les partitions créées par Windows][17] (en l’occurrence les partitions 4, 5 et 6 du disque principal, _disk0_).

	gpt -r -vv show disk0
	gpt remove -i 4 disk0

Désormais, il me restait ma partition principale Mac de 300 Go et 200 Go d’espace vide. Impossible de redimensionner la partition principale car _diskutil_ ne peut fusionner deux partitions que si elles sont formatées en HFS+. Il me fallait donc créer une partition dans l’espace vide, puis formater cette partition en HFS+.

_GPT_ affiche les blocs d’espace, de cette manière (c’est un exemple, et non pas ma configuration réelle) :

	40      409600      1  GPT part - C12A7328-F81F-11D2-BA4B-00A0C93EC93B
	409640   195575768         
	195985408   389353696      2  GPT part - 48465300-0000-11AA-AA11-00306543ECAC

L’espace vide est ici la deuxième ligne. Il commence au bloc identifié par le premier nombre (409640) et s’étend sur le nombre de blocs identifié par la deuxième (195575768).

Il paraît qu’Apple exige 128 MiB (262144 blocs) d’espace libre avant une nouvelle partition, mais dans mon cas je n’ai pas rencontré de problème en faisant commencer la nouvelle partition au bloc de départ… L’exigence est-elle toujours présente ?

En revanche, il faut que la taille de la partition soit un multiple de 8. Sans cela, j’ai rencontré un message d’erreur. J’ai donc dû calculer la taille de manière à ce que le nombre de blocs soit visible par 8 (le nombre astronomique finissait par 71, je l’ai abaissé à 64 = 8x8). Je pouvais dès lors créer la partition.

	gpt add -b [bloc de départ] -s [taille multiple de 8] -t hfs disk0

Voilà une partition créée, ouf ! Reste à la formater en HFS+. La commande _diskutil list_ me permet de savoir que ma nouvelle partition est identifiée sous le nom _/dev/disk0s4_ (c’est-à-dire la quatrième partition du disque 0, les trois premières ayant été créé par Apple : l’EFI, la partition _recovery_ tout comme Windows, et la partition principale _Macintosh HD_). Je lance la commande pour formater, en donnant le petit nom de « oh lol » à cette partition qui m’aura bien fait suer.

	diskutil eraseDisk JHFS+ "ohlol" /dev/disk0s4

Bien. Voilà notre partition en état de fonctionnement. Reste à la fusionner avec la partition principale Macintosh HD. Pour ce faire, il faut trouver [l’UUID (identifiant unique)][18] du _volume_ de la partition principale. J’ai mis quelques minutes à comprendre que l’on ne parlait plus ici de la partition elle-même, telle que perçue par le noyau du système, mais du volume géré par le système à un plus haut niveau. 

![][image-2]

Cet identifiant unique est, ici, _ 24106536-FDD2-47BF-9112-62FDE1D32954_. Il ne restait plus qu’à entrer la commande finale…

	diskutil cs resizeStack 24106536-FDD2-47BF-9112-62FDE1D32954 %100

Et voilà ! 

J’ai rebooté sur Mac OS X et j’ai retrouvé avec grand plaisir mon volume Macintosh HD de 500 Go… Tant pis pour GW2 !


[1]:	http://wiki-fr.guildwars2.com/wiki/Monde_contre_Monde
[2]:	https://www.guildwars2.com/fr/
[3]:	https://fr.wikipedia.org/wiki/Man_(Unix)
[4]:	https://developer.apple.com/library/mac/documentation/Darwin/Reference/ManPages/man8/diskutil.8.html
[5]:	https://developer.apple.com/library/mac/documentation/Darwin/Reference/ManPages/man8/gpt.8.html
[6]:	https://en.wikipedia.org/wiki/TransGaming
[7]:	https://fr.wikipedia.org/wiki/Images_par_seconde
[8]:	https://fr.wikipedia.org/wiki/Fuite_de_m%C3%A9moire
[9]:	https://fr.wikipedia.org/wiki/Root
[10]:	https://fr.wikipedia.org/wiki/Tar_(informatique)
[11]:	http://unix.stackexchange.com/questions/101561/what-are-the-differences-between-bsdtar-and-gnu-tar
[12]:	https://www.apple.com/fr/support/bootcamp/
[13]:	https://fr.wikipedia.org/wiki/Pilote_informatique
[14]:	https://discussions.apple.com/thread/5474614?start=15&tstart=0
[15]:	https://discussions.apple.com/thread/3094944?tstart=0
[16]:	https://fr.wikipedia.org/wiki/Solid-state_drive
[17]:	http://apple.stackexchange.com/questions/63130/create-new-partition-in-unallocated-space-with-diskutil
[18]:	https://fr.wikipedia.org/wiki/Universal_Unique_Identifier

[image-1]:	/public/posts/2015-06-30-partitions-rebelles/gnutar.png "Message d'erreur lors de l'installation de GNU-tar"
[image-2]:	/public/posts/2015-06-30-partitions-rebelles/uuid.png "Identification de l'UUID du volume"