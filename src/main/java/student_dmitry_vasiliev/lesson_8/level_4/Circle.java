package student_dmitry_vasiliev.lesson_8.level_4;

class Circle extends Shape {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
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
