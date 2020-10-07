package student_aleksejs_ivanovs.homework.lesson_8.level_4;

class Circle extends Shape{

    private double radius;

    Circle(String tittle, double radius) {
        super(tittle);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return radius * radius * 3.1415;
    }

    @Override
    double calculatePerimeter() {
        return radius * 2 * 3.1415;
    }
}
