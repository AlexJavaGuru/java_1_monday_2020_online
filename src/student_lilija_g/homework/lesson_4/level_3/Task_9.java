package student_lilija_g.homework.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your integer Number One: ");
        int firstIntNumber = scanner.nextInt();

        System.out.println("Enter your integer Number Two: ");
        int secondIntNumber = scanner.nextInt();

        System.out.println("Enter your integer Number Three: ");
        int threeIntNumber = scanner.nextInt();

        if (firstIntNumber < secondIntNumber && secondIntNumber < threeIntNumber) {
            System.out.printf("increasing");
        } else if (firstIntNumber > secondIntNumber
                && secondIntNumber > threeIntNumber) {
            System.out.printf("decreasing.");}
        else
            System.out.printf("Neither increasing or decreasing order.");
    }
}

