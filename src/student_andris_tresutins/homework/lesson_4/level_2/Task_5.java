package student_andris_tresutins.homework.lesson_4.level_2;

import java.util.Scanner;

 class Task_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "enter number 1");
        int num1 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println( "enter number 2");
        int num2 = input2.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " is bigger");
        }
        else{
            System.out.println(num2 + " is bigger");
        }
    }
}
