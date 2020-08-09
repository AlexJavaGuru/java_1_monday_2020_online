package student_artur_martinenko.homework.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 integer numbers: ");
        int one = scanner.nextInt();
        scanner.nextLine();
        int two = scanner.nextInt();
        scanner.nextLine();
        int three = scanner.nextInt();
        scanner.close();

        System.out.println("The average is: " + (double)((one+two+three)/3));

    }

}
