package student_alexander_shl.homework.lesson_8.level_4_junior_level_5_middle;

class ShapeUtilTest {      // Task_28

    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();

        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();

        double resultCalculateArea = 0;
        double resultCalculatePerimeter = 0;

        for (Shape value : shapes) {
            resultCalculateArea += shapeUtil.calculateArea(value);
            resultCalculatePerimeter += shapeUtil.calculatePerimeter(value);
        }
        shapeUtilTest.checkTest(resultCalculateArea, shapeUtil.calculateArea(shapes), "Calculate Shapes Area");
        shapeUtilTest.checkTest(resultCalculatePerimeter, shapeUtil.calculatePerimeter(shapes), "Calculate Shapes Perimeter");
    }

    void checkTest(double calculatedValue, double realValue, String testName) {
        if (calculatedValue == realValue) {
            System.out.println(testName + ": Test OK");
        } else {
            System.out.println(testName + ": Test WRONG");
            System.out.println("calculatedValue = " + calculatedValue);
            System.out.println("realValue = " + realValue);
        }
    }
}

