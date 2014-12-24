---
layout: post
status: publish
published: true
title: L'équivalent de la fonction C scanf() en Java
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 67
wordpress_url: http://blog.gfblog.com/index.php/2001/10/18/lequivalent-de-la-fonction-c-scanf-en-java/
date: '2001-10-18 12:15:39 +0200'
date_gmt: '2001-10-18 10:15:39 +0200'
categories:
- Java
tags:
- programmation
- Java
---
<p>Il n'existe pas par d&eacute;faut en Java de m&eacute;thode permettant de r&eacute;cup&eacute;rer une s&eacute;rie de nombres venant de l'utilisateur, comme le fait la m&eacute;thode scanf() en C/C++. Il faut donc ruser, et &eacute;crire quelques lignes de code pour arriver &agrave; nos fins.</p>
<p>Pour r&eacute;cup&eacute;rer un argument (cha&icirc;ne, nombre, ...) au cours de l'ex&eacute;cution d'un programme en ligne de commande, il faut utiliser le m&eacute;thode readline() de la classe DataInputStream. Cette m&eacute;thode renvoie une cha&icirc;ne, nous devons ensuite convertir cette cha&icirc;ne en nombre. Pour cela on utilisera les String Tokenizers.</p>
<p>Ce que vous devez faire: r&eacute;cup&eacute;rer avec DataInputStream.readline() la cha&icirc;ne de nombres.<br />
  L'utilisateur aura &agrave; saisir par exemple &quot;23 32 5 47 22.3 55.221&quot; pour avoir les entiers 23, puis 32, puis 5, puis 47, et les flottants 22.3 et 55.221.<br />
  Notre code s&eacute;pare les diff&eacute;rents nombres contenus dans la cha&icirc;ne:</p>
<p class="Code">String s = &quot;23 32 5 47 22.3 55.221&quot;;<br />
  java.util.StringTokenizer st = new java.util.StringTokenizer(s);<br />
  while (st.hasMoreTokens())<br />
  { System.out.println(&quot;Le nombre suivant est: &quot; + st.nextToken() + &quot;\n&quot;);<br />
  }</p>
<p>Voici ce qui sort:<br />
  <span class="Code">23<br />
  32<br />
  5<br />
  47<br />
  22.3<br />
  55.221</span></p>
<p>Pour convertir les cha&icirc;nes sorties en nombres, on peut utiliser diff&eacute;rentes m&eacute;thodes, dont celle expliqu&eacute;e dans un autre article de cette FAQ (Convertir des String en int, float... et vice-versa).</p>
<p>Voici le code non comment&eacute;:</p>
<ul>
<li /><span class="Code">String str;</span>
<li /><span class="Code">str = &quot;25&quot;; // nombre entier</span>
<li /><span class="Code">int i = Integer.valueOf(str).intValue(); // cr&eacute;er un int &agrave; partir de la cha&icirc;ne</span>
<li /><span class="Code">System.out.println(i);</span>
<li /><span class="Code">long l = Long.valueOf(str).longValue(); // cr&eacute;er un long &agrave; partir de la cha&icirc;ne</span>
<li /><span class="Code">System.out.println(l);</span>
<li /><span class="Code">str = &quot;25.6&quot;; // nombre &agrave; virgule flottante</span>
<li /><span class="Code">float f = Float.valueOf(str).floatValue(); // cr&eacute;er un float &agrave; partir de la cha&icirc;ne</span>
<li /><span class="Code">System.out.println(f);</span>
<li /><span class="Code">double d = Double.valueOf(str).doubleValue();  // cr&eacute;er un double &agrave; partir de la cha&icirc;ne</span>
<li /><span class="Code">System.out.println(d); </span>
</ul>
<p>  Note: depuis Java 1.1, pour avoir un Short et/ou un Byte on passera par Integer (comme pour avoir un int) mais en utilisant soit Integer.byteValue() soit Integer.shortValue().</p>
<p>Ecrit par Narcanes pour l'association Java-France/Jgflsoft<br />
  www.java-france.com / www.jgflsoft.com <br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG. <br />
  Montpellier, 18 octobre 2001.</p>
