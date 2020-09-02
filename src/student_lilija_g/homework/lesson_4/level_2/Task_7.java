package student_lilija_g.homework.lesson_4.level_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your integer Number One: ");
        int firstIntNumber = scanner.nextInt();

        System.out.println("Enter your integer Number Two: ");
        int secondIntNumber = scanner.nextInt();

        if (firstIntNumber == secondIntNumber)

            System.out.printf("Numbers are equals.");
        else
            System.out.printf("Numbers are different.");
    }
}
