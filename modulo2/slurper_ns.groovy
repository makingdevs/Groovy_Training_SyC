entrenamiento = new XmlSlurper().parse("makingdevs_ns.xml")
entrenamiento.declareNamespace(fundamentals:'Essential')

//println entrenamiento.roadmap.category.course.collect { "${it.@name}" }.join("\n")
println entrenamiento.roadmap.category.'fundamentals:course'.collect { "${it.@name}" }
