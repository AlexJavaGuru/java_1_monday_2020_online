package student_dmitry_vasiliev.lesson_8.level_5;

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

        Shape rectangle = shapeUtil.createRandomRectangle();
        double rectangleArea = shapeUtil.calculateArea(rectangle);
        double rectanglePerimeter = shapeUtil.calculatePerimeter(rectangle);

        Shape triangle = shapeUtil.createRandomTriangle();
        double triangleArea = shapeUtil.calculateArea(triangle);
        double trianglePerimeter = shapeUtil.calculatePerimeter(triangle);

        Shape[] shapes = new Shape[4];
        shapes[0] = shapeUtil.createRandomCircle();
        shapes[1] = shapeUtil.createRandomSquare();
        shapes[2] = shapeUtil.createRandomRectangle();
        shapes[3] = shapeUtil.createRandomTriangle();
        double calculateTotalArea = shapeUtil.calculateTotalArea(shapes);
        double calculateTotalPerimeter = shapeUtil.calculateTotalPerimeter(shapes);

        Shape randomShape = shapeUtil.createRandomShape();
        double randomShapeArea = shapeUtil.calculateArea(randomShape);
        double randomShapePerimeter = shapeUtil.calculatePerimeter(randomShape);
        String shapeName = shapeUtil.name(randomShape);

/*        System.out.println("Total area is: " + calculateTotalArea);
        System.out.println("Total perimeter is: " + calculateTotalPerimeter);
        System.out.println("Circle area is: " + circleArea);
        System.out.println("Square area is: " + squareArea);
        System.out.println("Square perimeter is: " + squarePerimeter);
        System.out.println("Rectangle perimeter is: " + rectanglePerimeter);
        System.out.println("Triangle perimeter is: " + trianglePerimeter);*/
        System.out.println("Random shape is " + shapeName + " and area / perimeter is: " + randomShapeArea + " / " + randomShapePerimeter);
    }
}
