package student_lilija_g.homework.lesson_6.level_4.task_15;
/*
Напишите бесконечный цикл при помощи while и for.
 */

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//      while (true) {     // бесконечный цикл при помощи while
        for ( ; ; ) {      // бесконечный цикл при помощи for
            System.out.println("Please enter your number:");
            int enterNumber = scanner.nextInt();
        }
    }
}
