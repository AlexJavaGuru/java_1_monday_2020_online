package student_dmitry_vasiliev.lesson_8.level_5;
/*
- Task_20 Создайте класс ShapeUtil.
        В класе ShapeUtil реализуйте метод:
        Circle createRandomCircle();
        Этот метод создаёт круг со случайным радиусом.
- Task_21 В класе ShapeUtil реализуйте метод:
        Square createRandomSquare();
        Этот метод создаёт квадрат со случайно выбранной длиной стороны.
- Task_22 В класе ShapeUtil реализуйте метод:
        Rectangle createRandomRectangle();
        Этот метод создаёт прямоугольник со случайно выбранными сторонами.
- Task_23 В класе ShapeUtil реализуйте метод:
        Triangle createRandomTriangle();
        Этот метод создаёт равносторонний треугольник
        со случайно выбранной длиной стороны.
- Task_24 В класе ShapeUtil реализуйте метод:
        Shape createRandomShape() {
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
            Этот метод создаёт случайную геометрическую фигуру.
- Task_25 В класе ShapeUtil реализуйте метод:
        double calculateArea(Shape[] shapes);
        Этот метод расчитывает объщую площадь
        геометрических фигур из массива.
- Task_26 В класе ShapeUtil реализуйте метод:
        double calculatePerimeter(Shape[] shapes);
        Этот метод расчитывает общий периметр
        геометрических фигур из массива.
- Task_27 В классе ShapeUtil создайте методы:
            double calculateArea(Shape shape) {
                return shape.calculateArea();
            }
            double calculatePerimeter(Shape shape) {
                return shape.calculatePerimeter();
            }
        Создайте ShapeUtilDemo класс и продемонстрируйте
        расчёт площади и переиметра
        любой геометрической фигуры.
- Task_28 Создайте класс ShapeUtilTest
        и напишите тесты для методов:
            double calculateArea(Shape[] shapes);
            double calculatePerimeter(Shape[] shapes);

        PS: пример создания и заполнения массива
        геометрических фигур:
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = new Shape[4];
        shape[0] = shapeUtil.createRandomCircle();
        shape[1] = shapeUtil.createRandomSquare();
        shape[2] = shapeUtil.createRandomRectangle();
        shape[3] = shapeUtil.createRandomTriangle();*/

import teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class ShapeUtil {

    public Circle createRandomCircle() {
        Random random = new Random();
        return new Circle(random.nextInt(10));
    }

    public Square createRandomSquare() {
        Random random = new Random();
        return new Square(random.nextInt(10));
    }

    public Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle(random.nextInt(10), random.nextInt(10));
    }

    public Triangle createRandomTriangle() {
        Random random = new Random();
        return new Triangle(random.nextInt(10));
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

    double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    double calculateTotalPerimeter(Shape[] shapes) {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }
        return totalPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    String name(Shape shape) {
        return shape.name();
    }

}
