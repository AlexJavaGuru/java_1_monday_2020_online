package student_dmitry_vasiliev.lesson_3.homework.Level_1;

public class RobotU {

        public String name;

        public RobotU(String name)
        {
            this.name = name;
        }

        public RobotU() {

        }
    public void sayHello1()
    {
        System.out.println("Hello!!!");
    }
        public void sayHello()
        {
            System.out.println("Hello from " + name);
        }

        public void sayYourName()
        {
            System.out.println("My name is " + name); // == this.name

        }
    }

