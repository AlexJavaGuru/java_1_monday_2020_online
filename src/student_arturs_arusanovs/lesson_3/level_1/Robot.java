package student_arturs_arusanovs.lesson_3.level_1;

public class Robot {
    public Robot(){

    }
        public void sayHello() {
        System.out.println("Hello");
    }
        public void sayYourName() {
        System.out.println("My name is " + this.name);
    }
        private String name;
        public Robot(String robotName) {
        this.name = robotName;
    }
    }

