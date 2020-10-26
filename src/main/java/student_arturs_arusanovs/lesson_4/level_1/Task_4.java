package student_arturs_arusanovs.lesson_4.level_1;

import java.util.Scanner;

class Task_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Write the number please.");
            int number = scanner.nextInt();

            if (number % 2 ==0) {
                System.out.println("Your number is even.");
            } else {
                System.out.println("Your number is not even.");
            }
        }
    }
}
