---
layout: page
status: publish
published: true
title: Revue
permalink: /revue/index.html
---

La **Revue Valhalla.fr** présente chaque semaine l'actualité du droit des nouvelles technologies à l'aide de liens vers des articles originaux et d'analyses aidant le lecteur à saisir les évolutions de la matière les plus importantes.

<div class="list-group">
{% for post in site.categories.revue %}
    <a class="list-group-item" href="{{ post.url }}">
        <h4 class="list-group-item-leading">{{ post.title }}</h4>
        <div class="list-group-item-text">
            {{ post.date | date_to_string }} • 
            {{ post.content | number_of_words }} mots • 
            Thèmes : {% for t in post.tags %}{{ t }}   {% endfor %}
        </div>
    </a>
{% endfor %}    
</div>