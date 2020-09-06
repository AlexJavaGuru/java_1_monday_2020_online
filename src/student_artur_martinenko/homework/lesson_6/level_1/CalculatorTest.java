package student_artur_martinenko.homework.lesson_6.level_1;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculator_test = new CalculatorTest();
        calculator_test.isEvenTest();
        calculator_test.isOddTest();

    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println("Test " + testName + " - OK");
        } else {
            System.out.println("Test " + testName + " - FAILED");
        }
    }

    public void isEvenTest() {
        Calculator calculator = new Calculator();
        check(calculator.isEven(2), "isEvenTest");
    }

    public void isOddTest() {
        Calculator calculator = new Calculator();
        check(!calculator.isEven(3), "isOddTest");
    }

}