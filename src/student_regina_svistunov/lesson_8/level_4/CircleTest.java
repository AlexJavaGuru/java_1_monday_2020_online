package student_regina_svistunov.lesson_8.level_4;

class CircleTest {
    public static void main(String[] args) {
        CircleTest test = new CircleTest();
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
        Circle circle = new Circle(11, "Circle Area");
        double area = circle.calculateArea();
        check(380.132711084365, area, "Circle Area");
    }

    public void perimeterTest() {
        Circle circle = new Circle(11, "Circle Perimeter");
        double perimeter = circle.calculatePerimeter();
        check(69.11503837897544, perimeter, "Circle Perimeter");
    }


}