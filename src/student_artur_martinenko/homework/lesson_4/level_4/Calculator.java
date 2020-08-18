package student_artur_martinenko.homework.lesson_4.level_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public int subtraction(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public int division(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber){
        if(firstNumber > secondNumber){
            return firstNumber;
        }else if (firstNumber == secondNumber){
            return 0;
        }
        return secondNumber;
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        boolean oneIsBiggerTwo = firstNumber > secondNumber;
        boolean oneIsBiggerThree = firstNumber > thirdNumber;
        boolean twoISBiggerThree = secondNumber > thirdNumber;

        if(firstNumber == secondNumber && firstNumber == thirdNumber){
            return 0;
        }else if(!oneIsBiggerTwo && !oneIsBiggerThree && !twoISBiggerThree){
            return thirdNumber;
        }else if (!oneIsBiggerTwo && !oneIsBiggerThree) {
            return secondNumber;
        } else if (!oneIsBiggerTwo) {
            return secondNumber;
        }else {
            return firstNumber;
        }

    }





}
