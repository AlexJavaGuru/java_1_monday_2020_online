package student_arturs_arusanovs.lesson_5.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Нет заполнения случайными числами.")
class Task_30 {

    public static void main(String[] args) {

        int[] numbers = {14, 3, 5, 24, 10, 99};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("[" + i + "] = " + numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] %2 != 0) {
                System.out.println("Odd numbers in arrays : " + numbers[i]);
            }
        }
    }
}
