package student_andris_tresutins.homework.lesson_3.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
class Circle {

    double radius;

    Circle(double radius){
        this.radius = radius;

    }

    public double calculateArea(){
        return Math.PI * (radius * radius);
    }

}
