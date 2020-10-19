package student_lilija_g.homework.lesson_9.level_2_intern.task_11;

import teacher.annotations.CodeReview;

/*
Создайте иерархию наследования из двух уровней (родительский и дочерний).
Продемонстрируйте использование протектед конструктора в родительском классе.
Продемонстрируйте вызов протектед конструктора из класса потомка.
 */
@CodeReview(approved = true)
abstract class Animal {

    protected String name;
    protected int age;

    protected Animal(String name, int age) { // протектед конструктор в родительском классе
        this.name = name;
        this.age = age;
    }
}
