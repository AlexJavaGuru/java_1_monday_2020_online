package student_lilija_g.homework.lesson_8.level_3_junior.task_13;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void voice() {
        System.out.println("Gav-Gav-Gav!");
    }
}
