package student_regina_svistunov.lesson_6.level_4;

import student_regina_svistunov.lesson_6.level_3.ArrayUtil;

import java.util.Arrays;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.shouldFindNumber();
        test.shouldCountNumber();
        test.shouldReplace();
        test.shouldAllReplace();
        test.shouldReverse();
        test.shouldSort();

    }

    public void shouldCreateArray() {
        String testName = "shouldCreateArray";
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] myArray = arrayUtil.createArray(7);
        printTestsResult(myArray.length == 7, testName);


    }
    public void shouldFillArrayWithRandomNumbers() {
        String testName = "shouldFillArrayWithRandomNumbers";
        ArrayUtil arrayUtil = new ArrayUtil();
        int [] myArray = arrayUtil.createArray(7);
        arrayUtil.fillArrayWithRandomNumbers(myArray);

        int sum =0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        printTestsResult(sum != 0, testName);

    }
    public void shouldFindMaxNumber() {
        String testName = "shouldFindMaxNumber";
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {2,6,15,18,28,41,79};
        int arrayMaxNumber = array.findMaxNumber(newArray);
        printTestsResult(arrayMaxNumber == 79, testName);
    }
    public void shouldFindMinNumber() {
        String testName = "shouldFindMinNumber";
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {2, 6, 15, 18, 28, 41, 79};
        int arrayMinNumber = array.findMinNumber(newArray);
        printTestsResult(arrayMinNumber == 2 , testName);
    }
    public void shouldFindNumber() {
        String testName = "shouldFindNumber";
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {2, 6, 15, 18, 28, 41, 79};
        int findNumber = 15;
        int result = array.findNumber(newArray, findNumber);
        printTestsResult(result == 15, testName);
    }
    public void shouldCountNumber() {
        String testName = "shouldCountNumber";
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {2, 6, 15, 2, 28, 2, 79};
        int countNumber = 2;
        int result = array.countNumber(newArray, countNumber);
        printTestsResult(result == 3, testName);
    }
    public void shouldReplace() {
        String testName = "shouldReplace";
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {2, 6, 15, 2, 28, 2, 79};
        int numberToReplace = 28;
        int newNumber = 4;
        int result = array.replace(newArray, numberToReplace, newNumber);
        printTestsResult(result == 4, testName);

    }

    public void shouldAllReplace() {
        String testName = "shouldAllReplace";
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {2, 6, 15, 2, 28, 2, 79};
        int numberToReplace = 2;
        int newNumber = 3;
        int result = array.replaceAll(newArray, numberToReplace, newNumber);
        printTestsResult( result == 3, testName);
    }

    public void shouldReverse() {
        String testName = "shouldReverse";
        ArrayUtil array = new ArrayUtil();
        int[] oldArray = {1, 2, 3, 4, 5, 6};
        int[] newArray = {6, 5, 4, 3, 2, 1};
        int[] result = array.reverse(oldArray);
        printTestsResult(result == oldArray, testName);
    }

    public void shouldSort() {
        String testName = "shouldSort";
        ArrayUtil array = new ArrayUtil();
        int[] newArray = {2, 6, 15, 2, 28, 2, 79};
        Arrays.sort(newArray);
        printTestsResult(true, testName);


    }


    public void printTestsResult (boolean check, String testName) {
        if (check) {
            System.out.println( testName + " test is passed!");
        } else {
            System.out.println( testName + " test is failed!");
        }
    }


}