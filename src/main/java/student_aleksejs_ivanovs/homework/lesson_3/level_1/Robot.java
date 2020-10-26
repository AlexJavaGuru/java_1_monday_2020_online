package student_aleksejs_ivanovs.homework.lesson_3.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Robot {

    public String name;

    public Robot(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + name);
    }
}
