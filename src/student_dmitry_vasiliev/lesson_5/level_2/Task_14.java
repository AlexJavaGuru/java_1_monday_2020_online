package student_dmitry_vasiliev.lesson_5.level_2;

import teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class Task_14 {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < 3; i++ ) {
            numbers[i] = random.nextInt(50);
            sum += numbers[i];
        }

        System.out.println("Array sum is " + sum);
        int result = sum / 3;
        System.out.println("Arithmetic mean is " + result);
    }
}
