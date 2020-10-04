package student_regina_svistunov.lesson_8.level_4;

//Создание иерархии класса Shape (геометрическая фигура).
//        Создайте наследника класс Shape - класс Circle.
//        Реализуйте в нём абстрактные методы из класса
//        Shape: calculateArea() и calculatePerimeter().
//        Напишите тесты для класса Circle.
//        PS: подсказка - необходимые значения для
//        расчёта площади и периметра подавайте к
//        класс через конструктор.
//
//class Circle extends Shape {
//
//    private double radius;
//
//    Circle(double radius) {
//        this.radius = radius;
//    }
//    // implement here calculateArea()
//    // implement here calculatePerimeter()
//}

public class Circle extends Shape {

    private double radius;

    public Circle(double radius, String title) {
        super(title);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
