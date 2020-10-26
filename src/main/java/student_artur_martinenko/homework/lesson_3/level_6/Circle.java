package student_artur_martinenko.homework.lesson_3.level_6;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return Math.PI*Math.pow(radius, 2);

    }

}
