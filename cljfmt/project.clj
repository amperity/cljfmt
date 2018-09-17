(defproject amperity/cljfmt "0.7.0-SNAPSHOT"
  :description "A library for formatting Clojure code"
  :url "https://github.com/amperity/cljfmt"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :plugins
  [[lein-cljsbuild "1.1.2"]
   [lein-cloverage "1.0.10"]]

  :dependencies
  [[org.clojure/clojure "1.8.0"]
   [org.clojure/tools.reader "1.0.0-alpha4"]
   [rewrite-clj "0.5.2"]
   [rewrite-cljs "0.4.3"]]

  :hooks [leiningen.cljsbuild]

  :cljsbuild {:builds
              {"dev" {:source-paths ["src" "test"]
                      :compiler {:main cljfmt.test-runner
                                 :output-to "target/out/tests.js"
                                 :output-dir "target/out"
                                 :target :nodejs
                                 :optimizations :none}}}
              :test-commands
              {"dev" ["nodejs" "target/out/tests.js"]}}

  :profiles
  {:provided
   {:dependencies [[org.clojure/clojurescript "1.7.228"]]}

   :repl
   {:source-paths ["dev"]
    :dependencies [[org.clojure/tools.namespace "0.2.11"]]}})
