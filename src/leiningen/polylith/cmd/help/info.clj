(ns leiningen.polylith.cmd.help.info
  (:require [leiningen.polylith.cmd.shared :as shared]))

(defn help []
  (println "  Shows the content of a Polylith workspace and its changes since")
  (println "  the last successful test or build or a given point in time.")
  (println)
  (println "  Each row is followed by an * if something has changed.")
  (println "  Each row is followed by a (*) if nothing has changed but it")
  (println "  depends on one or more components that have changed.")
  (println)
  (println "  lein polylith info [ARG]")
  (println "    ARG = (omitted) -> Since last successful test or build, stored in bookmark")
  (println "                       :last-success in WS-ROOT/.polylith/time.edn")
  (println "                       or :last-success in WS-ROOT/.polylith/git.edn")
  (println "                       if you have the CI variable set to something on the machine.")
  (println "          timestamp -> Since the given timestamp (milliseconds since 1970).")
  (println "          git-hash  -> Since the given git hash if the CI variable is set.")
  (println "          bookmark  -> Since the timestamp for the given bookmark in")
  (println "                       WS-ROOT/.polylith/time.edn or since the git hash")
  (println "                       for the given bookmark in WS-ROOT/.polylith/git.edn")
  (println "                       if the CI variable set.")
  (println)
  (println "  example:")
  (println "    lein polylith info")
  (if (shared/ci?)
    (println "    lein polylith info 7d7fd132412aad0f8d3019edfccd1e9d92a5a8ae")
    (println "    lein polylith info 1523649477000"))
  (println "    lein polylith info mybookmark"))
