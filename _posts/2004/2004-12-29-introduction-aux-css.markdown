---
layout: post
status: publish
published: true
title: Introduction aux CSS
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 17
wordpress_url: http://localhost/~guillaume/gfblog/wordpress/?p=17
date: '2004-12-29 22:33:29 +0100'
date_gmt: '2004-12-29 20:33:29 +0100'
categories:
- Informatique
tags:
- internet
- programmation
- web
- serveur
permalink:  /2004/12/29/introduction-aux-css/
---
<p>Vous voulez cr&eacute;er un site mais vous ne savez pas comment vous y prendre; vous avez un site perso, construit en HTML avec un outil WYSIWYG tel que Frontpage, mais on vous a dit que ce n'&eacute;tait pas la meilleure solution pour cr&eacute;er un site; ou tout simplement vous &ecirc;tes curieux: cet article est fait pour vous. Je vais tenter d'expliquer ici, dans un premier temps ce que sont ces fameuses &quot;CSS&quot;; dans un second temps pourquoi il faut les utiliser; et dans un troisi&egrave;me temps, bri&egrave;vement, comment les utiliser. </p>
<h3>Vous avez dit CSS ? </h3>
<p>Les CSS sont des <em>feuilles de style en cascade</em>, ou <em>Cascading StyleSheets</em>. Vous savez que pour cr&eacute;er une page Web, il faut savoir programmer, programmer en HTML. Ce que font des outils tels que Dreamweaver, GoLive, Frontpage, NVU pour ne citer qu'eux, est une simple transposition de ce que vous voyez &agrave; l'&eacute;cran en code source HTML. D'o&ugrave; l'abr&eacute;viation WYSIWYG, <em>what you see</em>, ce que vous voyez, <em>is what you get</em>, est ce que vous obtenez (en code source).</p>
<p>Cr&eacute;er une page Web, c'est donc programmer. Le HTML est un langage de programmation. Il existe des dizaines de langages de programmation, et ils sont tous diff&eacute;rents; cependant, on peut tous les classer dans des grandes familles. Il existe ainsi plusieurs crit&egrave;res caract&eacute;risant les langages de programmation, chaque crit&egrave;re servant de base &agrave; une mani&egrave;re pr&eacute;cise de classer ces derniers. Le HTML est un langage purement <em>descriptif</em>, c'est &agrave; dire que tout ce qu'il peut faire, c'est d&eacute;crire un &eacute;tat, il ne peut en aucun cas modifier cet &eacute;tat. Vous utilisez Windows, Linux ou Mac OS X ? Ces syst&egrave;mes d'exploitation sont respectivement &eacute;crits en C++ et C. Le C et le C++ sont des langages complexes qui permettent de d&eacute;crire une situation (il y a une fen&ecirc;tre de telle taille, avec un bouton au centre) et de cr&eacute;er des &eacute;v&egrave;nements (quand on clique sur ce bouton il se passe telle chose). Le HTML, lui, n'est capable que de d&eacute;crire la situation. Ainsi, le HTML vous servira &agrave; dire au navigateur Web: <em>affiche un image en haut &agrave; gauche, affiche un tableau en dessous, affiche un texte dans le tableau, etc.</em></p>
<p>Le HTML est un langage de programmation <em>descriptif</em> qui sert &agrave; afficher les &eacute;l&eacute;ments composant une page Web (textes, images, boutons, etc). Dans une page Web, on distingue la structure, le <em>contenant</em>, des &eacute;l&eacute;ments qui la composent, le <em>contenu</em>. Le HTML sert &agrave; d&eacute;finir comment doit &ecirc;tre le contenant et quel doit &ecirc;tre le contenu.</p>
<p>Le code HTML suivant: <span class="Code">&lt;b&gt;&lt;i&gt;Bonjour le monde!&lt;/i&gt;&lt;/b&gt; </span>permet d'afficher <strong><em>Bonjour le monde!</em></strong> (contenu) en gras gr&acirc;ce &agrave; la balise <span class="Code">&lt;b&gt;&lt;/b&gt;</span> et en italique gr&acirc;ce &agrave; la balise <span class="Code">&lt;i&gt;&lt;/i&gt;</span> (contenant).</p>
<p>Tout cela est bien beau, mais c'est termin&eacute;! En effet, le W3C (World Wide Web Consortium) a d&eacute;cid&eacute; de ne plus d&eacute;velopper le HTML, et de le remplacer par le XHTML. Le XHTML, c'est du HTML mais avec un X! Le X de XML, autre langage de programmation similaire au HTML. La diff&eacute;rence est que maintenant le contenu est s&eacute;par&eacute; du contenant. Le contenu est d&eacute;fini dans un fichier &eacute;crit en XHTML alors que le contenant est g&eacute;r&eacute; par une feuille de style CSS. Vous savez donc maintenant ce que sont les CSS: ce sont des outils pour g&eacute;rer le contenant d'une page Web, autrement dit tous les &eacute;l&eacute;ments de pr&eacute;sentation, de formatage ou de mise en page.</p>
<h3>Pourquoi utiliser les CSS ?</h3>
<p>Le HTML est un langage mort puisqu'il n'est plus d&eacute;velopp&eacute;. Il a laiss&eacute; sa place au XHTML+CSS. Sans entrer dans les d&eacute;tails, je vais vous expliquer les deux principales raisons de ce changement.</p>
<p>Premi&egrave;rement, le HTML a atteint ses limites. En effet, il convenait pour afficher les sites Web de la premi&egrave;re g&eacute;n&eacute;ration: un titre avec une image en dessous, des barres horizontales de partout, des gifs anim&eacute;s, un gros pat&eacute; de texte non justifi&eacute; (je parle de l'alignement ;-) et un fond d'&eacute;cran tout laid. Mais d&egrave;s lors que vous voulez sortir de &ccedil;a et avoir plus de contr&ocirc;le sur la mise en forme de votre contenu, il vous faut abandonner le HTML. Les CSS arrivent en renfort pour vous aider: elles ont &eacute;t&eacute; cr&eacute;es pour g&eacute;rer le contenant, et elles le font tr&egrave;s bien!</p>
<p>Deuxi&egrave;mement, imaginez que vous avez un site similaire &agrave; celui-ci. C'est &agrave; dire que vous avez, par exemple, une centaine de pages dont le contenu est diff&eacute;rent mais dont la pr&eacute;sentation graphique doit &ecirc;tre exactement la m&ecirc;me pour garantir l'uniformit&eacute; du site. Si vos pages sont construites en HTML pur, si vous d&eacute;cidez de changer un &eacute;l&eacute;ment dans un fichier (par exemple passer votre police par d&eacute;faut de la taille 10 &agrave; la taille 12), vous devrez modifier un par un tous les fichiers. Avec les CSS, il n'en est plus question: on cr&eacute;e un fichier appel&eacute; &quot;machinchouette.CSS&quot; et on indique &agrave; chaque page du site qu'elle doit afficher son contenu en suivant les r&egrave;gles de pr&eacute;sentation d&eacute;finies dans ce fichier. Ainsi, c'est ce fichier qui dit que la taille de la police est 10: il suffit de mettre 12 &agrave; la place de 10 dans ce fichier, et la police de toutes les pages passera en taille 12! Outre le fait que cela soit beaucoup plus simple lors des mises &agrave; jour de votre interface, recourir aux CSS est une bonne id&eacute;e: le code source est &eacute;crit une seule fois (dans le fichier .CSS) et non pas r&eacute;p&eacute;t&eacute; dans chaque fichier (donc le chargement des pages est plus rapide, et vous occupez moins de place sur votre serveur).</p>
<h3>Utilisation basique des CSS</h3>
<p>On l'a compris, les CSS servent &agrave; g&eacute;rer le contenant alors que le XHTML sert &agrave; g&eacute;rer le contenu. Nous allons donc cr&eacute;er un fichier XHTML avec du contenu, puis une feuille de style d&eacute;finissant le contenant.</p>
<p>Voici un exemple de code XHTML: <br />
  <span class="Code">&lt;div id=&quot;important&quot;&gt;<br />
&lt;h1&gt;Ceci est important:&lt;/h1&gt;<br />
&lt;p&gt;J'utilise les &lt;span class=&quot;code&quot;&gt;CSS&lt;/span&gt; !!!&lt;/p&gt;<br />
&lt;/div&gt; </span></p>
<p>Le contenu est le suivant: <em>Ceci est important:</em> et <em>J''utilise les CSS</em>. Il est format&eacute; de trois mani&egrave;res diff&eacute;rentes: le <em>Ceci est important:</em> doit &ecirc;tre en gros et en rouge, le <em>J'utilise les</em> doit &ecirc;tre en texte normal, et le <em>CSS</em> doit &ecirc;tre dans une police sans-serif comme Courier. Pour cela, on doit indiquer dans la page XHTML qu'on a affaire &agrave; des morceaux de textes &agrave; pr&eacute;senter de mani&egrave;re diff&eacute;rente.</p>
<p>Les balises <span class="Code">&lt;div&gt;&lt;/div&gt;</span> et <span class="Code">&lt;span&gt;&lt;/span&gt;</span> servent &agrave; d&eacute;finir un conteneur. Ainsi, mon texte se trouve dans le conteneur DIV appel&eacute; &quot;important&quot;, car il est important! La balise DIV s'utilise de mani&egrave;re g&eacute;n&eacute;rique pour &ecirc;tre appliqu&eacute;e &agrave; un contenu, tandisque la balise SPAN s'utilise de mani&egrave;re sp&eacute;ciale pour un contenu restreint encadr&eacute; d'un contenu global pr&eacute;sent&eacute; d'une autre mani&egrave;re. Par exemple, le texte de cet article est &eacute;crit dans la police Apple Garamond Light (dans des balises DIV) et l'exemple de code ci-dessus est imbriqu&eacute; au milieu du texte de l'article gr&acirc;ce &agrave; une balise SPAN.</p>
<p>On a donc la balise DIV &agrave; laquelle on a donn&eacute; un nom: &quot;important&quot;. Ensuite, on trouve la balise <span class="Code">&lt;h1&gt;&lt;/h1&gt;</span>. Elle sert &agrave; d&eacute;finir un <em>header</em> de rang 1, ou en fran&ccedil;ais un titre de rang 1. Si vous utilisez Microsoft Word, vous connaissez les styles: Style 1, Style 2, ... Style 9. Ici, c'est pareil: <span class="Code">&lt;h1&gt;&lt;h2&gt;...&lt;h9&gt;</span>. La balise <span class="Code">&lt;p&gt;&lt;/p&gt;</span> sert &agrave; indiquer qu'il s'agit d'un nouveau paragraphe.</p>
<p>Une fois le contenu &eacute;crit, il faut se charger du contenant. Voil&agrave; ce qu'il faut &eacute;crire: </p>
<p class="Code">#important {<br />
  font-family: &quot;Apple Garamond Light&quot;, Times, serif;<br />
  font-size: 12px; <br />
  }</p>
<p>  .code {<br />
  font-family: Courier, sans-serif;<br />
  font-size: 12px; <br />
  }</p>
<p><span class="Code">h1 {<br />
  font-family: &quot;Apple Garamond Light&quot;, Times, serif;<br />
  font-size: 30px; <br />
  color: red;<br />
  } </span></p>
<p>Ceci est une feuille de style (et oui!).</p>
<p>La feuille de style se charge en premier de la mani&egrave;re d'afficher le contenu entre les balises <span class="Code">&lt;div&gt;</span> dont le nom est &quot;important&quot; (donc <span class="Code">&lt;div id=&quot;important&quot;&gt;</span>). Elle impose &agrave; ce contenu de s'afficher avec la police Apple Garamond Light, si elle n'est pas install&eacute;e, avec la police Times, et si elle n'est pas install&eacute;e non plus, avec n'importe quelle police avec empattements (<em>serif</em> en anglais). La taille de cette police est &eacute;tablile &agrave; 12 pixels (12px). Elle d&eacute;finit ensuite la pr&eacute;sentation du contenu pour la balise <span class="Code">&lt;div id=&quot;code&quot;&gt;</span> : la police Courier, et &agrave; d&eacute;faut n'importe quelle police sans empattement, &agrave; une taille de 12 pixels. Pour finir, la feuille de style d&eacute;finit la pr&eacute;sentation de tout les contenus encadr&eacute;s des balises <span class="Code">&lt;h1&gt;&lt;/h1&gt;</span>: la police, sa taille (ici 30 pixels) et sa couleur (rouge).</p>
<p>J'ai &eacute;crit <span class="Code">#important</span>,<span class="Code"> .code</span> et<span class="Code"> h1</span>; avec <span class="Code">&lt;div id=&quot;&quot;&gt;</span>, <span class="Code">&lt;span class=&quot;&quot;&gt;</span>, et <span class="Code">&lt;h1&gt;&lt;/h1&gt;</span>. Au conteneur DIV, on assigne un nom par le biais de texte <span class="Code"><em>i</em></span><em><span class="Code">d=&quot;&quot;</span></em>: le conteneur est individualis&eacute;, et la pr&eacute;sentation faite par la feuille de style sous <em class="Code">#important</em> ne pourra &ecirc;tre utilis&eacute;e que pour lui. Il ne peut pas y avoir un autre conteneur appel&eacute; &quot;important&quot;. Ainsi, quand on veut assigner une pr&eacute;sentation particuli&egrave;re &agrave; un &eacute;l&eacute;ment individualis&eacute;, on utilise le symbole # devant le nom de cet &eacute;l&eacute;ment dans la feuille de style. Si par contre on veut pouvoir utiliser de nouveau la m&ecirc;me pr&eacute;sentation plus loin, on doit recourir &agrave; une <em>classe</em> CSS. Ici, il s'agit de la classe <em class="Code">.code</em> caract&eacute;ris&eacute;e par le symbole . (point) devant son nom. On appelle cette classe tout naturellement avec le texte <span class="Code"><em>class=&quot;&quot;</em></span>. Et si, dans un troisi&egrave;me temps, on veut red&eacute;finir la pr&eacute;sentation de tout le contenu encadr&eacute; de balises d'un certain type, comme ici <span class="Code">&lt;h1&gt;</span>, on laissera <em class="Code">h1</em> sans symbole suppl&eacute;mentaire dans la feuille de style. Cette derni&egrave;re option ne fonctionne que pour les balises XHTML existantes (c'est &agrave; dire g&eacute;n&eacute;ralement pour les balises <span class="Code">&lt;hx&gt;</span> et <span class="Code">&lt;a...&gt;</span>(lien).</p>
<p>Vous avez maintenant un contenu et un contenant, il ne reste plus qu'&agrave; les associer. Il existe 3 mani&egrave;res d'associer un style CSS &agrave; un contenu: l'int&eacute;gration ponctuelle dans le code source de la page XHTML (<em>inline CSS </em>); l'int&eacute;gration dans l'en-t&ecirc;te de la page XHTML, entre les balises <span class="Code">&lt;head&gt;&lt;/head&gt;</span>(<em>embedded CSS </em>); et la liaison ou l'inclusion d'un feuille de style externe (<em>external CSS </em>).</p>
<p>La premi&egrave;re m&eacute;thode est difficilement utilisable dans notre cas car il faudrait r&eacute;&eacute;crire le code CSS, mais voici un petit exemple pour formater le contenu de notre balise &quot;important&quot;:</p>
<p class="Code">&lt;div id=&quot;important&quot; style=&quot;font-family: 'Apple Garamond Light', Times, serif;<br />
  font-size: 12px;&quot;&gt;</p>
<p>La seconde m&eacute;thode consiste &agrave; faire un simple copier coller du code comment&eacute; plus haut dans l'en-t&ecirc;te de la page HTML. On obtient ceci:</p>
<p class="Code">&lt;head&gt;<br />
&lt;style TYPE=&quot;text/css&quot;&gt;<br />
&lt;!--<br />
  #important {<br />
  font-family: &quot;Apple Garamond Light&quot;, Times, serif;<br />
  font-size: 12px; <br />
  }<br />
  --&gt;<br />
&lt;/style&gt;<br />
&lt;/head&gt; </p>
<p>La troisi&egrave;me m&eacute;thode est beaucoup plus int&eacute;ressante, et c'est celle que j'utilise pour ce site. Cr&eacute;ez votre fichier HTML avec le code du d&eacute;but de ce document; puis cr&eacute;er un fichier texte &quot;maCSS.css&quot; dans le m&ecirc;me r&eacute;pertoire et copiez y le code ci-dessus tel quel. Dans le fichier HTML &eacute;crivez entre les balises <span class="Code">&lt;head&gt;&lt;/head&gt;</span> le code suivant: </p>
<p class="Code">&lt;link href=&quot;maCSSs.css&quot; rel=&quot;stylesheet&quot; type=&quot;text/css&quot; /&gt;</p>
<p>Cette m&eacute;thode fait appel au fichier externe pour le <em>lier</em> au fichier XHTML. Avec cette m&eacute;thode, on ne peut <em>lier</em> qu'un seul fichier CSS. Si vous avez besoin d'en utiliser plusieurs, vous devrez non pas les <em>lier</em> mais les <em>inclure</em>. Cependant, contrairement &agrave; la <em>liaison</em>, l'<em>inclusion</em> n'est pas bien support&eacute;e par tous les navigateurs.</p>
<p class="Code"> &lt;STYLE TYPE=&quot;text/css&quot;&gt; @import url(&quot;maCSS.css&quot;) &lt;/STYLE&gt;</p>
<p>Voil&agrave;, vous savez maintenant comment utiliser les CSS! </p>
<p>Je tiens &agrave; rajouter une petite explication &agrave; propos des pseudo-classes. Imaginez qu'au lieu de formater les balises <span class="Code">&lt;hx&gt;</span> vous vouliez formater les balises <span class="Code">&lt;a&gt;</span> (liens), mais que vous vouliez aussi d&eacute;finir des &eacute;tats diff&eacute;rents selon que le lien est actif, visit&eacute;, passif, etc. Pour cela, vous devez avoir recours aux pseudo classes. Pour cela, &eacute;criez d'abord le tag &agrave; modifier, ajoutez le symbole <em>:</em> (deux points) et mettez l'&eacute;tat pour lequel vous voulez d&eacute;finir la pr&eacute;sentation. Par exemple, pour d&eacute;finir l'apparence d'un lien visit&eacute;, &eacute;crivez: <em class="Code">a:visited { }</em>. Voici un exemple:<br />
  <span class="Code">a:link {<br />
  color: #666633;<br />
  font-style: italic;<br />
  text-decoration: none;<br />
  }<br />
  a:visited {<br />
  text-decoration: none;<br />
  color: #666633;<br />
  }<br />
  a:hover {<br />
  text-decoration: underline;<br />
  color: #FFFFFF;<br />
  }<br />
  a:active {<br />
  text-decoration: none;<br />
  color: #666633;<br />
  }</span></p>
<p>Pour finir, je vous laisse un petit exemple comment&eacute; d'une classe CSS: la classe basique servant pour le texte brut de ce site.</p>
<p>En CSS, le code contenu entre <span class="Code">/*</span> et<span class="Code"> */</span> est un commentaire: il n'est pas interpr&eacute;t&eacute;, le logiciel n'en tient pas compte. Dans le code ci-dessous j'ai ins&eacute;r&eacute; de nombreux commentaires, et ils fonctionnent ainsi: <span class="Code">letter-spacing: normal; /* normal|length */</span> signifie que pour la propri&eacute;t&eacute; <em class="Code">letter-spacing</em> (l'espace entre deux lettres dans un mot), on peut soit choisir la valeur par d&eacute;faut de la police (c'est le cas ici: <em class="Code">normal</em>), soit une certains longueur que l'on devra d&eacute;finir (<em class="Code">length</em>). </p>
<p class="Code">.TEXTE { <br />
  font-family: &quot;Apple Garamond Light&quot;, Times, serif;<br />
  font-size: 14px; /* absolute size: relative to browser settings (xx-small|x-small|small|medium|large|x-large|xxlarge)<br />
  |relative size: relative to parent style settings (larger|smaller)<br />
  |length (number + em|ex|px|pt|pc|mm|cm|in)<br />
  |percentage (n%) */<br />
  font-style: normal; /* normal|italic|oblique */<br />
  font-variant: normal; /* normal|small-caps */<br />
  font-weight: normal; /* normal|bold|bolder|lighter|100|200|300|400|500|600|700|800|900 */</p>
<p>  line-height: normal; /* normal|number|length|percentage */<br />
  word-spacing: normal; /* normal|length */<br />
  letter-spacing: normal; /* normal|length */</p>
<p>  text-decoration: none; /* none|underline|overline|line-through|blink */<br />
  vertical-align: baseline; /* baseline|bottom|middle|sub|super|text-bottom|text-top<br />
  |top|percentage */<br />
  text-transform: none; /* none|capitalize|lowercase|uppercase */<br />
  text-align: justify; /* center|justify|left|right */</p>
<p>  /* text-indent: length|percentage; */<br />
  /* margin-top/bottom/right/left: length|percentage|auto; */<br />
  /* margin: length|percentage|auto; */<br />
  /* padding-top/bottom/right/left: length|percentage; */<br />
  /* padding: length|percentage; */<br />
  /* border-top/bottom/right/left-width: thin|medium|thick|length; */<br />
  /* border-width: thin|medium|thick|length; */<br />
  /* border-color: color name|RGB value; */<br />
  /* border-style: none|dotted|dashed|solid|double|groove|ridge|inset|outset; */</p>
<p>
  color: #666633; /* color name|RGB color value (COULEUR DU TEXTE: FOREGROUND)*/<br />
  background-color: #B3B380; /* color name or RGB value|transparent */<br />
  background-image: none; /* url(&quot;http://&quot;); */ <br />
  } </p>
<p>
&agrave; Montpellier 28/12/2004</p>
