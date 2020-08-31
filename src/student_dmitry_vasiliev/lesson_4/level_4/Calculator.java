package student_dmitry_vasiliev.lesson_4.level_4;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Не хватает пропусков между методами. Формат поехал...")
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
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else
            return secondNumber;
    }

    public int maxOfThreeNumbers (int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            return firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            return secondNumber;
        } else
            return (thirdNumber);
    }
}





