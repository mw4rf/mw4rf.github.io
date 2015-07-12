---
layout: post
status: publish
published: true
title: De Borges à l'informatique, des bits aux octets
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "<i>Toi, qui me lis, es-tu sûr de comprendre ma langue ?</i> (Jorge Luis
  Borges). Connaissez-vous les unités informatiques de représentation de volumes de
  données ? Certainement, ce sont les \"méga\" et les \"giga\". Savez-vous que c'est
  en réalité bien plus complexe qu'il n'y paraît ? Les professionnels jouent de cette
  complexité d'une manière qui n'est pas toujours très honnête. On pourrait même souvent
  parler de publicité mensongère, ou d'étiquetage erroné. Ainsi, lorsqu'il y a écrit
  \"1 To\" sur la boîte d'un disque dur, celui-ci ne pourra contenir en réalité que
  931 Go une fois formaté. La différence entre la capacité affichée et la capacité
  effective atteint presque 10%. Plus grave encore, les fournisseurs d'accès à Internet
  se gardent bien de préciser que la vitesse réelle de votre ligne \"10 mégas\" est
  en réalité de 1,25 méga. Pourquoi ces différences ? Parlons-nous vraiment la même
  langue ?\r\n"
wordpress_id: 133
wordpress_url: http://www.valhalla.fr/index.php/2007/11/09/de-borges-a-linformatique-des-bits-aux-octets/
date: '2007-11-09 17:46:52 +0100'
date_gmt: '2007-11-09 16:46:52 +0100'
categories:
- Internet
- Actu & Humeur
- Informatique
- Featured
tags:
- Informatique
- science
- Juridique
- NTIC
permalink:  /2007/11/09/de-borges-a-linformatique-des-bits-aux-octets/
---
<p><i>Toi, qui me lis, es-tu sûr de comprendre ma langue ?</i> (Jorge Luis Borges). Connaissez-vous les unités informatiques de représentation de volumes de données ? Certainement, ce sont les "méga" et les "giga". Savez-vous que c'est en réalité bien plus complexe qu'il n'y paraît ? Les professionnels jouent de cette complexité d'une manière qui n'est pas toujours très honnête. On pourrait même souvent parler de publicité mensongère, ou d'étiquetage erroné. Ainsi, lorsqu'il y a écrit "1 To" sur la boîte d'un disque dur, celui-ci ne pourra contenir en réalité que 931 Go une fois formaté. La différence entre la capacité affichée et la capacité effective atteint presque 10%. Plus grave encore, les fournisseurs d'accès à Internet se gardent bien de préciser que la vitesse réelle de votre ligne "10 mégas" est en réalité de 1,25 méga. Pourquoi ces différences ? Parlons-nous vraiment la même langue ?<br />
<a id="more"></a><a id="more-133"></a></p>
<h2>Des bits et des bytes</h2>
<p>L'informatique, comme chacun le sait, repose sur un système électronique binaire : le courant passe ou il ne passe pas. Cette alternative est représentée, par convention, par deux chiffres : 0 et 1. Les logiciels sont en fait, au plus bas niveau, des séries de 0 et de 1. Un 0 ou un 1, le fait que le courant passe ou ne passe pas, est appelé un <b>bit</b>. Autrement dit, le bit est <i>une unité de mesure en informatique désignant la quantité élémentaire d'information représentée par un chiffre du système binaire</i> (Wikipédia).</p>
<p>Les bits s'assemblent par groupes de 8. Ces groupes sont à leur tour appelés <b>bytes</b> en anglais, ou <b>octets</b> en français.</p>
<p>Dans la table ASCII, qui contient tous les caractères courants de l'alphabet anglais, chaque lettre est représentée par un octet. Pour être plus précis, chaque lettre est identifiée par un 0 suivi d'une série de 7 bits (8 bits en tout). Par exemple, lorsqu'on tape la lettre "a", l'ordinateur comprend en réalité "01100001". Le code pour un "A" majuscule est différent : "01000001". Pour un "b" minuscule, le code est "01100010", et pour un "B" majuscule, "01000010". Et ainsi de suite pour toutes les lettres courantes. On comprend donc que <b>1 lettre = 1 octet</b> dans le système ASCII.</p>
<p>L'octet est devenu par convention l'unité de représentation des volumes de données. Son abréviation est <b>b</b> (pour <i>byte</i>), la lettre <b>o</b> ne pouvant être utilisé par risque de confusion avec le chiffre 0. D'autres unités sont des multiples de l'unité de base : Kb (Kilo byte), Mb (Méga byte), etc. Le <i>bit</i>, quant à lui, n'a pas d'abréviation, il n'est pas une unité utilisée pour la représentation d'un volume de données. En résumé : l'affichage "Mb" ou "MB" est équivalent à "Mo" ou "MO" et désigne des Méga-octets ; de même pour Kb (Kilo), Gb (Giga), Tb (Tera), etc.</p>
<h2>Des multiples de 10 ?</h2>
<p>Le système décimal que nous connaissons (et qui provient des chiffres arabes avec l'ajout du 0) permet d'organiser les quantités en multiples de 10. On part ainsi d'une unité, par exemple le mètre, que l'on multiplie par 10 pour obtenir un décamètre. On multiplie par 100 (= 10*10 = 10^2) pour obtenir un hectomètre ou par 1000 (10^3) pour obtenir un kilomètre. A l'inverse, on divise par 10 (10^-1) pour obtenir un décimètre, par 100 (10^-2) pour un centimètre ou par 1000 (10^-3) pour un millimètre. Ce système fonctionne pour toutes les unités : mètre, gramme, litre, euro, etc ; sauf en informatique.</p>
<p>Combien y a-t-il de mètres dans 1 Km ? Réponse : 1000.<br />
Combien y-a-t-il de grammes dans 1 Kg ? Réponse : 1000.<br />
<i>Combien y-a-t-il d'octets dans 1 Kb ? Réponse : 1024.</i></p>
<p>Il n'y a pas d'erreur à la ligne précédente. Dans 1 Kb, il y a bien 1024 octets. En réalité, il s'agit de 2 à la puissance 10 (2^10). Pour connaître le nombre d'octets dans 1 Mb, il faut multiplier deux fois par 1024 : 1 Mb = 1024 Kb = 1024*1024 b = 1.048.576 octets. On voit bien que plus l'unité de mesure est grande, plus la différence avec le système décimal s'accentue.</p>
<p>1 Kb = 2^10 = 1 024 octets<br />
1 Mb = 2^20 = 1 048 576 octets<br />
1 Gb = 2^30 = 1 073 741 824 octets<br />
1 Tb = 2^40 = 1 099 511 627 776 octets</p>
<p>Un tel système étant assez difficile à comprendre pour le grand public, les fabricants utilisent le système décimal classique dans lequel 1 Kb = 1000 octets et 1 Mb = 1000 Kb. Ainsi, lorsque vous achetez un disque dur de 1 Tb, cette mesure est faite en application du système décimal. C'est une mesure abstraite, décidée par convention, qui ne correspond pas à la réalité. La capacité réelle du disque ("après formatage"), est de 931 Go. On perd ainsi 69 Go par la seule différence de mesure entre la réalité et les conventions. Faisons un petit calcul :</p>
<p>Taille conventionnelle : 1 Tb = 1.000.000.000.000 octets<br />
1.000.000.000.000 octets / 1024 = 976.562.500 Kb<br />
976.562.500 Kb / 1024 = 953.674,3 Mb<br />
953.674,3 Mb / 1024 = 931,3 Gb</p>
<p>Conclusion : la taille du disque affichée sur l'étiquette est de 1 Tb, mais la taille réelle n'est que de 931 Gb.</p>
<p>Les fabricants auraient très bien pu faire le calcul inverse. C'est-à-dire faire en sorte que la taille réelle du disque, après formatage, soit effectivement de 1 Tb. Si tel était le cas, l'affichage "1 Tb" sur la boîte du disque serait justifié. Mais pour le moment, tant que les fabricants utiliseront des conventions qui ne correspondent pas à la réalité, leurs affichages seront erronés et mensongers.</p>
<p>Certains consommateurs américains qui ont acheté un iPod de Apple ont constaté cette différence entre la capacité affichée et la capacité réelle. Ils ont fait un procès au fabricant des disques durs, Seagate, et ont gagné. Seagate s'est engagée à rembourser une somme proportionnelle à la différence entre la capacité affichée et la capacité réelle des disques.</p>
<p>Le problème est ici que l'utilisateur croit réellement disposer d'une capacité de 1 Tb, alors qu'il ne dispose en réalité que de 931 Gb. Ce problème est longtemps resté imperceptible, car les capacités de stockage n'étaient jusqu'alors pas très importantes. Sur 1 Gb (1000 Mb), la perte est de 47 Mb seulement. Désormais, les disques ont des capacités de plus en plus importantes, et la différence entre l'affichage et la réalité s'accentue, si bien que l'acheteur d'un disque de 1 Tb qui se voit privé de presque 10% de la capacité de stockage, peut se sentir floué.</p>
<h2>Des multiples de 8 ?</h2>
<p>S'il est assez évident que la taille des disques est affichée en système décimal par commodité et non pas intention de nuire, il en va autrement pour les débits des connexions à Internet. Les fournisseurs d'accès entretiennent en effet la confusion en parlant de "méga" sans préciser l'unité de base.</p>
<p>Car en matière de réseau, l'unité de base reste le <b>bit</b> (et non le <b>byte</b> ou <b>octet</b>). Un petit rappel historique est nécessaire pour en comprendre les raisons. Les premières connexions à Internet passaient par des <i>modems analogiques</i>. Ces modems affichaient des vitesses, variable selon les modèles, de 9600, 14400, 28800 ou encore 56600 <b>bauds</b> ou <b>bps</b>. Les <i>bauds</i> représentent la fréquence d'échantillonnage qui, en présence d'un débit <i>bivalent</i>, peuvent être assimilés à des <b>bits par seconde (bps)</b>.</p>
<p>L'unité <i>Baud</i>, utilisée pour les premiers modems, n'est presque plus employée aujourd'hui. Elle ne l'est plus, en tout cas, pour les lignes numériques, ADSL ou optiques. Cependant, le débit est toujours représenté par des <b>bps</b> (bits par seconde).</p>
<p>Lorsqu'un fournisseur d'accès fait de la publicité pour une "connexion ADSL à 10 méga", il faut comprendre <i>10 Méga-BITS par seconde</i> et non pas <i>10 Méga-BYTES/OCTETS par seconde</i>. Or, comme il a été expliqué ci-avant, 1 octet = 8 bits, donc 1 bit = 1/8 octet.</p>
<p>Imaginez que vous ayez un fichier de 100 Mb à transférer sur le réseau. Si votre ligne a réellement une vitesse de "10 mégas" par seconde, le fichier devrait être transféré en 10 secondes. Pourtant, le transfert sera beaucoup plus long. La ligne a en effet une vitesse 8 fois moindre à la vitesse annoncée, puisque la vitesse est calculée en <i>bits par seconde</i> et non en <i>octets par seconde</i>. Ainsi, les "10 mégas" sont en fait 10/8 = 1,25 méga par seconde. Le fichier de 100 Mb sera transféré en 80 secondes.</p>
<p>On peut reprocher aux fournisseurs d'accès de faire une publicité mensongère et de tromper intentionnellement le client en entrenant une confusion entre les méga-octets que tout le monde connaît et les méga-bits utilisés pour représenter la vitesse d'une connexion. C'est en effet bien conscients du problème qu'ils choisissent d'employer l'expression "méga" au lieu de citer l'unité de mesure complète. Pour l'immense majorité des gens, "méga" désigne ce qu'ils connaissent depuis les disquettes de 1,44 Mb jusqu'aux disques durs d'aujourd'hui, en passant par la mémoire RAM et la mémoire vidéo des ordinateurs personnels. Il est donc légitime pour eux de penser qu'avec une connexion à "10 méga", un fichier de leur disque dur dont la taille est de "100 méga", sera transféré en 10 secondes !</p>
