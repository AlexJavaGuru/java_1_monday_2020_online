package student_elizabete_ket.homework.lesson_2.level_1;

import java.util.Scanner;

public class HomeWorkLesson2Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter number 1");

        double numberOne = scanner.nextDouble();
        System.out.println("enter number 2");

        double numberTwo = scanner.nextDouble();
        System.out.print( "Addition: ");
        System.out.println(numberOne + numberTwo);
        System.out.print( "Subtraction: ");
        System.out.println(numberOne - numberTwo);
        System.out.print( "Multiplication: ");
        System.out.println(numberOne * numberTwo);
        System.out.print( "Division: ");
        System.out.println(numberOne / numberTwo);

    }
}
