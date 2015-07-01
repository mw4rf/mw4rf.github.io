---
layout: post
status: publish
published: true
title: Comment utiliser un ResourceBundle sous JBuilder pour l'internationalisation
  d'un logiciel ?
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 60
wordpress_url: http://blog.gfblog.com/index.php/2001/09/30/comment-utiliser-un-resourcebundle-sous-jbuilder-pour-linternationalisation-dun-logiciel/
date: '2001-09-30 10:55:44 +0200'
date_gmt: '2001-09-30 08:55:44 +0200'
categories:
- Java
tags:
- programmation
- Java
permalink:  /2001/09/30/comment-utiliser-un-resourcebundle-sous-jbuilder-pour-linternationalisation-dun-logiciel/
---
<p>Parmi les nombreuses fonctionnalit&eacute;s des versions Pro et Entreprise de JBuilder 5, on peut trouver un outil (&quot;Wizard&quot;) tr&egrave;s utile, qui permet de &quot;ressources les Strings&quot; de vos programmes.<br />
  Un exemple est le bienvenu pour montrer l'ampleur d'une telle fonction: vous cr&eacute;ez votre programme avec une interface en fran&ccedil;ais, et, par exemple, une fen&ecirc;tre (classe h&eacute;ritant de JFrame) avec pour titre &quot;Bienvenue dans mon logiciel !&quot;, par l'instruction <span class="Code">this.setTitle(&quot;Bienvenue dans mon logiciel !&quot;);</span>. Si vous d&eacute;cidez de traduire votre logiciel dans plusieurs autres langues, vous devrez r&eacute;-&eacute;crire votre code en rempla&ccedil;ant &agrave; chaque fois votre phrase par sa traductions dans les langues d&eacute;sir&eacute;es. Vous allez donc devoir cr&eacute;er X versions de votre code source et les compiler... c'est long et contraignant.<br />
  Le cr&eacute;er des &quot;Strings ressourc&eacute;s&quot; permet de rem&eacute;dier &agrave; ce probl&egrave;me. En effet, la proc&eacute;dure change du tout au tout: tous les messages sont cr&eacute;&eacute;s dans un fichier texte brut que l'on peut &eacute;diter sous n'importe quel bloc-notes. Pour distribuer des versions dans des langues &eacute;trang&egrave;res, il suffira donc de cr&eacute;er plusieurs versions de ce fichier texte ! Le code lui m&ecirc;me n'est pas chang&eacute;.</p>
<p>Note: on utilise ici la version US de JBuilder... la proc&eacute;dure est similaire dans la version fran&ccedil;aise.</p>
<p>Voici donc la proc&eacute;dure en images:</p>
<p>1) Une fois votre classe impl&eacute;ment&eacute;e, lancer l'assistant dans JBuilder, c'est la derni&egrave;re entr&eacute;e du menu &quot;Wizard&quot;: &quot;Resource Strings&quot; </p>
<p><img alt="RessourcesStrings" src="./ressources/java/old/faq/jbuilder_resstrings/resstrings1.jpg" /></p>
<p>2) Une fen&ecirc;tre s'ouvre, on est invit&eacute; &agrave; sp&eacute;cifier le nom du &quot;ResourceBundle&quot;, en g&eacute;n&eacute;ral Res est le nom par d&eacute;faut.</p>
<p><img alt="RessourcesStrings" src="./ressources/java/old/faq/jbuilder_resstrings/resstrings2.jpg" /></p>
<p>On doit ensuite sp&eacute;cifier que l'on veut cr&eacute;er des ressources &agrave; partir des cha&icirc;nes dures de notre classe, en cochant le premier Radio. On clique ensuite sur Next (Suivant).</p>
<p>3) Une fen&ecirc;tre s'ouvre avec toutes les cha&icirc;nes dures de votre classe, on peut choisir de d&eacute;cocher les cha&icirc;nes que l'on ne veut pas voir exporter (j'ai d&eacute;coch&eacute; ici n'importe quoi sans faire attention de qui il s'agissait).</p>
<p>Tout est coch&eacute; par d&eacute;faut.</p>
<p>L' instruction dans laquelle se trouve le String s&eacute;lectionn&eacute; est affich&eacute;e en bas de la fen&ecirc;tre. Ici le String vide (qui correspond &agrave; 1 espace de la barre d'espace) se trouve dans l'appel de la m&eacute;thode updateTitle(&quot;&quot;); (et on voit bien qu'elle admet ici comme argument une cha&icirc;ne vide).</p>
<p><img alt="RessourcesStrings" src="./ressources/java/old/faq/jbuilder_resstrings/resstrings3.jpg" /></p>
<p>NOTE: dans la suite de cet article je n'ai pas gard&eacute; les m&ecirc;mes cha&icirc;nes que celles que vous pouvez voir sur cette capture d'&eacute;cran, en effet, il n'est d'aucun int&eacute;r&ecirc;t de ressources les cha&icirc;nes affich&eacute;es ci-contre. J'utilise dans la suite de ce tutoriel un exemple concret, sur une URL, ce qui est vraiment plus utile: pas besoin de recompiler le programme &agrave; chaque changement d'adresse du site !!</p>
<p>On clique ensuite sur Finish (Terminer).</p>
<p>4) L'op&eacute;ration est termin&eacute;e.</p>
<p><img alt="RessourcesStrings" src="./ressources/java/old/faq/jbuilder_resstrings/resstrings4.jpg" /></p>
<p>Nous allons maintenant nous int&eacute;resser &agrave; ce qu'a fait JBuilder.</p>
<p>On voit pour commencer qu'il a cr&eacute;&eacute; un objet statique ResourceBundle nomm&eacute; &quot;res&quot; et qui est cr&eacute;&eacute; avec pour argument la cha&icirc;ne &quot;Res&quot; qui en en fait le nom du fichier texte brut dans lequel sont stock&eacute;es les cha&icirc;nes.</p>
<p>5) En parcourant le code de notre classe, on s'aper&ccedil;oit que certaines instructions ont &eacute;t&eacute; chang&eacute;es. Ici, l'instruction &eacute;tait:</p>
<p class="Code">jTextPane1.setPage(&quot;http://perso.wanadoo.fr/guillaume/cadre_droit.htm&quot;);</p>
<p>qui a &eacute;t&eacute; modifi&eacute;e en ce qu'on voit sur la capture d'&eacute;cran.</p>
<p><img alt="RessourcesStrings" src="./ressources/java/old/faq/jbuilder_resstrings/resstrings5.jpg" /></p>
<p>On conclue que notre URL ci-dessus correspond &agrave; l'entr&eacute;e &quot;ACTU_ADDRESS&quot; dans le fichier texte brut sur lequel pointe notre objet REsourceBundle &quot;res&quot;.</p>
<p>6) Nous allons donc voir ce fichier texte brut pour savoir comment il est form&eacute;. On peut le trouver dans la liste des fichiers du projet, en haut &agrave; gauche de la fen&ecirc;tre de JBuilder.</p>
<p>On l'ouvre en double-cliquant dessus.</p>
<p><img alt="RessourcesStrings" src="./ressources/java/old/faq/jbuilder_resstrings/resstrings6.jpg" /></p>
<p>7) Et voil&agrave; notre fichier.</p>
<p><img alt="RessourcesStrings" src="./ressources/java/old/faq/jbuilder_resstrings/resstrings7.jpg" /></p>
<p>La premi&egrave;re ligne est un commentaire (syntaxe des commentaires Unix: ligne d&eacute;butant par di&egrave;se #). Les autres lignes sont simplement les correspondances des cha&icirc;nes que nous avions dans nos classes. On peut voir la cha&icirc;ne repr&eacute;sent&eacute;e par l'entr&eacute;e ACTU_ADDRESS, cha&icirc;ne que j'ai cit&eacute;e plus haut. On note aussi la syntaxe un peu particuli&egrave;re: &quot;http\://&quot; au lieu de&quot;http://&quot;. Ceci s'explique par le fait que les deux points (:) sont un caract&egrave;re sp&eacute;cial et que l'anti-slash (\) sert &agrave; signaler la pr&eacute;sence d'un caract&egrave;re sp&eacute;cial. N'y faites pas attention, mais respectez la syntaxe si vous changez votre URL. Je tiens &agrave; dire, pour terminer, que cet exemple est fonctionnel, puis qu'il s'agit du fichier de ressources qu'utilise ML. (regardez dans le JAR de ML...).</p>
<p>Conclusion:</p>
<p>Pour reprendre notre premier exemple, on oppose:</p>
<table width="100%" border="1" cellspacing="0" bordercolor="#FFFFCC">
<tr bgcolor="#FFFFCC">
<td><b>Sans les Strings ressourc&eacute;s (3 compilations)</b></td>
<td><b>Avec les Strings ressourc&eacute;s (1 compilation)</b></td>
</tr>
<tr>
<td rowspan="2">
<p class="Code"><font color="#0000FF"> this.setTitle(&quot;Bienvenue dans mon logiciel</p>
<p>        !&quot;);<br />
        this.setTitle(&quot;Welcome in my Soft !&quot;);<br />
        this.setTitle(&quot;Bienvenido en mi programa !&quot;); </font></p>
</td>
<td><font color="#0000FF" class="Code">this.setTitle(res.getString(&quot;BONJOUR&quot;));</font></td>
</tr>
<tr>
<td>
<p><i>Dans le fichier de propri&eacute;t&eacute;s:</i><br />
        <span class="Code">BONJOUR=Bienvenue dans mon logiciel !<br />
        BONJOUR=Welcome in my Soft !<br />
        BONJOUR=Bienvenido en mi programa !</span></p>
</td>
</tr>
</table>
<p>Tutoriel distribu&eacute; pour le FAQ Java de Java-France www.java-france.com / www.jgflsoft.com<br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG. <br />
  &Eacute;crit &agrave; Montpellier le 30 septembre 2001</p>
