(ns infrastructure.persistence.database.machine-repository-impl
  (:require [domain.entities.physical-machine :as pm]
            [domain.entities.virtual-machine :as vm]
            [domain.repositories.machine-repository :refer [MachineRepository]]))

(defrecord MachineRepositoryImpl [db]
  MachineRepository
  (save-machine [this machine]
    )
  (find-machine-by-id [this id]
    )
  (find-all-machines [this]
    )
  (delete-machine [this id]
    ))
