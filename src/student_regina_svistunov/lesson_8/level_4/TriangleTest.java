package student_regina_svistunov.lesson_8.level_4;

class TriangleTest {
    public static void main(String[] args) {
        TriangleTest test = new TriangleTest();
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
        Triangle triangle = new Triangle(0, 3, 5, "Triangle Area");
        double area = triangle.calculateArea();
        check(7.5, area, "Triangle Area");
    }

    public void perimeterTest() {
        Triangle triangle = new Triangle(3, 0,0,"Triangle Perimeter");
        double perimeter = triangle.calculatePerimeter();
        check(9, perimeter, "Triangle Perimeter");
    }


}