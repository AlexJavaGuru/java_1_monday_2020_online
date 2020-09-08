package student_regina_svistunov.lesson_3.level_3;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class RobotDemo {
    public static void main(String[] args) {

        Robot robot1 = new Robot(" Vector");
        robot1.sayYourName();


        Robot robot2 = new Robot(" Kozmo");
        robot2.sayYourName();

    }
}