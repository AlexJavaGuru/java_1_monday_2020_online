package student_elizabete_ket.homework.lesson_5.level_2;

import java.util.Random;

class Task_13 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(60);
            System.out.println("[" + i + "] = " + numbers[i]);
            sum = sum + numbers[i];

        }
        System.out.println("Sum result = " + sum);

    }
}




