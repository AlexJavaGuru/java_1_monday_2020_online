package student_arturs_arusanovs.lesson_4.level_2;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write first number please.");
        int number1 = scanner.nextInt();
        System.out.println("Write second number please.");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println( number1 + " is the largest number.");
        } else {
            System.out.println( number2 + " is the largest number.");
        }
    }
}