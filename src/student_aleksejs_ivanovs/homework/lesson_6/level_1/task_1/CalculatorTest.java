package student_aleksejs_ivanovs.homework.lesson_6.level_1.task_1;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest test = new CalculatorTest();
        test.isEvenNumber();
        test.isOddNumber();
    }

    public void isEvenNumber() {
        Calculator even = new Calculator();
        boolean actualResult = even.isEven(6);

        if (actualResult) {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }

    public void isOddNumber() {
        Calculator odd = new Calculator();
        boolean actualResult = odd.isEven(9);

        if (!actualResult) {
            System.out.println("Ok");
        } else {
            System.out.println("Bad");
        }
    }

}
