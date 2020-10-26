package teacher.lesson_4.lessoncode;

import java.util.Scanner;

public class AndConditionExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me the number please...");
        int numberOne = scanner.nextInt();

        if (numberOne > 5 && numberOne <= 20) {
            System.out.println("Number " + numberOne + " is in range between 5 and 20");
        } else {
            System.out.println("Number " + numberOne + " is out of range");
        }

        boolean numberOneFirstStatement = numberOne > 5;
        boolean numberOneSecondStatement = numberOne <= 20;
        boolean result = numberOneFirstStatement && numberOneSecondStatement;

        if (result) {
            System.out.println("Number " + numberOne + " is in range between 5 and 20");
        } else {
            System.out.println("Number " + numberOne + " is out of range");
        }

    }
}
