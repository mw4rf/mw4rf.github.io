---
layout: post
status: publish
published: true
title: Aperçu de l'attribut contenteditable en HTML5

  
  



excerpt: "L'<i><a href=\"http://fr.wikipedia.org/wiki/Hypertext_Markup_Language\">HyperText
  Markup Language</a></i>, ou HTML, est le langage permettant de décrire la composition
  des pages Web que le navigateur interprète afin d'afficher le contenu à l'écran.
  Les <a href=\"http://www.w3.org/TR/#tr_HTML\">spécifications</a> de ce langage sont
  établies par le <i><a href=\"http://www.w3.org/\">World Wide Web Consortium</a></i>
  (W3C). La <a href=\"http://www.w3.org/TR/html5/\">cinquième version du HTML</a>,
  en cours d'élaboration, est déjà partiellement intégrée à la plupart des navigateurs
  modernes. La balise &lt;video&gt; a monopolisé l'attention pendant un temps, mais
  l'HTML 5 offre d'autres <a href=\"http://www.w3.org/TR/html5-diff/\">nouveautés</a>,
  dont le très important <a href=\"http://www.dicodunet.com/definitions/normes/attribut.htm\">attribut</a>
  <strong>contenteditable</strong>.\r\n"
wordpress_id: 519
date: '2010-04-19 09:23:25 +0200'
date_gmt: '2010-04-19 07:23:25 +0200'
categories:
- Informatique
tags:
- Internet
- programmation
- Web
permalink:  /2010/04/19/contenteditable-html5/
---
<p>L'<i><a href="http://fr.wikipedia.org/wiki/Hypertext_Markup_Language">HyperText Markup Language</a></i>, ou HTML, est le langage permettant de décrire la composition des pages Web que le navigateur interprète afin d'afficher le contenu à l'écran. Les <a href="http://www.w3.org/TR/#tr_HTML">spécifications</a> de ce langage sont établies par le <i><a href="http://www.w3.org/">World Wide Web Consortium</a></i> (W3C). La <a href="http://www.w3.org/TR/html5/">cinquième version du HTML</a>, en cours d'élaboration, est déjà partiellement intégrée à la plupart des navigateurs modernes. La balise &lt;video&gt; a monopolisé l'attention pendant un temps, mais l'HTML 5 offre d'autres <a href="http://www.w3.org/TR/html5-diff/">nouveautés</a>, dont le très important <a href="http://www.dicodunet.com/definitions/normes/attribut.htm">attribut</a> <strong>contenteditable</strong>.<br />
<a id="more"></a><a id="more-519"></a></p>
<h2>Utilité de l'attribut <i>contenteditable</i></h2>
<p>Le Web 2.0 est caractérisé par la transformations des internautes de simples lecteurs passifs en producteurs de contenu. L'exemple typique est Wikipédia, l'encyclopédie collaborative dans laquelle chaque internaute peut apporter sa contribution. D'un point de vue technique, cette transformation s'appuie sur des technologies bien connues depuis quelques années, comme Ajax, qui permet aux pages Web d'abandonner leur état purement statique pour devenir <em>interactives</em>. L'attribut <em>contenteditable</em> permet également cela, mais de manière plus simple et plus efficace.</p>
<p>Cet attribut permet de rendre n'importe quel conteneur, dans une page Web, directement modifiable. L'internaute a l'impression d'être face à un logiciel de traitement de texte plutôt qu'à une page Web.</p>
<p>Reprenons l'exemple de Wikipédia. Le lecteur qui souhaite corriger une erreur dans un article devra cliquer sur un lien, appelé "Modifier", qui le redirigera vers une page avec une zone d'édition du texte. Il devra ensuite rechercher le passage à corriger dans la zone d'édition (ce qui peut être pénible, en fonction de la longueur du texte), effectuer la modification, puis soumettre en formulaire en cliquant sur un bouton "Enregistrer les modifications". Au final, il aura dû charger deux pages, en plus de la page contenant l'article, avec tout ce que cela implique -- lenteur du chargement, perte de vue du texte avec le passage d'une page à l'autre, etc. La balise <em>contenteditable</em> résout ce problème en permettant d'effectuer les modifications directement sur la page d'origine.</p>
<h2>Démonstration de l'attribut <i>contenteditable</i></h2>
<p>Voici une démonstration. Il suffit de cliquer sur le texte ci-dessous pour le rendre directement modifiable :</p>
<p><span contenteditable="true" class="Code">Modifiez-moi !</span></p>
<p>L'utilisation de cette balise est un jeu d'enfant. Pour réaliser l'exemple ci-dessus, il a suffi d'écrire ceci :</p>
<p><code>&lt;span contenteditable="true"&gt;Modifiez-moi !&lt;/span&gt;</code></p>
<p>Le conteneur utilisé est un <strong>&lt;span&gt;</strong>, mais cela fonctionne de la même manière avec les autres conteneurs, notamment <strong>&lt;div&gt;</strong> et <strong>&lt;p&gt;</strong>. A l'heure actuelle, l'attribut <em>contenteditable</em> fonctionne avec Firefox 3.6, Safari 4, Opera 10.5, Chrome 5.</p>
<h2>Récupération des modifications avec JavaScript</h2>
<p>Définir un conteneur comme étant modifiable --c'est-à-dire offrir à l'utilisateur la possibilité de modifier le contenu-- ne sert à rien si l'on n'enregistre pas les modifications. L'attribut <i>contenteditable</i> ne permet pas, à lui seul, de faire cela. Son rôle se limite à rendre un conteneur modifiable. Il faudra donc utiliser JavaScript pour récupérer les modifications, puis pour les enregistrer (dans une base de données, par exemple).</p>
<p>Voici un exemple complet de la construction, pas à pas, d'une page qui offre à l'internaute de modifier un paragraphe de texte, et qui récupère ensuite les modifications grâce à JavaScript.</p>
<p>On commence par définir la structure de la page. Sur ce point, le HTML 5 ne change rien par rapport à la version précédente :<br />
<code>&lt;!DOCTYPE html&gt;<br />
&lt;html&gt;<br />
&lt;head&gt;<br />
	&lt;meta http-equiv=&quot;Content-Type&quot; content=&quot;text/html; charset=utf-8&quot;&gt;<br />
	&lt;title&gt;test html5&lt;/title&gt;<br />
&lt;/head&gt;<br />
&lt;body&gt;<br />
&lt;/body&gt;<br />
&lt;/html&gt;<br />
</code></p>
<p>On insère ensuite, dans le corps de cette page, un paragraphe modifiable avec l'<i>id</i> <b>test</b> :<br />
<code>&lt;body&gt;<br />
&lt;p id=&quot;test&quot; contenteditable=&quot;true&quot;&gt;<br />
	Lorem Impsum...<br />
&lt;/p&gt;<br />
&lt;/body&gt;<br />
</code></p>
<p>On place, entre les balises <em>&lt;head&gt;</em> et <em>&lt;/head&gt;</em>, un code JavaScript permettant :
<ul>
<li>De récupérer le conteneur grâce à son <i>id</i><em> (1ère fonction)</em></li>
<li>De récupérer le contenu <em>(2ème fonction)</em></li>
<li>D'afficher un message avec ce contenu <em>(3ème fonction)</em></li>
</ul>
<p><code>&lt;script type=&quot;text/javascript&quot; charset=&quot;utf-8&quot;&gt;<br />
	function $(element) { return document.getElementById(element) }<br />
	function $H(element) { return $(element).innerHTML }<br />
	function test() { alert($H(&#x27;test&#x27;)) }<br />
&lt;/script&gt;<br />
</code></p>
<p>Pour finir, on place un code JavaScript à la fin de la page, juste avant la balise <em>&lt;/html&gt;</em>, qui permet :
<ul>
<li>D'attacher un gestionnaire d'événements au paragraphe modifiable : lorsque l'utilisateur valide sa modification, en cliquant en dehors de la zone modifiable, n'importe où sur la page, la fonction <i>test()</i> précédemment définie est appelée.</li>
<li>D'activer la correction orthographique du navigateur dans le paragraphe modifiable.</li>
</ul>
<p><code>&lt;script type=&quot;text/javascript&quot; charset=&quot;utf-8&quot;&gt;<br />
	$(&#x27;test&#x27;).addEventListener(&quot;blur&quot;, test, false)<br />
	$(&#x27;test&#x27;).spellcheck = &#x27;true&#x27;<br />
&lt;/script&gt;<br />
</code></p>
<p>L'élément modifiable, doté de l'attribut <em>contenteditable</em>, gère deux actions : <strong>focus</strong> et <strong>blur</strong>. La première est déclenchée lorsque l'utilisateur clique sur l'élément afin de le modifier, et la seconde lorsqu'il valide les modifications (un clic ailleurs sur la page, ou une pression sur la touche Tab, par exemple).</p>
<p>A noter qu'il est possible de rendre une page modifiable dans son ensemble, par JavaScript, grâce à l'instruction suivante :<br />
<code>document.designMode = 'true'</code></p>
<p>La page est terminée. Notre paragraphe peut être édité et les modifications sont récupérées par Javascript lorsque l'utilisateur les valide en sortant de la zone modifiable.</p>

{%highlight html%}
<!DOCTYPE html>

<html lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>test html5</title>
	<script type="text/javascript" charset="utf-8">
		function $(element) { return document.getElementById(element) }
		function $H(element) { return $(element).innerHTML }
		function test() { alert($H('test')) }
	</script>
</head>

<body>
<p id="test" contenteditable="true">
	Lorem Impsum...
</p>
</body>

<script type="text/javascript" charset="utf-8">
	$('test').addEventListener("blur", test, false)
	$('test').spellcheck = 'true'
</script>

</html>
{%endhighlight%}

<h2>Enregistrer les modifications avec Ajax</h2>
<p>Dans l'exemple précédent, le nouveau contenu du paragraphe est simplement affiché dans une boîte de dialogue modale -- <em>alert()</em> -- : c'est tout ce que fait la fonction <strong>test()</strong>. Mais il est bien entendu possible de modifier cette fonction, afin d'enregistrer le nouveau contenu dans une base de données. Une requête AJAX serait particulièrement adaptée à cela.</p>
permalink:  /2010/04/19/contenteditable-html5/
<p>Il existe de nombreux frameworks Ajax. Pour n'en citer que trois, parmi les plus célèbres : <a href="http://jquery.com/">jQuery</a>, <a href="http://www.prototypejs.org/">Prototype</a>, <a href="http://mootools.net/">MooTools</a>. Chacun a sa propre syntaxe ; c'est pourquoi il est difficile --- et inutile -- de créer ici un exemple qui conviendra à tous les lecteurs.</p>
<p>Voyons tout de même, dans les grandes lignes, comment faire. Côté JavaScript, on modifie la fonction <em>test()</em> pour récupérer l'<i>id</i> du paragraphe et son contenu :<br />
<code><br />
function test()<br />
{<br />
	test_contenu = document.getElementById('test').innerHTML<br />
</code></p>
<p><em>NB: JQuery et Prototype implémentent la fonction $() ; il faudra donc supprimer la fonction $(element) définie ci-dessus.</em></p>
<p>On rajoute ensuite l'appel Ajax, de manière différente selon le framework utilisé.</p>
<p>Exemple avec JQuery :<br />
<code><br />
	$.ajax({<br />
		type: "POST",<br />
		url: "test_update.php",<br />
		data: {contenu:test_contenu}<br />
	});<br />
}<br />
</code></p>
<p>Exemple avec Prototype :<br />
<code><br />
	new Ajax.Updater("",<br />
		"test_update.php",<br />
		{<br />
			method:'post',<br />
			parameters: {contenu:test_contenu}<br />
		}<br />
	)<br />
}<br />
</code></p>
<p>Reste ensuite à créer la page <strong>test_update.php</strong>, appelée par Ajax, afin de traiter les données transmises par la requête asynchrone.<br />
<code><br />
&lt;?php<br />
	if(!empty($_POST[&#x27;contenu&#x27;]))<br />
	{<br />
		$contenu = addslashes($_POST[&#x27;contenu&#x27;]);<br />
		$sql = &quot;UPDATE ma_table SET contenu = &#x27;$contenu&#x27; WHERE...&quot;;<br />
		@mysql_query($sql);<br />
	}<br />
?&gt;<br />
</code></p>
<p>Le code présenté ici n'est pas sécurisé (pas de contrôle de la donnée de formulaire transmise), et il ne fonctionne pas car il n'est pas indiqué <i>où</i> (clause WHERE) les modifications doivent être faites. Il est cependant très facile, en modifiant un peu le code JavaScript, de récupérer l'<i>id</i> du paragraphe et d'identifier ainsi la bonne ligne dans la base de données.</p>
<hr />
A Paris, le 18 avril 2010</p>
