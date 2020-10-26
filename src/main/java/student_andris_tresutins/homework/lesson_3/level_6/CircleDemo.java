package student_andris_tresutins.homework.lesson_3.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
 class CircleDemo {
    public static void main(String[] args) {

        Circle victim = new Circle(4.2);
        double result = victim.calculateArea();

        System.out.println(result);
    }


}
