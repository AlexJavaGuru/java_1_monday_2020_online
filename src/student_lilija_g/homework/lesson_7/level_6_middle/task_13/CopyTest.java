package student_lilija_g.homework.lesson_7.level_6_middle.task_13;

import java.util.Arrays;

class CopyTest {

    public static void main(String[] args) {

        Copy myCopy = new Copy();
        CopyTest myCopyTest = new CopyTest();
        int[] myArray = {8, 7, 5, -9, 10, -2, 3, 34, 89, 50, 54};
        int[] resultOne = {-2, 3, 34, 89, 50, 54};
        int[] resultTwo = {34};
        myCopyTest.check(resultOne, myCopy.copyInRange(myArray, 5, 10), "copyInRange One");
        myCopyTest.check(resultTwo, myCopy.copyInRange(myArray, 7, 7), "copyInRange Two");
        myCopyTest.check(null, myCopy.copyInRange(myArray, 15, 10), "copyInRange numberFrom > numberTo");
        myCopyTest.check(null, myCopy.copyInRange(null, 5, 10), "copyInRange in == null");
    }

    void check(int[] expectedValue, int[] actualValue, String testName) {
        if (Arrays.equals(expectedValue, actualValue)) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
            System.out.println("\tExpectedValue = " + Arrays.toString(expectedValue) + ", actualValue = " + Arrays.toString(actualValue));
        }
    }
}
