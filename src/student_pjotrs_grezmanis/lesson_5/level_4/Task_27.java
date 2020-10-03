package student_pjotrs_grezmanis.lesson_5.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Random;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Почему у вас итератор назван буквой r?")
class Task_27 {
    public static void main(String[] args) {

        int[] randomNumber = new int[8];

        Random random = new Random();
        System.out.println("Random numbers:");
        for (int i = 0; i < randomNumber.length; i++) {
            int number = random.nextInt(1000);
            randomNumber[i] = number;
            System.out.println(randomNumber[i]);
        }
        int max = 0;
        for (int i = 0; i < randomNumber.length; i++) {
            if (max < randomNumber[i])
                max = randomNumber[i];
        }
        System.out.println("Max: " + max);


    }
}
