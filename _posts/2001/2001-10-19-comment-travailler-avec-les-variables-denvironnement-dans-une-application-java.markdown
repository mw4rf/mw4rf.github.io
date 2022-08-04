---
layout: post
status: publish
published: true
title: Comment travailler avec les variables d'environnement dans une application
  Java ?

  
  



wordpress_id: 57
wordpress_url: http://blog.gfblog.com/index.php/2001/10/19/comment-travailler-avec-les-variables-denvironnement-dans-une-application-java/
date: '2001-10-19 01:14:34 +0200'
date_gmt: '2001-10-18 23:14:34 +0200'
categories:
- Java
tags:
- programmation
- java
permalink:  /2001/10/19/comment-travailler-avec-les-variables-denvironnement-dans-une-application-java/
---

<p>Les variables d'environnement sont des cha&icirc;nes des texte donnant des informations utiles &agrave; l'ex&eacute;cution d'un programme Java. <br />
  Il faut faire attention car certaines variables d'environnement ne sont pas portables: par exemple les syst&egrave;mes Applet/Mac n'ont pas de varibales d'environnement, et les syst&egrave;mes DOS (Windows) utilisent un syst&egrave;me de variables d'environnement diff&eacute;rent de celui utilis&eacute; sur les syst&egrave;mes UNIX.</p>
<p>Nous allons distinguer dans cet article 3 types de variables diff&eacute;rents: celles que l'on peut sp&eacute;cifier &agrave; l'ex&eacute;cution d'un programme Java, en ajoutant des options &agrave; la commende &quot;java maClasse&quot; (portables sur tous les syst&egrave;mes d'exploitation); celles que l'on peut d&eacute;finir avant l'ex&eacute;cution d'un programme, une bonne fois pour toutes, comme le c&eacute;l&eacute;brissime CLASSPATH (ce sont ces variables d'enviromment qui posent probl&egrave;me selon l'OS sous lequel est ex&eacute;cut&eacute; notre application Java); et, pour finir, les variables syst&egrave;me, d&eacute;finies par la sp&eacute;cification Java, non modifiables, qui renseignent sur la JVM utilis&eacute;e, et qui sont ind&eacute;pendantes de l'OS sous lequel tourne notre programme.</p>
<h1>1) Premier type</h1>
<p>Lors du travail avec les Properties, java.util.Properties, on utilise un fichier de propri&eacute;t&eacute;s. On peut par exemple cr&eacute;er 3 fichiers de propri&eacute;t&eacute;s qui renfermeront les valeurs en cha&icirc;nes dures des textes d'une interface graphique.<br />
  On aura donc par exemple:</p>
<p class="Code"># Premier fichier: pour une enterface en fran&ccedil;ais<br />
  # Ce fichier s'appelle francais.properties<br />
  monBouton1 = &quot;OK&quot;<br />
  monBouton2 = &quot;Annuler&quot;<br />
  # Second fichier: pour la m&ecirc;me application, avec l'interface traduite en anglais<br />
  # Ce fichier s'appelle anglais.properties<br />
  monBouton1 = &quot;OK&quot;<br />
  monBouton2 = &quot;Cancel&quot;<br />
  # Troisi&egrave;me fichier: pour la m&ecirc;me application, avec l'interface traduite en martien (langue des petits hommes verts)<br />
  # Ce fichier s'appelle martien.properties<br />
  monBouton1 = &quot;GlupGlup&quot;<br />
monBouton2 = &quot;Gniorf&quot;</p>
<p>On a ainsi 3 fichiers qui contiennent le label de tous les &eacute;l&eacute;ments de notre interface graphique. On va lancer notre programme en lui indiquant que l'on veut utiliser l'un ou l'autre des fichiers... selon si notre utilisateur est fran&ccedil;ais, am&eacute;rician, ou martien !</p>
<p class="Code">java -Dlangue=martien.properties MaClasse</p>
<p>
  On utilise une variable que l'on appelle &quot;langue&quot; dans laquelle sera stock&eacute;e le nom du fichier de propri&eacute;t&eacute;s &agrave; charger.<br />
  Il ne nous reste plus qu'&agrave; charger ce fichier dans notre programme Java.</p>
<p class="Code">
  String env = System.getProperty(&quot;langue&quot;);</p>
<p>Alors, quelle langue parlera notre application ? Vous dites le martien ? C'est &ccedil;a !<br />
  Notre variable &quot;langue&quot; contient le nom du fichier de propri&eacute;t&eacute;s &agrave; charger, nous allons donc le charger:</p>
<p>
  <span class="Code">Properties envVars = new Properties();<br />
  envVars.load(env);</span></p>
<p>NOTE: on a travaill&eacute; avec les propri&eacute;t&eacute;s, ce qui a un peu compliqu&eacute; les choses, mais c'&eacute;tait pour donner un exemple pratique, on aurait aussi bien pu, par exemple, indiquer une image &agrave; charger:</p>
<p>
  <span class="Code">java -Dimage=monLogo.gif MaClasse<br />
  ImageIcon img = new ImageIcon(System.getProperty(&quot;image&quot;));</span></p>
<p>Il est tr&egrave;s important dans tous les cas de ne pas laisser d'espace entre le -D et le nom de la variable et des deu c&ocirc;t&eacute;s du =.</p>
<h1>2) Second type</h1>
<p>Si vous avec compris le premier type, vous avec compris le second, car c'est une variation du premier...</p>
<p>On d&eacute;finit une variable, par exemple:</p>
<p># Sous DOS (Windows), on ajoute cette ligne &agrave; l'autoexec.bat<br />
  MON_CHEMIN_PERSO=&quot;C:\Mes Documents\Mes Images\&quot;<br />
  # Sous UNIX<br />
  export MON_CHEMIN_PERSO=/home/moi/mes_images/:$MON_CHEMIN_PERSO</p>
<p>Et au lancement de notre programme Java, on &eacute;crira:</p>
<p># Windows<br />
  java MaClasse %MON_CHEMIN_PERSO%<br />
  # UNIX<br />
  java MaClasse $MON_CHEMIN_PESO</p>
<p>La proc&eacute;dure pour r&eacute;cup&eacute;rer la variable dans le programme, on la lit dans la m&eacute;thode main() comme argument[0].<br />
  Personnellement je n'aime pas cette methode, mais elle existe...</p>
<h1>3) Troisi&egrave;me type</h1>
<p>Comme expliqu&eacute; plus haut, le troisi&egrave;me type est totalement diff&eacute;rent: vous ne pouvez pas modifier les variables d'environnement ce de type, elles sont internes au langage Java et servent &agrave; fournir des informations sur la JVM h&ocirc;te.</p>
<p>La syntaxe pour r&eacute;cup&eacute;rer ce genre de propri&eacute;t&eacute;s est la suivante:</p>
<p class="Code">String propriete = java.lang.System.getProperty(String prop);<br />
  Exemple:<br />
  final String USER_HOME = System.getProperty(&quot;user.home&quot;);</p>
<p>Voici un tableau des diff&eacute;rentes propri&eacute;t&eacute;s auxquelles l'on peut avoir acc&egrave;s:<br />
Sur fond bleu clair les plus utilis&eacute;es.</p>
<table cellpadding="2" cellspacing="2" border="0" width="60%">
<tbody>
<tr>
<td valign="Top" bgcolor="#000099"><font color="#ffffff"><br />
Valeur</font><font color="#ffffff"><br />
                            </font></td>
<td valign="Top" bgcolor="#000099"><font color="#ffffff"><br />
Signification</font><font color="#ffffff"><br />
                            </font></td>
</tr>
<tr>
<td valign="Top" bgcolor="#ccccff">
<pre>java.version</pre>
</td>
<td valign="Top" bgcolor="#ccccff">Version du<br />
JRE
                            </td>
</tr>
<tr>
<td valign="Top">
<pre>java.vendor</pre>
</td>
<td valign="Top">"Vendor" du JRE
                            </td>
</tr>
<tr>
<td valign="Top">
<pre>java.vendor.url</pre>
</td>
<td valign="Top">URL du "Vendor"
                            </td>
</tr>
<tr>
<td valign="Top">
<pre>java.vm.specification.version</pre>
</td>
<td valign="Top">JVM version de specification
                            </td>
</tr>
<tr>
<td valign="Top">
<pre>java.vm.specification.vendor</pre>
</td>
<td valign="Top">JVM "vendor" de specification
                            </td>
</tr>
<tr>
<td valign="Top">
<pre>java.vm.specification.name</pre>
</td>
<td valign="Top">JVM nom de specification
                            </td>
</tr>
<tr>
<td valign="Top">
<pre>java.vm.version</pre>
</td>
<td valign="Top">JVM version d'impl&eacute;mentation
                            </td>
</tr>
<tr>
<td valign="Top">
<pre>java.vm.vendor</pre>
</td>
<td valign="Top">JVM "vendor" d'impl&eacute;mentation
                            </td>
</tr>
<tr>
<td valign="Top">
<pre>java.vm.name</pre>
</td>
<td valign="Top">JVM nom d'impl&eacute;mentation
                            </td>
</tr>
<tr>
<td valign="Top" bgcolor="#ccccff">
<pre>java.home</pre>
</td>
<td valign="Top" bgcolor="#ccccff">R&eacute;pertoire<br />
de java.exe
                            </td>
</tr>
<tr>
<td valign="Top">
<pre>java.specification.version</pre>
</td>
<td valign="Top">JRE version de specification
                            </td>
</tr>
<tr>
<td valign="Top">
<pre>java.specification.vendor</pre>
</td>
<td valign="Top">JRE "vendor" de specification
                            </td>
</tr>
<tr>
<td valign="Top">
<pre>java.specification.name</pre>
</td>
<td valign="Top">JRE nom de specification
                            </td>
</tr>
<tr>
<td valign="Top" bgcolor="#ccccff">
<pre>java.class.version</pre>
</td>
<td valign="Top" bgcolor="#ccccff">Num&eacute;ro<br />
de version de Java
                            </td>
</tr>
<tr>
<td valign="Top" bgcolor="#ccccff">
<pre>java.class.path</pre>
</td>
<td valign="Top" bgcolor="#ccccff">Le CLASSPATH
                            </td>
</tr>
<tr>
<td valign="Top" bgcolor="#ccccff">
<pre>java.ext.dirs</pre>
</td>
<td valign="Top" bgcolor="#ccccff">R&eacute;pertoire<br />
des extensions
                            </td>
</tr>
<tr>
<td valign="Top" bgcolor="#ccccff">
<pre>os.name</pre>
</td>
<td valign="Top" bgcolor="#ccccff">Nom du syst&egrave;me<br />
d'exploitation
                            </td>
</tr>
<tr>
<td valign="Top">
<pre>os.arch</pre>
</td>
<td valign="Top">Nom de l'architechture de l'OS
                            </td>
</tr>
<tr>
<td valign="Top">
<pre>os.version</pre>
</td>
<td valign="Top">Num&eacute;ro de version de<br />
l'OS
                            </td>
</tr>
<tr>
<td valign="Top" bgcolor="#ccccff">
<pre>file.separator</pre>
</td>
<td valign="Top" bgcolor="#ccccff">S&eacute;rarateur<br />
de fichiers (1)
                            </td>
</tr>
<tr>
<td valign="Top" bgcolor="#ccccff">
<pre>line.separator</pre>
</td>
<td valign="Top" bgcolor="#ccccff">S&eacute;parateur<br />
de lignes (2)
                            </td>
</tr>
<tr>
<td valign="Top">
<pre>path.separator</pre>
</td>
<td valign="Top">S&eacute;parateur de chemins<br />
(3)
                            </td>
</tr>
<tr>
<td valign="Top">
<pre>user.name</pre>
</td>
<td valign="Top">Nom du compte utilisateur
                            </td>
</tr>
<tr>
<td valign="Top" bgcolor="#ccccff">
<pre>user.home</pre>
</td>
<td valign="Top" bgcolor="#ccccff">R&eacute;pertoire<br />
par d&eacute;faut de l'utilisateur
                            </td>
</tr>
<tr>
<td valign="Top" bgcolor="#ccccff">
<pre>user.dir</pre>
</td>
<td valign="Top" bgcolor="#ccccff">R&eacute;pertoire<br />
o&ugrave; se trouve la classe principale
                            </td>
</tr>
<tr>
<td valign="Top">
                            </td>
<td valign="Top">(1) <br />
"/" sous UNIX <br />
"\" sous Windows</p>
<p>(2)<br />
"\n" sous UNIX<br />
"\r" sous Mac<br />
"\n\r" sous Windows</p>
<p>(3)<br />
":" sous Unix
                            </td>
</tr>
</tbody>
</table>
<p>Tutoriel distribu&eacute; pour le FAQ Java de Java-France www.java-france.com / www.jgflsoft.com <br />
  R&eacute;&eacute;dit&eacute; sur Valhalla GFBLOG. <br />
  Ecrit &agrave; Montpellier le 19 octobre 2001.</p>
