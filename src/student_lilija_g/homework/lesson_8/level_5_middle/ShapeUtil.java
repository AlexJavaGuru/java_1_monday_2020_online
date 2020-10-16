package student_lilija_g.homework.lesson_8.level_5_middle;


import teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
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

    Circle createRandomCircle() {               // Task_20
        Random myRandom = new Random();
        double radius = myRandom.nextInt(10) + 5;
        return new Circle("Random Circle", radius);
    }

    Square createRandomSquare() {               // Task_21
        Random myRandom = new Random();
        return new Square("Random Square", myRandom.nextInt(10) + 5);
    }

    Rectangle createRandomRectangle() {         // Task_22
        Random myRandom = new Random();
        return new Rectangle("Random Rectangle", myRandom.nextInt(10) + 5, myRandom.nextInt(10) + 5);
    }

    Triangle createRandomTriangle() {           // Task_23
        Random myRandom = new Random();
        return new Triangle("Random Triangle", myRandom.nextInt(10) + 5);
    }

    Shape createRandomShape() {                 // Task_24
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

    double calculateArea(Shape[] shapes) {      // Task_25
        double resultSumArea = 0;
        for (Shape shape : shapes) {
            resultSumArea += shape.calculateArea();
        }
        return resultSumArea;
    }

    double calculatePerimeter(Shape[] shapes) { // Task_26
        double resultSumPerimeter = 0;
        for (Shape shape : shapes) {
            resultSumPerimeter += shape.calculatePerimeter();
        }
        return resultSumPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }           // Task_27

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    } // Task_27
}
