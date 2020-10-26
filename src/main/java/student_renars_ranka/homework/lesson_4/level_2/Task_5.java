package student_renars_ranka.homework.lesson_4.level_2;

import java.util.Scanner;

class Task_5 {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter number one");
        int number1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter number two");
        int number2 = input2.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " is higher!");
        } else {
            System.out.println(number2 + " is higher!");
        }
    }
}
