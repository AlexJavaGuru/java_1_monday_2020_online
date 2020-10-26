package student_renars_ranka.homework.lesson_6.level_4;

import teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] myArray = new int[10][10];

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        twoDimensionalArray.fillArrayTwo(myArray);
        twoDimensionalArray.screenArray(myArray);
        System.out.println(twoDimensionalArray.sumArray(myArray));

    }

    public void fillArrayTwo(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
    }
    public void screenArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
    public int sumArray(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
