package student_lilija_g.homework.lesson_8.level_4_junior.task_19;

/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Triangle.
Этот класс должен представлять равносторонний треугоник.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Triangle.
 */

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}
