package student_artur_martinenko.homework.lesson_6.level_4;

import java.util.Random;

class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] arrayTwo = new int[10][10];

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        twoDimensionalArray.fillArrayTwo(arrayTwo);
        twoDimensionalArray.displayArray(arrayTwo);
        System.out.println(twoDimensionalArray.sumArrayValue(arrayTwo));

    }


    public void fillArrayTwo(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
    }

    public void displayArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println("arr[" + i + "][" + j + "] = "
                        + array[i][j]);
            }
        }
    }

    public int sumArrayValue(int[][] array) {
        int sum = 0;
//        for (int i = 0; i < array.length; i++){   //my logic
//            for (int j = 0; j < array[0].length; j++){
//                sum += array[i][j];
//            }
//        }
        for (int[] ints : array) {   //enhanced for loop by IntelliJ idea
            for (int j = 0; j < array[0].length; j++) {
                sum += ints[j];
            }
        }
        return sum;
    }

}
