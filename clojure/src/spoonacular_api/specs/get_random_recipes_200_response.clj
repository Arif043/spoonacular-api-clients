(ns spoonacular-api.specs.get-random-recipes-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [spoonacular-api.specs.get-random-recipes-200-response-recipes-inner :refer :all]
            )
  (:import (java.io File)))


(def get-random-recipes-200-response-data
  {
   (ds/req :recipes) (s/coll-of get-random-recipes-200-response-recipes-inner-spec)
   })

(def get-random-recipes-200-response-spec
  (ds/spec
    {:name ::get-random-recipes-200-response
     :spec get-random-recipes-200-response-data}))
