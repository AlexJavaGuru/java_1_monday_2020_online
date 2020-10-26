package student_elizabete_ket.homework.lesson_5.level_5;

import teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] resultArray = new int[arrayLength];
        return resultArray;
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
    }
}
