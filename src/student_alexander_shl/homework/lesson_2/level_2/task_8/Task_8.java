package student_alexander_shl.homework.lesson_2.level_2.task_8;

import teacher.annotations.CodeReview;

import java.util.Scanner;

/*
Написать консольную программу, которая запрашивает
имя пользователя и выводит на консоль текст:
Hello имя пользователя!
 */
@CodeReview(approved = true)
class Task_8 {
    public static void main(String[] args) {

        System.out.println("enter your name: ");
        Scanner myName = new Scanner(System.in);

        String yourName = myName.nextLine();
        System.out.println("Hello " + yourName + "!");
    }
}
