package student_andris_tresutins.homework.lesson_8.level_5;

import student_andris_tresutins.homework.lesson_8.level_4.*;

public class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.testArea();
        test.testPerimeter();
    }

    public Shape_T15[] createRandomShapesArray(){

        Circle_T16 victimOne = new Circle_T16("Circle", 4);
        Rectangle_T18 victimTwo = new Rectangle_T18("Rectangle", 5 , 5);
        Square_T17 victimThree = new Square_T17("Square", 5);
        Triangle_T19 victimFour = new Triangle_T19("Triangle", 3);

        Shape_T15[] shapes = new Shape_T15[4];
        shapes[0] = victimOne;
        shapes[1] = victimTwo;
        shapes[2] = victimThree;
        shapes[3] = victimFour;

        return shapes;
    }

    public void testArea(){
        ShapeUtil victimTwo = new ShapeUtil();

                                 //double calculateArea(Shape[] shapes);
        double result = victimTwo.calculateArea(createRandomShapesArray());
        double expectedResult = 104.16259677446666;

        check(expectedResult, result, "Test Area");
    }

    public void testPerimeter(){
        ShapeUtilTest victim = new ShapeUtilTest();
        ShapeUtil victimTwo = new ShapeUtil();

        double result = victimTwo.calculatePerimeter(createRandomShapesArray());
        double expectedResult = 74.13274122871834;

        check(expectedResult, result, "Test Perimeter");
    }

    public void check(double expectedRes, double result, String testName) {

        if (expectedRes == result) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected result was : " + expectedRes + " but actual result was : " + result);
        }
    }
}
