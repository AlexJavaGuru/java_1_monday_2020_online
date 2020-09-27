package student_artur_martinenko.homework.lesson_8.level_5_middle;

class ShapeUtilDemo {

    public void check(Shape shape) {
        ShapeUtil shapeUtil = new ShapeUtil();
        double area = shapeUtil.calculateArea(shape);
        double perimeter = shapeUtil.calculatePerimeter(shape);
        System.out.println(shape.toString() + "Area = " + area);
        System.out.println(shape.toString() + "Perimeter = " + perimeter);
    }


    public static void main(String[] args) {
        ShapeUtilDemo shapeUtilDemo = new ShapeUtilDemo();
        ShapeUtil shapeUtil = new ShapeUtil();

        Shape circle = shapeUtil.createRandomCircle();
        shapeUtilDemo.check(circle);

        Shape rectangle = shapeUtil.createRandomRectangle();
        shapeUtilDemo.check(rectangle);

        Shape square = shapeUtil.createRandomSquare();
        shapeUtilDemo.check(square);

        Shape triangle = shapeUtil.createRandomTriangle();
        shapeUtilDemo.check(triangle);

    }
}
