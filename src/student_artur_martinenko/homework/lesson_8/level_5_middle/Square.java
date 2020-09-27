package student_artur_martinenko.homework.lesson_8.level_5_middle;

class Square extends Shape {
    private double side;

    public Square(String title, double side) {
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
