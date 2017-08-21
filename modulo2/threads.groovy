syncronyzed = 0
threads = []
3.times { 
    threads << Thread.start { 
        sleep 5000
        println "Hola mundo"
        x+=4 
    } 
}
threads*.join()
println x