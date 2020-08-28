package student_lilija_g.homework.lesson_4.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Слишком много надублировали кода. Переделайте. Выносите в методы код, который можно переиспользовать. " +
        "Тесты, которые что-то пишут в консоль - это не тесты. Это я про maxOfTwoNumbersTest - переделать.")
class CalculatorTest {
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

    void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    void subtractionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.multiply(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multily test = FAIL");
        }
    }

    void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.division(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    void isEvenTest() {
        System.out.println("\nisEvenTest:");
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        boolean resultOne = calculator.isEven(firstNumber);
        if (resultOne)
            System.out.println("Number " + firstNumber + " is even.");
        else
            System.out.println("Number " + firstNumber + " is odd.");

        boolean resultTwo = calculator.isEven(secondNumber);
        if (resultTwo)
            System.out.println("Number " + secondNumber + " is even.");
        else
            System.out.println("Number " + secondNumber + " is odd.");
    }

    void maxOfTwoNumbersTest() {

        System.out.println("\nmaxOfTwoNumbersTest:");

        int firstNumberOne = 10;
        int secondNumberOne = 5;
        Calculator calculator = new Calculator();
        int resultOne = calculator.maxOfTwoNumbers(firstNumberOne, secondNumberOne);
        System.out.println("Largest number from " + firstNumberOne + "," + secondNumberOne + " is " + resultOne);

        int firstNumberTwo = 5;
        int secondNumberTwo = 10;
        int resultTwo = calculator.maxOfTwoNumbers(firstNumberTwo, secondNumberTwo);
        System.out.println("Largest number from " + firstNumberTwo + "," + secondNumberTwo + " is " + resultTwo);

        int firstNumberThree = 10;
        int secondNumberThree = 10;
        int resultThree = calculator.maxOfTwoNumbers(firstNumberTwo, secondNumberTwo);
        System.out.println("Largest number from " + firstNumberThree + "," + secondNumberThree + " is " + resultThree);
    }

    void maxOfThreeNumbersTest(){

        System.out.println("\nmaxOfThreeNumbersTest:");

        Calculator calculator = new Calculator();

        int firstNumberOne = 5;
        int secondNumberOne = 10;
        int threeNumberOne = 15;

        int resultOne = calculator.maxOfThreeNumbers(firstNumberOne, secondNumberOne, threeNumberOne);
        System.out.println("Largest number from " + firstNumberOne + "," + secondNumberOne + "," + threeNumberOne + " is " + resultOne);

        int firstNumberTwo = 15;
        int secondNumberTwo = 10;
        int threeNumberTwo = 5;

        int resultTwo = calculator.maxOfThreeNumbers(firstNumberTwo, secondNumberTwo, threeNumberTwo);
        System.out.println("Largest number from " + firstNumberTwo + "," + secondNumberTwo + "," + threeNumberTwo + " is " + resultTwo);

        int firstNumberThree = 5;
        int secondNumberThree = 15;
        int threeNumberThree = 10;

        int resultThree = calculator.maxOfThreeNumbers(firstNumberThree, secondNumberThree, threeNumberThree);
        System.out.println("Largest number from " + firstNumberThree + "," + secondNumberThree + "," + threeNumberThree + " is " + resultThree);

        int firstNumberFour = 5;
        int secondNumberFour = 5;
        int threeNumberFour = 10;

        int resultFour = calculator.maxOfThreeNumbers(firstNumberFour, secondNumberFour, threeNumberFour);
        System.out.println("Largest number from " + firstNumberFour + "," + secondNumberFour + "," + threeNumberFour + " is " + resultFour);

        int firstNumberFive = 5;
        int secondNumberFive = 10;
        int threeNumberFive = 10;

        int resultFive = calculator.maxOfThreeNumbers(firstNumberFive, secondNumberFive, threeNumberFive);
        System.out.println("Largest number from " + firstNumberFive + "," + secondNumberFive + "," + threeNumberFive + " is " + resultFive);

        int firstNumberSix = 10;
        int secondNumberSix = 10;
        int threeNumberSix = 10;

        int resultSix = calculator.maxOfThreeNumbers(firstNumberSix, secondNumberSix, threeNumberSix);
        System.out.println("Largest number from " + firstNumberSix + "," + secondNumberSix + "," + threeNumberSix + " is " + resultSix);


    }
}



