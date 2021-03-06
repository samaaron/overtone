(ns overtone.sc.machinery.defaults
  (:require [overtone.at-at :as at-at]))

;; ## SCSynth limits
(def MAX-NODES 4000)
(def MAX-BUFFERS 4000)
(def MAX-SDEFS 2000)
(def MAX-AUDIO-BUS 1000)
(def MAX-CONTROL-BUS 4000)

;;Number of audio busses to reserve. These busses won't be available to users
;;via overtone.sc.bus/audio-bus
(def AUDIO-BUS-RESERVE-COUNT 50)


(def SERVER-HOST "127.0.0.1")
(def SERVER-PORT nil) ; nil means a random port
(def N-RETRIES 20)

;; Max number of milliseconds to wait for a reply from the server
(def REPLY-TIMEOUT 500)

;;Max number of samples supported in a UDP OSC message
(def MAX-OSC-SAMPLES 8192)

;id of root group in node tree on server
(def ROOT-GROUP 0)

;;make an at-at pool for all default scheduling
(def SC-POOL (at-at/mk-pool))

(def SC-PATHS {:linux ["scsynth"]
               :windows ["C:/Program Files/SuperCollider/scsynth.exe"
                         "D:/Program Files/SuperCollider/scsynth.exe"
                         "E:/Program Files/SuperCollider/scsynth.exe"
                         "C:/Program Files (x86)/SuperCollider/scsynth.exe"
                         "D:/Program Files (x86)/SuperCollider/scsynth.exe"
                         "E:/Program Files (x86)/SuperCollider/scsynth.exe"]

               :mac  ["/Applications/SuperCollider/scsynth"] })

(def SC-ARGS  {:linux []
               :windows []
               :mac   ["-U" "/Applications/SuperCollider/plugins"] })
