---
layout: post
status: publish
published: true
title: Comment convertir des String en int, float, double, ... , et vice versa ?

  
  



wordpress_id: 61
wordpress_url: http://blog.gfblog.com/index.php/2001/04/27/comment-convertir-des-string-en-int-float-double-et-vice-versa/
date: '2001-04-27 11:11:38 +0200'
date_gmt: '2001-04-27 09:11:38 +0200'
categories:
- Java
tags:
- programmation
- java
permalink:  /2001/04/27/comment-convertir-des-string-en-int-float-double-et-vice-versa/
---
<p>J'ai d&eacute;cid&eacute; de traiter ce point pr&eacute;cis de la programmation Java: la convertion des types primaires (ou types de base) de donn&eacute;es, car cela m'a pos&eacute; des probl&egrave;mes quand j'ai d&eacute;but&eacute; en Java, et cela en pose souvent aux programmeurs venant de Delphi/Pascal, tout simplement car il n'existe pas en Java de m&eacute;thodes comme IntToStr ou StrToInt (Delphi).<br />
  Je vous propose ici l'impl&eacute;mentation de ces deux m&eacute;thodes, ainsi que deux autre m&eacute;thodes convertissant des int vers long et des String vers float. Vous pourrez ensuite, une fois le sch&eacute;ma pos&eacute; dans ce document, faire vous-m&ecirc;me d'autres combinaisons.</p>
<p>Voici donc les m&eacute;thodes ainsi que la mani&egrave;re de les utiliser:</p>
<h1>M&eacute;thodes<br />
</h1>
<p class="Code">/** <br />
  * De String vers INT<br />
  */<br />
  public static int strToInt(String s) <br />
  { <br />
  Integer ger = new Integer(s); <br />
  int i = ger.intValue(); <br />
  return i; <br />
  }</p>
<p class="Code">/** <br />
  * De INT vers String <br />
  */ <br />
  public static String intToStr(int i) <br />
  { <br />
  String texte = new String(); <br />
  texte = texte.valueOf(i); <br />
  return texte; <br />
  }</p>
<p class="Code">/** <br />
  * De INT vers long <br />
  */ <br />
  public static long intToLong(int i) <br />
  {<br />
  Integer ger = new Integer(i); <br />
  long lg = ger.longValue(); <br />
  return lg; <br />
  }</p>
<p class="Code">/** <br />
  * de String vers float <br />
  */ <br />
  public static float strToFloat(String s) <br />
  { <br />
  float f = Float.valueOf(s.trim()).floatValue(); <br />
  return f; <br />
  }</p>
<h1>Comment les utiliser</h1>
<p>J'ai un champ de texte, un JTextField, dans lequel l'utilisateur entre une valeur num&eacute;rique. Je veux r&eacute;cup&eacute;rer cette valeur, lui ajouter 3, par exemple, et l'afficher dans un composant JLabel. Mon JTextField s'appelle textField, et mon JLabel, label. Voici le code que je dois &eacute;crire:</p>
<p class="Code">int monNombre;<br />
  monNombre = srtToInt(textField.getText());<br />
  monNombre = monNombre + 3;<br />
  label.setText(intToStr(monNombre);<br />
  Code r&eacute;duit:<br />
  label.setText(intToStr(strToInt(textField.getText()) + 3));</p>
<p>Tutoriel distribu&eacute; pour le FAQ Java de Java-France www.java-france.com / www.jgflsoft.com<br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG. <br />
  Ecrit &agrave; Montpellier le 27 avril 2001</p>
