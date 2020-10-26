package student_dmitry_vasiliev.lesson_5.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        String testName = "shouldCreateArray";
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] newArray = arrayUtil.createArray(8);
        printTestResult(newArray.length, 8, testName);
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        String testName = "shouldFillArrayWithRandomNumbers";
        int[] newArray1 = arrayUtil.createArray(8);
        int[] newArray2 = arrayUtil.createArray(8);

        arrayUtil.fillArrayWithRandomNumbers(newArray1);
        arrayUtil.printArrayToConsoleString(newArray1);
        arrayUtil.findMaxNumberPrint(newArray1);
        arrayUtil.findMinNumber(newArray1);
        int sumFirst = 0;
        for (int i = 0; i < newArray1.length; i++) {
            sumFirst += newArray1[i];
        }

        arrayUtil.fillArrayWithRandomNumbers(newArray2);
        arrayUtil.printArrayToConsoleString(newArray2);
        arrayUtil.findMaxNumberPrint(newArray2);
        arrayUtil.findMinNumber(newArray2);
        int sumSecond = 0;
        for (int i = 0; i < newArray2.length; i++) {
            sumSecond += newArray2[i];
        }
        int expectedResult = 0;
        if (sumFirst != sumSecond && sumFirst != 0) {
            expectedResult = 1;
        }
        printTestResult(expectedResult, 1, testName);

    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        String testName = "shouldFindMaxNumber";
        int[] array = {1, 2, 3, 4, 9, 6, 7, 8};
        int result = arrayUtil.findMaxNumberReturn(array);
        printTestResult(9, result, testName);
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        String testName = "shouldFindMinNumber";
        int[] array = {9, 2, 3, 4, 5, 6, 7, 8};
        int result = arrayUtil.findMinNumber(array);
        printTestResult(2, result, testName);
    }

    public void printTestResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " failed!");
            System.out.println("Expected:" + expectedResult + " but actual is: " + actualResult);
        }
    }
}

