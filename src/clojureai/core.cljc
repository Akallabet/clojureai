(ns clojureai.core
  (:require '[clojure.string :as str]))

(defn init [x] (str "Open AI" " " x))

(comment
  (init "Chat"))