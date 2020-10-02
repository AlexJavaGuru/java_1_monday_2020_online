package student_andris_tresutins.homework.lesson_8.level_4;

public class Triangle_T19 extends Shape_T15 {
    private double side;


    public Triangle_T19(String title, double side) {
        super(title);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3)/4) * (side * side);
    }

    @Override
    public double calculatePerimeter() {
        return side + side + side;
    }
}
