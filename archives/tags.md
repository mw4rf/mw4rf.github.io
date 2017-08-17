---
layout: default
status: publish
published: true
title: Tags
---

<div class="container-fluid" markdown="0">
    <div class="row" markdown="0">
        <div class="col-md-12 page-header" markdown="0">
            <h1>{{ page.title }}</h1>
        </div>
    </div>
    <div class="row" markdown="0">
        <div class="col-md-12" markdown="0">
            {% for tag in site.tags %}<a class="label label-default" href="#{{ tag[0] }}">{{ tag[0] }}</a> {% endfor %}
        </div>
    </div>
</div>

<div class="grid" markdown="0">
    <div class="grid-sizer" markdown="0"></div>
    {% for tag in site.tags %}
        {% if tag[0] != "revue" %}
            {% include tagbox.html %}
        {% endif %}
    {% endfor %}
</div>
