package student_lilija_g.homework.lesson_8.level_5_middle.task_21;

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}
