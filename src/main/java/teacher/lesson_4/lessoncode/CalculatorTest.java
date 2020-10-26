package teacher.lesson_4.lessoncode;

public class CalculatorTest {

    public void test_1() {

        Calculator victim = new Calculator();

        int inputA = 10;
        int inputB = 5;

        int actualResult = victim.sum(inputA, inputB);

        int expectedResult = 15;

        check(expectedResult, actualResult, "Test1");

    }

    public void test_2() {
        Calculator victim = new Calculator();

        int inputA = 2;
        int inputB = 2;

        int actualResult = victim.sum(inputA, inputB);

        int expectedResult = 4;

        check(expectedResult, actualResult, "Test2");
    }

    public void test_3() {
        Calculator victim = new Calculator();

        int inputA = 10;
        int inputB = 2;

        double actualResult = victim.division(inputA, inputB);

        double expectedResult = 5.0;

        check(expectedResult, actualResult, "Test3");
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was " + expectedResult + " but actual result " + actualResult);
        }
    }

    public void check(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was " + expectedResult + " but actual result " + actualResult);
        }
    }

//    public void check(String expectedResult, String actualResult, String testName) {
//        //.equals "ABV" = "ABV"
//        if (expectedResult.equals(actualResult)) {
//            System.out.println(testName + " has passed");
//        } else {
//            System.out.println(testName + " failed!");
//            System.out.println("Expected result was " + expectedResult + " but actual result " + actualResult);
//        }
//    }

}
