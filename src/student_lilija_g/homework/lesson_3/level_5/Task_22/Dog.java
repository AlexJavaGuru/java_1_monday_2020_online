package student_lilija_g.homework.lesson_3.level_5.Task_22;

import java.util.Scanner;

class Dog {

    private String dogName;
    private int dogAge;
    private String dogColour;

    public enum dogColour {Red, Black, White, Yellow}

    Dog(String name, int age, String colour) {
        this.dogName = name;
        this.dogAge = age;
        this.dogColour = colour;
    }

    void voice() {
        System.out.println("My name is " + getName() + "!");
        System.out.println("I am " + getAge() + " years old.");
        System.out.println("My colour is " + getColour()+".");
    }

    void happyBirthday() {
        this.dogAge += 1;
        System.out.println("Today my birthday!");
    }

    void changeColor(String newColor) {
         this.dogColour = newColor;
            }

    String getName() {
        return dogName;
    }

    int getAge() {
        return dogAge;
    }

    String getColour() {
        return dogColour;
    }
}