package student_lilija_g.homework.lesson_2.level_2;

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner yourName = new Scanner(System.in);

        String userName = yourName.nextLine();
        System.out.print("Hello " + userName + "!");
    }
}

