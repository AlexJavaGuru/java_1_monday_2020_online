package student_lilija_g.homework.lesson_8.level_7_senior.super_task_2;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Subtraction extends TwoArgumentMathOperation {

	public Subtraction(MathOperation leftArgument,
					   MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() - calculateRightSide();
	}
}

