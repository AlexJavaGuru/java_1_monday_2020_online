package student_dmitry_vasiliev.lesson_3.homework.Level_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Как этот класс имеет отношение к собаке? Внутри метода main даже нет ни одного класса собаки...у кого вы тут меняете цвет? Что происходит? =D")
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



