package student_aleksejs_ivanovs.homework.lesson_8.level_4;

class ShapeTests {

    public static void main(String[] args) {
        ShapeTests test = new ShapeTests();
        test.SquareAreaTest();
        test.SquarePerimeterTest();
        test.RectangleAreaTest();
        test.RectanglePerimeterTest();
        test.TriangleAreaTest();
        test.TrianglePerimeterTest();
    }

    public void SquareAreaTest() {
        Shape square = new Square("Square", 4);

        double actualResult = square.calculateArea();

        double expectedResult = 16;

        check(expectedResult, actualResult, "SquareAreaTest");
    }

    public void SquarePerimeterTest() {
        Shape square = new Square("Square", 4);

        double actualResult = square.calculatePerimeter();

        double expectedResult = 16;

        check(expectedResult, actualResult, "SquarePerimeterTest");
    }

    public void RectangleAreaTest() {
        Shape rectangle = new Rectangle("Rectangle", 4, 8);

        double actualResult = rectangle.calculatePerimeter();

        double expectedResult = 24;

        check(expectedResult, actualResult, "RectangleAreaTest");
    }

    public void RectanglePerimeterTest() {
        Shape rectangle = new Rectangle("Rectangle", 4 , 8);

        double actualResult = rectangle.calculatePerimeter();

        double expectedResult = 24;

        check(expectedResult, actualResult, "RectanglePerimeterTest");
    }

    public void TriangleAreaTest() {
        Shape triangle = new Triangle("Triangle", 6, 5.19615);

        double actualResult = triangle.calculatePerimeter();

        double expectedResult = 18;

        check(expectedResult, actualResult, "TriangleAreaTest");
    }

    public void TrianglePerimeterTest() {
        Shape triangle = new Triangle("Triangle", 6, 5.19615);

        double actualResult = triangle.calculatePerimeter();

        double expectedResult = 18;

        check(expectedResult, actualResult, "TrianglePerimeterTest");
    }

    private void check(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedResult + " but actual result was : " + actualResult);
        }
    }

}
