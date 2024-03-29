---
layout: post
status: publish
published: true
title: Refonte du blog Valhalla

  
  



wordpress_id: 31
wordpress_url: http://localhost/~guillaume/gfblog/wordpress/?p=31
date: '2005-09-11 22:45:39 +0200'
date_gmt: '2005-09-11 20:45:39 +0200'
categories:
- Valhalla
tags:
- Valhalla
permalink:  /2005/09/11/refonte-du-blog-valhalla/
---
<p>Comme je suis un fondu, j'ai voulu refondre l'interface du blog Valhalla, c'est dont la refonte de cet espace que je vous pr&eacute;sente ici. Mais cela ne concerne pour l'instant que le blog lui m&ecirc;me, pas les photos ni les ressources, car c'est pas mal de boulot et je ne suis pas uen fonderie &agrave; refontes ! </p>
<h1>Avant</h1>
<p>Le blog Valhalla a &eacute;t&eacute; con&ccedil;u au d&eacute;part en pur HTML, gr&acirc;ce &agrave; des tempaltes sous Dreamweaver (&ccedil;a ne date pas d'hier !). Je ne pouvais pas faire autrement, mon h&eacute;bergeur n'ayant pas de serveur PHP. Je ne pouvais donc pas avoir recours &agrave; un logiciel int&eacute;gr&eacute; de blog (comme Dotclear), ni &agrave; des includes PHP pour r&eacute;p&eacute;ter sur chaque page le contenu statique (le menu de gauche).</p>
<p>Mais les templates DW &ccedil;a va un moment. Apr&egrave;s, &ccedil;a devient lourd. Alors on commence par c&eacute;der &agrave; la facilit&eacute; et d&eacute;tacher la page du template &agrave; la moindre difficult&eacute;. Et puis le temps passe et on prend l'habitude de d&eacute;tacher syst&eacute;matiquement la page de son template d'origine. Et l&agrave;, quand on veut changer la pr&eacute;sentation ou au moins la charte graphique, &ccedil;a devient une prise de t&ecirc;te monstre &agrave; devoir ouvrir dans le bloc-note chaque fichier HTML pour l'&eacute;diter manuellement. En plus, entre nous, DW est cool mais il g&eacute;n&egrave;re du code HTML compl&egrave;tement pourrave, ne serait-ce que du point de vue des indentations (au final c'est toalement illisible).</p>
<p>Alors comme je ne tiens pas en place et que je change toujours tout, j'ai d&eacute;cid&eacute; de refaire tout l'espace Valhalla en PHP et includes XHTML + CSS. De cette mani&egrave;re, il n'y a plus qu'&agrave; changer le CSS pour tout changer. Les sources HTML ne changent pas.</p>
<h1>Apr&egrave;s </h1>
<h2>Structure</h2>
<p>L'espace Valhalla s'ouvre sur un index.php. Cet index au code pour l'instant tout &agrave; fait spartiate repr&eacute;sente la logique g&eacute;n&eacute;rale de fonctionnement du site.</p>
<p>En voici le code: </p>
<div class="Code">
<p>&lt;?php<br />
include(&quot;header.php&quot;);</p>
<p>$output = '&lt;a href=&quot;articles.php&quot;&gt;Voir les articles&lt;/a&gt;';</p>
<p>echo $output;<br />
  include(&quot;footer.php&quot;);<br />
  ?&gt;</p>
</div>
<p>C'est du pur PHP, avec 2 includes et un corps. Le corps n'a qu'un lien pour l'instant. Les includes sont l'en-t&ecirc;te (header) et le pieds de page (footer). Bien s&ucirc;r, le contenu va rapidement &eacute;voluer pour pr&eacute;senter une page d'accueil honorable.</p>
<p>Vient ensuite le syst&egrave;me de chargement des articles. Et l&agrave; c'est plus complexe. Les articles se chargent gr&acirc;ce au fichier articles.php qui analyse les requ&ecirc;tes GET.</p>
<div class="Code">
<p>&lt;?php<br />
include(&quot;header.php&quot;);</p>
<p>if(isset($_GET['q']))<br />
  { include(&quot;articles/&quot;.$_GET['q'].&quot;.htm&quot;);<br />
  }<br />
  else<br />
  { include(&quot;articles/articles_index.htm&quot;);<br />
  }</p>
<p>include(&quot;footer.php&quot;);<br />
  ?&gt;</p>
</div>
<p>On appelle cette page gr&acirc;ce &agrave; un lien. Le lien peut revoyer vers articles.php, et dans ce cas GET est vide et la page articles_index.htm s'affichera; ou vers articles.php?q=XXXX, et dans ce cas XXXX se chargera. XXXX est un fichier se terminant obligatoirement par l'extension HTM (pour &eacute;viter tout contenu dynamique), et situ&eacute; dans le r&eacute;pertoire articles. Ces deux restrictions comblent d&eacute;finitivement la potentielle faille de s&eacute;curit&eacute; des includes g&eacute;n&eacute;r&eacute;s avec GET.</p>
<h2>Mise en page (layout)</h2>
<p>La mise en page est d&eacute;finie dans 4 fichiers. Les fichiers header.php, XXXX, footer.php et le fichier de feuille de style CSS. Les fichiers PHP et XXXX (HTML) d&eacute;finissement les conteneurs et le contenu, tandis que le fichier CSS d&eacute;termine la disposition et les propri&eacute;t&eacute; des conteneurs.</p>
<p>Voici header.php</p>
<div class="Code">
<p>&lt;?php<br />
  $output = '&lt;html&gt;';<br />
  $output .= '&lt;head&gt;';<br />
  $output .= '&lt;link rel=&quot;stylesheet&quot;<br />
type=&quot;text/css&quot;<br />
media=&quot;screen&quot;<br />
href=&quot;valhalla.css&quot; /&gt;';<br />
$output .= '&lt;/head&gt;';<br />
$output .= '&lt;body&gt;';<br />
$output .= '&lt;div id=&quot;bodyleft&quot;&gt;&lt;div id=&quot;bodyright&quot;&gt;';<br />
$output .= '&lt;div id=&quot;header&quot;&gt;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;Valhalla &amp;phi; GF@Blog&lt;/div&gt;';<br />
$output .= '&lt;div id=&quot;container&quot;&gt;';<br />
$output .= '&lt;div class=&quot;menuContainer&quot;&gt;';<br />
$output .= '&lt;div class=&quot;menu&quot;&gt;';<br />
$output .= '&lt;ul&gt;<br />
&lt;li /&gt;&lt;a href=&quot;&quot;&gt;Accueil&lt;/a&gt;<br />
&lt;li /&gt;&lt;a href=&quot;&quot;&gt;Ressources&lt;/a&gt;<br />
&lt;li /&gt;&lt;a href=&quot;&quot;&gt;Photos&lt;/a&gt;<br />
&lt;li /&gt;&lt;a href=&quot;&quot;&gt;Priv&eacute;&lt;/a&gt;<br />
&lt;li id=&quot;current&quot;/&gt;&lt;a href=&quot;./articles.php&quot;&gt;Articles&lt;/a&gt;<br />
&lt;ul&gt;<br />
&lt;li /&gt;&lt;a href=&quot;./articles.php?q=/2005/09/index&quot;&gt;Sept. 2005&lt;/a&gt;<br /> <br />
(etc...)<br />
<br />
&lt;li /&gt;&lt;a href=&quot;./articles.php?q=/2004/10/index&quot;&gt;Oct. 2004&lt;/a&gt;<br />
&lt;li /&gt;&lt;a href=&quot;./articles.php?q=/2004/09/index&quot;&gt;Sept. 2004&lt;/a&gt;<br />
&lt;li /&gt;&lt;a href=&quot;./articles.php?q=/2004/08/index&quot;&gt;Aout 2004&lt;/a&gt;<br />
&lt;/ul&gt;<br />
&lt;/ul&gt;';<br />
$output .= '&lt;/div&gt;&lt;!-- Ends div menu --&gt;';<br />
$output .= '&lt;/div&gt;&lt;!-- Ends div menuContainer --&gt;';<br />
$output .= '&lt;div class=&quot;contentContainer&quot;&gt;';</p>
<p>echo $output;<br />
  ?&gt;</p>
<p>et footer.php</p>
<p>&lt;?php<br />
  $output = '&lt;/div&gt;&lt;!-- Ends div contentContainer --&gt;';<br />
  $output = '&lt;/div&gt;&lt;!-- Ends div container --&gt;';<br />
  $output .= '&lt;div id=&quot;footer&quot;&gt;Copyright &amp;copy; 2005 www.gfblog.com&lt;/div&gt;';<br />
  $output .= '&lt;/div&gt;&lt;/div&gt;&lt;!-- Ends divs bodyleft &amp; bodyright --&gt;';<br />
  $output .= '&lt;/body&gt;';<br />
$output .= '&lt;/html&gt;';</p>
<p>echo $output;<br />
  ?&gt;</p>
<p>Les fichiers contenant le contenu (XXXX.htm) auront toujours la structure suivante:</p>
<p>&lt;div class=&quot;titre&quot;&gt; <br />
  &lt;h1&gt;Titre&lt;/h1&gt;<br />
  &lt;h2&gt;Sous-titre&lt;/h2&gt;<br />
  &lt;/div&gt;</p>
<p>  &lt;div class=&quot;corps&quot;&gt;<br />
  &lt;!-- Ici, le corps du texte. --&gt;<br />
  <br />
  &lt;/div&gt;
  </p>
</div>
<p>Tout cela combin&eacute; permet d'afficher la structure suivante:</p>
<p align="center">
	<img src="http://blog.gfblog.com/images/valhalla/sitemap.png" /></p>
<p>Cette structure d'obtient gr&acirc;ce &agrave; la feuille de style dont voici la code source:</p>
<div class="Code">
<p>
  /*################### CONTENEURS PRINCIPAUX ##################################*/<br />
  body<br />
  { background: #e7e7e7; /* Couleur du fond de la page */<br />
line-height: 1.2; /* Hauteur de ligne: d&eacute;calage du titre depuis le haut */<br />
margin: 0px 10px 0px 10px; /* Marges droite et gauche de la page */<br />
padding: 0px; /* Pas de marge interne */<br />
}</p>
<p>/* Calque pour la bordure gauche du cadre principal */<br />
  #bodyleft<br />
  { padding: 0px 0px 0px 5px; /* 5 pixels de d&eacute;calage depuis la gauche pour afficher l'image de 5 px */<br />
  background: #FFFFFF url(images/border_left.png) repeat-y; /* L'image de fond */<br />
  }</p>
<p>/* Calque pour la bordure droite du cadre principal */<br />
  #bodyright<br />
  { padding: 0px 5px 0px 0px; /* 5 pixels de d&eacute;calage depuis la droite pour afficher l'image de 5 px */<br />
  background: #FFFFFF url(images/border_right.png) repeat-y; /* L'image de fond */<br />
  background-position: right top; /* L'image doit &ecirc;tre affich&eacute;e &agrave; droite en partant du haut */<br />
  }</p>
<p>/* En t&ecirc;te */<br />
  #header<br />
  { width: 100%;<br />
  text-align: left;<br />
  height: 40px;<br />
  background: #066fd4 url(images/header.png) repeat-x;<br />
  color: #FFFFFF;<br />
  text-shadow: 0px 1px 2px #001f2f;<br />
  font-weight: bold;<br />
  font-size: 22px;<br />
  padding: 10px 0px 0px 0px; /* Sup&eacute;rieur - Droit - Inf&eacute;rieur - Gauche */<br />
  font-family: 'Geneva', 'Lucida Grande', LucidaGrande, Lucida, Helvetica, Arial, sans-serif;<br />
  }</p>
<p>#footer<br />
  { clear: both; /* Permet d'afficher le bloc en dessous de tout */<br />
  width: 100%;<br />
  text-align: center;<br />
  height: 30px;<br />
  background: #066fd4 url(images/footer.png) repeat-x;<br />
  color: #FFFFFF;<br />
  text-shadow: 0px 1px 2px #001f2f;<br />
  margin: 0;<br />
  font-weight: normal;<br />
  font-size: 12px;<br />
  padding: 10px 0px 0px 0px; /* Sup&eacute;rieur - Droit - Inf&eacute;rieur - Gauche */<br />
  font-family: 'Geneva', 'Lucida Grande', LucidaGrande, Lucida, Helvetica, Arial, sans-serif;<br />
  }</p>
<p>/* Conteneur de toute la page */<br />
  #container<br />
  { width: 100%;<br />
  margin: 0px auto;<br />
  text-align: left;<br />
  color: #3e3e3e;<br />
  background-color: #e7e7e7;<br />
  font-family: 'Geneva', 'Lucida Grande', LucidaGrande, Lucida, Helvetica, Arial, sans-serif;<br />
  /*border-left: 1px groove #000000;*/<br />
  }<br />
  /*################### POSITIONNEMENT - LAYOUT ################################*/</p>
<p>/* Conteneur du menu */<br />
  .menuContainer<br />
  { width: 15%;<br />
  float: right;<br />
  }</p>
<p>/* Conteneur du corps */<br />
  .contentContainer<br />
  { width: 85%;<br />
  float: left;<br />
  padding 10px 0 20px 5px;<br />
  background: #FFFFFF;<br />
  }</p>
<p>/*################### APPARENCE ###############################################/<br />
  /* Le menu */<br />
  .menu<br />
  { line-height: 1.7em;<br />
  }</p>
<p>.menu ul<br />
  { list-style: none;<br />
  margin: 10px 0px 0px 0px 0px; /* D&eacute;calage depuis le haut */<br />
  padding: 0px 0px 0px 15px; /* D&eacute;calage depuis la gauche */<br />
  }</p>
<p>.menu ul ul<br />
  { text-align: right;<br />
  list-style: none;<br />
  line-height: 1.2em;<br />
  font-weight: normal;<br />
  margin: 10px 0px 0px 0px 0px; /* D&eacute;calage depuis le haut */<br />
  padding: 0px 30px 0px 0px; /* D&eacute;calage depuis la droite (puisqu'align&eacute; &agrave; droite) */<br />
  }</p>
<p>.menu li<br />
  { /* H&eacute;rite de .menu a */<br />
  }</p>
<p>.menu #current<br />
  { color: #999999;<br />
  font-weight: bold;<br />
  }</p>
<p>.menu a {<br />
  display: block;<br />
  color: #b3b3b3;<br />
  text-shadow: 0px 1px 0px #ffffff;<br />
  text-decoration: none;<br />
  padding-left: 10px;<br />
  font-size: 12px;<br />
  }</p>
<p>.menu a:hover {<br />
  color: #007afa;<br />
  text-shadow: 0px 1px 0px #ffffff;<br />
  text-decoration: none;<br />
  font-size: 12px;<br />
  }</p>
<p>/* Le titre */<br />
  .titre<br />
  { width: inherit;<br />
  height: auto;<br />
  text-align: left;<br />
  background: #FFFFFF;<br />
  margin: 0 0 0 30px;<br />
  line-height: 10px;<br />
  }</p>
<p>.titre h1<br />
  { color: #066fd4;<br />
  font-size: 26px;<br />
  font-weight: normal;<br />
  margin-bottom: 1px;<br />
  text-shadow: 0px 1px 2px #001f2f;<br />
  line-height: 30px;<br />
  }</p>
<p>.titre h2<br />
  { color: #066fd4;<br />
  font-size: 14px;<br />
  font-weight: normal;<br />
  margin-bottom: 3px;<br />
  }</p>
<p>/* Le corps */<br />
  .corps<br />
  { width: 90%;<br />
  padding-right: 30px;<br />
  padding-left: 30px;<br />
  font-family: 'Geneva', 'Lucida Grande', LucidaGrande, Lucida, Helvetica, Arial, sans-serif;<br />
  font-size: 12;<br />
  text-align: justify;<br />
  line-height: 1.7em;<br />
  }</p>
<p>.corps .forcebg /* A utiliser dans les index.htm */<br />
  { height:100%;<br />
  }</p>
<p>.corps a<br />
  { color: #007afa;<br />
  text-shadow: 0px 1px 0px #ffffff;<br />
  text-decoration: none;<br />
  font-size: 12px;<br />
  }</p>
<p>.corps a:hover {<br />
  color: #007afa;<br />
  text-shadow: 0px 1px 0px #ffffff;<br />
  text-decoration: underline;<br />
  font-size: 12px;<br />
  }</p>
<p>.corps td<br />
  { font-size: 12;<br />
  padding: 5px 5px 5px 5px;<br />
  }</p>
<p>/*##################### CLASSES GLOBALES ####################################*/<br />
  h1 {<br />
  color: #066fd4;<br />
  font-size: 24px;<br />
  font-weight: normal;<br />
  margin-bottom: 10px;<br />
  padding-top: 10px;<br />
  }</p>
<p>h2 {<br />
  color: #066fd4;<br />
  font-size: 20px;<br />
  font-weight: normal;<br />
  margin-bottom: 5px;<br />
  line-height: 15px;<br />
  }</p>
<p>h3 {<br />
  color: #066fd4;<br />
  font-size: 18px;<br />
  font-weight: normal;<br />
  margin-bottom: 3px;<br />
  margin-left: 15px;<br />
  }</p>
<p>h4 {<br />
  color: #066fd4;<br />
  font-size: 16px;<br />
  font-weight: normal;<br />
  margin-bottom: 3px;<br />
  margin-left: 30px;<br />
  }</p>
<p>h5 {<br />
  color: #066fd4;<br />
  font-size: 14px;<br />
  font-weight: normal;<br />
  margin-bottom: 3px;<br />
  margin-left: 45px;<br />
  }</p>
<p>/*##################### MISCELLANEOUS ########################################*/<br />
  .Code {<br />
  font-family: &quot;Courier New&quot;, Courier, mono;<br />
  font-size: 14px;<br />
  font-style: normal;<br />
  line-height: normal;<br />
  font-weight: normal;<br />
  font-variant: normal;<br />
  text-transform: none;<br />
  color: darkorange;<br />
  text-align: left;<br />
  }</p>
</div>
<p>Bien entendu, tout cela va évoluer, et le CSS ne restera pas tel qu'il est exposé<br />
ci-dessus. De même, le code PHP sera enrichi. Mais la structure globale restera celle-ci<br />
jusqu'à une prochaine mise à jour.</p>
<p>
à Carpentras le 11/09/2005</p>
