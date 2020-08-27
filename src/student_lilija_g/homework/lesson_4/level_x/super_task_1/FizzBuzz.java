package student_lilija_g.homework.lesson_4.level_x.super_task_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class FizzBuzz {

    String detect(int number) {
        if (number % 3 == 0 && number % 5 != 0) {
            return "Fizz";
        } else {
            if (number % 5 == 0 && number % 3 != 0) {
                return "Buzz";
            } else {
                if (number % 3 != 0 && number % 5 != 0) {
                    return "" + number;
                } else {
                    return "FizzBuzz";
                }
            }
        }

    }
}
