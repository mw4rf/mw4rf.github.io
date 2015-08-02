---
layout: "post"
published: true
title: "Les abus des App Stores"
author: GF
date: "2015-08-02 16:15"
place: Montpellier
categories:
- Informatique
tags:
- apple
comments: true
permalink:  /2015/08/02/les-abus-des-app-stores/
grid-width: 1
---

Il fut un temps où l'on faisait ses courses en allant de commerce en commerce : le boucher, le boulanger, le fromager, et ainsi de suite. Puis vint la grande distribution : un seul grand magasin avec différentes variétés de produits et de marques. La distribution des logiciels informatiques est en train de passer du premier schéma au second, et ce n'est pas pour le mieux.

Il y a quelques années encore, l'utilisateur d'un PC ou d'un Mac souhaitant utiliser un nouveau logiciel devait trouver ce logiciel sur le Web, le télécharger depuis le site de l'éditeur, puis l'installer. Aujourd'hui, il se rend sur l'App Store d'Apple, Google Play ou la boutique de Microsoft, choisit le logiciel parmi une liste proposée et l'installe directement depuis la boutique du distributeur.

Ce modèle n'est pas nouveau, en informatique. Il est utilisé depuis longtemps par les distributions Linux qui fournissent des logiciels, appelés _paquets_, depuis des _App stores_ appelées _dépôts_. Son intérêt principal est de renforcer la sécurité et la robustesse du système. En effet, lorsque le distributeur du système d'exploitation distribue aussi les logiciels, il peut s'assurer que ceux-ci son compatibles et dépourvus de failles de sécurité ou de bugs importants. Obtenir ses logiciels depuis un _app store_, est donc en principe beaucoup plus sûr que de les télécharger depuis le Web.

Cependant, les _app store_ modernes, contrairement aux dépôts Linux, sont conçus pour vendre des logiciels commerciaux. L'argent entre en compte, avec lui la cupidité et, conséquence naturelle, les _arnaques_.

### Les faux logiciels

![Exemple d'arnaque](/public/posts/2015-08-02-les-abus-des-app-stores/fake_softwares.png_ "Exemple d'arnaque")

Il est surprenant de rencontrer un logiciel appelé « Navigateur Internet » dans l'_App Store_ pour Mac d'Apple. Il est classé en 9ème place des meilleurs logiciels payants et vendu 99 centimes d'euro. C'est une arnaque. Il existe de nombreux navigateurs gratuits, tels que [Safari](https://www.apple.com/fr/safari/) (fourni avec Mac OS X), [Firefox](https://www.mozilla.org/fr/firefox/new/), [Google Chrome](https://www.google.fr/chrome/browser/desktop/index.html), [Opera](http://www.opera.com/fr), [Microsoft Edge](http://www.microsoft.com/en-us/windows/microsoft-edge) (fourni avec Windows 10), pour ne citer que les plus fameux. Tous ces navigateurs sont des logiciels complexes, dotés de nombreuses fonctions, développés par des équipes de professionnels sérieux... et gratuits ! Le logiciel que l'on trouve dans l'_app store_ n'est rien de cela : ce n'est qu'un _erzatz_ de navigateur, bricolé à la va-vite sur le fondement de [_bibliothèques_](https://fr.wikipedia.org/wiki/Interface_de_programmation) fournies par Apple (notamment [WebKit](https://fr.wikipedia.org/wiki/WebKit)). La capture d'écran du navigateur permet à n'importe quel internaute avisé de se rendre compte de la supercherie. Une lecture un peu plus attentive permet de savoir que ce logiciel n'a pas été mis à jour depuis le 18 mars 2014, plus d'un an, ce qui représente une éternité dans l'univers des navigateurs. L'existence de failles de sécurité est donc probable, ce qui peut compromettre la sécurité du système et des données personnelles de l'utilisateur. Le consommateur achetant ce logiciel paie donc un _produit défectueux_, alors qu'il pourrait obtenir _gratuitement_ un produit en parfait état de marche. Les commentaires de quelques internautes ayant commis l'erreur d'acheter ce logiciels ont édifiants : « Je l'ai acheté pour rien » ; « Quand tu passes de Safari à ça, il ne te reste que les yeux pour pleurer »... 

Les _app store_ ont donc _en principe_ un effet positif sur la sécurité informatique, mais elles ont aussi un effet économique pervers. Les acheteurs de ce navigateur de piètre qualité sont sûrement des profanes ignorant qu'il existe des navigateurs alternatifs gratuits, de bien meilleure qualité. Ils ont trouvé ce logiciel sur l'_app store_, ce qui leur a probablement semblé être un gage de sérieux. Il n'en est rien. L'auteur de ce navigateur est un [_free rider_](https://fr.wikipedia.org/wiki/Passager_clandestin_(%C3%A9conomie)) voire un [concurrent parasite](http://www.dictionnaire-juridique.com/definition/parasitisme.php) qui profite de la réputation de l'_app store_ et des efforts réalisés par les créateurs des bibliothèques utilisées pour distribuer, sans grand effort, un produit défectueux. L'_app store_ d'Apple n'offrant aucune procédure _simple_ pour obtenir le remboursement d'un logiciel acheté, il y a fort à parier que la plupart des acheteurs auront préféré abandonner leurs 99 centimes d'euro plutôt que de réclamer le remboursement. Il suffit à l'auteur d'abuser quelques milliers de profanes pour amasser un beau petit pactole...

L'on pourrait rétorquer que l'acheteur n'avait qu'à se renseigner avant d'acheter : « _caveat emptor !_». Après tout, le logiciel s'appelle « Navigateur Internet », il permet de naviguer sur Internet, et rien n'interdit de vendre un produit alors que ses concurrents distribuent gratuitement des produits techniquement bien supérieurs. Pourtant, aucun internaute n'aurait acheté un tel logiciel si le vendeur avait respecté son [obligation d'information](http://www.lexinter.net/JF/obligation_de_conseil_et_d'information_du_vendeur.htm). Celle-ci lui impose notamment d'indiquer à l'acheteur les fonctionnalités du produit, ce qui n'est pas fait ici, voire de lui conseiller un produit différent correspondant mieux à ses besoins. Apple aurait donc dû signaler aux acheteurs potentiels l'existence d'autres navigateurs ou, à tout le moins, imposer à l'auteur du logiciel vendu sur son _app store_ d'en énumérer les fonctionnalités.

### Les faux commentaires

Il est encore plus surprenant, dans un tel contexte, que ce logiciel soit classé en 9ème position des meilleures applications payantes sur l'_app store_. L'on ne sait pas très bien comment le classement est effectué, la boutique d'Apple manquant de transparence. On peut cependant penser que les logiciels sont classés par le nombre de téléchargements pondéré par les appréciations laissées par les internautes. Un acheteur sera naturellement plus attiré par un logiciel utilisé par d'autres personnes manifestant leur contentement que par un logiciel qui ne semble être utilisé par personne.

![Exemple de faux commentaires](/public/posts/2015-08-02-les-abus-des-app-stores/fake_comments.jpg_ "Exemple de faux commentaires")

Ainsi, certains éditeurs n'hésitent pas à écrire de faux commentaires pour doter leurs logiciels d'une fausse popularité. L'exemple donné ici est frappant : plus de 4000 notes données dont une ribambelle de « 5 étoiles » avec le même commentaire (et la même faute de français). Il s'agit clairement de commentaires envoyés en masse par un procédé automatique. La popularité du logciel est artificiellement augmentée et certains acheteurs qui ne prendraient pas la peine de lire les commentaires pourraient croire qu'il mérite vraiment la note de 4,5/5 étoiles. 

### Les achats _in-app_

Les achats _in-app_ permettent d'aquérir du contenu, au sein d'un logiciel, par des micropaiements. Par exemple, un lecteur de musique distribué gratuitement pourrait ne permettre de jouer que 10 morceaux puis exiger un paiement pour lever cette limitation. Il n'y a là rien de répréhensible, bien au contraire.

Ce système est pourtant détourné par la plupart des éditeurs de jeux, si bien que les achats _in app_ deviennent aujourd'hui la gangraine de cette industrie. La majorité des jeux sur l'_app store_ sont désormais développés dans le seul but d'inciter les utilisateurs à réaliser des achats _in-app_. Par exemple, le jeu peut se bloquer pendant un certain temps, obligeant l'utilisateur à attendre ou à payer pour le débloquer. Il peut également être trop difficile pour être joué sans obtenir des avantages payants.

Il n'y a là non plus rien de répréhensible d'un point de vue juridique puisque le consommateur est libre de ne pas acheter et qu'il n'est pas trompé sur ce qu'il achète. En revanche, les éditeurs qui utilisent ce système montrent qu'ils ont peu d'éthique. 

La leçon à tirer de cela est qu'il faut éviter les achats _in-app_, lire les commentaires avant d'acheter et, surtout, vérifier s'il existe des logiciels alternatifs.













