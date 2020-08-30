package student_andris_tresutins.homework.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task_11 {

    public static void main(String[] args) {

        int[] wholenumbers = new int[3];

        Scanner input = new Scanner(System.in);

        System.out.println("input a number 1");
        int num1 = input.nextInt();

        System.out.println("input a number 2");
        int num2 = input.nextInt();

        System.out.println("input a number 3");
        int num3 = input.nextInt();

        wholenumbers[0] = num1;
        wholenumbers[1] = num2;
        wholenumbers[2] = num3;

        System.out.println(Arrays.toString(wholenumbers));

    }
}
