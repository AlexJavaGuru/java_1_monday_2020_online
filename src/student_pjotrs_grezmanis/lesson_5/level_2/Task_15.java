package student_pjotrs_grezmanis.lesson_5.level_2;

import java.util.Random;

public class Task_15 {
    public static void main(String[] args) {

        Random random = new Random();

        int [] randomNumber = new int[3];


        for (int r = 0; r < randomNumber.length; r++) {
            int number = random.nextInt(30);
            randomNumber[r] = number;
        }
        System.out.println("Random numbers:");

        for (int r = 0; r < randomNumber.length; r++){
            System.out.println(randomNumber[r]);
        }
        System.out.println("Random numbers + 2:");
        for (int r = 0; r < randomNumber.length; r++ ) {
            randomNumber[r] = randomNumber [r] +2;
            System.out.println(randomNumber[r]);
        }
    }
}
