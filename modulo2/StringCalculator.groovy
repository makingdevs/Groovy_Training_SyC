class StringCalculator {

  int add(String valor){
    if(valor==""){
      0
    }
    else if(valor?.split(",|\\n") == 0 ){
      valor.toInteger()
    }else{
      valor.split(",|\\n").collect{
        if( it == "\n" )
          0
        else
          it.toInteger()
      }.sum()
    }
  }

}
