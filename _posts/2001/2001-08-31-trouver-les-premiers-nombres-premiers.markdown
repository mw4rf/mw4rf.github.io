---
layout: post
status: publish
published: true
title: Trouver les premiers nombres premiers

  
  



wordpress_id: 74
wordpress_url: http://blog.gfblog.com/index.php/2001/08/31/trouver-les-premiers-nombres-premiers/
date: '2001-08-31 12:49:15 +0200'
date_gmt: '2001-08-31 10:49:15 +0200'
categories:
- Java
tags:
- programmation
- java
permalink:  /2001/08/31/trouver-les-premiers-nombres-premiers/
---
<p>Ceci ne concerne pas vraiment une technique de programmation, c'est plut&ocirc;t un exercice pour se former l'esprit, et c'est aussi la d&eacute;monstration que Java peut servir pour le calcul math&eacute;matique.</p>
<p>L'algo mis en place est le plus simple dans le genre: on premd un nombre impair, on le divise par chaque entier impair entre 3 et sa racine carr&eacute;e. S'il n'a aucun diviseur il est premier.</p>
<p class="Code">// Le nombre candidat de d&eacute;part, mettez la valeur que vous d&eacute;sirez, ce sera le nombre de d&eacute;part et le programme ira en choisissant des nombres de plus en plus grands<br />
  long candidat = 1000;</p>
<p class="Code">while (true) // ou for (;;) sont des boucles infinies qui ne v&eacute;rifient pas de condition<br />
  {<br />
  // on invoque la m&eacute;thode estPremier() qui renvoie un booleen: oui ou non le nombre qu'on lui soumet est premier, l'instruction if(estPremier(candidate)) est &eacute;quivalente<br />
  // &agrave; if (estPremier(candidate) == true)<br />
  if(estPremier(candidate)) {System.out.println(&quot;&gt;Est premier le nombre: &quot; + candidate); <br />
  }</p>
<p class="Code">private static boolean estPremier(long candidat)<br />
  {<br />
  // Diviser le nombre par tous les entiers impairs entre 3 et sa racine<br />
  double racine = Math.sqrt(candidate);<br />
  for (long i = 3; i &lt;= sqrt; i += 2) // on incr&eacute;mente de 2 pour sauter les pairs<br />
  { <br />
  // si le modulo, c-&agrave;-d le reste de la division euclidienne est 0, le nombre est divisible par i, i est donc un facteur, le nombre n'est pas premier.<br />
  if (candidat % i == 0) return false;<br />
  } <br />
  // Si la cdt ci-dessus n'est jamais v&eacute;rifi&eacute;e, alors le nombre est premier:<br />
  return true;<br />
  }</p>
<p>Et voil&agrave;, vous n'avez plus qu'&agrave; r&eacute;diger la m&eacute;thode main() o&ugrave; &agrave; incorporer ce code dans une de vos classes, ici les premiers sont sortis en console. (System.out)</p>
<p>Tutoriel distribu&eacute; pour le FAQ Java de www.jgflsoft.com ou www.java-france.com<br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG. <br />
  Ecrit &agrave; Montpellier le 31 ao&ucirc;t 2001</p>
