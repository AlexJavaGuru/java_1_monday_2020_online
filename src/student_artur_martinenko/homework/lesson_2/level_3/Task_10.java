package student_artur_martinenko.homework.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter r of circle: ");
        double radius = scanner.nextDouble();
        scanner.close();

        System.out.println("Perimeter is = " + Math.PI * radius * 2);
        System.out.println("Area is = " + Math.PI * Math.pow(radius, 2));


    }
}
