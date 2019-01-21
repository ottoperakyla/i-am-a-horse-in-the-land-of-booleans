(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x] (not (or (nil? x) (false? x))))

(defn abs [x] (if (< x 0) (* -1 x) x))

(defn divides? [m n] (= 0 (mod n m)))

(defn fizzbuzz [n]
  (cond
    (divides? 15 n) "gotcha!"
    (divides? 5 n) "buzz"
    (divides? 3 n) "fizz"
    :else ""))

(defn teen? [n] (<= 13 n 19))

(defn not-teen? [age] (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (* 2 x)
    (empty? x) nil
    (or (list? x) (vector? x)) (* 2 (count x))
    :else true))

(defn leap-year? [x]
  (or (divides? 400 x)
      (and (divides? 4 x) (not (divides? 100 x)))))


