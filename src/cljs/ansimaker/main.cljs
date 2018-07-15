(ns ansimaker.main
  (:require
   [re-frame.core :as re-frame]
   [ansimaker.subs :as subs]
   [ansimaker.views.home :refer [home-panel]]
   [ansimaker.ui.layouts :refer [App-layout]]))

(defn- panels [panel-name]
  (case panel-name
    :home-panel [home-panel]
    [:div]))

(defn show-panel [panel-name]
  [panels panel-name])

(defn main-panel []
  (let [active-panel (re-frame/subscribe [::subs/active-panel])]
    (App-layout [show-panel @active-panel])))
