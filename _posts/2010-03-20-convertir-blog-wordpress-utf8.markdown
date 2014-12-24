---
layout: post
status: publish
published: true
title: Convertir un blog Wordpress en UTF-8
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: <p>L'encodage d'un site utilisant un logiciel de publication stockant le
  contenu des pages dans une base de données, comme le font les logiciels de blog,
  de forum ou de CMS, est une chose importante et <a href="http://www.valhalla.fr/2005/10/06/un-probleme-dencodage-peut-etre/">susceptible
  de créer bien des soucis</a> au Webmaster. Les premières versions du célèbre logiciel
  de blog Wordpress, qui est par ailleurs utilisé pour éditer ce site, utilisaient
  le charset Latin1 (norme ISO-8859-1), conçu pour afficher toutes les lettres de
  l'alphabet latin, ainsi que certains caractères accentués (é, ê, ù, à...) et spéciaux
  (ç, œ, ñ, ß...). Mais l'internationalisation du Web a peu à peu engendré la nécessité
  d'un charset plus large que le Latin1, prenant en charge plus de caractères. C'est
  ainsi que Wordpress, comme la plupart des logiciels CMS, de forum ou de blog, a
  remplacé Latin1 par UTF-8 comme charset par défaut. Ce changement ne pose bien évidemment
  aucun problème pour les blogs créés postérieurement, toute la mécanique de l'encodage
  étant transparente pour l'utilisateur. Toutefois, UTF-8 étant incompatible avec
  le charset Latin1 -- c'est-à-dire qu'il prend en charge de manière différente des
  caractères accentués utilisés par les deux charsets --, les sites créés en Latin1
  doivent faire l'objet de certaines modifications afin de pouvoir être affichés en
  UTF-8. Cet article a pour but de présenter les modifications qui doivent être apportées
  à un site utilisant Wordpress, afin de remplacer Latin1 par UTF-8 comme encodage
  par défaut.</p>
wordpress_id: 456
wordpress_url: http://www.valhalla.fr/2010/03/20/convertir-blog-wordpress-utf8/
date: '2010-03-20 19:15:44 +0100'
date_gmt: '2010-03-20 17:15:44 +0100'
categories:
- Internet
- Web
- Informatique
tags:
- Internet
- Informatique
- programmation
- Web
- serveur
- langue
- bases de données
---
<p>L'encodage d'un site utilisant un logiciel de publication stockant le contenu des pages dans une base de données, comme le font les logiciels de blog, de forum ou de CMS, est une chose importante et <a href="http://www.valhalla.fr/2005/10/06/un-probleme-dencodage-peut-etre/">susceptible de créer bien des soucis</a> au Webmaster. Les premières versions du célèbre logiciel de blog Wordpress, qui est par ailleurs utilisé pour éditer ce site, utilisaient le charset Latin1 (norme ISO-8859-1), conçu pour afficher toutes les lettres de l'alphabet latin, ainsi que certains caractères accentués (é, ê, ù, à...) et spéciaux (ç, œ, ñ, ß...). Mais l'internationalisation du Web a peu à peu engendré la nécessité d'un charset plus large que le Latin1, prenant en charge plus de caractères. C'est ainsi que Wordpress, comme la plupart des logiciels CMS, de forum ou de blog, a remplacé Latin1 par UTF-8 comme charset par défaut. Ce changement ne pose bien évidemment aucun problème pour les blogs créés postérieurement, toute la mécanique de l'encodage étant transparente pour l'utilisateur. Toutefois, UTF-8 étant incompatible avec le charset Latin1 -- c'est-à-dire qu'il prend en charge de manière différente des caractères accentués utilisés par les deux charsets --, les sites créés en Latin1 doivent faire l'objet de certaines modifications afin de pouvoir être affichés en UTF-8. Cet article a pour but de présenter les modifications qui doivent être apportées à un site utilisant Wordpress, afin de remplacer Latin1 par UTF-8 comme encodage par défaut.</p>
<p><a id="more"></a><a id="more-456"></a></p>
<blockquote>
<p>Pourquoi modifier l'encodage de son site, au profit de l'UTF-8 ?</p>
<p>Il est nécessaire de répondre à cette question avant d'expliquer la procédure de modification. Disons le d'emblée : celui qui se pose la question doit en principe connaître la réponse. S'il ne la connaît pas, c'est qu'il n'a pas de réelle raison d'opter pour UTF-8, et qu'il peut laisser son site en Latin1. Voyons toutefois les deux avantages de l'UTF-8.</p>
<p>En premier lieu, l'UTF-8 gère plus de caractères que le Latin1. Pour les sites du Web 2.0, qui invitent des internautes partout dans le monde à apporter du contenu, c'est permettre à un plus grand nombre de personnes d'écrire dans leur langue, avec leur alphabet.</p>
<p>En second lieu, et c'est là le point essentiel, la plupart des sites et des logiciels utilisent désormais par défaut l'UTF-8. Il en va donc de même des extensions, des thèmes, et des plug-in développés pour ces logiciels. Par exemple, la traduction officielle de Wordpress en français est encodée en UTF-8, et n'est donc utilisable que sur les sites utilisant le charset UTF-8. Utiliser la traduction française de Wordpress en UTF-8 sur un site dont le charset est Latin1 génère nombre d'erreurs dans l'affichage des pages (les caractères accentués ne sont pas affichés correctement). Il en va de même pour de nombreuses extensions qui ont pour but de rapatrier ou d'agréger du contenu extérieur au site : un add-on Twitter ou RSS, par exemple. Enfin, la plupart des API AJAX utilisent par défaut l'UTF-8. Le contenu récupéré depuis la base de données de manière asynchrone sera donc mal affiché, à moins d'être explicitement converti en Latin1.</p>
<p>Pour l'ensemble de ces raisons, il est préférable d'utiliser le charset UTF-8, qui devient peu à peu la norme sur le Web.</p>
</blockquote>
<p>La modification globale de l'encodage d'un site nécessite plusieurs interventions, à plusieurs niveaux, sur ce site. On peut voir cela comme une chaîne, composée de quatre maillons : la base de données, le contenu des tables, le logiciel de blog, le site. S'il manque un des maillons, des erreurs d'affichage se produiront. Voyons donc les quatre maillons, en détails, pour Wordpress.</p>
<h2>Premier maillon : la base de données</h2>
<p>L'encodage utilisé par le serveur de base de données est une contrainte à prendre en compte lors de l'installation d'un logiciel d'édition Web. L'hébergeur du domaine Valhalla.fr, par exemple, avait paramétré le serveur MySQL 4 pour utiliser le charset Latin1 par défaut, lors de la mise en place de ce site sous Wordpress. Aujourd'hui, la version de production est MySQL 5, et l'encodage par défaut est UTF-8.</p>
<p>Il existe plusieurs manières de connaître l'encodage utilisé par défaut par MySQL, et l'encodage utilisé pour chacune des tables d'une base de données. Le plus simple, avec un hébergement mutualisé, est de se rendre sur la page d'accueil de phpMyAdmin -- celui-ci est habituellement fourni par l'hébergeur, mais il est généralement possible de l'installer soi-même sur le serveur--.</p>
<p>Avec un accès SSH au serveur, la commande <code>SHOW TABLE STATUS nom_de_la_base;</code> <a href="http://dev.mysql.com/doc/refman/5.0/fr/show-table-status.html">[cf. documentation]</a> permet d'afficher le charset de chacune des tables d'une base de données, sous cette forme :</p>
<p><code>wp_posts |MyISAM| 10 |Dynamic | 439 | 16576 | 7276888 | 281474976710655 | 45056 | 0 | 454 | 2010-03-20 12:48:04 | 2010-03-20 12:48:05 | 2010-03-20 12:48:05 | <u>latin1_swedish_ci</u> |</code></p>
<p>Pour commencer, il est toujours bon de créer une sauvegarde des données, et de travailler sur la sauvegarde plutôt que sur les données originales. Pour créer une sauvegarde, on peut utiliser 1) la ligne de commande, si l'on a un accès SSH au serveur ; 2) un logiciel client ; 3) un logiciel en ligne comme phpMyAdmin.</p>
<blockquote>
<p>L'utilisation de la ligne de commande est souvent la meilleure solution. Elle nécessite toutefois un accès SSH au serveur, cet celui-ci est rarement fourni dans le cadre d'un hébergement mutualisé. Pour sauvegarde la base de données en ligne de commande, on utilisera l'instruction suivante :</p>
<p><code>mysqldump --opt -u nom_dutilisateur -p nom_de_la_base &gt; ma_sauvegarde.sql</code></p>
<p>A défaut d'un accès SSH, on peut utiliser un logiciel client. <a href="http://www.navicat.com/">Navicat</a> (Windows/Mac/Linux) est connu pour son efficacité, tout comme <a href="http://www.sqlmanager.net/products/mysql/manager/">EMS SQL manager</a> et <a href="http://www.webyog.com/en/">SQLYog</a> (Windows-only). Il en existe également des gratuits, tel que <a href="http://www.sequelpro.com/">Sequel Pro</a> (Mac), Toad (Windows) ou encore <a href="http://dev.mysql.com/downloads/gui-tools/5.0.html">ceux fournis par MySQL</a> (Windows/Mac/Linux).</p>
<p>Enfin, s'il est impossible de contacter le serveur MySQL depuis le réseau, on utilisera <a href="http://www.phpmyadmin.net/">phpMyAdmin</a> ou un logiciel local équivalent. Ce n'est toutefois pas la meilleure solution, car elle impose de scinder la sauvegarde en plusieurs fichiers.</p>
</blockquote>
<p>Une fois la base de données sauvegardée dans un fichier .sql, il faut éditer ce fichier, dans un éditeur de texte brut (NotePad sous Windows, TextEdit sous Mac, par exemple) et remplacer <code>DEFAULT CHARSET = latin1</code> par <code>DEFAULT CHARSET = utf8</code> dans tout le fichier. Ceci n'est pas à faire manuellement, mais en utilisant la fonction <i>Rechercher et remplacer</i> de l'éditeur de texte.</p>
<p>Reste à créer une nouvelle base de données vide, en spécifiant lors de la création qu'elle doit utiliser le charset UTF-8. Cela est possible avec les logiciels précités, ou en ligne de commande avec l'instruction suivante :</p>
<p><code>CREATE DATABASE ma_nouvelle_base DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;</code></p>
<p>La nouvelle base étant créée, il reste à injecter les données provenant de la sauvegarde -- c'est-à-dire le fichier .sql modifié à l'étape précédente. Encore une fois, on utilisera l'un ou l'autre des logiciels précités, ou la commande suivante, si l'accès SSH au serveur de base de données est possible :</p>
<p><code>mysql -u nom_dutilisateur -p ma_nouvelle_base &lt; ma_sauvegarde.sql</code></p>
<h2>Deuxième maillon : le contenu des tables</h2>
<p>Il existe plusieurs manières de modifier le contenu des tables. Ouvrir le fichier de sauvegarde et modifier son encodage dans un éditeur de texte ne sera généralement pas suffisant.</p>
<p>La première manière est d'utiliser la fonction PHP iconv() sur le texte du fichier de sauvegarde :</p>
<p><code>iconv -f iso-8859-1 -t utf8 ma_sauvegarde_latin1.sql &gt; ma_sauvegarde_utf8.sql</code></p>
<p>On peut également utiliser un script qui remplace les caractères un par un dans le fichier :</p>
<p><code>&lt;?php<br />
$source = file_get_contents('ma_sauvegarde_latin1.sql');<br />
$destination = fopen('ma_sauvegarde_utf8.sql','wb');<br />
fwrite($destination, "\xEF\xBB\xBF".utf8_encode($source));<br />
fclose($destination);<br />
?&gt;</code></p>
<p>Après avoir modifié le fichier, on restaurera la sauvegarde dans la nouvelle base créée, comme indiqué ci-avant. La troisième solution est la plus élégante. Contrairement aux deux autres, elle doit être mise en oeuvre après l'insertion de la sauvegarde dans la base de données. Il s'agit de demander à MySQL (à partir de la version 5 seulement) d'opérer la conversion, grâce à l'instruction suivante :</p>
<p><code>ALTER TABLE ma_table CONVERT TO CHARACTER SET utf8;</code></p>
<p>Cette instruction peut être exécutée avec les logiciels précités, depuis n'importe quel script sur le serveur ou par la ligne de commande. Elle devra bien entendu être répétée pour chacune des tables de la base de données :</p>
<p><code>ALTER TABLE wp_comments CONVERT TO CHARACTER SET utf8;<br />
ALTER TABLE wp_commentmeta CONVERT TO CHARACTER SET utf8;<br />
ALTER TABLE wp_links CONVERT TO CHARACTER SET utf8;<br />
ALTER TABLE wp_options CONVERT TO CHARACTER SET utf8;<br />
ALTER TABLE wp_postmeta CONVERT TO CHARACTER SET utf8;<br />
ALTER TABLE wp_term_relationships CONVERT TO CHARACTER SET utf8;<br />
ALTER TABLE wp_term_taxonomy CONVERT TO CHARACTER SET utf8;<br />
ALTER TABLE wp_terms CONVERT TO CHARACTER SET utf8;<br />
ALTER TABLE wp_users CONVERT TO CHARACTER SET utf8;<br />
ALTER TABLE wp_usermeta CONVERT TO CHARACTER SET utf8;<br />
ALTER TABLE wp_posts CONVERT TO CHARACTER SET utf8;</code></p>
<h2>Troisième maillon : le logiciel</h2>
<p>Certains logiciels indiquent <i>en dur</i>, dans leurs fichiers de configuration, l'encodage utilisé. C'est le cas de Wordpress. Le fichier à éditer porte le nom de <code>wp-config.php</code> ; il se situe à la racine du répertoire d'installation de Wordpress.</p>
<p>Pour modifier l'encodage, il faut modifier --ou rajouter, le cas échéant-- la ligne suivante (en début de fichier) :</p>
<p><code>define('DB_CHARSET', 'utf8');</code></p>
<p>Il faudra aussi, le cas échéant, demander à Wordpress d'utiliser les données de la nouvelle base, encodée en UTF-8 :</p>
<p><code>define('DB_NAME', 'ma_nouvelle_base_en_utf8');</code></p>
<h2>Quatrième maillon : le site</h2>
<p>Les pages générées par Wordpress (et par tous les autres logiciels d'édition) indiquent au navigateur du lecteur quel charset utiliser pour un affichage correct. Cette indication se situe dans l'en-tête du code HTML généré (pour le voir : clic-droit dans la page, et affichage du code source) :</p>
<p><code>&lt;meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /&gt;</code></p>
<p>Pour que Wordpress utilise UTF-8 dans cette instruction, il faut modifier la valeur de l'encodage dans l'interface d'administration de son site (mon_site/wp-admin), section <i><b>Settings</b></i> (Configuration), sous-section <i><b>Reading</b></i> (Lecture).<br />[L'adresse directe est la suivante : http://mon_site/wp-admin/options-reading.php].</p>
<p>Et voilà ! Après toutes ces opérations, qui peuvent rapidement se révéler un parcours du combattant, le site devrait s'afficher en UTF-8, avec tous les caractères spéciaux et accentués.</p>
<p>
à Montpellier, le 20 mars 2010</p>
