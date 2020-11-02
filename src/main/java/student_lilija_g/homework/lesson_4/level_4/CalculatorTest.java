package student_lilija_g.homework.lesson_4.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class CalculatorTest {

    Calculator calculator = new Calculator();

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.multiplyTest();
        calculatorTest.divisionTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.maxOfThreeNumbersTest();

    }

    void totalTest(int expectedValue, int actualValue, String testName) {
        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    void totalTestBoolean(boolean expendedValue, boolean actualValue, String testName) {
        if (expendedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

    void sumTest() {
        totalTest(15, calculator.sum(10,5),"Sum");
    }

    void subtractionTest() {
        totalTest(5,calculator.subtraction(10,5),"Subtraction");
    }

    void multiplyTest() {
        totalTest(50,calculator.multiply(10,5),"Multiply");
    }

    void divisionTest() {
        totalTest(2,calculator.division(10,5),"Division");
    }

    void isEvenTest() {
        totalTestBoolean(true, calculator.isEven(10), "is Even");
        totalTestBoolean(false,calculator.isEven(5), "is Odd");
    }

    void maxOfTwoNumbersTest() {
        totalTest(10, calculator.maxOfTwoNumbers(10, 5), "MaxOfTwoNumbers Test");
        totalTest(10, calculator.maxOfTwoNumbers(5, 10), "MaxOfTwoNumbers Test");
        totalTest(10, calculator.maxOfTwoNumbers(10, 10), "MaxOfTwoNumbers Test");
    }

    void maxOfThreeNumbersTest() {

        totalTest(15,calculator.maxOfThreeNumbers(5,10,15),"MaxOfThreeNumbers Test");
        totalTest(15,calculator.maxOfThreeNumbers(15,10,5),"MaxOfThreeNumbers Test");
        totalTest(15,calculator.maxOfThreeNumbers(5,15,10),"MaxOfThreeNumbers Test");
        totalTest(10,calculator.maxOfThreeNumbers(5,5,10),"MaxOfThreeNumbers Test");
        totalTest(10,calculator.maxOfThreeNumbers(5,10,10),"MaxOfThreeNumbers Test");
        totalTest(10,calculator.maxOfThreeNumbers(10,10,10),"MaxOfThreeNumbers Test");

    }

}



