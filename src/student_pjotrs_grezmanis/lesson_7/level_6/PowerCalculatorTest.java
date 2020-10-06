package student_pjotrs_grezmanis.lesson_7.level_6;

class PowerCalculatorTest {
    public static void main(String[] args) {

        PowerCalculatorTest calculator = new PowerCalculatorTest();
        calculator.testPower();
    }
    public void testPower() {
        PowerCalculator powerCalculator = new PowerCalculator();
        if (powerCalculator.power(2, 3) == 8) {
            System.out.println("testPower() - OK");
        } else {
            System.out.println("testPower() - FAILED");
        }
    }
}
