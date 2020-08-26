package student_dmitry_vasiliev.lesson_4.level_4;


import java.util.concurrent.Callable;

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
        int firstNumber = 10;
        int secondNumber = 8;
        int thirdNumber = 19;
        Calculator calculator = new Calculator();

        if ((firstNumber - secondNumber) > 0 && firstNumber - thirdNumber > 0 && firstNumber == calculator.maxOfThreeNumbersFirst(firstNumber, secondNumber, thirdNumber))
            System.out.println("Test maxOfThreeNumbersFirst is OK. Actual result "+ firstNumber + ", expected result " + calculator.maxOfThreeNumbersFirst(firstNumber, secondNumber, thirdNumber) + ".");

        else
            System.out.println("Test maxOfThreeNumbersFirst is not OK. Actual result "+ firstNumber + ", expected result " + calculator.maxOfThreeNumbersFirst(firstNumber, secondNumber, thirdNumber) + ".");
    }
}








