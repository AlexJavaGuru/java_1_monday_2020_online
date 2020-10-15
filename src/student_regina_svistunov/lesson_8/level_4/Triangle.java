package student_regina_svistunov.lesson_8.level_4;

//Создание иерархии класса Shape (геометрическая фигура).
//
//        Создайте наследника класс Shape - класс Triangle.
//        Этот класс должен представлять равносторонний треугоник.
//        Реализуйте в нём абстрактные методы из класса
//        Shape: calculateArea() и calculatePerimeter().
//        Напишите тесты для класса Triangle.

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Triangle extends Shape{

    private double side;
    private double base;
    private double height;


    public Triangle(double side, double base, double height, String title) {
        super(title);
        this.side = side;
        this.base = base;
        this.height = height;

    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    double calculatePerimeter() {
        return 3 * side;
    }
}
