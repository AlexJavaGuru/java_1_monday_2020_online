package student_renars_ranka.homework.lesson_4.level_4;

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int firstNumber) {
        return firstNumber % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (firstNumber < secondNumber) {
            return secondNumber;
        } else if (firstNumber == secondNumber) {
            return firstNumber;
        } else {
            return 0;
        }
    }
}
