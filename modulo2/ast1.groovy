//@groovy.transform.ToString(includeNames=true)
//@groovy.transform.EqualsAndHashCode
//@groovy.transform.TupleConstructor
@groovy.transform.Canonical
class Curso {
  String nombre
  Integer duracion
  BigDecimal costo
}

c1 = new Curso(nombre:"Groovy", duracion:40,costo:3000)
c2 = new Curso(nombre:"Groovy", duracion:40,costo:3000)
println c1
println c2
println c1 == c2
c3 = new Curso("VertX")
c4 = new Curso("VertX", 30)
c5 = new Curso("VertX", 30, 23.23)
println c3
println c4
println c5
