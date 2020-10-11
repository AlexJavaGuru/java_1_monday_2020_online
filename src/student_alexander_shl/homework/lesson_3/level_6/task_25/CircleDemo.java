package student_alexander_shl.homework.lesson_3.level_6.task_25;

class CircleDemo {

    public static void main(String[] args) {

        Circle myCircle = new Circle(8);
        CircleDemo myCircleDemo = new CircleDemo();
        myCircleDemo.checkTest(201.06192982974676, myCircle.calculateArea(8), "calculateAreaTest");

        double radius = 5.00;
        double result=myCircle.calculateArea(radius);
        myCircleDemo.checkTest(78.53981633974483, result, "calculateAreaTest");

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
