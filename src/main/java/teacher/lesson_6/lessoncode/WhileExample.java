package teacher.lesson_6.lessoncode;

import java.util.Scanner;

public class WhileExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the number...");
        int userNumber = scanner.nextInt();

        while (userNumber != 0) {
            System.out.println("Your number: " + userNumber);
            System.out.println("Give me the number...");
            userNumber = scanner.nextInt();
        }
        System.out.println("End");
    }
}
