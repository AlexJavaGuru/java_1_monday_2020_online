package student_dmitry_vasiliev.lesson_3.homework.level_5;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
class DogColor {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a dog name...");
        dog.setName(in.next());
        String name = dog.getName();

        System.out.println("How old is a dog...");
        dog.setAge(in.nextInt());
        int old = dog.getAge();

        String color = "green";


        System.out.println("I am " + color + " " + name + ", " + name + ", " + name + "!");
        System.out.println("I am " + old + " years old.");

        System.out.println("Please enter a dog color...");
        color = in.next();
        System.out.println("I am " + color + " " + name + ", " + name + ", " + name + "!");

        }

    }



