(ns overtone.core
  (:use [overtone.util ns])
  (:require clojure.stacktrace
            [overtone.midi]
            [overtone.osc]
            [overtone.algo chance scaling trig]
            [overtone.sc buffer bus envelope node example
                         sample server synth trigger ugens]
            [overtone.sc.cgens audio-in oscillators demand mix]
            [overtone.music rhythm pitch tuning time]
            [overtone.studio rig util fx]
            [overtone.repl ugens examples shell]
            [overtone.libs.event]
            [overtone.viz scope]))

(immigrate
 'overtone.osc
 'overtone.midi
 'overtone.algo.chance
 'overtone.algo.scaling
 'overtone.algo.trig
 'overtone.sc.server
 'overtone.sc.node
 'overtone.sc.buffer
 'overtone.sc.trigger
 'overtone.sc.ugens
 'overtone.sc.synth
 'overtone.sc.sample
 'overtone.sc.envelope
 'overtone.sc.bus
 'overtone.sc.cgens.audio-in
 'overtone.sc.cgens.oscillators
 'overtone.sc.cgens.demand
 'overtone.sc.cgens.mix
 'overtone.sc.example
 'overtone.music.rhythm
 'overtone.music.pitch
 'overtone.music.tuning
 'overtone.music.time
 'overtone.studio.rig
 'overtone.studio.fx
 'overtone.repl.ugens
 'overtone.repl.examples
 'overtone.repl.shell
 'overtone.libs.event
 'overtone.viz.scope
 )
