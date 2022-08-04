---
layout: post
status: publish
published: true
title: Comment travailler avec des archives compressées au format ZIP en Java ?

  
  



wordpress_id: 65
wordpress_url: http://blog.gfblog.com/index.php/2001/04/13/comment-travailler-avec-des-archives-compressees-au-format-zip-en-java/
date: '2001-04-13 12:06:39 +0200'
date_gmt: '2001-04-13 10:06:39 +0200'
categories:
- Java
tags:
- programmation
- java
permalink:  /2001/04/13/comment-travailler-avec-des-archives-compressees-au-format-zip-en-java/
---
<p>Comment travailler avec des archives compress&eacute;es au format ZIP en Java ?</p>
<p>Ce HowTo a pour but de vous expliquer comment cr&eacute;er des archives de fichiers compress&eacute;es au format ZIP et comment ensuite les ouvrir et extraire les fichiers contenus &agrave; l'int&eacute;rieur. Ce n'est en aucun cas un cours th&eacute;orique sur la compression de donn&eacute;es en Java, il s'agit juste d'un tutoriel. De plus, vous devrez utiliser la documentation de Sun si vous d&eacute;sirez en savoir plus sur, par exemple, la mani&egrave;re d'afficher le nom de tous les fichiers d'une archive. Le cas &eacute;ch&eacute;ant, &eacute;crivez moi &agrave; narcanes@online.fr.</p>
<p>Nous allons dans un premier temps d&eacute;finir une archive ZIP:  </p>
<table width="100%" border="0">
<tr>
<td width="41%">Extension par d&eacute;faut du fichier</td>
<td width="59%">.ZIP</td>
</tr>
<tr>
<td width="41%">Programmes pour les lire sous Windows</td>
<td width="59%"><a href="www.winzip.com" target="_new">Winzip</a>, Pkzip, </p>
<p>        Norton Unzip...</td>
</tr>
<tr>
<td width="41%">Rassemble dans un fichier plusieurs autres fichiers</td>
<td width="59%">Oui</td>
</tr>
<tr>
<td width="41%">Rassemble des fichiers en les compressant (r&eacute;duisant </p>
<p>        leur taille)</td>
<td width="59%">Oui</td>
</tr>
<tr>
<td width="41%">On peut choisir le taux de compression</td>
<td width="59%">Oui de 0 &agrave; 9</td>
</tr>
<tr>
<td width="41%">Contient un fichier META (description de l'archive)</td>
<td width="59%">Non</td>
</tr>
<tr>
<td width="41%">On peut lire une archive ZIP sous plusieurs OS</td>
<td width="59%">Oui: Windows 3.1/95/98/Me/Nt/2000, Linux (toutes distributions), </p>
<p>        Sparc Solaris, MacOs, BeOs, Os2/Warp, etc...</td>
</tr>
<tr>
<td width="41%" height="26">On peut joindre des commentaires &agrave; l'archive</td>
<td width="59%" height="26">Oui</td>
</tr>
</table>
<p>Ce tutoriel comprendra 2 parties: pour commencer comment cr&eacute;er une archive ZIP, ensuite, comment en lire une et extraire ses fichiers.</p>
<h1>Comment cr&eacute;er une archive ZIP en Java ?</h1>
<p class="Code">// Cr&eacute;er des flux d'entr&eacute;e de donn&eacute;es, en indiquant comme param&egrave;tre le fichier &agrave; compresser.<br />
  FileInputStream fin1 = new FileInputStream(&quot;monPremierFichier.txt&quot;);<br />
  FileInputStream fin2 = new FileInputStream(&quot;monSecondFichier.xls&quot;);<br />
  FileInputStream fin3 = new FileInputStream(&quot;monTroisiemeFichier.doc&quot;);</p>
<p class="Code">// Cr&eacute;er un flux de sortie pour le fichier ZIP final. <br />
  FileOutputStream fout = new FileOutputStream(&quot;monFichier.zip&quot;); </p>
<p class="Code">// Mettre le flux en m&eacute;moire tampon (buffered), et le d&eacute;finir comme flux de compression ZIP<br />
  BufferedOutputStream bout = new BufferedOutputStream(fout); <br />
  ZipOutputStream zout = new ZipOutputStream(bout);</p>
<p class="Code">// D&eacute;finir le taux de compression de l'archive, de 0 &agrave; 9 (Optionnel)<br />
  zout.setLevel(6);</p>
<p class="Code">// Associer un commentaire &agrave; l'archive (Optionnel)<br />
  zout.setComment(&quot;Ceci est un commentaire&quot;);</p>
<p class="Code">// Les fichiers ZIP sont des archives, elles stockent donc plusieurs fichiers, chaque fichier est contenu dans une &quot;entr&eacute;e&quot;, nous devons donc cr&eacute;er une nouvelle<br />
  // entr&eacute;e pour chaque nouveau fichier de l'archive: (on pourra aussi utiliser ze1.getName() pour r&eacute;cup&eacute;rer le nom de l'entr&eacute;e, ceci est tr&egrave;s utilse si vous voulez <br />
  // programmer un outil du type WinZip qui affiche la liste des fichiers d'une archive.) <br />
  ZipEntry ze1 = new ZipEntry(&quot;monPremierFichier.txt&quot;); <br />
  ZipEntry ze2 = new ZipEntry(&quot;monSecondFichier.xls&quot;); <br />
  ZipEntry ze3 = new ZipEntry(&quot;monTroisiemeFichier.doc&quot;); <br />
  zout.putNextEntry(ze1); <br />
  zout.putNextEntry(ze2); <br />
  zout.putNextEntry(ze3);</p>
<p class="Code">// Nous devons ensuite copier le flux d'entr&eacute;e de fichier dans le flux de sortie compress&eacute;. Le code ci-dessous n'est pas comment&eacute;, ce n'est pas l'objet de ce tutoriel:<br />
  try <br />
  { <br />
  synchronized (fin) <br />
  {<br />
  synchronized (zout) <br />
  { <br />
  byte[] buffer = new byte[256];<br />
  while (true) <br />
  { <br />
  int bytesRead = in.read(buffer); <br />
  if (bytesRead == -1) break;<br />
  out.write(buffer, 0, bytesRead);<br />
  }<br />
  }<br />
  } }catch(Exception err) {;}</p>
<p class="Code">// Une fois les flux copi&eacute;s nous devons fermer l'entr&eacute;e<br />
  zout.closeEntry();</p>
<p class="Code">// Puis fermer les flux...<br />
  fin.close(); <br />
  zout.close();</p>
<h1>Comment d&eacute;compresser les fichiers contenus dans une archive ZIP ?</h1>
<p class="Code">// Cr&eacute;er un flux d'entr&eacute;e contenant l'archive ZIP &agrave; d&eacute;compresser<br />
  FileInputStream fin = new FileInputStream(&quot;monFichier.zip&quot;);</p>
<p class="Code">// Mettre ce flux en m&eacute;moire tampon<br />
  BufferedInputStream bis = new BufferedInputStream(fin);</p>
<p class="Code">// Identifier le flux tampon comme flux de compression ZIP<br />
  ZipInputStream zin = new ZipInputStream(bis);</p>
<p class="Code">// D&eacute;finir un objet ZipEntry<br />
  ZipEntry ze = null;</p>
<p class="Code">// Tant que cet objet est diff&eacute;rent de nul (tant qu'il y a des fichiers dans l'archive)...<br />
  while ((ze = zin.getNextEntry()) != null) {</p>
<p class="Code">// ... ex&eacute;cuter le code suivant:<br />
  // Cr&eacute;er un flux de sortie pour le fichier de l'entr&eacute;e courante<br />
  FileOutputStream fout = new FileOutputStream(ze.getName());<br />
  // Copier les flux:<br />
  try <br />
  { <br />
  synchronized (zin) <br />
  {<br />
  synchronized (fout) <br />
  { <br />
  byte[] buffer = new byte[256];<br />
  while (true) <br />
  { <br />
  int bytesRead = in.read(buffer); <br />
  if (bytesRead == -1) break;<br />
  out.write(buffer, 0, bytesRead);<br />
  }<br />
  }<br />
  } }catch(Exception err) {;}</p>
<p class="Code">// Fermer l'entr&eacute;e et le flux de sortie <br />
  zin.closeEntry();<br />
  fout.close();</p>
<p class="Code">// Terminer l'instruction while:<br />
  }</p>
<p class="Code">// Fermer le flux d'entr&eacute;e<br />
  zin.close();</p>
<p>Tutoriel distribu&eacute; pour le FAQ Java de Java-France www.java-france.com / www.jgflsoft.com<br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG. <br />
  Ecrit &agrave; Montpellier le 23 avril 2001</p>
