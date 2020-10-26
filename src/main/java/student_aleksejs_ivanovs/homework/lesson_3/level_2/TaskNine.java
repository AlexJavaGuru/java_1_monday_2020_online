package student_aleksejs_ivanovs.homework.lesson_3.level_2;

import java.util.Scanner;

public class TaskNine {

    public static void main(String[] args) {

        System.out.println ("Enter your name!");
        Scanner name = new Scanner (System.in);
        String firstname = name.nextLine();

        String greeting = "Hello " + firstname + "!";
        System.out.println (greeting);

    }
}
