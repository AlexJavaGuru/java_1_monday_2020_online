package student_regina_svistunov.lesson_3.level_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your name: ");
        String userName = scanner.nextLine();

        System.out.println("Hello " + userName + "!");


    }
}
