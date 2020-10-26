package student_andris_tresutins.homework.lesson_3.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class Robot {
    public String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    public void sayHello() {
        System.out.println("Hello from " + name);
    }

    public void sayYourName() {
        System.out.println("I am " + name);
    }

}
