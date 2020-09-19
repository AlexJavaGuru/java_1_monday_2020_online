package student_dmitry_vasiliev.lesson_6.level_4;

import java.util.Random;

class TwoDimensionalArray {

    public int[][] createArray(int arrayString, int arrayRow) {
        int[][] newArray = new int[arrayString][arrayRow];
            return  newArray;
    }

    public void randomArrayCreation (int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
            array[i][j] = random.nextInt(50);
            }
        }
    }

    public int arrayAllElementSum (int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}