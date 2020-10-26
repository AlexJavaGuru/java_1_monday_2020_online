package student_aleksejs_ivanovs.homework.lesson_8.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Triangle extends Shape{

    private double side;
    private double height;

    Triangle(String title, double side, double height) {
        super(title);
        this.side = side;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return (side / 2) * height;
    }

    @Override
    double calculatePerimeter() {
        return side * 3;
    }

}
