package student_arturs_arusanovs.lesson_5.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Нет заполнения случайными числами.")
class Task_29 {

    public static void main(String[] args) {

        int[] numbers = new int[8];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100);
            System.out.println("[" + i + "] = " + numbers[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2 == 0) {
                System.out.println("Even numbers in arrays : " + numbers[i]);
            }
        }
    }
}
