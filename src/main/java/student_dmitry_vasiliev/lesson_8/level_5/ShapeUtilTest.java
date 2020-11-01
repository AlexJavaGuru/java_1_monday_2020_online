
package student_dmitry_vasiliev.lesson_8.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ShapeUtilTest {

    public static void main(String[] args) {

        ShapeUtilTest test = new ShapeUtilTest();
        test.shouldSumAllPerimeter();
        test.shouldSumAllArea();
    }

    private void shouldSumAllArea() {
        String testName = "shouldSumAllArea";
        ShapeUtil shapeUtil = new ShapeUtil();
        double expectedArea = shapeUtil.calculateTotalArea(shapesArray());
        System.out.println(expectedArea);
        double actualArea = 24.29842142192805;
        printTestResult(expectedArea == actualArea, testName);
    }

    private void shouldSumAllPerimeter() {
        String testName = "shouldSumAllPerimeter";
        ShapeUtil shapeUtil = new ShapeUtil();
        double expectedPerimeter = shapeUtil.calculateTotalPerimeter(shapesArray());
        System.out.println(expectedPerimeter);
        double actualPerimeter = 36.56637061435917;
        printTestResult(expectedPerimeter == actualPerimeter, testName);
    }

    private Shape[] shapesArray() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(2);
        shapes[1] = new Square(2);
        shapes[2] = new Rectangle(2, 3);
        shapes[3] = new Triangle(2);
        return shapes;
    }

    private void printTestResult(boolean check, String testName) {
        if (check) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " failed!");
        }
    }
}