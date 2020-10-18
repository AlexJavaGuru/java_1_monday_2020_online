package student_pjotrs_grezmanis.lesson_7.level_6;

import java.util.Arrays;

class CopyTest {
    public static void main(String[] args) {
        CopyTest test = new CopyTest();
        test.testArray();
    }
    private int[] createNewArray() {
        int[] array = new int[10];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;
        return array;
    }

    private void testArray() {
        Copy copy = new Copy();
        int[] resultArray = copy.copyInRange(createNewArray(), 5, 8);
        boolean isArrayLengthCorrect = check(
                4,
                resultArray.length,
                "testArray:verify resultArray Length"
        );
        if (!isArrayLengthCorrect) {
            return;
        }
    }
    public boolean check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was " + expectedResult + " but actual result " + actualResult);
        }
        return expectedResult == actualResult;
    }
}
