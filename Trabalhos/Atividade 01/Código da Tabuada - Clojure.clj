( println "Tabuada\n")

(defn tabuada [numero]
  ( doseq [ i ( range 1 11 ) ]
    (println ( format "%d x %d = %d" numero i (* numero i ) ) ) )  
)

(tabuada 4)                        

