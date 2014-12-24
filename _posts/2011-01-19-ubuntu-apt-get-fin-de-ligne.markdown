---
layout: post
status: publish
published: true
title: Quand apt-get réclame une fin de ligne
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "Le système de paquets Debian/Ubuntu est diablement efficace : les dépendances
  sont gérées automatiquement, il suffit d'une ligne dans la console, commençant par
  la fameuse commande \"apt-get\" pour installer ou supprimer un logiciel. Mais voilà
  : il y a parfois des problèmes qui, si petits soient-ils, parviennent à bloquer
  ladite commande. Tel est le cas du problème auquel cet article est dédié qui, d'après
  mes recherches, ne trouve aucun écho sur Google -- il doit donc être extrêmement
  rare !\r\n\r\n"
wordpress_id: 701
wordpress_url: http://www.valhalla.fr/?p=701
date: '2011-01-19 22:58:32 +0100'
date_gmt: '2011-01-19 20:58:32 +0100'
categories:
- Linux
tags:
- Informatique
- Humour
- Linux
- Unix
- Technique
- Logiciels
- Système
- Console
---
<p>Le système de paquets Debian/Ubuntu est diablement efficace : les dépendances sont gérées automatiquement, il suffit d'une ligne dans la console, commençant par la fameuse commande "apt-get" pour installer ou supprimer un logiciel. Mais voilà : il y a parfois des problèmes qui, si petits soient-ils, parviennent à bloquer ladite commande. Tel est le cas du problème auquel cet article est dédié qui, d'après mes recherches, ne trouve aucun écho sur Google -- il doit donc être extrêmement rare !</p>
<p><a id="more"></a><a id="more-701"></a></p>
<p>Je ne sais pas comment cela est arrivé. Peut-être après l'installation d'un logiciel depuis la "Logithèque Ubuntu" (qui, comme on le sait, n'est pas un modèle de stabilité), ou peut être pas. Toujours est-il que le message d'erreur était bien là, quelques lignes en dessous de celle où j'avais écrit <i>sudo apt-get install awesome</i>... Mais ne faisons pas durer le suspens plus longtemps :</p>
<blockquote><p><code>Après cette opération, 6 676ko d'espace disque supplémentaires seront utilisés.<br />
Souhaitez-vous continuer [O/n] ? o<br />
Sélection du paquet libev3 précédemment désélectionné.<br />
(Lecture de la base de données... 90%dpkg : erreur fatale irréversible, abandon :<br />
 la liste des fichiers pour le paquet « linux-headers-2.6.35-22-generic » n'a pas de retour à la ligne en fin de fichier<br />
E: Sub-process /usr/bin/dpkg returned an error code (2)<br />
</code></p></blockquote>
<p>Comment ça, il <i>n'a pas de retour à la ligne</i> ? Et en quoi cela est-il dérangeant ? Ou plutôt : en quoi cela mérite-t-il de déclencher une <i>erreur fatale irréversible</i> ? -- je trouve la formule un rien tragicomique. Bon, d'accord. Il faut un retour à la ligne à la fin du fichier, sinon le logiciel qui interprète ce fichier ne peut pas savoir que le fichier est fini et qu'il doit cesser de l'interpréter. Quoique s'il sait que c'est à la fin du fichier que le retour à la ligne fait défaut... Bref, mieux vaut ne pas trop chercher à comprendre, plus tôt on se résignera au retour-à-la-ligne-à-la-fin-du-fichier, plus tôt on parviendra à régler le problème.</p>
<p>Première tentative, tout en finesse : un fichier pose problème, très bien, on le supprime (oui, c'est fin...). Essayons : <code>sudo apt-get remove linux-headers-2.6.35-22-generic</code>. Mince... encore le même message ! Oui, c'est logique : s'il ne peut lire correctement la liste des fichiers, on lui pardonnera de ne pas parvenir à les supprimer.</p>
<p>A ce stade, on s'énerve légèrement : <i>sudo apt-get update</i>, <i>...purge</i>, <i>...autopurge</i>, <i>...check</i>, <i>...clean</i>, <i>...$@&/ù%*!!</i>, mais rien n'y fait. Il va falloir réfléchir un peu (ou fermer VirtualBox et retourner sur Mac OS X, au choix). </p>
<p>Deuxième tentative, en finesse -- cette fois, "pour de vrai" : on rajoute le fameux <i>retour à la ligne</i> dans le fichier récalcitrant. Oui, mais de quel fichier s'agit-il, au juste ? L'expert de Debian ou d'Ubuntu se mettra probablement à rire à ce stade (s'il n'est pas déjà <i>mort de rire</i> après avoir lu ce qui précède ; ce qu'on lui souhaitera s'il a ri, soit dit en passant, car il est très vilain de se moquer). Le néophyte pestera : ce message d'erreur stupide n'est même pas fichu d'indiquer <i>dans quel fichier</i> il y a un problème ? L'expert, après avoir bien ri, le rejoindra : ce n'est pas très sérieux, pour un logiciel UNIX où la notion de fichier est paradigmatique, de ne pas indiquer <i>le fichier concerné</i>. Heureusement, le monde Linux/Unix est rempli de merveilles, et l'une d'entre elles est la commande <i>locate</i>. Comme dit le proverbe (ou la publicité pour une barre chocolatée, je ne sais plus trop), <i>"un locate et ça repart !"</i>.</p>
<p>Allons-y : <code>locate linux-headers-2.6.35-22-generic</code></p>
<p>Et le résultat (que le lecteur me pardonne la coupe drastique que je réalise dans le résultat de la commande, et qu'il se dise que c'est pour préserver sa santé mentale) :</p>
<blockquote><p><code># ... de très nombreuses lignes totalement inutiles en l'occurrence, vont ici<br />
/usr/src/linux-headers-2.6.35-22-generic/scripts/selinux/mdp/dbus_contexts<br />
/usr/src/linux-headers-2.6.35-22-generic/scripts/selinux/mdp/mdp<br />
/usr/src/linux-headers-2.6.35-22-generic/scripts/selinux/mdp/mdp.c<br />
/var/lib/dpkg/info/linux-headers-2.6.35-22-generic.list<br />
/var/lib/dpkg/info/linux-headers-2.6.35-22-generic.md5sums<br />
/var/lib/dpkg/info/linux-headers-2.6.35-22-generic.postinst<br />
</code></p></blockquote>
<p>Magnifique ! Le fichier que l'on cherche est <i>très probablement</i> celui qui porte l'extension <i>list</i> (vu qu'on cherche une <i>liste</i>, cela paraît tout de même assez logique). Et il apparaît à la fin de la liste, pile sous nos yeux. Ai-je déjà dit à quel point le monde UNIX est merveilleux ?</p>
<p>Éditons ce fichier. Avec les mauvaises habitudes d'un utilisateur <i>desktop</i> (comprendre : par opposition aux réfractaires du mulot qui aiment la console plein écran d'une Debian sans environnement de bureau), on tape : <code>sudo gedit /var/lib/dpkg/info/linux-headers-2.6.35-22.list</code>. Gedit se lance, charge le fichier (avec un peu de peine, parce qu'il est <i>vraiment</i> long). On se rend à la fin et, en toute innocence, on rajoute un <i>retour à la ligne</i>. Autrement dit, on appuie sur la touche ENTRÉE, RETOUR ou RETURN du clavier. Et une nouvelle ligne se crée, vide. On sauvegarde le fichier, et on réessaye d'installer Awesome (je rappelle que c'était le but...).</p>
<p>Et là, rebelote (ou presque) :</p>
<blockquote><p><code>Après cette opération, 6 676ko d'espace disque supplémentaires seront utilisés.<br />
Souhaitez-vous continuer [O/n] ? o<br />
Sélection du paquet libev3 précédemment désélectionné.<br />
(Lecture de la base de données... 90%dpkg : erreur fatale irréversible, abandon :<br />
la liste des fichiers pour le paquet « linux-headers-2.6.35-22 » contient un nom de fichier vide<br />
E: Sub-process /usr/bin/dpkg returned an error code (2)<br />
</code></p></blockquote>
<p>Moment de lassitude. On lui a donné une ligne vide parce qu'il réclamait une <i>fin de ligne</i>, et maintenant ce bougre d'ectoplasme à roulettes (&copy; Capitaine Haddock) se plaint d'avoir une ligne vide ! </p>
<p>En fait, c'est logique. C'est encore un coup du (pas toujours si) merveilleux monde merveilleux d'UNIX : <i>fin de ligne</i> et <i>retour à la ligne</i>, ce n'est pas pareil. La <i>fin de ligne</i> correspond au caractère "\r" (retour de chariot ou <i>carriage return</i>) tandis que la <i>nouvelle ligne</i> correspond à "\n". Il suffisait de le savoir. Ou pas... car comment insérer une <i>fin de ligne</i> sans insérer une <i>nouvelle ligne</i> ? C'est difficile (ou peut-être impossible, je ne me prononcerai pas, je n'ai pas beaucoup cherché) lorsqu'on a les mauvaises habitudes d'un utilisateur <i>desktop</i>, à savoir : utiliser Gedit au lieu de la ligne de commande pour éditer un fichier système.</p>
<p>La solution, comme souvent avec les systèmes Unix/Linux, tient dans une commande qu'il suffit de balancer dans la console (qu'on commencera à apprécier, à ce stade, si ce n'est pas déjà le cas) :</p>
<blockquote><p><code>sudo echo '\r' >> /var/lib/dpkg/info/linux-headers-2.6.35-22-generic.list</code></p></blockquote>
<p>La commande <i>echo X Y Z</i> est tout bête : on fait avec X l'opération Y sur Z. En l'occurrence, on prend <i>\r</i> (X), que l'on <i>rajoute à la fin</i> (>> = Y) du fichier (Z). Elle est toute bête, mais elle ne fonctionne pas. Ou plutôt, c'est <i>sudo</i>, permettant d'utiliser une commande (la commande <i>echo</i>, il faut suivre !) avec les privilèges d'administrateur, qui ne fonctionne pas. La console, toujours aussi laconique quand on a besoin d'aide, répond :</p>
<blockquote><p><code>bash: /var/lib/dpkg/info/linux-headers-2.6.35-22-generic.list: Permission non accordée</code></p></blockquote>
<p>Pour dire les choses de manière polie, cela signifie : <i>"pauvre petit utilisateur, tu veux te faire passer pour root, mais tu n'es pas root ; je sais que tu n'es pas root, je vais t'empêcher de faire ce que tu veux faire, et je t'ai bien eu héhéhé !"</i>. </p>
<p>Quand <i>sudo</i> ne fonctionne pas, il faut sortir l'Arme Fatale : <i>su</i> (certes, le nom est plutôt crétin pour une Arme Fatale, mais on fait ce qu'on peut). Évidemment, les choses ne sont pas si simples avec Ubuntu, qui désactive l'utilisateur root. La commande <code>su</code> répond, non sans un certain sens de l'humour : <code>su : Échec d'authentification</code> (ce qui est rigolo, c'est qu'on ne dira jamais à l'utilisateur que la commande est désactivée : lui faire croire qu'il a tapé un mauvais mot de passe, et l'amener ainsi à bidouiller le <i>mapping</i> de son clavier en s'arrachant les cheveux, c'est beaucoup mieux).</p>
<p>Heureusement (pour la coupe de cheveux), la solution ne tarde jamais à venir avec l'ami (parfois) Google : il suffit, pour activer l'utilisateur root, de lui attribuer un mot de passe. Peu importe, à cet égard, que l'on ait <i>déjà</i> défini un mot de passe pour cet utilisateur lors de l'installation, il faut recommencer (le même mot de passe fonctionne très bien) à l'aide de la commande <code>sudo passwd root</code>.</p>
<blockquote><p><code>user@ubuntu10-10:~$ sudo passwd root<br />
Entrez le nouveau mot de passe UNIX :<br />
Retapez le nouveau mot de passe UNIX :<br />
passwd : le mot de passe a été mis à jour avec succès</code></p></blockquote>
<p>Désormais, la commande <i>su</i> fonctionne :</p>
<blockquote><p><code>user@ubuntu10-10:~$ su<br />
Mot de passe :<br />
root@ubuntu10-10:/home/user#</code></p></blockquote>
<p>Et maintenant qu'on a atteint l'apothéose (car c'est un peu cela, devenir root), il n'y a plus d'interdit. On lance alors avec succès notre commande qui était précédemment vouée à l'échec :</p>
<blockquote><p><code>echo '\r' >> /var/lib/dpkg/info/linux-headers-2.6.35-22-generic.list </code></p></blockquote>
<p>Et puis, pour finir, la commande <code>apt-get install awesome</code> donne pleine satisfaction :</p>
<blockquote><p><code>Après cette opération, 6 676ko d'espace disque supplémentaires seront utilisés.<br />
Souhaitez-vous continuer [O/n] ? o<br />
Sélection du paquet libev3 précédemment désélectionné.<br />
(Lecture de la base de données... 160926 fichiers et répertoires déjà installés.)<br />
Dépaquetage de libev3 (à partir de .../libev3_1%3a3.9-1_amd64.deb) ...<br />
...</code></p></blockquote>
<p>Pour conclure l'aventure, relisez la première phrase de cet article.</p>
