(ns app.controllers.machine-controller
  (:require [domain.use-cases.manage-machines :as use-cases]
            [infrastructure.persistence.database.machine-repository-impl :refer [MachineRepositoryImpl]]
            [infrastructure.config :refer [db-spec]]))

(def repo (->MachineRepositoryImpl db-spec))

(defn create-machine-handler [machine]
  (use-cases/create-machine repo machine))

(defn view-machine-handler [id]
  (use-cases/view-machine repo id))

(defn view-all-machines-handler []
  (use-cases/view-all-machines repo))

(defn remove-machine-handler [id]
  (use-cases/remove-machine repo id))
