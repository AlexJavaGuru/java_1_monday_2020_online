package student_artur_martinenko.homework.lesson_7.level_6_middle;

import teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest victim = new PalindromeTest();
        victim.stringToCharArrayTest();
        victim.removeSpacesAndComasTest();
        victim.checkingPalindromeTest();
        victim.isPalindromeTest();
    }

    public void check(char[] expected, char[] actual, String testName) {
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


    public void stringToCharArrayTest() {
        Palindrome palindrome = new Palindrome();
        String initialArray = "level";
        char[] expectedCharArray = {'l', 'e', 'v', 'e', 'l'};
        char[] testedStringArray = palindrome.stringToCharArray(initialArray);
        check(expectedCharArray, testedStringArray, "stringToCharArrayTest");
    }

    public void removeSpacesAndComasTest() {
        Palindrome palindrome = new Palindrome();
        String initial = "Le,V E l";
        String expected = "level";
        String tested = palindrome.removeSpacesAndComas(initial);
        check(expected, tested, "removeSpacesAndComasTest");
    }

    public void checkingPalindromeTest() {
        Palindrome palindrome = new Palindrome();
        char[] initialArray = {'l', 'e', 'v', 'e', 'l'};
        boolean testedStringArray = palindrome.checkingPalindrome(initialArray);
        check(true, testedStringArray, "checkingPalindromeTest");
    }

    public void isPalindromeTest() {
        Palindrome palindrome = new Palindrome();
        String initial = "suM, sum,mUs m,us";
        boolean testResult = palindrome.isPalindrome(initial);
        check(true, testResult, "isPalindromeTest");
    }

}
