(ns cruise-analysis.core
  (:gen-class)
  (:require [clojure.math.numeric-tower :as math]
            [clojure.math.combinatorics :as combo]))



(defn plot-area
  "Returns area of tree plot in acres"
  [[prf dbh]]
  (let [pi 3.141593]
   (/ (* pi (math/expt (* prf dbh) 2)) 43650)))

(plot-area [2.75 10])
(plot-area [2.75 32])


