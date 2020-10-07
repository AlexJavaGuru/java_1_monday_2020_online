package student_regina_svistunov.lesson_8.level_4;

class SquareTest {
    public static void main(String[] args) {
        SquareTest test = new SquareTest();
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
        Square square = new Square(10, "Square Area");
        double area = square.calculateArea();
        check(100, area, "Square Area");
    }

    public void perimeterTest() {
        Square square = new Square(10, "Square Perimeter");
        double perimeter = square.calculatePerimeter();
        check(40, perimeter, "Square Perimeter");
    }



}