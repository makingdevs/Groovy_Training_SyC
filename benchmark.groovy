def tiempo(funcion) {
  def startTime = System.currentTimeMillis()
  funcion()
  def endTime = System.currentTimeMillis()
  println "Tiempo total: ${endTime - startTime} ms."
}

def fibonacci(n){
  n < 2 ? 1 : fibonacci(n-1) + fibonacci(n-2)
}

tiempo {
  println fibonacci(50)
}
