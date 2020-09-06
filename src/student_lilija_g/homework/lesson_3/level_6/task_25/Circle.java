package student_lilija_g.homework.lesson_3.level_6.task_25;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Можно было использовать Math.PI в качестве значения для числа PI")
class Circle {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea(double radius) {
        return (3.1415926536 * radius * radius);

    }

}