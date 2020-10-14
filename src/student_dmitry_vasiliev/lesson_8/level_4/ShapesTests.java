package student_dmitry_vasiliev.lesson_8.level_4;

class ShapesTests {

    public static void main(String[] args) {

        ShapesTests test = new ShapesTests();
        test.shouldCircleArea();
        test.shouldCirclePerimeter();
        test.shouldSquareArea();
        test.shouldSquarePerimeter();
        test.shouldRectangleArea();
        test.shouldRectanglePerimeter();
        test.shouldTriangleArea();
        test.shouldTrianglePerimeter();
    }

    public void shouldCircleArea() {
        String testName = "shouldCircleArea";
        Circle circle = new Circle(4);
        double expectedArea = circle.calculateArea();
        double actualArea = 50.26548245743669;
        printTestResult(expectedArea == actualArea, testName);
    }

    public void shouldCirclePerimeter() {
        String testName = "shouldCirclePerimeter";
        Circle circle = new Circle(4);
        double expectedPerimeter = circle.calculatePerimeter();
        double actualPerimeter = 25.132741228718345;
        printTestResult(expectedPerimeter == actualPerimeter, testName);
    }

    public void shouldSquareArea() {
        String testName = "shouldSquareArea";
        Square square = new Square(5);
        double expectedArea = square.calculateArea();
        double actualArea = 25;
        printTestResult(expectedArea == actualArea, testName);
    }

    public void shouldSquarePerimeter() {
        String testName = "shouldSquarePerimeter";
        Square square = new Square(5);
        double expectedPerimeter = square.calculatePerimeter();
        double actualPerimeter = 20;
        printTestResult(expectedPerimeter == actualPerimeter, testName);
    }

    public void shouldRectangleArea() {
        String testName = "shouldRectangleArea";
        Rectangle rectangle = new Rectangle(5, 6);
        double expectedArea = rectangle.calculateArea();
        double actualArea = 30;
        printTestResult(expectedArea == actualArea, testName);
    }

    public void shouldRectanglePerimeter() {
        String testName = "shouldRectanglePerimeter";
        Rectangle rectangle = new Rectangle(5, 6);
        double expectedPerimeter = rectangle.calculatePerimeter();
        double actualPerimeter = 22;
        printTestResult(expectedPerimeter == actualPerimeter, testName);
    }

    public void shouldTriangleArea() {
        String testName = "shouldTriangleArea";
        Triangle triangle = new Triangle(5);
        double expectedArea = triangle.calculateArea();
        double actualArea = 10.825317547305483;
        printTestResult(expectedArea == actualArea, testName);
    }

    public void shouldTrianglePerimeter() {
        String testName = "shouldTrianglePerimeter";
        Triangle triangle = new Triangle(5);
        double expectedPerimeter = triangle.calculatePerimeter();
        double actualPerimeter = 15;
        printTestResult(expectedPerimeter == actualPerimeter, testName);
    }

    public void printTestResult(boolean check, String testName) {
        if (check) {
            System.out.println("Test " + testName + " has passed!");
        } else {
            System.out.println("Test " + testName + " failed!");
        }
    }


}
