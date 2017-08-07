class HolaMundo {
  String nombre

  def saluda(){
    "Hola $nombre !!!"
  }
  static main(args){
    def objeto = new HolaMundo(nombre:"Juan6")
    println(objeto.saluda())
    objeto.setNombre("SyC")
    println(objeto.saluda())
    objeto.nombre = "Groovy"
    println(objeto.saluda())
    objeto['nombre'] = "Training"
    println(objeto.saluda())
  }
}
