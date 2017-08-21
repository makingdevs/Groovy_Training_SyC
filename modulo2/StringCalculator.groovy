class StringCalculator {

  int add(String valor){
    if(!valor) return 0

    def expresion = splitTheString(valor)
    if(someIsZeroIn(expresion))
      transformASimpleChar(valor)
    else
      sumTheNumbers(expresion)
  }

  private def splitTheString(theString){
    theString?.split(",|\\n")
  }

  private def sumTheNumbers(numbers){
    numbers*.toInteger().sum()
  }

  private def transformASimpleChar(simpleChar){
    simpleChar.toInteger()
  }

  private def someIsZeroIn(some){
    some == 0
  }

}
