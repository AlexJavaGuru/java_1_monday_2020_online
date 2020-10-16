package student_lilija_g.homework.lesson_8.level_5_middle;

class ShapeUtilDemo {
    public static void main(String[] args) {

        ShapeUtilDemo myShapeUtilDemo = new ShapeUtilDemo();
        ShapeUtil myShapeUtil = new ShapeUtil();

        Shape myCircle = myShapeUtil.createRandomCircle();
        myShapeUtilDemo.resultDemo(myCircle);

        Shape mySquare = myShapeUtil.createRandomSquare();
        myShapeUtilDemo.resultDemo(mySquare);

        Shape myRectangle = myShapeUtil.createRandomRectangle();
        myShapeUtilDemo.resultDemo(myRectangle);

        Shape myTriangle = myShapeUtil.createRandomTriangle();
        myShapeUtilDemo.resultDemo(myTriangle);
    }

    void resultDemo(Shape shape) {

        ShapeUtil myShapeUtil = new ShapeUtil();

        double resultArea = myShapeUtil.calculateArea(shape);
        double resultPerimeter = myShapeUtil.calculatePerimeter(shape);

        System.out.println(shape.toString()+"area is " + resultArea);
        System.out.println(shape.toString()+"perimeter is " + resultPerimeter);
        System.out.println("=========================================");
    }

}
