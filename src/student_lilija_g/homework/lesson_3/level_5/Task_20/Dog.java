package student_lilija_g.homework.lesson_3.level_5.Task_20;

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
    void happyBirthday() {
        this.dogAge += 1;
        System.out.println("Today my birthday!");
    }
}