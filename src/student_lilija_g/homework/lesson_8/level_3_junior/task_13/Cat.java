package student_lilija_g.homework.lesson_8.level_3_junior.task_13;

class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void voice() {
        System.out.println("Mjau-mjau-Mjau!");
    }
}
