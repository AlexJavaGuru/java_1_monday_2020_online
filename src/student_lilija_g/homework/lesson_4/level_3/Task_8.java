package student_lilija_g.homework.lesson_4.level_3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your integer Number One: ");
        int firstIntNumber = scanner.nextInt();

        System.out.println("Enter your integer Number Two: ");
        int secondIntNumber = scanner.nextInt();

        System.out.println("Enter your integer Number Three: ");
        int threeIntNumber = scanner.nextInt();

        if (firstIntNumber == secondIntNumber && secondIntNumber == threeIntNumber) {
            System.out.printf("All numbers are equal.");
        } else if (firstIntNumber != secondIntNumber
                && firstIntNumber != threeIntNumber
                && secondIntNumber != threeIntNumber) {
            System.out.printf("All numbers are different.");}
        else
        System.out.printf("Neither all are equal or different.");
    }

    }

