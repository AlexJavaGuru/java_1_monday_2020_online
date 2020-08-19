package student_lilija_g.homework.lesson_3.level_5.Task_19;

class Dog {

    private String dogName;
    int dogAge;

    Dog(String name, int age) {
        this.dogName = name;
        this.dogAge = age;
    }

    String getName() {
        return dogName;
    }

    int getAge() {
        return dogAge;
    }

    void voice() {
        System.out.println("My name is " + getName()+"! "+getName()+"! "+getName()+"!");
        System.out.println("I am " + getAge() + " years old.");
    }
}