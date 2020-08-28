package student_regina_svistunov.lesson_4.level_3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Write first number please: ");
        int number1 = scanner.nextInt();
        System.out.println(" Write second number please: ");
        int number2 = scanner.nextInt();
        System.out.println(" Write third number please: ");
        int number3 = scanner.nextInt();

        if (number1 < number2 && number2 < number3 ){
            System.out.println(" Increasing! ");
        }
        else if (number1 > number2 && number1 > number3 ) {
            System.out.println(" Decreasing! ");
        }
        else {
            System.out.println("Neither increasing or decreasing order! ");
        }
    }
}


//    Write a program that accepts three numbers from the user and prints:
//        - "increasing" if the numbers are in increasing order,
//        - "decreasing" if the numbers are in decreasing order,
//        - "Neither increasing or decreasing order" otherwise.