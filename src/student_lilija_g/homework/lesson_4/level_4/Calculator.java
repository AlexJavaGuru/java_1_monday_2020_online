package student_lilija_g.homework.lesson_4.level_4;

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0)
            return true;
        else return false;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) return firstNumber;
        else return secondNumber;
    }


    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int threeNumber) {


        if (firstNumber >= secondNumber && firstNumber > threeNumber)
            return firstNumber;
        else if (secondNumber > firstNumber && secondNumber >= threeNumber)
            return secondNumber;
        else if (threeNumber >= firstNumber && threeNumber > secondNumber)
            return threeNumber;
        else return firstNumber;

    }

}