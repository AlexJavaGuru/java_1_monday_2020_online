package teacher.lesson_8.lessoncode.mathoperations;

public class SubstractOperation implements MathOperation {
    @Override
    public int calculate(int argOne, int argTwo) {
        return argOne - argTwo;
    }
}
