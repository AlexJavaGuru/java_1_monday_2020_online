package student_artur_martinenko.homework.lesson_8.level_4_junior;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Rectangle extends Shape {
    private double sideA;
    private double sideB;


    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculateArea() {
        return sideA * sideB;
    }

    @Override
    double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }
}
