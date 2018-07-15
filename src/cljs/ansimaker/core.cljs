(ns ansimaker.core
  (:require
   [reagent.core :as reagent]
   [re-frame.core :as re-frame]
   [ansimaker.events :as events]
   [ansimaker.routes :as routes]
   [ansimaker.main :as main]
   [ansimaker.config :as config]))

(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [main/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (routes/app-routes)
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
