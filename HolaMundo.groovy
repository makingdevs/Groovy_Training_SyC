class HolaMundo {
  private String nombre

  void setNombre(String nombre){
    this.nombre = nombre
  }
  String getNombre(){
    return this.nombre
  }
  String saluda(){
    return "Hola " + this.nombre + " !!!"
  }
  static void main(String[] args){
    HolaMundo objeto = new HolaMundo()
    objeto.setNombre("Juan1")
    System.out.println(objeto.saluda())
  }
}
