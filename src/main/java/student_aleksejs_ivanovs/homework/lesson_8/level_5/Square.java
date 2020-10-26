package student_aleksejs_ivanovs.homework.lesson_8.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Square extends Shape{

    private double side;

    Square(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }

    @Override
    double calculatePerimeter() {
        return side * 4;
    }

}
