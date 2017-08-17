---
layout: page
status: publish
published: true
title: Archives
---

<div class="list-group" markdown="0">
{% for post in site.posts %}
{% if post.categories[0] != "revue" %}
    <a class="list-group-item" href="{{ post.url }}">
        <h4 class="list-group-item-leading">{{ post.title }}</h4>
        <div class="list-group-item-text" markdown="0">
            {% include datefr.html %} • 
            {{ post.content | number_of_words }} mots • 
            Catégorie(s) : {% for c in post.categories %}{{ c }}   {% endfor %}<br />
            Thèmes : {% for t in post.tags %}{{ t }}   {% endfor %}
        </div>
    </a>
{% endif %}
{% endfor %}    
</div>