package student_elizabete_ket.homework.lesson_2.level_3;

import java.util.Scanner;

public class HomeWorkLesson2Task11 {
    public static void main (String[] arsg) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumnber = input.nextInt();

        System.out.println("Enter second number:");
        int secondNumber = input.nextInt();

        System.out.println("Enter third number:");
        int thirdNumber = input.nextInt();
        int average = (firstNumnber+secondNumber+thirdNumber)/3;

        System.out.print("Average of 3 numbers: ");
        System.out.println(average);

    }
}
