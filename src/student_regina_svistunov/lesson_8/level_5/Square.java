package student_regina_svistunov.lesson_8.level_5;

public class Square extends Shape{

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
