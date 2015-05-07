(ns shouter.views.layout
  (:require [hiccup.page :as h]))

(defn common [title & body] 
  (h/html5 [:html {:lang "en"} 
            [:head  
             [:meta {:http-equiv "Content-Type", :content "text/html; charset=UTF-8"}]  
             [:meta {:name "viewport", :content "width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"}]  
             [:title title] 
             [:link {:href "css/materialize.css", :type "text/css", :rel "stylesheet", :media "screen,projection"}]]  
            [:body  
             [:nav {:class "light-blue lighten-1", :role "navigation"}  
              [:div {:class "nav-wrapper container"} 
               [:a {:id "logo-container", :href "#", :class "brand-logo"} 
                [:i {:class "mdi-av-volume-up"}]]  
               [:ul {:class "right hide-on-med-and-down"}]  
               [:ul {:id "nav-mobile", :class "side-nav"}]  
               [:a {:href "#", :data-activates "nav-mobile", :class "button-collapse"} 
                [:i {:class "mdi-navigation-menu"}]] ] ]  
             [:div {:class "section no-pad-bot", :id "index-banner"}  
              [:div {:class "container"} body]]    
             [:script {:src "https://code.jquery.com/jquery-2.1.1.min.js"}]  
             [:script {:src "js/materialize.js"}]]]))

(defn four-oh-four []
  (common "Page Not Found"
          [:div {:id "four-oh-four"}
           "The page you requested could not be found"]))
