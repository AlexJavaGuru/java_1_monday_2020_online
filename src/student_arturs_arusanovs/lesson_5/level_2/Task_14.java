package student_arturs_arusanovs.lesson_5.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Вы не задаете числа случайно.")
class Task_14 {

    public static void main (String[] args) {

        int[] numbers = {10, 20, 30};
        int mean = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            mean = sum / numbers.length;
        }

        System.out.println("Mean = " + mean);
    }
}
