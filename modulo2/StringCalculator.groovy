class StringCalculator {

  int add(String valor){
    if(valor==""){
      0
    }
    else if(valor?.split(",|\\n") == 0 ){
      valor.toInteger()
    }else{
      valor.split(",|\\n").collect{
        it == "\n" ? 0 : it.toInteger()
      }.sum()
    }
  }

}
