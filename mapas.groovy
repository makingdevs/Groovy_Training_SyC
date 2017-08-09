m = [:]
println m.size()
m = [dos:2,tres:3]
println m.getClass()
m.put("uno", 1)
m.cuatro = 4
println m
println m.ncdncjsdnj ?: "Sin valor"
println m.tres
m.tres = 333
//m.each { println "$it.key ==== $it.value" } 
m.each { k,v -> println "$k ==== $v" } 
println m.collect { k,v -> "$k ==== $v" }
println m.find { k,v -> v > 2 }
println m.findAll { k,v -> v > 2 }