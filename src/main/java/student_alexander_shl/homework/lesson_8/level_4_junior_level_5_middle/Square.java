package student_alexander_shl.homework.lesson_8.level_4_junior_level_5_middle;
/*

Создайте наследника класс Shape - класс Square.
Реализуйте в нём абстрактные методы из класса
Shape: calculateArea() и calculatePerimeter().
Напишите тесты для класса Square.

 */

class Square extends Shape{

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    private double side;

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return 4 * side;
    }
}
