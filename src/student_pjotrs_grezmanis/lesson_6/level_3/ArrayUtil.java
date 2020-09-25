package student_pjotrs_grezmanis.lesson_6.level_3;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ArrayUtil {

    public static boolean numberExistsInArray(int[] array, int numberToFind) {
        int repeats = numberRepeatsInArray(array, numberToFind);
        return repeats > 0;
    }
    public static int numberRepeatsInArray(int[] array, int numberToFind) {
        int counterNumberToFind = 0;
        for (int currentValue : array) {
            if (currentValue == numberToFind) {
                counterNumberToFind++;
            }
        }
        return counterNumberToFind;
    }
    public static void replace(int[] array, int numberToReplace, int newNumber) {
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            if (array[arrayIndex] == numberToReplace) {
                array[arrayIndex] = newNumber;
                break;
            }
        }
    }
    public static void replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++) {
            if (array[arrayIndex] == numberToReplace) {
                array[arrayIndex] = newNumber;
            }
        }
    }
    public static int[] reverseNumbersInArray(int[] array) {
        int reversedArrayIndex = 0;
        int[] reversedArray = new int[array.length];
        for (int arrayIndex = array.length - 1; arrayIndex >= 0; arrayIndex--) {
            reversedArray[reversedArrayIndex] = array[arrayIndex];
            reversedArrayIndex++;
        }
        return reversedArray;
    }
    public static int[] sortNumbersArray(int[] array) {
        for (int arrayIndex = array.length - 1; arrayIndex > 0; arrayIndex--) {
            for (int reversedArrayIndex = 0; reversedArrayIndex < arrayIndex; reversedArrayIndex++) {
                if (array[reversedArrayIndex] > array[reversedArrayIndex + 1]) {
                    int tmp = array[reversedArrayIndex];
                    array[reversedArrayIndex] = array[reversedArrayIndex + 1];
                    array[reversedArrayIndex + 1] = tmp;
                }
            }
        }
        return array;
    }
}












