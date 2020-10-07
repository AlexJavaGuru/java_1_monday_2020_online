package student_lilija_g.homework.lesson_7.level_6_middle.task_10;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PowerCalculatorTest {

    public static void main(String[] args) {

        PowerCalculator myPowerCalculator = new PowerCalculator();
        PowerCalculatorTest myPowerCalculatorTest = new PowerCalculatorTest();

        myPowerCalculatorTest.totalTest(100000,myPowerCalculator.powerOfNumber(10,5),"10^5" );
        myPowerCalculatorTest.totalTest(0.00001,myPowerCalculator.powerOfNumber(10,-5),"10^-5" );
        myPowerCalculatorTest.totalTest(1,myPowerCalculator.powerOfNumber(5,0),"5^0" );
    }
    void totalTest(double expectedValue, double actualValue, String testName) {

        if (expectedValue == actualValue) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
        }
    }
}
