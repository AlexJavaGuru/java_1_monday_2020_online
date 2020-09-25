package student_andris_tresutins.homework.lesson_6.level_3;

import jdk.jshell.execution.Util;
import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Hey Adris, you cannot any *string-like arrays* to compare real array and string array. Please, don't use - [13, 13, 3, 13, 458]" +
        "Arrays cannot be compared with ==. If you want to compare arrays, please, create a method, which or use Arrays.sort if you lazy =). Remove method  public void check(int[] expectedRes, int[] result, String testName)")
        //luchse pa ruski :D, tak bilo ponjatnei :DD
class TestUtilArray {
    public static void main(String[] args) {
        TestUtilArray test = new TestUtilArray();
        test.searchnumresult();
        test.searchnummultipletest();
        test.replaceNumberTest();
        test.replaceAllNumbersTest();
        test.reverseArray();
        test.sortArrayTest();
    }

    public void searchnumresult() {
        UtilArray victim = new UtilArray();
        int searchNumber = 54;

        Boolean actualResult = victim.numberSearch( victim.arrayOne(), searchNumber).equals("That number was found at index " + 1);
        Boolean expectedResult = true;

        check(expectedResult, actualResult, "Search number in array test");
    }

    public void searchnummultipletest() {
        UtilArray victim = new UtilArray();
        int searchNumber = 54;

        int actualresult = victim.numberSearchMultiple(victim.arraydupes(), searchNumber);
        int expectedresult = 3;

        check(expectedresult, actualresult, "Multiple of the same value in array search test");
    }

    public void replaceNumberTest() {
        UtilArray victim = new UtilArray();
        int numbertoreplace = 7;
        int newNumber = 13;

        int actualresult = victim.replaceNumber(numbertoreplace, newNumber);
        int expectedresult = 13;

        check(expectedresult, actualresult, "Replace Number in Array test");

    }

    public void replaceAllNumbersTest() {
        UtilArray victim = new UtilArray();
        int numberstoreplace = 54;
        int newNumber = 13;

        int[] array = {13, 13, 3, 13, 458};
        int[] arraycompare = victim.replaceAllNumbers(numberstoreplace, newNumber);

        boolean actualresult = Arrays.equals(array, arraycompare);
        boolean expectedresult = true;

        check(expectedresult, actualresult, "Replace All specific Numbers in Array test");

    }

    public void reverseArray() {
        UtilArray victim = new UtilArray();

        int[] array = {458, 7, 3, 54, 12};
        int[] arraycompare = victim.reverseArray();

        boolean actualresult = Arrays.equals(array, arraycompare);
        boolean expectedresult = true;

        check(expectedresult, actualresult, "Reverse Array test");


    }

    public void sortArrayTest(){
        UtilArray victim = new UtilArray();

        int[] array = {3, 7, 12, 54, 458};
        int[] arraycompare = victim.sortArray();


    boolean actualresult = Arrays.equals(array, arraycompare);
    boolean expectedresult = true;


        check(expectedresult, actualresult, "Sort Array test");


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
