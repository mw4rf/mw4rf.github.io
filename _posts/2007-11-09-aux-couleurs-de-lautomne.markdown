---
layout: post
status: publish
published: true
title: Aux couleurs de l'automne
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "Un message rapide pour présenter la nouvelle interface graphique du site
  Valhalla, aux couleurs de l'automne. Le changement a du bon, même si le précédent
  thème graphique, tout en bleu, était vraiment magnifique. D'ailleurs, il n'est pas
  exclu qu'il réapparaisse cet été. Mais en attendant, les dominantes seront marron
  et orange foncé.\r\n\r\n"
wordpress_id: 132
wordpress_url: http://www.valhalla.fr/index.php/2007/11/09/aux-couleurs-de-lautomne/
date: '2007-11-09 14:28:02 +0100'
date_gmt: '2007-11-09 13:28:02 +0100'
categories:
- Valhalla
tags:
- Graphisme
- Valhalla
---
<p>Un message rapide pour présenter la nouvelle interface graphique du site Valhalla, aux couleurs de l'automne. Le changement a du bon, même si le précédent thème graphique, tout en bleu, était vraiment magnifique. D'ailleurs, il n'est pas exclu qu'il réapparaisse cet été. Mais en attendant, les dominantes seront marron et orange foncé.</p>
<p><a id="more"></a><a id="more-132"></a></p>
<h2>Le Dock</h2>
<p>Vous avez sûrement remarqué la barre de navigation dans la partie gauche de la page. C'est une imitation du Dock de Mac OS X. Je la trouve particulièrement bien réalisée, même si j'aurais préféré que la légende de l'icône active s'affiche à côté d'elle et non à un endroit fixe, prédéterminé. Pour tous ceux qui voudraient mettre en place sur leurs propres sites un tel menu, le code source (distribué en GPL) est disponible en téléchargement ici : <a href="ftp://downloads.valhalla.fr/stsmhdan/xmenu.zip">télécharger XMenu</a>. </p>
<p>Le thème vient avec quelques icônes toutes prêtes. Sachez cependant que vous devrez éditer votre fichier <i>header</i> pour y ajouter quelques lignes :</p>
<p>Rajoutez d'abord ceci entre les balises <i>head</i>:</p>
<p><span class="Code"><br />
&lt;!-- XMENU --&gt;<br />
	&lt;link type=&quot;text/css&quot; href=&quot;&lt;?php echo get_settings(&#x27;home&#x27;); ?&gt;/CHEMIN VERS XMENU/xmenu/xmenu.css&quot; rel=&quot;StyleSheet&quot;&gt;<br />
	&lt;script type=&quot;text/javascript&quot; src=&quot;&lt;?php echo get_settings(&#x27;home&#x27;); ?&gt;/CHEMIN VERS XMENU/xmenu/xmenu.js&quot;&gt;&lt;/script&gt;<br />
&lt;!-- /XMENU --&gt;<br />
</span></p>
<p>Il faudra ensuite modifier la balise <i>body</i> :</p>
<p><span class="Code"><br />
&lt;body onload=&quot;xmenu_init();&quot;&gt;<br />
</span></p>
<p>Le menu lui-même est contenu dans un tableau. On peut ajouter le nombre d'icône que l'on veut, mais attention à ne pas dépasser la hauteur de la fenêtre. Il est possible d'afficher une bande colorée sous les icônes (<i>xmenu_bg</i>) ; elle est ici désactivée. Dans l'exemple ci-dessous, une seule icône est présente ; vous pouvez copier-coller pour en ajouter d'autres :</p>
<p><span class="Code"><br />
&lt;!-- XMENU --&gt;<br />
	&lt;!-- &lt;div id=&quot;xmenu_bg&quot;&gt; --&gt;<br />
	&lt;table id=&quot;xmenu_menu&quot;&gt;&lt;tr&gt;&lt;td&gt;<br />
	&lt;!--XMENU Images --&gt;<br />
		&lt;!-- Articles essentiels --&gt;<br />
		&lt;a href=&quot;&lt;?php echo get_settings(&#x27;home&#x27;); ?&gt;http://mon site....&quot;&gt;<br />
		&lt;img src=&quot;&lt;?php echo get_settings(&#x27;home&#x27;); ?/&gt;/CHEMIN VERS XMENU/xmenu/images/mon_image.png&quot; alt=&quot;L&eacute;gende de cette ic&ocirc;ne&quot; onmouseover=&quot;xmenu_hover(this)&quot; onmouseout=&quot;xmenu_unhover(this)&quot; width=&quot;32&quot; &gt;<br />
		&lt;/a&gt;<br />
	&lt;!-- /XMENU Images --&gt;<br />
	&lt;/td&gt;&lt;/tr&gt;&lt;/table&gt;<br />
	&lt;p id=&quot;xmenu_p&quot; &gt;&lt;span style=&quot;display:none&quot; id=&quot;xmenu_text&quot;&gt;&lt;/span&gt;&lt;/p&gt;<br />
&lt;!-- /XMENU --&gt;<br />
</span></p>
<hr />
<p>Suite aux messages ci-dessous, voici quelques modifications ultérieures :</p>
<p>1) Pour que le dock s'affiche plus vite, il faut réduire la valeur de la propriété <i>ms</i> dans le fichier <i>xmenu.js</i> :<br />
<span class="Code">ms = 5; // avant, c'était à 50...</span></p>
<p>2) Pour déplacer la légende des éléments du Dock, c'est plus compliqué. J'ai bien essayé de placer la légende à côté de l'icône survolée, mais pas moyen... ce n'est pourtant pas compliqué en théorie, mais Safari 3 refuse obstinément de me donner la position de l'icône survolée (et je ne comprends pas pourquoi...). Que ce soit avec offsetTop/offsetLeft ou avec style.top/style.left, Safari ne veut pas retourner la bonne valeur. Bref, j'ai abandonné cette méthode et j'ai fait dans le bourrin (de chez bourrin).</p>
<p>- Dans le fichier xmenu.css, retirer tout le contenu de #xmenu_p et les lignes "position", "top" et "left" de xmenu_p span.<br />
- Placer xmenu_p, qui devient un div, en haut du tableau qui contient les icônes :<br />
<span class="Code"><br />
&lt;tr&gt;&lt;td&gt;<br />
	&lt;div id=&quot;xmenu_p&quot; &gt;&lt;span style=&quot;display:none&quot; id=&quot;xmenu_text&quot;&gt;&lt;/span&gt;&lt;/div&gt;&lt;br /&gt;<br />
	&lt;!--XMENU Images --&gt;<br />
</span></p>
<h2>Les polices</h2>
<p>Le logo Valhalla est écrit dans la police <a href="http://www.dafont.com/fr/first-order.font">First Order</a>.</p>
<p>Le corps du texte est écrit en Trebuchet MS (par défaut), Verdana (si précédente absente), Tahoma (si précédente absente), Arial (si précédente absente).</p>
<p>La règle CSS du corps de texte est la suivante :</p>
<div class="Code">
.entry /* = le corps du texte du billet, sur la page d'accueil et ailleurs */<br />
{<br />
	/* On pourrait faire un roman sur cette propriété... on va aller à l'essentiel<br />
	1) Elle fonctionne sans unité, comme multiple de la hauteur de ligne<br />
	c-à-d 1.5 représente 150% de la hauteur "classique"<br />
	2) Elle fonctionne parfaitement sous Firefox MAIS...<br />
	3) Elle dépend de la police utilisée !!!!<br />
	=> avec la police Georgia, p. ex. Firefox et Omniweb refusent catégoriquement<br />
	de modifier la hauteur des lignes, même si l'on met une valeur gigantesque.<br />
	En revanche, Safari prend très bien en compte cette propriété.<br />
	Si l'on change la police, pour utiliser Verdana, Firefox prend de nouveau cette<br />
	propriété en compte, même pour de très petites valeurs (1.0).<br />
	Certains ont reporté qu'avec les polices Times, FF réagit à partir de 2em et pas<br />
	en dessous.*/<br />
	line-height: 1.5;</p>
<p>	/* Taille de la police */<br />
	font-size: 1.1em;</p>
<p>	/* Classique justification ...*/<br />
	text-align: justify;<br />
}
</p></div>
