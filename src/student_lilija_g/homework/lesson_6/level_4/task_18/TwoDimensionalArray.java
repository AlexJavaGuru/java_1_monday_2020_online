package student_lilija_g.homework.lesson_6.level_4.task_18;

import java.util.Random;

class TwoDimensionalArray {

    public int[][] createArray(int arrayLengthOne, int arrayLengthTwo) {
        return new int[arrayLengthOne][arrayLengthTwo];
    }

    public void fillArrayWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {     //идём по строкам
            for (int j = 0; j < array[0].length; j++) { //идём по столбцам
                array[i][j] = random.nextInt(100) + 5;
            }
        }
    }

    public int sumTwoDimensionalArrayNumbers(int[][] array) {
        int sumResult = 0;
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                sumResult = sumResult + ints[j];
            }
        }
        return sumResult;
    }

    public void printTwoDimensionalArrayToConsole(int[][] array) {

        StringBuilder myString = new StringBuilder("Array: {");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                myString.append(array[i][j]);
                if (j < array[0].length - 1) {
                    myString.append(",");
                } else {
                    myString.append("}");
                }
            }
            if (i != array.length - 1) {
                myString.append(",{");
            }
        }
        System.out.println(myString);
    }
}
