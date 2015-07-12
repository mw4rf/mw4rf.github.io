---
layout: post
status: publish
published: true
title: 'Plugin pour WordPress: affichage personnalisé des commentaires'
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 77
wordpress_url: http://blog.gfblog.com/?p=77
date: '2005-11-01 00:49:24 +0100'
date_gmt: '2005-10-31 22:49:24 +0100'
categories:
- Valhalla
tags:
- Internet
- programmation
- software
- Valhalla
permalink:  /2005/11/01/plugin-pour-wordpress-affichage-personnalise-des-commentaires/
---
<h1>Plugin for WordPress: comments custom display <br /> Plugin para WordPress: presentacion personalizada de los comentarios</h1>
<div style="border:#CCCCCC dotted; background:#FFCCFF; width:95%; text-align:center;">
<p><a href="http://www.valhalla.fr/ressources/wp_plugin/customcomments.zip">Download here</a></p>
</div>
<h2>&lt; English &gt;</h2>
<p><u>About</u><br /><b>CustomComments</b> is a plugin for WordPress blogging software. It enables you to set up 2 CSS styles (i.e. changing background, foreground, font style, size, etc.): one style for comments submitted by the blog owner, and another style for comments submitted by other people.</p>
<p><u>Install</u>
<ol>
<li />(Optional) Check your user id (the first user, the blog owner, is num. 1) and change the value of $my_id if necessary.</p>
<li />Upload customcomments.php to your WordPress plugins folder. Choose the file according to you blog encoding (if you don't understand what I'm talkink about, just use UTF-8 or go into your WP admin panel and Options > Read to see the charset used by your blog).
<li />Activate the plugin in WordPress admin panel
<li />Call the function <b>custom_comments()</b> in wp-comment.php or in comment.php if you use a custom theme:
<ul>
<li />FIND: <span class="Code">&lt;li id="comment-&lt;?php comment_ID() ?&gt;"&gt;</span>
<li />REPLACE BY: <span class="Code">&lt;li id="comment-&lt;?php comment_ID() ?&gt;" &lt;?php custom_comments(); ?&gt;&gt;</span></ul>
<li />Open wp-style.css or style.css if you use a custom theme, and create 2 classes (put custom content between { and } ):
<ul>
<li />.mycomments { } < = highlighted comments</p>
<li />.otherscomments { } < = normal comments
</ul>
</ul>
</ol>
<p><u>Credits</u><br />
Copyright © 2005 Guillaume Florimond - Valhalla GFBlog.com<br />
This plugin can be distributed, with the name of the author and the copyright in the source code. The plugin can't be sold.</p>
<h2>&lt; Français &gt;</h2>
<p><u>A propos</u><br /><b>CustomComments</b> est un plugin pour le logiciel de blog WordPress. Son but et de permettre au propriétaire du blog de démarquer ses commentaires de ceux des autres utilisateurs en les affichant de manière différente.</p>
<p><u>Installation</u>
<ol>
<li />(Optionnel) Vérifiez votre id d'utilisateur et modifiez $my_id en conséquence (si vous êtes le premier utilisateur à vous être enregistré, ce qui est probablement le cas si vous êtes le propriétaire du blog, votre id sera 1.</p>
<li />Uploadez customcomments.php dans le dossier des plugins de WordPress. Choisissez le fichier correspondant à l'encodage de votre blog (si vous ne savez pas, choisissez UTF-8 ou allez voir dans l'interface d'administration WP Options > Lecture).
<li />Activez le plugin depuis l'interface d'administration de WordPress
<li />Appelez la fonction <b>custom_comments()</b> dans wp-comment.php ou dans comment.php si vous utilisez un thème personnalisé:
<ul>
<li />TROUVEZ: <span class="Code">&lt;li id="comment-&lt;?php comment_ID() ?&gt;"&gt;</span>
<li />REMPLACEZ PAR: <span class="Code">&lt;li id="comment-&lt;?php comment_ID() ?&gt;" &lt;?php custom_comments(); ?&gt;&gt;</span></ul>
<li />Ouvrez wp-style.css ou style.css si vous utilisez un thème personnalisé, et créez 2 classes (mettez le contenu entre { et } ):
<ul>
<li />.mycomments { } < = commentaires à mettre en relief</p>
<li />.otherscomments { } < = commentaires normaux
</ul>
</ul>
</ol>
<p><u>Crédits</u><br />
Copyright © 2005 Guillaume Florimond - Valhalla GFBlog.com<br />
Ce plugin peut être librement redistribué dès lors qu'il est fait mention de l'auteur. Il ne peut en aucun cas être vendu.</p>
<h2>&lt; Español &gt;</h2>
<p><u>A proposito</u><br /><b>CustomComments</b> est un plugin para el software de blog WordPress. Su papel es de dar la posibilidad al webmaster de crear 2 clases CSS diferentes: la primera para sus propios comentarios, y la segunda para los comentarios sometidos por los demas.</p>
<p><u>Instalacion</u>
<ol>
<li />(Opcional) Cambia el "1" de $my_id por tu numero de usuari. Si fuiste el primer usuario del blog (sera asi si eres el propietario del blog), tu id sera "1".</p>
<li />Pon customcomments.php en el repertorio de los plugins WordPress. Tienes que utilisar el archivo correspondiente a tu charset (si no sabes, puedes utilizar UTF-8 o ir en la interfaz de administracion de WP, y ver cual es el charset utilisado en Opciones > Leer).
<li />Activa en plugin desde la interfaz de administracion de WordPress
<li />Llama la funccion <b>custom_comments()</b> en wp-comment.php o en comment.php si tienes un tema personalizado:
<ul>
<li />ENCUENTRA: <span class="Code">&lt;li id="comment-&lt;?php comment_ID() ?&gt;"&gt;</span>
<li />REMPLAZA POR: <span class="Code">&lt;li id="comment-&lt;?php comment_ID() ?&gt;" &lt;?php custom_comments(); ?&gt;&gt;</span></ul>
<li />En wp-style.css o style.css si tienes un tema personalizado, crea 2 clases (pon el contenido entre { y } ):
<ul>
<li />.mycomments { } < = comentarios que hay que poner de realce</p>
<li />.otherscomments { } < = comentarios de los demas
</ul>
</ul>
</ol>
<p><u>Creditos</u><br />
Copyright © 2005 Guillaume Florimond - Valhalla GFBlog.com<br />
Este plugin puede ser redistribuido libremente, siempre que no se quita el nombre del autor del archivo. No puede ser en ningun caso objeto de compraventa.</p>
