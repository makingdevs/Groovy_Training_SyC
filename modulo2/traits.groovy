interface Math {
    def multiplo()
}
trait FormatMath {
    String nombre
    def peso
    def multiplo() { peso ?: 1 * factor() }
    def format() { "*${this.nombre}*" }
    abstract factor()
}
trait Otro {
    def saluda() { "Hello!" }
}

class A {
    def factor() { 1 }
}

class B implements FormatMath, Otro {
    def factor() { 2 }
}
class C implements FormatMath { 
    def factor() { 3 }
}

//a = new A(nombre:"Juan")
//imprime(a)
b = new B()
b.nombre = "Angel"
b.peso = 50
imprime(b)
c = new C()
c.nombre = "Toño"
c.peso = 23.23
imprime(c)
println b.saluda()

def imprime(FormatMath  m){
    println m.format()
    println m.multiplo()
}