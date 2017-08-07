#!/usr/bin/env groovy

println "Hola mundo !!!"
ArrayList list =  new ArrayList()
list.add(1)
list.add(1)
list.add(1)
list.add(1)

for(def a: list){
  println a
}

println "ls -l".execute().text
println "touch some.txt; echo 'hola' >> some.txt".execute().text
