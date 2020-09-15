package student_aleksejs_ivanovs.homework.lesson_5.level_4;

import teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class taskThirty {

    public static void main(String[] args) {
        Random random = new Random();
        int arrayLength = random.nextInt(50);

        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        System.out.print("\nOdd array numbers = ");
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

}
