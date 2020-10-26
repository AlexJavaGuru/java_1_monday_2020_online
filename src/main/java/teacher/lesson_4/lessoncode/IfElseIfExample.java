package teacher.lesson_4.lessoncode;

import java.util.Scanner;

public class IfElseIfExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give me the number please...");
            int number = scanner.nextInt();

            if (number > 0 && number <= 10) {
                System.out.println("Number " + number + " is in range between 1 and 10");
            } else if (number > 10 && number <= 20) {
                System.out.println("Number " + number + " is in range between 11 and 20");
            } else if (number > 20 && number <= 30) {
                System.out.println("Number " + number + " is in range between 21 and 30");
            } else if (number > 30 && number <= 40) {
                System.out.println("Number " + number + " is in range between 31 and 40");
            } else {
                System.out.println("Number " + number + " is out of range 1 - 40");
            }
        }

    }

}
