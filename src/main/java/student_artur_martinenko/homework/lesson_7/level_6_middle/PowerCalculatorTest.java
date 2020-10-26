package student_artur_martinenko.homework.lesson_7.level_6_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculatorTest victim = new PowerCalculatorTest();
        victim.positivePowerTest();
        victim.negativePowerTest();
        victim.numberToPowerTest1();
        victim.numberToPowerTest2();
        victim.zeroPowerTest1();
        victim.zeroPowerTest2();
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println("Test " + testName + " - OK");
        } else {
            System.out.println("Test " + testName + " - FAILED");
        }
    }

    public void check(boolean expected, boolean actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void check(double expected, double actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void positivePowerTest() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double resultPositive = powerCalculator.positivePower(10, 3);
        check(1000, resultPositive, "positivePowerTest");
    }

    public void negativePowerTest() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double resultNegative = powerCalculator.negativePower(10, -3);
        check(0.001, resultNegative, "negativePowerTest");
    }

    public void numberToPowerTest1() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double resultNegative = powerCalculator.numberToPower(10, -3);
        check(0.001, resultNegative, "numberToPowerTest1");
    }

    public void numberToPowerTest2() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double resultPositive = powerCalculator.numberToPower(10, 3);
        check(1000, resultPositive, "numberToPowerTest2");
    }

    public void zeroPowerTest1() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double resultPositive = powerCalculator.positivePower(10, 0);
        check(1, resultPositive, "zeroPowerTest1");
    }

    public void zeroPowerTest2() {
        PowerCalculator powerCalculator = new PowerCalculator();
        double resultNegative = powerCalculator.negativePower(10, -0);
        check(1, resultNegative, "zeroPowerTest2");
    }

}
