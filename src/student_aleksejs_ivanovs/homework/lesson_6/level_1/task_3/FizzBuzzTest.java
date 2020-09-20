package student_aleksejs_ivanovs.homework.lesson_6.level_1.task_3;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzBuzz();
        test.fizz();
        test.buzz();
        test.number();
    }

    public void fizzBuzz() {
        FizzBuzz fz = new FizzBuzz();
        String fiBu = fz.detect(3);

        if (fiBu == "Fizz") {
            System.out.println("Ok FizzBuzz");
        } else {
            System.out.println("Bad FizzBuzz");
        }
    }

    public void fizz() {
        FizzBuzz fz = new FizzBuzz();
        String fiBu = fz.detect(6);

        if (fiBu == "Fizz") {
            System.out.println("Ok Fizz");
        } else {
            System.out.println("Bad Fizz");
        }
    }

    public void buzz() {
        FizzBuzz fz = new FizzBuzz();
        String fiBu = fz.detect(9);

        if (fiBu == "Fizz") {
            System.out.println("Ok Buzz");
        } else {
            System.out.println("Bad Buzz");
        }
    }

    public void number() {
        FizzBuzz fz = new FizzBuzz();
        String fiBu = fz.detect(5);

        if (fiBu == fz.detect(5)) {
            System.out.println("Ok Number");
        } else {
            System.out.println("Bad Number");
        }
    }

}
