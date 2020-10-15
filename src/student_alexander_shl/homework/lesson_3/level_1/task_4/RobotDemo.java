package student_alexander_shl.homework.lesson_3.level_1.task_4;
/*
В методе main(...) класса RobotDemo вызовите
метод sayHello() у созданного ранее виртуального обьекта.
Запустите вашу программу и убедитесь, что созданный вами
виртуальный обьект робот напечатал на консоли слово "Hello!"
 */

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class RobotDemo {

    public static void main(String[] args) {

        Robot myRobot = new Robot("Lui");
        myRobot.sayHello();

    }
}
