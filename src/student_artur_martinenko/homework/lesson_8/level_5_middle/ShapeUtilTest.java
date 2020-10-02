package student_artur_martinenko.homework.lesson_8.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest victim = new ShapeUtilTest();
        victim.check(421.95802863167046, (victim.calculateArea(fillShapeArray())), "calculateAreaTest");
        victim.check(114.11503837897544, (victim.calculatePerimeter(fillShapeArray())), "calculatePerimeterTest");
    }

    private static Shape[] fillShapeArray() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("circle", 11.00);
        shapes[1] = new Square("square", 5.00);
        shapes[2] = new Rectangle("rectangle", 2.00, 3.00);
        shapes[3] = new Triangle("triangle", 5.00);
        return shapes;
    }

    private void check(double expected, double actual, String testName) {
        if (expected == actual) {
            System.out.println("Test " + testName + " - PASSED");
        } else {
            System.out.println("Test " + testName + " - FAILED");
            System.out.println("\tExpected " + expected + " but passed " + actual);
        }
    }

    double calculateArea(Shape[] shapes) {
        double areaSum = 0;
        for (Shape shape : shapes) {
            areaSum += shape.calculateArea();
        }
        return areaSum;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeterSum = 0;
        for (Shape shape : shapes) {
            perimeterSum += shape.calculatePerimeter();
        }
        return perimeterSum;
    }


}
