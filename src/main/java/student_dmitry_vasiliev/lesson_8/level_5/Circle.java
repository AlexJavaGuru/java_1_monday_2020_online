package student_dmitry_vasiliev.lesson_8.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Circle extends Shape {

    private String title = "Circle";
    private double radius;

    Circle(double radius) {
        this.radius = radius;
        //this.title = title;
    }

    @Override
    String name() {
        String name = title;
        return name;
    }

    @Override
    double calculateArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimetr = 2 * Math.PI * radius;
        return perimetr;
    }
}
