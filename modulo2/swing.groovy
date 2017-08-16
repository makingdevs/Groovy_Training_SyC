builder = new groovy.swing.SwingBuilder()

contador = 0

frame = builder.frame(
  title:"MakingDevs",
  size:[300,200],
  defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE ) {
    flowLayout()
    lbl = label text:"Hello"
    button text: "Puchurrame!", actionPerformed: {
      contador++
      lbl.text = "Pusheado ${contador} veces"
    }
  }

frame.show()


