package student_lilija_g.homework.lesson_8.level_2_intern.task_7;

import teacher.annotations.CodeReview;

/*
Как вызвать конструктор родительского класса?
Когда это нужно делать?
Приведите пример кода.

При создании объекта в первую очередь вызывается конструктор его родительского класса,
а только потом — конструктор самого класса, объект которого мы создаем.
 */
@CodeReview(approved = true)
class Task_7 {
    public static void main(String[] args) {
        Cat myCat = new Cat("Jon", 3);
        System.out.println("Cat name is " + myCat.name + ".");
        System.out.println("He is " + myCat.age + " years old.");
    }
}
