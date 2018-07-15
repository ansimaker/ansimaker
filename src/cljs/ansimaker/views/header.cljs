(ns ansimaker.views.header
  (:require [cljss.core :as css :refer-macros [defstyles]]
            [ansimaker.ui.components :as comp :refer[Link]]
            [ansimaker.ui.design-system :as confs :refer [colors]]))

(defstyles stylHeader []
  {:text-align "center"
   :padding "24px"
   "a" {:color (:purple colors)
        :font-size "20px"
        :text-transform "uppercase"
        :font-weight "bold"}})

(defn header []
  [:div {:class (stylHeader)}
    (Link {:href "#"} "Ansimaker")])
