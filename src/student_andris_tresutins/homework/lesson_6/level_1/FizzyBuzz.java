package student_andris_tresutins.homework.lesson_6.level_1;

public class FizzyBuzz {

    private int initialNumber;

    public String detect(int number) {
        this.initialNumber = number;
        if ((initialNumber % 3 == 0) && (initialNumber % 5 == 0)) return "FizzBuzz";
        else if (initialNumber % 3 == 0) return "Fizz";
        else if (initialNumber % 5 == 0) return "Buzz";
        else return "The result is " + initialNumber; // Integer.toString(initialNumber);
    }


}
