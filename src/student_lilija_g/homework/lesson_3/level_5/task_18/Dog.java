package student_lilija_g.homework.lesson_3.level_5.task_18;

class Dog {

    private String dogName;

    Dog(String name) {
        this.dogName = name;
    }

    String getName() {
        return dogName;
    }

    void voice() {
        System.out.println("My name is " + getName() + "! "+ getName() + "! "+ getName() + "!");

    }
}