(ns ansimaker.ui.components
  (:require [cljss.reagent :refer-macros [defstyled]]
            [cljss.core :as css :refer-macros [defstyles]]
            [ansimaker.ui.design-system :refer [colors containers]]))

(defstyled Link :a
  {:text-decoration "none"})

(defstyled H1 :h1
  {:font-weight "300"
   :text-transform "uppercase"
   :color (:purple colors)
   :font-size "23px"})

(defstyled Input :input
  {:outline "none"
   :background-color "#FFF"
   :box-sizing "border-box"
   :font-size "16px"
   :border "none"
   :border-radius "4px"
   "&::-webkit-input-placeholder" {:color "#839AA6"}})

(defn Icon [name]
  [:svg {:class name} [:use {:xlinkHref (str "#" name)}]])

(defstyles linkBottomStyl []
  {:position "fixed"
   :bottom 0
   :left 0
   :width "100%"
   :text-decoration "none"
   :background (:green colors)
   :transition "padding .2s ease"
   :&:hover {:padding-left "5px"}
   "label"
   {:color "#FFF"
    :cursor "pointer"
    :padding "25px 0"
    :display "flex"
    :align-items "center"
    :justify-content "flex-end"
    :width (:medium containers)
    :margin "0 auto"
    :text-transform "uppercase"
    :font-weight "700"}
    ".icon-arrow"
    {:width "11px"
     :height "17px"
     :margin-left "15px"}})

(defn LinkBottom [text]
  [:a {:class (linkBottomStyl)}
   [:label
    [:span
     text]
    (Icon "icon-arrow")]])
