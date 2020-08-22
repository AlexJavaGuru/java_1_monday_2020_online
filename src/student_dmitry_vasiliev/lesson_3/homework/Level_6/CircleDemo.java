package student_dmitry_vasiliev.lesson_3.homework.Level_6;

import java.util.Scanner;

public class CircleDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Circle circle1 = new Circle(2);

        System.out.println("Please enter radius...");
        double radius = in.nextDouble();

        double calculateArea = Math.PI * (radius*radius);
        System.out.println("Area is  " + calculateArea);

            }
}
