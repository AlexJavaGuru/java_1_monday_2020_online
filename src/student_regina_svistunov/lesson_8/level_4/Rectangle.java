package student_regina_svistunov.lesson_8.level_4;

//Создание иерархии класса Shape (геометрическая фигура).
//
//        Создайте наследника класс Shape - класс Rectangle.
//        Реализуйте в нём абстрактные методы из класса
//        Shape: calculateArea() и calculatePerimeter().
//        Напишите тесты для класса Rectangle.


import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String title) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        return sideA * sideB;
    }

    @Override
    double calculatePerimeter() {
        return 2 * ( sideA + sideB);
    }
}
