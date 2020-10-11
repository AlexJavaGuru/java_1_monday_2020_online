package student_alexander_shl.homework.lesson_3.level_1.task_6;

/*
Создаём свою армию роботов!

В этом задании мы продолжаем работать с классом Robot.

В методе main(...) класса RobotDemo продемонстрируйте создание
нескольких виртуальный обьектов робот и работу с ними
(вызовы у них методов sayHello() и sayYourName()).

PS: ваш код внутри main метода будет выглядеть примерно так:

Robot robot1 = new Robot();
robot1.sayHello();
robot1.sayYourName();

Robot robot2 = new Robot();
robot2.sayHello();
robot2.sayYourName();

Класс (Robot) это как чертёж или шаблон, на основе которого
в вашей программе можно создавать сколько угодно виртуальных
обьектов и управлять ими (вызывать у них разные методы).
 */
class RobotDemo {

    public static void main(String[] args) {
        Robot myRobot = new Robot("Lui");
        myRobot.sayHello();
        myRobot.sayYourName();

        Robot robot1 = new Robot("Luise");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("Isa");
        robot2.sayHello();
        robot2.sayYourName();

    }
}
