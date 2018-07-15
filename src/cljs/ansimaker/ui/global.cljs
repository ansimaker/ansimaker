(ns ansimaker.ui.global
  (:require [cljss.core :refer [font-face inject-global]]))

(inject-global
 {:body     {:margin 0 :font-family "Roboto, sans-serif"}
  :ul       {:list-style "none"}
  "h1, h2, h3" {:margin "0"}})
