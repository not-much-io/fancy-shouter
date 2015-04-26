(ns shouter.views.shouts
  (:require [shouter.views.layout :as layout]
            [hiccup.core :refer [h]]
            [hiccup.form :as form]))

(form/submit-button "Name")

(defn shout-form []
  [:div {:id "shout-form" :class "input-field col s12"}
   (form/form-to [:post "/"]
                 (form/label "shout" "What do you want to SHOUT?")
                 (form/text-field {:class "input-field"} "shout")
                 [:button {:class "btn waves-effect waves-light" :type "submit"
                           :name "action"}
                  "Submit"
                  [:i {:class "mdi-content-send right"}]])])

(defn display-shouts [shouts]
  [:div 
   [:ul {:class "collection"}
    (map
     (fn [shout] [:li {:class "collection-item"} (h (:body shout))])
     shouts)]])

(defn index [shouts]
  (layout/common "SHOUTER"
                 (shout-form)
                 [:div {:class "clear"}]
                 (display-shouts shouts)))





