package student_lilija_g.homework.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {

        System.out.print ("Radius = ");
        Scanner radiusIs = new Scanner(System.in);

        double radius = radiusIs.nextDouble();
        double perimeter = 2 * 3.14159265 * radius;
        double area = 3.14159265 * radius * radius;

        System.out.println("Perimeter is = "+perimeter);
        System.out.println("Area is = "+area);

    }
}
