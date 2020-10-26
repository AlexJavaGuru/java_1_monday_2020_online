package student_arturs_arusanovs.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter number 1");
        int num1 = input.nextInt();
        System.out.println( "Enter number 2");
        int num2 = input.nextInt();
        System.out.println( "Enter number 3");
        int num3 = input.nextInt();
        System.out.print("Arithmetical mean = ");
        System.out.print((num1+num2+num3)/3);

    }
}
