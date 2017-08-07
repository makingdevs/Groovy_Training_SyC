public class HolaMundo {
  private String nombre;

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getNombre(){
    return this.nombre;
  }
  public String saluda(){
    return "Hola " + this.nombre + " !!!";
  }
  public static void main(String[] args){
    HolaMundo objeto = new HolaMundo();
    objeto.setNombre("Juan0");
    System.out.println(objeto.saluda());
  }
}
