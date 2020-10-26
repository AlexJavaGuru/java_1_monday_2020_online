package student_renars_ranka.homework.lesson_4.level_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractionTest();
        calculatorTest.divisionTest();
        calculatorTest.multiplicationTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersOneTest();
        calculatorTest.maxOfTwoNumbersTwoTest();
        calculatorTest.maxOfTwoNumbersThreeTest();
    }

    public void sumTest() {
        Calculator calculator = new Calculator();

        int firstNumber = 10;
        int secondNumber = 5;

        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subtractionTest() {
        Calculator calculator = new Calculator();

        int firstNumber = 10;
        int secondNumber = 5;

        int result = calculator.subtraction(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }
    public void divisionTest() {
        Calculator calculator = new Calculator();

        int firstNumber = 10;
        int secondNumber = 5;

        int result = calculator.division(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }
    public void multiplicationTest() {
        Calculator calculator = new Calculator();

        int firstNumber = 10;
        int secondNumber = 5;

        int result = calculator.multiplication(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }
    public void isEvenTest() {
        Calculator calculator = new Calculator();

        int firstNumber = 10;

        boolean result = calculator.isEven(firstNumber);
        if (result) {
            System.out.println("Is Even test = OK");
        } else {
            System.out.println("Is Even test = FAIL");
        }
    }
    public void maxOfTwoNumbersOneTest() {
        Calculator calculator = new Calculator();

        int firstNumber = 10;
        int secondNumber = 5;

        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("Max of two Numbers One test = OK");
        } else {
            System.out.println("Max of two Numbers One test = FAIL");
        }
    }
    public void maxOfTwoNumbersTwoTest() {
        Calculator calculator = new Calculator();

        int firstNumber = 10;
        int secondNumber = 5;

        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Max of two Numbers Two test = OK");
        } else {
            System.out.println("Max of two Numbers Two test = FAIL");
        }
    }
    public void maxOfTwoNumbersThreeTest() {
        Calculator calculator = new Calculator();

        int firstNumber = 10;
        int secondNumber = 10;

        int result = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (result == 10) {
            System.out.println("Max of two Numbers Three test = OK");
        } else {
            System.out.println("Max of two Numbers Three test = FAIL");
        }
    }
}



