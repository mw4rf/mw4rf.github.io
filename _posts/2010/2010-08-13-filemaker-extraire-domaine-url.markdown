---
layout: post
status: publish
published: true
title: 'Filemaker : Extraire un nom de domaine d''une URL'

  
  



excerpt: "Filemaker ne dispose, hélas, d'aucun mécanisme natif permettant d'analyser
  des chaînes de texte selon un motif précis. Pas d'expression régulière dans Filemaker,
  à moins d'installer un plug-in comme <a href=\"http://jensteich.de/regex-plugin/\">RegexPlugin</a>
  ou <a href=\"http://www.360works.com/regular-expressions-plugin/\">360Works Patterns</a>,
  ou de créer un <a href=\"http://www.spf-15.com/fmExamples/\">ensemble complexe de
  fonctions personnalisées</a>. Comment, dès lors, extraire dans un calcul un nom
  de domaine à partir d'une adresse URL ?\r\n\r\n"
wordpress_id: 652
wordpress_/?p=652
date: '2010-08-13 16:37:53 +0200'
date_gmt: '2010-08-13 14:37:53 +0200'
categories:
- Informatique
tags:
- programmation
- bases de données
- Filemaker
- URL
- Regex
permalink:  /2010/08/13/filemaker-extraire-domaine-url/
---
<p>Filemaker ne dispose, hélas, d'aucun mécanisme natif permettant d'analyser des chaînes de texte selon un motif précis. Pas d'expression régulière dans Filemaker, à moins d'installer un plug-in comme <a href="http://jensteich.de/regex-plugin/">RegexPlugin</a> ou <a href="http://www.360works.com/regular-expressions-plugin/">360Works Patterns</a>, ou de créer un <a href="http://www.spf-15.com/fmExamples/">ensemble complexe de fonctions personnalisées</a>. Comment, dès lors, extraire dans un calcul un nom de domaine à partir d'une adresse URL ?</p>
<p><a id="more"></a><a id="more-652"></a></p>
<p>Voici un calcul qui permet d'extraire un nom de domaine depuis une adresse URL. Il requiert une rubrique de type <i>Texte</i>, appelée <b>URL</b>, et il doit être inséré dans une rubrique de type <i>Calcul</i> renvoyant un résultat de type Texte.</p>
<blockquote style="font-family: 'Courier New', Courier, monospace;"><p>
/*<br />
Format : http://www.domaine.com/index.html => domaine.com</p>
<p>L'adresse a plusieurs blocs : [http://] [domaine.tld] [/index.html]<br />
Il faut isoler le bloc du milieu, qui se situe :<br />
- après le 2ème slash ('/')<br />
- avant le 3ème slash<br />
*/</p>
<p>Definir ( $fulldomain =<br />
&nbsp;&nbsp;  Definir ([<br />
&nbsp;&nbsp;&nbsp;&nbsp;    /* la deuxième occurrence de '/' */<br />
&nbsp;&nbsp;&nbsp;&nbsp;     debut = Position ( URL ; "/" ; 1 ; 2 ) ;<br />
&nbsp;&nbsp;&nbsp;&nbsp;    /* la troisième occurrence de '/' */<br />
&nbsp;&nbsp;&nbsp;&nbsp;     fin = Position ( URL ; "/" ; 1 ; 3 )<br />
&nbsp;&nbsp;&nbsp;&nbsp;  ];<br />
&nbsp;&nbsp;&nbsp;&nbsp;     Extrait ( URL ; debut + 1 ; fin - debut - 1 )<br />
&nbsp;&nbsp; )<br />
;</p>
<p>/*<br />
On a isolé la partie du milieu, avant le 2ème et après le 3ème slash.<br />
Cette partie peut, à son tour, être composée de plusieurs membres et être formatée de diverses manières :<br />
- [sous-domaine.] [domaine] [.tld] => www.cnn.com<br />
- [domaine] [.tld] => linuxfr.org (sans le "www")<br />
- [sous-domaine.][sous-domaine.][...] [domaine] [.tld]</p>
<p>On peut traiter les deux premier cas en comptant le nombre de points dans l'adresse :<br />
- 2 points : il y a 1 sous domaine ("www" ou autre)<br />
- 1 point : pas de sous-domaine (http://domaine.tld)</p>
<p>Le 3ème cas est problématique, car on ne peut pas savoir combien de points il y a. Exemple : cyber.law.harvard.edu<br />
On le traite en retournant l'ensemble du domaine et de ses sous-domaines. Heureusement, cette hypothèse est très rare.<br />
*/</p>
<p>&nbsp;&nbsp;Cas (<br />
&nbsp;&nbsp;&nbsp;&nbsp;/* Format domaine.com (1 seul point dans l'adresse) */<br />
&nbsp;&nbsp;&nbsp;&nbsp;      Occurrences ( $fulldomain ; "." ) = 1<br />
&nbsp;&nbsp;&nbsp;&nbsp;    ; $fulldomain</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;    /* Format www.domaine.com ou sous-domaine.domaine.com (2 points dans l'adresse, p. ex. del.icio.us) */<br />
 &nbsp;&nbsp;&nbsp;&nbsp;   ; Occurrences ( $fulldomain ; "." ) = 2<br />
&nbsp;&nbsp;&nbsp;&nbsp;    ; Definir ([<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;          premier = Position ( $fulldomain ; "." ; 1 ; 1 ) ;<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;          second = Position ( $fulldomain ; "." ; 1 ; 2 )<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;          ];<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;          Extrait ( $fulldomain ; premier + 1 ; second ) /* Retourne ce qui est après le premier point : www.domaine.com => domaine.com */<br />
&nbsp;&nbsp;&nbsp;&nbsp;          /* Pour n'avoir que le domaine, sans l'extension, remplacer "second" par "second - premier - 1" */<br />
&nbsp;&nbsp;&nbsp;&nbsp;      )</p>
<p>&nbsp;&nbsp;&nbsp;&nbsp;    /* Résultat par défaut (domaines complexes, p. ex. cyber.law.harvard.edu) */<br />
&nbsp;&nbsp;&nbsp;&nbsp;    ; $fulldomain<br />
&nbsp;&nbsp;&nbsp;&nbsp;    )<br />
)
</p></blockquote>
