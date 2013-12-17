(ns un-countries.core
  (:require [data-tackle :as dt])
  (:require [clojure.data.json :as json]))

(defn -main []
  (let [find  (dt/closest-name-code-finder (dt/read-csv-file "data/countries-un.csv"))]
     (json/pprint
      (for [line (line-seq (java.io.BufferedReader. *in*))]
        {:query line :results (find line)}))))