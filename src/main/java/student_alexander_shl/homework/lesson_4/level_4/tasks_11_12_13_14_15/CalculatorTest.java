package student_alexander_shl.homework.lesson_4.level_4.tasks_11_12_13_14_15;
/*
task_12:

Создайте класс CalculatorTest и напишите тесты для
всех методов класса Calculator из предыдущего задания.

Подсказка:

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        // по аналогии реализуйте тесты для остальных методов
    }

    public void sumTest() {
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

}
 */

class CalculatorTest {

    Calculator calculator = new Calculator();

    public static void main(String[] args) {

        CalculatorTest calculatorTest = new CalculatorTest();

        calculatorTest.sumTest();
        calculatorTest.divTest();
        calculatorTest.mulTest();
        calculatorTest.subTest();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwoNumbersTest();
        calculatorTest.isEqualTest();
        calculatorTest.maxOfThreeNumbersTest();
    }

    void sumTest() {
        checkTest(15, calculator.sum(10, 5), "Sum");
    }

    void divTest() {
        checkTest(3, calculator.div(15, 5), "Div");
    }

    void mulTest() {
        checkTest(15, calculator.mul(3, 5), "Mul");
    }

    void subTest() {
        checkTest(10, calculator.sub(15, 5), "Bul");
    }

    void isEvenTest() {
        checkTestBoolean(true, calculator.isEven(4), "Is Even");
        checkTestBoolean(false, calculator.isEven(7), "Is Odd");
    }

    void maxOfTwoNumbersTest() {
        checkTest(10, calculator.maxOfTwoNumbers(10, 5), "Max of two numbers");
    }

    void isEqualTest() {
        checkTestBoolean(true, calculator.isEqual(4, 4), "Is Equal");
        checkTestBoolean(false, calculator.isEqual(7, 4), "Is not Equal");
    }

    void maxOfThreeNumbersTest() {
        checkTest(7, calculator.maxOfThreeNumbers(4, 7, 5), "Max of three numbers");
    }

    void checkTest(int calculatedValue, int realValue, String testName) {
        if (calculatedValue == realValue) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test WRONG");
            System.out.println("calculatedValue = " + calculatedValue);
            System.out.println("realValue = " + realValue);
        }
    }

    void checkTestBoolean(boolean calculatedValue, boolean realValue, String testName) {
        if (calculatedValue == realValue) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test WRONG");
            System.out.println("calculatedValue = " + calculatedValue);
            System.out.println("realValue = " + realValue);
        }
    }
}
