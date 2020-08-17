package student_lilija_g.homework.lesson_3.level_5.Task_21;

class Dog {

    private String dogName;
    private int dogAge;
    private String dogColour;

    public enum dogColour {Red, Black, White, Yellow}

    public Dog(String name, int age, String colour) {
        this.dogName = name;
        this.dogAge = age;
        this.dogColour = colour;
    }

    public void voice() {
        System.out.println("My name is " + getName() + "!");
        System.out.println("I am " + getAge() + " years old.");
        System.out.println("My colour is " + getColour()+".");
    }

    public void happyBirthday() {
        this.dogAge += 1;
        System.out.println("Today my birthday!");
    }

    public String getName() {
        return dogName;
    }

    public int getAge() {
        return dogAge;
    }

    public String getColour() {
        return dogColour;
    }
}