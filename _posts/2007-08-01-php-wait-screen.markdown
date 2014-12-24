---
layout: post
status: publish
published: true
title: Faire patienter l'utilisateur pendant l’exécution d’un script PHP
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "<p>\r\n\tUn script PHP s’exécute sur le serveur, avant d’afficher à l’écran
  le résultat de son exécution. Dans la plupart des cas, le programme s’exécute en
  quelques millisecondes et l’affichage survient sans délai perceptible. Pourtant,
  il peut arriver qu’un script soit très long à exécuter : traitements mathématiques
  complexes (p. ex. lors de l’application d’un filtre complexe sur une image, un extrait
  sonore ou une vidéo), accès à un fichier sur l’ordinateur de l’utilisateur (p. ex.
  lorsque l’utilisateur <i>upload</i> un fichier sur le serveur), ou encore connexion
  à des serveurs distants (si un serveur distant ne répond pas, le script attendra
  le <i>timeout</i> pour passer au serveur suivant). Dans tous ces cas, il est nécessaire
  de prévenir le visiteur que le programme est toujours en cours d’exécution et qu’il
  doit patienter jusqu’à la fin de l’exécution. Il y a de nombreuses méthodes pour
  faire cela, des plus simples aux plus complexes. Cet article vous présente une méthode
  simple et efficace, écrite en PHP et utilisant JavaScript.\r\n</p>\r\n"
wordpress_id: 124
wordpress_url: http://www.valhalla.fr/index.php/2007/08/01/php-wait-screen-faire-patienter-les-utilisateurs-pendant-lexecution-dun-script-php/
date: '2007-08-01 17:20:23 +0200'
date_gmt: '2007-08-01 16:20:23 +0200'
categories:
- Web
tags:
- Internet
- programmation
- Web
- serveur
---
<p>
	Un script PHP s’exécute sur le serveur, avant d’afficher à l’écran le résultat de son exécution. Dans la plupart des cas, le programme s’exécute en quelques millisecondes et l’affichage survient sans délai perceptible. Pourtant, il peut arriver qu’un script soit très long à exécuter : traitements mathématiques complexes (p. ex. lors de l’application d’un filtre complexe sur une image, un extrait sonore ou une vidéo), accès à un fichier sur l’ordinateur de l’utilisateur (p. ex. lorsque l’utilisateur <i>upload</i> un fichier sur le serveur), ou encore connexion à des serveurs distants (si un serveur distant ne répond pas, le script attendra le <i>timeout</i> pour passer au serveur suivant). Dans tous ces cas, il est nécessaire de prévenir le visiteur que le programme est toujours en cours d’exécution et qu’il doit patienter jusqu’à la fin de l’exécution. Il y a de nombreuses méthodes pour faire cela, des plus simples aux plus complexes. Cet article vous présente une méthode simple et efficace, écrite en PHP et utilisant JavaScript.</p>
<p><a id="more"></a><a id="more-124"></a></p>
<p><h2>
		Principe de fonctionnement<br />
	</h2></p>
<p>
	Le principe de fonctionnement de ce script est simple : il s’agit d’afficher au début de l’exécution du script PHP un message avertissant l’utilisateur que le traitement sera long, puis d’enlever ce message une fois l’exécution terminée. Pour afficher un message à l’écran, un simple appel de ma fonction PHP <i>echo</i> suffit. Mais pour enlever le message une fois l’exécution terminée, il faut utiliser une code JavaScript. Il faut aussi que le message ait été inséré dans un conteneur (&lt;p&gt;, &lt;div&gt;, &lt;span&gt;,&lt;td&gt;, etc.) identifiable par son ID.</p>
<p>
	Cette méthode, légère et très facile à implémenter, a cependant deux inconvénients. D’une part, le navigateur pourrait arrêter le chargement de la page faute de recevoir de nouvelles informations (<i>timeout</i>) ; il faut donc envoyer de nouvelles données de temps en temps au navigateur, pendant l’exécution du script. D’autre part, l’utilisateur n’étant pas informé de la progression de l’opération, il risque de se lasser ; afficher une barre de progression ou un pourcentage régulièrement mis à jour n’est donc pas un luxe. Pour mettre en place un tel système, il faut d’abord créer un conteneur (&lt;div&gt; par exemple) au début de l’exécution du script. Il faut ensuite créer une fonction PHP mettant à jour l’affichage. Il ne restera plus qu’à appeler cette fonction pendant l’exécution du script. Finalement, on pourra rajouter à la fin du script une ligne de code JavaScript pour effacer l’affichage de la barre de progression.</p>
<p><h2>
		Premier exemple : affichage d’un message d’attente<br />
	</h2></p>
<p>
	La première étape consiste à créer un conteneur pour afficher le message. Le code suivant produit un tel conteneur :</p>
<div class="Code">
<p>
		1.<span style="white-space:pre;"> </span>&lt;div id="message" style="display:none;"&gt;Veuillez patienter s.v.p.&lt;/div&gt;
	</p>
</div>
<p>
		Ecrire <i>display:none</i> dans la balise <i>style</i> permet de masquer le message : il devra être activé explicitement au début de l’exécution du script PHP. Pour activer le message d’attente au début du script PHP, on pourra écrire les lignes suivantes :
	</p>
<div class="Code">
<p>
		1.<span style="white-space:pre;"> </span>echo "&lt;script&gt;";<br />
		<br />
		2.<span style="white-space:pre;"> </span>echo "document.getElementById('message').style.display = \"block\";";<br />
		<br />
		3.<span style="white-space:pre;"> </span>echo "&lt;/script&gt;";<br />
		<br />
		4.<span style="white-space:pre;"> </span>ob_flush();<br />
		<br />
		5.<span style="white-space:pre;"> </span>flush();<br />
		<br />
		6.<span style="white-space:pre;"> </span>ob_flush();<br />
		<br />
		7.<span style="white-space:pre;"> </span>flush();
	</p>
</div>
<p>
	Les lignes 1 à 3 ordonnent à PHP, par la commande <i>echo</i>, d’afficher un code source HTML au navigateur. Ce code (lignes 1 et 3) est composé d’une balise d’ouverture (ligne 1) et d’une balise de fermeture (ligne 3) indiquant au navigateur que le code entre ces balises est un JavaScript. Le code JavaScript est ici à la ligne 2 : il s’agit d’identifier le conteneur du message d’attente grâce à son ID et de l’afficher à l’écran (<i>display:block</i> permet d’afficher le message là où <i>display:none</i> le masque).</p>
<p>
	Mais si les commandes <i>echo</i> envoient des données au navigateur pour qu’ils les affiche, l’affichage dépend en réalité du navigateur. C’est lui qui décide quand et comment doivent être affichées les données à l’écran. De manière très classique, les navigateurs attendent d’avoir assez de données avant de les imprimer à l’écran. Ils attendront donc, la plupart du temps, la fin de l’exécution du code PHP ! Il faut les forcer à afficher les informations immédiatement. C’est ce que font les fonctions <i>ob_flush()</i> et <i>flush()</i>.</p>
<p>
	Les méthodes <i>ob_flush()</i> et <i>flush()</i> forcent le navigateur à afficher à l’écran le contenu de leur mémoire tampon, même s’il estime que les données ne sont pas encore prêtes à être affichées. Cependant, la plupart des navigateurs sont vraiment récalcitrants et refuseront d’afficher les données immédiatement. Il faut donc leur forcer la main. Pour cela, on appellera plusieurs fois de suite les méthodes <i>ob_flush()</i> et <i>flush()</i> (dans cet ordre).</p>
<p>
	A la fin de l’exécution du script, il faut masquer le message d’attente. L’utilisateur comprendra que le script est terminé. Pour ce faire, on écrira le code suivant :</p>
<div class="Code">
<p>
		1.<span style="white-space:pre;"> </span>echo "&lt;script&gt;";<br />
		<br />
		2.<span style="white-space:pre;"> </span>echo "document.getElementById('message').style.display = \"none\";";<br />
		<br />
		3.<span style="white-space:pre;"> </span>echo "&lt;/script&gt;";
	</p>
</div>
<p>
	Si l’affichage final n’a pas lieu immédiatement, c’est-à-dire si le traitement du script PHP continue, il faudra de nouveau appeler les méthodes <i>ob_flush()</i> et <i>flush()</i>.</p>
<p><h2>
		Second exemple : barre de progression<br />
	</h2></p>
<p>
	Le premier exemple affiche un message au début de l’exécution du script et l’efface à la fin. Cependant, il ne le met pas à jour pendant l’exécution. Ce second exemple, plus complet, consiste à créer une barre de progression (sans image externe), régulièrement mise à jour. Pour utiliser la barre de progression, les instructions du script PHP qui prennent beaucoup de temps doivent être issues d’une boucle <i>for</i> ou <i>while</i>.</p>
<p>
	<strong>Un exemple de mise en oeuvre de la barre de progression décrite ci-dessous est disponible [<a href="http://www.valhalla.fr/ressources/php-wait-screen-demo.php">sur cette page</a>], vous pouvez aussi afficher [<a href="http://www.valhalla.fr/ressources/php-wait-screen-demo-source.txt">le code source</a>] de l'exemple.</strong></p>
<p>
	La première étape consiste à créer la barre de progression. Voici le code HTML à écrire :</p>
<div class="Code">
<p>
		1.<span style="white-space:pre;"> </span>&lt;div id="conteneur" style="display:none; background-color:transparent;"&gt;<br />
		<br />
		2.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>&lt;div id="barre" style="display:block; background-color:#CCCCCC; width:0%;"&gt;<br />
		<br />
		3.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>&lt;div id="pourcentage" style="text-align:right;"&gt;<br />
		<br />
		4.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span><span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>&amp;nbsp;<br />
		<br />
		5.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>&lt;/div&gt;<br />
		<br />
		6.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>&lt;/div&gt;<br />
		<br />
		7.<span style="white-space:pre;"> </span>&lt;/div&gt;
	</p>
</div>
<p>
	Trois conteneurs &lt;div&gt; sont créés. Le premier conteneur (ligne 1) contient l’ensemble barre de progression et étiquette contenant le pourcentage. Le deuxième conteneur (ligne 2) contiendra la barre de progression : pour l’instant sa taille est de 0% ; elle augmentera au fur et à mesure de l’exécution dus cript. La couleur de la barre de progression est à définir grâce à la propriété <i>background-color</i> de ce conteneur. Ici, la barre de progression sera gris clair. Le troisième conteneur (ligne 3) contiendra le pourcentage, qui sera ici affiché à l’extrémité de la barre de progression.</p>
<p>
	La seconde étape consiste à créer une fonction PHP qui permet de mettre à jour l’affichage du &lt;div&gt;. Dans cet exemple, nous allons simuler le remplissage d’une barre de compression en changeant la couleur du fond d’écran du conteneur. Nous changerons également le contenu du &lt;div&gt; pour afficher un pourcentage. Voici la fonction :</p>
<div class="Code">
<p>
		1.<span style="white-space:pre;"> </span>function progression($indice)<br />
		<br />
		2.<span style="white-space:pre;"> </span>{<span style="white-space:pre;"> </span>echo "&lt;script&gt;";<br />
		<br />
		3.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>echo "document.getElementById('pourcentage').innerHTML='".$indice."%';";<br />
		<br />
		4.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>echo "document.getElementById('barre').style.width='".$indice."%';";<br />
		<br />
		5.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>echo "&lt;/script&gt;";<br />
		<br />
		6.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>ob_flush();<br />
		<br />
		7.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>flush();<br />
		<br />
		8.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>ob_flush();<br />
		<br />
		9.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>flush();<br />
		<br />
		10.<span style="white-space:pre;"> </span>}
	</p>
</div>
<p>
	Il faut ensuite activer l’affichage du conteneur principal (<i>conteneur</i>) au début du script PHP, comme dans le premier exemple :</p>
<div class="Code">
<p>
		1.<span style="white-space:pre;"> </span>echo "&lt;script&gt;";<br />
		<br />
		2.<span style="white-space:pre;"> </span>echo "document.getElementById('conteneur').style.display = \"block\";";<br />
		<br />
		3.<span style="white-space:pre;"> </span>echo "&lt;/script&gt;";<br />
		<br />
		4.<span style="white-space:pre;"> </span>ob_flush();<br />
		<br />
		5.<span style="white-space:pre;"> </span>flush();<br />
		<br />
		6.<span style="white-space:pre;"> </span>ob_flush();<br />
		<br />
		7.<span style="white-space:pre;"> </span>flush();
	</p>
</div>
<p>
	Il reste à placer l’appel à la fonction PHP <i>progression()</i> dans le code correspondant à la longue opération que l’on entend exécuter. Voici un exemple :</p>
<div class="Code">
<p>
		1.<span style="white-space:pre;"> </span>for( $i=0 ; $i &lt; $x ; $i++ )
	</p>
<p>
		2.<span style="white-space:pre;"> </span>{<span style="white-space:pre;"> </span>$indice = ( ($i+1)*100 ) / $x;<br />
		<br />
		3.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>progression($indice);<br />
		<br />
		4.<span style="white-space:pre;"> </span><br />
		<br />
		5.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>/* Placez ici le code très très long … */<br />
		<br />
		6.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>/* Exemple : */<br />
		<br />
		7.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>for( $j = 0 ; $j &lt; 10000 ; $j++ )<br />
		<br />
		8.<span style="white-space:pre;"> </span><span style="white-space:pre;"> </span><span style="white-space:pre;"> </span>echo '.';<br />
		<br />
		9.<span style="white-space:pre;"> </span>}
	</p>
</div>
<p>
	A la ligne 1, on crée une boucle for qui s’exécutera x fois (en fonction du contenu de la variable <i>$x</i>, par hypothèse définie plus haut dans le code). On calcule ensuite le pourcentage de progression (ligne 2) et on appelle la fonction <i>progression()</i> avec ce pourcentage en paramètre. Un traitement très long est simulé aux ligne 5 à 8.</p>
<p>
	Il reste à enlever la barre de progression, une fois que le traitement est terminé, comme dans le premier exemple. On peut aussi laisser la barre à l'écran et remplacer 100% par un message :</p>
<div class="Code">
<p>
		1.<span style="white-space:pre;"> </span>echo "&lt;script&gt;";<br />
		<br />
		2.<span style="white-space:pre;"> </span>echo "document.getElementById('pourcentage').innerHTML = \"TERMINÉ !\";";<br />
		<br />
		3.<span style="white-space:pre;"> </span>echo "&lt;/script&gt;";
	</p>
</div>
<p>
	Cette méthode d’affichage d’une barre de progression est mise en œuvre dans <a href="http://asgard.valhalla.fr/nat.php">le script Valhalla NatTest</a> que vous pouvez utiliser en guise de démonstration (choisissez une plage d’au moins 20 ports en TCP).</p>
<p>
	<strong>Un exemple de mise en oeuvre de la barre de progression décrite ci-dessus est disponible [<a href="http://www.valhalla.fr/ressources/php-wait-screen-demo.php">sur cette page</a>], vous pouvez aussi afficher [<a href="http://www.valhalla.fr/ressources/php-wait-screen-demo-source.txt">le code source</a>] de l'exemple.</strong></p>
