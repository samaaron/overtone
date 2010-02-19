---
layout: default
title: Home
---

Overtone is an open source audio environment being created to explore musical
ideas from synthesis and sampling to instrument building, live-coding and
collaborative jamming.  We use the SuperCollider synth server as the audio
engine.  Synthesizers, effects, analyzers and musical generators can be
programmed in Clojure or designed in a visual data flow editor similar to PD or
Max/MSP.  The environment will be integrated with a peer-to-peer network that
allows for collaborative sessions over the internet and easy sharing of
instruments and effects.

Checkout the [roadmap](/roadmap.html) for more information about what we're up to.

#### Cross Platform

Overtone runs on Linux, OSX, and Windows.  You just need to have SuperCollider
and Java installed to run it (plus the jack audio server in Linux).

## Authors ##
* Jeff Rose
* Jon Rose
* Sam Aaron
* Fabian Aussems
* Christophe McKeon

If you are interested in contributing to the project, join the [Overtone Google
group](http://groups.google.com/group/overtone) and we can help you get started.  

## Download ##

You can clone the project with <a href="http://git-scm.com">Git</a> by running:
    $ git clone git://github.com/rosejn/overtone.git

You can also download the source package in a
[zip](http://github.com/rosejn/overtone/zipball/master) file.

## Status Blog

{% for post in site.posts limit:5 %}
  <h4><a href="{{ post.url }}">{{ post.title }}</a></h4>
  {{ post.content }}
  <em>Posted on {{ post.date | date_to_long_string }}.</em>
{% endfor %}
