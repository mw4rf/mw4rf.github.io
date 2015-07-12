---
layout: default
status: publish
published: true
title: Catégories
---

<div class="container-fluid">
    <div class="row">
        <div class="col-md-12 page-header">
            <h1>{{ page.title }}</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            {% for cat in site.categories %}<a class="label label-default" href="#{{ cat[0] }}">{{ cat[0] }}</a> {% endfor %}
        </div>
    </div>
</div>

<div class="grid">
    <div class="grid-sizer"></div>
    {% for category in site.categories %}
        {% if category[0] != "revue" %}
            {% include categorybox.html %}
        {% endif %}
    {% endfor %}
</div>
