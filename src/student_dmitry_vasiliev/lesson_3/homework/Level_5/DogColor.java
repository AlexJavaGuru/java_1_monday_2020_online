package student_dmitry_vasiliev.lesson_3.homework.Level_5;

import java.util.Scanner;

public class DogColor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a dog name...");
        String name = in.next();
        String voice = name;
        System.out.println("How old is a dog...");
        int old = in.nextInt();

        String color = "green";


        System.out.println("I am " + color + " " + voice + ", " + voice + ", " + voice + "!");
        System.out.println("I am " + old + " years old.");

        System.out.println("Please enter a dog color...");
        color = in.next();
        System.out.println("I am " + color + " " + voice + ", " + voice + ", " + voice + "!");

        }

    }



