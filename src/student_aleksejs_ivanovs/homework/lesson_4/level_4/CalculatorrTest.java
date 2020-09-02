package student_aleksejs_ivanovs.homework.lesson_4.level_4;

class CalculatorrTest {

    public static void main(String[] args) {
        CalculatorrTest calculatorTest = new CalculatorrTest();
        calculatorTest.summTest();
        calculatorTest.subtractTest();
        calculatorTest.divisionTest();
        calculatorTest.multiplicatiTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxFirstNumbersTest();
        calculatorTest.maxSecondNumbersTest();
        calculatorTest.EqualNumbersTest();
        calculatorTest.maxOfThreeNumbersTest();
        calculatorTest.maxOfThreeNumbersTwoTest();
        calculatorTest.maxOfThreeNumbersThreeTest();
        calculatorTest.maxOfThreeNumbersFourTest();
        calculatorTest.maxOfThreeNumbersFiveTest();
        calculatorTest.maxOfThreeNumbersSixTest();
        calculatorTest.maxOfThreeNumbersSevenTest();
        calculatorTest.maxOfThreeNumbersEightTest();
        calculatorTest.maxOfThreeNumbersNineTest();
        calculatorTest.maxOfThreeNumbersTenTest();
    }

    public void summTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.summ(firstNumber, secondNumber);
        if (result == 15) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.subtract(firstNumber, secondNumber);
        if (result == 5) {
            System.out.println("Subtraction test = OK");
        } else {
            System.out.println("Subtraction test = FAIL");
        }
    }

    public void divisionTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.division(firstNumber, secondNumber);
        if (result == 2) {
            System.out.println("Division test = OK");
        } else {
            System.out.println("Division test = FAIL");
        }
    }

    public void multiplicatiTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.multiplicati(firstNumber, secondNumber);
        if (result == 50) {
            System.out.println("Multiplication test = OK");
        } else {
            System.out.println("Multiplication test = FAIL");
        }
    }

    public void isEvenTest() {
        int number = 6;
        Calculatorr calculator = new Calculatorr();
        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("Is Even test = OK");
        } else {
            System.out.println("Is Even test = FAIL");
        }
    }

    public void maxFirstNumbersTest() {
        int firstNumber = 5;
        int secondNumber = 3;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.maxxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber) {
            System.out.println("maxFirstNumbers test = OK");
        } else {
            System.out.println("maxFirstNumbers test = FAIL");
        }
    }

    public void maxSecondNumbersTest() {
        int firstNumber = 3;
        int secondNumber = 5;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.maxxOfTwoNumbers(firstNumber, secondNumber);
        if (result == secondNumber) {
            System.out.println("maxSecondNumbers test = OK");
        } else {
            System.out.println("maxSecondNumbers test = FAIL");
        }
    }

    public void EqualNumbersTest() {
        int firstNumber = 3;
        int secondNumber = 3;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.maxxOfTwoNumbers(firstNumber, secondNumber);
        if (result == firstNumber) {
            System.out.println("EqualNumbers test = OK");
        } else {
            System.out.println("EqualNumbers test = FAIL");
        }
    }

    public void maxOfThreeNumbersTest() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 1;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.maxxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("MaxOfThreeNumbers test = OK");
        } else {
            System.out.println("MaxOfThreeNumbers test = FAIL");
        }
    }

    public void maxOfThreeNumbersTwoTest() {
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 1;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.maxxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == secondNumber) {
            System.out.println("MaxOfThreeNumbersTwo test = OK");
        } else {
            System.out.println("MaxOfThreeNumbersTwo test = FAIL");
        }
    }

    public void maxOfThreeNumbersThreeTest() {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.maxxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == thirdNumber) {
            System.out.println("MaxOfThreeNumbersThree test = OK");
        } else {
            System.out.println("MaxOfThreeNumbersThree test = FAIL");
        }
    }

    public void maxOfThreeNumbersFourTest() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 1;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.maxxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("MaxOfThreeNumbersFour test = OK");
        } else {
            System.out.println("MaxOfThreeNumbersFour test = FAIL");
        }
    }

    public void maxOfThreeNumbersFiveTest() {
        int firstNumber = 1;
        int secondNumber = 3;
        int thirdNumber = 3;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.maxxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == secondNumber) {
            System.out.println("MaxOfThreeNumbersFive test = OK");
        } else {
            System.out.println("MaxOfThreeNumbersFive test = FAIL");
        }
    }

    public void maxOfThreeNumbersSixTest() {
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 3;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.maxxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == thirdNumber) {
            System.out.println("MaxOfThreeNumbersSix test = OK");
        } else {
            System.out.println("MaxOfThreeNumbersSix test = FAIL");
        }
    }

    public void maxOfThreeNumbersSevenTest() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 2;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.maxxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("MaxOfThreeNumbersSeven test = OK");
        } else {
            System.out.println("MaxOfThreeNumbersSeven test = FAIL");
        }
    }

    public void maxOfThreeNumbersEightTest() {
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 3;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.maxxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("MaxOfThreeNumbersEight test = OK");
        } else {
            System.out.println("MaxOfThreeNumbersEight test = FAIL");
        }
    }

    public void maxOfThreeNumbersNineTest() {
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 2;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.maxxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == secondNumber) {
            System.out.println("MaxOfThreeNumbersNine test = OK");
        } else {
            System.out.println("MaxOfThreeNumbersNine test = FAIL");
        }
    }

    public void maxOfThreeNumbersTenTest() {
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 3;
        Calculatorr calculator = new Calculatorr();
        int result = calculator.maxxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (result == firstNumber) {
            System.out.println("MaxOfThreeNumbersTen test = OK");
        } else {
            System.out.println("MaxOfThreeNumbersTen test = FAIL");
        }
    }
}
