package student_artur_martinenko.homework.lesson_8.level_5_middle;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Triangle extends Shape {
    private double side;
    private double height;

    public Triangle(String title, double side) {
        super(title);
        this.side = side;
        this.height = calculateTriangleHeight();
    }

    @Override
    double calculateArea() {
        return (height * side) / 2;
    }

    @Override
    double calculatePerimeter() {
        return side * 3;
    }

    private double calculateTriangleHeight() {
        double sideA = side / 2;
        double sideC = side;
        double sideBSquare = Math.pow(sideC, 2) - Math.pow(sideA, 2);
        return Math.sqrt(sideBSquare);
    }
}
