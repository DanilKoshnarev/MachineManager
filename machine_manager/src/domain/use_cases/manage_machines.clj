(ns domain.use-cases.manage-machines
  (:require [domain.entities.physical-machine :as pm]
            [domain.entities.virtual-machine :as vm]
            [domain.repositories.machine-repository :as repo]))

(defn create-machine [repo machine]
  (repo/save-machine repo machine))

(defn view-machine [repo id]
  (repo/find-machine-by-id repo id))

(defn view-all-machines [repo]
  (repo/find-all-machines repo))

(defn remove-machine [repo id]
  (repo/delete-machine repo id))
