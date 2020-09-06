package student_dmitry_vasiliev.lesson_3.homework.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;
        //Разработать класс - круг, у которого должны быть следующие характеристики:
        //Свойства: радиус (double radius),
        //Методы: расчет площади (double calculateArea()).

        //Класс с объявлением фигуры круг должен называться "Circle".
        //Класс с демонстрацией работы должен называться "CircleDemo".
@CodeReview(approved = false)
@CodeReviewComment(comment = "Класс сделали. Почему он не умеет делать то, что задано в задании? Сказано, " +
        "что класс должен уметь ситать площадь. " +
        "А значит, иметь метод, который считает площадь. Надо переделать")
class Circle {

    public double circle(double radius)  {
    return (Math.PI * (radius*radius));
    }
}
