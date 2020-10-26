package student_lilija_g.homework.lesson_3.level_6.task_24;

class Circle {

    private int coordinate_x, coordinate_y; // координаты центра окружности
    private int radius; // радиус окружности

    double area(int radius) {  // площадь круга
        return (3.1415926536 * radius * radius);
    }

    // метод класса, который устанавливает новые значения координат x,y и радиус
    void setCircle(int newCoordinate_x, int newCoordinate_y, int newRadius) {
        coordinate_x = newCoordinate_x;
        coordinate_y = newCoordinate_y;
        radius = newRadius;
    }

    // методы класса, которые возвращают значение
    int getCoordinate_x() {
        return coordinate_x;
    }

    int getCoordinate_y() {
        return coordinate_y;
    }

    int getRadius() {
        return radius;
    }

}
