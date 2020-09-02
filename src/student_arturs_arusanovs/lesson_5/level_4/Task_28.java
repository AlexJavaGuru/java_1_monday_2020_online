package student_arturs_arusanovs.lesson_5.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Нет заполнения случайными числами.")
class Task_28 {

    public static void main(String[] args) {

        int[] numbers = {5, 13, 23, 9, 56};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] = " + numbers[i]);
        }

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Min = " + min);
    }
}
