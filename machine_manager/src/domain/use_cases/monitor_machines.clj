(ns domain.use-cases.monitor-machines
  (:require [domain.repositories.machine-repository :as repo]))

(defn monitor-machines [repo]
  (let [machines (repo/find-all-machines repo)]
    machines))
