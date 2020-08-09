package student_aleksejs_ivanovs.homework.lesson_2.level_2;

import java.util.Scanner;

public class TaskEight {

    public static void main(String[] args) {
        System.out.println ("Enter your name!");
        Scanner name = new Scanner (System.in);
        String firstName = name.nextLine();
        System.out.print ("Hello " + firstName);
    }

}
