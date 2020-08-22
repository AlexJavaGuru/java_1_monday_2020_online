package student_elizabete_ket.homework.lesson_3.level_1;

 class Roboty {

    private String name;

    public Roboty (String robotyName) {
        this.name = robotyName;
    }

    public void sayHello() {
        System.out.println(name +  " says Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + name);
    }

    public String getRobotyName() {
        return this.name;
    }
}
