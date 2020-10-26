package teacher.lesson_6.lessoncode;

import java.util.Random;

class DoubleArray {

    public static void main(String[] args) {

        int[][] myArray = {{1, 4, 0},
                           {0, 3, 1},
                           {2, 0, 2}};

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                int number = myArray[i][j];
                if (number == 0) {
                    continue;
                }
                System.out.println(number);
            }
        }
    }
}
