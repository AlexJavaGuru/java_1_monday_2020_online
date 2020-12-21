package student_alexander_shl.homework.lesson_8.level_4_junior_level_5_middle;
/*
Создание иерархии класса Shape (геометрическая фигура).

Создайте наследника класс Shape - класс Rectangle.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Rectangle.
 */

class Rectangle extends Shape{

    public Rectangle(String title, double side1, double side2) {
        super(title);
        this.side1 = side1;
        this.side2 = side2;
    }

    private double side1;
    private double side2;

    @Override
    double calculateArea() {
        return side1 * side2;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (side1 + side2);
    }
}
