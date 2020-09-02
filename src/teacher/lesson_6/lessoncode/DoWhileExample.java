package teacher.lesson_6.lessoncode;

import java.util.Scanner;

public class DoWhileExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int userNumber;
        do {
            System.out.println("Give me the number...");
            userNumber = scanner.nextInt();
            System.out.println("Your number: " + userNumber);
        } while (userNumber != 0);

        System.out.println("End");
    }
}
