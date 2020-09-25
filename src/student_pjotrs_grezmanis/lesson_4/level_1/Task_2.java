package student_pjotrs_grezmanis.lesson_4.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wholeNumber");
        int wholeNumber = scanner.nextInt();

        if (wholeNumber < 0) {
            System.out.println("wholeNumber is negative");
        } else if (wholeNumber == 0) {
            System.out.println("wholeNumber is equal to zero ");
        } else {
            System.out.println("wholeNumber is pozitive");
        }


    }


}
