package student_pjotrs_grezmanis.lesson_4.level_3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_9 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter number One");
        int numberOne = number.nextInt();
        System.out.println("Enter number Two");
        int numberTwo = number.nextInt();
        System.out.println("Enter number Three");
        int numberThree = number.nextInt();

        if (numberOne < numberTwo && numberTwo < numberThree) {
            System.out.println("increasing");
        } else if (numberOne > numberTwo && numberTwo > numberThree) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
