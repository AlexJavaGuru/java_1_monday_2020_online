package student_pjotrs_grezmanis.lesson_3.level_3;

import teacher.annotations.CodeReview;

import java.util.Scanner;

@CodeReview(approved = true)
public class RobotDemo {
    public static void main(String[] args) {

        Robot robot1 = new Robot("Electro");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("Sjuzi");
        robot2.sayHello();
        robot2.sayYourName();

    }
}
