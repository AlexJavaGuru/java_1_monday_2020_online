package student_andris_tresutins.homework.lesson_4.level_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "enter number 1");
        int num1 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println( "enter number 2");
        int num2 = input2.nextInt();

        if (num1 < num2){
            System.out.println(num1 + " is smaller");
        }
        else{
            System.out.println(num2 + " is smaller");
        }
    }
}
