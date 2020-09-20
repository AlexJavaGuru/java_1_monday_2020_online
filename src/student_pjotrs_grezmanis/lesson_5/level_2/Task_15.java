package student_pjotrs_grezmanis.lesson_5.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Random;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Почему у вас итератор назван буквой r?")
public class Task_15 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] randomNumber = new int[3];


        for (int r = 0; r < randomNumber.length; r++) {
            int number = random.nextInt(30);
            randomNumber[r] = number;
        }
        System.out.println("Random numbers:");

        for (int r = 0; r < randomNumber.length; r++) {
            System.out.println(randomNumber[r]);
        }
        System.out.println("Random numbers + 2:");
        for (int r = 0; r < randomNumber.length; r++) {
            randomNumber[r] = randomNumber[r] + 2;
            System.out.println(randomNumber[r]);
        }
    }
}
