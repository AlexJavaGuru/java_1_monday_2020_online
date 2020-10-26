package teacher.lesson_3.lessoncode;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Robot {

    public String name;

    public Robot(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from " + name);
    }

    public void sayYourName() {
        System.out.println("My name is " + name); // == this.name
    }

}
