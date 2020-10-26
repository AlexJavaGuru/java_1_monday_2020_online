package student_aleksejs_ivanovs.homework.lesson_6.level_1.task_3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class FizzBuzz {

    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        }
        return (number % 5 == 0) ? "Buzz" : Integer.toString(number);
    }

}
