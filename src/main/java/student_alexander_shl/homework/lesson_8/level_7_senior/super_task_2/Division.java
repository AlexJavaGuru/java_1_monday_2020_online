package student_alexander_shl.homework.lesson_8.level_7_senior.super_task_2;

class Division extends TwoArgumentMathOperation{
    public Division(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        if (0 != calculateRightSide()) {
            return calculateLeftSide() / calculateRightSide();
        }
        return 0;
    }

}
