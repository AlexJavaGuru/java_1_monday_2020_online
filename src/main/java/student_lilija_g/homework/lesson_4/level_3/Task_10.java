package student_lilija_g.homework.lesson_4.level_3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Исправил вам формат. Посмотрети, что я исправил...")
public class Task_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your integer Number One: ");
        int firstIntNumber = scanner.nextInt();

        System.out.println("Enter your integer Number Two: ");
        int secondIntNumber = scanner.nextInt();

        System.out.println("Enter your integer Number Three: ");
        int threeIntNumber = scanner.nextInt();

        if (firstIntNumber > secondIntNumber && firstIntNumber > threeIntNumber) {
            System.out.printf("Largest integer from " + firstIntNumber + "," +
                    secondIntNumber + "," + threeIntNumber + " is " + firstIntNumber);
        } else if (secondIntNumber > firstIntNumber && secondIntNumber > threeIntNumber) {
            System.out.printf("Largest integer from " + firstIntNumber + "," +
                    secondIntNumber + "," + threeIntNumber + " is " + secondIntNumber);
        } else if (threeIntNumber > firstIntNumber && threeIntNumber > secondIntNumber) {
            System.out.printf("Largest integer from " + firstIntNumber + "," +
                    secondIntNumber + "," + threeIntNumber + " is " + threeIntNumber);
        } else
            System.out.printf("Integers from a row " + firstIntNumber + "," +
                    secondIntNumber + "," + threeIntNumber + " are repeated.");
    }
}
