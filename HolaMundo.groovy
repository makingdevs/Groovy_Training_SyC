class HolaMundo {
  String nombre

  def saluda(){
    return "Hola $nombre !!!"
  }
  static void main(args){
    def objeto = new HolaMundo()
    objeto.setNombre("Juan4")
    println(objeto.saluda())
  }
}
