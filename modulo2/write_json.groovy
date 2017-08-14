import groovy.json.*

def jsonBuilder = new JsonBuilder()

jsonBuilder.curso {
  nombre 'Productividad con Groovy'
  duracionEnHoras 10
  instructor "MakingDevs"
  alumnos {
    alumno1 {
      nombre "Desire"
    }
    alumno2 {
      nombre "Xiomara"
    }
  }
}

println jsonBuilder.toString()

println JsonOutput.prettyPrint(jsonBuilder.toString())
