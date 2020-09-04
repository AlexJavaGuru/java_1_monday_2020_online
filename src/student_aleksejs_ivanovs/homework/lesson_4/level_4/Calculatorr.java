package student_aleksejs_ivanovs.homework.lesson_4.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Calculatorr {

    public int summ(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multiplicati(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxxOfTwoNumbers(int firstNumber, int secondNumber) {
        return Math.max(firstNumber, secondNumber);
    }

    public int maxxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber) {
            return Math.max(firstNumber, thirdNumber);
        } else {
            return Math.max(secondNumber, thirdNumber);
        }
    }
}