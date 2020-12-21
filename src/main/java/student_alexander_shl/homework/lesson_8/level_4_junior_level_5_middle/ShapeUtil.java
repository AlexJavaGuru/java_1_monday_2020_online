package student_alexander_shl.homework.lesson_8.level_4_junior_level_5_middle;

import java.util.Random;

/*
Task_20: Создайте класс ShapeUtil.

В класе ShapeUtil реализуйте методы:

Task_20:  Circle createRandomCircle();
- Этот метод создаёт круг со случайным радиусом.

Task_21:  Square createRandomSquare();
- Этот метод создаёт квадрат со случайно выбранной длиной стороны.

Task_22:  Rectangle createRandomRectangle();
- Этот метод создаёт прямоугольник со случайно выбранными сторонами.

Task_23:  Triangle createRandomTriangle();
- Этот метод создаёт равносторонний треугольник со случайно выбранной длиной стороны.

Task_24:  Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }
- Этот метод создаёт случайную геометрическую фигуру.

Task_25:   double calculateArea(Shape[] shapes);
- Этот метод расчитывает общую площадь геометрических фигур из массива.

Task_26:  double calculatePerimeter(Shape[] shapes);
- Этот метод расчитывает общий периметр геометрических фигур из массива.

Task_27:  В классе ShapeUtil создайте методы:

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

Создайте ShapeUtilDemo класс и продемонстрируйте
расчёт площади и переиметра
любой геометрической фигуры.

Пример для круга:

ShapeUtil shapeUtil = new ShapeUtil();
Shape circle = shapeUtil.createRandomCircle();
double circleArea = shapeUtil.calculateArea(circle);
double circlePerimeter = shapeUtil.calculatePerimeter(circle);

Task_28:Создайте класс ShapeUtilTest и напишите тесты для методов:

    double calculateArea(Shape[] shapes);
    double calculatePerimeter(Shape[] shapes);

PS: пример создания и заполнения массива
геометрических фигур:

ShapeUtil shapeUtil = new ShapeUtil();
Shape[] shapes = new Shape[4];
shape[0] = shapeUtil.createRandomCircle();
shape[1] = shapeUtil.createRandomSquare();
shape[2] = shapeUtil.createRandomRectangle();
shape[3] = shapeUtil.createRandomTriangle();

*/

class ShapeUtil {

    Circle createRandomCircle() {                // Task_20
        Random random = new Random();
        double radius = random.nextInt(10) + 10;
        return new Circle("Random Circle", radius);
    }

    Square createRandomSquare() {                // Task_21
        Random random = new Random();
        return new Square("Random Square", random.nextInt(10) + 10);
    }

    Rectangle createRandomRectangle() {         // Task_22
        Random random = new Random();
        return new Rectangle("Random Rectangle", random.nextInt(10) + 10, random.nextInt(10) + 10);
    }

    Triangle createRandomTriangle() {            // Task_23
        Random random = new Random();
        return new Triangle("Random Triangle", random.nextInt(10) + 10);
    }

    Shape createRandomShape() {                  // Task_24
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }

    double calculateArea(Shape[] shapes) {      // Task_25
        double resultSumArea = 0;
        for (Shape shape : shapes) {
            resultSumArea += shape.calculateArea();
        }
        return resultSumArea;
    }

    double calculatePerimeter(Shape[] shapes) { // Task_26
        double resultSumPerimeter = 0;
        for (Shape shape : shapes) {
            resultSumPerimeter += shape.calculatePerimeter();
        }
        return resultSumPerimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }                                           // Task_27

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }                                           // Task_27

}
