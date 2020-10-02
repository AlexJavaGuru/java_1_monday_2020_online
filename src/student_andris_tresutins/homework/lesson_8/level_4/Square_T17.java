package student_andris_tresutins.homework.lesson_8.level_4;

public class Square_T17 extends Shape_T15 {

    private double side;

    public Square_T17(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
