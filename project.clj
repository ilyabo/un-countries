(defproject unesco-countries "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-git-deps "0.0.1-SNAPSHOT"]]
  :dependencies [[org.clojure/clojure "1.5.1"]

                 ; dependencies of data-tackle
                [org.clojure/clojure "1.5.1"]
                [org.clojure/data.json "0.2.2"]
                [org.clojure/data.csv "0.1.2"]]
  :git-dependencies [["https://github.com/ilyabo/data-tackle.git"]]
  :source-paths ["src" ".lein-git-deps/data-tackle/src/"]
  :main un-countries.core)
