package student_pjotrs_grezmanis.lesson_6.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Move {
    private int x;
    private int y;

    public Move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }
}
