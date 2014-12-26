---
layout: page
status: publish
published: true
title: Catégories
---

{% for cat in site.categories %}<a class="label label-default" href="#{{ cat[0] }}">{{ cat[0] }}</a> {% endfor %}

{% for cat in site.categories %} 
<h2 id="{{ cat[0] }}">{{ cat[0] | capitalize }}</h2>
<ul>
    {% for post in cat[1] %}
    <li>
        <a href="{{ post.url }}">{{ post.title }}</a> [{{ post.date | date_to_string }}, {{ post.content | number_of_words }} mots]
    </li>
    {% endfor %}
</ul>
{% endfor %}
