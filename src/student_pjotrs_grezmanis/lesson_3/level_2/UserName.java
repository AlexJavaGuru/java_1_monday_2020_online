package student_pjotrs_grezmanis.lesson_3.level_2;

import java.util.Scanner;

public class UserName {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter your name: ");

    String userName = in.nextLine();
    System.out.println("Hello " + userName + "!");
    }
}

