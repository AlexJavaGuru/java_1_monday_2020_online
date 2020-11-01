package student_artur_martinenko.homework.lesson_8.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ShapeTest {
    public static void main(String[] args) {
        ShapeTest victim = new ShapeTest();
        victim.circleAreaCalculateTest();
        victim.circlePerimeterCalculateTest();
        victim.squareAreaCalculateTest();
        victim.squarePerimeterCalculateTest();
        victim.rectangleAreaCalculateTest();
        victim.rectanglePerimeterCalculateTest();
        victim.triangleAreaCalculateTest();
        victim.trianglePerimeterCalculateTest();
    }

    public void check(double expected, double actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    public void circleAreaCalculateTest() {
        Shape shape = new Circle("circle", 11);
        double area = shape.calculateArea();
        check(380.132711084365, area, "circleAreaCalculateTest");
    }

    public void circlePerimeterCalculateTest() {
        Shape shape = new Circle("circle", 11);
        double perimeter = shape.calculatePerimeter();
        check(69.11503837897544, perimeter, "circlePerimeterCalculateTest");
    }

    public void squareAreaCalculateTest() {
        Shape shape = new Square("square", 5.00);
        double area = shape.calculateArea();
        check(25.00, area, "squareAreaCalculateTest");
    }

    public void squarePerimeterCalculateTest() {
        Shape shape = new Square("square", 5.00);
        double perimeter = shape.calculatePerimeter();
        check(20.00, perimeter, "squarePerimeterCalculateTest");
    }

    public void rectangleAreaCalculateTest() {
        Shape shape = new Rectangle("square", 2.00, 3.00);
        double area = shape.calculateArea();
        check(6.00, area, "rectangleAreaCalculateTest");
    }

    public void rectanglePerimeterCalculateTest() {
        Shape shape = new Rectangle("square", 2.00, 3.00);
        double perimeter = shape.calculatePerimeter();
        check(10.00, perimeter, "rectanglePerimeterCalculateTest");
    }

    public void triangleAreaCalculateTest() {
        Shape shape = new Triangle("square", 5.00);
        double area = shape.calculateArea();
        check(10.825317547305485, area, "triangleAreaCalculateTest");
    }

    public void trianglePerimeterCalculateTest() {
        Shape shape = new Triangle("square", 5.00);
        double perimeter = shape.calculatePerimeter();
        check(15.00, perimeter, "trianglePerimeterCalculateTest");
    }

}
