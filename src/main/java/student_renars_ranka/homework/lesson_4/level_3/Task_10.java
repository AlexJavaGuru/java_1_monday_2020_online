package student_renars_ranka.homework.lesson_4.level_3;

import java.util.Scanner;

class Task_10 {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("enter number one");
        int number1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("enter number two");
        int number2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("enter number three");
        int number3 = input3.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.println("Numbers one is higher");
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Numbers two is higher");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Numbers three is higher");
        } else {
                System.out.println("Numbers are equal");
            }
        }
    }