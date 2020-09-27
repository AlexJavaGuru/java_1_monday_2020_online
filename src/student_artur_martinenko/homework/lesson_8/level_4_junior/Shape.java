package student_artur_martinenko.homework.lesson_8.level_4_junior;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();

}
