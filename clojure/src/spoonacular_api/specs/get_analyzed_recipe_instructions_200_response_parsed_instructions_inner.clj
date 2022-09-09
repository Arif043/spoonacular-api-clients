(ns spoonacular-api.specs.get-analyzed-recipe-instructions-200-response-parsed-instructions-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [spoonacular-api.specs.get-analyzed-recipe-instructions-200-response-parsed-instructions-inner-steps-inner :refer :all]
            )
  (:import (java.io File)))


(def get-analyzed-recipe-instructions-200-response-parsed-instructions-inner-data
  {
   (ds/req :name) string?
   (ds/opt :steps) (s/coll-of get-analyzed-recipe-instructions-200-response-parsed-instructions-inner-steps-inner-spec)
   })

(def get-analyzed-recipe-instructions-200-response-parsed-instructions-inner-spec
  (ds/spec
    {:name ::get-analyzed-recipe-instructions-200-response-parsed-instructions-inner
     :spec get-analyzed-recipe-instructions-200-response-parsed-instructions-inner-data}))
