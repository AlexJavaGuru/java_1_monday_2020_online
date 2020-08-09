package student_andris_tresutins.homework.lesson_2.level_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println( "enter number 1");
        int num1 = input.nextInt();
            System.out.println( "enter number 2");
        int num2 = input.nextInt();
            System.out.print( "add: ");
            System.out.println(num1 + num2 );
            System.out.print( "subtract: ");
            System.out.println(num1 - num2 );
            System.out.print( "multiply: ");
            System.out.println(num1 * num2 );
            System.out.print( "divide: ");
            System.out.println(num1 / num2 );
    }
}
