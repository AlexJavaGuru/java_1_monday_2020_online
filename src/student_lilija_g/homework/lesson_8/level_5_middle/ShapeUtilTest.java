package student_lilija_g.homework.lesson_8.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ShapeUtilTest {
    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        ShapeUtilTest myShapeUtilTest = new ShapeUtilTest();

        Shape[] shape = new Shape[4];
        shape[0] = shapeUtil.createCircle(5);
        shape[1] = shapeUtil.createSquare(10);
        shape[2] = shapeUtil.createRectangle(5, 10);
        shape[3] = shapeUtil.createTriangle(15);

        myShapeUtilTest.totalDoubleTest(78.53981633974483, shapeUtil.calculateArea(shape[0]), "Circle Area");
        myShapeUtilTest.totalDoubleTest(100.00, shapeUtil.calculateArea(shape[1]), "Square Area");
        myShapeUtilTest.totalDoubleTest(50.00, shapeUtil.calculateArea(shape[2]), "Rectangle Area");
        myShapeUtilTest.totalDoubleTest(97.42785792574934, shapeUtil.calculateArea(shape[3]), "Triangle Area");

        myShapeUtilTest.totalDoubleTest(325.96767426549417, shapeUtil.calculateArea(shape), "Calculate Area with SUM");

        myShapeUtilTest.totalDoubleTest(31.41592653589793, shapeUtil.calculatePerimeter(shape[0]), "Circle Perimeter");
        myShapeUtilTest.totalDoubleTest(40.00, shapeUtil.calculatePerimeter(shape[1]), "Square Perimeter");
        myShapeUtilTest.totalDoubleTest(30.00, shapeUtil.calculatePerimeter(shape[2]), "Rectangle Perimeter");
        myShapeUtilTest.totalDoubleTest(45.00, shapeUtil.calculatePerimeter(shape[3]), "Triangle Perimeter");

        myShapeUtilTest.totalDoubleTest(146.41592653589793, shapeUtil.calculatePerimeter(shape), "Calculate Perimeter with SUM");

        double resultSumArea = 0;
        double resultSumPerimeter = 0;

        for (Shape value : shape) {
            resultSumArea += shapeUtil.calculateArea(value);
            resultSumPerimeter += shapeUtil.calculatePerimeter(value);
        }

        myShapeUtilTest.totalDoubleTest(resultSumArea, shapeUtil.calculateArea(shape), "CalculateArea");
        myShapeUtilTest.totalDoubleTest(resultSumPerimeter, shapeUtil.calculatePerimeter(shape), "CalculatePerimeter");
    }

    void totalDoubleTest(Double expectedValue, Double actualValue, String testName) {

        if (Double.compare(expectedValue, actualValue) == 0) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
            System.out.println("ExpectedValue=" + expectedValue);
            System.out.println("ActualValue=" + actualValue);
        }
    }
}
