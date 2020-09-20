package student_pjotrs_grezmanis.lesson_2.level_3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
 class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Radius");
        double radius = scanner.nextDouble();
        System.out.println("Expected Output");
        double perimeter = Math.PI * 2 * radius;
        System.out.println("Perimeter is = " + perimeter);
        double area = Math.PI * (radius * radius);
        System.out.println("Area is = " + area);
    }
}
