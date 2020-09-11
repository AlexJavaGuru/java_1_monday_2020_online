package student_aleksejs_ivanovs.homework.lesson_5.level_2;

import java.util.Random;

class TaskTwelve {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.println(numbers[i]);
        }
    }
}
