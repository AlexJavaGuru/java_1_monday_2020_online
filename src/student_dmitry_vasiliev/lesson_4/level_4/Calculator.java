package student_dmitry_vasiliev.lesson_4.level_4;

public class Calculator {

    public int sum (int firstNumber, int secondNumber) {
            return firstNumber + secondNumber;
        }
    public int sub (int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public int dev (int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
    public int mul (int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public boolean isEven (int number) {
        return  (number % 2) == 0;
        }
    public int maxOfTwoNumbers (int firstNumber, int secondNumber) {
        if ((firstNumber - secondNumber) > 0)
            return firstNumber ;
        else  return secondNumber ;
    }
    public int maxOfThreeNumbersFirst (int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber - secondNumber) > 0 && firstNumber - thirdNumber >= 0)
            return firstNumber ;
        else  return (firstNumber + 10) ;
    }
    public int maxOfThreeNumbersSecond (int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber - secondNumber) < 0 && secondNumber - thirdNumber > 0)
            return secondNumber ;
        else  return (secondNumber + 10) ;
    }
    public int maxOfThreeNumbersThird (int firstNumber, int secondNumber, int thirdNumber) {
        if ((firstNumber - thirdNumber) < 0 && secondNumber - thirdNumber < 0)
            return thirdNumber ;
        else  return (thirdNumber + 10) ;
    }
    public int firstEquSecondLargerThird (int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber && secondNumber > thirdNumber)
            return 1 ;
        else  return 0 ;
    }
    public int firstEquSecondSmallerThird (int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber == secondNumber && secondNumber < thirdNumber)
            return 1 ;
        else  return 0 ;
    }
    public int thirdEquSecondSmallerFirst (int firstNumber, int secondNumber, int thirdNumber) {
        if (thirdNumber == secondNumber && secondNumber < firstNumber)
            return 1 ;
        else  return 0 ;
    }
    public int thirdEquSecondLargerFirst (int firstNumber, int secondNumber, int thirdNumber) {
        if (thirdNumber == secondNumber && secondNumber > firstNumber)
            return 1 ;
        else  return 0 ;
    }
    public int thirdEquFirstLargerSecond (int firstNumber, int secondNumber, int thirdNumber) {
        if (thirdNumber == firstNumber && secondNumber < firstNumber)
            return 1 ;
        else  return 0 ;
    }
    public int thirdEquFirstSmallerSecond (int firstNumber, int secondNumber, int thirdNumber) {
        if (thirdNumber == firstNumber && secondNumber > firstNumber)
            return 1 ;
        else  return 0 ;
    }
}





