package student_dmitry_vasiliev.lesson_3.homework.Level_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

import java.util.Scanner;


@CodeReview(approved = false)
@CodeReviewComment(comment = "То же самое, что в DogColor. Что тут происходит? В демо должна быть работа с объектом класса. А объект собаки вы тут даже не создали. ")
public class DogDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a dog name...");
        String name = in.next();
        String voice = name;
        System.out.println("How old is a dog...");
        int old = in.nextInt();

        System.out.println("My name is: " + voice + ", " + voice + ", " + voice + "!");
        System.out.println("I am " + old + " years old.");

        System.out.println("Today is my birthday? YES - 1 / NO - 2");
        int birthday = in.nextInt();
        boolean stat = 1 == birthday;
        if (stat) {
            int old1 = old+1;
            System.out.println("My name is: " + voice + ", " + voice + ", " + voice + "!");
            System.out.println("I am " + old1 + " years old.");}
            else {
                System.out.println(voice + ", " + voice + ", " + voice + "!");
        }

        }

}

