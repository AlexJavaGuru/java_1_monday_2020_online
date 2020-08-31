package student_elizabete_ket.homework.lesson_4.level_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter number: ");
        int inputNumber = sc.nextInt();

        if ((inputNumber & 2) == 0) {
            System.out.println("Input number is even number!");
        } else {
            System.out.println("Input number is odd number!");
        }
    }

}
