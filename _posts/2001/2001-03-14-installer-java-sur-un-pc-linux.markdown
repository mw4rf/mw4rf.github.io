---
layout: post
status: publish
published: true
title: Installer Java sur un PC Linux

  
  



wordpress_id: 56
wordpress_url: http://blog.gfblog.com/?p=56
date: '2001-03-14 00:41:36 +0100'
date_gmt: '2001-03-13 22:41:36 +0100'
categories:
- Java
tags:
- programmation
- linux
- java
permalink:  /2001/03/14/installer-java-sur-un-pc-linux/
---
<p>
Cet article a pour but de vous montrer la marche à suivre pour installer et configurer un environnement de développent Java viable sur une machine tournant sous le système d'exploitation Linux.<br />
Dans ce tutoriel, nous utiliserons:</p>
<ul>
<li />le JDK de Sun, version 1.2.2 disponible à l'adresse suivante http://java.sun.com/products/jdk/1.2/download-linux.html
<li />la ligne de commande, normalement disponible à partir de votrebureau Linux.
<li />le logiciel XEmacs, fourni avec la majorité des distributions linux, disponible à l'adresse suivante: http://www.xemacs.org
</ul>
<p>NOTE: cette page contient 12 images haute résolution et assez grandes, cela peut prendre du temps à charger mais nous vous conseillons néanmoins d'attendre car la réalisation des étapes nécessaires et expliquées n'en sera que plus aisée.</p>
<p>
Commençons nos explications:</p>
<h1>INSTALLATION</h1>
<p>
1. Téléchargez le JDK, dans la version que vous voulez (NOTE: à l'heure actuelle une version 1.3 existe, mais nous avons choisi la 1.2.2 pour notre tutoriel. Si vous téléchargez la 1.3, la procédure d'installation ne sera modifiée que par le nom des fichiers et des répertoires, jdk1.3 au lieu de  jdk1.2.2)</p>
<p><center><img src="./ressources/java/old/faq/install_linux/1.jpg" alt="java" /></center></p>
<p>
La capture d'écran montre ici le fichier .tar.gz téléchargé sur le site de Sun (adresse ci-dessus) et enregistré sur votre disque dur, à l'adresse '/home/guillaume/Downloads/'. Ce sera notre répertoire par défaut pour ce fichier. Vous pouvez bien évidemment l'enregistrer où bon vous semble.</p>
<p>
2. Ensuite il nous faut décompresser cette archive, en extraire les fichiers. Pour cela, ouvrez une fenêtre de terminal, placez vous dans le répertoire où se trouve votre archive à l'aide de la commande cd, et décompactez-la grâce àla commande tar -zxvf.</p>
<p>
ASTUCE: tapez: 'tar zxvf jdk' puis appuyez sur 'tab' (la touchequi représente 2 flèche de sens opposé sur la gauche du clavier) et, normalement, le 'jdk' que vous venez de taper se transforme automatiquement en le nom du fichier, c-à-d ici 'jdk-1_2_2_007-linux-i386.tar.gz' qui est légèrement plus contraignant à taper... Cetteastuce est couramment utilisée par les personnes habituées aux systèmes Unix.</p>
<p><center><img src="./ressources/java/old/faq/install_linux/2.jpg" alt="java" /></center></p>
<p>
La capture d'écran illustre ce qui est expliqué plus haut, et montre la commande exacte à entrer. Remplacer le nom du fichier donné ici par le nom du votre si celui-ci est différent. (en utilisant TAB...)<br />
Quand vous appuyez sur ENTREE, une liste de fichiers défile dans la console, en voici la fin:(comme vous pouvez le voir sur la capture d'écran l'ascenseur à droite a considérablement rétréci: tous les fichiers ne sont pas affichés sur cet écran, mais vous n'avez normalement pas à vous soucier de cela).</p>
<p><center><img src="./ressources/java/old/faq/install_linux/3.jpg" alt="java" /></center></p>
<p>
Admettons que votre fichier tar.gz se soit trouvé dansle répertoire '/home/guillaume/Downloads' comme ici, les fichiers serons installés dans le répertoire '/home/guillaume/Downloads/jdk1.2.2/'.<br />
NOTE: nous vous conseillons de l'installer dans '/usr/local/' ou '/home/guillaume' (où vous remplacerez 'guillaume' par le nom de l'utilisateur voulu).</p>
<p>
3. Vous devez ensuite indiquer au système dans quel répertoire il trouvera les fichiers binaires que JDK. Ceci se réalise à l'aide d'un 'path' (chemin en anglais). L'instruction estla suivante: export PATH=/home/guillaume/Downloads/jdk1.2.2/bin/:$PATH<br />
NOTE: remplacez /home/guillaume/Downloads/ par le répertoire dans lequel est décompactée votre archive.</p>
<p><center><img src="./ressources/java/old/faq/install_linux/4.jpg" alt="java" /></center></p>
<p>
Voici la liste des fichiers qui doivent normalement se trouver dansle répertoire /bin/ de votre JDK. (ci-dessus)</p>
<p><center> <img src="./ressources/java/old/faq/install_linux/5.jpg" alt="java" /></center></p>
<p>
Et voici l'instruction à taper pour définir une'PATH'. (ci-dessus)</p>
<h1>UTILISATION</h1>
<p>
1. Ecriture d'un programme<br />
Nous considèrerons ici que vous ne possédez pas d'IDEJava installé sur votre machine, que vous venez juste d'installer Linux et que l'éditeur XEmacs est installé sur votre système. (Il est fourni, le plus souvent installé par défaut, avecle plupart des distributions, si ce n'est toutes). Je vous conseille cependant d'installer JBuilder ou Forte si vous vous lancez dans la conception d'interfaces graphiques compliquées ou si vous désirez avoir des options d'exportation et d'internationalisation plus avancées.<br />
Nous commençons donc par lancer cet éditeur- emacs-, par la lignede commande ou par un menu de votre interface graphique (ici, KDE sous Linux Mandrake 7.2).</p>
<p>
Ci-dessus: ouvrez une fenêtre de terminal et tapez simplement 'xemacs', le programme devrait se lancer. (OPTIONNEL: Si vous désirez sauvegarder à l'aide de Emacs des fichiers dans des répertoires de votre machine appartenant à l'utilisateur root (par exemple /usr/ ou /var/), tapez 'su', puis le mot de passe de root. Poursuivez ensuite avec la commande xemacs qui sera alors lancée avec les droits du root).</p>
<p><center><img src="./ressources/java/old/faq/install_linux/6.jpg" alt="java" /></center></p>
<p>
Vous pouvez aussi passer par un menu pour ouvrir XEmacs.</p>
<p><center><img src="./ressources/java/old/faq/install_linux/7.jpg" alt="java" /></center></p>
<p>
2. XEmacs ouvert, nous pouvons taper notre code, et profiter de la colorisation automatique du code ainsi que de l'indentation automatique (entre autres )réalisées automatiquement par Emacs.<br />
Voici ce que ça donne:</p>
<p><center><img src="./ressources/java/old/faq/install_linux/8.jpg" alt="java" /></center></p>
<p>
3. Compiler et lancer le programme<br />
Nous pouvons compiler et lancer le programme par XEmacs, mais cela donnerait lieu à des paramétrages qui ne concernent pas notre sujet. Nous nous contenterons donc de compiler et de lancher notre programme en ligne de commande.</p>
<p>
Une fois le code visible dans la fenêtre XEmacs ci-dessus reproduit à l'identique, vous pouvez sauvegarder votre fichier (sous le même nom que la classe principale, c-à-d sous le nom de "test.java", en tenant compte de la casse).</p>
<p>
Une fois le fichier sauvegardé, il faudra ouvrir une fenêtre de terminal, se déplacer jusqu'au répertoire où sesitue le fichier "test.java" à l'aide de la command cd, etle compiler à l'aide de la commande javac.</p>
<p>
Dans notre cas la syntaxe est la suivante: javac test.java.</p>
<p>
 Si aucun message n'est renvoyé, la compilation a réussi. Pour lancer le programme il suffit d'utiliser la commande java, de la manière suivante: java test ('test' est le nom du fichier.class créé par le compileur).</p>
<p>
La capture d'écran ci-dessous montre comment faire:</p>
<p><center><img src="./ressources/java/old/faq/install_linux/9.jpg" alt="java" /></center></p>
<h1>PARAMETRAGE (optionnel!)</h1>
<p>
Nous allons présenter ici un des paramétrages utiles du JDK. Nous allons vous montrer comment configurer KDE (la procédure pour Gnome ou un autre window manager sera légèrement différente) pour exécuter un programme Java d'un seul clic.</p>
<p>
Pour cela nous devons créer un fichierJAR EXECUTABLE (la plupart des IDE permettent de le faire dans leur commande d'exportation), et assigner un "ligne de conduite" que KDE devrasuivrequand l'on cliquera sur un tel fichier.</p>
<p>
La procédure est la suivante: </p>
<ul>
<li />ouvrir le "Panneau de contrôle"
<li />se placer dans le nemu "Applications" -> "Associations des types de fichiers"
<li />définir un programme d'ouverture par défaut, ici le programme /../jdk1.2.2/bin/java -jar, pour les fichiers JAR
<li />enregistrer les changements et quitter.
</ul></p>
<p>
La procédure en images:</p>
<p><center><img src="./ressources/java/old/faq/install_linux/10.jpg" alt="java" /></center></p>
<p>
Vous trouverez l'entrée x-jar dans x-all ou x-applications.</p>
<p><center><img src="./ressources/java/old/faq/install_linux/11.jpg" alt="java" /></center></p>
<p>
Cliquez sur le bouton "Ajouter" dans le panel "Applications par ordrede préférence".<br />
La fenêtre représentée ci-dessous s'ouvre.</p>
<p><center><img src="./ressources/java/old/faq/install_linux/12.jpg" alt="java" /></center></p>
<p>
Vous devez inscrire le chemin exact vers le fichier 'java' et rajouter l'option '-jar'.</p>
<p>
Cliquez sur OK, c'est terminé !</p>
<p>
Tutoriel distribué pour le FAQ Java de Java-France www.java-france.com / www.jgflsoft.com<br />
Maintenant publié sur Valhalla GFBLOG<br />
Ecrit à Montpellier le 14 mars 2001
 </p>
