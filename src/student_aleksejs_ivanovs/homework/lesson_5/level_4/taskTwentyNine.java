package student_aleksejs_ivanovs.homework.lesson_5.level_4;

import java.util.Random;

class taskTwentyNine {

    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = random.nextInt(50);

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.print("\nEven array numbers = ");
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

}
