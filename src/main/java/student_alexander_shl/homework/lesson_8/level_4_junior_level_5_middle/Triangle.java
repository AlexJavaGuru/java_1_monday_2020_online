package student_alexander_shl.homework.lesson_8.level_4_junior_level_5_middle;
/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Triangle.
Этот класс должен представлять равносторонний треугоник.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Triangle.
 */

class Triangle extends Shape{

    private double side;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side * Math.sqrt(3) / 4;
    }

    @Override
    double calculatePerimeter() {
        return 3 * side;
    }

}
