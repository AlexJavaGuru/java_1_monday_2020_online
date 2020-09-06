package student_regina_svistunov.lesson_4.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {

        public static void main(String[] args) {

            CalculatorTest calculatorTest = new CalculatorTest();

            calculatorTest.AdditionTest();
            calculatorTest.SubtractionTest();
            calculatorTest.MultiplyTest();
            calculatorTest.DividedTest();
            calculatorTest.isEvenTest();
            calculatorTest.maxOfTwoNumbersFirst();
            calculatorTest.maxOfTwoNumbersSecond();
            calculatorTest.maxOfTwoNumbersThird();

        }

        public void AdditionTest() {

            int firstNumber = 5;
            int secondNumber = 6;

            Calculator calculator = new Calculator();

            int AddResult = calculator.addition(firstNumber, secondNumber);

            if (AddResult == 11) {
                System.out.println("Addition test = OK! ");
            }
            else {
                System.out.println("Addition test = FAILED! ");
        }
    }

        public void SubtractionTest() {

            int firstNumber = 15;
            int secondNumber = 5;

            Calculator calculator = new Calculator();

            int SubsResult = calculator.subtraction(firstNumber, secondNumber);

            if (SubsResult == 10) {
                System.out.println("Subtraction test = OK! ");
            }
            else {
                System.out.println("Subtraction test = FAILED! ");
            }
        }
        public void MultiplyTest() {

            int firstNumber = 3;
            int secondNumber = 5;

            Calculator calculator = new Calculator();

            int MultResult = calculator.multiply(firstNumber, secondNumber);

            if (MultResult == 15) {
                System.out.println("Multiply test = OK! ");
            }
            else {
                System.out.println("Multiply test = FAILED! ");
            }
        }
        public void DividedTest() {

            int firstNumber = 10;
            int secondNumber = 5;

            Calculator calculator = new Calculator();

            int DivResult = calculator.divided(firstNumber, secondNumber);

            if (DivResult == 2) {
                System.out.println("Divided test = OK! ");
            }
            else {
                System.out.println("Divided test = FAILED! ");
            }
        }

        public void isEvenTest() {

            int firstNumber = 6;

            Calculator calculator = new Calculator();

            boolean EvenResult = calculator.isEven(firstNumber);

            if (EvenResult) {
                System.out.println("Even test = OK! ");
            }
            else {
                System.out.println("Even test = FAILED! ");
            }
        }
        public void maxOfTwoNumbersFirst() {

            int firstNumber = 6;
            int secondNumber = 9;

            Calculator calculator = new Calculator();

            int maxOfTwoNumbersResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

            if (maxOfTwoNumbersResult == 9) {
                System.out.println("Max of two numbers test = OK! ");
            }
            else {
                System.out.println("Max of two numbers test = FAILED! ");
            }
        }
    public void maxOfTwoNumbersSecond () {

        int firstNumber = 9;
        int secondNumber = 6;

        Calculator calculator = new Calculator();

        int maxOfTwoNumbersResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (maxOfTwoNumbersResult == 9) {
            System.out.println("Max of two numbers test = OK! ");
        }
        else {
            System.out.println("Max of two numbers test = FAILED! ");
        }
    }
    public void maxOfTwoNumbersThird () {

        int firstNumber = 9;
        int secondNumber = 9;

        Calculator calculator = new Calculator();

        int maxOfTwoNumbersResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);

        if (maxOfTwoNumbersResult == 9) {
            System.out.println("Max of two numbers test = OK! ");
        }
        else {
            System.out.println("Max of two numbers test = FAILED! ");
        }
    }

}

