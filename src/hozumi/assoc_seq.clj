(ns hozumi.assoc-seq)

(defn assoc-seq
  [map key-seq val-seq]
  (if (empty? key-seq)
    map
    (loop [map map
	   key-seq key-seq
	   val-seq val-seq]
      (let [key-fs   (first key-seq)
	    val-fs   (first val-seq)]
	(if-let [key-next (next key-seq)]
	  (recur (assoc map key-fs val-fs) key-next (next val-seq))
	  (assoc map key-fs val-fs))))))

