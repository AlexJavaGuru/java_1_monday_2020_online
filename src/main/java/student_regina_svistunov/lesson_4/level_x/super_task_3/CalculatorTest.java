package student_regina_svistunov.lesson_4.level_x.super_task_3;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class CalculatorTest {

    Calculator calculator = new Calculator();

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEvenTest1();
        calculatorTest.isEvenTest2();
    }

    void calcTest(int actualNumber, int expectedNumber, String testName){
        if (actualNumber == expectedNumber) {
            System.out.println(testName + " test is PASSED");
        } else {
            System.out.println(testName + " test is FAILED");
        }
    }

    void evenTest(boolean actualNumber, String testName) {
        if (actualNumber) {
            System.out.println(testName + " test is PASSED");
        } else {
            System.out.printf(testName + " test is FAILED");
        }
    }

    public void sumTest() {
        calcTest(calculator.sum(10,15),25," Sum");
    }

    public void subTest() {
        calcTest(calculator.sub(10,3),7," Sub");
    }

    public void mulTest() {
        calcTest(calculator.mul(3,4),12, " Mul");
    }

    public void divTest() {
        calcTest(calculator.div(9,3),3, " Div");
    }

    public void isEvenTest1() {
        evenTest(calculator.isEven(34), " Even");
    }

    public void isEvenTest2() {
        evenTest(calculator.isEven(33)," Even" );
    }
}
