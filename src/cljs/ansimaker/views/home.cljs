(ns ansimaker.views.home
  (:require [cljss.core :as css :refer-macros [defstyles]]
            [ansimaker.ui.components :refer[Link H1 Input Icon]]
            [re-frame.core :as re-frame]))

(defstyles home []
  {:text-align "center"
   :height "calc(100vh - 193px)"
   :padding-top "120px"
   :background-color "#f5f8fd"
   "input" {:width "100%"
            :height "70px"
            :color "#839AA6"
            :margin-top "50px"
            :padding-left "100px"}})

(defstyles description []
  {:color "#839AA6"})

(defstyles container []
  {:max-width "860px"
   :position "relative"
   :margin "0 auto"
   ".icon-folder" {:position "absolute"
                   :width "56px"
                   :height "41px"
                   :left "22px"
                   :top "142px"}})

(defn InputSearch []
  (let [value (re-frame/subscribe [:project-name])]
    (Input {:placeholder "project name..."
            :on-change (re-frame/dispatch [::project-name (-> % .-target .-value)])})))

(defn home-panel []
  [:section {:class (home)}
   [:div {:class (container)}
    (H1 "Automate everything in a few clicks")
    [:p {:class (description)}
     "Ansimaker provides an easy to use interface
      that helps you generate Ansible Playbooks."]
    (InputSearch)
    (Icon "icon-folder")]])
