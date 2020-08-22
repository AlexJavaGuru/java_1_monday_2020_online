package student_renars_ranka.homework.lesson_3.level_1;

class Robot {

    public String name;

    public Robot(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from " + name);
    }

    public void sayYourName() {
        System.out.println("My name is " + name);
    }

    public String getName() {
        return name;
    }

}
