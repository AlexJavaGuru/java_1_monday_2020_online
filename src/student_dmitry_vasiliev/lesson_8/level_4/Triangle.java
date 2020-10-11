package student_dmitry_vasiliev.lesson_8.level_4;

class Triangle extends Shape {

    private double side;

    Triangle(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        double area = ((side * side) * Math.sqrt(3)) / 4;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimetr = 3 * side;
        return perimetr;
    }
}
