package student_artur_martinenko.homework.lesson_5.level_4;

import teacher.annotations.CodeReview;

import java.util.Arrays;

@CodeReview(approved = true)
class Task_28 {

    public static void main(String[] args) {

        int[] myArray = new int[14];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * 117);
        }
        System.out.println(Arrays.toString(myArray));

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            int temp = myArray[i];
            if (min > temp) {
                min = temp;
            }
        }
        System.out.println("\nMinimum number from array is " + min);


    }

}
