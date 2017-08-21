class StringCalculator {

  int add(String valor){
    if(valor=="") return 0

    def expresion = valor?.split(",|\\n")
    expresion == 0 ? valor.toInteger() : expresion*.toInteger().sum()
  }

}
