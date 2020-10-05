package student_lilija_g.homework.lesson_8.level_4_junior.task_17;

class Task_17 {
    public static void main(String[] args) {

        Task_17 myTask_17 = new Task_17();
        Shape myShape = new Square("Square", 5);

        myTask_17.totalDoubleTest(25.00, myShape.calculateArea(), "CalculateArea Square");
        myTask_17.totalDoubleTest(20.00, myShape.calculatePerimeter(), "CalculatePerimeter Square");
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
