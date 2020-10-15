package student_alexander_shl.homework.lesson_3.level_6.task_24;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Я чуть-чуть не понял вашу задумка с методом state. Что такое type? и title?")
class Cat {

    public String catName;
    public int catAge;
    public String catColor;

    public Cat(String catName, int catAge, String catColor) {
        this.catName = catName;
        this.catAge = catAge;
        this.catColor = catColor;
    }

    void state(boolean type,String title) {
        if (type) {
            System.out.println("Cat is " + title);
        } else {
            System.out.println("Cat not " + title);
        }
    }

    void voice() {
        System.out.println("Cat name is: " + catName + ", Age is: " + catAge + ", Color is: " + catColor);
    }

}
