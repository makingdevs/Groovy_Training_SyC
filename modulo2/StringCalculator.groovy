class StringCalculator {

  int add(String valor){
    if(valor=="") return 0

    def expresion = valor?.split(",|\\n")
    if(expresion == 0 )
      valor.toInteger()
    else
      expresion*.toInteger().sum()
  }

}
