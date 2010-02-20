---
layout: default
---

## Project Blog

{% for post in site.posts limit:10 %}
  <h4><a href="{{ post.url }}">{{ post.title }}</a></h4>
  {{ post.content }}
  <em>Posted on {{ post.date | date_to_long_string }}.</em>
{% endfor %}
