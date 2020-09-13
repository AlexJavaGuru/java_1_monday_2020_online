package student_arturs_arusanovs.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

class Task_25 {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int arrLength = arrayUtil.getArrayLengthFromUser();
        int[] arr = arrayUtil.createArray(arrLength);
        arrayUtil.fillArrayWithNumbersFromUser(arr);
        arrayUtil.printArrayToConsole(arr);

    }
}
