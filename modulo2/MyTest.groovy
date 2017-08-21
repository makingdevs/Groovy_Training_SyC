class MyTest extends GroovyTestCase {
  void testEmpty(){
    def stringCalculator = new StringCalculator()
    assert stringCalculator.add("") == 0
  }

  void testOneNumber(){
    def stringCalculator = new StringCalculator()
    assert stringCalculator.add("3") == 3
  }
}
