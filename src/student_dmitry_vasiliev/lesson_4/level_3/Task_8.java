package student_dmitry_vasiliev.lesson_4.level_3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Такая же проблема как и в прошлых заданиях.")
public class Task_8 {
    private int num;
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter please first integer number...");
        int num1 = in.nextInt();

        System.out.println("Enter please second integer number...");
        int num2 = in.nextInt();

        System.out.println("Enter please second integer number...");
        int num3 = in.nextInt();

        int result1 = num1 - num2;
        int result2 = num1 - num3;
        int result3 = num3 - num2;
        if (result1 == 0 && result2 == 0 && result3 == 0) {
            System.out.println("All numbers are equal.");
        } else if (result1 != 0 && result2 != 0 && result3 != 0) {
            System.out.println("All numbers are different.");
        } else {
            System.out.println("Neither all are equal or different.");
        }
    }
}

