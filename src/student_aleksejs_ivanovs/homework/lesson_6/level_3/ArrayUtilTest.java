package student_aleksejs_ivanovs.homework.lesson_6.level_3;

import teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.arrayContainSpecifiedNumberTest();
        test.howManyTimesArrayContainSpecifiedNumberTest();
        test.replaceFirstTest();
        test.replaceAllTest();
        test.flipArrayTest();
        test.arraySortTest();
    }

    public void arrayContainSpecifiedNumberTest() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {3, 6, 9, 12, 15};

        int actualResult = array.arrayContainSpecifiedNumber(newArray, 6);

        int expectedResult = 6;

        check(expectedResult, actualResult, "arrayContainSpecifiedNumberTest");
    }

    public void howManyTimesArrayContainSpecifiedNumberTest() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {3, 6, 9, 12, 15, 18, 9, 5};

        int actualResult = array.howManyTimesArrayContainSpecifiedNumber(newArray, 9);

        int expectedResult = 2;

        check(expectedResult, actualResult, "howManyTimesArrayContainSpecifiedNumberTest");
    }

    public void replaceFirstTest() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {3, 6, 9, 12, 15, 18, 21, 6};

        array.replaceFirst(newArray, 6, 33);

        int actualResult = array.howManyTimesArrayContainSpecifiedNumber(newArray, 33);

        int expectedResult = 1;

        check(expectedResult, actualResult, "replaceFirstTest");
    }

    public void replaceAllTest() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {3, 6, 9, 12, 15, 18, 9, 5};

        array.replaceAll(newArray, 9, 33);

        int actualResult = array.howManyTimesArrayContainSpecifiedNumber(newArray, 33);

        int expectedResult = 2;

        check(expectedResult, actualResult, "replaceAllTest");
    }

    public void flipArrayTest() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {1, 2, 3, 4, 5};

        int[] actualResult = array.flipArray(newArray);

        int[] expectedResult = {5, 4, 3, 2, 1};

        check(expectedResult, actualResult, "flipArrayTest");
    }

    public void arraySortTest() {
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {8, 1, 5, 3, 7, 6, 9, 2, 4};

        int[] actualResult = array.arraySort(newArray);

        int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        check(expectedResult, actualResult, "arraySortTest");
    }

    private void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedResult + " but actual result was : " + actualResult);
        }
    }

    private void check(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(actualResult, expectedResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + Arrays.toString(expectedResult) + " but actual result was : " + Arrays.toString(actualResult));
        }
    }
}
