(ns main
  (:require [app.controllers.machine-controller :as machine])
  (:gen-class))

(defn -main []
  (let [physical-machine {:id 1 :name "Server1" :status "Running" :ip-address "192.168.1.1"}
        virtual-machine {:id 2 :name "VM1" :status "Running" :host-id 1}]
    (machine/create-machine-handler physical-machine)
    (machine/create-machine-handler virtual-machine)
    (println "All machines: " (machine/view-all-machines-handler))
    (println "Machine by ID: " (machine/view-machine-handler 1))
    (machine/remove-machine-handler 1)
    (println "All machines after deletion: " (machine/view-all-machines-handler))))
