package student_alexander_shl.homework.lesson_8.level_4_junior_level_5_middle;
/*
Task_15:

Создание иерархии класса Shape (геометрическая фигура).

Дан класс Shape:

abstract class Shape {

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();

}

Объявите в классе Shape абстрактный метод
для подсчёта периметра.
 */
abstract class Shape {  // Task_15

    private String title;

    Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    public String printTitle() {
        return "Shape " + title + " ";
    }
}
