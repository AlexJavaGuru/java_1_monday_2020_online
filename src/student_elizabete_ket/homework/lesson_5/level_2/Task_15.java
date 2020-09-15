package student_elizabete_ket.homework.lesson_5.level_2;

import java.util.Random;

public class Task_15 {

    public static void main(String[] args) {

        int[] numbersOfThree = new int[3];
        Random random = new Random();

        for (int i = 0; i < numbersOfThree.length; i++) {
            numbersOfThree[i] = random.nextInt(100);
            System.out.println("[" + i + "] = " + numbersOfThree[i]);

        }

        numbersOfThree[0] = numbersOfThree[0] + 2;
        numbersOfThree[1] = numbersOfThree[1] + 2;
        numbersOfThree[2] = numbersOfThree[2] + 2;

        System.out.println();
        for (int i = 0; i < numbersOfThree.length; i++) {
            System.out.println("[" + i + "] = " + numbersOfThree[i]);
        }
    }
}
