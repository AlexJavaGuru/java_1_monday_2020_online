package student_lilija_g.homework.lesson_3.level_6.task_24;

class CircleDemo {
    public static void main(String[] args)
    {
        int result_x, result_y, resultRadius;
        double resultArea;

        Circle circleDemo = new Circle();
        circleDemo.setCircle(10, 5, 3);

        result_x = circleDemo.getCoordinate_x();
        result_y = circleDemo.getCoordinate_y();
        resultRadius = circleDemo.getRadius();

        resultArea = circleDemo.area(resultRadius);

        System.out.println("Circle coordinate X: "+result_x);
        System.out.println("Circle coordinate Y: "+result_y);
        System.out.println("Circle radius: "+resultRadius);
        System.out.println("Area of a circle is: "+resultArea);

    }
}
