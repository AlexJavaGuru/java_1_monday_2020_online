package student_elizabete_ket.homework.lesson_5.level_2;

import java.util.Random;

public class Task_14 {

    public static void main(String[] args) {
        int[] threeNumbers = new int[3];
        int sum = 0;
        int average;
        Random random = new Random();

        for (int i = 0; i < threeNumbers.length; i++) {
            threeNumbers[i] = random.nextInt(10);
            System.out.println("[" + i + "] = " + threeNumbers[i]);
            sum = sum + threeNumbers[i];
        }

        System.out.println("Sum of 3 numbers = " + sum);
        average = sum / threeNumbers.length;
        System.out.println("Average of 3 numbers = " + average);
    }
}
