package student_lilija_g.homework.lesson_8.level_4_junior.task_17;

import teacher.annotations.CodeReview;

/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Square.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Square.
 */
@CodeReview(approved = true)
abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}
