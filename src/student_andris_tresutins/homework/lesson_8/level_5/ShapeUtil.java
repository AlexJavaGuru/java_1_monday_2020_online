package student_andris_tresutins.homework.lesson_8.level_5;

import student_andris_tresutins.homework.lesson_8.level_4.*;

import java.util.Random;

public class ShapeUtil {

    public Circle_T16 createRandomCircle(){
        Random rand = new Random();
       return new Circle_T16("circle",rand.nextInt(100));
    }

    public Square_T17 createRandomSquare(){
        Random rand = new Random();
        return new Square_T17("square",rand.nextInt(100));
    }

    public Rectangle_T18 createRandomRectangle(){
        Random rand = new Random();
        return new Rectangle_T18("rectangle",rand.nextInt(100),rand.nextInt(100));
    }

    public Triangle_T19 createRandomTriangle(){
        Random rand = new Random();
        return new Triangle_T19("triangle",rand.nextInt(100));
    }

    public Shape_T15 createRandomShape() {
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

     double calculateArea(Shape_T15[] shapes){
         double shapesArea = 0;
         for (Shape_T15 shape : shapes) {
             shapesArea += shape.calculateArea();
         }
         return shapesArea;

     }

    double calculatePerimeter(Shape_T15[] shapes){
        double shapesPerimeter = 0;
        for (Shape_T15 shape : shapes) {
            shapesPerimeter += shape.calculatePerimeter();
        }
        return shapesPerimeter;

    }

    double calculateArea(Shape_T15 shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape_T15 shape) {
        return shape.calculatePerimeter();
    }


}
