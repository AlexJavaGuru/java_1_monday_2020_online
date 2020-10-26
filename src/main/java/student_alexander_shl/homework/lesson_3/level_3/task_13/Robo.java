package student_alexander_shl.homework.lesson_3.level_3.task_13;
/*
Дайте роботу имя! Продолжение.

Тема: использование свойства класса.


Воспользуйтесь свойством класса в методе sayYourName():

    class Robot {

        // в этом свойстве наш виртуальный обьект робот будет
        // запоминать своё имя. Мы используем тип String потому
        // что имя это строка.
        private String name;

        // Это конструктор класса. У этого конструктора один параметр
        // с названием name и типом String. Тоесть при создании робота
        // в его конструктор будут передавать название робота.
        public Robot(String robotName) {
            this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
        }

        public void sayYourName() {
            System.out.println("My name is " + this.name);
        }

    }

Запустите программу RobotDemo и убедитесь,
что каждый робот теперь запомнил своё имя!
 */

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Robo {
    String name;

    public Robo(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello!");
    }

    public void sayYourName() {
        System.out.println("My name is " + this.name + ".");
    }
}
