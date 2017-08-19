---
layout: page
status: publish
published: true
title: PlainText
author: GF
permalink: /plaintext/index.html
---


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