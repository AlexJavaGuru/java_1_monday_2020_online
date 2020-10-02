package student_aleksejs_ivanovs.homework.lesson_7.level_6.task_13;

import java.util.Arrays;

class CopyTest {

    public static void main(String[] args) {
        CopyTest test = new CopyTest();
        test.copyTest();
        test.copyTestTwo();
    }

    public void copyTest() {
        Copy arrays = new Copy();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArray = arrays.copyInRange(array,2,5);
        int[] expectedResult = {3, 4, 5, 6};

        if (Arrays.equals(newArray, expectedResult)) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test failed!");
        }
    }

    public void copyTestTwo() {
        Copy arrays = new Copy();
        int[] array = {33, 58, 123, 89, 1, 41, 39, 93, 111};
        int[] newArray = arrays.copyInRange(array,1,7);
        int[] expectedResult = {58, 123, 89, 1, 41, 39, 93};

        if (Arrays.equals(newArray, expectedResult)) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test failed!");
        }
    }

}
