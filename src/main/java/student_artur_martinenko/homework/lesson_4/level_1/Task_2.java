package student_artur_martinenko.homework.lesson_4.level_1;

import java.util.Scanner;

class Task_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter an integer: ");
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                int number = scanner.nextInt();
                if (number > 0) {
                    System.out.println("Your number is POSITIVE.");
                    break;
                } else if (number == 0) {
                    System.out.println("Your number is ZERO.");
                    break;
                } else {
                    System.out.println("Your number is NEGATIVE.");
                    break;
                }
            } else {
                System.out.println("The number you had entered is not integer.");
            }
            scanner.nextLine();
        }
        scanner.close();

    }

}
