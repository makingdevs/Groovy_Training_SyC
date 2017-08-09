class Calculadora {
  def operacion
  Calculadora(_operacion_) { operacion = _operacion_ }
  def operar(n){
    println "Operando"
    operacion(n)
  }
}
c = { it * it }
c1 = new Calculadora(c)
c2 = new Calculadora({ it+it })
println c1.operar(10)
println c2.operar(10)
