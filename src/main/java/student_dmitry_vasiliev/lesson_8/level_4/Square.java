package student_dmitry_vasiliev.lesson_8.level_4;

class Square extends Shape {

    private double side;

    Square(double side) {
        this.side = side;
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
