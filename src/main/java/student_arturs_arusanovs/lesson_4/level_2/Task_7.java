package student_arturs_arusanovs.lesson_4.level_2;

import java.util.Scanner;

class Task_7 {
    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write first number please.");
        int number1 = scanner.nextInt();
        System.out.println("Write second number please.");
        int number2 = scanner.nextInt();

        if (number1 == number2) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
