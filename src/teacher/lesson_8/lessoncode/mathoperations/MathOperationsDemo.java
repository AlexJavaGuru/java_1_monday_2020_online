package teacher.lesson_8.lessoncode.mathoperations;

public class MathOperationsDemo {
    public static void main(String[] args) {
        MathOperation[] mathOperations = new MathOperation[5];

        mathOperations[0] = new SumOperation();
        mathOperations[1] = new DivisionOperation();
        mathOperations[2] = new SumOperation();
        mathOperations[3] = new MultiplicationOperation();
        mathOperations[4] = new SubstractOperation();

        MathOperationExecutor executor = new MathOperationExecutor();

        executor.execute(mathOperations, 10, 5);
    }
}
