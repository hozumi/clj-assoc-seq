# clj-assoc-line

assoc-seq is taking key-seq and value-seq.

## Usage

    (use 'hozumi.assoc-seq)

    (assoc-seq {} [:a] [1])
    ;=> {:a 1}
    (assoc-seq {} [:a :b :c] [1 2 3])
    ;=> {:c 3, :b 2, :a 1}

## Installation

Leiningen
[org.clojars.hozumi/clj-assoc-seq "1.0.0-SNAPSHOT"]
