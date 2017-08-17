---
layout: default
status: publish
published: true
title: Catégories
---

<div class="container-fluid" markdown="0">
    <div class="row" markdown="0">
        <div class="col-md-12 page-header" markdown="0">
            <h1>{{ page.title }}</h1>
        </div>
    </div>
    <div class="row" markdown="0">
        <div class="col-md-12" markdown="0">
            {% for cat in site.categories %}<a class="label label-default" href="#{{ cat[0] }}">{{ cat[0] }}</a> {% endfor %}
        </div>
    </div>
</div>

<div class="grid" markdown="0">
    <div class="grid-sizer" markdown="0"></div>
    {% for category in site.categories %}
        {% if category[0] != "revue" %}
            {% include categorybox.html %}
        {% endif %}
    {% endfor %}
</div>
