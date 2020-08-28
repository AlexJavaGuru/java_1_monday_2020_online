package student_artur_martinenko.homework.lesson_5.level_5;

import java.util.ArrayList;

import teacher.annotations.CodeReview;

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
//            for(int i : array){       //my logic
//                if(i % 2 == 0){
//                    return false;
//                } else {
//                    return true;
//                }
//            }
            for (int i : array) {       //intelliJ simplification
                return i % 2 != 0;
            }
        }
        return isEven;
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
