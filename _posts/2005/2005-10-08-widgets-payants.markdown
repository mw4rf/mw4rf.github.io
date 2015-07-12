---
layout: post
status: publish
published: true
title: Widgets payants
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 49
wordpress_url: http://blog.gfblog.com/index.php/2005/10/08/widgets-payants/
date: '2005-10-08 20:48:34 +0200'
date_gmt: '2005-10-08 18:48:34 +0200'
categories:
- Informatique
tags:
- Mac
- Internet
- humeur
- Apple
permalink:  /2005/10/08/widgets-payants/
---
<p>
La dernière version du système d'exploitation Apple, Mac OS 10.4 "Tiger", intègre un logiciel assez intéressant: Dashboard. Une pression sur la touche F12 du clavier, et un écran rempli de gadgets (appelés "widgets") se superpose au bureau.</p>
<p>
<center><br />
<img alt="dashboard" src="/public/posts/2005-10-08-widgets/dashboard.png" /><br />
</center></p>
<p>
Ces petits machins c'est très utile ! Non... en fait c'est totalement superflu. En plus ça bouffe plein de mémoire et de ressources processeur. Bref, il ne vaudrait mieux ne pas les utiliser. Mais là n'est pas la question.</p>
<p>
Les widgets sont très faciles et très rapides à créer. C'est pour ça qu'il y en a tant de disponibles sur internet. Des milliers, à peine quelques mois après la sortie de Tiger. Mais voilà, certains sont payants. Alors s'il faut payer quelques dollars pour un widget très utile, pourquoi pas. Mais certains widgets sont une pure et simple arnaque. Alors ne vous faites pas arnaquer: virez les ou hackez les (enfin, faites ce que vous voulez ;) ).</p>
<p>
D'ailleurs, si tous les widgets ne sont pas gratuits, ils sont tous open-source ! Et oui... ils reposent sur une structure XHTML/JavaScript. Ils ne sont donc pas compilés, et il devient très facile de faire sauter toutes les protections d'un widget ! La protection la plus classique affiche un écran noir devant le widget à chaque ouverture de Dashboard (à chaque pression sur F12), avec un bouton sur lequel cliquer pour accéder au widget. Acheter le widget permet d'enlever cet écran noir de manière définitive. Payez ou lisez ce qui suit, faites votre choix.</p>
<p>
Il faut d'abord ouvrir le "paquet" que constitue le widget. Pour cela, il faut se rendre dans le répertoire des widgets (<span class="Code">Macintosh HD/Utilisateurs/votre_nom/Bibliothèque/Widgets/</span>), cliquer-droit sur l'icône du widget, et choix de l'option <em>Afficher le contenu du paquet</em>.</p>
<p>
<center><br />
<img alt="dashboard" src="/public/posts/2005-10-08-widgets/widget1.png" /><br />
</center></p>
<p>
Trouvez ensuite le fichier <span class="Code">nom_du_widget.js</span>. Ouvrez ce fichier dans un éditeur de texte (<a href="http://www.barebones.com/products/bbedit/index.shtml">BBEdit</a>, <a href="http://www.codingmonkeys.de/subethaedit/">SubEthaEdit</a>, etc.).</p>
<p>
La structure du fichier est la suivante:<br />

{% highlight java %}
function ma_fonction_1()
{
... ici, plein de trucs (pas) très compliqués ;-) ...
}

function ma_fonction_2()
{
... ici également, plein de trucs tout aussi (pas) compliqués ;-) ...
}
{% endhighlight %}

<p>
Cherchez (Pomme+F) la fonction qui gère la protection. Elle aura certainement un nom évocateur comme "register", "licence", "serial", "protection", etc. Encadrez la fonction par /* et */, de cette manière:</p>
<p>

{% highlight java %}
/*
function ma_fonction_1()
{
}
*/
{% endhighlight %}

<p>
Il ne vous reste plus qu'à tester le widget. Si la protection n'est pas plus élaborée que celle décrite ci-dessus, ça fonctionnera parfaitement. Sinon, sachez qu'il est toujours possible de casser cette protection, mais qu'il vous faudra pour cela une meilleure connaissance du JavaScript.</p>
