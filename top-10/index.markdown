---
layout: page
status: publish
published: true
title: Top 10
author:
  display_name: GF
  login: gflorimond
  email: gf@valhalla.fr
  url: http://www.valhalla.fr
author_login: gflorimond
author_email: gf@valhalla.fr
author_url: http://www.valhalla.fr
wordpress_id: 46
wordpress_url: http://blog.gfblog.com/index.php/top-10/
date: '2005-10-08 11:42:27 +0200'
date_gmt: '2005-10-08 09:42:27 +0200'
categories:
- Divers
tags: []
---
<p>
<u>Les 10 articles les plus consultés</u></p>
<phpcode>
<?php show_pop_posts(); ?>
</phpcode></p>
<p>
<u>Les 10 derniers articles</u></p>
<phpcode>
<?php c2c_get_recent_posts(10); ?>
</phpcode></p>
<p>
<u>Les 10 dernières réactions</u></p>
<phpcode>
<?php c2c_get_recently_commented(10); ?>
</phpcode></p>
<p>
<u>Les 10 dernières modifications</u></p>
<phpcode>
<?php c2c_get_recently_modified(10); ?>
</phpcode></p>
<p>
<u>Les 10 derniers articles aléatoires</u></p>
<phpcode>
<?php c2c_get_random_posts(10); ?>
</phpcode></p>
