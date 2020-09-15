package student_elizabete_ket.homework.lesson_5.level_4;

import java.util.Random;

class Task_29 {

    public static void main(String[] args) {

        int[] array = new int[4];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("[" + i + "] = " + array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Arrays even numbers are " + array[i]);
            }
        }
    }
}

/*        for (int j : array) {
            if (j % 2 == 0) {
                System.out.println("Arrays even numbers are " + j);
*/
