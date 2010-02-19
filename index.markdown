---
layout: default
title: Overtone
---

<div class="description">
  programmable music 
</div>

## Authors ##
* Jeff Rose
* Jon Rose
* Sam Aaron
* Fabian Aussems
* Christophe McKeon

## Download ##
You can download this project in either
<a href="http://github.com/rosejn/overtone/zipball/master">zip</a> or
<a href="http://github.com/rosejn/overtone/tarball/master">tar</a> formats.

<p>
You can also clone the project with <a href="http://git-scm.com">Git</a> by running:
      <pre>$ git clone git://github.com/rosejn/overtone</pre>
</p>

{% for post in site.posts limit:5 %}
  <h2><a href="{{ post.url }}">{{ post.title }}</a></h2>
  {{ post.content }}
  <em>Posted on {{ post.date | date_to_long_string }}.</em>
{% endfor %}
