package student_pjotrs_grezmanis.lesson_3.level_6;

 class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = radius *  radius *  Math.PI;
        System.out.println("The area of the circle[radius = " + radius + "]: " + area);

    }
}



