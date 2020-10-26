package student_artur_martinenko.homework.lesson_8.level_5_middle;


import teacher.annotations.CodeReview;

import java.util.Random;

@CodeReview(approved = true)
class ShapeUtil {

    public Circle createRandomCircle() {
        Random rand = new Random();
        return new Circle("random circle", rand.nextInt(101));
    }

    public Square createRandomSquare() {
        Random rand = new Random();
        return new Square("random square", rand.nextInt(101));
    }

    public Rectangle createRandomRectangle() {
        Random rand = new Random();
        return new Rectangle("random rectangle", rand.nextInt(101), rand.nextInt(101));
    }

    public Triangle createRandomTriangle() {
        Random rand = new Random();
        return new Triangle("random rectangle", rand.nextInt(101));
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
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    public double calculatePerimeter(Shape[] shapes) {
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


}
