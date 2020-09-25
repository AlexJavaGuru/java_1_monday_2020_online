package student_andris_tresutins.homework.lesson_2.level_3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class Task_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input radius");
        double num = input.nextDouble();
        System.out.print("The perimeter is = ");
        System.out.println(2 * Math.PI * num);
        System.out.print("The area is = ");
        System.out.println(Math.PI * (num * num));
    }
}
