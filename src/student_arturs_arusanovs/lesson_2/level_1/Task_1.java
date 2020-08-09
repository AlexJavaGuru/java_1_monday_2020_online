package student_arturs_arusanovs.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter number 1");
        int num1 = input.nextInt();
        System.out.println( "Enter number 2");
        int num2 = input.nextInt();
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
