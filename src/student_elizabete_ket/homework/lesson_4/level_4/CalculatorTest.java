package student_elizabete_ket.homework.lesson_4.level_4;

class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.multiTest();
        calculatorTest.divideTest();
        calculatorTest.evenTest();
        calculatorTest.maxOfNumbersTest();
        calculatorTest.threeNumberTest();

    }

        public void sumTest() {
            int firstNumber = 8;
            int secondNumber = 4;
            int expectedSum = 12;
            Calculator victim1 = new Calculator();
            int result = victim1.sumNumbers(firstNumber, secondNumber);

            if (result == expectedSum) {
                System.out.println("Sum Test is OK");
        } else {
                System.out.println("Sum Tes is Failed");
                System.out.println("Expected sum result is " + expectedSum);
                System.out.println("Actual sum result is " + result);
            }
    }

      public void subtractTest () {
        int firstNumber = 8;
        int secondNumber = 4;
        int expectedSubtract = 4;

        Calculator victim2 = new Calculator();
        int result = victim2.subtractionNumbers(firstNumber, secondNumber);

        if (result == expectedSubtract) {
            System.out.println("Subtraction Test is OK");
        } else {
            System.out.println("Subtraction Test is Failed");
            System.out.println("Expected result is " + expectedSubtract);
            System.out.println("Actual result " + result);
        }
    }

    public void multiTest() {
        int firstNumber = 8;
        int secondNumber = 4;
        int expectedMulti = 32;

        Calculator victim3 = new Calculator();
        int result = victim3.multiplicationNumbers(firstNumber, secondNumber);

        if (result == expectedMulti) {
            System.out.println("Multi Test is OK");
        } else {
            System.out.println("Multi Test is Failed");
            System.out.println("Expected result is " + expectedMulti);
            System.out.println("Actual result is " + result);
        }
    }
        public void divideTest() {
        int firstNumber = 8;
        int secondNumber = 4;
        int expectedDivide = 2;

        Calculator victim4 = new Calculator();
        int result = victim4.dividingNumbers(firstNumber, secondNumber);

        if (result == expectedDivide) {
            System.out.println("Divide Test is OK");
        } else {
            System.out.println("Divide Test is Failed");
            System.out.println("Expected result is " + expectedDivide);
            System.out.println("Actual result " + result);
        }

        }

        public void evenTest() {
        int number = 10;
        boolean expectedEven = true;

        Calculator victim5 = new Calculator();
        boolean evenResult = victim5.isEven(number);

        if (evenResult == expectedEven) {
            System.out.println("Even Test is OK");
        } else {
            System.out.println("Even Test is Failes");
            System.out.println("Expected result: " + expectedEven);
            System.out.println("Actual result: " + evenResult);
        }
    }

        public void maxOfNumbersTest() {
            int firstNumber = 10;
            int secondNumber = 5;
            int expectedMax = 10;

            Calculator victim6 = new Calculator();
            int result = victim6.maxOfTwoNumbers(firstNumber, secondNumber);

            if (result == expectedMax) {
                System.out.println("MAX test is OK");
            } else {
                System.out.println("MAX test is Failed");
                System.out.println("Expected result is " + expectedMax);
                System.out.println("Actual result is " + result);
            }
        }

        public void threeNumberTest () {
           int firstNumber = 5;
           int secondNumber = 15;
           int thirdNumber = 10;
           int expectedThreeResult = 15;

           Calculator victim7 = new Calculator();
           int result = victim7.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);

           if (result == expectedThreeResult) {
               System.out.println("threeNumberTest is OK");
           } else {
               System.out.println("threeNumberTest is Failed");
               System.out.println("Expected result: " + expectedThreeResult);
               System.out.println("Actual result: " + result);
           }


        }
}
