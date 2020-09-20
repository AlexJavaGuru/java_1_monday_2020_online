package student_elizabete_ket.homework.lesson_5.level_2;

import teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class Task_12 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
            System.out.println("[" + i + "] = " + numbers[i]);
        }

    }
}
