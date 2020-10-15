package student_pjotrs_grezmanis.lesson_5.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Random;

@CodeReview(approved = true)
class Task_29 {
    public static void main(String[] args) {
        int[] randomNumber = new int[10];
        Random random = new Random();
        System.out.println("Random numbers:");

        for (int i = 0; i < randomNumber.length; i++) {
            int number = random.nextInt(100);
            randomNumber[i] = number;
            System.out.println(randomNumber[i]);
        }
        System.out.println("Even numbers:");
        for (int i = 0; i < randomNumber.length; i++) {
            if (randomNumber[i] % 2 == 0) {
                System.out.println(randomNumber[i]);
            }
        }
    }
}