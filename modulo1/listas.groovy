lista = []
println lista.class
lista = ["Uno","Dos","'Tres'"]
lista.add(4)
lista += 5
lista += ['"Cinco"', "Seis"]
lista -= '"Cinco"'
lista << "Siete"
lista << "Ocho" << "Nueve"
lista = lista * 2 
sublista = lista[3..6]

// for(item in lista){ println item }
lista.each { println it }
println sublista
println lista
println lista[-3..2]
println lista.find { it == "Dos" }
println lista.findAll { it == "Dos" }
println lista.join(",")
println lista.findAll { 
    it.class == String 
}.collect { 
    it.size() 
}.collect { 
    it*it*it 
}.sum()
