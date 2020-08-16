package student_andris_tresutins.homework.lesson_3.level_2;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "enter your name");
        String userName = input.nextLine();
        String greeting = "Hi " + userName + "!";
        System.out.println(greeting);
    }
}
