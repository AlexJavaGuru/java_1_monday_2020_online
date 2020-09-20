package student_aleksejs_ivanovs.homework.lesson_6.level_4;

import java.util.Random;

class TwoDimensionalArray {

    public void doubleRandomArray(int[][] array) {
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rnd.nextInt(9) + 1;
            }
        }
    }

    public int sumDoubleArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

}
