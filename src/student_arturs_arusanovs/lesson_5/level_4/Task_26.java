package student_arturs_arusanovs.lesson_5.level_4;

import teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class Task_26 {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int arrLength = arrayUtil.getArrayLengthFromUser();
        int[] arr = new int[arrLength];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000);
        }

        arrayUtil.printArrayToConsole(arr);
    }
}
