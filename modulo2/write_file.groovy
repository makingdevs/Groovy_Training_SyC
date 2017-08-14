file = new File("hola.txt")
file.write "Hola mundo ${new Date()} \n"

file.append "Que onda? agregando contenido\n"
file << "Más contenido !!!"
println file.text

new File("file_copy.txt").write(file.text)

image = new File("logo.jpeg")
new File("copy_logo.jpeg").withOutputStream { out ->
  out.write image.readBytes()
}
