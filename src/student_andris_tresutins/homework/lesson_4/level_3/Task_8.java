package student_andris_tresutins.homework.lesson_4.level_3;

import java.util.Scanner;

class Task_8 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("enter number 2");
        int num2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("enter number 2");
        int num3 = input2.nextInt();


        if(num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal");
        }
        else if (num1 != num2 && num2 != num3){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }
}

