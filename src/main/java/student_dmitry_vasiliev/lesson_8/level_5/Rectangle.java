package student_dmitry_vasiliev.lesson_8.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Rectangle extends Shape {

    private String title = "Rectangle";
    private double width;
    private double length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    String name() {
        String name = title;
        return name;
    }

    @Override
    double calculateArea() {
        double area = width * length;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimetr = (width * 2) + (length * 2);
        return perimetr;
    }
}
