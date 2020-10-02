package student_andris_tresutins.homework.lesson_4.level_3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_8 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter number 1");
        int numberOne = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("enter number 2");
        int numberTwo = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("enter number 3");
        int numberThree = input3.nextInt();


        if(numberOne == numberTwo && numberTwo == numberThree){
            System.out.println("All numbers are equal");
        }
        else if (numberOne != numberTwo && numberTwo != numberThree){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }
}

