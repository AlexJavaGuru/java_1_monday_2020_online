package student_regina_svistunov.lesson_8.level_5;

abstract class Shape {

    private String title;

    public Shape(String title) {
        this.title = title;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

}

