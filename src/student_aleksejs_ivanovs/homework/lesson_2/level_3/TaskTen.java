package student_aleksejs_ivanovs.homework.lesson_2.level_3;

import java.util.Scanner;

public class TaskTen {

    public static void main(String[] args) {
        System.out.print ("The radius of the circle = ");
        Scanner rad = new Scanner(System.in);

        double radius = rad.nextDouble();
        double perimeter = 2 * 3.1415 * radius;
        double area = 3.1415 * (radius * radius);

        System.out.println("Perimeter is = "+perimeter+"\nArea is = "+area);
    }
}
