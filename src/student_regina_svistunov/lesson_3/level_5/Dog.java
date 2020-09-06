package student_regina_svistunov.lesson_3.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog {

    private String name;
    private int age;
    private String color;
    public enum color {Black, White, Brown, Red}


    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    String getName() {
        return name;
    }
    int getAge() {
        return age;
    }
    String getColor() {
        return color;
    }


    public void voice () {
        System.out.println(" My name is " + name + "! " + name + "! " + name + "!");
        System.out.println(" My age is " + age + "!");
        System.out.println(" My color is " + color + "!");
    }
    public void happyBirthday() {
        this.age += 1;
        System.out.println("Today I have a birhtday!");
    }
    public void changeColor(String newColor) {
        this.color = newColor;
    }

}
