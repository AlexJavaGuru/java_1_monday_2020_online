package student_regina_svistunov.lesson_8.level_4;

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.areaTest();
        test.perimeterTest();

    }

    void check(double expected, double actual, String testName) {
        if (expected == actual) {
            System.out.println(testName + " is Passed!");
        } else {
            System.out.println(testName + " is Failed!");
        }
    }

    public void areaTest() {
        Rectangle rectangle = new Rectangle(10, 20, "Square Area");
        double area = rectangle.calculateArea();
        check(200, area, "Rectangle Area");
    }

    public void perimeterTest() {
        Rectangle rectangle = new Rectangle(10, 20, "Square Perimeter");
        double perimeter = rectangle.calculatePerimeter();
        check(60, perimeter, "Rectangle Perimeter");
    }

}