package student_lilija_g.homework.lesson_3.level_6.task_24;

class Box {
    int boxWidth;     // ширина коробки
    int boxHeight;    // высота коробки
    int boxDepth;     // глубина коробки
    String boxColour; // цвет коробки

    //Вы не используете эту переменныю. Для чего она?
    public enum boxColour {Red, Black, White, Yellow}

    double boxVolume(int boxWidth, int boxHeight, int boxDepth) { // объем коробки
        return (double) boxWidth * boxHeight * boxDepth;
    }

    void boxParameters(String boxColour, int boxWidth, int boxHeight, int boxDepth) {
        System.out.println(boxColour+" box's parameters is: ");
        System.out.println("Width: " + boxWidth);
        System.out.println("Height: " + boxHeight);
        System.out.println("Depth: " + boxDepth+'\n');


    }

    void setBoxWidth(int newWidth) {
        boxWidth = newWidth;
    }

    void setBoxHeight(int newHeight) {
        boxHeight = newHeight;
    }

    void setBoxDepth(int newDepth) {
        boxDepth = newDepth;
    }

    void setBoxColour(String newColour) {
        boxColour = newColour;
    }

    int getBoxWidth() {
        return boxWidth;
    }

    int getBoxHeight() {
        return boxHeight;
    }

    int getBoxDepth() {
        return boxDepth;
    }

    String getBoxColour() {
        return boxColour;
    }
}


