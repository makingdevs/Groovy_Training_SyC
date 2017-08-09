def divisibleEntre3(n){ n%3 == 0  }
def divisibleEntre5(n){ n%5 == 0  }
def divisibleEntre3y5(n){ divisibleEntre3(n) && divisibleEntre5(n)  }

def fizzbuzz(n){
  for(int i = 1; i<=n; i++){
      if(divisibleEntre3y5(i)) println "FizzBuzz"
      else if (divisibleEntre3(i) ) println "Fizz"
      else if(divisibleEntre5(i)) println "Buzz"
      else println i
  }
}

fizzbuzz(25)
