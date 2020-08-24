package student_dmitry_vasiliev.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter please first integer number...");
        int num1 = in.nextInt();

        System.out.println("Enter please second integer number...");
        int num2 = in.nextInt();

        System.out.println("Enter please second integer number...");
        int num3 = in.nextInt();

        int result1 = num1 - num2;
        int result2 = num1 - num3;
        int result3 = num2 - num3;

        if (result1 >= 0 && result2 >= 0)
            System.out.println(num1 + " is greater than " + num3 + " and " + num2 + ".");
        if (result1 <= 0 && result3 >= 0)
            System.out.println(num2 + " is greater than " + num3 + " and " + num1 + ".");
        if (result1 <= 0 && result3 <= 0)
            System.out.println(num3 + " is greater than " + num2 + " and " + num1 + ".");
        if (result1 >= 0 && result3 <= 0)
            System.out.println(num3 + " is greater than " + num2 + " and " + num1 + ".");
        else
            System.out.println("Please check your entering.");
    }
}
