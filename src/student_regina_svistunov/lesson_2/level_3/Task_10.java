package student_regina_svistunov.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Input radius: ");
        double radius = sc.nextDouble();
        double circumference= Math.PI * 2*radius;
        System.out.println("Perimeter is = " + circumference);
        double area = Math.PI * (radius * radius);
        System.out.println("Area is = " + area);

    }
}