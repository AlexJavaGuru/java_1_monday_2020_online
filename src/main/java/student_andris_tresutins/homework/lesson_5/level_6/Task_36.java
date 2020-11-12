package student_andris_tresutins.homework.lesson_5.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
public class Task_36 {

    public static void main(String[] args) {
        Task_36 victim = new Task_36();
        System.out.println(victim.findMaxNumber(victim.staticArray()));
    }

    public int[] staticArray() {

        int[] array = {15, 24, 17, 99, 15};
        return array;
    }

    public int findMaxNumber(int[] array) {

        int max = array[1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;

    }
}
