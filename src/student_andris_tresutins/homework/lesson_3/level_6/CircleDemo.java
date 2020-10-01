package student_andris_tresutins.homework.lesson_3.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Не соответствует заданию. У вас в сказаднии сказано, что должно быть свойство объекта. Это Радиус, с которым вы и должны создавать объект. А метод calculateArea" +
        "не должен принимать никаких аргументов. Смотрите задание внимательнее")
 class CircleDemo {
    public static void main(String[] args) {

        Circle victim = new Circle(4.2);
        double result = victim.calculateArea();

        System.out.println(result);
    }


}
