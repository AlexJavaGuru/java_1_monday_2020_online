package student_lilija_g.homework.lesson_4.level_1;

import teacher.annotations.CodeReview;

import java.util.Arrays;
import java.util.Scanner;

@CodeReview(approved = true)
class Task_4 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your integer: ");
        int yourNumber = myScanner.nextInt();

        int result = yourNumber % 2;

        if (result == 0)
            System.out.println("Integer " + yourNumber + " is even.");
        else
            System.out.println("Integer " + yourNumber + "is odd.");
    }

}

