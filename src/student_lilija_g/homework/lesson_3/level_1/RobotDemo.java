package student_lilija_g.homework.lesson_3.level_1;

public class RobotDemo { //Task_6

    public static void main(String[] args) {
        Robot robotOne = new Robot("ROBOONE");
        Robot robotTwo = new Robot("ROBOTWO");
        Robot robotThree = new Robot("ROBOTHREE");

        robotOne.sayHello();
        robotOne.sayYourName();

        robotTwo.sayHello();
        robotTwo.sayYourName();

        robotThree.sayHello();
        robotThree.sayYourName();
    }
}
