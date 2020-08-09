package student_artur_martinenko.homework.lesson_2.level_2;

import java.util.Scanner;

public class Task_8 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("Hello " + name + "!");
    }

}
