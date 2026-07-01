(ns os-test
  (:require [clojure.test :refer [deftest is testing]]
            [os]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? os))))
