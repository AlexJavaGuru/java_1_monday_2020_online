package student_regina_svistunov.lesson_3.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Circle {
    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return (Math.PI * (radius * radius));
    }
}
