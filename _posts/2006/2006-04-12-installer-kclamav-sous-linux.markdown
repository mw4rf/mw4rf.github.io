---
layout: post
status: publish
published: true
title: Installer K/ClamAV sous Linux ?
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "<img src=\"/public/posts/2006-04-12-clamav/clamav.png\" align=\"left\" alt=\"ClamAV Logo\"
  />\r\nEn lisant les nouvelles ce matin, j'ai appris que des programmeurs avaient
  réalisé un virus crossplatform en Assembleur. Il fonctionne aussi bien sous Windows
  que sous Linux, et peut servir de base à d'autres auteurs de virus pour mettre en
  oeuvre leur savoir destructeur. Heureusement, ce virus-là n'en est pas réellement
  un, c'est plutot un guide donnant les lignes directrices pour une comaptibilité
  avec les deux systèmes. Ca m'a donné une idée: installer l'antivirus ClamAV, opensource
  et gratuit. Ce n'était pas par nécessité, puisque je n'ai aucune peur de ce virus,
  que je sais quand comment et pourquoi je suis susceptible de me faire infecter,
  et que le poste sur lequel j'ai réalisé l'installation peut se permettre de planter
  et de voir son système réinstallé après formatage. Non, si j'ai installé cet antivirus,
  ce n'était que pour le tester. Et bien, je n'ai pas été déçu ! En effet, l'installation
  de l'interface graphique, KlamAV (qui se détâche de ClamAV, celui-ci s'exécutant
  normalement en ligne de commande), est un vrai parcours du combattant. C'est donc
  tout naturellement que j'ai entrepris d'écrire cet article qui aura pour but d'expliquer
  comment installer et configurer ClamAV et l'interface KlamAV sous Linux. Dernière
  précision avant de commencer: les étapes décrites sont basées sur une OpenSuse 10;
  elles demeurent valables pour la plupart des grosses distributions (RedHat, Mandrake/Mandriva,
  etc.), mais seront peut être légèrement différentes pour les distributions basées
  sur Debian.\r\n\r\n"
wordpress_id: 96
wordpress_url: http://www.valhalla-fr.eu/index.php/2006/04/12/installer-kclamav-sous-linux/
date: '2006-04-12 20:17:23 +0200'
date_gmt: '2006-04-12 18:17:23 +0200'
categories:
- Linux
tags:
- Informatique
- sécurité
- Linux
permalink:  /2006/04/12/installer-kclamav-sous-linux/
---
<p><img src="/public/posts/2006-04-12-clamav/clamav.png" align="left" alt="ClamAV Logo" /><br />
En lisant les nouvelles ce matin, j'ai appris que des programmeurs avaient réalisé un virus crossplatform en Assembleur. Il fonctionne aussi bien sous Windows que sous Linux, et peut servir de base à d'autres auteurs de virus pour mettre en oeuvre leur savoir destructeur. Heureusement, ce virus-là n'en est pas réellement un, c'est plutot un guide donnant les lignes directrices pour une comaptibilité avec les deux systèmes. Ca m'a donné une idée: installer l'antivirus ClamAV, opensource et gratuit. Ce n'était pas par nécessité, puisque je n'ai aucune peur de ce virus, que je sais quand comment et pourquoi je suis susceptible de me faire infecter, et que le poste sur lequel j'ai réalisé l'installation peut se permettre de planter et de voir son système réinstallé après formatage. Non, si j'ai installé cet antivirus, ce n'était que pour le tester. Et bien, je n'ai pas été déçu ! En effet, l'installation de l'interface graphique, KlamAV (qui se détâche de ClamAV, celui-ci s'exécutant normalement en ligne de commande), est un vrai parcours du combattant. C'est donc tout naturellement que j'ai entrepris d'écrire cet article qui aura pour but d'expliquer comment installer et configurer ClamAV et l'interface KlamAV sous Linux. Dernière précision avant de commencer: les étapes décrites sont basées sur une OpenSuse 10; elles demeurent valables pour la plupart des grosses distributions (RedHat, Mandrake/Mandriva, etc.), mais seront peut être légèrement différentes pour les distributions basées sur Debian.</p>
<p><a id="more"></a><a id="more-96"></a></p>
<h2>Première étape: Installation du moteur ClamAV</h2>
<p>Paradoxalement, c'est l'étape la plus simple. Mais cela vaut la peine de faire quelques efforts pour obtenir une belle interface graphique, car ClamAV en ligne de commande est un peu spartiate !</p>
<p>Avant tout, il faut récupérer le logiciel. Vous le trouverez:<br />
- <a href="http://www.clamav.net/">Sur le site officiel</a> (source)<br />
- <a href="ftp://ftp.suse.com/pub/projects/clamav">Sur un FTP non-officiel</a> (RPM)</p>
<p>Pour installer le RPM, vous n'aurez normalement aucun problème: téléchargement sur le bureau par exemple, (double)clic sur l'icône du RPM, clic sur le bouton "Installer", mot de passe root, on attend quelques secondes et c'est fini. Je vous conseille d'installer ClamAV par ce moyen, sauf si vous avez envie de le compiler.</p>
<p>Pour compiler ClamAV depuis les sources, ce n'est pas bien difficile. Il vous faut cependant avoir installé le compileur et les librairies nécessaires. L'installation se déroule normalement:<br />
    
{%highlight bash %}
./configure
make
sudo make install 
[Un mot de passe adminsitrateur (root) est demandé ici]
{% endhighlight %}

<p>En avant pour une explication, une bonne fois pour toutes:<br />
1) Ces commandes sont à taper dans le terminal. Si un mot de passe est demandé, il faut bien entendu le fournir (il n'apparaît pas à l'écran pendant qu'on l'écrit, pour des raisons de sécurité).<br />
2) Il ne faut pas s'affoler si "tout plein" de messages défilent à l'écran: ignorez-les, tant que ça défile c'est que tout va bien. Si au contraire cela ne défile plus, deux possibilités: c'est fini, il y a un problème. S'il y a un problème, dans 99% des cas, ce sera un dépendance non satisfaite.<br />
3) Les logiciels que vous installez ont besoin de bibliothèques ("lib" pour "libraries"). Si une de ces bibliothèques est absente, le logiciel ne s'installera pas (ne se compilera pas). Il vous faudra trouver la bibliothèque manquante pour résoudre le conflit de dépendance, et pouvoir compiler le logiciel.<br />
4) Pour trouver le maillon manquant, la meilleure solution reste le gestionnaire de paquetages de votre distribution (gestionnaire de RPM). Pour Mandriva, pensez aussi à URPMI. Si vous ne pouvez obtenir le paquetage nécessaire par ce moyen, allez faire un tour sur http://rpmfind.net<br />
5) N'oubliez pas: il y a toujours un problème, mais il n'est pas toujours difficile à résoudre. Quand on a l'habitude (au bout de 4 ou 5 logiciels compilés...) on repère le fichier manquant en un coup d'oeil et on l'obtient/installe en 2 minutes. Il faut garder son calme (c'est parfois difficile avec Linux!) et procéder méthodiquement.</p>
<h2>Deuxième étape: obtenir KlamAV et Dazuko</h2>
<p>Vous devez obtenir KlamAV lui-même pour commencer:<br />
- <a href="http://klamav.sourceforge.net/">Depuis le site officiel</a> (installer)<br />
- Séparément en deux parties: <a href="http://klamav.sourceforge.net/">depuis le site officiel</a> (source) et avec <a href="http://www.dazuko.org">Dazuko</a> (sources)</p>
<p>Petite explication. KlamAV est fourni sous la forme d'un "installer": un script avec interface graphique à la Windows, qui permet d'installer le logiciel en cliquant plusieurs fois sur "suivant". Mais à la différence des logiciels Windows de ce type, "l'installer" de KlamAV ne vous exonère pas de la phase de préparation de l'installation (recherche des dépendances notamment). Il ne fait qu'automatiser les étapes de configuration et de compilation. Il en découle qu'utiliser l'installer ou non revient exactement au même pour ce qui est des ennuis que nous allons rencontrer. La seul intérêt de l'installer est qu'il contient déjà les sources de KlamAV et de Dazuko, élément nécessaire à l'installation, et qu'il s'occupe de les compiler pour vous "si tout va bien". Nous allons par la suite utiliser cet "installer", et la suite de cet article aura pour but unique de faire en sorte que "tout aille bien".</p>
<p>Si vous décidez de ne pas utiliser l'installer, ce n'est pas vraiment plus compliqué. Vous devrez installer Dazuko manuellement (<span class="Code">./configure, make, make install</span>) après avoir suivi la troisième étape de cet article, puis installer KlamAV, soit en passant par le script d'installation (<span class="Code">sh install.sh</span>), soit par la procédure normale (<span class="Code">./configure && make && su -c 'make install'</span>).</p>
<h2>Troisième étape: préparation de l'installation de Dazuko</h2>
<p>Avant de lancer l'installation, il faut préparer le terrain. Et cela, le script d'installation ne le fait pas. C'est à vous de le faire.</p>
<p>Pour installer Dazuko, il vous faut posséder les sources du noyau linux (kernel-sources). Ce n'est pas compliqué: lancez votre gestionnaire de RPM (de KDE, de Mandriva, Yast pour Suse, etc, toutes les distributions grand public en ont un), et recherchez "kernel". Une des entrées sera certainement "kernel-sources" ou quelque chose de ressemblant. Si le gestionnaire indique que les sources sont déjà installées, c'est bon, sinon installez les (vous aurez besoin du CD/DVD de votre distribution, et d'à peu près 200 Mo sur le disque).</p>
<p>Mais avoir les sources n'est pas tout, encore faut-il pouvoir les exploiter. Pour cela, vous devez posséder un compileur. Ou plutot LE compileur, le fameur "gcc". Rendez-vous de nouveau dans votre gestionnaire de paquetages, et recherchez "gcc". En règle générale, vous aurez besoin des éléments suivants:</p>
<ul>
<li /><span class="Code">gcc</span> (version 4+)
<li /><span class="Code">gcc-c++</span> (version identique à celle de "gcc")
<li /><span class="Code">gpp</span> (idem)
<li /><span class="Code">libgcc</span> (idem!)
</ul>
<p>Une fois les sources installées, vous devez le configurer. C'est un peu plus difficile. Ouvrez une fenêtre de terminal, et tapez:<br />

{%highlight bash %}
cd /usr/src/linux
make cloneconfig
make modules_prepare
{% endhighlight %}

<p>La dernière ligne devrait être quelque chose dans le genre (SUSE):<br />

{%highlight bash %}
  CHK     /usr/src/linux-2.6.13-15/include/linux/version.h<br />
make[1]: `arch/i386/kernel/asm-offsets.s' is up to date.<br />
{% endhighlight %}

Sinon, refaire un "make modules_prepare".</p>

<p>Si plus loin lors de la compilation (make) de KlamAV, vous avez le message suivant (ou un message approchant), c'est que cette étape n'a pas été réalisée, ou a été mal réalisée: <span class="Code">/bin/sh scripts/basic/fixdep: File not found</span>.</p>
<p>Vous devrez ensuite configurer <i>Module.symvers</i>, absent des sources par défaut:<br />

{%highlight bash %}
cp /boot/symvers-2.6.13-15-i386-default.gz /usr/src/linux<br />
mv symvers-2.6.13-15-i386-default.gz Module.symvers.gz<br />
gunzip /usr/src/linux/Module.symvers.gz<br />
make modules_prepare<br />
{% endhighlight %}

<p>Si plus loin lors de la compilation (make) de KlamAV, vous avez le message suivant (ou un message approchant), c'est que cette étape n'a pas été réalisée, ou a été mal réalisée: <span class="Code">/bin/sh scripts/modules/Module.symvers: File not found</span>.</p>
<p>C'est terminé pour Dazuko. Si vous avez décidé d'installer Dazuko et KlamAV séparément, sans utiliser "l'installer" de KlamAV, vous pouvez dors et déjà installer Dazuko. En revanche, si vous suivez à la lettre cet article, attendez un peu, il nous reste quelques petites choses à régler avant de lancer l'installation conjointe des deux éléments.</p>
<h2>Quatrième étape: préparation de l'installation de KlamAV</h2>
<p>Nous devons satisfaire quelques dépendances. Pour cela, il faut installer les paquetages suivants, avec le gestionnaire de RPM de votre distribution:<br />
<span class="Code">
<ul>
<li />kdelibs3-devel
<li />kdebase3-devel
<li />kdebindings3
<li />qt3-devel-tools
<li />qt3-extensions
<li />qt3-static
<li />libjpeg-devel
<li />curl-devel
</ul>
<p></span></p>
<p>Le fichier <span class="Code">libcurl.so</span> est nécessaire à l'installation. Il faut vérifier qu'il est bien présent. Rendez-vous pour cela dans <span class="Code">/usr/lib/</span> et tapez <span class="Code">find libcurl*</span>. Vous devriez obtenir une liste contenant ce fichier. Si c'est le cas c'est bon ! Sinon (comme c'est le cas avec SUSE) vous devrez effectuer la manipulation suivante: vérifiez qu'il y a dans la liste <span class="Code">libcurl.so.3</span> et/ou <span class="Code">libcurl.so.3.0.0</span>. Vous avez ensuite le choix entre deux possibilités: la première est plus "clean", la seconde est plus sûre. 1) Créez un lien logique: <span class="Code">ln -s libcurl.so.3.0.0 libcurl.so</span>, ou 2) recopiez le fichier: <span class="Code">cp libcurl.so.3.0.0 libcurl.so</span>.</p>
<h2>Cinquième étape: installation assistée de KlamAV</h2>
<p>Nous pouvons maintenant installer KlamAV avec l'installeur fourni. Avant de commencer, vous devrez peut être taper en ligne de commande <span class="Code">modprobe dazuko</span>, pour le lancer s'il ne l'est pas. </p>
<p>Lancez l'installeur en cliquant simplement dessus. Il se chargera de créer pour vous le compte utilisateur "clamav" avant de lancer une interface graphique dans laquelle il vous suffira effectivement de cliquer sur "suivant" et d'attendre que le travail se fasse tout seul.</p>
<p>Une fois l'installation terminée, vous pourrez trouver KlamAV à l'emplacement suivant (faut y penser...):<br />
<span class="Code">/usr/local/kde/bin/klamav</span></p>
<p>Vous pouvez ajouter cette dernière ligne au menu K où créer une icone sur votre bureau.</p>
<p>Petite précision finale: si cela ne fonctionne plus après avoir redémarré la machine, c'est probablement parce que Dazuko n'est pas lancé. Dans ce cas, <span class="Code">modprobe dazuko</span> dans une fenêtre de terminal.</p>
