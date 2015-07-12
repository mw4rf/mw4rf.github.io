---
layout: post
status: publish
published: true
title: Comment utiliser un filtre de fichiers dans un JFileChooser ?
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 69
wordpress_url: http://blog.gfblog.com/index.php/2001/03/17/comment-utiliser-un-filtre-de-fichiers-dans-un-jfilechooser/
date: '2001-03-17 12:28:06 +0100'
date_gmt: '2001-03-17 10:28:06 +0100'
categories:
- Java
tags:
- programmation
- java
permalink:  /2001/03/17/comment-utiliser-un-filtre-de-fichiers-dans-un-jfilechooser/
---
<p>Cet article explique comment mettre en place un filtre de fichiers dans un JFileChooser, &agrave; partir de leur extension. En effet, cette fonction n'est pas impl&eacute;ment&eacute;e de mani&egrave;re efficace par d&eacute;faut, et il nous faudra cr&eacute;er notre propre classe pour un r&eacute;sultat convenable.<br />
  Nous allons ensuite cr&eacute;er un JFileChooser et lui assigner notre FileFilter appell&eacute; FiltreExtension.</p>
<p>Voici donc le code source de la classe comment&eacute;:</p>
<p class="Code">public class FiltreExtension extends javax.swing.filechooser.FileFilter<br />
  {<br />
  // 2 cha&icirc;nes qui contiendront respectivementl'entension du fichier (de la forme &quot;jpg&quot;, &quot;txt&quot;, etc...) et la descritpion<br />
  // par exemple &quot;Fichier JPEG&quot; ou &quot;Fichier Texte Brut&quot;.<br />
  String extension;<br />
String description;</p>
<p class="Code">// Notre constructeur qui admet donc comme arguments l'extension souhait&eacute;e ainsi que la description que l'on lui associe<br />
  public FiltreExtension(String extension, String description)<br />
  {<br />
  // on n'a ainsi pas besoin (on ne doit pas) inclure le &quot;.&quot; (point) dans le libell&eacute; de l'extension<br />
  if (extension.indexOf('.') == -1)<br />
  extension = &quot;.&quot; + extension;<br />
  // on assimile les Strings du d&eacute;part (variables de classe) aux Strings fournis comme argument au constructeur (variableslocales)<br />
  this.extension = extension;<br />
  this.description = description;<br />
  }</p>
<p class="Code"> public boolean accept(File fichier)<br />
  {<br />
  // v&eacute;rifier si le le fichier finit avec l'extension que nous avons sp&eacute;cifi&eacute; dans le constructeur, et, dans ce cas &quot;accepter&quot; de l'afficher<br />
  // dans la fen&ecirc;tre du JFileChooser<br />
  if (fichier.getName().endsWith(extension))<br />
  return true;<br />
  // les r&eacute;pertoires aussi doivent &ecirc;treaffich&eacute;s dans la fen&ecirc;tre du JFileChooser<br />
  else if (fichier.isDirectory())<br />
  return true;<br />
  return false;<br />
  }</p>
<p class="Code"> public String getDescription()<br />
  {<br />
  // la description du fichier, que l'on associe &agrave; son extension, on a un affichage du type: &quot;Fichier JPEG (*.jpg)&quot;<br />
  return this.description + &quot;(*&quot; + extension + &quot;)&quot;;<br />
  }<br />
}</p>
<p> Une fois ce code &eacute;crit dans un fichier du nom de &quot;FiltreExtension.java&quot;, nous pouvons incorporer ce fichier dans nos projets Java et l'utiliser.<br />
  Pour l'utiliser nous devons cr&eacute;er un JFileChooser et lui assigner un nouveau FileFilter.<br />
  Voici la proc&eacute;dure:</p>
<p>1- Cr&eacute;ons un JFileChooser pour commencer: </p>
<p class="Code">JFileChooser jfc = new JFileChooser();</p>
<p>2 - D&eacute;finissons le r&eacute;pertoire courant ua r&eacute;pertoired'ex&eacute;cution du programme (optionnel):</p>
<p class="Code">jfc.setCurrentDirectory(new File(&quot;.&quot;));</p>
<p>3 - Assignons le FileFilter:</p>
<p class="Code">jfc.addChoosableFileFilter(new FiltreExtension(&quot;jpg&quot;, &quot;Fichier JPEG&quot;));<br />
  jfc.addChoosableFileFilter(new FiltreExtension(&quot;bmp&quot;, &quot;Fichier Bitmap&quot;));<br />
  jfc.addChoosableFileFilter(new FiltreExtension(&quot;gif&quot;, &quot;Fichier GIF&quot;));<br />
  jfc.addChoosableFileFilter(new FiltreExtension(&quot;png&quot;, &quot;Fichier PNG&quot;));</p>
<p>4 - r&eacute;cup&eacute;rer le fichier que l'utilisateur a choisi:</p>
<p class="Code">int resultat = jfc.showOpenDialog(this);<br />
  if (resultat == JFileChooser.APPROVE_OPTION)<br />
  {<br />
  // code &agrave; ex&eacute;cuter comme par exemple:<br />
  File fichier;<br />
  fichier = jfc.getSelectedFile();<br />
  // suite du code...<br />
  }</p>
<p>Et voici ce que &ccedil;a donne en action :</p>
<p><img alt="FileChooser" src="./ressources/java/old/faq/filtre_extension/filtre_extension.jpg" /></p>
<p>Tutoriel distribu&eacute; pour le FAQ Java de Java-France www.java-france.com / www.jgflsoft.com<br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG. <br />
  Ecrit &agrave; Montpellier le 17 mars 2001</p>
