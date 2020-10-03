package student_aleksejs_ivanovs.homework.lesson_6.level_1.task_3;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Я бы не сказал, что вы сильно упростили код )  Его все еще трудно читать" +
        "" +
        "Читать легче не стало =D Совершенно. Сделайте задание через старые добрые if else только используйте привильный формат!")
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
