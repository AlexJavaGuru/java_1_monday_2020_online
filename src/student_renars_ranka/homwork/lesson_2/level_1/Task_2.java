package student_renars_ranka.homwork.lesson_2.level_1;

import java.util.Scanner;

import static java.lang.System.*;

public class Task_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(in);
        out.println( "enter number 1");
        double num1 = input.nextDouble();
        out.println( "enter number 2");
        double num2 = input.nextDouble();
        out.print( "add: ");
        out.println(num1 + num2 );
        out.print( "subtract: ");
        out.println(num1 - num2 );
        out.print( "multiply: ");
        out.println(num1 * num2 );
        out.print( "divide: ");
        out.println(num1 / num2 );
    }
}
