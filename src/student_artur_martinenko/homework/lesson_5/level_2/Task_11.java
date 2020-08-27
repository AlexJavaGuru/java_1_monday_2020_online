package student_artur_martinenko.homework.lesson_5.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Тоже можно было разбить на методы.")
class Task_11 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] regularArray = new int[3];

        System.out.println("Please enter 3 integers: ");

        for (int i = 0; i < regularArray.length; i++) {
            boolean isInteger = scanner.hasNextInt();

            if (isInteger) {
                regularArray[i] = scanner.nextInt();
            } else {
                System.out.println("Entered symbol is not integer." +
                        "\n0 will be assigned instead of entry " + (i + 1));
            }
            scanner.nextLine();
        }

        System.out.println("\nThe array has next integers:");
        for (int i : regularArray) {
            System.out.println(i);
        }
    }
}
