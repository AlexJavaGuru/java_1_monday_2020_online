package student_lilija_g.homework.lesson_4.level_2;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your integer Number One: ");
        int firstIntNumber = scanner.nextInt();

        System.out.println("Enter your integer Number Two: ");
        int secondIntNumber = scanner.nextInt();

        int result;
        if (firstIntNumber > secondIntNumber)
            result = firstIntNumber;
        else
            result = secondIntNumber;

        System.out.printf("The largest integers from " + firstIntNumber + " and " + secondIntNumber + " is " + result);

    }

}


