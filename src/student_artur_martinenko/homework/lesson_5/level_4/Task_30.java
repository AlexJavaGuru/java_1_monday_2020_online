package student_artur_martinenko.homework.lesson_5.level_4;

import java.util.ArrayList;
import java.util.Arrays;

class Task_30 {

    public static void main(String[] args) {

        int[] myArray = new int[14];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 117);
        }
        System.out.println(Arrays.toString(myArray));

        ArrayList<Integer> oddNumberArray = new ArrayList<>();
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 != 0 && myArray[i] != 0) {
                oddNumberArray.add(myArray[i]);
            }
        }

        System.out.println("\nOdd number ArrayList = " + oddNumberArray);

    }

}
