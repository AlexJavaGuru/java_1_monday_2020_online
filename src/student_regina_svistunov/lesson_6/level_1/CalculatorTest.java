package student_regina_svistunov.lesson_6.level_1;

class CalculatorTest {

    Calculator calculator = new Calculator();

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEvenTest();
    }

    void isEvenTest() {
        mainTest(true, calculator.isEven(24), "is Even");
        mainTest(false, calculator.isEven(13),"is Even");

    }

    void mainTest ( boolean excectedResult, boolean actualResult, String testName) {
        if (excectedResult == actualResult) {
            System.out.println(testName + " test is passed!");
        } else {
            System.out.println(testName + " test is failed!");
        }
    }


}