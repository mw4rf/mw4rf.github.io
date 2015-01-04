---
layout: page
status: publish
published: true
title: Revue
permalink: /revue/index.html
---

<ul style="list-style-type: none;">
{% for post in site.categories.revue %}
<li>
    <a href="{{ post.url }}">{{ post.title }}</a>
    [{{ post.date | date_to_string }}, {{ post.content | number_of_words }} mots]
</li>
{% endfor %}
</ul>