def tiempo(funcion) {
  def startTime = System.currentTimeMillis()
  funcion()
  def endTime = System.currentTimeMillis()
  println "Tiempo total: ${endTime - startTime} ms."
}

def fibonacci(n){
  n < 2 ? 1 : fibonacci(n-1) + fibonacci(n-2)
}

serie = [0: 1, 1: 1]
def fibonacciAlmacenado(n) {
  if(!serie.containsKey(n)){
    serie[n] = fibonacciAlmacenado(n-1) + fibonacciAlmacenado(n-2)
  }
  serie[n]
}

def fibonacciMemoized
fibonacciMemoized = { n ->
  n < 2 ? 1 : fibonacciMemoized(n-1) + fibonacciMemoized(n-2)
}.memoize()

tiempo {
  //println fibonacci(45)
  //println fibonacciAlmacenado(40)
  println fibonacciMemoized(40)
}
