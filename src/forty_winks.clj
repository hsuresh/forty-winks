(ns forty-winks
    (:use clojure.contrib.duck-streams))


(defn http-get
      [url]
      (read-lines (str  "service/" url)))
