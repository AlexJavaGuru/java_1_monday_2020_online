package student_renars_ranka.homework.lesson_6.level_1;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Данному классу совершенно не нужна переменная initialNumber. Задание как бы намекает на это. Этот метод можно реализовать без этого состояния")
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

