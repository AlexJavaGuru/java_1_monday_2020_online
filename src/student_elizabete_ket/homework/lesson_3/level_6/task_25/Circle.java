package student_elizabete_ket.homework.lesson_3.level_6.task_25;

import static java.lang.Math.PI;

class Circle {

    private double radius;

    public double getRadius () {
        return radius;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public double calculateAres() {
        double calculateAres = PI * radius * radius;
        return calculateAres;
    }




}
