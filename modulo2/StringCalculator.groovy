class StringCalculator {

  int add(String valor){
    if(valor==""){
      0
    }
    else if(valor?.split(",") == 0 ){
      valor.toInteger()
    }else{
      valor.split(",").collect{ it.toInteger() }.sum()
    }
  }

}
