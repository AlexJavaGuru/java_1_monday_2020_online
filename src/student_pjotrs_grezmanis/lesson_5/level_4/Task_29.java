package student_pjotrs_grezmanis.lesson_5.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Random;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Формат кода. Сделайте во всех конструкциях фигурные скобки - только на правельных местах.")
class Task_29 {
    public static void main(String[] args) {

        int[] randomNumber = new int[10];

        Random random = new Random();
        System.out.println("Random numbers:");
        for (int r = 0; r < randomNumber.length; r++) {
            int number = random.nextInt(100);
            randomNumber[r] = number;
            System.out.println(randomNumber[r]);
        }
        System.out.println("Even numbers:");
        for (int r = 0; r < randomNumber.length; r++)
            if (randomNumber[r] % 2 == 0)

                System.out.println(randomNumber[r]);

    }
}