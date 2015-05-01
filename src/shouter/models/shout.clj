(ns shouter.models.shout
  (:require [clojure.java.jdbc :as sql]
            [yesql.core :refer [defquery]]))

(def spec (or (System/getenv "DATABASE_URL")
              "postgresql://localhost:5432/shouter"))

(defquery shouts-by-id "shouts-by-id.sql")
(defquery insert-shout! "insert-shout.sql")

(defn all []
  (shouts-by-id spec))

(defn create [shout]
  (insert-shout! spec shout))
