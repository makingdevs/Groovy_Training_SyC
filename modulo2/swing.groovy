builder = new groovy.swing.SwingBuilder()

frame = builder.frame(
  title:"MakingDevs",
  size:[300,200],
  defaultCloseOperation: javax.swing.WindowConstants.EXIT_ON_CLOSE ) {
    flowLayout()
    label text:"Hello"
    button text: "Puchurrame!"
  }

frame.show()


