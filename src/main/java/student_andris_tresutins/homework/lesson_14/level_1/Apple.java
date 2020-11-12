package student_andris_tresutins.homework.lesson_14.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Apple {

    private String color;
    private int weight;

    public Apple (String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

}
