package student_pjotrs_grezmanis.lesson_6.level_3;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.testFindNumberOne();//Task_9_10
        arrayUtilTest.testFindNumberTwo();//Task_9_10
        arrayUtilTest.testNegativeFindNumber();//Task_9_10
        arrayUtilTest.testReplaceNumber(); //Task_11
        arrayUtilTest.testReplaceAll(); //Task_12
        arrayUtilTest.testReverseNumbersInArray(); //Task_13
        arrayUtilTest.testSortNumbersArray(); //Task_14
    }
    public void testFindNumberOne() {
        int[] array = new int[6];
        array[0] = 5;
        array[1] = 0;
        array[2] = 8;
        array[3] = 7;
        array[4] = 3;
        array[5] = 0;
        if (ArrayUtil.numberRepeatsInArray(array, 0) == 2) {
            System.out.println("testFindNumberOne() - OK");
        } else
            System.out.println("testFindNumberOne() - FAILED");
    }
    public void testFindNumberTwo() {
        int[] myArray = {100, 66, -2, 845, -2, -965, -2};
        if (ArrayUtil.numberRepeatsInArray(myArray, -2) == 3) {
            System.out.println("testFindNumberTwo() - OK");
        } else
            System.out.println("testFindNumberTwo() - FAILED");
    }
    public void testNegativeFindNumber() {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        if (ArrayUtil.numberRepeatsInArray(myArray, 8) == 0) {
            System.out.println("testNegativeFindNumber() - OK");
        } else
            System.out.println("testNegativeFindNumber() - FAILED");
    }

    public void testReplaceNumber() {
        int[] myArray = {99, 8, 777, 66, 555, 44, 2, 8};
        ArrayUtil.replace(myArray, 2, 5);
        if (myArray[6] == 5) {
            System.out.println("testReplaceNumber() - OK");
        } else {
            System.out.println("testReplaceNumber() - FAILED");

        }

    }
    public void testReplaceAll() {
        int[] myArray = {67, 98, 54, 8, 2, 16, 8, 63, 8, 0};
        ArrayUtil.replaceAll(myArray, 8, 7);
        if (myArray[3] == 7 && myArray[6] == 7) {
            System.out.println("testReplaceAll() - OK");
        } else {
            System.out.println("testReplaceAll() - FAILED");
        }
    }
    public void testReverseNumbersInArray() {
        int[] myArray = {95, 5, 3, 77, 44};
        int[] resultArray = ArrayUtil.reverseNumbersInArray(myArray);
        if (resultArray[0] == 44
                && resultArray[1] == 77
                && resultArray[2] == 3
                && resultArray[3] == 5
                && resultArray[4] == 95) {
            System.out.println("testReverseNumbersInArray() - OK");
        } else {
            System.out.println("testReverseNumbersInArray() - FAILED");
        }
    }
    public void testSortNumbersArray() {
        int[] myArray = {3, 2, 5, 1, 4};
        int[] resultArray = ArrayUtil.sortNumbersArray(myArray);
        if (resultArray[0] == 1
                && resultArray[1] == 2
                && resultArray[2] == 3
                && resultArray[3] == 4
                && resultArray[4] == 5) {
            System.out.println("testSortNumbersArray() - OK");
        } else {
            System.out.println("testSortNumbersArray() - FAILED");
        }
    }

}


