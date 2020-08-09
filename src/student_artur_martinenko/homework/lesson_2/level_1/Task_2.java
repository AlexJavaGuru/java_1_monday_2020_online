package student_artur_martinenko.homework.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first double number: ");
        boolean inputOne = scanner.hasNextDouble();

        if (inputOne) {
            double first = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Please enter second double number: ");
            boolean inputTwo = scanner.hasNextDouble();
            if (inputTwo) {
                double second = scanner.nextDouble();

                System.out.println("The sum is: " + (first + second));
                System.out.println("The subtraction is: " + (first - second));
                System.out.println("The multiplication is: " + first * second);
                System.out.println("The division is: " + first / second);
                scanner.close();
            } else {
                System.out.println("Entered number is not double.");
            }
        }else {
            System.out.println("Entered number is not double.");
        }

    }
}