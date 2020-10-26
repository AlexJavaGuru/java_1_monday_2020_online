package student_alexander_shl.homework.lesson_3.level_1.task_3;

import teacher.annotations.CodeReview;

/*
Создайте отдельный класс RobotDemo для демонстрации
работы с классом Robot.

Внутри класса RobotDemo создайте метод

    public static void main(String[] args) {
        // создайте экземпляр класса Robot вызвав конструктор класса
        // сохраните ссылку (указатель) на только, что созданный
        // виртуальный обьект класса Robot в переменную,
        // она нам понадобиться для дальнейшего использования.
    }
 */
@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {
        Robot myRobot = new Robot("Lui");
        myRobot.sayHello();
    }
}
