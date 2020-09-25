package student_andris_tresutins.homework.lesson_3.level_2;


import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String userName = input.nextLine();
        String greeting = "Hi " + userName + "!";
        System.out.println(greeting);
    }
}
