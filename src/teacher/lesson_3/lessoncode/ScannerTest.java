package teacher.lesson_3.lessoncode;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type new integer...");
        int input = scanner.nextInt();
        System.out.println("Your number is: " + input);
        int result = input + input;
        System.out.println("Sum: " + result);

    }
}
