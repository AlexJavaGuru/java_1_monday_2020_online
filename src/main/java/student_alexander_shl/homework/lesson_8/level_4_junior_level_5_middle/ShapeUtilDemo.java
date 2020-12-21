package student_alexander_shl.homework.lesson_8.level_4_junior_level_5_middle;

class ShapeUtilDemo { // Task_27

    public static void main(String[] args) {

        ShapeUtilDemo shapeUtilDemo = new ShapeUtilDemo();
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape circle = shapeUtil.createRandomCircle();
        /* произведена замена:
        double circleArea = shapeUtil.calculateArea(circle);
        double circlePerimeter = shapeUtil.calculatePerimeter(circle);
        на метод printResult:
        */
        shapeUtilDemo.printResult(circle);

        Shape square = shapeUtil.createRandomSquare();
        shapeUtilDemo.printResult(square);

        Shape rectangle = shapeUtil.createRandomRectangle();
        shapeUtilDemo.printResult(rectangle);

        Shape triangle = shapeUtil.createRandomTriangle();
        shapeUtilDemo.printResult(triangle);

        Shape randomShapeOne = shapeUtil.createRandomShape();
        shapeUtilDemo.printResult(randomShapeOne);
        Shape randomShapeTwo = shapeUtil.createRandomShape();
        shapeUtilDemo.printResult(randomShapeTwo);

    }

    void printResult(Shape shape) {

        ShapeUtil shapeUtil = new ShapeUtil();
        double shapeArea = shapeUtil.calculateArea(shape);
        double shapePerimeter = shapeUtil.calculatePerimeter(shape);
        System.out.println(shape.printTitle() + "area is " + shapeArea);
        System.out.println(shape.printTitle() + "perimeter is " + shapePerimeter);

    }
}
