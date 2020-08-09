package student_aleksejs_ivanovs.homework.lesson_2.level_3;

import java.util.Scanner;

public class TaskEleven {

    public static void main(String[] args) {
        System.out.println ("Enter three integers!");
        Scanner num = new Scanner(System.in);

        int first, second, third, average;
        first = num.nextInt();
        second = num.nextInt();
        third = num.nextInt();

        average = (first + second + third) / 3;
        System.out.print("Average number is: " + average);
    }
}
