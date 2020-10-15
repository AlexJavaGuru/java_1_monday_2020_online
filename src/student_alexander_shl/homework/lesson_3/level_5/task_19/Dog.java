package student_alexander_shl.homework.lesson_3.level_5.task_19;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Dog {
    private String dogName;
    public int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    void voice() {
        System.out.println("Dog name is: " + dogName + ", Age is: " + dogAge);
    }

}
