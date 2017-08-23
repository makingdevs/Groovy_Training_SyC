import groovy.text.SimpleTemplateEngine

model = [nombre : "Juanito", siguienteFecha: new Date() + 30, organizacion: "SyC"]
text = new File("index.php").text

engine = new SimpleTemplateEngine()
tmpl = engine.createTemplate(text).make(model)

println tmpl.toString()
