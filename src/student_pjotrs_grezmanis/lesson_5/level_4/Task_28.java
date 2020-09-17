package student_pjotrs_grezmanis.lesson_5.level_4;

import java.util.Random;

 class Task_28 {
    public static void main(String[] args) {

        int [] randomNumber = new int[8];

        Random random = new Random();
        System.out.println("Random numbers:");
        for (int r = 0; r < randomNumber.length; r++) {
            int number = random.nextInt(1000);
            randomNumber[r] = number;
            System.out.println(randomNumber[r]);
        }
        int min = randomNumber[0];
        for (int r = 0; r < randomNumber.length ; r++)
        {
            if ( randomNumber[r] < min)
                min = randomNumber[r];
        }
        System.out.println("Min: " + min);


    }
}
