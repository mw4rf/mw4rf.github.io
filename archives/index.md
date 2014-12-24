---
layout: page
status: publish
published: true
title: Archives
---

<ol>
{% for post in site.posts %}
<li>
    <a href="{{ post.url }}">{{ post.title }}</a>
    [{{ post.date | date_to_string }}, {{ post.content | number_of_words }} mots]
</li>
{% endfor %}
</ol>