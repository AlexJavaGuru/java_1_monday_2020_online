package student_regina_svistunov.lesson_5.level_2;

import java.util.Random;

public class Task_15 {

    public static void main(String[] args) {

        int[] number = new int[3];
        Random random = new Random();

        System.out.println("Random numbers of array: ");
        for (int i=0; i < 3; i++) {
            number[i] = random.nextInt(50);
            System.out.println(number[i]);
        }
        System.out.println("Random numbers of array +2: ");
        for (int i=0; i<3 ;i++) {
            number[i] = number[i] + 2;
            System.out.println(+number[i]);
        }

    }
}