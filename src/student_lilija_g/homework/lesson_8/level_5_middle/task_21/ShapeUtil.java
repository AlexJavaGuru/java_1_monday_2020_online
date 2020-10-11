package student_lilija_g.homework.lesson_8.level_5_middle.task_21;

/*
В класе ShapeUtil реализуйте метод:

    Square createRandomSquare();

Этот метод создаёт квадрат со случайно выбранной длиной стороны.
 */

import java.util.Random;

class ShapeUtil {

    Square createRandomSquare() {
        Random myRandom = new Random();
        return new Square("Random Square", myRandom.nextInt(10));
    }
}
