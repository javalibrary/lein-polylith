(ns leiningen.polylith.cmd.help.test)

(defn help []
  (println "  Execute tests.")
  (println)
  (println "  lein polylith test [ARG] [SKIP]")
  (println "    ARG = (omitted) -> Since last successful build, stored in bookmark")
  (println "                       :last-successful-build in WS-ROOT/.polylith/time.edn. or")
  (println "                       :last-successful-build in WS-ROOT/.polylith/git.edn if")
  (println "                       you have CI variable set to something on the machine.")
  (println "          timestamp -> Since the given timestamp (milliseconds since 1970).")
  (println "          git-hash  -> Since the given git hash if CI variable set.")
  (println "          bookmark  -> Since the timestamp for the given bookmark in WS-ROOT/.polylith/time.edn or")
  (println "                       since the git hash for the given bookmark in WS-ROOT/.polylith/git.edn if CI")
  (println "                       variable set.")
  (println)
  (println "    SKIP = (omitted) -> Compiles and tests")
  (println "           -compile -> Skips compilation step")
  (println)
  (println "  examples:")
  (println "    lein polylith test")
  (println "    lein polylith test -compile")
  (println "    lein polylith test 1523649477000")
  (println "    lein polylith test 7d7fd132412aad0f8d3019edfccd1e9d92a5a8ae")
  (println "    lein polylith test mybookmark")
  (println "    lein polylith test mybookmark -compile"))
