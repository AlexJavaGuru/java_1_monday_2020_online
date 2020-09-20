package student_pjotrs_grezmanis.lesson_4.level_3;


import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "плохое название переменных. Совершенно не возможно читать код из за плохого названия переменных.")
 class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wholeNumber One");
        int a = scanner.nextInt();
        System.out.println("Enter wholeNumber Two");
        int b = scanner.nextInt();
        System.out.println("Enter wholeNumber Three");
        int c = scanner.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a);
        }

        if (b >= a && b >= c) {
            System.out.println(b);
        }
        if (c >= a && c >= b) {
            System.out.println(c);
        }
    }
}


