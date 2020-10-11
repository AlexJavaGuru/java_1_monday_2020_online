package student_dmitry_vasiliev.lesson_8.level_4;

class Rectangle extends Shape {

    private double width;
    private double length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double calculateArea() {
        double area = width * length;
        return area;
    }

    @Override
    double calculatePerimeter() {
        double perimetr = (width * 2) + (length * 2);
        return perimetr;
    }
}
