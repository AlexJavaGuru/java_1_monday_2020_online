package student_elizabete_ket.homework.lesson_5.level_4;

import teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class Task_27 {

    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.println("[" + i + "] = " + array[i]);
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max number in array is " + max);
    }
}
