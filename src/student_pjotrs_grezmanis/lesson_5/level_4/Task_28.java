package student_pjotrs_grezmanis.lesson_5.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Random;

@CodeReview(approved = true)
class Task_28 {
    public static void main(String[] args) {

        int[] randomNumber = new int[8];

        Random random = new Random();
        System.out.println("Random numbers:");
        for (int i = 0; i < randomNumber.length; i++) {
            int number = random.nextInt(1000);
            randomNumber[i] = number;
            System.out.println(randomNumber[i]);
        }
        int min = randomNumber[0];
        for (int i = 0; i < randomNumber.length; i++) {
            if (randomNumber[i] < min)
                min = randomNumber[i];
        }
        System.out.println("Min: " + min);


    }
}
