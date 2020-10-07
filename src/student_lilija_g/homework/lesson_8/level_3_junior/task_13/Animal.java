package student_lilija_g.homework.lesson_8.level_3_junior.task_13;
/*
Придумайте и создайте абстрактный класс и его потомков.
 */
abstract class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void voice();
}
