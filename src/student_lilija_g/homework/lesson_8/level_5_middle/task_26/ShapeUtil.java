package student_lilija_g.homework.lesson_8.level_5_middle.task_26;

/*
В класе ShapeUtil реализуйте метод:

    double calculatePerimeter(Shape[] shapes);

Этот метод расчитывает общий периметр
геометрических фигур из массива.
 */

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random myRandom = new Random();
        return new Circle("Random Circle", myRandom.nextInt(10));
    }

    Square createRandomSquare() {
        Random myRandom = new Random();
        return new Square("Random Square", myRandom.nextInt(10));
    }

    Rectangle createRandomRectangle() {
        Random myRandom = new Random();
        return new Rectangle("Random Rectangle", myRandom.nextInt(10), myRandom.nextInt(10));
    }

    Triangle createRandomTriangle() {
        Random myRandom = new Random();
        return new Triangle("Random Triangle", myRandom.nextInt(10));
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
}
