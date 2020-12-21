package student_alexander_shl.homework.lesson_8.level_7_senior.super_task_2;

/*
Разобраться в коде MathOperation, который находится в пакете super_task_2.
Реализовать две дополнительные математические операции: умножение и деление.
В демо программе сконструировать и вычислить выражение: (10 - 5) * (20 / 5).
Написать тесты для данного кода.
 */

class MAthOperationDemo {

	public static void main(String[] args) {
		// build and calculate: 10 + 20
		Argument arg1 = new Argument(10);
		Argument arg2 = new Argument(20);
		MathOperation addition = new Addition(arg1, arg2);
		System.out.println("Left side Addition result = " + addition.calculate());

		// build and calculate: 50 - 20
		Argument arg3 = new Argument(50);
		Argument arg4 = new Argument(20);
		MathOperation subtraction = new Subtraction(arg3, arg4);
		System.out.println("Right side Subtraction result = " + addition.calculate());

		// build and calculate: (10 + 20) + (50 - 20)
		MathOperation addition1 = new Addition(addition, subtraction);
		System.out.println("Final Addition result = " + addition1.calculate());

		// Solution: build and calculate: (10 - 5) * (20 / 5)
		Argument arg5 = new Argument(10);
		Argument arg6 = new Argument(5);
		MathOperation resultSubtraction = new Subtraction(arg5, arg6);
		System.out.println("Left side Subtraction result = " + resultSubtraction.calculate());

		Argument arg7 = new Argument(20);
		Argument arg8 = new Argument(5);
		MathOperation resultDivision = new Division(arg7, arg8);
		System.out.println("Right side Division result = " + resultDivision.calculate());

		MathOperation multiply = new Multiply(resultSubtraction, resultDivision);
		System.out.println("Final Multiply result = " + multiply.calculate());

	}

}
