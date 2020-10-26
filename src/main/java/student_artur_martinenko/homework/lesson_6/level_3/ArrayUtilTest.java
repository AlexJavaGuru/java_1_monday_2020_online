package student_artur_martinenko.homework.lesson_6.level_3;

import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.Arrays;

@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFillArrayWithRandomNumbers();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
        test.shouldFindEvenNumber();
        test.shouldFindOddNumber();
        test.ifInArrayPositiveTest();
        test.ifInArrayNegativeTest();
        test.intCountInArrayTestOk();
        test.intCountInArrayTestNot();
        test.intReplaceInArrayTest1();
        test.intReplaceInArrayTest2();
        test.intReplaceAllInArrayTest1();
        test.intReplaceAllInArrayTest2();
        test.reverseArrayTest();
        test.sortArrayTest();
    }

    public void check(boolean isTrue, String testName) {
        if (isTrue) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
        }
    }

    public boolean oddEvenCheck(ArrayList<Integer> array, boolean isEven) {
        if (isEven) {
            for (int i : array) {
                if (i % 2 != 0) {
                    isEven = false;
                    break;
                }
            }
        } else {
            for (int i : array) {
                return i % 2 != 0;
            }
        }
        return isEven;
    }

    public void sortArrayTest(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] initialArray = {-876, 2, 3, 1, -876, 5, 6, -876, 8, 9};
        int[] desiredArray = {-876, -876, -876, 1, 2, 3, 5, 6, 8, 9};
        arrayUtil.sortArrayAscending(initialArray);
        boolean flag = Arrays.equals(initialArray, desiredArray);
        check(flag, "sortArrayTest");

    }

    public void reverseArrayTest() {  //lesson_6 (Task_13)
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] initialArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] desiredArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        arrayUtil.reverseArray(initialArray);
        check(Arrays.equals(initialArray, desiredArray), "reverseArrayTest");
    }

    public void intReplaceAllInArrayTest1() {  //lesson_6 (Task_12)
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] tempArr = {-876, 2, 3, 1, -876, 5, 6, -876, 8, 9};
        arrayUtil.replaceAll(tempArr, -876, 0);
        check(arrayUtil.isTimesInArray(tempArr, 0) == 3, "intReplaceAllInArrayTest1");
    }

    public void intReplaceAllInArrayTest2() {  //lesson_6 (Task_12)
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] tempArr = {-876, 2, 3, 1, -876, 5, 6, -876, 8, 9};
        arrayUtil.replaceAll(tempArr, 1, 1000);
        check(arrayUtil.isInArray(tempArr, 1000), "intReplaceAllInArrayTest2");
    }

    public void intReplaceInArrayTest1() {  //lesson_6 (Task_11)
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] tempArr = {-876, 2, 3, 1, -876, 2, 6, -876, 8, 9};
        arrayUtil.replace(tempArr, 2, 1000);
        boolean flag = (arrayUtil.isInArray(tempArr, 1000)) && (arrayUtil.isTimesInArray(tempArr, 2) == 1);
        check(flag, "intReplaceInArrayTest1");
    }

    public void intReplaceInArrayTest2() {  //lesson_6 (Task_11)
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] tempArr = {-876, 2, 3, 1, -876, 2, 6, -876, 8, 9};
        arrayUtil.replace(tempArr, -1000, 1000);
        boolean flag = arrayUtil.isInArray(tempArr, 1000);
        check(!flag, "intReplaceInArrayTest2");
    }

    public void intCountInArrayTestOk() {  //lesson_6 (Task_10)
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] tempArr = {-876, 2, 3, 1, -876, 5, 6, -876, 8, 9};
        check(arrayUtil.isTimesInArray(tempArr, -876) == 3, "intCountInArrayTestOk");
    }

    public void intCountInArrayTestNot() {  //lesson_6 (Task_10)
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] tempArr = {-876, 2, 3, 1, -876, 5, 6, -876, 8, 9};
        check(!(arrayUtil.isTimesInArray(tempArr, -876) == 4), "intCountInArrayTestNot");
    }

    public void ifInArrayPositiveTest() {  //lesson_6 (Task_9)
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] tempArr = {1, 2, 3, 4, -876, 5, 6, 7, 8, 9};
        check(arrayUtil.isInArray(tempArr, -876), "ifInArrayPositiveTest");
    }

    public void ifInArrayNegativeTest() {  //lesson_6 (Task_9)
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] tempArr = {1, 2, 3, 4, -876, 5, 6, 7, 8, 9};
        check(!arrayUtil.isInArray(tempArr, -10), "ifInArrayNegativeTest");
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        check(arrayUtil.createArray(5).length == 5, "shouldCreateArray");
    }

    public void shouldFillArrayWithRandomNumbers() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] temp = arrayUtil.createArray(10);
        arrayUtil.fillArrayWithRandomNumbers(temp);

        boolean notEmpty = false;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                notEmpty = true;
                break;
            }
        }
        check(notEmpty, "shouldFillArrayWithRandomNumbers");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] temp = {5, -15, 50, -100, 1, 75, -21, 100, 9, -1};
        check(arrayUtil.findMaxNumber(temp) == 100, "shouldFindMaxNumber");
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] temp = {5, -15, 50, -100, 1, 75, -21, 100, 9, -1};
        check(arrayUtil.findMinNumber(temp) == -100, "shouldFindMinNumber");
    }

    public void shouldFindEvenNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] temp = {5, -15, 50, -100, 1, 75, -21, 100, 9, -1};
        ArrayList<Integer> evenArray = arrayUtil.findEvenNumber(temp);
        check(oddEvenCheck(evenArray, true), "shouldFindEvenNumber");
    }

    public void shouldFindOddNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] temp = {5, -15, 50, -100, 1, 75, -21, 100, 9, -1};
        ArrayList<Integer> oddArray = arrayUtil.findOddNumber(temp);
        check(oddEvenCheck(oddArray, false), "shouldFindOddNumber");
    }


}
