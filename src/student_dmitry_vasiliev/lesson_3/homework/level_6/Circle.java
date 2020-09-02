package student_dmitry_vasiliev.lesson_3.homework.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Класс сделали. Почему он не умеет делать то, что задано в задании? Сказано, что класс должен уметь ситать площадь. " +
        "А значит, иметь метод, который считает площадь. Надо переделать")
class Circle {

    private double radius;
    private double calculateArea;

    public Circle(double radius)  {
        this.radius = radius;
    }


}
