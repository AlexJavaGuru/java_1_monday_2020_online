package student_arturs_arusanovs.lesson_2.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius = ");
        double num1 = input.nextDouble();
        System.out.print("Perimeter is = ");
        System.out.println(num1*2*3.1415);
        System.out.print("Area is = ");
        System.out.println(3.1415*num1*num1);


    }
}
