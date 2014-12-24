---
layout: post
status: publish
published: true
title: Leopard et le Partage égoïste
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
excerpt: "Leopard, la nouvelle version de Mac OS X, est sorti hier vendredi 26 octobre
  2007. Je l'ai acheté et installé sur mon MacPro. Tout ne s'est pas très bien passé,
  bien que j'ai réalisé une \"clean install\" (effacer et installer). Le problème
  majeur que j'ai rencontré concerne l'activation du partage de fichiers en réseau,
  dans la préférences système.\r\n\r\nLes torts sont partagés dans la survenance du
  problème : moi qui ai l'habitude de faire confiance à Apple et à \"cliquer trop
  vite\", un peu sans réfléchir ; Apple qui devrait prévenir des changements opérés
  à ce niveau entre Tiger et Leopard, et surtout faire en sorte de prévenir le problème
  que j'ai rencontré.\r\n\r\n"
wordpress_id: 129
wordpress_url: http://www.valhalla.fr/index.php/2007/10/27/leopard-et-le-partage-egoiste/
date: '2007-10-27 10:32:26 +0200'
date_gmt: '2007-10-27 09:32:26 +0200'
categories:
- Mac
tags:
- Mac
- sécurité
- réseaux
- Apple
---
<p>Leopard, la nouvelle version de Mac OS X, est sorti hier vendredi 26 octobre 2007. Je l'ai acheté et installé sur mon MacPro. Tout ne s'est pas très bien passé, bien que j'ai réalisé une "clean install" (effacer et installer). Le problème majeur que j'ai rencontré concerne l'activation du partage de fichiers en réseau, dans la préférences système.</p>
<p>Les torts sont partagés dans la survenance du problème : moi qui ai l'habitude de faire confiance à Apple et à "cliquer trop vite", un peu sans réfléchir ; Apple qui devrait prévenir des changements opérés à ce niveau entre Tiger et Leopard, et surtout faire en sorte de prévenir le problème que j'ai rencontré.</p>
<p><a id="more"></a><a id="more-129"></a></p>
<p>Bref, voilà ce qui s'est passé. J'ai installé Leopard sur mon MacPro, qui contient deux disques internes (un pour le système, un pour les données). J'ai également un PowerBook G4, qui est pour l'instant resté sous Tiger. Les deux Mac sont en réseau (Ethernet/Wifi), ce qui me permet d'échanger des fichiers en montant un volume d'un Mac sur l'autre.</p>
<p>Avec Tiger, il suffit d'aller dans la section "Partage" des préférences système et d'activer le partage de fichiers Mac. Ensuite, à la connexion, un nom de compte et le mot de passe associés sont demandés :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1770424495/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2219/1770424495_bbb3ade009_o.png" width="595" height="568" alt="Partage sous Tiger" /></a></p>
<p>Avec Leopard, la configuration du partage a changé. On peut se contenter d'activer le partage, comme sous Tiger, et c'est d'ailleurs ce qu'il faut faire. On peut aussi aller plus loin dans la configuration du partage, en définissant quels utilisateurs auront accès à tel ou tel volume :</p>
<p><a href="http://www.flickr.com/photos/valhallafr/1771426786/" title="Partage de photos"><img src="http://farm3.static.flickr.com/2048/1771426786_4f09ee4573.jpg" width="500" height="420" alt="Partage sous Leopard" /></a></p>
<p>C'est ici que j'ai fait ce qu'il ne fallait (surtout) pas faire. Je me suis dit qu'il fallait paramétrer ainsi :<br />
- Mon second disque interne, réservé aux données, interdit d'accès à tout le monde sauf à moi. J'ai donc retiré tous les utilisateurs de la liste, sauf moi.<br />
- Mon premier disque interne, qui contient le système, interdit à tout le monde.</p>
<p>Je pensais naïvement (j'avoue que ce n'était pas malin, je n'ai pas pris le temps de réfléchir) que ces réglages n'affectaient que le partage. C'est-à-dire qu'ils n'avaient d'influence que sur l'écran de connexion qui s'affiche sur l'ordinateur A lorsque celui-ci tente d'accéder à un volume de l'ordinateur B.</p>
<p>Mais ce n'est pas le cas : ces réglages modifient les permissions globales des volumes affectés. C'est-à-dire que modifier la liste des utilisateurs sur l'écran Partage des préférences système de Leopard produit exactement le même résultat que les modifier dans la fenêtre d'informations qui apparaît lorsqu'on fait un Commande+i sur l'icône d'un volume, ou encore en utilisant la commande chmod dans le terminal.</p>
<p>Résultat des courses, après avoir validé les modifications, le système s'est figé. Et pour cause: le volume contenant le système étant interdit d'accès à tout le monde, le système lui-même n'y avait plus accès (hormis les processus tournant en root, mais ils ne sont pas légion). Au redémarrage de l'ordinateur, le système ne pouvait pas se charger : le chargement s'arrêtait au niveau de l'écran bleu qui précède l'apparition de la fenêtre de connexion.</p>
<p>Je n'avais pas vraiment envie d'aller modifier les autorisations du volume de boot depuis le terminal (accessible sur le DVD d'installation), alors j'ai préféré formater et réinstaller Leopard. Je n'avais rien à perdre, puisque j'avais réalisé en premier lieu une "clean install" (effacer + installer). Cependant, j'étais vraiment en colère contre Apple qui devrait d'une part prévenir des dangers de ce paramétrage et, d'autre part, faire en sorte qu'il ne soit pas possible de retirer l'accès aux utilisateurs système sur le volume de boot ! Bref... j'avais l'impression d'être de retour à l'époque pré-switch "écran bleu de la mort 10 minutes après une installation fraîche, reboot sous DOS et format c:".</p>
<p>Après la réinstallation de Leopard, j'ai constaté un autre effet pernicieux de la modification des autorisations. Cette fois, le problème ne concernait pas le volume de boot (qui avait été formaté, donc totalement réinitialisé, même au niveau des autorisations d'accès), mais mon volume "Documents", qui correspond à mon second disque interne. Le problème s'est présenté ainsi : TimeMachine n'arrivait pas à lancer la copie des fichiers, il restait bloqué à la phase "Préparation de la copie". Le dossier habituel de TimeMachine (8 Ko) ayant été créé sur mon disque externe de sauvegarde, j'en ai conclu que le problème venait non pas de droits d'écriture sur ce disque externe, mais des droits de lecture des données.</p>
<p>Le problème était en effet causé par ma précédente modification des autorisations, depuis la section Partage des préférences système. En retirant l'accès à tous les utilisateurs sauf moi, j'avais retiré l'accès à un utilisateur qui s'appelle "système". Or, si l'on peut facilement priver d'accès cet utilisateur, on ne peut pas aussi facilement lui rendre l'accès. La gestion des autorisations (Commande+i sur l'icône d'un volume) passe maintenant par le carnet d'adresses. On peut rajouter un groupe "administrateurs" et un groupe "everyone", mais pas l'utilisateur "système". Or, c'est cet utilisateur qu'utilise le daemon de TimeMachine !</p>
<p>Je n'ai pas cherché une solution intelligente, j'ai opté pour la solution "bourrin". J'ai copié les fichiers sur un disque externé, j'ai formaté le disque interne contenant mes documents, puis j'ai recopié les données depuis le disque externe vers le nouveau volume tout neuf, avec les bonnes autorisations. TimeMachine fonctionne désormais sans problème. La copie des 400+Go est en cours.</p>
<p>Fin de l'histoire. Morale : ne pas faire une confiance aveugle en Apple, ne pas cliquer trop vite sans chercher à comprendre et... éviter de jouer avec les paramétrages avancés de la section Partage des préférences système !</p>
