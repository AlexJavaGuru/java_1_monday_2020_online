package student_lilija_g.homework.lesson_8.level_2_intern.task_7;

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void commentPrint() {
        System.out.println("Animal constructor");
    }
}
