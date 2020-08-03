package teacher.lesson_2.lessoncode;

public class SumExample {

	public static void main(String[] args) {

		int numberOne;

		int numberTwo = 2;
		int numberThree = 3;
		int numberFour = 4;

		numberOne = 1;

		int sum = numberOne + numberTwo + numberThree + numberFour;

		int result1 = numberOne + numberTwo;
		int result2 = result1 + numberThree;
		int result3 = result2 + numberFour;

		System.out.println(sum);
		System.out.println(result3);
	}

}
