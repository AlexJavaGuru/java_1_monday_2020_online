package student_artur_martinenko.homework.lesson_3.level_1;

class Robot {
    private String name;    //Task_11

    public Robot() {
    }

    public Robot(String name) {    //Task_12
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    public void sayYourName(){
        System.out.println("My name is " + name);
    }



}
