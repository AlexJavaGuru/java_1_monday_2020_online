package student_lilija_g.homework.lesson_8.level_4_junior.task_16;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Task_16 {
    public static void main(String[] args) {

        Task_16 myTask_16 = new Task_16();
        Shape myShape = new Circle("Circle", 5);

        myTask_16.totalDoubleTest(78.53981633974483, myShape.calculateArea(), "CalculateArea Circle");
        myTask_16.totalDoubleTest(31.41592653589793, myShape.calculatePerimeter(), "CalculatePerimeter Circle");
    }

    void totalDoubleTest(Double expectedValue, Double actualValue, String testName) {

        if (Double.compare(expectedValue, actualValue) == 0) {
            System.out.println(testName + " test = OK");
        } else {
            System.out.println(testName + " test = FAIL");
            System.out.println("ExpectedValue=" + expectedValue);
            System.out.println("ActualValue=" + actualValue);
        }
    }
}

