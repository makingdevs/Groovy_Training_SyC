@groovy.transform.ToString(includeNames=true)
class Curso {
  String nombre
  Integer duracion
  BigDecimal costo

}

println new Curso(nombre:"Groovy", duracion:40,costo:3000)
