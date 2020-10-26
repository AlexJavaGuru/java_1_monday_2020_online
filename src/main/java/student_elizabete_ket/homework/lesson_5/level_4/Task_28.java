package student_elizabete_ket.homework.lesson_5.level_4;

import teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class Task_28 {

    public static void main(String[] args) {

        int[] array = new int[7];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("[" + i + "] = " + array[i]);
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Arrays min number is " + min);


    }

}
/* цикл for можно заменить на for each
*       for (int j : array) {
            if (j < min) {
                min = j;
                *
                **/