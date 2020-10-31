package student_artur_martinenko.homework.lesson_4.level_x;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {
    private static Calculator calculator = new Calculator();

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    public void mainTest(int returnedNumber, int expectedNumber, String testName){
        if (returnedNumber == expectedNumber) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    public void mainTest(boolean returnedNumber, String testName){
        if (returnedNumber) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }


    public void sumTest() {
        mainTest(calculator.sum(35, 40), 75, "Sum");
    }

    public void subTest() {
        mainTest(calculator.sub(35, 15), 20, "Sub");
    }

    public void mulTest() {
        mainTest(calculator.mul(5, 5), 25, "Mul");
    }

    public void divTest() {
        mainTest(calculator.div(40, 8), 5, "Div");
    }

    public void isEvenTest1() {
        mainTest(calculator.isEven(40), "isEven");
    }

    public void isEvenTest2() {
        mainTest(!calculator.isEven(41), "isEven 2");
    }
}