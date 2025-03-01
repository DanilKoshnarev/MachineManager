(defproject machine-management "0.1.0-SNAPSHOT"
  :description "Система управления физическими и виртуальными машинами"
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/java.jdbc "0.7.12"]
                 [postgresql/postgresql "42.2.18"]]
  :main ^:skip-aot main
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
