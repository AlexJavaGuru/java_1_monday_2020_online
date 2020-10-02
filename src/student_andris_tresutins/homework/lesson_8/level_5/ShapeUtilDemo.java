package student_andris_tresutins.homework.lesson_8.level_5;

import student_andris_tresutins.homework.lesson_8.level_4.Shape_T15;

public class ShapeUtilDemo {
    public static void main(String[] args) {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape_T15 circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);

        System.out.println("Area: " + circleArea + " Perimeter: " + circlePerimeter);
    }


}
