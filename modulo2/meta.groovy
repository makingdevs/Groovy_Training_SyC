String metodo = "findAllByNombre"
String.metaClass."${metodo}" = { "Encontrado" }
String.metaClass.metodoQueNoExiste = {
    "Como ño? aqui en '${delegate}'"
}

String s = "hola mundo"

//class MyString extends String { def mimetodo(){} }

println s.class
println s.charAt(3)
println s.metodoQueNoExiste()
println s.findAllByNombre()
println s.class