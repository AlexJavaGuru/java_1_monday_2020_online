package teacher.lesson_3.lessoncode;

public class MathDemo {

    public static void main(String[] args) {
        MathDemo mathDemo = new MathDemo();

        int sumResult = mathDemo.sum(5, 10);

        System.out.println("Sum is: " + sumResult );

    }

    public int sum(int numberOne, int numberTwo) {
        System.out.println("Number One = " + numberOne + " Number Two = " + numberTwo);
        int result = numberOne + numberTwo;
        return result;
    }
}
