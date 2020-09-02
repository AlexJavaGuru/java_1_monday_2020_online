package student_dmitry_vasiliev.lesson_2.level_5;

import java.util.Scanner;

public class Task_15 {public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    System.out.println("Enter first name");
    String name = in.nextLine();

    System.out.println("Enter second name");
    String secondName = in.nextLine();

    System.out.print("Hello ");
    System.out.print(name);
    System.out.print(" " +secondName);

}
}
