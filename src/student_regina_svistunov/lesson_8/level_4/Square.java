package student_regina_svistunov.lesson_8.level_4;

//Создание иерархии класса Shape (геометрическая фигура).
//
//        Создайте наследника класс Shape - класс Square.
//        Реализуйте в нём абстрактные методы из класса
//        Shape: calculateArea() и calculatePerimeter().
//        Напишите тесты для класса Square.


public class Square extends Shape{

    private double side;

    public Square(double side, String title) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }
}
