package student_dmitry_vasiliev.lesson_8.level_4;

/*    Создание иерархии класса Shape (геометрическая фигура).

    Дан класс Shape:

- Task_15  Объявите в классе Shape абстрактный метод
    для подсчёта периметра.

- Task_16 Создайте наследника класс Shape - класс Circle.
    Реализуйте в нём абстрактные методы из класса
    Shape: calculateArea() и calculatePerimeter().
    Напишите тесты для класса Circle.
    PS: подсказка - необходимые значения для
    расчёта площади и периметра подавайте к
    класс через конструктор.

- Task_17 Создайте наследника класс Shape - класс Square.
    Реализуйте в нём абстрактные методы из класса
    Shape: calculateArea() и calculatePerimeter().
    Напишите тесты для класса Square.

- Task_18 Создайте наследника класс Shape - класс Rectangle.
    Реализуйте в нём абстрактные методы из класса
    Shape: calculateArea() и calculatePerimeter().
    Напишите тесты для класса Rectangle.

- Task_19 Создайте наследника класс Shape - класс Triangle.
    Этот класс должен представлять равносторонний треугоник.
    Реализуйте в нём абстрактные методы из класса
    Shape: calculateArea() и calculatePerimeter().
    Напишите тесты для класса Triangle.*/

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    Shape() {

    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}



