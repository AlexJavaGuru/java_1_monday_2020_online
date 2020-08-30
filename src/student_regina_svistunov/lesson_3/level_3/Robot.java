package student_regina_svistunov.lesson_3.level_3;

class Robot {
    private String name;

    public Robot(String robotName) {
        this.name = robotName;
    }

    public Robot() {
    };

    public void sayHello () {
        System.out.println("Hello!");
    }
    public void sayYourName() {

        System.out.println("My name is" + name + "!");
    }

}