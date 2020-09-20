package student_regina_svistunov.lesson_6.level_1;

public class FizzBuzz {

    public String detect(int number) {

        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        }
        else if (number % 3 == 0) {
            return "Fizz";
        }
        else if (number % 5 == 0) {
            return "Buzz";
        }
        else return "" + number;
    }
}
