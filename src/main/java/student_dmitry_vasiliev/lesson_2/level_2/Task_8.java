package student_dmitry_vasiliev.lesson_2.level_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter you Login");
        String login = in.nextLine();

        System.out.println("Hello " + login);

    }
}


