---
layout: page
status: publish
published: true
title: PlainText
author: GF
permalink: /plaintext/index.html
---

Le _Plain Text_, c'est du texte, du texte seul. Le _Plain Text_, c'est plus qu'une mode, c'est un courant philosophique prônant le détachement des formats propriétaires, la rupture avec la soumission imposée aux utilisateurs par les éditeurs de logiciels commerciaux. Il s'agit ainsi d'utiliser des fichier ne contenant que du texte, lisible en toute époque sur l'importe quelle machine. 

Partant d'un constant ancien, [réalisé en 2006 à propos de l'ineropérabilité des formats](/2006/04/13/opendocument-et-linteroperabilite-des-formats/), selon lequel les formats de fichier commerciaux ne sont pas pérennes, cette page se propose de présenter, une décennie plus tard, quelques outils capables d'assurer la sécurité et la permanence des données _avec du texte seul_.

<div class="list-group panel panel-primary" markdown="0">
    <div class="panel-heading" markdown="0">
            <h2 class="panel-title">Liste des articles</h2>
    </div>
    <div class="list-group" markdown="0">
    {% for post in site.tags.plaintext %}
        <a class="list-group-item" href="{{ post.url }}">
            <h4 class="list-group-item-leading">{{ post.title }}</h4>
            <div class="list-group-item-text">
                <strong>{% include datefr.html %} • 
                {{ post.content | number_of_words }} mots</strong>
                {{if post.excerpt }}
                    • &laquo; <em>{{ post.excerpt }}</em> &raquo;
                {{endif}}
            </div>
        </a>
    {% endfor %}
    </div>
</div>