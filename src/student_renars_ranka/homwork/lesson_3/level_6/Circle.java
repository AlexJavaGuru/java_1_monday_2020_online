package student_renars_ranka.homwork.lesson_3.level_6;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI*Math.pow(radius, 2);

    }
}
