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


    public static int replace(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }

        }

        return newNumber;
    }

    public static int replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;

            }

        }
        return newNumber;

    }


    public int[] changeNumbersArray(int[] array) {
        int j = 0;
        int[] myChangeNumberArray = new int[array.length];
        for (int i = array.length - 1; i <= 0; i--) {
            myChangeNumberArray[j] = array[i];
            j++;
        }
        return myChangeNumberArray;
    }


}












