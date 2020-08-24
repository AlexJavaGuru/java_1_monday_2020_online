package student_lilija_g.homework.lesson_4.level_2;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your integer Number One: ");
        int firstIntNumber = scanner.nextInt();

        System.out.println("Enter your integer Number Two: ");
        int secondIntNumber = scanner.nextInt();

        int result;
        if (firstIntNumber < secondIntNumber)
            result = firstIntNumber;
        else
            result = secondIntNumber;

        System.out.printf("The smallest integers from " + firstIntNumber + " and " + secondIntNumber + " is " + result);

    }
}
