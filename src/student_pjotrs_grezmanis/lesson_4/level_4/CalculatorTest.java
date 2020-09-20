package student_pjotrs_grezmanis.lesson_4.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
        calculatorTest.isEven();

    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sum(firstNumber, secondNumber);
        if (result == 15)
        {
            System.out.println("Sum test = OK");
        } else
            {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.sub(firstNumber, secondNumber);
        if (result == 5)
        {
            System.out.println("Sub test = OK");
        } else
            {
            System.out.println("Sub test = FAIL");
        }

    }
    public void mulTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.mul(firstNumber, secondNumber);
        if (result == 50)
        {
            System.out.println("Mul test = OK");
        } else {
            System.out.println("Mul test = FAIL");
        }
    }
    public void divTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        Calculator calculator = new Calculator();
        int result = calculator.div(firstNumber, secondNumber);
        if (result == 2)
        {
            System.out.println("Div test = OK");
        } else {
            System.out.println("Div test = FAIL");
        }
    }
    public void isEven() {
        int firstNumber = 10;
        Calculator calculator = new Calculator();
        boolean result = calculator.isEven(firstNumber);
        if (result)
        {
            System.out.println("isEven test = OK");
        } else {
            System.out.println("isEven test = Fail");
        }


        }


    }




