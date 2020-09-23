package student_aleksejs_ivanovs.homework.lesson_6.level_3;

class ArrayUtil {

    public int arrayContainSpecifiedNumber(int[] array, int number) {
        int num = 0;
        for (int i : array) {
            if (i == number) {
                num = number;
                break;
            }
        }
        return num;
    }
    public int howManyTimesArrayContainSpecifiedNumber(int[] array, int number) {
        int num = 0;
        for (int i : array) {
            if (i == number) {
                num += 1;
            }
        }
        return num;
    }

    public void replaceFirst(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                break;
            }
        }
    }
    public void replaceAll(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
            }
        }
    }
    public int[] flipArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;

        }
        return array;
    }

    public int[] arraySort(int[] array) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}
