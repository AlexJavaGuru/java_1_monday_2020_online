package teacher.lesson_3.lessoncode;

public class RobotDemo {

    public static void main(String[] args) {
        Robot myFirstRobot = new Robot("ROBO");
        Robot mySecondRobot = new Robot("Elon");

        myFirstRobot.sayHello();
        myFirstRobot.sayYourName();

        mySecondRobot.sayHello();
        mySecondRobot.sayYourName();
    }
}
