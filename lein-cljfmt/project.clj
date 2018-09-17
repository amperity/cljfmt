(defproject amperity/lein-cljfmt "0.7.0-SNAPSHOT"
  :description "A library for formatting Clojure code"
  :url "https://github.com/amperity/cljfmt"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :eval-in-leiningen true

  :dependencies
  [[amperity/cljfmt "0.7.0-SNAPSHOT"]
   [meta-merge "0.1.1"]
   [com.googlecode.java-diff-utils/diffutils "1.2.1"]])
