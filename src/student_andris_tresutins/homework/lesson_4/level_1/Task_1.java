package student_andris_tresutins.homework.lesson_4.level_1;

import java.util.Scanner;

class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scan.nextInt();

        if (number > 0) {

            System.out.println(number + " - number is positive");

        } else {

            System.out.println(number + " - number is negative");

        }
    }
}