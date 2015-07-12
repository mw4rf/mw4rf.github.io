---
layout: post
status: publish
published: true
title: Comment télécharger un fichier à partir d'une URL en Java ?
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 66
wordpress_url: http://blog.gfblog.com/index.php/2001/07/02/comment-telecharger-un-fichier-a-partir-dune-url-en-java/
date: '2001-07-02 12:11:46 +0200'
date_gmt: '2001-07-02 10:11:46 +0200'
categories:
- Java
tags:
- programmation
- serveur
- java
permalink:  /2001/07/02/comment-telecharger-un-fichier-a-partir-dune-url-en-java/
---
<p>Cet article de la FAQ a pour but de montrer comment t&eacute;l&eacute;charger un fichier depuis Internet vers son Disque Dur. On peut utiliser plusieurs m&eacute;thodes, et celle &agrave; laquelle on pensera en premier lieu est s&ucirc;rement d'impl&eacute;menter un petit client FTP ou d'utiliser un JavaBean FTP comme celui d'IPWorks (dans JBuilder 5). Cependant, je propose ici une solution plus simple (beaucoup plus simple), &agrave; partir du moment o&ugrave; l'on conna&icirc;t l'adresse exacte du fichier &agrave; t&eacute;l&eacute;charger. Cette m&eacute;thode est &eacute;galement plus s&eacute;curis&eacute;e, en cela que l'on a aucun besoin de sp&eacute;cifier un login et un mot de passe.</p>
<p>Nous allons donc utiliser une m&eacute;thode avec URLConnection. Voici le code source comment&eacute;:</p>
<p class="Code">// Sp&eacute;cifier le chemin exact vers le fichier<br />
  URL u = new URL(&quot;http://www.monserveur.com:80/monrepertore/lisezmoi.txt&quot;);</p>
<p class="Code">// Ouvrir la connexion, d&eacute;but de la communication avec le serveur<br />
  URLConnection uc = u.openConnection();</p>
<p class="Code">// R&eacute;cup&eacute;rer la taille exacte en nombre d'octets du fichier d&eacute;sign&eacute;, et la stocker dans un int<br />
  int taille = uc.getContentLength();</p>
<p class="Code">// Cr&eacute;er un flux d'entr&eacute;e pour le fichier<br />
  InputStream brut = uc.getInputStream();</p>
<p class="Code">// Mettre ce flux d'entr&eacute;e en cache (pour un meilleur transfert, plus s&ucirc;r et plus r&eacute;gulier).<br />
  InputStream entree = new BufferedInputStream(brut);</p>
<p class="Code">// Cr&eacute;er une matrice (un tableau) de bytes pour stocker tous les octets du fichier<br />
  byte[] donnees = new byte[taille];</p>
<p class="Code">// Pour l'instant aucun octet n'a encore &eacute;t&eacute; lu<br />
  int octetsLus = 0;</p>
<p class="Code">// Octets de d&eacute;placement, et octets d&eacute;j&agrave; lus. <br />
  int deplacement = 0; float alreadyRead = 0;</p>
<p class="Code">// Boucle permettant de parcourir tous les octets du fichier &agrave; lire<br />
  while(deplacement &lt; taille)<br />
  {<br />
  // utilisation de la methode &quot;read&quot; de la classe InputStream<br />
  octetsLus = entree.read(donnees, deplacement, donnees.length-deplacement);</p>
<p class="Code">// Petit calcul: mise &agrave; jour du nombre total d'octets lus par ajout au nombre d'octets lus au cours des pr&eacute;c&eacute;dents passages au nombre d'octets lus pendant ce passage<br />
  alreadyRead = alreadyRead + octetsLus;</p>
<p class="Code">// -1 marque par convention la fin d'un fichier, double op&eacute;rateur &quot;&eacute;gale&quot;: = =<br />
  if(octetsLus == -1) break;</p>
<p class="Code">// se cadrer &agrave; un endroit pr&eacute;cis du fichier pour lire les octets suivants, c'est le d&eacute;placement<br />
  deplacement += octetsLus;</p>
<p class="Code">}<br />
  // fermer le flux d'entr&eacute;e.<br />
  entree.close();</p>
<p class="Code">// R&eacute;cup&eacute;rer le nom du fichier<br />
  String fichier = u.getFile();<br />
  fichier = fichier.substring(fichier.lastIndexOf('/') + 1);</p>
<p class="Code">// Cr&eacute;er un fichier sur le DD afin d'y copier le contenu du fichier t&eacute;l&eacute;charg&eacute; (par un flux de sortie).<br />
  FileOutputStream fichierSortie = new FileOutputStream(fichier);</p>
<p class="Code">// copier...<br />
  fichierSortie.write(donnees);</p>
<p class="Code">// vider puis fermer le flux de sortie<br />
  fichierSortie.flush(); fichierSortie.close();</p>
<p>Tutoriel distribu&eacute; pour le FAQ Java de Java-France www.java-france.com / www.jgflsoft.com<br />
  R&eacute;&eacute;dit&eacute; pour Valhalla GFBLOG. <br />
  Ecrit &agrave; Montpellier le 2 juillet 2001</p>
