package student_lilija_g.homework.lesson_8.level_5_middle.task_22;

/*
В класе ShapeUtil реализуйте метод:

    Rectangle createRandomRectangle();

Этот метод создаёт прямоугольник со случайно выбранными сторонами.
 */

import java.util.Random;

class ShapeUtil {

    Rectangle createRandomRectangle() {
        Random myRandom = new Random();
        return new Rectangle("Random Rectangle", myRandom.nextInt(10), myRandom.nextInt(10));
    }
}
