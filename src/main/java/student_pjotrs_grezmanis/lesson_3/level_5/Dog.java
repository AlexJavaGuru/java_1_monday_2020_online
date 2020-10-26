package student_pjotrs_grezmanis.lesson_3.level_5;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class Dog {

    public String name;
    public int age;
    public String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void happyBirthday() {
        age = this.age + 1;
        System.out.println("Today my happy birthday and I'm " + age + " years old.");
    }

    public void voice() {
        System.out.println(name + " " + name + " " + name + "!");
    }

    public void voiceOne() {
        System.out.println("My name is " + name + " and I'm " + age + " years old" + ".");
    }

    public void voiceTwo() {
        System.out.println("My name is " + name + ", I'm " + age + " years old," + " my color is " + color + ".");
    }

    public void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("My name is " + name + ", my color is " + newColor + ".");
    }
}



