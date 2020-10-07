package student_regina_svistunov.lesson_8.level_5;

import java.util.Random;

//Task_20
//        Создайте класс ShapeUtil.
//        В класе ShapeUtil реализуйте метод:
//        Circle createRandomCircle();
//        Этот метод создаёт круг со случайным радиусом.
//Task_21
//В класе ShapeUtil реализуйте метод:
//        Square createRandomSquare();
//        Этот метод создаёт квадрат со случайно выбранной длиной стороны.
//Task_22
//В класе ShapeUtil реализуйте метод:
//        Rectangle createRandomRectangle();
//        Этот метод создаёт прямоугольник со случайно выбранными сторонами.
//Task_23
//В класе ShapeUtil реализуйте метод:
//        Triangle createRandomTriangle();
//        Этот метод создаёт равносторонний треугольник
//        со случайно выбранной длиной стороны.

public class ShapeUtil {

    public Circle createRandomCircle() {
        Random random = new Random();
        return new Circle( "Circle",random.nextInt(20));
    }

    public Square createRandomSquare() {
        Random random = new Random();
        return new Square("Square", random.nextInt(50));
    }

    public Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle("Rectangle", random.nextInt(50), random.nextInt(50));
    }

    public Triangle createRandomTriangle() {
        Random random = new Random();
        return new Triangle("Triangle", random.nextInt(50), random.nextInt(50), random.nextInt(50));
    }


    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
