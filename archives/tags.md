---
layout: default
status: publish
published: true
title: Tags
---

<div class="container-fluid">
    <div class="row">
        <div class="col-md-12 page-header">
            <h1>{{ page.title }}</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            {% for tag in site.tags %}<a class="label label-default" href="#{{ tag[0] }}">{{ tag[0] }}</a> {% endfor %}
        </div>
    </div>
</div>

<div class="grid">
    <div class="grid-sizer"></div>
    {% for tag in site.tags %}
        {% if tag[0] != "revue" %}
            {% include tagbox.html %}
        {% endif %}
    {% endfor %}
</div>
