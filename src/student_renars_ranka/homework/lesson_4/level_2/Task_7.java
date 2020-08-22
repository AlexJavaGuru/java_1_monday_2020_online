package student_renars_ranka.homework.lesson_4.level_2;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("enter number one");
        int number1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("enter number two");
        int number2 = input2.nextInt();

        if (number1 == number2) {
            System.out.println("number one " + number1 + " number two " + number2 + " Numbers are equals");
        }
        else {
            System.out.println("number one " + number1 + " number two " + number2 + " Numbers are different");
        }
    }
}
