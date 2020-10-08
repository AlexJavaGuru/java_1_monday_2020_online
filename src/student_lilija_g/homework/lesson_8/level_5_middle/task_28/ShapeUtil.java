package student_lilija_g.homework.lesson_8.level_5_middle.task_28;

/*
Создайте класс ShapeUtilTest
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
shape[3] = shapeUtil.createRandomTriangle();
 */

import java.util.Random;

class ShapeUtil {

    Circle createCircle(double radius) {
        return new Circle("Circle", radius);
    }

    Square createSquare(double side) {
        return new Square("Square", side);
    }

    Rectangle createRectangle(double sideA, double sideB) {
        return new Rectangle("Rectangle", sideA, sideB);
    }

    Triangle createTriangle(double side) {
        return new Triangle("Triangle", side);
    }

    Circle createRandomCircle() {
        Random myRandom = new Random();
        double radius = myRandom.nextInt(10) + 5;
        return new Circle("Random Circle", radius);
    }

    Square createRandomSquare() {
        Random myRandom = new Random();
        return new Square("Random Square", myRandom.nextInt(10) + 5);
    }

    Rectangle createRandomRectangle() {
        Random myRandom = new Random();
        return new Rectangle("Random Rectangle", myRandom.nextInt(10) + 5, myRandom.nextInt(10) + 5);
    }

    Triangle createRandomTriangle() {
        Random myRandom = new Random();
        return new Triangle("Random Triangle", myRandom.nextInt(10) + 5);
    }

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

    double calculateArea(Shape[] shapes) {
        double resultSumArea = 0;
        for (Shape shape : shapes) {
            resultSumArea += shape.calculateArea();
        }
        return resultSumArea;
    }

    double calculatePerimeter(Shape[] shapes) {
        double resultSumPerimeter = 0;
        for (Shape shape : shapes) {
            resultSumPerimeter += shape.calculatePerimeter();
        }
        return resultSumPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
