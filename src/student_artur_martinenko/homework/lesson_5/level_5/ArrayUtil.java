package student_artur_martinenko.homework.lesson_5.level_5;

import java.util.Arrays;

class ArrayUtil {

    public static void main(String[] args) {
    }

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 103);
        }
    }

    public void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public int findMaxNumber(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        return min;
    }

}
