package student_lilija_g.homework.lesson_8.level_5_middle.task_20;

import java.util.Random;

/*
Создайте класс ShapeUtil.
В класе ShapeUtil реализуйте метод:

    Circle createRandomCircle();

Этот метод создаёт круг со случайным радиусом.
 */

class ShapeUtil {

    Circle createRandomCircle() {
        Random myRandom = new Random();
        return new Circle("Random Circle", myRandom.nextInt(10));
    }
}
