package student_alexander_shl.homework.lesson_3.level_3.task_11;

import teacher.annotations.CodeReview;

/*
Дайте роботу имя!

Тема: объявление свойства класса.

Мы можем создать сколько угодно виртуальных обьектов робот.
Но все они при вызове метода sayYourName() печатают на
консоль одно и то же: "My name is ROBO". Давайте это исправим!
Давайте научим наших роботов запоминать своё уникальное имя
при создании и потом использовать его при вызове команды
sayYourName().

Добавьте в класс Robot свойство name:

    class Robot {

        // в этом свойстве наш виртуальный обьект робот будет
        // запоминать своё имя. Мы используем тип String потому
        // что имя это строка.
        private String name;

        ....
    }
 */
@CodeReview(approved = true)
class RoboDemo {
    public static void main(String[] args) {
        Robo myRobot = new Robo("Lui");
        myRobot.sayHello();
        myRobot.sayYourName();

        Robo robot1 = new Robo("Luise");
        robot1.sayHello();
        robot1.sayYourName();

        Robo robot2 = new Robo("Isa");
        robot2.sayHello();
        robot2.sayYourName();

    }
}
