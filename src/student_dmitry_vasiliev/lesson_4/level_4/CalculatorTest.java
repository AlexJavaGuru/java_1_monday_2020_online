package student_dmitry_vasiliev.lesson_4.level_4;


import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.concurrent.Callable;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Надо исправить. Формат. Следите за отступами от края. Почему не используете отдельные методы для проверки? Переделать.")
class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();

        test.sumTest();
        test.subTest();
        test.devTest();
        test.mulTest();
        test.isEven();
        test.maxOfTwoNumbers();
        test.maxOfThreeNumbersFirst();
        test.maxOfThreeNumbersSecond();
        test.maxOfThreeNumbersThird();
        test.firstEquSecondLargerThird();
        test.firstEquSecondSmallerThird();
        test.thirdEquSecondSmallerFirst();
        test.thirdEquSecondLargerFirst();
        test.thirdEquFirstLargerSecond();
        test.thirdEquFirstSmallerSecond();
            }
        public void sumTest() {
            int firstNumber = 10;
            int secondNumber = 5;
            Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK. Actual result is 15 and expected result is " + result + ".");
        } else {
            System.out.println("Sum test = FAIL. Actual result is 15, but expected result is " + result + ".");
        }
    }
    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Sub test = OK. Actual result is 5 and expected result is " + result + ".");
        } else {
            System.out.println("Sub test = FAIL. Actual result is 5, but expected result is " + result + ".");
        }
    }
        public void devTest() {
            int firstNumber = 10;
            int secondNumber = 5;
            Calculator calculator = new Calculator();
            int result = calculator.dev(firstNumber, secondNumber);
            if (result == 2) {
                System.out.println("Dev test = OK. Actual result is 2 and expected result is " + result + ".");
            } else {
                System.out.println("Dev test = FAIL. Actual result is 2, but expected result is " + result + ".");
            }
        }
    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Mul test = OK. Actual result is 50 and expected result is " + result + ".");
        } else {
            System.out.println("Mul test = FAIL. Actual result is 50, but expected result is " + result + ".");
        }
    }
    public void isEven() {
        int number = 2;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("IsEven test = OK. Expected result " + number + " is even - " + result + ".");
        } else {
            System.out.println("IsEven test = FAIL. Expected result " + number + " is even - " + result + ".");
        }
    }

    public void maxOfTwoNumbers() {
        int firstNumber = 7;
        int secondNumber = 8;

        Calculator calculator = new Calculator();
        if ((firstNumber - secondNumber) >= 0 && firstNumber == calculator.maxOfTwoNumbers(firstNumber, secondNumber)) //Math.max(firstNumber, secondNumber);
            System.out.println("Test maxOfTwoNumbers is OK. Actual result "+ firstNumber + ", expected result " + calculator.maxOfTwoNumbers(firstNumber,secondNumber) + ".");

        else if ((firstNumber - secondNumber) < 0 && secondNumber == calculator.maxOfTwoNumbers(firstNumber, secondNumber))
            System.out.println("Test maxOfTwoNumbers is OK. Actual result "+ secondNumber + ", expected result " + calculator.maxOfTwoNumbers(firstNumber,secondNumber) + ".");
        else
            System.out.println("Test maxOfTwoNumbers is not OK. Actual result "+ firstNumber + ", expected result " + calculator.maxOfTwoNumbers(firstNumber,secondNumber) + ".");
        }

    public void maxOfThreeNumbersFirst() {
        int firstNumber = 21;
        int secondNumber = 8;
        int thirdNumber = 19;
        Calculator calculator = new Calculator();

        if ((firstNumber - secondNumber) > 0 && firstNumber - thirdNumber > 0 && firstNumber == calculator.maxOfThreeNumbersFirst(firstNumber, secondNumber, thirdNumber))
            System.out.println("Test maxOfThreeNumbersFirst is OK. Actual result "+ firstNumber + ", expected result " + calculator.maxOfThreeNumbersFirst(firstNumber, secondNumber, thirdNumber) + ".");

        else
            System.out.println("Test maxOfThreeNumbersFirst is not OK. Actual result "+ firstNumber + ", expected result " + calculator.maxOfThreeNumbersFirst(firstNumber, secondNumber, thirdNumber) + ".");
    }
    public void maxOfThreeNumbersSecond() {
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = 0;
        Calculator calculator = new Calculator();

        if ((firstNumber - secondNumber) < 0 && secondNumber - thirdNumber > 0 && secondNumber == calculator.maxOfThreeNumbersSecond(firstNumber, secondNumber, thirdNumber))
            System.out.println("Test maxOfThreeNumbersSecond is OK. Actual result "+ secondNumber + ", expected result " + calculator.maxOfThreeNumbersSecond(firstNumber, secondNumber, thirdNumber) + ".");

        else
            System.out.println("Test maxOfThreeNumbersSecond is not OK. Actual result "+ secondNumber + ", expected result " + calculator.maxOfThreeNumbersSecond(firstNumber, secondNumber, thirdNumber) + ".");
    }
    public void maxOfThreeNumbersThird() {
        int firstNumber = 0;
        int secondNumber = 3;
        int thirdNumber = 2;
        Calculator calculator = new Calculator();

        if ((firstNumber - thirdNumber) < 0 && secondNumber - thirdNumber < 0 && thirdNumber == calculator.maxOfThreeNumbersThird(firstNumber, secondNumber, thirdNumber))
            System.out.println("Test maxOfThreeNumbersThird is OK. Actual result "+ thirdNumber + ", expected result " + calculator.maxOfThreeNumbersThird(firstNumber, secondNumber, thirdNumber) + ".");

        else
            System.out.println("Test maxOfThreeNumbersThird is not OK. Actual result "+ thirdNumber + ", expected result " + calculator.maxOfThreeNumbersThird(firstNumber, secondNumber, thirdNumber) + ".");
    }
    public void firstEquSecondLargerThird() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 1;
        Calculator calculator = new Calculator();

        if (firstNumber == secondNumber && secondNumber > thirdNumber && 1 == calculator.firstEquSecondLargerThird(firstNumber, secondNumber, thirdNumber))
            System.out.println("Test firstEquSecondLargerThird is OK. Actual result 1, expected result " + calculator.firstEquSecondLargerThird(firstNumber, secondNumber, thirdNumber) + ".");

        else
            System.out.println("Test firstEquSecondLargerThird is not OK. Actual result 1, expected result " + calculator.firstEquSecondLargerThird(firstNumber, secondNumber, thirdNumber) + ".");
    }
    public void firstEquSecondSmallerThird() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 4;
        Calculator calculator = new Calculator();

        if (firstNumber == secondNumber && secondNumber < thirdNumber && 1 == calculator.firstEquSecondSmallerThird(firstNumber, secondNumber, thirdNumber))
            System.out.println("Test firstEquSecondLargerThird is OK. Actual result 1, expected result " + calculator.firstEquSecondSmallerThird(firstNumber, secondNumber, thirdNumber) + ".");

        else
            System.out.println("Test firstEquSecondLargerThird is not OK. Actual result 1, expected result " + calculator.firstEquSecondSmallerThird(firstNumber, secondNumber, thirdNumber) + ".");
    }
    public void thirdEquSecondSmallerFirst() {
        int firstNumber = 5;
        int secondNumber = 4;
        int thirdNumber = 4;
        Calculator calculator = new Calculator();

        if (thirdNumber == secondNumber && secondNumber < firstNumber && 1 == calculator.thirdEquSecondSmallerFirst(firstNumber, secondNumber, thirdNumber))
            System.out.println("Test thirdEquSecondSmallerFirst is OK. Actual result 1, expected result " + calculator.thirdEquSecondSmallerFirst(firstNumber, secondNumber, thirdNumber) + ".");

        else
            System.out.println("Test thirdEquSecondSmallerFirst is not OK. Actual result 1, expected result " + calculator.thirdEquSecondSmallerFirst(firstNumber, secondNumber, thirdNumber) + ".");
    }
    public void thirdEquSecondLargerFirst() {
        int firstNumber = 3;
        int secondNumber = 4;
        int thirdNumber = 4;
        Calculator calculator = new Calculator();

        if (thirdNumber == secondNumber && secondNumber > firstNumber && 1 == calculator.thirdEquSecondLargerFirst(firstNumber, secondNumber, thirdNumber))
            System.out.println("Test thirdEquSecondLargerFirst is OK. Actual result 1, expected result " + calculator.thirdEquSecondLargerFirst(firstNumber, secondNumber, thirdNumber) + ".");

        else
            System.out.println("Test thirdEquSecondLargerFirst is not OK. Actual result 1, expected result " + calculator.thirdEquSecondLargerFirst(firstNumber, secondNumber, thirdNumber) + ".");
    }
    public void thirdEquFirstLargerSecond() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();

        if (thirdNumber == firstNumber && secondNumber < firstNumber && 1 == calculator.thirdEquFirstLargerSecond(firstNumber, secondNumber, thirdNumber))
            System.out.println("Test thirdEquFirstLargerSecond is OK. Actual result 1, expected result " + calculator.thirdEquFirstLargerSecond(firstNumber, secondNumber, thirdNumber) + ".");

        else
            System.out.println("Test thirdEquFirstLargerSecond is not OK. Actual result 1, expected result " + calculator.thirdEquFirstLargerSecond(firstNumber, secondNumber, thirdNumber) + ".");
    }
    public void thirdEquFirstSmallerSecond() {
        int firstNumber = 3;
        int secondNumber = 4;
        int thirdNumber = 3;
        Calculator calculator = new Calculator();

        if (thirdNumber == firstNumber && secondNumber > firstNumber && 1 == calculator.thirdEquFirstSmallerSecond(firstNumber, secondNumber, thirdNumber))
            System.out.println("Test thirdEquFirstSmallerSecond is OK. Actual result 1, expected result " + calculator.thirdEquFirstSmallerSecond(firstNumber, secondNumber, thirdNumber) + ".");

        else
            System.out.println("Test thirdEquFirstSmallerSecond is not OK. Actual result 1, expected result " + calculator.thirdEquFirstSmallerSecond(firstNumber, secondNumber, thirdNumber) + ".");
    }
}








