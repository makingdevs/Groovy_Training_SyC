class HolaMundo {
  String nombre

  def saluda(){
    return "Hola " + this.nombre + " !!!"
  }
  static void main(args){
    def objeto = new HolaMundo()
    objeto.setNombre("Juan3")
    println(objeto.saluda())
  }
}
