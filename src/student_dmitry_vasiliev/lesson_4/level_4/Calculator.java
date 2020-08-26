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
        if ((firstNumber - secondNumber) > 0 && firstNumber - thirdNumber > 0)
            return firstNumber ;
        else  return (firstNumber + 10) ;
    }
}





