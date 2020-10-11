package student_lilija_g.homework.lesson_8.level_5_middle.task_22;

/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Rectangle.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Rectangle.
 */

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
