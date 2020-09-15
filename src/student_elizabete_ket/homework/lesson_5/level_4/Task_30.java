package student_elizabete_ket.homework.lesson_5.level_4;

import java.util.Random;

class Task_30 {

    public static void main(String[] args) {

        int[] array = new int[6];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(70);
            System.out.println("[" + i + "] = " + array[i]);
        }

        for (int j : array) {
            if (j % 2 != 0) {
                System.out.println("Arrays odd number is " + j);
            }
        }
    }
}
