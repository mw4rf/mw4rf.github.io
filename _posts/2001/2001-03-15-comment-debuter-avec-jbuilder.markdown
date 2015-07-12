---
layout: post
status: publish
published: true
title: Comment débuter avec JBuilder ?
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 58
wordpress_url: http://blog.gfblog.com/index.php/2001/03/15/comment-debuter-avec-jbuilder/
date: '2001-03-15 01:21:34 +0100'
date_gmt: '2001-03-14 23:21:34 +0100'
categories:
- Java
tags:
- programmation
- java
permalink:  /2001/03/15/comment-debuter-avec-jbuilder/
---
<p>Ce document a pour but de vous aider &agrave; prendre en main un des meilleurs IDE Java: JBuilder 3.5. Vous devez lire la suite si les IDE (environnements de d&eacute;veloppement int&eacute;gr&eacute;s) ne vous sont pas familiers, ou si vous d&eacute;butez avec JBuilder.</p>
<p>
  Nous allons vous pr&eacute;senter l'interface graphique, et cr&eacute;er un petit programme pour vous montrer comment se servir d'une des fonctions les plus abouties: la cr&eacute;ation automatis&eacute;e d'interfaces utilisateur.</p>
<p>NOTE: ce document contient 11 images, il peut &ecirc;tre assez long &agrave; charger.</p>
<h1>Environnement JBuilder &quot;au repos&quot;</h1>
<p><img alt="JBuilder" src="./ressources/java/old/faq/jbuilder_intro/jbuilder1.jpg" /> </p>
<p>1 - Il s'agit de la zone o&ugrave; est pr&eacute;sent&eacute;, en temps normal, le code source du fichier ouvert. On peut profiter de divers fonctions concernant cette vue telles que la colorisation automatique du code, l'auto-indentation, une ligne verticale qui d&eacute;finit la zone imprimable, etc...<br />
Chaque fichier ouvert vient cr&eacute;er un nouvel onglet et s'affiche dans cette zone. Il n'y a ici qu'un seul fichier ouvert: MainFrame.java</p>
<p>2 - Il s'agit d'une zone (une JList) o&ugrave; sont affich&eacute;s les fichiers du projet en cours. On peut voir ici 4 types de fichiers: le fichier central qui &quot;regroupe&quot; tous les fichiers du projet (c'est le fichier &quot;projet&quot;) &agrave; l'extension .jpr, les fichiers Java source .java, les images .jpg et un fichier JavaDoc .html. Pour ouvrir un de ces fichiers, il suffit de cliquer dessus. </p>
<p>3 - Cette zone concerne le fichier ouvert. Elle affiche ici les imports, les variables, m&eacute;thodes,  et constructeurs de la classe en cours, car on est en mode &quot;source&quot; (voir 5). Si l'on &eacute;tait en mode &quot;conception&quot;, dans cette zone serait affich&eacute;es des informations relatives &agrave; la conception d'une GUI.</p>
<p>4 - Cette zone se retrouve dans pratiquement tous les logiciels: une barre de menus, une barre d'ic&ocirc;nes. Vous utiliserez le plus souvent l'ic&ocirc;ne qui repr&eacute;sente une fl&egrave;che verte, en dessous du menu &quot;Outils&quot; et qui permet de compiler et de lancer un programme. Il faut aussi pr&eacute;ciser que le menu Aide sera utile car il donne acc&egrave;s &agrave; la documentation du JDK de Sun ainsi qu'&agrave; la documentation des API et des outils Borland.</p>
<p>5 - Vous pouvez toujours acc&eacute;der &agrave; l'onglet &quot;Source&quot; qui montre, comme ici, le code source de la classe en cours. Si cette classe permet une conception graphique (si elle &eacute;tend de JFrame, JWindow, JInternalFrame, etc...), vous pourrez cliquer sur l'onglet &quot;Conception&quot; et lancer le concepteur graphique de JBuilder. L'onglet &quot;Bean&quot; permet de cr&eacute;er des Java Beans (composants r&eacute;utilisables) et l'onglet &quot;Doc&quot; permet de cr&eacute;er des JavaDoc.</p>
<h1>JBuilder en action!</h1>
<p>Nous allons cr&eacute;er un petit programma avec une interface graphique &agrave; l'aide des assistants de JBuilder. Nous allons vous guider dans les &eacute;tapes. Commen&ccedil;ons:</p>
<p>1- Lancez JBuilder<br />
  2- Cliquez sur le menu FICHIER -&gt; NOUVEAU PROJET<br />
  la fen&ecirc;tre suivante s'ouvre:</p>
<p><img alt="JBuilder" src="./ressources/java/old/faq/jbuilder_intro/jbuilder2.jpg" /></p>
<p>Saisissez dans la zone &quot;Fichier Projet&quot; le chemin et le nom du fichier projet portant l'extension .jpr. Une fois fait, cliquez sur TERMINER.</p>
<p>2- Nous avons cr&eacute;&eacute; un projet, nous devons maintenant ajouter des classes. Nous avons choisi de cr&eacute;er une application graphique(JBuilder permet en outre de cr&eacute;er avec des assistants de servlets,des applets, des EJB, etc...). Cliquez sur le menu FICHIER -&gt; NOUVEAU ou faites CRTL+N.<br />
  La fen&ecirc;tre suivante s'ouvre:</p>
<p><img alt="JBuilder" src="./ressources/java/old/faq/jbuilder_intro/jbuilder3.jpg" /></p>
<p>Cliquez sur &quot;Application&quot; puis sur le bouton &quot;OK&quot; pour lancer l'assistant de cr&eacute;ation d'applications.</p>
<p>Une seconde fen&ecirc;tre s'ouvre:</p>
<p><img alt="JBuilder" src="./ressources/java/old/faq/jbuilder_intro/jbuilder4.jpg" /></p>
<p>Le &quot;Paquet&quot; est plus connu sous le nom anglais de &quot;package&quot;. En fait, quand dans vos programmes vous &eacute;crivez des instruction d'importation du style &quot;import java.io.*;&quot;, vous importez toutes les classes de ce paquet. De m&ecirc;me si vous voulez lancer votre programme cela devra se faire, dans notre cas, par l'instruction &quot;java sans_titre1.Application1&quot;. La &quot;classe&quot; &eacute;tant la classe principale du programme, celle contenant la m&eacute;thode main(), celle qu'il faut invoquer pour lancer le programme. Dans la majorit&eacute; des cas, vous n'aurez pas &agrave; modifier le code de cette classe.<br />
  Cliquez sur &quot;Suivant &gt;&quot;.</p>
<p>Vous acc&eacute;dez &agrave; cette fen&ecirc;tre:</p>
<p><img alt="JBuilder" src="./ressources/java/old/faq/jbuilder_intro/jbuilder5.jpg" /></p>
<p>La classe &agrave; laquelle l'on fait ici r&eacute;f&eacute;rence est la classe qui d&eacute;finira le cadre principal de l'interface utilisateur.Elle &eacute;tend de JFrame. Elle sera automatiquement lanc&eacute;e au d&eacute;marrage du programme (le code pour &ccedil;a est &eacute;crit automatiquement).<br />
  Par d&eacute;faut les 3 cases que vous voyez coch&eacute;es ici ne le sont pas, cochez-les pour ce tutoriel.<br />
  Cliquez sur &quot;TERMINER&quot;.</p>
<p>Vous aboutissez &agrave; un &eacute;cran similaire &agrave; celui de la premi&egrave;re capture d'&eacute;cran. Le fichier ouvert est &quot;Cadre1.java&quot;.</p>
<p>3 - Nous allons cr&eacute;er l'interface. Cliquez sur l'onglet &quot;Conception&quot;. Le concepteur met quelques secondes &agrave; se lancer, puis une fen&ecirc;tre comme ceci appara&icirc;t:</p>
<p><img alt="JBuilder" src="./ressources/java/old/faq/jbuilder_intro/jbuilder6.jpg" /></p>
<p>1 - Cette zone est une simulation de ce &agrave; quoi ressemblera votre fen&ecirc;tre. Vous y ajouterez des composants graphiques (2) par Drag&amp;Drop. Vous pourrez d&eacute;placer, redimentionner, etc ces composants directement an cliquant dessus.<br />
  ASTUCE: on y pense rarement, mais le bouton droit de la souris est tr&egrave;s utile... essayez vous verrez comme les options propos&eacute;es dans le menu qui surgit sont utiles !</p>
<p>2 - Vous pouvez cliquer sur un des composants de ce panneau, le curseur se transformera en une croix. Cliquez avec cette croix dans la zone (1 )pour d&eacute;poser le composant. Les composants sont r&eacute;pertori&eacute;s dans diff&eacute;rents onglets, vous trouverez dans Swing les principaux composants graphiques de Swing, dans Conteneurs Swing des JTabbedPane, JSplitPaneetd'autres gestionnaires de mise en page. DbSwing regroupe des composants Borland(tr&egrave;s utiles pour les bases de donn&eacute;es notamment).</p>
<p>3 - Ici sont affich&eacute;es les propri&eacute;t&eacute;s du composant graphique s&eacute;lectionn&eacute;. La fen&ecirc;tre elle m&ecirc;me &eacute;tant s&eacute;lectionn&eacute;e, on voit ici ses propri&eacute;t&eacute;s. Si on clique sur l'onglet &quot;&Eacute;v&eacute;nements&quot;, on a acc&egrave;s &agrave; tous les gestionnaires d'&eacute;v&eacute;mements accessibles pour le composant s&eacute;lectionn&eacute;.</p>
<p>4 - Comme expliqu&eacute; auparavant, les composants de l'interface -leur nom- sont affich&eacute;s ici. On voit que &quot;this&quot; est s&eacute;lectionn&eacute;, c-&agrave;-d le fen&ecirc;tre elle-m&ecirc;me. Cette vue est tr&egrave;s pratique pour savoir d'un coup d'oeil quels est le gestionnaire de mise en page d'un conteneur, quels composants il contient, etc...</p>
<p>4 - Cliquez sur l'onglet Conteneurs Swing, et s&eacute;lectionnez le composant javax.swing.JPanel (le premier que nous d&eacute;signerons sous le nom de JPanel), d&eacute;posez-le au centre de this(le cadre gris de la capture d'&eacute;cran ci-dessus).<br />
  Normalement le composant doit s'afficher (cela se mat&eacute;rialise parle fait que la fen&ecirc;tre devient l&eacute;g&egrave;rement plus claire).Une entr&eacute;e jPanel1 est ajout&eacute;e &agrave; la zone (4).Cliquez sur cette entr&eacute;e. Les propri&eacute;t&eacute;s de la zone(3) changent. Cliquez sur la propri&eacute;t&eacute; layout de mani&egrave;re &agrave; faire appara&icirc;tre une menu d&eacute;roulant regroupant les gestionnaires de mise en page disponibles. S&eacute;lectionnez BorderLayout. Revenez &agrave; l'onglet Swing de la zone (2), cliquez sur le composant JButton et d&eacute;posez-le vers le bas du jPanel1. Le bouton s'affiche automatiquement, remplissant la partie inf&eacute;rieure de la fen&ecirc;tre. Recommencez la m&ecirc;me op&eacute;ration en d&eacute;posant un composant JTextArea au milieu de la fen&ecirc;tre.</p>
<p>5 - Nous avons cr&eacute;&eacute; l'interface, nous allons peaufiner tout &ccedil;a pour faciliter l'&eacute;criture du code. Dans le concepteur, s&eacute;lectionnez le bouton en cliquant (1 seule fois !) dessus. Dans ses propri&eacute;t&eacute;s, changez:<br />
  name: inscrivez &quot;button&quot;<br />
  text: effacez ce qui est &eacute;crit et ne mettez: &quot;Cliquez ici !&quot;.<br />
  Faites de m&ecirc;me avec la zone de texte:<br />
  name: inscrivez &quot;textArea&quot;<br />
  text: effacez ce qui est inscrit<br />
  lineWrap: mettez la propri&eacute;t&eacute; &agrave; TRUE</p>
<p>Ce que vous obtenez devrait ressembler &agrave; ceci:</p>
<p><img alt="JBuilder" src="./ressources/java/old/faq/jbuilder_intro/jbuilder7.jpg" /></p>
<p>6 - Nous avons termin&eacute; la partie conception et nous pouvons passer &agrave; l'&eacute;tape &eacute;criture du code.<br />
  Nous allons assigner des gestionnaires d'&eacute;v&eacute;nement (en fait un seul au composant &quot;button&quot;).</p>
<p>Pour assigner un gestionnaire d'&eacute;v&eacute;nement &agrave; un composant, il y a une seule m&eacute;thode, par l'onglet &quot;&Eacute;v&eacute;nements&quot; de la zone (3) du concepteur. Cependant, pour le composant JButton, il existe une autre m&eacute;thode (qui ne permet que d'assigner un gestionnaire OnClick d'ailleurs), c'est de double-cliquer tout simplement sur le bouton. <br />
  Nous allons essayer ici le 1&deg; m&eacute;thode dans le mesure o&ugrave; elle sera utilis&eacute;e dans le majorit&eacute; des cas.</p>
<p>Cliquez donc sur l'onglet &quot;&Eacute;v&eacute;nements&quot;, voici &agrave; quoi il ressemble:</p>
<p><img alt="JBuilder" src="./ressources/java/old/faq/jbuilder_intro/jbuilder8.jpg" /></p>
<p>La premi&egrave;re fois que vous le lancez, la case &agrave; droite de &quot;mouseClicked&quot; est identique aux autres cases, c-&agrave;-d,vide. Nous vous la montrons ici une fois que vous aurez accompli l'action suivante: double cliquer dessus. Allez-y, double-cliquez. JBuilder repasse en mode &quot;Source&quot; et quitte le concepteur. Le curseur se trouve au milieu de la m&eacute;thode gestionnaire d'&eacute;v&eacute;nement mouseClicked du bouton. Compl&eacute;tez cette m&eacute;thode avec le code visible ci-dessous:</p>
<p><img alt="JBuilder" src="./ressources/java/old/faq/jbuilder_intro/jbuilder9.jpg" /></p>
<p>REMARQUE: une des fonction les plus utiles de JBuilder est d'afficher un petit menu d&eacute;roulant au fur et &agrave; mesure de l'&eacute;criture du code qui montre les m&eacute;thodes disponibles pour telle ou telle classe.Par exemple, vous tapez ici &quot;textArea&quot; puis quand vous tapez le &quot;.&quot;, le menu appara&icirc;t (attendez quelques secondes car si vous tapez la suite du code tout de suite il n'appara&icirc;t pas), affichant toutes les m&eacute;thodes de JTextArea, quand vous continuez &agrave; taper &quot;set...&quot;, le menu affiche toutes les m&eacute;thodes commen&ccedil;ant pas &quot;set&quot;, et ainsi de suite.</p>
<p>
  Vous comprendrez &agrave; quel point ce composant est utile quand vous aurez envie d'appeler une m&eacute;thode dont vous savez qu'elle existe amis dont vous ne connaissez par exactement la syntaxe. Ceci arrive constamment, et le menu d&eacute;roulant permet d'&eacute;viter des erreurs &agrave; la compilation.<br />
  Cependant -et oui il faut bien un &quot;mais&quot; - j'ai constat&eacute; sur mon syst&egrave;me que ce menu ne fonctionnait pas sous Linux, je ne sais pas si c'est d&ucirc; &agrave; un param&eacute;trage qu'il faut faire manuellement, et en plus, du moins je n'ai rien trouv&eacute; concernant ce sujet dans la doc... en esp&eacute;rant que ce soit juste un bug chez moi et pas pour tous les linux... (en tout cas sous Windows, &ccedil;a fonctionne ! :))</p>
<p>7 - Nous avons termin&eacute; le programme, cliquez sur la fl&egrave;che (le triangle vert) verte ou appuyez sur F9, le code se compile, et le programme se lance, cliquez sur notre bouton (dans la nouvelle fen&ecirc;tre qui vient d'appara&icirc;tre au bout de quelques secondes, et qui n'est autre que la fen&ecirc;tre que nous achevons de concevoir) pour tester le programme, voici ce que &ccedil;a donne:</p>
<p>Avant d'avoir cliqu&eacute; et ...</p>
<p><img alt="JBuilder" src="./ressources/java/old/faq/jbuilder_intro/jbuilder10.jpg" /></p>
<p>... apr&egrave;s avoir cliqu&eacute;</p>
<p><img alt="JBuilder" src="./ressources/java/old/faq/jbuilder_intro/jbuilder11.jpg" /></p>
<p>
  Vous avez remarqu&eacute; que JBuilder a automatiquement ajout&eacute; une menu FICHIER -&gt; QUITTER et un menu AIDE -&gt; A PROPOS. Ces 2 menus sont fonctionnels, le code a &eacute;t&eacute; g&eacute;n&eacute;r&eacute; automatiquement. Cela est d&ucirc; au fait que nous avions coch&eacute; les cases &quot;Cr&eacute;er une barre de menus&quot; et &quot;Cr&eacute;er une bo&icirc;te de dialogue A Propos&quot; &agrave; l'&eacute;tape de d&eacute;finition de notre projet.</p>
<p>Je ne saurais trop vous conseiller de vous entra&icirc;ner un peu &agrave; modifier l'interface, en examinant par exemple le gestionnaire d'&eacute;v&eacute;nements du menu, en modifiant la conception graphique de la classe qui repr&eacute;sente la bo&icirc;te A Propos (Cadre1_AboutBox.java par d&eacute;faut).</p>
<p>Voil&agrave;, c'est termin&eacute; :)</p>
<p>
  Comme morale &agrave; ce tutoriel (oui, oui, ce tutoriel est une vraie fable :) retenez que ce n'est pas parce qu'on utilise JBuilder ou un IDE que l'on doit se contenter de lui laisser tout faire. Personnellement, je ne l'utilise pas beaucoup pour ses codes pr&eacute;-&eacute;crits, et beaucoup de programmeurs &agrave; mon instar n'aiment pas trop &ccedil;a, ils utilisent des IDE pour la conception graphique qui se r&eacute;v&egrave;le plus simple et plus rapide. Et pour les gros projets, un Emacs n'est pas mal non plus...</p>
<p>Tutoriel distribu&eacute; pour le FAQ Java de Java-France www.java-france.com / www.jgflsoft.com<br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG <br />
  &Eacute;crit &agrave; Montpellier le 15 mars 2001</p>
