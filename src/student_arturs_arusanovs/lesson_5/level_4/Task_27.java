package student_arturs_arusanovs.lesson_5.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Нет заполнения случайными числами.")
class Task_27 {

    public static void main(String[] args) {

        int[] numbers = {3, 10, 20, 14};

            for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] = " + numbers[i]);
        }

        int max = numbers[0];

            for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
            System.out.println("Max = " + max);
    }
}
