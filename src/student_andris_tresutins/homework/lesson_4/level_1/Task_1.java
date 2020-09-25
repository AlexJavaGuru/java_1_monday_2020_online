package student_andris_tresutins.homework.lesson_4.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Не надо пропускать строки в теле if else")
class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scan.nextInt();

        if (number > 0) {
            System.out.println(number + " - number is positive");
        } else {
            System.out.println(number + " - number is negative");
        }
    }
}