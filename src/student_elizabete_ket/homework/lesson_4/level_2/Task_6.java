package student_elizabete_ket.homework.lesson_4.level_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = sc.nextInt();

        if (firstNumber < secondNumber) {
            System.out.println("Smallest number is " + firstNumber);
        } else {
            System.out.println("Smallest number is " + secondNumber);
        }
    }
}
