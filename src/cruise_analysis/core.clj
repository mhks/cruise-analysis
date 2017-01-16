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
(plot-area [2.75 5])

(defn plot-radius-factor
  "Returns plot radius factor (prf) for a given baf"
  [baf]
  (let [pi 3.141593]
  (math/sqrt (/ 238 (* baf pi)))))



