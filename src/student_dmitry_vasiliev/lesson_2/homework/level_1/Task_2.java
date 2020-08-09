package student_dmitry_vasiliev.lesson_2.homework.level_1;

import java.util.Scanner;

public class Task_2 {


    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        float num1 = in.nextFloat();

        System.out.println("Enter second number");
        float num2 = in.nextFloat();
        float c = num1 + num2;
        System.out.println("Result of addition  is - " +c);
        float d = num1 - num2;
        System.out.println("Result of subtracting  is - " +d);
        float e = num1 * num2;
        System.out.println("Result of multiplication  is - " +e);
        float f = num1 / num2;
        System.out.println("Result of divide  is - " +f);
}
}
