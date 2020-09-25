package student_pjotrs_grezmanis.lesson_5.level_5_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Random;

@CodeReview(approved = true)
@CodeReviewComment(comment = "В качестве итератора используйте i пожалуйста. Спасибо =)")
public class ArrayUtil {
    public static void main(String[] args) {

    }

    public int[] createArray(int arrayLength) {
        return new int[arrayLength];

    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int p = 0; p < array.length; p++) {
            array[p] = random.nextInt(100);
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int p = 0; p < array.length; p++) {
            System.out.println(array[p]);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int p = 0; p < array.length; p++) {
            if (array[p] > max) {
                max = array[p];
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int p = 0; p < array.length; p++) {
            if (array[p] < min)
                min = array[p];

        }
        return min;
    }
}