package student_elizabete_ket.homework.lesson_4.level_1;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = sc.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}

