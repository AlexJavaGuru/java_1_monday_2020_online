package student_lilija_g.homework.lesson_8.level_4_junior.task_19;

class Task_19 {
    public static void main(String[] args) {

        Task_19 myTask_19 = new Task_19();
        Shape myShape = new Triangle("Triangle",10);

        myTask_19.totalDoubleTest(43.30127018922193, myShape.calculateArea(), "CalculateArea Triangle");
        myTask_19.totalDoubleTest(30.00, myShape.calculatePerimeter(), "CalculatePerimeter Triangle");
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
