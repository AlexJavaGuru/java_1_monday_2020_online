package student_renars_ranka.homework.lesson_6.level_1;

class FizzBuzz {

    private int initialNumber;

    public String detect(int number) {
        this.initialNumber = number;

        if ((initialNumber % 3 == 0) && (initialNumber % 5 == 0))
            return "FizzBuzz";
        else if (initialNumber % 3 == 0)
            return "Fizz";
        else if (initialNumber % 5 == 0)
            return "Buzz";
        else return "UnrecognizedNumber" + initialNumber; // Integer.toString(initialNumber);
    }

}

