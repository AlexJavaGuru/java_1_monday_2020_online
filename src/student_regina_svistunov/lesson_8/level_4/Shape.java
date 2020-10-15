package student_regina_svistunov.lesson_8.level_4;

//Создание иерархии класса Shape (геометрическая фигура).
//
//        Дан класс Shape:
//
//abstract class Shape {
//
//    private String title;
//
//    Shape(String title) {
//        this.title = title;
//    }
//    abstract double calculateArea();
//}
//
//    Объявите в классе Shape абстрактный метод
//    для подсчёта периметра.

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }


    abstract double calculateArea();

    abstract double calculatePerimeter();

}
