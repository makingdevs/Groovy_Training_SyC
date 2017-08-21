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
}
