package student_elizabete_ket.homework.lesson_2.level_3;

import java.util.Scanner;

public class HomeWorkLesson2Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter radius:");

        double radius = sc.nextDouble();

        double area = radius * radius * Math.PI;
        System.out.print("area is  ");
                System.out.println(area);
        double perimetr  = Math.PI * Math.PI * radius;
        System.out.print("Perimeter is  ");
                System.out.println(perimetr);
    }
}
