package student_pjotrs_grezmanis.lesson_6.level_3;

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
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }
        }
    }

    public static void replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;

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


}












