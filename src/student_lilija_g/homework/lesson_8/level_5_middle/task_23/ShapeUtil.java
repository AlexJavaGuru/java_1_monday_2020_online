package student_lilija_g.homework.lesson_8.level_5_middle.task_23;

/*
В класе ShapeUtil реализуйте метод:

    Triangle createRandomTriangle();

Этот метод создаёт равносторонний треугольник
со случайно выбранной длиной стороны.
 */

import java.util.Random;

class ShapeUtil {

    Triangle createRandomTriangle() {
        Random myRandom = new Random();
        return new Triangle("Random Triangle", myRandom.nextInt(10));
    }
}
