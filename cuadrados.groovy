def cuadrado(n, closure){
  for(int i = -10 ; i <= n; i++)
    closure(i)
}

//cuadrado(20, { if(it%2 == 0) println "El cuadrado de $it es ${it*it}" })
//cuadrado(20) { if(it%2 == 1) println "El cuadrado de $it es ${it*it}" }
cuadrado(20) { n ->
  if(n%3 == 0)
    println "El cuadrado de $n es ${n*n}"
}
