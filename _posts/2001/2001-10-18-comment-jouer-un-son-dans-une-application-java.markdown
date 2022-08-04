---
layout: post
status: publish
published: true
title: Comment jouer un son dans une application Java ?

  
  



wordpress_id: 68
wordpress_url: http://blog.gfblog.com/index.php/2001/10/18/comment-jouer-un-son-dans-une-application-java/
date: '2001-10-18 12:17:50 +0200'
date_gmt: '2001-10-18 10:17:50 +0200'
categories:
- Java
tags:
- programmation
- java
permalink:  /2001/10/18/comment-jouer-un-son-dans-une-application-java/
---
<p>Le multim&eacute;dia est devenu un probl&egrave;me majeur dans le d&eacute;veloppement de logiciels. En effet, un programme dot&eacute; d'une belle interface, avec des boutons anim&eacute;s, qui font du bruits en r&eacute;ponse aux actions de l'utilisateur, etc..., est devenu un atout pour s&eacute;duire le gran public. M&ecirc;me si votre logiciel est tr&egrave;s puissant, le meilleur dans son domaine, beaucoup (toujours trop) d'utilisateurs lui pr&eacute;f&egrave;reront un concurrent si tant est que celui-ci soit plus beau et plus convivial. L'interface graphique n'est donc pas &agrave; n&eacute;gliger, loin de l&agrave; !</p>
<p>Je vous propose donc un petit tutoriel expliquant comment jouer des sons dans un programme Java. Ce tutoriel est cependant particulier: il concerne Java 1.1 en plus ancien, mais il est int&eacute;ressant tout de m&ecirc;me ! Je m'explique: il n'&eacute;tait pas possible &agrave; l'&eacute;poque de jouer un son autre part que dans des applets sans utiliser de classes non document&eacute;es et tr&egrave;s peu connues. Ce sont ces classes bien pratiques qui sont utilis&eacute;es ici. <br />
  Vous pouvez utiliser cette technique dans vos programmes Java 2 (SDK 1.2, 1.3 &amp; 1.4) si vous ne voulez par avoir recours aux nouvelles techniques.<br />
  Les classes non document&eacute;es font partie du paquetage sun.audio .</p>
<p>On notera cependant une forte restriction: n'essayez pas de jouer un fichier de 3 GO contentenant l'integrale de la 9&egrave;me symphonie de Beethoven, en qualit&eacute; CD... cela ne fonctionnera pas avec cette m&eacute;thode. Le format utilis&eacute; en Java par d&eacute;faut est le format AU, plut&ocirc;t destin&eacute; &agrave; faire un &quot;ping&quot;, &quot;plouf&quot;, ou &quot;plaf&quot; lorsque l'utilisateur clique sur un bouton qu'&agrave; jouer un morceau de classique...</p>
<p>Passons donc au code comment&eacute;:</p>
<ol>
<li /><span class="Code">import sun.audio.*;</span>
<li /><span class="Code">  // Le fichier &quot;xxx.au&quot; &agrave; ouvrir</span>
<li /><span class="Code">  File fichier = null;</span>
<li /><span class="Code">  // les donn&eacute;es audio...</span>
<li /><span class="Code">  AudioData donnees = null;</span>
<li /><span class="Code">  // le flux d'entr&eacute;e pour ces donn&eacute;es</span>
<li /><span class="Code">  InputStream inputStr = null;</span>
<li /><span class="Code">/*</span>
<li /><span class="Code">  * M&eacute;thode permettant d'ouvrir un fichier audio</span>
<li /><span class="Code">  */</span>
<li /><span class="Code">  public void open() {</span>
<li /><span class="Code">  // &quot;this&quot; si la classe dans laquelle se trouve la m&eacute;thode &eacute;tend de Jframe ou Frame, ce qui est le cas classique</span>
<li /><span class="Code">  FileDialog fd = new FileDialog(this, &quot;S&eacute;lectionner un fichier AU&quot;);</span>
<li /><span class="Code">  // afficher le FileChooser...</span>
<li /><span class="Code">  fd.show();</span>
<li /><span class="Code">  try {</span>
<li /><span class="Code">  // assigner &agrave; notre fichier de d&eacute;part, qui &eacute;tait &quot;null&quot; jusqu'&agrave; pr&eacute;sent, un fichier r&eacute;el</span>
<li /><span class="Code">  fichier = new File(fd.getDirectory() + &quot;/&quot; + fd.getFile());</span>
<li /><span class="Code">  // si l'assignation a bien fonctionn&eacute;, le fichier n'est plus &quot;null&quot;, donc:</span>
<li /><span class="Code">  if (fichier != null) {</span>
<li /><span class="Code">  // ouvrir notre flux d'entr&eacute;e sur ce fichier</span>
<li /><span class="Code">  FileInputStream fis = new FileInputStream(fichier);</span>
<li /><span class="Code">  // cr&eacute;er un flux d'entr&eacute;e sp&eacute;cial pour les fichiers audio</span>
<li /><span class="Code">  AudioStream as = new AudioStream(fis);</span>
<li /><span class="Code">  // et rediriger ce flux vers notre objet AudioData</span>
<li /><span class="Code">  donnees = as.getData();</span>
<li /><span class="Code">  }</span>
<li /><span class="Code">  }</span>
<li /><span class="Code">  catch (IOException e) {</span>
<li /><span class="Code">  System.err.println(e);</span>
<li /><span class="Code">  }</span>
<li /><span class="Code">  }</span>
<li /><span class="Code"> /*</span>
<li /><span class="Code">  * Cette m&eacute;thode permet de jouer le son enregistr&eacute; dans notre fichier</span>
<li /><span class="Code">  */</span>
<li /><span class="Code">  public void play() {</span>
<li /><span class="Code">  // si une lecture est d&eacute;j&agrave; en cours, l'arr&ecirc;ter</span>
<li /><span class="Code">  stop(); </span>
<li /><span class="Code">  // s'il n'y a aucun son &agrave; jouer, ouvrir un fichier</span>
<li /><span class="Code">  if (donnees == null) open();</span>
<li /><span class="Code">  // s'il y a des donn&eacute;es &agrave; jouer:</span>
<li /><span class="Code">  if (donnees != null) {</span>
<li /><span class="Code">  // Cr&eacute;er un flux de donn&eacute;es audio, lancer la lecture de ce flux, et le rediriger dans notre flux d'entr&eacute;e</span>
<li /><span class="Code">  AudioDataStream ads = new AudioDataStream(donnees);</span>
<li /><span class="Code">  // lancer la lecture:</span>
<li /><span class="Code">  AudioPlayer.player.start(ads);</span>
<li /><span class="Code">  inputStr = ads;</span>
<li /><span class="Code">  }</span>
<li /><span class="Code">  }</span>
<li /><span class="Code"> /*</span>
<li /><span class="Code">  * Arrete de jouer le son en cours</span>
<li /><span class="Code">  */</span>
<li /><span class="Code">  public void stop() {</span>
<li /><span class="Code">  if (inputStr != null) {</span>
<li /><span class="Code">  AudioPlayer.player.stop(inputStr);</span>
<li /><span class="Code">  inputStr = null;</span>
<li /><span class="Code">  }</span>
<li /><span class="Code">  }</span>
<li /><span class="Code"> /*</span>
<li /><span class="Code">  * Jouer le son de mani&egrave;re continue (facultatif)</span>
<li /><span class="Code">  */</span>
<li /><span class="Code">  public void loop() {</span>
<li /><span class="Code">  stop();</span>
<li /><span class="Code">  if (donnees == null) open();</span>
<li /><span class="Code">  if (donnees != null) {</span>
<li /><span class="Code">  // pour jouer un son de mani&egrave;re continue, on a besoin d'un flux sp&eacute;cial:</span>
<li /><span class="Code">  // le ContinuousAudiodataStream, cr&eacute;&eacute; avec notre objet AudioData comme param&egrave;tre</span>
<li /><span class="Code">  ContinuousAudioDataStream cads = new ContinuousAudioDataStream(donnees);</span>
<li /><span class="Code">  // lancer la lecture:</span>
<li /><span class="Code">  AudioPlayer.player.start(cads);</span>
<li /><span class="Code">  inputStr = cads;</span>
<li /><span class="Code">  }</span>
<li /><span class="Code">  }</span>
</ol>
<p>Ecrit par Narcanes pour l'association Java-France/Jgflsoft<br />
www.java-france.com / www.jgflsoft.com<br />
R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG. <br />
Montpellier, 18 octobre 2001.</p>
