package student_lilija_g.homework.lesson_4.level_x.super_task_3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.testOperation(35, 40, 75, "Sum");
        calculatorTest.testOperation(35, 15, 20, "Sub");
        calculatorTest.testOperation(5, 5, 25, "Mul");
        calculatorTest.testOperation(40, 8, 5, "Div");
        calculatorTest.isEventTest(40, true);
        calculatorTest.isEventTest(41, false);
    }

    void testOperation(int firstNumber, int secondNumber, int result, String function) {

        Calculator calculator = new Calculator();

        boolean totalResult = false;

        switch (function) {
            case "Sum": {
                if (result == calculator.sum(firstNumber, secondNumber)) {
                    totalResult = true;
                    break;
                }
            }
            case "Sub": {
                if (result == calculator.sub(firstNumber, secondNumber)) {
                    totalResult = true;
                    break;
                }
            }
            case "Mul": {
                if (result == calculator.mul(firstNumber, secondNumber)) {
                    totalResult = true;
                    break;
                }
            }
            case "Div": {
                if (result == calculator.div(firstNumber, secondNumber)) {
                    totalResult = true;
                    break;
                }
            }
        }
        System.out.println(function + " function from " + firstNumber + " and " + secondNumber
                + " with result " + result + ";  test = " + totalResult);
    }

    void isEventTest(int number, boolean result) {

        boolean totalResult = false;

        Calculator calculator = new Calculator();
        if (result == calculator.isEven(number)) {
            totalResult = true;
        }
        System.out.println("isEvent function " + number + " with result " + result + ";  test = " + totalResult);
    }
}

