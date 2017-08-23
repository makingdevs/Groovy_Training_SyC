viewResolver = ViewResolver.instance
view = viewResolver.resolveView("form.html", [nombre:"Juanito"])

out << view.toString()

