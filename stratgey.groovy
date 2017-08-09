def validador(elemento, esValido){
  if(esValido(elemento))
    println "OK!"
  else
    println "ERROR"
}

def validacion = { it == it.reverse() }
def validacion2 = { it.size() > 5 }

validador("hola mundo", validacion)
validador("anitalavalatina", validacion)
validador("anitalavalatina", validacion2)
