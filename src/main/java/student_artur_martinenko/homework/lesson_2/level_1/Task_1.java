package student_artur_martinenko.homework.lesson_2.level_1;

import java.util.Scanner;

// Артур, вы молодец ) Есть какой-то опыт или вы изучаете темы быстрее нас? ))) Можно ответить мне в телеге )
public class Task_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first integer number: ");
        boolean inputOne = scanner.hasNextInt();

        if (inputOne) {
            int first = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Please enter second integer number: ");
            boolean inputTwo = scanner.hasNextInt();
            if (inputTwo) {
                int second = scanner.nextInt();

                System.out.println("The sum is: " + (first + second));
                System.out.println("The subtraction is: " + (first - second));
                System.out.println("The multiplication is: " + first * second);
                System.out.println("The division is: " + first / second);
                scanner.close();
            } else {
                System.out.println("Entered number is not integer.");
            }
        }else {
            System.out.println("Entered number is not integer.");
        }

    }
}