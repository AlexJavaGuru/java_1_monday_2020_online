package student_artur_martinenko.homework.lesson_8.level_3_junior.task_13;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Tomato extends Vegetable{
    @Override
    void canBeEaten() {
        System.out.println("Eat Tomato");
    }
}
