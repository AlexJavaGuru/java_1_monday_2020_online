package student_renars_ranka.homework.lesson_3.level_1;

import student_renars_ranka.homework.lesson_3.level_1.Robot;

class RobotDemo {

    public static void  main(String[] args) {
        Robot myFirsRobot = new Robot("Robo");
        Robot mySecondRobot = new Robot("Elon");

        myFirsRobot.sayHello();
        myFirsRobot.sayYourName();

        mySecondRobot.sayHello();
        mySecondRobot.sayYourName();
    }


}
