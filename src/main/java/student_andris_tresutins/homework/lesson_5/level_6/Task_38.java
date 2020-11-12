package student_andris_tresutins.homework.lesson_5.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;


@CodeReview(approved = true)
public class Task_38 {

    public int findMinNumber(int[] array) {

        int min = array[1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;

    }
}
