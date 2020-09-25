package student_andris_tresutins.homework.lesson_4.level_3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_10 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter number 1");
        int numberOne = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("enter number 2");
        int numberTwo = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("enter number 2");
        int numberThree = input2.nextInt();


        if(numberOne < numberTwo && numberTwo < numberThree){
            System.out.println(numberThree + " num3 is the biggest");
        }
        else if (numberOne > numberTwo && numberTwo > numberThree){
            System.out.println(numberOne + " num1 is the biggest");
        }
        else{
            System.out.println(numberTwo + " num2 is the biggest");
        }
    }
}
