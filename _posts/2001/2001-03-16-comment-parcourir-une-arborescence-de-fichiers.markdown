---
layout: post
status: publish
published: true
title: Comment parcourir une arborescence de fichiers ?

  
  



wordpress_id: 63
wordpress_url: http://blog.gfblog.com/index.php/2001/03/16/comment-parcourir-une-arborescence-de-fichiers/
date: '2001-03-16 11:57:23 +0100'
date_gmt: '2001-03-16 09:57:23 +0100'
categories:
- Java
tags:
- programmation
- java
permalink:  /2001/03/16/comment-parcourir-une-arborescence-de-fichiers/
---
<p>Ce document a pour but de vous expliquer, comme le dit son titre, comment d&eacute;tecter et afficher tous les fichiers et sous-r&eacute;pertoires d'un r&eacute;pertoire racine. La solution propos&eacute;e ici utilise la technique de r&eacute;cursivit&eacute;. Il existe certainement d'autres mani&egrave;res de proc&eacute;der mais celle-ci est assez &eacute;l&eacute;gante.</p>
<p>Un tout petit peu de th&eacute;orie quand m&ecirc;me: une m&eacute;thode -ou fonction, routine...- dite r&eacute;cursive est fonction qui fait r&eacute;f&eacute;rence &agrave; elle-m&ecirc;me dans son code, c'est-&agrave;-dire une fonction qui, une fois lanc&eacute;e, s'ex&eacute;cute en boucle tant qu'une certaine condition n'est pas remplie.</p>
<p>Si le code est mal programm&eacute;, que la condition ne permet jamais l'arr&ecirc;t de la m&eacute;thode, on aura une erreur du type StackOverflow, ce qui signifie que vous &ecirc;tes en train de noyer compl&egrave;tement votre programme avec des calculs astronomiques.</p>
<p>Tous les &eacute;tudiants en informatique on eu &agrave; passer par les c&eacute;l&egrave;bres Tours de Hano&iuml;, programme qui doit &ecirc;tre r&eacute;alis&eacute; &agrave; l'aide de m&eacute;thodes r&eacute;cursives. A titre indicatif (le but n'est quand m&ecirc;me pas de vous faire crouler sous la th&eacute;orie ;) quand on parle de solution r&eacute;cursive, il existe souvent une autre solution dite it&eacute;rative (bas&eacute;e sur l'utilisation de boucles for, while, etc). Cette solution it&eacute;rative est plus rapide &agrave; l'ex&eacute;cution, mais plus difficile &agrave; programmer.</p>
<p>Dans notre cas, nous voulons parcourir un r&eacute;pertoire (dor&eacute;navant appel&eacute; r&eacute;pertoire racine) et afficher son contenu, ceci ne n&eacute;cessite pas de r&eacute;cursivit&eacute;. Par contre, nous voulons en plus d&eacute;tecter tous les r&eacute;pertoires contenus dans ce r&eacute;pertoire racine, et ainsi de suite jusqu'&agrave; ce que toute l'arborescence soit &quot;scann&eacute;e&quot; ; et c'est pour cela que nous avons besoin de m&eacute;thodes r&eacute;cursives.</p>
<p>Passons au concret:</p>
<p>1 - Pour commencer, on doit cr&eacute;er une m&eacute;thode, appel&eacute;e ici recurseDirs(String r&eacute;pertoire):</p>
<p><span class="Code">public void recurseDirs(String r&eacute;pertoire)<br />
  {</span></p>
<p>2 - Nous devons sp&eacute;cifier un r&eacute;pertoire racine au programme. Pour cela nous allons cr&eacute;er un nouvel objet File, qui peut soit &ecirc;tre un fichier proprement dit soit un r&eacute;pertoire (dans notre cas un r&eacute;pertoire). La classe File admet comme param&egrave;tre un String. Vous pouvez obtenir ce String de diff&eacute;rente mani&egrave;re (en le sp&eacute;cifiant vous-m&ecirc;me manuellement, en l'obtenant par l'interm&eacute;diaire d'un JFileChooser... ), ce n'est pas notre sujet, dans tous les cas vous devez le transmettre comme param&egrave;tre &agrave; la m&eacute;thode pour pouvoir l'utiliser ici et pour pouvoir utiliser la r&eacute;cursivit&eacute; plus loin.</p>
<p class="Code">File fichier = new File(repertoire);</p>
<p>3 - Nous allons cr&eacute;er une matrice (ou tableau) destin&eacute; &agrave; contenir toutes les entr&eacute;es du r&eacute;pertoire:</p>
<p class="Code">String list[];</p>
<p>4 - Nous devons sp&eacute;cifier une condition: ex&eacute;cuter ce qui suit si et seulement si l'objet File est un r&eacute;pertoire (quand le scan est termin&eacute;, qu'il n'y a plus de nouveau r&eacute;pertoire &agrave; scanner, File ne satisfait plus la condition et on sort de la m&eacute;thode).</p>
<p class="Code">if (fichier.isDirectory())<br />
{</p>
<p>5 - Ensuite nous entrons toutes les entr&eacute;es du r&eacute;pertoire racine dans la matrice cr&eacute;&eacute;e plus haut, en utilisant la m&eacute;thode list() de la classe File qui renvoie une matrice de String:</p>
<p class="Code">list = fichier.list();</p>
<p>6 - Nous entrons ici dans le coeur du code: une r&eacute;cursivit&eacute;-it&eacute;rative (si, si!). Nous cr&eacute;ons une boucle for qui est ex&eacute;cut&eacute;e autant de fois que le r&eacute;pertoire racine contient de documents. Au sein de cette boucle for est appel&eacute;e notre m&eacute;thode (c'est l&agrave; que se trouve la r&eacute;cursivit&eacute;), avec comme argument l'entr&eacute;e num&eacute;ro n de la boucle. Le caract&egrave;re de s&eacute;paration (separatorChar) de la classe File est n&eacute;cessaire pour des questions de syntaxe du chemin du r&eacute;pertoire, nous n'avons pas &agrave; nous en soucier.</p>
<p class="Code">for (int i = 0; i &lt; list.length ; i++)<br />
  {<br />
  recurseDirs(repertoire + File.separatorChar + list[i]);<br />
}</p>
<p>7 - Nous pouvons maintenant manipuler les noms des fichiers et r&eacute;pertoires, par exemple les rediriger vers la sortie syst&egrave;me:</p>
<p class="Code">System.out.println(&quot;-&gt;&gt; &quot; + repertoire);</p>
<p>Tutoriel distribu&eacute; pour le FAQ Java de Java-France www.java-france.com / www.jgflsoft.com<br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG. <br />
  &Eacute;crit &agrave; Montpellier le 16 mars 2001</p>
