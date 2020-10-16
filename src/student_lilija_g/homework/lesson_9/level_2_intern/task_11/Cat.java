package student_lilija_g.homework.lesson_9.level_2_intern.task_11;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Cat extends Animal {

    public Cat(String name, int age) { // вызов протектед конструктора из класса потомка
        super(name, age);
    }
}
