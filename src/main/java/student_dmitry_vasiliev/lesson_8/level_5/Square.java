package student_dmitry_vasiliev.lesson_8.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Square extends Shape {

    private double side;
    private String title = "Square";

    Square(double side) {
        this.side = side;
    }

    @Override
    String name() {
        String name = title;
        return name;
    }

    @Override
    double calculateArea() {
        double area = side * side;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimetr = 4 * side;
        return perimetr;
    }
}
