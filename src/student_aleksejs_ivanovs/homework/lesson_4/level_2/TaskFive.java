package student_aleksejs_ivanovs.homework.lesson_4.level_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class TaskFive {

    public static void main(String[] args) {
        System.out.println("Enter two integers!");
        Scanner num = new Scanner (System.in);
        int numberOne = num.nextInt();
        int numberTwo = num.nextInt();

        if (numberOne > numberTwo) {
            System.out.println("The number " + numberOne + " is larger than " + numberTwo + " !");
        } else {
            System.out.println("The number " + numberTwo + " is larger than " + numberOne + " !");
        }
    }

}
