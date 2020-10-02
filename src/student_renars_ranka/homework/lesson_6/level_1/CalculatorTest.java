package student_renars_ranka.homework.lesson_6.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEvenTest();
    }
    public void isEvenTest() {
        Calculator calculator = new Calculator();

        int number = 10;

        boolean result = calculator.isEven(number);
        if (result) {
            System.out.println("Is Even test = OK");
        } else {
            System.out.println("Is Even test = Fail");
        }
    }
}
