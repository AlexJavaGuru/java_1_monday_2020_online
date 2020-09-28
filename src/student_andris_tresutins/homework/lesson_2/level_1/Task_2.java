package student_andris_tresutins.homework.lesson_2.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Нужно исправить формат в классе.")
class Task_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1");
        double num1 = input.nextDouble();

        System.out.println("enter number 2");
        double num2 = input.nextDouble();
        
        System.out.print("add: ");
        System.out.println(num1 + num2);
        System.out.print("subtract: ");
        System.out.println(num1 - num2);
        System.out.print("multiply: ");
        System.out.println(num1 * num2);
        System.out.print("divide: ");
        System.out.println(num1 / num2);
    }
}
