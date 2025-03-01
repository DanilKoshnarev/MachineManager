(ns infrastructure.config
  (:require [clojure.java.jdbc :as jdbc]))

(def db-spec
  {:dbtype "postgresql"
   :dbname "machine_db"
   :user "postgres"
   :password "secret"})
