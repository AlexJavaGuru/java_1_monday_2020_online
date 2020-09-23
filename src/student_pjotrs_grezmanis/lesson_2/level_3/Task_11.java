package student_pjotrs_grezmanis.lesson_2.level_3;

import teacher.annotations.CodeReview;

import java.util.InputMismatchException;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number1");
        int number1 = scanner.nextInt();
        System.out.println("input number2");
        int number2 = scanner.nextInt();
        System.out.println("input number3");
        int number3 = scanner.nextInt();
        System.out.print("Average is = ");
        System.out.println((number1 + number2 + number3) / 3);

    }
}
