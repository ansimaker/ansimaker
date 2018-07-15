(ns ansimaker.ui.layouts
  (:require [ansimaker.views.header :refer [header]]))

(defn App-layout [children]
  [:div {:class "app-layout"}
   [header]
   [:main
    children]])
