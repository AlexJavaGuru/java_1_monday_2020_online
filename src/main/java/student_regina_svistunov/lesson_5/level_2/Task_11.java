package student_regina_svistunov.lesson_5.level_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class Task_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter three numbers: ");
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int numberThree = sc.nextInt();

        int[] numbers = {numberOne, numberTwo, numberThree};


        for (int i =0; i< numbers.length; i++) {
            System.out.println("Your array number " + i + " is " + numbers[i]);
        }

    }
}

