package student_lilija_g.homework.lesson_5.level_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_11 {

    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);

        int[] myNumbers = new int[3];

        for (int i = 0; i < myNumbers.length; i++) {

            System.out.println("Input a number " + i + ": ");
            int newNumber = inputNumber.nextInt();
            myNumbers[i] = newNumber;
        }

        System.out.println("Array of integers with dimension 3 is {" +
                myNumbers[0] + ", " +
                myNumbers[1] + ", " +
                myNumbers[2] + "} ");
    }
}

