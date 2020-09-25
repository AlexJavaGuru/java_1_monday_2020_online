package student_alexander_shl.homework.lesson_2.level_x.super_task_2;
/* Исправьте ошибки компиляции в данной программе.

public class SumTwoNumbers {

	public static void main(String[] args) {

		int numberOne;
		int numberTwo;

		System.out.println("Number 1 = " + numberOne);
		System.out.println("Number 2 = " + numberTwo);

		int numberOne = 10;
		int numberTwo = 20;

		int sum = numberOne + numberTwo;

		System.out.println("Sum = " + sum);
	}

}
 */

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class SumTwoNumbers {
    public static void main(String[] args) {

        int numberOne = 10;
        int numberTwo = 20;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);

        int sum = numberOne + numberTwo;

        System.out.println("Sum = " + sum);
    }

}

