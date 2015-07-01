---
layout: post
status: publish
published: true
title: Ouvrir et enregistrer du texte en Java
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 71
wordpress_url: http://blog.gfblog.com/index.php/2001/09/30/comment-enregistrer-dans-un-fichier-le-contenu/
date: '2001-09-30 12:35:10 +0200'
date_gmt: '2001-09-30 10:35:10 +0200'
categories:
- Java
tags:
- programmation
- Java
permalink:  /2001/09/30/comment-enregistrer-dans-un-fichier-le-contenu/
---
<h1>Enregistrer...</h1>
<p align="left">Vous pouvez remplacer &quot;TextArea&quot; par &quot;composant<br />
    texte&quot; dans le titre de ce tutoriel, car le code ci-dessous fonctionne<br />
    avec tous les composants texte: TextArea, JTextArea, JTextPane, JEditorPane.<br />
    (Avec TextArea le titre est plus parlant) </p>
<p align="left">Le but de cet article est de montrer comment r&eacute;cup&eacute;rer<br />
    le contenu d'un composant texte pour l'enregistrer dans un fichier, avec ou<br />
    sans JFileChooser pour choisir le nom du fichier de sortie.</p>
<p align="left">Le code d'enregistrement est extr&egrave;mement simple:</p>
<p align="left"><font color="#006600"><i>// A ins&eacute;rer dans un bloc try...catch</i></font><i><font color="#0000FF"><br />
    try</font><br />
    { FileWriter lu = <font color="#0000FF">new</font> FileWriter(monFichier);<font color="#006600"><br />
    // Cr&eacute;er un objet java.io.FileWriter avec comme argument le mon du<br />
    fichier dans lequel enregsitrer</font><br />
    &nbsp;&nbsp;&nbsp;BufferedWriter out = <font color="#0000FF">new</font> BufferedWriter(lu);<font color="#006600"><br />
    // Mettre le flux en tampon (en cache)</font><br />
    &nbsp;&nbsp;&nbsp;out.write(textArea.getText()); <font color="#006600">//<br />
    Balancer dans le flux le contenu de la zone de texte</font><br />
    &nbsp;&nbsp;&nbsp;out.close(); <font color="#006600">// Fermer le flux (c'est<br />
    toujours mieux de le fermer explicitement)</font><br />
    &nbsp;} <font color="#0000FF">catch</font> (IOException er) {;}</i></p>
<p align="left">On suppose que l'on a:<br />
    - un String du nom de &quot;monFichier&quot; indiquant le nom du fichier dans<br />
    lequel enregistrer le texte<br />
    ex: <i>String monFichier = <font color="#FF0000">&quot;monFichier.txt&quot;</font>;</i><br />
    - Un composant de texte du nom de textArea<br />
    ex: <i>JTextArea textArea = <font color="#0000FF">new</font> JTextArea();</i></p>
<p align="left">Le code est complet et fonctionel ! On peut l'ins&eacute;rer<br />
    dans une m&eacute;thode ou directement dans un gestionnaire d'&eacute;v&egrave;nements<br />
    !</p>
<p align="left">Mais une fonction souvent n&eacute;cessaire suppl&eacute;mentaire<br />
    est d'ajouter un JFileChooser en amont pour que l'utilisateur puisse sp&eacute;cifier<br />
    lui m&ecirc;me le nom du fichier, sans que nous ayons &agrave; le lui imposer,<br />
    comme ici...</p>
<p align="left">Voici donc la proc&eacute;dure:</p>
<p align="left"><font color="#000000"></font><font color="#0000FF"><i>try</i></font><i><br />
    { JFileChooser filechoose = <font color="#0000FF">new</font> JFileChooser();<br />
    <font color="#006600">// Cr&eacute;er un JFileChooser</font><br />
    &nbsp;&nbsp;&nbsp;filechoose.setCurrentDirectory(<font color="#0000FF">new</font><br />
    File(<font color="#FF0000">"."</font>)); <font color="#006600">// Le r&eacute;pertoire<br />
    source du JFileChooser est le r&eacute;pertoire d'o&ugrave; est lanc&eacute;<br />
    notre programme</font><br />
    &nbsp;&nbsp;&nbsp;String approve = <font color="#0000FF">new</font> String(<font color="#FF0000">"ENREGISTRER"</font>);<br />
    <font color="#006600">// Le bouton pour valider l'enregistrement portera la<br />
    mention ENREGSITRER</font><br />
    &nbsp;&nbsp;&nbsp;<font color="#0000FF">int</font> resultatEnregistrer = filechoose.showDialog(filechoose,<br />
    approve); <font color="#006600">// Pour afficher le JFileChooser...</font><br />
    &nbsp;&nbsp;<font color="#0000FF">&nbsp;if</font> (resultatEnregistrer ==<br />
    JFileChooser.APPROVE_OPTION) <font color="#006600">// Si l'utilisateur clique<br />
    sur le bouton ENREGSITRER</font><br />
    &nbsp;&nbsp;&nbsp;{ String monFichier= <font color="#0000FF">new</font> String(filechoose.getSelectedFile().toString());<font color="#006600"><br />
    // R&eacute;cup&eacute;rer le nom du fichier qu'il a sp&eacute;cifi&eacute;</font><br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="#0000FF">&nbsp;if</font>(monFichier.endsWith(<font color="#FF0000">".txt"</font>)<br />
    || monFichier.endsWith(<font color="#FF0000">".TXT"</font>)) {;}<font color="#006600"><br />
    // Si ce nom de fichier finit par .txt ou .TXT, ne rien faire et passer &agrave;<br />
    a suite</font><br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;else (monFichier = monFichier+ <font color="#FF0000">".txt"</font>);<font color="#006600"><br />
    // Sinon renommer le fichier pour qu'il porte l'extension .txt</font><br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{<font color="#006600"> <b>// INSERER<br />
    ICI LE CODE EXPLIQUE CI-DESSUS POUR ENREGISTRER LE FICHIER</b></font><br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;} <br />
    &nbsp;&nbsp;&nbsp;}<br />
    } <font color="#0000FF">catch</font> (IOException er) {;}</i></p>
<p align="left"><font color="#000000">Et voil&agrave;, on a un beau petit JFileChooser<br />
    qui nous demande de taper le nom du fichier que l'on veut enregsitrer !</font></p>
<hr align="Left" width="100%" size="2"/>
  </p>
<h1>Ouvrir...</h1>
<p align="left">Vous pouvez remplacer &quot;TextArea&quot; par &quot;composant<br />
    texte&quot; dans le titre de ce tutoriel, car le code ci-dessous fonctionne<br />
    avec tous les composants texte: TextArea, JTextArea, JTextPane, JEditorPane.<br />
    (Avec TextArea le titre est plus parlant) </p>
<p align="left">Ce tutoriel explique comment ouvrir le contenu d'un fichier<br />
    dans un JTextArea, avec ou sans JFileChooser.</p>
<p align="left">Le code d'ouverture est tr&egrave;s simple:</p>
<p align="left"><i><font color="#0000FF">try</font><br />
    { FileInputStream fis = <font color="#0000FF">new</font> FileInputStream(monFichier);<font color="#006600"><br />
    // Cr&eacute;er un flux d'entr&eacute;e avec comme param&egrave;tre le nom<br />
    du fichier &agrave; ouvrir</font><br />
    &nbsp;&nbsp;<font color="#0000FF">&nbsp;int</font> n; <br />
    &nbsp;&nbsp;&nbsp;<font color="#0000FF">while</font> ((n = fis.available())<br />
    > 0) <font color="#006600">// tant qu'il y a des donn&eacute;es dans le flux...</font><br />
    &nbsp;&nbsp;&nbsp;{ <font color="#0000FF">byte</font>[] b = <font color="#0000FF">new</font><br />
    <font color="#0000FF">byte</font>[n]; <font color="#006600">// r&eacute;cup&eacute;rer<br />
    le byte &agrave; l'endroit n et le stocker dans un tableau de bytes</font><br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="#0000FF">int</font> result<br />
    = fis.read(b); <font color="#006600">// lire ce tableau de byte &agrave; l'endroit<br />
    d&eacute;sir&eacute;</font><br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font color="#0000FF">&nbsp;if</font> (result<br />
    == -1) <font color="#0000FF">break</font>;<font color="#006600"> // si le<br />
    byte est -1, c'est que le flux est arriv&eacute; &agrave; sa fin (par d&eacute;finition)</font><br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;String s = <font color="#0000FF">new </font>String(b);<br />
    <font color="#006600"> // assembler les bytes pour former une cha&icirc;ne</font><br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;textArea.setText(s); <font color="#006600">//<br />
    ins&eacute;rer cette cha&icirc;ne dans notre composant de texte</font><br />
    &nbsp;&nbsp;&nbsp;}<br />
    } <font color="#0000FF">catch</font> (Exception err) {;}</i></p>
<p align="left">Ceci suppose que l'on a cr&eacute;&eacute; <br />
    - un String du nom de nonFichier pointant vers le fichier &agrave; ouvrir.<br />
    <i>String monFichier = <font color="#FF0000">&quot;C:\Mes Documents\le_beau_ficher.txt&quot;</font>;<br />
    </i>- un composant de texte dans lequel afficher le texte:<i><br />
    JTextArea textArea = <font color="#0000FF">new</font> JTextArea();</i></p>
<p align="left">&nbsp;</p>
<p align="left">Le code est complet et fonctionel ! On peut l'ins&eacute;rer<br />
    dans une m&eacute;thode ou directement dans un gestionnaire d'&eacute;v&egrave;nements<br />
    !</p>
<p align="left">Mais une fonction souvent n&eacute;cessaire suppl&eacute;mentaire<br />
    est d'ajouter un JFileChooser en amont pour que l'utilisateur puisse sp&eacute;cifier<br />
    lui m&ecirc;me le nom du fichier, sans que nous ayons &agrave; le lui imposer,<br />
    comme ici...</p>
<p align="left">Voici donc la proc&eacute;dure:</p>
<p align="left"> <i><font color="#0000FF">try</font><br />
    { JFileChooser filechoose = <font color="#0000FF">new</font> JFileChooser();<br />
    <font color="#000000"><i><font color="#006600">// Cr&eacute;er un JFileChooser</font></i></font><br />
    &nbsp;&nbsp;&nbsp;filechoose.setCurrentDirectory(new File(<font color="#FF0000">"."</font>));<br />
    <font color="#000000"><i> <font color="#006600">// Le r&eacute;pertoire source<br />
    du JFileChooser est le r&eacute;pertoire d'o&ugrave; est lanc&eacute; notre<br />
    programme</font></i></font><br />
    &nbsp;&nbsp;&nbsp;String approve = new String(<font color="#FF0000">"OUVRIR"</font>);<br />
    <font color="#000000"><i><font color="#006600">// Le bouton pour valider l'enregistrement<br />
    portera la mention OUVRIR</font></i></font><br />
    &nbsp;&nbsp;&nbsp;String monFichier= <font color="#0000FF">null</font>; <font color="#006600">//<br />
    On ne sait pas pour l'instant quel sera le fichier &agrave; ouvrir</font><br />
    <font color="#0000FF">&nbsp;&nbsp;&nbsp;int</font> resultatOuvrir = filechoose.showDialog(filechoose,<br />
    approve); <font color="#000000"><i> <font color="#006600">// Pour afficher<br />
    le JFileChooser...</font></i></font><br />
    &nbsp;&nbsp;<font color="#0000FF">&nbsp;if</font>(resultatOuvrir == filechoose.APPROVE_OPTION)<br />
    <font color="#000000"><i><font color="#006600">// Si l'utilisateur clique<br />
    sur le bouton OUVRIR</font></i></font><br />
    &nbsp;&nbsp;&nbsp;{ </i><font color="#000000">&nbsp;&nbsp;<i>monFichier =<br />
    filechoose.getSelectedFile().toString();</i></font><i><font color="#000000"></font><font color="#006600"><b><br />
    </b></font><font color="#000000"><i><font color="#006600">// R&eacute;cup&eacute;rer<br />
    le nom du fichier qu'il a sp&eacute;cifi&eacute;</font></i></font><font color="#006600"><b><br />
    <br />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; // INSERER ICI LE CODE EXPLIQUE CI-DESSUS<br />
    POUR OUVRIR LE FICHIER</b></font><br />
    &nbsp;&nbsp;&nbsp;}<br />
    }<font color="#0000FF">catch</font> (IOException er) {;}</i></p>
<p align="left">&nbsp;</p>
<p align="left"><font color="#000000">Et voil&agrave;, on a un beau petit JFileChooser<br />
    qui nous demande de s&eacute;lectionner le fichier &agrave; ouvrir !</font></p>
<p>  Tutoriel distribu&eacute; pour le FAQ Java de Java-France <a href="http://www.java-france.com" target="_new">www.java-france.com</a><br />
  <a href="http://www.jgflsoft.com"> / www.jgflsoft.com</a><br />
  Réédité pour Valhalla GFBLOG.<br />
  Ecrit &agrave; Montpellier le 30 septembre 2001</p>
