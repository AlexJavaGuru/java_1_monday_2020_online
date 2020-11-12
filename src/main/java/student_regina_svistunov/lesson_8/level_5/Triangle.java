package student_regina_svistunov.lesson_8.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Triangle extends Shape{

    private double side;
    private double base;
    private double height;

    Triangle(String title, double side, double base, double height) {
        super(title);
        this.side = side;
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    double calculatePerimeter() {
        return 3 * side;
    }
}
