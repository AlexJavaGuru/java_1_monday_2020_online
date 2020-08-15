package student_lilija_g.homework.lesson_2.level_3;

import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {

        int numberOne, numberTwo, numberThree, resultAverage;

        System.out.print ("Input first integer number: ");

        Scanner num = new Scanner(System.in);
        numberOne = num.nextInt();

        System.out.print("Input second integer number: ");
        numberTwo = num.nextInt();

        System.out.print("Input third integer number: ");
        numberThree = num.nextInt();

        resultAverage = (numberOne + numberTwo + numberThree) / 3;

        System.out.println("Average of these numbers is  " + resultAverage);
    }
}
