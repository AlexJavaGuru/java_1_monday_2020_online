package student_elizabete_ket.homework.lesson_4.level_4;

class Calculator {

    public int sumNumbers (int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }

    public int subtractionNumbers (int firstNumber, int secondNumber) {
        return (firstNumber - secondNumber);
    }

    public int multiplicationNumbers (int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber);
    }

    public int dividingNumbers (int firstNumber, int secondNumber) {
        return (firstNumber / secondNumber);
    }

    public boolean isEven (int number) {
       boolean isTrue = true;
       boolean isFalse = false;
       if ((number % 2) == 0) {
           return isTrue;
       } else {
           return isFalse;
       }
    }

    public int maxOfTwoNumbers (int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxOfThreeNumbers (int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            return firstNumber;
        } else if ((firstNumber < secondNumber) && (secondNumber > thirdNumber)) {
            return secondNumber;
        } else if ((firstNumber < thirdNumber) && (secondNumber < thirdNumber)) {
            return thirdNumber;
        } else if ((firstNumber == secondNumber) && (firstNumber > thirdNumber)) {
            return firstNumber;
        } else if ((secondNumber == thirdNumber) && (firstNumber < secondNumber)) {
            return secondNumber;
        } else if ((firstNumber == secondNumber) && (secondNumber == thirdNumber)) {
            return firstNumber;
        } else {
            return firstNumber;
        }
    }

}
