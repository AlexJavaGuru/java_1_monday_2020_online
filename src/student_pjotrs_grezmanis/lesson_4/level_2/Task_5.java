package student_pjotrs_grezmanis.lesson_4.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "плохое название переменных. ")
class Task_5 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter wholeNumber One");
        int numberOne = inputNumber.nextInt();
        System.out.println("Enter wholeNumber Two");
        int numberTwo = inputNumber.nextInt();

        if (numberOne >= numberTwo) {
            System.out.println(numberOne);
        } else {
            System.out.println(numberTwo);
        }


    }
}
