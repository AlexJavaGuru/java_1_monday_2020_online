package student_dmitry_vasiliev.lesson_5.level_2;

import java.util.Random;

class Task_15 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++ ) {
            numbers[i] = random.nextInt(50);
            System.out.println(numbers[i]);
        }
        System.out.println("--------");
        for (int i = 0; i < 3; i++ ) {
            numbers[i] = numbers[i] + 2;
            System.out.println(numbers[i]);
        }
    }
}

