package student_aleksejs_ivanovs.homework.lesson_8.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.shapeAreaTest();
        test.shapePerimeterTest();
    }

    public void shapeAreaTest() {
        ShapeUtilTest shapeUtil = new ShapeUtilTest();
        ShapeUtil shape = new ShapeUtil();
        double answer = shape.calculateArea(shapeUtil.shapeArrayCreate());

        if (answer == 113.85245) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test failed!");
        }
    }

    public void shapePerimeterTest() {
        ShapeUtilTest shapeUtil = new ShapeUtilTest();
        ShapeUtil shape = new ShapeUtil();
        double answer = shape.calculatePerimeter(shapeUtil.shapeArrayCreate());

        if (answer == 83.132) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test failed!");
        }
    }

    public Shape[] shapeArrayCreate() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle("Circle", 4);
        shapes[1] = new Square("Square", 4);
        shapes[2] = new Rectangle("Rectangle", 4, 8);
        shapes[3] = new Triangle("Triangle", 6, 5.19615);
        return shapes;
    }

}
