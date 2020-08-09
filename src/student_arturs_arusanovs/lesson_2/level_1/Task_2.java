package student_arturs_arusanovs.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter number 1");
        double num1 = input.nextDouble();
        System.out.println( "Enter number 2");
        double num2 = input.nextDouble();
        System.out.print( "Summ: ");
        System.out.println(num1 + num2 );
        System.out.print( "Subtraction: ");
        System.out.println(num1 - num2 );
        System.out.print( "Multiplication: ");
        System.out.println(num1 * num2 );
        System.out.print( "Divide: ");
        System.out.println(num1 / num2 );
    }
}
