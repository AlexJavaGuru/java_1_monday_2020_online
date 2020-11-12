package student_andris_tresutins.homework.lesson_6.level_3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@CodeReview(approved = true)
class TestUtilArray {
    public static void main(String[] args) {
        TestUtilArray test = new TestUtilArray();
        test.searchNumResult();
        test.searchNumMultipleTest();
        test.replaceNumberTest();
        test.replaceAllNumbersTest();
        test.reverseArray();
        test.sortArrayTest();
    }

    public void searchNumResult() {
        UtilArray victim = new UtilArray();
        int searchNumber = 54;

        Boolean actualResult = victim.numberSearch( victim.arrayOne(), searchNumber).equals("That number was found at index " + 1);
        Boolean expectedResult = true;

        check(expectedResult, actualResult, "Search number in array test");
    }

    public void searchNumMultipleTest() {
        UtilArray victim = new UtilArray();
        int searchNumber = 54;

        int actualResult = victim.numberSearchMultiple(victim.arrayDupes(), searchNumber);
        int expectedResult = 3;

        check(expectedResult, actualResult, "Multiple of the same value in array search test");
    }

    public void replaceNumberTest() {
        UtilArray victim = new UtilArray();
        int numberToReplace = 7;
        int newNumber = 13;

        int actualResult = victim.replaceNumber(numberToReplace, newNumber);
        int expectedResult = 13;

        check(expectedResult, actualResult, "Replace Number in Array test");

    }

    public void replaceAllNumbersTest() {
        UtilArray victim = new UtilArray();
        int numbersToReplace = 54;
        int newNumber = 13;

        int[] array = {13, 13, 3, 13, 458};
        int[] arrayCompare = victim.replaceAllNumbers(numbersToReplace, newNumber);

        boolean actualResult = Arrays.equals(array, arrayCompare);
        boolean expectedResult = true;

        check(expectedResult, actualResult, "Replace All specific Numbers in Array test");

    }

    public void reverseArray() {
        UtilArray victim = new UtilArray();

        int[] array = {458, 7, 3, 54, 12};
        int[] arrayCompare = victim.reverseArray();

        boolean actualResult = Arrays.equals(array, arrayCompare);
        boolean expectedResult = true;

        check(expectedResult, actualResult, "Reverse Array test");


    }

    public void sortArrayTest(){
        UtilArray victim = new UtilArray();

        int[] array = {3, 7, 12, 54, 458};
        int[] arrayCompare = victim.sortArray();


    boolean actualResult = Arrays.equals(array, arrayCompare);
    boolean expectedResult = true;


        check(expectedResult, actualResult, "Sort Array test");


    }



    public void check(String expectedRes, String result, String testName) {

        if (expectedRes == result) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedRes + " but actual result was : " + result);
        }
    }

    public void check(int expectedRes, int result, String testName) {

        if (expectedRes == result) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedRes + " but actual result was : " + result);
        }
    }

    public void check(boolean expectedRes, boolean result, String testName) {

        if (expectedRes == result) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedRes + " but actual result was : " + result);
        }
    }


}
