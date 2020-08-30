package student_elizabete_ket.homework.lesson_4.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number: ");

        int firstNumber = sc.nextInt();

        if (firstNumber >= 0) {
            System.out.println("Entering number is positive");
        } else {
            System.out.println("Entering number is negative");
        }

    }
}
