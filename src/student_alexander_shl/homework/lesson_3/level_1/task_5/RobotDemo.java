package student_alexander_shl.homework.lesson_3.level_1.task_5;

import teacher.annotations.CodeReview;

/*
Hаучите вашего робота "говорить" как его зовут.

Создайте в классе Robot метод со следующей сигнатурой:

    public void sayYourName() {
        // тут напишите команду распечатки на консоли строки "My name is ROBO"
    }

В методе main(...) класса RobotDemo вызовите
метод sayYourName() у созданного ранее виртуального обьекта.
Запустите вашу программу и убедитесь, что созданный вами
виртуальный обьект робот напечатал на консоли "My name is ROBO".
 */
@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {
       Robot myRobot = new Robot("Lui");
       myRobot.sayHello();
       myRobot.sayYourName();
    }
}
