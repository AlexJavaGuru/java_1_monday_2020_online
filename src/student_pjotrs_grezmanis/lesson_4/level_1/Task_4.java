package student_pjotrs_grezmanis.lesson_4.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "У вас проблема с форматированием.")
class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter whole number");
        int wholeNumber = scanner.nextInt();

        if (wholeNumber % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");

        }

    }
}
