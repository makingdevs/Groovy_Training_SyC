f = new File("archivos.groovy")

println f.text
root = new File("/") // C:\
println root.class
dirs = []
files = []

root.eachDir { dirs << it.name }
root.eachFile { files << it.name }

println dirs
println files

local = new File(".")
println local.properties

lines = f.readLines()
println lines

f.splitEachLine(" "){ line ->
 println line
}
