package teacher.lesson_8.lessoncode.mathoperations;

public class MathOperationExecutor {

    public void execute(MathOperation[] mathOperations, int argOne, int argTwo) {
        for (MathOperation mathOperation : mathOperations) {
            int result = mathOperation.calculate(argOne, argTwo);
            System.out.println(result);
        }
    }
}
