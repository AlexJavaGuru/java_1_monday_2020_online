package student_regina_svistunov.lesson_2.level_2;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        System.out.println("Enter your name!");
        Scanner name = new Scanner(System.in);
        String FirstName = name.nextLine();
        System.out.println("Hello, " +  FirstName);
    }
}
