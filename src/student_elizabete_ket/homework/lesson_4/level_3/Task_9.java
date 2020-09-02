package student_elizabete_ket.homework.lesson_4.level_3;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int numberOne = sc.nextInt();
        System.out.println("Please enter second number:");
        int numberTwo = sc.nextInt();
        System.out.println("Please enter third number");
        int numberThree = sc.nextInt();

        if ((numberOne < numberTwo) && (numberTwo < numberThree) && (numberOne < numberThree)) {
            System.out.println("Numbers are increasing");
        } else if ((numberOne > numberTwo) && (numberTwo > numberThree) && (numberOne > numberThree)) {
            System.out.println("Numbers are decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
