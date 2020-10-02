package student_aleksejs_ivanovs.homework.lesson_7.level_6.task_10;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.exponentiationTest();
        test.exponentiationTestTwo();
        test.exponentiationTestThree();
        test.exponentiationTestFour();
    }

    public void exponentiationTest() {
        PowerCalculator number = new PowerCalculator();

        double actualResult = number.exponentiation(2,2);

        double expectedResult = 4;

        check(expectedResult, actualResult, "exponentiationTest");
    }

    public void exponentiationTestTwo() {
        PowerCalculator number = new PowerCalculator();

        double actualResult = number.exponentiation(3,4);

        double expectedResult = 81;

        check(expectedResult, actualResult, "exponentiationTestTwo");
    }

    public void exponentiationTestThree() {
        PowerCalculator number = new PowerCalculator();

        double actualResult = number.exponentiation(30,5);

        double expectedResult = 24300000;

        check(expectedResult, actualResult, "exponentiationTestThree");
    }

    public void exponentiationTestFour() {
        PowerCalculator number = new PowerCalculator();

        double actualResult = number.exponentiation(3,-3);

        double expectedResult = 0.037037037037037035;

        check(expectedResult, actualResult, "exponentiationTestFour");
    }

    private void check(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedResult + " but actual result was : " + actualResult);
        }
    }
}
