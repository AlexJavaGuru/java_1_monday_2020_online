package student_pjotrs_grezmanis.lesson_5.level_2;

import teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class Task_12 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] randomNumber = new int[3];


        for (int r = 0; r < randomNumber.length; r++) {
            int number = random.nextInt(30);
            randomNumber[r] = number;
        }
        for (int r = 0; r < randomNumber.length; r++) {
            System.out.println(randomNumber[r]);
        }
    }
}
