package student_artur_martinenko.homework.lesson_7.level_6_middle;

import teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class CopyTest {
    public static void main(String[] args) {
        CopyTest victim = new CopyTest();
        victim.passRangeIntegersToStringTest();
        victim.stringToIntArrayTest();
        victim.copyInRangeTest1();
        victim.copyInRangeTest2();
        victim.copyInRangeTest3();
    }

    public void check(int[] expected, int[] actual, String testName) {
        if (Arrays.equals(expected, actual)) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + Arrays.toString(expected) + " but passed " + Arrays.toString(actual));
        }
    }

    public void check(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
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

    public void passRangeIntegersToStringTest() {
        Copy copy = new Copy();
        int[] in = {1, 2, 3, 4, 4, 5, 6, 7, 8, 8, 9};
        String expected = "2,3,4,4,5,6,7,8,8,";
        String containsRange = copy.passRangeIntegersToString(in, 2, 8);
        check(expected, containsRange, "passRangeIntegersToStringTest");
    }

    public void stringToIntArrayTest() {
        Copy copy = new Copy();
        String initialString = "2,3,4,4,5,6,7,8,8,";
        int[] expectedArray = {2, 3, 4, 4, 5, 6, 7, 8, 8};
        int[] testedArray = copy.stringToIntArray(initialString);
        check(expectedArray, testedArray, "stringToIntArrayTest");
    }

    public void copyInRangeTest1() {
        Copy copy = new Copy();
        int[] in = {1, 2, 3, 4, 4, 5, 6, 7, 8, 8, 9};
        int[] expectedArray = {2, 3, 4, 4, 5, 6, 7, 8, 8};
        int[] testedArray = copy.copyInRange(in, 2, 8);
        check(expectedArray, testedArray, "copyInRangeTest1");
    }

    public void copyInRangeTest2() {
        Copy copy = new Copy();
        int[] in = {1, 2, -50, 4, 0, 5, 6, 7, -12, 8, 9};
        int[] expectedArray = {1, 2, -50, 4, 0, 5, -12};
        int[] testedArray = copy.copyInRange(in, -100, 5);
        check(expectedArray, testedArray, "copyInRangeTest2");
    }

    public void copyInRangeTest3() {
        Copy copy = new Copy();
        int[] in = null;
        int[] expectedArray = null;
        int[] testedArray = copy.copyInRange(in, -100, 5);
        check(expectedArray, testedArray, "copyInRangeTest3");
    }

}
