package student_pjotrs_grezmanis.lesson_4.level_3;


import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "плохое название переменных. Совершенно не возможно читать код из за плохого названия переменных.")
class Task_10 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter wholeNumber One");
        int numberOne = number.nextInt();
        System.out.println("Enter wholeNumber Two");
        int numberTwo = number.nextInt();
        System.out.println("Enter wholeNumber Three");
        int numberThree = number.nextInt();

        if (numberOne >= numberTwo && numberOne >= numberThree) {
            System.out.println(numberOne);
        }

        if (numberTwo >= numberOne && numberTwo >= numberThree) {
            System.out.println(numberTwo);
        }
        if (numberThree >= numberOne && numberThree >= numberTwo) {
            System.out.println(numberThree);
        }
    }
}


