class MyTest extends GroovyTestCase {
  void testEmpty(){
    def stringCalculator = new StringCalculator()
    assert stringCalculator.add("") == 0
  }

  void testOneNumber(){
    def stringCalculator = new StringCalculator()
    assert stringCalculator.add("3") == 3
  }

  void testTwoNumber(){
    def stringCalculator = new StringCalculator()
    assert stringCalculator.add("3,5") == 8
    assert stringCalculator.add("5,5") == 10
    assert stringCalculator.add("5,10") == 15
  }

  void testAnyNumbers(){
    def stringCalculator = new StringCalculator()
    assert stringCalculator.add("1,2,3,4,5") == 15
    assert stringCalculator.add("10,20,30,40,50") == 150
    assert stringCalculator.add("1,1,1,1,1,1,1,1,1") == 9

  }

  void testAnyNumbersWithNewLines(){
    def stringCalculator = new StringCalculator()
    assert stringCalculator.add("1,2\n3\n4,5") == 15
    assert stringCalculator.add("10\n20,30\n40,50") == 150
    assert stringCalculator.add("1\n1,1\n1,1\n1,1,1,1") == 9

  }
}
