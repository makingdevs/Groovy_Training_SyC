//def factorial(BigInteger n) {
//  n == 1 ? 1 : n * factorial(n-1)
//}

def factorial
factorial = { int number, BigInteger theFactorial ->
  number == 1 ?
    theFactorial :
    factorial.trampoline(number -1, number * theFactorial)
}.trampoline()

//println "Factorial de 5 = ${factorial(4000)}"
println "Factorial de 5 = ${factorial(5000, 1)}"
