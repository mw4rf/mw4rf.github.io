---
layout: post
status: publish
published: true
title: Prison Certifiée Windows

  
  



excerpt: "Une information agite la communauté Linux depuis le début de la semaine:
  les ordinateurs \"certifiés Windows 8\", dotés du petit autocollant Microsoft, ne
  pourraient se défaire de Windows.\r\n\r\n"
wordpress_id: 828
wordpress_/?p=828
date: '2011-09-22 18:59:48 +0200'
date_gmt: '2011-09-22 16:59:48 +0200'
categories:
- Informatique
- Actu & humeur
tags:
- Informatique
- Linux
- Windows
- Microsoft
permalink:  /2011/09/22/prison-certifiee-windows/
---
<p>Une information agite la communauté Linux depuis le début de la semaine: les ordinateurs "certifiés Windows 8", dotés du petit autocollant Microsoft, ne pourraient se défaire de Windows.</p>
<p><a id="more"></a><a id="more-828"></a></p>
<p>En effet, pour obtenir la "certification Windows 8", les constructeurs d'ordinateurs devront abandonner le vénérable BIOS et lui substituer l'UEFI <i>(Unified Extensible Firmware Interface)</i>. Le BIOS et l'UEFI sont des logiciels intégrés dans la mémoire morte (ROM) des ordinateurs, dont le rôle est de gérer le démarrage du matériel et, par la suite, certaines interactions entre le matériel et les autres logiciels. L'UEFI, ou le BIOS, est le premier logiciel à s'exécuter lorsqu'on allume un ordinateur.</p>
<p>Le BIOS, ou l'UEFI, s'exécute, donc, au démarrage, et initialise le matériel. Une fois le disque dur initialisé, un autre logiciel (le "bootloader"), installé sur ce disque, prend le relais. Ce second logiciel lance le système d'exploitation, qui prend alors les choses en main.</p>
<p>Cela étant dit, voici le problème: la certification Windows 8 exige que le processus de démarrage de l'ordinateur soit sécurisé ("secured boot"). Cela signifie que tous les logiciels et tous les périphériques qui interviennent pendant le démarrage de l'ordinateur, doivent être dotés d'un certificat numérique, signé par une Autorité de Certification et chiffré.</p>
<p>Première conséquence: l'ordinateur pourrait ne plus démarrer si l'on change un périphérique. Ou alors, le nouveau périphérique pourrait ne pas fonctionner avec Windows. Il serait alors nécessaire de retourner l'ordinateur au fabricant au moindre problème matériel, ou d'en acheter un autre...</p>
<p>Deuxième conséquence: le processus de démarrage est verrouillé par ce système, qui impose le démarrage de Windows... il deviendrait donc impossible de lancer Linux sur une machine "certifiée Windows 8".</p>
<p>Voilà donc le problème.</p>
<p><b>Pourquoi ?</b><br />
Microsoft ne voit pas Linux d'un très bon oeil. La société semble donc avoir trouvé un bon moyen pour imposer aux utilisateurs de PC son système d'exploitation. Mais Microsoft s'attaque surtout à Android... car la prochaine bataille, dans le monde de l'informatique, sera celle des tablettes.</p>
<p><b>Danger pour Linux ?</b><br />
Il est trop tôt pour le dire. Il y aura probablement des solutions techniques pour contourner le système de boot sécurisé. Les constructeurs eux-mêmes pourraient en fournir. En effet, la plupart des constructeurs chercheront à obtenir la certification Windows, et se plieront aux exigences de Microsoft, mais ils pourraient aussi ne pas vouloir perdre le marché des utilisateurs de Linux et fournir, par exemple, un interrupteur pour désactiver le boot sécurisé. Si tel est le cas, il ne s'agira que d'une incompatibilité de plus entre certains ordinateurs et Linux...</p>
<p><b>Légal ?</b><br />
D'un point de vue juridique, de nombreuses questions se posent... et des questions très complexes. En voici quelques-unes :</p>
<ul>
<li>Ne s'agit-il pas d'une vente liée du matériel et du logiciel ? Il y a déjà vente liée, dans de nombreux cas où le remboursement du système d'exploitation n'est pas possible sans retour du matériel. Mais là, ce serait encore plus clair.</li>
<li>Serait-il licite de "hacker" l'UEFI ? Probablement pas... la loi DADVSI interdit en effet le contournement de DRM, qui est sanctionné pénalement. Il ne s'agit pas là d'une mesure ayant pour but premier de protéger des droits de propriété intellectuelle, mais Microsoft pourrait soutenir que la mesure vise à protéger son système d'exploitation propriétaire.</li>
<li>Cela pose-t-il un problème de concurrence ? Oui. Et c'est probablement sous cet angle qu'il faudra attaquer Microsoft, si la société décide de maintenir l'exigence du boot sécurisé. En effet, il s'agit clairement d'un abus de la part de Microsoft de sa position dominante du le marché des systèmes d'exploitation, pour empêcher l'installation de système concurrents (Linux/Android).</li>
</ul>
<p><i><b>Mise-à-jour (25 sept. 2010)</b>: Microsoft a réagi à la polémique en expliquant que le "boot sécurisé" et la possibilité de le désactiver dans l'UEFI était de la responsabilité des constructeurs. Il appartiendrait donc à ces derniers de fournir une option, au sein de l'UEFI, visant à désactiver le "boot sécurisé" et à rendre ainsi possible l'installation de systèmes d'exploitation concurrents de Windows.</i></p>
<p><b>Pour en savoir plus:</b></p>
<p>1) Sur cette actualité:<br />
- <a href="http://www.itworld.com/it-managementstrategy/205255/windows-8-oem-specs-may-block-linux-booting" title="Windows 8 OEM specs may block Linux booting - ITWorld.com">Windows 8 OEM specs may block Linux booting - ITWorld.com</a><br />
- <a href="http://www.omgubuntu.co.uk/2011/09/windows-8-secure-boot-prevent-linux-installation/" title="Windows 8 ‘Secure Boot’ Could Stop You Installing Linux">Windows 8 ‘Secure Boot’ Could Stop You Installing Linux - OMGUbuntu.com</a><br />
- <a href="http://arstechnica.com/business/news/2011/09/windows-8-secure-boot-will-complicate-linux-installs.ars">Windows 8 secure boot could complicate Linux installs - ArsTechnica</a><br />
- <a href="http://www.webupd8.org/2011/09/windows-8-certified-computers-may-not.html" title="Windows 8 Certified Computers May Not Be Able To Boot Linux">Webupd8.org</a><br />
- <a href="http://www.numerama.com/magazine/19907-windows-8-pourrait-empecher-un-dual-boot-linux.html">Windows 8 pourrait empêcher un dual-boot Linux - Numerama</a><br />
- <a href="http://www.pcinpact.com/actu/news/65920-windows-8-secure-boot-oem-linux.htm">Windows 8 : le Secure Boot pourrait faire du tort à Linux - PCInpact</a></p>
<p>2) Sur la réponse de Microsoft:<br />
- <a href="http://www.numerama.com/magazine/19927-windows-8-ne-genera-pas-le-demarrage-de-linux-selon-microsoft.html">Windows 8 ne gênera pas le démarrage de Linux, selon Microsoft - Numerama</a><br />
- <a href="http://www.pcinpact.com/actu/news/65961-windows-8-secure-boot-matthew-garrett-replique-inquietudes.htm">Secure Boot : la réponse de Microsoft incomplète pour Garrett - PCInpact</a></p>
<p>3) Sur le "secure boot" de l'UEFI et Windows 8:<br />
- <a href="http://blogs.msdn.com/b/b8/archive/2011/09/22/protecting-the-pre-os-environment-with-uefi.aspx">Protecting the pre-OS environment with UEFI</a></p>
