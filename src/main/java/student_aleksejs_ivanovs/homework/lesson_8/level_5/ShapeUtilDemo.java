package student_aleksejs_ivanovs.homework.lesson_8.level_5;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class ShapeUtilDemo {

    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);

        Shape square = shapeUtil.createRandomSquare();
        double squareArea = shapeUtil.calculateArea(square);
        double squarePerimeter = shapeUtil.calculatePerimeter(square);

        System.out.println("Circle area : " + circleArea + "\n" + "Circle perimeter : " + circlePerimeter);
        System.out.println("Square area : " + squareArea + "\n" + "Square perimeter : " + squarePerimeter);
    }

}
