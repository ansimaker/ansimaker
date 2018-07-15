(ns ansimaker.subs
  (:require
   [re-frame.core :as re-frame]))

(re-frame/reg-sub
 ::active-panel
 (fn [db _]
   (:active-panel db)))

(re-frame/reg-sub
 :project-name
 (fn [db]
   (.log js/console db)
   (:project-name db)))
