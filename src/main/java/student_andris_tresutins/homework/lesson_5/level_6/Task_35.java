package student_andris_tresutins.homework.lesson_5.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Arrays;

@CodeReview(approved = true)
class Task_35 {
    public static void main(String[] args) {
        Task_35 victim = new Task_35();
        victim.printArrayToConsole(victim.staticArray());
    }

    public int[] staticArray() {

        int[] array = {15, 24, 17, 99, 15};
        return array;
    }

    public void printArrayToConsole(int[] array) {

        System.out.println(Arrays.toString(array));

    }
}
