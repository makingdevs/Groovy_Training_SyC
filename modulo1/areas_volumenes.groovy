
def areaDeUnRectangulo(base, altura){
  base * altura
}

def areaDeUnTriangulo(base, altura){
  areaDeUnRectangulo(base, altura) / 2
}

println "El area del cuadrado de 3 x 4 es ${areaDeUnRectangulo(3,4)}"
println "El area del triangulo de 3 x 4 es ${areaDeUnTriangulo(3,4)}"
