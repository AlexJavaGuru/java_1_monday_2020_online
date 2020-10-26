package student_regina_svistunov.lesson_2.level_1;

import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first float number: ");
        float number1 = in.nextFloat();
        System.out.println("Enter second float number: ");
        float number2 = in.nextFloat();
        float c = number1 + number2;
        System.out.println("Addition: " +c);
        float d = number1 - number2;
        System.out.println("Subtracting: " +d);
        float e = number1 * number2;
        System.out.println("RMultiplication: " +e);
        float f = number1 / number2;
        System.out.println("Divide: " +f);
    }
}