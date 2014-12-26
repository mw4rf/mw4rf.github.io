---
layout: page
status: publish
published: true
title: Tags
---

{% for tag in site.tags %}<a class="label label-default" href="#{{ tag[0] }}">{{ tag[0] }}</a> {% endfor %}

{% for tag in site.tags %} 
<h2 id="{{ tag[0] }}">{{ tag[0] | capitalize }}</h2>
<ul>
    {% for post in tag[1] %}
    <li>
        <a href="{{ post.url }}">{{ post.title }}</a> [{{ post.date | date_to_string }}, {{ post.content | number_of_words }} mots]
    </li>
    {% endfor %}
</ul>
{% endfor %}
