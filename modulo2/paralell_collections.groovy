import static groovyx.gpars.GParsPool.withPool

jobs = [300,400,500,100,500,800,900,200]*2
/*
withPool(20) {
    startTime = System.currentTimeMillis()
    jobs.eachParallel {
        Thread.sleep it
        println "Terminando ${it}"
    }
    endTime = System.currentTimeMillis()
}
println "Tardó: ${endTime - startTime} ms"
*/

def any(list){
    list.each {
        Thread.sleep it
        println it
    }
}

withPool(20) {
    any(jobs.makeConcurrent())
}