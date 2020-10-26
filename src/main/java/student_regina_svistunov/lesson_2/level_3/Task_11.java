package student_regina_svistunov.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        System.out.println("Enter first number: ");
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        System.out.println("Enter second number: ");
        int b = num.nextInt();
        System.out.println("Enter third number: ");
        int c = num.nextInt();
        int sum = a + b + c;
        int average = sum / 3;
        System.out.println("Avegare is " + average);
    }
}
