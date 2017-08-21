class StringCalculator {

  int add(String valor){
    if(!valor) return 0

    def expresion = splitTheString(valor)
    someIsZero(expresion) ? transformASimpleChar(valor)  : sumTheNumbers(expresion)
  }

  def splitTheString(theString){
    theString?.split(",|\\n")
  }

  def sumTheNumbers(numbers){
    numbers*.toInteger().sum()
  }

  def transformASimpleChar(simpleChar){
    simpleChar.toInteger()
  }

  def someIsZero(some){
    some == 0
  }

}
