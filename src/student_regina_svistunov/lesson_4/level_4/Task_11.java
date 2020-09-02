package student_regina_svistunov.lesson_4.level_4;

class Calculator {

    public int addition (int FirstNumber, int SecondNumber) {
        return FirstNumber + SecondNumber;
    }
    public int subtraction (int FirstNumber, int SecondNumber) {
        return FirstNumber - SecondNumber;
    }
    public int multiply (int FirstNumber, int SecondNumber) {
        return FirstNumber * SecondNumber;
    }
    public int divided (int FirstNumber, int SecondNumber) {
        return FirstNumber / SecondNumber;
    }
    public boolean isEven(int number) {
        return number % 2 == 0;
}

public int maxOfTwoNumbers (int FirstNumber, int SecondNumber) {
        if (FirstNumber > SecondNumber ) {
            return FirstNumber;
}
        else if (SecondNumber > FirstNumber) {
            return SecondNumber;
        }
        else {
            return (FirstNumber);
    }
}
}






