package student_elizabete_ket.homework.lesson_4.level_3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int numberOne = sc.nextInt();
        System.out.println("Please enter second number: ");
        int numberTwo = sc.nextInt();
        System.out.println("Please enter third number: ");
        int numberThree = sc.nextInt();

        if ((numberOne == numberTwo) && (numberTwo == numberThree)) {
            System.out.println("All numbers are equal");
        } else if ((numberOne != numberTwo) && (numberTwo != numberThree) && (numberOne != numberThree)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
