package student_regina_svistunov.lesson_3.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Laama {

    String name;
    String age;
    String color;

    Laama (String name, String age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    String getName() {
        return name;
    }
    String getAge() {
        return age;
    }
    String getColor() {
        return color;
    }
    public void voice () {
        System.out.println(" My name is " + name + "!");
        System.out.println(" I'm " + age + " years old!");
        System.out.println(" I'm a " + color + " color!");
    }

}
