package student_lilija_g.homework.lesson_8.level_4_junior.task_18;

class Task_18 {
    public static void main(String[] args) {

        Task_18 myTask_18 = new Task_18();
        Shape myShape = new Rectangle("Rectangle", 5, 10);

        myTask_18.totalDoubleTest(50.00, myShape.calculateArea(), "CalculateArea Rectangle");
        myTask_18.totalDoubleTest(30.00, myShape.calculatePerimeter(), "CalculatePerimeter Rectangle");
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

