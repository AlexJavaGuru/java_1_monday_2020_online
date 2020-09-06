package student_artur_martinenko.homework.lesson_6.level_1;

class FizzBuzz {

    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        }
        return (number % 5 == 0) ? "Buzz" : Integer.toString(number);
    }

}
