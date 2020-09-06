package student_lilija_g.homework.lesson_3.level_6.task_25;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Сам починил вам форматирование")
class CircleDemo {

    public static void main(String[] args) {

        double myRadius = 5.256978;
        double resultArea;

        Circle myCircle = new Circle(myRadius);
        resultArea = myCircle.calculateArea(myRadius);
        System.out.println("If Radius of circle is " + myRadius + ", then Area is " + resultArea);
    }

}
