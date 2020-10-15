package student_aleksejs_ivanovs.homework.lesson_8.level_5;

import teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class ShapeUtil {

    public Circle createRandomCircle() {
        Random rand = new Random();
        return new Circle("Circle", rand.nextInt(20));
    }

    public Square createRandomSquare() {
        Random rand = new Random();
        return new Square("Square", rand.nextInt(20));
    }

    public Rectangle createRandomRectangle() {
        Random rand = new Random();
        return new Rectangle("Rectangle", rand.nextInt(20), rand.nextInt(20));
    }

    public Triangle createRandomTriangle() {
        Random rand = new Random();
        return new Triangle("Triangle", rand.nextInt(20), rand.nextInt(20));
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
        double generalArea = 0;
        for (Shape shape : shapes) {
            generalArea += shape.calculateArea();
        }
        return generalArea;
    }

    public double calculatePerimeter(Shape[] shapes) {
        double generalPerimeter = 0;
        for (Shape shape : shapes) {
            generalPerimeter += shape.calculatePerimeter();
        }
        return generalPerimeter;
    }

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
