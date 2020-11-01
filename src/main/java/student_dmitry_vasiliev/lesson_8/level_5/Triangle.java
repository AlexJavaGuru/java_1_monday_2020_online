package student_dmitry_vasiliev.lesson_8.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Triangle extends Shape {

    private double side;
    private String title = "Triangle";

    Triangle(double side) {
        this.side = side;
    }

    @Override
    String name() {
        String name = title;
        return name;
    }

    @Override
    double calculateArea() {
        double area = ((side * side) * Math.sqrt(3)) / 4;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimetr = 3 * side;
        return perimetr;
    }
}
