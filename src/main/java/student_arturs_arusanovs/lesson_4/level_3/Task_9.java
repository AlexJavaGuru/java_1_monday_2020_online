package student_arturs_arusanovs.lesson_4.level_3;

import java.util.Scanner;

class Task_9 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write first number please.");
        int number1 = scanner.nextInt();
        System.out.println("Write second number please.");
        int number2 = scanner.nextInt();
        System.out.println("Write third number please.");
        int number3 = scanner.nextInt();

        if (number3 > number2 && number2 > number1) {
            System.out.println("Increasing.");
        } else if (number1 > number2 && number2 > number3) {
            System.out.println("Decreasing.");
        } else {
            System.out.println("Neither increasing or decreasing order.");
        }

    }
}
