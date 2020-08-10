package student_dmitry_vasiliev.lesson_2.homework.level_1;

import java.util.Scanner;

public class Task_1 {public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    System.out.println("Enter first number");
    int num1 = in.nextInt();

    System.out.println("Enter second number");
    int num2 = in.nextInt();
    int c = num1 + num2;
    System.out.println("Result of addition  is - " +c);
    int d = num1 - num2;
    System.out.println("Result of subtracting  is - " +d);
    int e = num1 * num2;
    System.out.println("Result of multiplication  is - " +e);
    int f = num1 / num2;
    System.out.println("Result of divide  is - " +f);}
}
