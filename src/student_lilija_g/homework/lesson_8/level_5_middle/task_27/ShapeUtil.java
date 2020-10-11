package student_lilija_g.homework.lesson_8.level_5_middle.task_27;

/*
В классе ShapeUtil создайте методы:

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

Создайте ShapeUtilDemo класс и продемонстрируйте
расчёт площади и переиметра
любой геометрической фигуры.
 */

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random myRandom = new Random();
        double radius = myRandom.nextInt(10) + 5;
        System.out.println("\n" + "Random Circle radius is " + radius);
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
