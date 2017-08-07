class HolaMundo2 {
  String nombre
  def saluda(){ "Hola $nombre !!!" }
}

def objeto = new HolaMundo2(nombre:"Juan7")
println(objeto.saluda())
