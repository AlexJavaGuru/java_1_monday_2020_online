package student_andris_tresutins.homework.lesson_8.level_4;

public class Rectangle_T18 extends Shape_T15 {

    private double width;
    private double length;

    public Rectangle_T18(String title, double width, double length) {
        super(title);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + length);
    }
}
