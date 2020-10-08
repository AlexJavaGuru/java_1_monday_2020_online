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
//Task_24
//В класе ShapeUtil реализуйте метод:
//        Shape createRandomShape() {
//        }
//        Этот метод создаёт случайную геометрическую фигуру.
//Task_25
//В класе ShapeUtil реализуйте метод:
//        double calculateArea(Shape[] shapes);
//        Этот метод расчитывает объщую площадь
//        геометрических фигур из массива.
//Task_26
//        В класе ShapeUtil реализуйте метод:
//        double calculatePerimeter(Shape[] shapes);
//        Этот метод расчитывает общий периметр
//        геометрических фигур из массива.
//Task_27
//        В классе ShapeUtil создайте методы:
//        double calculateArea(Shape shape) {
//        return shape.calculateArea();
//        }
//        double calculatePerimeter(Shape shape) {
//        return shape.calculatePerimeter();
//        }
//        Создайте ShapeUtilDemo класс и продемонстрируйте
//        расчёт площади и переиметра
//        любой геометрической фигуры.
//        Пример для круга:
//        ShapeUtil shapeUtil = new ShapeUtil();
//        Shape circle = shapeUtil.createRandomCircle();
//        double circleArea = shapeUtil.calculateArea(circle);
//        double circlePerimeter = shapeUtil.calculatePerimeter(circle);


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

    public Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    public double calculateArea(Shape[] shapes) {
        double shapesArea = 0;
        for (Shape shape: shapes) {
            shapesArea += shape.calculateArea();
        } return shapesArea;
    }

    public double calculatePerimeter(Shape[] shapes) {
        double shapesPerimeter = 0;
        for (Shape shape: shapes) {
            shapesPerimeter += shape.calculatePerimeter();
        } return shapesPerimeter;
    }




    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
