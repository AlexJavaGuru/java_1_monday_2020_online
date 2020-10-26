package student_elizabete_ket.homework.lesson_4.level_1;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");

        int firstNumber = sc.nextInt();

        if (firstNumber > 0) {
            System.out.println("Entering number is positive");
        } else if (firstNumber == 0) {
            System.out.println("Entering number is 0");
        } else {
            System.out.println("Entering number is negative");
        }

    }
}
