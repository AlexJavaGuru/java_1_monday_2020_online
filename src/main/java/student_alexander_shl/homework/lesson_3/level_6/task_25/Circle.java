package student_alexander_shl.homework.lesson_3.level_6.task_25;

import teacher.annotations.CodeReview;

/*
Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).

Класс с объявлением фигуры круг должен называться "Circle".
Класс с демонстрацией работы должен называться "CircleDemo".
 */
@CodeReview(approved = true)
class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea(double radius) {
        return (Math.PI * radius * radius);
    }

}
