(ns ansimaker.ui.components
  (:require [cljss.reagent :refer-macros [defstyled]]
            [ansimaker.ui.design-system :refer [colors]]))

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

