package student_dmitry_vasiliev.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = in.nextInt();
        System.out.println("Enter second number");
        int num2 = in.nextInt();
        System.out.println("Enter third number");
        int num3 = in.nextInt();
        int c = (num1 + num2 + num3) / 3;
        System.out.println("Average  is - " +c);


}
}
