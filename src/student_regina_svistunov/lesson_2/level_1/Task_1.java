package student_regina_svistunov.lesson_2.level_1;

import  java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int number1 = input.nextInt();
        System.out.println("Enter second number:");
        int number2 = input.nextInt();
        System.out.println("Addition:");
        System.out.println(number1+number2);
        System.out.println("Subtraction:");
        System.out.println(number1-number1);
        System.out.println("Multiplication:");
        System.out.println(number1*number2);
        System.out.println("Division:");
        System.out.println(number1/number2);

    }


}
