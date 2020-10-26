package student_lilija_g.homework.lesson_6.level_4.task_16;
/*
Как выйти из бесконечного цикла?
Найдите в интернете и напишите пример кода
для циклов while и for.
 */

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // while (true) {  // бесконечный цикл при помощи while
        for (; ; ) {       // бесконечный цикл при помощи for

            System.out.println("Please enter your number, if your want break input 0: ");
            int enterNumber = scanner.nextInt();

            if (enterNumber == 0) {
                break;
            }
        }
    }
}

