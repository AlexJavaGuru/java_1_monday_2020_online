package student_lilija_g.homework.lesson_6.level_1.task_1;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.isEvenTest();
    }

    void isEvenTest() {
        totalTestBoolean(true, calculator.isEven(222), "is Even");
        totalTestBoolean(false, calculator.isEven(111), "is Even");
    }

    void totalTestBoolean(boolean expendedValue, boolean actualValue, String testName) {
        if (expendedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }

}
