---
layout: post
published: true
title: "Org-mode & Jekyll : table des matières"
author: GF
excerpt: "À la poursuite d'une geek-attitude ridicule toujours plus poussée, j'écris désormais mes posts dans emacs, avec org-mode. Il faut ensuite les convertir en markdown pour qu'ils puissent être interprétés par Jekyll. C'est déjà difficile à dire, c'est encore plus difficile à faire. Ce post s'attaque à un problème particulier : la génération automatique d'une table des matières."
date: '2017-01-21 17:48:07'
categories:
- Informatique
tags:
- Jekyll
- programmation
- Web
- plaintext
permalink:  /2017/01/21/org-jekyll-toc/
---

- Table des matières 
{:toc}


# Org TOC&#x2026; dégueulasse !

Org-mode fait tout, même le café, c'est dire s'il fait aussi des tables des matières. Pour insérer une toute jolie table des matières, il suffit de&#x2026; ne rien faire ! Oui, c'est automatique.

J'écris donc mon *post* dans org-mode, j'exporte en markdown, `C-c C-e m m`, je charge la page dans mon navigateur et je contemple avec satisfaction ma table des matières.

Voilà, le problème est réglé, fin du post. Bye Bye.

Oui, mais non. 

Après avoir contemplé avec satisfaction ma belle page web, dans mon navigateur, je suis pris de l'irrépressible envie de jeter un coup d'oeil au code source markdown généré par org-mode lors de l'exportation. Et là, c'est la catastrophe : la table des matière est construite en HTML !

J'ai donc un bout de code HTML tout moche au milieu de mon code markdown. C'est dégueulasse. Le module d'exportation markdown d'org-mode n'est pas au point, dès lors qu'il utilise du HTML là où il pourrait utiliser du *plain* markdown. Il ne s'agit que de liens, il n'y a aucun *tag* HTML inconnu de la syntaxe markdown qui imposerait de revenir au HTML.

Rappelons tout de même que le fichier org est converti en markdown qui est lui-même converti en HTML. Si org génère du HTML, il "court-circuite" markdown. Dès lors, autant exporter directement du format org vers le format HTML !

Neutralisons donc la génération automatique de la table des matières par org-mode et trouvons une alternative. Pour ce qui est de neutraliser, c'est facile, il suffit d'insérer `#+OPTIONS: toc:nil` en haut du fichier source. Pour ce qui est de l'alternative, c'est plus difficile&#x2026;


# Plugins Jekyll ?

Il existe de nombreux plugins Jekyll pour générer des tables des matières. Je ne les ai pas essayés, parce que je veux un site *"GitHub-compliant"* au maximum, ce qui limite l'usage de plugins&#x2026; ou plutôt *"moi-même-compliant"*, ce qui limite aussi les plugins *écrits par des tiers*. Je laisse au lecteur le soin d'aller jeter un coup d'oeil, une bête [requête Google](https://www.google.fr/webhp?sourceid=chrome-instant&ion=1&espv=2&ie=UTF-8#q=jekyll%2520toc%2520generator) le satisfera. Je suis persuadé que ces plugins fonctionnent très bien.


# Post-processing ?

On trouve facilement sur GitHub des générateurs de table des matières pour markdown. Par exemple, [jonschlinkert/markdown-toc](https://github.com/jonschlinkert/markdown-toc) qui fonctionne très bien. Un vrai régal, on insère simplement `<!-- toc -->` dans son fichier source et une petite commande dans le *shell* permet de créer la table des matières à l'endroit indiqué du fichier.

Pourquoi pas ?

Parce que c'est inélégant. Recourir à un programme externe, installer *npm* et tout le tralala, juste pour ça, c'est trop. Parce qu'il faut en outre programme un *hook* à l'exportation, que org-mode ne semble pas permettre de faire cela aisément (je n'ai pas creusé la question, cela dit), et surtout que le code *elisp* n'est pas agréable à lire ou écrire (en ce qui me concerne, c'est subjectif).


# Miracle (ou presque) : kramdown

Le moteur markdown que j'utilise avec Jekyll est *kramdown*. Or, il gère de manière native la génération de table des matières ! Que du bonheur&#x2026; une fois qu'on a trouvé comment faire !

Premier élément, il faut modifier sa configuration Jekyll. Cela ne semble pas être très bien documenté&#x2026; merci à je-ne-sais-qui sur StackOverflow pour avoir trouvé cette information. On rajoutera donc, dans la configuration :

    kramdown:
        parse_block_html: true

Ensuite, le fichier source. À l'endroit où l'on veut voir apparaître la table des matières, l'on ajoute :

    - Table des matières 
    {:toc}

À ce stade, org fait des siennes. Il considère que le retour à la ligne marque le début d'un nouveau paragraphe et insidère une ligne vide. Imbécile ! Un retour à la ligne *n'est pas* un saut de ligne&#x2026; Passons l'arrachage de cheveux à base de `\\` ou de `<br />`, la solution est d'inclure le petit bout de code entre les *tags* `#+BEGIN_EXPORT html` et `#+END_EXPORT`.

Ouf ! On y est enfin&#x2026;

<del>Ou pas.</del>

<del>Il semblerait que l'option</del> <del>`parse_block_html`</del> <del>[ne fonctionnerait pas bien avec GitHub](https://github.com/GitbookIO/kramed/issues/31)&#x2026; à vérifier !</del> *Vérification faite : elle fonctionne !*

