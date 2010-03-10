(ns forty-winks
    (:use clojure.contrib.test-is clojure.contrib.duck-streams forty-winks))

(deftest should-index
   (is (= (http-get "/index.html")
          (read-lines "service/index.html"))))
(run-tests)
