(ns domain.repositories.machine-repository
  (:require [domain.entities.physical-machine :as pm]
            [domain.entities.virtual-machine :as vm]))

(defprotocol MachineRepository
  (save-machine [repo machine])
  (find-machine-by-id [repo id])
  (find-all-machines [repo])
  (delete-machine [repo id]))
