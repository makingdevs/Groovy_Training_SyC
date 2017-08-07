class HolaMundo {
  String nombre

  def saluda(){
    "Hola $nombre !!!"
  }
  static main(args){
    def objeto = new HolaMundo()
    objeto.setNombre("Juan5")
    println(objeto.saluda())
  }
}
