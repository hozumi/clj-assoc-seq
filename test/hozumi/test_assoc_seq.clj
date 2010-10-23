(ns hozumi.test-assoc-seq
  (:use [hozumi.assoc-seq] :reload)
  (:use [clojure.test]))

(deftest test-assoc-seq
  (is (= {} (assoc-seq {} [] [])))
  (is (= {:a 1} (assoc-seq {} [:a] [1])))
  (is (= {:a 1, :b 2, :c 3} (assoc-seq {} [:a :b :c] [1 2 3])))
  (is (thrown? IllegalArgumentException (assoc-seq {} :a 1))))
